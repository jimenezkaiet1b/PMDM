package com.example.contador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonResta : Button = findViewById(R.id.restar)
        val botonSuma : Button = findViewById(R.id.sumar)
        val botonReset : ImageButton = findViewById(R.id.reset)
        val salida : TextView = findViewById(R.id.resultado)

        botonSuma.setOnClickListener{
            var laSalida = salida.text.toString().toInt()
            salida.text = laSalida++.toString();
        }

        botonResta.setOnClickListener{
            var laSalida = salida.text.toString().toInt()

            if (laSalida > 0){
                salida.text = laSalida--.toString()

            }
        }

        botonReset.setOnClickListener{
            salida.text = "0";
        }


    }
}