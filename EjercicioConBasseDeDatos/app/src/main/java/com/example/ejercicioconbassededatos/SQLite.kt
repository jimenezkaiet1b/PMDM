package com.example.ejercicioconbassededatos

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import org.w3c.dom.Text

class SQLite(
    context: Context?,
    name: String?,
    factory: SQLiteDatabase.CursorFactory?,
    version: Int
) : SQLiteOpenHelper(context, name, factory, version) {
    override fun onCreate(db: SQLiteDatabase?) {
        val ordenCreacion = "CREATE TABLE persona (_dni INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT, edad Int, profesion TEXT, Salario Int)"
        db!!.execSQL(ordenCreacion)
    }

    override fun onUpgrade(db: SQLiteDatabase?,
                           oldVersion: Int, newVersion: Int) {
        val ordenBorrado = "DROP TABLE IF EXISTS persona"
        db!!.execSQL(ordenBorrado)
        onCreate(db)
    }

    fun anadirDato(dni : String,nombre: String, edad: Int, profesion:String, salario : Int){
        val datos = ContentValues()
        datos.put("dni",dni)
        datos.put("nombre",nombre)
        datos.put("edad",edad)
        datos.put("profesion",profesion)
        datos.put("salario",salario)

        val db = this.writableDatabase
        db.insert("persona",null, datos)
        db.close()



    }


}


