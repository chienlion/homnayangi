package com.example.anonymous.homnayangi;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyViewHolder extends RecyclerView.ViewHolder{
    TextView txtTitle, txtAddress;
    ImageView img;
    public MyViewHolder(View itemView) {
        super(itemView);
        txtTitle = itemView.findViewById(R.id.txtTitle);
        txtAddress = itemView.findViewById(R.id.txtAddress);
        img = itemView.findViewById(R.id.imgRestaurantsDetail);
    }
}
