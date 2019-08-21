package com.example.myapplicationlogin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class DActivity extends AppCompatActivity {
    ConstraintLayout dlayout;
    ProgressBar progresso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d);

        progresso=(ProgressBar)findViewById(R.id.progresso);
        dlayout=(ConstraintLayout)findViewById(R.id.dlayout);

        final Button bt2= new Button(this);
        bt2.setText(R.string.bt2_on);
        dlayout.addView(bt2);

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (progresso.isShown()) {
                    bt2.setText(R.string.bt2_off);
                    progresso.setVisibility(View.GONE);
                } else {
                    bt2.setText(R.string.bt2_on);
                    progresso.setVisibility(View.VISIBLE);
                }
            }
        });




    }
}
