package com.example.mylistrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Movie> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MoviesAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recicle);

        mAdapter = new MoviesAdapter(movieList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareMovieData();
    }

    private void prepareMovieData() {
        Movie movie = new Movie("Velozes e Furiosos", "action", "2001");
        movieList.add(movie);

        movie = new Movie("Star Wars", "Science Fiction", "2005");
        movieList.add(movie);

        movie = new Movie("Spider man 2", "action", "2007");
        movieList.add(movie);

        movie = new Movie("Piratas do Caribe", "action", "2017");
        movieList.add(movie);

        movie = new Movie("Brasileirinhas", "stand up", "2018");
        movieList.add(movie);

        mAdapter.notifyDataSetChanged();
    }
}
