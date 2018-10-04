package com.example.anonymous.homnayangi;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import model.Restaurants;


/**
 * A simple {@link Fragment} subclass.
 */
public class SavedFragment extends Fragment {
    private ListView lvSaved;
    private ArrayList<Restaurants> list;
//    private AdapterSaved adapterSaved;


    public SavedFragment() {
        // Required empty public constructor



    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View itemView = inflater.inflate(R.layout.fragment_saved, container, false);

        lvSaved = itemView.findViewById(R.id.lvSaved);
        list = new ArrayList<>();

        list.add(new Restaurants("StarBuck Reserve","Asia Tower 6","Caffe/Dessert",R.drawable.imgavatar,"3 ngay truoc"));

//        adapterSaved = new AdapterSaved(getContext(),R.layout.item_saved,list);
//        lvSaved.setAdapter(adapterSaved);



        return itemView;


    }



}
