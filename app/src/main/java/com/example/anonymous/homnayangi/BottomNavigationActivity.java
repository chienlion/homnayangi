package com.example.anonymous.homnayangi;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import model.Restaurants;

public class BottomNavigationActivity extends AppCompatActivity {
    private FrameLayout mainframe;
    private BottomNavigationView mainNav;

    private HomeFragment homeFragment;
    private SavedFragment savedFragment;
    private NotificationsFragment notificationsFragment;
    private AccountFragment accountFragment;


    // activity nó có hàm onCeate, còn fragment là onCreatView
    DatabaseReference mdata;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);
        mainNav = findViewById(R.id.mainNav);
        mainframe = findViewById(R.id.mainFrame);

        homeFragment = new HomeFragment();
        savedFragment = new SavedFragment();
        notificationsFragment = new NotificationsFragment();
        accountFragment = new AccountFragment();
        setFragment(homeFragment);





        mainNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        setFragment(homeFragment);
                        return true;
                    case R.id.navigation_find:
                        setFragment(savedFragment);
                        return true;
                    case R.id.navigation_notifications:
                        setFragment(notificationsFragment);
                        return true;
                    case R.id.navigation_account:
                        setFragment(accountFragment);
                        return true;
                    default:
                        return false;
                }
            }
        });
    }
    public void setFragment(Fragment fragment){
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.mainFrame,fragment);
        ft.commit();
    }


}
