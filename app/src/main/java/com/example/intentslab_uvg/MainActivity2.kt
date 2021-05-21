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


        val answerBack: String
        val bundle = intent.extras

        if (bundle != null) {
            if(intent.hasExtra("valor")){

                //val suma: Int = valor1.text.toString().toInt()+valor2.text.toString().toInt()

                    /**
                val valor1 = Integer.parseInt(etValor1.text.toString())
                val valor2 = Integer.parseInt(etValor2.text.toString())
                val suma = valor1+valor2
                **/

                val valor1:Int = (etValor1.text.toString()).toInt()
                val valor2:Int = (etValor2.text.toString()).toInt()
                val suma = (valor1+valor2).toString()

                answerBack = suma
                val texto = bundle.getString("valor")
                tvRESULTT.text = texto

                btnRegresar.setOnClickListener {
                    val intent: Intent = Intent()
                    intent.putExtra("resultado1", answerBack)
                    setResult(RESULT_OK, intent)
                    finish()
                }

            }else if (intent.hasExtra("valor2")){
                val texto = bundle.getString("valor2")
                tvRESULTT.text = texto
                answerBack = "Resultado resta"

                btnRegresar.setOnClickListener {
                    val intent: Intent = Intent()
                    intent.putExtra("resultado1", answerBack)
                    setResult(RESULT_OK, intent)
                    finish()
                }

            }else if (intent.hasExtra("valor3")){
                val texto = bundle.getString("valor3")
                tvRESULTT.text = texto
                answerBack = "Result multi"

                btnRegresar.setOnClickListener {
                    val intent: Intent = Intent()
                    intent.putExtra("resultado1", answerBack)
                    setResult(RESULT_OK, intent)
                    finish()
                }

            }else if (intent.hasExtra("valor4")){
                val texto = bundle.getString("valor4")
                tvRESULTT.text = texto
                answerBack = "Result divi"

                btnRegresar.setOnClickListener {
                    val intent: Intent = Intent()
                    intent.putExtra("resultado1", answerBack)
                    setResult(RESULT_OK, intent)
                    finish()
                }
            }


        }

        /**
        btnRegresar.setOnClickListener {
            val intent: Intent = Intent()
            intent.putExtra("resultado1", answerBack)
            setResult(RESULT_OK, intent)
            finish()
        }
        **/

    }
}