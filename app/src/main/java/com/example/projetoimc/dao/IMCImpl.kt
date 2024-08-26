package com.example.projetoimc.dao

import com.example.projetoimc.model.IMC

class IMCImpl:IMCDao {
    companion object{
        private var imc:IMC?=null
    }

    override fun salvarIMC(imc: IMC) {
        Companion.imc= imc
    }

    override fun resultadoIMC(): String {
        imc?.let { imc ->
            val resultado = imc.peso / Math.pow(imc.altura, 2.0)

           return if (resultado < 18.5) {
                "abaixo do peso"
            } else if (resultado >= 18.5 && resultado <= 24.99) {
                "Normal"
            } else if (resultado >= 25.0 && resultado <= 29.99) {
                "SobrePeso"
            } else  {
                "Obesidade"
            }
        }

        return ""
    }
}