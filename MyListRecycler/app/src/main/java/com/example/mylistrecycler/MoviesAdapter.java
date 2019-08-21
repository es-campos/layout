package com.example.mylistrecycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {
    private  List<Movie> movieList;

    public MoviesAdapter(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView title, year, genre; //declaração de variáveis

        //construtor da classe interna
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title=(TextView) itemView.findViewById(R.id.title);
            year=(TextView) itemView.findViewById(R.id.year);
            genre=(TextView) itemView.findViewById(R.id.genre);
        }
    }


    @NonNull
    @Override
    public MoviesAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.movie_list_row, parent, false);

        return new MyViewHolder(itemView); //instância myview
    }
//setar valores pegar a view
    @Override
    public void onBindViewHolder(@NonNull MoviesAdapter.MyViewHolder holder, int position) {
        Movie movie = movieList.get(position);
        holder.title.setText(movie.getTitle());
        holder.year.setText(movie.getYear());
        holder.genre.setText(movie.getGenre());

    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }


}
