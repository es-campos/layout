package com.example.login5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.BreakIterator;
import java.util.List;

public class BancAdapter extends RecyclerView.Adapter<BancAdapter.MyViewHolder> {
    private List<Banc> bancList;

    public BancAdapter(List<Banc> bancList) {
        this.bancList = bancList;
    }

    @NonNull
    @Override
    public BancAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(parent.getContext())
        .inflate(R.layout.banc_list_row, parent, false));

        //return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BancAdapter.MyViewHolder holder, int position) {
        Banc banc = bancList.get(position);
        holder.name.setText(banc.getName());
        holder.type.setText(banc.getType());

    }

    @Override
    public int getItemCount() {
        return bancList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public EditText name;
        public EditText type;

        public MyViewHolder(View view) {
            super(view);
            name = view.findViewById(R.id.login);
            type = view.findViewById(R.id.password);
        }
    }
}
