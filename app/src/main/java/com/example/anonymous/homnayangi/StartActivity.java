package com.example.anonymous.homnayangi;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import java.util.ArrayList;

public class StartActivity extends AppCompatActivity {
    private String[] arrayList;
    private AutoCompleteTextView autoUniversity;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        autoUniversity = findViewById(R.id.autoUniversity);
        arrayList = getResources().getStringArray(R.array.arrayUniversity);
        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arrayList);
        autoUniversity.setAdapter(adapter);

    }

    public void findRestaurants(View view) {
        String university = autoUniversity.getText().toString();
        if(university.equals("")){
            Toast.makeText(this, "bạn chưa nhập", Toast.LENGTH_SHORT).show();
        }else{
            Intent intent = new Intent(StartActivity.this,BottomNavigationActivity.class);
            startActivity(intent);
        }
    }




}
