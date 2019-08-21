package com.example.myapplicationlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button start;
    private EditText login;
    private EditText pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setListener();
    }

    void setListener(){
        start= (Button) findViewById(R.id.start);
        login= (EditText) findViewById(R.id.login);
        pass= (EditText) findViewById(R.id.pass);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = login.getText().toString();
                String prot = pass.getText().toString();
                if (user!= null){
                    Intent i = new Intent(MainActivity.this, DActivity.class);
                    i.putExtra("Emerson", user);
                    i.putExtra("senha123", prot);
                    startActivity(i);
                } else {
                    Toast.makeText(getApplicationContext(),"error", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
