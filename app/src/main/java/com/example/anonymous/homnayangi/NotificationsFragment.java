package com.example.anonymous.homnayangi;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import adapter.AdapterNotifications;
import model.Restaurants;


/**
 * A simple {@link Fragment} subclass.
 */
public class NotificationsFragment extends Fragment {
    private RecyclerView rcvNotifications;
    private ArrayList<Restaurants> restaurantsArrayList;
    private AdapterNotifications adapterNotifications;


    public NotificationsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View itemView = inflater.inflate(R.layout.fragment_notifications, container, false);
        rcvNotifications = itemView.findViewById(R.id.rcvNotifications);
        rcvNotifications.setHasFixedSize(true);
        rcvNotifications.setLayoutManager(new LinearLayoutManager(getContext()));
        restaurantsArrayList = new ArrayList<>();
        restaurantsArrayList.add(new Restaurants("TocoToco","123 phố viên",R.drawable.tocotoco,"50%","15/9","19/9"));
        restaurantsArrayList.add(new Restaurants("TocoToco","123 phố viên",R.drawable.tocotoco,"50%","15/9","19/9"));
        restaurantsArrayList.add(new Restaurants("TocoToco","123 phố viên",R.drawable.tocotoco,"50%","15/9","19/9"));
        restaurantsArrayList.add(new Restaurants("TocoToco","123 phố viên",R.drawable.tocotoco,"50%","15/9","19/9"));
        restaurantsArrayList.add(new Restaurants("TocoToco","123 phố viên",R.drawable.tocotoco,"50%","15/9","19/9"));
        restaurantsArrayList.add(new Restaurants("TocoToco","123 phố viên",R.drawable.tocotoco,"50%","15/9","19/9"));
        restaurantsArrayList.add(new Restaurants("TocoToco","123 phố viên",R.drawable.tocotoco,"50%","15/9","19/9"));
        restaurantsArrayList.add(new Restaurants("TocoToco","123 phố viên",R.drawable.tocotoco,"50%","15/9","19/9"));
        restaurantsArrayList.add(new Restaurants("TocoToco","123 phố viên",R.drawable.tocotoco,"50%","15/9","19/9"));
        restaurantsArrayList.add(new Restaurants("TocoToco","123 phố viên",R.drawable.tocotoco,"50%","15/9","19/9"));
        restaurantsArrayList.add(new Restaurants("TocoToco","123 phố viên",R.drawable.tocotoco,"50%","15/9","19/9"));
        restaurantsArrayList.add(new Restaurants("TocoToco","123 phố viên",R.drawable.tocotoco,"50%","15/9","19/9"));
        restaurantsArrayList.add(new Restaurants("TocoToco","123 phố viên",R.drawable.tocotoco,"50%","15/9","19/9"));
        restaurantsArrayList.add(new Restaurants("TocoToco","123 phố viên",R.drawable.tocotoco,"50%","15/9","19/9"));

        adapterNotifications = new AdapterNotifications(restaurantsArrayList,getContext(),R.layout.item_notifications);
        rcvNotifications.setAdapter(adapterNotifications);
        // Inflate the layout for this fragment
        return itemView;
    }

}
