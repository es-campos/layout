package com.example.meuprojetokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val listaDeCarro = listOf<Carro>(Carro("Volks", "Gol"),
        Carro("Fiat", "Argo"),
        Carro("Honda", "HR-V"))

        listView.setAdapter(ListaAdapter(listaDeCarro, this))

    }
}
