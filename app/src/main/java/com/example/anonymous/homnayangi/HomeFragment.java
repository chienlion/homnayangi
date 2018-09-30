package com.example.anonymous.homnayangi;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import adapter.AdapterRestaurants;
import model.Restaurants;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
   private RecyclerView rcvHightlights;
   private RecyclerView rcvInteraction;

    private RecyclerView rcvRestaurants;
    private ArrayList<Restaurants> restaurantsArrayList;
    private AdapterRestaurants adapterRestaurants;



    private TextView txtNameUniversity;
    private TextView txtNextActivity;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View itemView = inflater.inflate(R.layout.fragment_home, container, false);
        txtNameUniversity = itemView.findViewById(R.id.txtNameUniversity);
        txtNextActivity = itemView.findViewById(R.id.txtNextActivity);
        txtNextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),FindActivity.class);
                startActivity(intent);
            }
        });

//


        rcvRestaurants = itemView.findViewById(R.id.rcvRestaurants);
        rcvRestaurants.setHasFixedSize(true);
        rcvRestaurants.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        restaurantsArrayList = new ArrayList<>();
        restaurantsArrayList.add(new Restaurants("tocotoco","123 phố viên","trà sữa",R.drawable.tocotoco));
        restaurantsArrayList.add(new Restaurants("Dingtea","123 phố viên","trà sữa",R.drawable.dingtea));
        restaurantsArrayList.add(new Restaurants("tocotoco","123 phố viên","trà sữa",R.drawable.tocotoco));
        restaurantsArrayList.add(new Restaurants("tocotoco","123 phố viên","trà sữa",R.drawable.tocotoco));
        restaurantsArrayList.add(new Restaurants("tocotoco","123 phố viên","trà sữa",R.drawable.tocotoco));
        restaurantsArrayList.add(new Restaurants("tocotoco","123 phố viên","trà sữa",R.drawable.tocotoco));
        restaurantsArrayList.add(new Restaurants("tocotoco","123 phố viên","trà sữa",R.drawable.tocotoco));
        restaurantsArrayList.add(new Restaurants("tocotoco","123 phố viên","trà sữa",R.drawable.tocotoco));
        restaurantsArrayList.add(new Restaurants("tocotoco","123 phố viên","trà sữa",R.drawable.tocotoco));
        restaurantsArrayList.add(new Restaurants("tocotoco","123 phố viên","trà sữa",R.drawable.tocotoco));
        restaurantsArrayList.add(new Restaurants("tocotoco","123 phố viên","trà sữa",R.drawable.tocotoco));
        restaurantsArrayList.add(new Restaurants("tocotoco","123 phố viên","trà sữa",R.drawable.tocotoco));
        restaurantsArrayList.add(new Restaurants("tocotoco","123 phố viên","trà sữa",R.drawable.tocotoco));
        restaurantsArrayList.add(new Restaurants("tocotoco","123 phố viên","trà sữa",R.drawable.tocotoco));
        adapterRestaurants = new AdapterRestaurants(restaurantsArrayList,getContext(),R.layout.item_restaurants);
        rcvRestaurants.setAdapter(adapterRestaurants);

        rcvHightlights = itemView.findViewById(R.id.rcvHighlights);
        rcvHightlights.setHasFixedSize(true);
        rcvHightlights.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
        adapterRestaurants = new AdapterRestaurants(restaurantsArrayList,getContext(),R.layout.item_restaurants);
        rcvHightlights.setAdapter(adapterRestaurants);

//        rcvInteraction = itemView.findViewById(R.id.rcvInteraction);
//        rcvInteraction.setHasFixedSize(true);
//        rcvInteraction.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false));
//        adapterRestaurants = new AdapterRestaurants(restaurantsArrayList,getContext(),R.layout.item_restaurants);
//        rcvInteraction.setAdapter(adapterRestaurants);
//        // Inflate the layout for this fragment
        return itemView;
    }


}
