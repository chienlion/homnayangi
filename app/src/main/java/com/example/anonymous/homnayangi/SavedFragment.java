package com.example.anonymous.homnayangi;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

import model.Restaurants;


/**
 * A simple {@link Fragment} subclass.
 */
public class SavedFragment extends Fragment {
    private RecyclerView rcvSaved;
    private ArrayList<Restaurants> list;
    //    private AdapterSaved adapterSaved;
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;
    private FirebaseRecyclerOptions<Restaurants> options;
    private FirebaseRecyclerAdapter<Restaurants, MyViewHolder> adapter;


    public SavedFragment() {
        // Required empty public constructor


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();


        View itemView = inflater.inflate(R.layout.fragment_saved, container, false);
        rcvSaved = itemView.findViewById(R.id.rcvSaved);

//        options = new FirebaseRecyclerOptions.Builder<Restaurants>().setQuery()

//        adapter = new FirebaseRecyclerAdapter<Restaurants, MyViewHolder>() {
//            @Override
//            protected void onBindViewHolder(@NonNull MyViewHolder holder, int position, @NonNull Restaurants model) {
//
//            }
//
//            @NonNull
//            @Override
//            public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//                return null;
//            }
//        };


        return itemView;


    }


}
