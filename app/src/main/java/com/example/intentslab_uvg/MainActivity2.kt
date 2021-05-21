package com.example.intentslab_uvg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.activity_main2.etValor1

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bundle = intent.extras

        if (bundle != null) {
            if(intent.hasExtra("valor")){
                

                val texto = bundle.getString("valor")
                tvRESULTT.text = texto
            }else if (intent.hasExtra("valor2")){
                val texto = bundle.getString("valor2")
                tvRESULTT.text = texto
            }else if (intent.hasExtra("valor3")){
                val texto = bundle.getString("valor3")
                tvRESULTT.text = texto
            }else if (intent.hasExtra("valor4")){
                val texto = bundle.getString("valor4")
                tvRESULTT.text = texto
            }




            //txtTexto.text = texto

            /**
            val valor2 = bundle.getString("valor2")
            Toast.makeText(this, valor2, Toast.LENGTH_SHORT).show()
            **/

            /*val valor3 = bundle.getString("valor3")

            if (valor3 != null){
                Toast.makeText(this, valor3, Toast.LENGTH_SHORT).show()
            }*/

            /**
            val valor3 = bundle.getString("valor3","no hay valor")
            Toast.makeText(this, valor3, Toast.LENGTH_SHORT).show()
            **/

        }

        btnRegresar.setOnClickListener {
            val intent: Intent = Intent()
            intent.putExtra("resultado1", "Valor desde pantalla 2")
            setResult(RESULT_OK, intent)
            finish()
        }

    }
}