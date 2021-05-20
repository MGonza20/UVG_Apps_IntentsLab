package com.example.intentslab_uvg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main2.etValor1

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        /** INFO FUNCIONAL
        val bundle = intent.extras

        if(bundle != null){
            val texto = bundle.getString("valor")
            tvResultado.text = texto

            val valor2 = bundle.getString("valor2")
            Toast.makeText(this, valor2, Toast.LENGTH_LONG).show()
        **/

        val valor1 : Int
        val valor2 : Int

        btnRegresar.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity::class.java)

            //ASIGNAR VALORES A VALOR1 y VALOR2

            intent.putExtra("valor", "Hola mundo")
            intent.putExtra("valor2", "Prueba")
        }

/**
            val valor3 = bundle.getString("valor3", "No hay valor")
            Toast.makeText(this, valor3, Toast.LENGTH_LONG).show()
**/

            /**
            if(valor3 != null){
                Toast.makeText(this, valor3, Toast.LENGTH_LONG).show()
            }

        }
             **/

        btnRegresar.setOnClickListener{
            val intent: Intent = Intent()
            intent.putExtra("resultado1", "Valor desde pantalla 2")
            setResult(RESULT_OK, intent)
            finish()
        }

    }
}