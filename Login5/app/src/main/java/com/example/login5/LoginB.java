package com.example.login5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class LoginB extends AppCompatActivity {

        private List<Banc> bancList = new ArrayList<>();
        private RecyclerView recyclerView;
        private BancAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_b);

            recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

            mAdapter = new BancAdapter(bancList);
            RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
            recyclerView.setLayoutManager(mLayoutManager);
            recyclerView.setItemAnimator(new DefaultItemAnimator());
            recyclerView.setAdapter(mAdapter);

            prepareBancData();
        }

        private void prepareBancData() {
            Banc banc = new Banc("Itaú", "Conta Corrente");
            bancList.add(banc);

//            Banc banc = new Banc("Bradesco", "Conta Salário");
//            bancList.add(banc);
//
//            Banc banc = new Banc("Caixa", "Conta Poupança");
//            bancList.add(banc);
//
//            Banc banc = new Banc("Banco do Brasil", "Conta Corrente");
//            bancList.add(banc);
//
//            Banc banc = new Banc("Santander", "Conta Salário");
//            bancList.add(banc);

            mAdapter.notifyDataSetChanged();
        }
}


