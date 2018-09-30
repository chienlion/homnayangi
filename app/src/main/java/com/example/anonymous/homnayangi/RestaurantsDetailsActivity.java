package com.example.anonymous.homnayangi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class RestaurantsDetailsActivity extends AppCompatActivity {
    private int imageView;
    private String title;
    private String address;
    private String openAndClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants_details);
        if(getIntent().hasExtra("IMAGE_RESTAURANTS")&&getIntent().hasExtra("TITLE_RESTAURANTS")&&getIntent().hasExtra("ADDRESS_RESTAURANTS")&&getIntent().hasExtra("OPENANDCLOSE")){
            imageView = getIntent().getIntExtra("IMAGE_RESTAURANTS",R.drawable.dingtea);
            title = getIntent().getStringExtra("TITLE_RESTAURANTS");
            address = getIntent().getStringExtra("ADDRESS_RESTAURANTS");
            openAndClose = getIntent().getStringExtra("OPENANDCLOSE");

            setView(imageView,title,address,openAndClose);
        }
    }
    private void setView(int image, String title, String address, String openAndClose){
        ImageView imgRestaurantsDetails = findViewById(R.id.imgRestaurantsDetail);
        TextView txtTitle = findViewById(R.id.txtTitleDetails);
        TextView txtAddress = findViewById(R.id.txtAddresDetails);
        TextView txtOpenAndClose = findViewById(R.id.txtOpenAndClose);
        imgRestaurantsDetails.setImageResource(image);
        txtTitle.setText(title);
        txtAddress.setText(address);
        txtOpenAndClose.setText(openAndClose);
    }
}
