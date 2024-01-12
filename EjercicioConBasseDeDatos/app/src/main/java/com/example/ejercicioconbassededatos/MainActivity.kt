package com.example.ejercicioconbassededatos

import android.content.ContentValues
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EdgeEffect
import android.widget.EditText
import android.widget.Toast
import androidx.core.text.set

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityM
    lateinit var personaDB : SQLite

    private lateinit var editTextDni : EditText
    private lateinit var editTextNombre:EditText
    private lateinit var editTextEdad:EditText
    private lateinit var  editTextProfesion:EditText
    private lateinit var editTextSalario:EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextDni = findViewById(R.id.dni)
        editTextNombre = findViewById(R.id.nombre)
        editTextEdad = findViewById(R.id.edad)
        editTextProfesion = findViewById(R.id.profesion)
        editTextSalario = findViewById(R.id.salario)
        Limpiar(R.id.dni)
        Limpiar(R.id.nombre)
        Limpiar(R.id.edad)
        Limpiar(R.id.profesion)
        Limpiar(R.id.salario)



    }

    private fun Limpiar(viewId: Int) {
        val editText: EditText = findViewById(viewId)
        editText.setOnClickListener {
            editText.hint = ""
        }
    }
    private fun insertar(view: View){
//        var datos = SQLite(this,"persona", null,1)
//        var baseDatos = datos.writableDatabase
//        var txtDNI = editTextDni?.text.toString()
//        var txtNombre = editTextNombre?.text.toString()
//        var txtEdad = editTextEdad?.text.toString()
//        var txtProfesion = editTextProfesion?.text.toString()
//        var txtSalario = editTextSalario?.text.toString()



//        if (txtDNI.isEmpty() && txtEdad.isEmpty() && txtNombre.isEmpty() && txtProfesion.isEmpty() && txtSalario.isEmpty()){
//            var registro = ContentValues()
//            registro.put("dni",txtDNI)
//            registro.put("nombre",txtNombre)
//            registro.put("edad",txtEdad)
//            registro.put("profesion",txtProfesion)
//            registro.put("salario",txtSalario)
//
//            baseDatos.insert("persona",null,registro)
//            Toast.makeText(this,"Se ha insertado existosamente",Toast.LENGTH_LONG).show()
//
//        }else{
//            Toast.makeText(this,"Los campos deben tener texto",Toast.LENGTH_LONG).show()
//
//        }

    }
}
