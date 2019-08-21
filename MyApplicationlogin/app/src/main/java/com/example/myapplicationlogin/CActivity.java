package com.example.myapplicationlogin;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CActivity extends AppCompatActivity {

    ConstraintLayout lay;

    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        builder= new AlertDialog.Builder(this);
        builder.setMessage(R.string.app_name).setTitle(R.string.app_name);
//layout
        lay= findViewById(R.id.layout);

        TextView tvi= new TextView(this);
        tvi.setText("Hello group");
//Button
        Button btn= new Button(this);
        btn.setText("Button");

        lay.addView(tvi);
        lay.addView(btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                        Toast.makeText(CActivity.this, "Treine mais e ficara monster", Toast.LENGTH_SHORT).show();

                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                        Toast.makeText(CActivity.this, "Tente novamente", Toast.LENGTH_SHORT).show();

                    }
                });
                AlertDialog alert= builder.show();
                alert.setTitle("Not desist friend");
                alert.show();
            }
        });
    }
}
