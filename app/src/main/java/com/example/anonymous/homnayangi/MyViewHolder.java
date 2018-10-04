package com.example.anonymous.homnayangi;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MyViewHolder extends RecyclerView.ViewHolder{
    TextView txtTitle, txtAddress;
    ImageView img;
    public MyViewHolder(final View itemView) {
        super(itemView);
        txtTitle = itemView.findViewById(R.id.txtTitleRestaurant);
        txtAddress = itemView.findViewById(R.id.txtAddressRestaurant);
        img = itemView.findViewById(R.id.imgRestaurant);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(itemView.getContext(),RestaurantsDetailsActivity.class);

            }
        });
    }
    public void setAll(Context context,String title, String address, String image){
        txtTitle.setText(title);
        txtAddress.setText(address);
        Picasso.with(context).load(image).into(img);
    }
}
