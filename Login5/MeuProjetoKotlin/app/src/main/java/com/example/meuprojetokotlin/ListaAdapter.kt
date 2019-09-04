package com.example.meuprojetokotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.item_listview.view.*
import java.math.MathContext

class ListaAdapter (val lista : List<Carro>,
                    val context: Context): BaseAdapter() {

    private val  listaCarro = lista
    private val contexto = context

    override fun getView(position: Int, p1: View?, p2: ViewGroup?): View {
        val inflate = LayoutInflater.from(contexto).inflate(R.layout.item_listview, p2, false)

        val carro = lista[position]

        inflate.txtTexto.setText(carro.nome)
        inflate.txtModelo.setText(carro.modelo)

        return inflate
    }


    override fun getItem(position: Int): Carro {
        return lista[position]
    }


    override fun getItemId(p0: Int): Long {
        return 0
    }


    override fun getCount(): Int {
        return lista.size
    }
}