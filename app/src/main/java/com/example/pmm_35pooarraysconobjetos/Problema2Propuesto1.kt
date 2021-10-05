package com.example.pmm_35pooarraysconobjetos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_35pooarraysconobjetos.databinding.ActivityMainBinding
import com.example.pmm_35pooarraysconobjetos.databinding.ActivityProblema2Propuesto1Binding

class Problema2Propuesto1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema2_propuesto1)

        val binding = ActivityProblema2Propuesto1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val articulo0 = Articulo(0,"cero",3.99)
        val articulo1 = Articulo(1,"uno",1.99)
        val articulo2 = Articulo(2,"dos",1.99)
        val articulo3 = Articulo(3,"tres",3.99)

        val listaArticulos = arrayOf(articulo0,articulo1,articulo2,articulo3)


        binding.tvArticulos20.text = mostrarArticulos(listaArticulos)
        incrementarPrecio(listaArticulos)
        binding.tvArticulosIncremento20.text = mostrarArticulos(listaArticulos)


    }
    fun mostrarArticulos(listaArticulos: Array<Articulo>): String {
        var string = ""
        for (articulo in listaArticulos)
            string += " $articulo"
        return string
    }

    fun incrementarPrecio(listaArticulos: Array<Articulo>){
        for (articulo in listaArticulos)
            articulo.precio = articulo.precio*1.1
    }
}
data class Articulo(val codigo:Int, val descripcion:String, var precio:Double){
    override fun toString(): String {
        return "Articulo - codigo: $codigo, descripcion: $descripcion, precio: $precio\n"
    }
}
