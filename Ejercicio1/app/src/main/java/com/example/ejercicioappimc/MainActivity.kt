package com.example.ejercicioappimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val entradaPeso : EditText = findViewById(R.id.editTextText)
        val entradaAltura : EditText = findViewById(R.id.editTextText2)
        val textoSalida : TextView = findViewById(R.id.textView3)
        val botonCalculadora : Button = findViewById(R.id.button)

        botonCalculadora.setOnClickListener {
            var textoPeso = entradaPeso.text.toString().toDouble();
            var textoAltura = entradaAltura.text.toString().toDouble();

            var resultado : Double = (textoPeso/ Math.pow(textoAltura, 2.0));

            when(true){
                (resultado < 18.5) ->{
                    textoSalida.text = "Usted sufre delgadez, debería comer más ";
                }
                (resultado in 18.5..24.9)->{
                    textoSalida.text = "Su estado de forma es bueno.\n"
                }
                (resultado in 25.0..29.9) ->{
                    textoSalida.text = "Usted sufre sobrepeso, debería cuidarse y llamar a un dietista\n"
                }
                (resultado >= 30) ->{
                textoSalida.text = "Usted sufre obesidad, debería llamar a un médico urgentemente\n"

            }
                else -> {"Dato introducido erroneo"}
            }
        }


    }
}