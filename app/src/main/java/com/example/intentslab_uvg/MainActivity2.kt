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


        var answerBack: String
        val bundle = intent.extras

        if (bundle != null) {
            if(intent.hasExtra("valor")){

                val texto = bundle.getString("valor")
                tvRESULTT.text = texto

                btnRegresar.setOnClickListener {

                    val valor1 = Integer.parseInt(etValor1.text.toString())
                    val valor2 = Integer.parseInt(etValor2.text.toString())
                    val suma = valor1+valor2

                    answerBack = "El resultado es: \n" + suma

                    val intent: Intent = Intent()
                    intent.putExtra("resultado1", answerBack)
                    setResult(RESULT_OK, intent)
                    finish()
                }

            }
            else if (intent.hasExtra("valor2")){

                val texto = bundle.getString("valor2")
                tvRESULTT.text = texto

                btnRegresar.setOnClickListener {

                    val valor1 = Integer.parseInt(etValor1.text.toString())
                    val valor2 = Integer.parseInt(etValor2.text.toString())
                    val resta = valor1 - valor2

                    answerBack = "El resultado es: \n" + resta

                    val intent: Intent = Intent()
                    intent.putExtra("resultado1", answerBack)
                    setResult(RESULT_OK, intent)
                    finish()
                }

            }else if (intent.hasExtra("valor3")){

                val texto = bundle.getString("valor3")
                tvRESULTT.text = texto

                btnRegresar.setOnClickListener {

                    val valor1 = Integer.parseInt(etValor1.text.toString())
                    val valor2 = Integer.parseInt(etValor2.text.toString())
                    val multiply = valor1 * valor2

                    answerBack = "El resultado es: \n" + multiply

                    val intent: Intent = Intent()
                    intent.putExtra("resultado1", answerBack)
                    setResult(RESULT_OK, intent)
                    finish()
                }

            }else if (intent.hasExtra("valor4")){

                val texto = bundle.getString("valor4")
                tvRESULTT.text = texto

                btnRegresar.setOnClickListener {

                    val valor1  = Integer.parseInt(etValor1.text.toString())
                    val valor2 = Integer.parseInt(etValor2.text.toString())
                    val divide = valor1 / valor2

                    answerBack = "El resultado es: \n" + divide

                    val intent: Intent = Intent()
                    intent.putExtra("resultado1", answerBack)
                    setResult(RESULT_OK, intent)
                    finish()
                }
            }
        }
    }
}