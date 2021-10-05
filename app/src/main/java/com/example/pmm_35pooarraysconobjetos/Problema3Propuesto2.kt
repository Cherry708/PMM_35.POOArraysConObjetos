package com.example.pmm_35pooarraysconobjetos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_35pooarraysconobjetos.databinding.ActivityProblema3Propuesto2Binding

class Problema3Propuesto2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema3_propuesto2)

        val binding = ActivityProblema3Propuesto2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val listaDados = arrayOf(Dado(), Dado(), Dado(),Dado())

        for (dado in listaDados){
            dado.tirar()
        }


        binding.tvDados30.text = mostrarListaDados(listaDados)

    }
    fun mostrarListaDados(listaDados: Array<Dado>):String{
        var string = ""
        for (dado in listaDados)
            string += dado.toString().plus(" ")
        return string
    }
}
class Dado (){
    var valor = 1
    fun tirar() {
        valor = (1..6).random()
    }

    override fun toString(): String {
        return "[Dado - valor: $valor]"
    }
}


