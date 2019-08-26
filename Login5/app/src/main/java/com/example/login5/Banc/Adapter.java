package com.example.login5.Banc;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BancAdapter extends RecyclerView<BancAdapter.MyViewHolder> {
    private List <Banc> bancsList;


    public class MyViewHolder<view> extends RecyclerView.ViewHolder{
        public TextView name, type;

        public MyViewHolder(View view);
        super (view);
    }
}
