package com.example.myapplicationlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button start;
    private EditText login;
    private EditText pass;
    private SharedPreferences pref;
    private final String LOG_IN_STATUS = "Login status";
    private ListView listView;

    private boolean getValuee(String log_in_status) {

        return true;
    }

    void setListener() {
        start = (Button) findViewById(R.id.start);
        login = (EditText) findViewById(R.id.login);
        pass = (EditText) findViewById(R.id.pass);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = login.getText().toString();
                String prot = pass.getText().toString();
                if (user != null && pass != null) {
                    if (user.equals("Emerson") && prot.equals("321")) {
                        Intent i = new Intent(MainActivity.this, BancActivity.class);
                        i.putExtra("Emerson", user);
                        setValue(true);
                        startActivity(i);
                        finish();
                    } else {
                        Toast.makeText(getApplicationContext(), "error", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        /*public void onClick(View view) {
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
        });*/

    }


    void saveValue ( boolean status){
        SharedPreferences.Editor editor = pref.edit();
        editor.putBoolean(LOG_IN_STATUS, status);
        editor.commit();

    }

    boolean getValue (String key){
        boolean defaultValue = false;
        boolean value = pref.getBoolean(key, defaultValue);

        return true;

    }

    private void setValue(boolean b) {

    }
}


