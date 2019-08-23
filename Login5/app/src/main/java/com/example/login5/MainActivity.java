package com.example.login5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText login, password;
    private Button but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = findViewById(R.id.login);
        password = findViewById(R.id.password);
        but = findViewById(R.id.but);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = login.getText().toString();
                String pass = password.getText().toString();
                if (user != null && pass != null){
                    if (user.equals("Mandragora") && pass.equals("love")){
                        Intent i = new Intent(MainActivity.this, LoginB.class);
                        i.putExtra("Mandragora",user);
                        startActivity(i);
                        finish();
                    } else {
                        Toast.makeText(
                                getApplicationContext(), "error", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });
    }

}
