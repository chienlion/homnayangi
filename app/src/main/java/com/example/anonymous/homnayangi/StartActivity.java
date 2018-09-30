package com.example.anonymous.homnayangi;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
        try {
            PackageInfo info = getPackageManager().getPackageInfo("com.example.anonymous.testloginwithfacebook", PackageManager.GET_SIGNATURES);
            for(Signature signature : info.signatures){
                MessageDigest md = MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                Log.d("KEYHASH", Base64.encodeToString(md.digest(),Base64.DEFAULT));
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

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
