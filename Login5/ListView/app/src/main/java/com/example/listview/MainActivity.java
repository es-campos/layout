package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listLocais;
    private  String[] itens = {
      "Angra dos Reis", "Caldas Novas", "Bariloche", "Capadócia", "Cancún", "Montes Claros",
      "Paris", "Orlando", "Veneza", "Caribe", "Buenos Aires", "Porto Seguro", "Tiradentes", "Monte Verde"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listLocais = findViewById(R.id.listLocais);

        //Criar adaptador para a lista
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
        );

        //adicionar adaptador para lista
        listLocais.setAdapter(adaptador);

        //adiciona clique na lista
        listLocais.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String valorselecionado = listLocais.getItemAtPosition(i).toString();
                Toast.makeText(getApplicationContext(), valorselecionado, Toast.LENGTH_LONG).show();
            }
        });
    }
}
