package com.example.anonymous.homnayangi;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.zip.Inflater;

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

    private TextView txtNameUser;


    private TextView txtNameUniversity;
    private TextView txtNextActivity;

    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;

    private FirebaseRecyclerAdapter<Restaurants, MyViewHolder> adapter;
    private FirebaseRecyclerOptions<Restaurants> options;


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View itemView = inflater.inflate(R.layout.fragment_home, container, false);
        txtNameUniversity = itemView.findViewById(R.id.txtNameUniversity);
        txtNameUser = itemView.findViewById(R.id.nameUser);
        txtNextActivity = itemView.findViewById(R.id.txtNextActivity);
        txtNextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), FindActivity.class);
                startActivity(intent);
            }
        });

        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference("university");


//
        rcvHightlights = itemView.findViewById(R.id.rcvHighlights);
        rcvHightlights.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        rcvRestaurants = itemView.findViewById(R.id.rcvRestaurants);
        rcvRestaurants.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        displayRestaurants();

        post();


        return itemView;
    }

    private void post() {

    }

    private void displayRestaurants() {
        options = new FirebaseRecyclerOptions.Builder<Restaurants>().setQuery(databaseReference, Restaurants.class).build();
        Log.d("AAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAA");
        adapter = new FirebaseRecyclerAdapter<Restaurants, MyViewHolder>(options) {
            @Override
            protected void onBindViewHolder(@NonNull MyViewHolder holder, int position, @NonNull Restaurants model) {
                holder.txtTitle.setText(model.getTitle());
                holder.txtAddress.setText(model.getAddress());
                Picasso.with(getContext()).load(model.getImage()).into(holder.img);
                Log.d("AAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAA1111A");
            }

            @NonNull
            @Override
            public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_restaurants, parent, false);
                return new MyViewHolder((itemView));
            }
        };
        adapter.startListening();
        rcvRestaurants.setAdapter(adapter);
        rcvHightlights.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }


}
