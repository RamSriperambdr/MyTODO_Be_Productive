package com.example.mytodo;


import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mytodo.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class DoesAdapter extends RecyclerView.Adapter<DoesAdapter.MyViewHolder>{

    Context context;
    ArrayList myDoes;

    public DoesAdapter(Context c, ArrayList p) {
        context = c;
        myDoes = p;
    }

    @NonNull
    @Override
    public  MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i){
    return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.new_todo, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i){
        MyViewHolder.titledoes.setText(myDoes.get(i).getTitledoes());
        MyViewHolder.descdoes.setText(myDoes.get(i).getTitledoes());
        MyViewHolder.datedoes.setText(myDoes.get(i).getTitledoes());
    }



    @Override
    public int getItemCount(){
        return myDoes.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView titledoes, descdoes, datedoes;

        public MyViewHolder(@NonNull View itemView){
            super(itemView);
            titledoes = (TextView) itemView.findViewById(R.id.titledoes);
            descdoes = (TextView) itemView.findViewById(R.id.descdoes);
            datedoes = (TextView) itemView.findViewById(R.id.datedoes);
        }
    }

}




