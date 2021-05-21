package com.example.intentslab_uvg

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnSuma.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("valor", "A sumaar")

            /**
            intent.putExtra("valor2", "Prueba")
            intent.putExtra("valor3", "asdasd")
            **/

            //startActivity(intent)
            //finish()

            startActivityForResult(intent, 1)
        }

        btnResta.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("valor2", "A restar")
            startActivityForResult(intent, 1)
        }

        btnMulti.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("valor3", "A multiplicaaaaaaaaaar")
            startActivityForResult(intent, 1)
        }

        btnDivi.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("valor4", "A dividiiiiiiiiiiiiiiir")
            startActivityForResult(intent, 1)
        }



    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (resultCode == RESULT_OK){
            if (requestCode == 1){
                val bundle = data?.extras
                if (bundle != null){
                    val resultado = bundle.getString("resultado1")
                    tvResultado.text = resultado

                //Toast.makeText(this, resultado, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}