package com.example.androapps.sampledemo.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.androapps.sampledemo.Constant.DashBoard;
import com.example.androapps.sampledemo.R;

import java.util.ArrayList;

public class AdapterDashBoard extends RecyclerView.Adapter<AdapterDashBoard.MyViewHolder> {
    Context context;
    ArrayList<DashBoard> names;

    public AdapterDashBoard(ArrayList<DashBoard> dashBoards, Context applicationContext) {
        names = dashBoards;
        context = applicationContext;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.dashboard_item, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        myViewHolder.textView.setText(names.get(i).getName());

    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textview);
        }
    }
}
