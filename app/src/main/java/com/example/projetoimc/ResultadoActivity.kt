package com.example.projetoimc

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.projetoimc.dao.IMCImpl

class ResultadoActivity : AppCompatActivity() {

    private val imc= IMCImpl()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val textView=findViewById<TextView>(R.id.resultado)

        textView.text=imc.resultadoIMC()

    }


}