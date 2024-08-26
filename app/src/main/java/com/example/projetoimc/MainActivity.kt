package com.example.projetoimc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.projetoimc.dao.IMCDao
import com.example.projetoimc.dao.IMCImpl
import com.example.projetoimc.databinding.ActivityMainBinding
import com.example.projetoimc.model.IMC

class MainActivity : AppCompatActivity() {

    private val imc = IMCImpl()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val intent = Intent(this, ResultadoActivity::class.java)

            val edtPeso = findViewById<EditText>(R.id.peso)
            val edtAltura = findViewById<EditText>(R.id.altura)
            val btnNavegar = findViewById<Button>(R.id.button)
            button.setOnClickListener {
                val peso =edtPeso.text.toString().toDouble()
                val altura = edtAltura.text.toString().toDouble()
                imc.salvarIMC(IMC(peso, altura))

                startActivity(intent)


            }
        }
    }
}




