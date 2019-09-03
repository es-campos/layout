package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView password, email;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        button = findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = email.getText().toString();
                String prov = password.getText().toString();
                if (!TextUtils.isEmpty(user) && !TextUtils.isEmpty(prov)){
                    if(user.equals("Cachorrao")&& prov.equals("123")){
                        Intent i = new Intent(MainActivity.this, Filmes.class);
                        i.putExtra("Cachorrao", user);
                        i.putExtra("123", prov);

                        startActivity(i);
                    }else {
                        Toast.makeText(getApplicationContext(),"senha inválida", Toast.LENGTH_SHORT).show();
                    }

                }else {
                    Toast.makeText(getApplicationContext(),"Campos em branco", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}
