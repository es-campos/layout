package com.example.myactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BActivity extends AppCompatActivity {

    private TextView palavra;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        Intent intent = getIntent();
        String id= intent.getStringExtra("Emerson"); //usuário
        String senha= intent.getStringExtra("sapato");

        Toast.makeText(this, id, Toast.LENGTH_SHORT).show();
        palavra = findViewById(R.id.escrito);
        palavra.setText(id);

    }
}
