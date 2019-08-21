package com.example.myactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mybutton;
    private EditText messagem;
    private EditText password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setListener();
    }

    void setListener() {
        mybutton = (Button) findViewById(R.id.action_text);
        messagem = (EditText) findViewById(R.id.message);
        password=  (EditText) findViewById(R.id.password);

        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoDigitado = messagem.getText().toString();
                String senha= password.getText().toString();
                if (textoDigitado != null) {
                    Intent i = new Intent(MainActivity.this, BActivity.class);
                    i.putExtra("Emerson", textoDigitado); //usuário
                    i.putExtra("sapato", senha);
                    startActivity(i);
                } else {
                    Toast.makeText(MainActivity.this, "usuario incorreto", Toast.LENGTH_SHORT).show();


                }
            }
        });
    }

}

