package com.example.myapplicationlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BancActivity extends AppCompatActivity {
    private Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banc);

        botao= (Button)findViewById(R.id.botao);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it= new Intent(BancActivity.this, MainActivity.class);
                startActivity(it);
                finish();

            }
        });

//        botao.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent it= new Intent(BancActivity.this, MainActivity.class);
//                startActivity(it);
//                finish();
//            }
//        });
    }

}
