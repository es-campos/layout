package com.example.recyclerviewjamilton.activity.activity.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewjamilton.R;
import com.example.recyclerviewjamilton.activity.activity.model.Filmes;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    private List<Filmes> listaFilmes;
    public Adapter(List<Filmes> lista) {
        this.listaFilmes = lista;
    }

    @NonNull
    @Override //utilizado para criar visualizações
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_lista, parent, false);

        return new MyViewHolder(itemLista);
    }

    @Override //visualização dos itens
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Filmes filmes = listaFilmes.get(position);
        holder.title.setText(filmes.getTitleFilme());
        holder.year.setText(filmes.getYear());
        holder.genero.setText(filmes.getGenero());

    }

    @Override
    public int getItemCount() {
        return listaFilmes.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        TextView year;
        TextView genero;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.titleFilme);
            year = itemView.findViewById(R.id.year);
            genero = itemView.findViewById(R.id.genero);
        }
    }
}
