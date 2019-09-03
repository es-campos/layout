package com.example.recyclerviewjamilton.activity.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.recyclerviewjamilton.R;
import com.example.recyclerviewjamilton.activity.activity.adapter.Adapter;
import com.example.recyclerviewjamilton.activity.activity.model.Filmes;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<Filmes> listaFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);


        //Configurar Adapter
        Adapter adapter = new Adapter(listaFilmes);

        //Configurar RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true); //otimiza o processo e diz que ele tem tamanho unico
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);
    }

    public void criarFilmes(){
        Filmes filmes = new Filmes("Capitão América","2015", "Ação");
        this.listaFilmes.add(filmes);

        filmes = new Filmes("Piratas do Caribe","2012", "Aventura");
        this.listaFilmes.add(filmes);

        filmes = new Filmes("Os Mercenários","2010", "Ação");
        this.listaFilmes.add(filmes);

        filmes = new Filmes("Brasileirinhas","2018", "Comédia");
        this.listaFilmes.add(filmes);

        filmes = new Filmes("Se beber não case 3","2013", "Comédia");
        this.listaFilmes.add(filmes);

        filmes = new Filmes("Velozes e Furiosos 5","2014", "Ação");
        this.listaFilmes.add(filmes);

        filmes = new Filmes("It - A Coisa","2018", "Suspense");
        this.listaFilmes.add(filmes);

        filmes = new Filmes("Legalmente Loira","2006", "Comédia");
        this.listaFilmes.add(filmes);

        filmes = new Filmes("Jogos Mortais II","2010", "Terror");
        this.listaFilmes.add(filmes);

        filmes = new Filmes("Mulher Maravilha","2015", "Ação");
        this.listaFilmes.add(filmes);

        filmes = new Filmes("X-men","2004", "Aventura");
        this.listaFilmes.add(filmes);

    }
}
