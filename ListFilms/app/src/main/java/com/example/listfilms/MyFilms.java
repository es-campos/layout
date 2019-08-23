package com.example.listfilms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MyFilms extends AppCompatActivity {
    public class Movie{
        private  String fil, gen, an;

        public Movie(){

        }
        public Movie(String fil, String gen, String an){
            this.fil=fil;
            this.gen=gen;
            this.an=an;
        }

        public String getFil() {
            return fil;
        }

        public void setFil(String fil) {
            this.fil = fil;
        }

        public String getGen() {
            return gen;
        }

        public void setGen(String gen) {
            this.gen = gen;
        }

        public String getAn() {
            return an;
        }

        public void setAn(String an) {
            this.an = an;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_films);
    }
}
