package com.example.swipe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private SwipeRefreshLayout swipeRefreshLayout;
    private ArrayAdapter<String> adapter;
    private ArrayList<String>nomes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        swipeRefreshLayout = findViewById(R.id.swipe);
        listView = findViewById(R.id.list_view);

        nomes = new ArrayList<String>();
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nomes);
        listView.setAdapter(adapter);

        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        atualizartodos();
                        swipeRefreshLayout.setRefreshing(false);
                    }
                }, 4000);
            }
        });

         atualizartodos();

    }

    private void atualizartodos() {
        int totalnomes = nomes.size();

        for (int j = totalnomes; j<=totalnomes +1; j++){
            nomes.add(0, String.format("Nome %d", j));
        }
        adapter.notifyDataSetChanged();//reinderizar valor(juntar com os valores)
    }
}
