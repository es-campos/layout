package com.example.recyclerviewjamilton.activity.activity.activity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.recyclerviewjamilton.R;
import com.example.recyclerviewjamilton.activity.activity.RecyclerItemClickListener;
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
        Adapter adapter = new Adapter(criarFilmes());

        //Configurar RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true); //otimiza o processo e diz que ele tem tamanho unico
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);

        //adicionar click do botão
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
                        Filmes filmes = listaFilmes.get(position);
//                        Toast.makeText(getApplicationContext(),
//                                "Item pressionado: " + filmes.getTitleFilme(),
//                                Toast.LENGTH_SHORT
//                        ).show();
                        exemplo_layout(filmes);
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {
                        Filmes filmes = listaFilmes.get(position);
                        Toast.makeText(getApplicationContext(),
                                "Click longo: " + filmes.getTitleFilme(),
                                Toast.LENGTH_SHORT
                        ).show();




                    }

                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                    }
                 }
                )
        );
    }

    private List<Filmes> criarFilmes(){
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

        return listaFilmes;

    }

    private void exemplo_layout(Filmes filme) {
        //LayoutInflater é utilizado para inflar nosso layout em uma view.
        //-pegamos nossa instancia da classe
        LayoutInflater li = getLayoutInflater();

        //inflamos o layout alerta.xml na view
        View view = li.inflate(R.layout.alerta, null);
        //definimos para o botão do layout um clickListener
        view.findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                //exibe um Toast informativo.
                Filmes filmes = null;
                Toast.makeText(MainActivity.this, filmes.getTitleFilme(), Toast.LENGTH_SHORT).show();
                //desfaz o alerta.
                Dialog alerta = null;
                alerta.dismiss();
            }
        });

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(filme.getTitleFilme());
        builder.setView(view);
        builder.setPositiveButton("Sair", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Cliquei no botao sim", Toast.LENGTH_SHORT).show();
            }
        });
        AlertDialog alerta = builder.create();
        alerta.show();
    }
}
