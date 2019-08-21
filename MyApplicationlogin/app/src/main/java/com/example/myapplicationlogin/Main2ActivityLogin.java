package com.example.myapplicationlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2ActivityLogin extends AppCompatActivity {

    private TextView palavra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_login);

        Intent intent = getIntent();
        String emerson = intent.getStringExtra("Emerson");
        String senha123 = intent.getStringExtra("senha123");

        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();

    }
}
