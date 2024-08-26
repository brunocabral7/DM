package com.example.projetoimc.dao

import com.example.projetoimc.model.IMC

interface IMCDao {
    fun salvarIMC(imc:IMC)
    fun resultadoIMC():String
}