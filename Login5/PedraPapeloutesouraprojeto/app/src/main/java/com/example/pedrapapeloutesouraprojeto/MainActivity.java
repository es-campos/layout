package com.example.pedrapapeloutesouraprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

import static android.view.View.*;

public class MainActivity extends AppCompatActivity {

    private ImageView selecionaPapel, selecionaPedra, selecionaTesoura, imageResultado;
    private TextView textResultadoç;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        selecionaPapel = findViewById(R.id.selecionaPapel);
        selecionaPedra = findViewById(R.id.selecionaPedra);
        selecionaTesoura = findViewById(R.id.selecionaTesoura);
        imageResultado = findViewById(R.id.imageResultado);
        textResultadoç =  findViewById(R.id.textResultado);

        selecionaPapel.setOnClickListener(new OnClickListener(
        ) {
            @Override
            public void onClick(View view) {
                opcaoSelecionada(1);
            }
        });

        selecionaTesoura.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                opcaoSelecionada(2);
            }
        });

        selecionaPedra.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                opcaoSelecionada(0);
            }
        });
    }


    private void opcaoSelecionada(int escolhaUsuario){
        int numero = new Random().nextInt(3);

        switch (numero){
            case 0:
                imageResultado.setImageResource(R.drawable.pedra);
                switch (escolhaUsuario){
                    case 0: textResultadoç.setText("Empatamos"); break;
                    case 1: textResultadoç.setText("Você ganhou"); break;
                    case 2: textResultadoç.setText("Você perdeu"); break;
                    default: break;
                }
                break;

            case 1:
                imageResultado.setImageResource(R.drawable.papel);
                switch (escolhaUsuario){
                    case 0: textResultadoç.setText("Você perdeu"); break;
                    case 1: textResultadoç.setText("Empatamos"); break;
                    case 2: textResultadoç.setText("Você ganhou"); break;
                    default: break;
                }
                break;

            case 2:
                imageResultado.setImageResource(R.drawable.tesoura);
                switch (escolhaUsuario){
                    case 0: textResultadoç.setText("Você ganhou"); break;
                    case 1: textResultadoç.setText("Você perdeu"); break;
                    case 2: textResultadoç.setText("Empatamos"); break;
                    default: break;
                }
                break;
        }

    }

    public void OnClickListener(View view) {

    }
}


