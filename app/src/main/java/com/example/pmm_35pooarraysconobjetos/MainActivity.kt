package com.example.pmm_35pooarraysconobjetos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_35pooarraysconobjetos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val persona0 = Persona("Juan",29)
        val persona1 = Persona("Jorge", 20)
        val persona2 = Persona("Luis", 23)
        val persona3 = Persona("Antonio", 31)
        val listaPersonas = arrayOf(persona0,persona1,persona2,persona3)

        var mayoresDeEdad = 0
        for (persona in listaPersonas){
            if (persona.mayorDeEdad())
                mayoresDeEdad++
        }

        val mayoresMensaje = "Mayores de edad: $mayoresDeEdad"
        binding.tvPersonas10.text = listaPersonas.toList().toString()
        binding.tvMayores10.text = mayoresMensaje

    }
}
class Persona(val nombre: String, val edad: Int) {
    fun mayorDeEdad():Boolean{
        return edad >= 18
    }
    override fun toString(): String {
        return "Persona - $nombre, $edad años"
    }
}


