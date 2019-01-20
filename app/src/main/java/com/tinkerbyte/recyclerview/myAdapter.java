package com.tinkerbyte.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class myAdapter extends RecyclerView.Adapter<myAdapter.myViewHolder> {

    private String [] data;
    public  myAdapter(String [] data)
    {
        this.data = data;

    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.myviewtype,parent,false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

        String title = data[position];
        holder.name.setText(title);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }


    public class myViewHolder extends RecyclerView.ViewHolder{

        TextView name;
        ImageView myimage;
        public myViewHolder(View itemView) {
            super(itemView);
            name= (TextView) itemView.findViewById(R.id.txt);
            myimage=(ImageView) itemView.findViewById(R.id.img);
        }
    }

}
