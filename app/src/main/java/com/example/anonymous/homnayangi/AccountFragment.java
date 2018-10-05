package com.example.anonymous.homnayangi;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.facebook.login.LoginManager;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

//TODO : Xử lý khi không có mạng mà vẫn đăng xuất được

/**
 * A simple {@link Fragment} subclass.
 */
public class AccountFragment extends Fragment {
    private Button btnLogOut;
    private FirebaseAuth mFirebaseAuth;


    public AccountFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View itemView = inflater.inflate(R.layout.fragment_account, container, false);
        mFirebaseAuth = FirebaseAuth.getInstance();
        btnLogOut = itemView.findViewById(R.id.btnLogout);
        btnLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mFirebaseAuth.signOut();
                LoginManager.getInstance().logOut();
                updateUI();

            }
        });
        return itemView;
    }
//    @Override
//    public void onStart() {
//        super.onStart();
//        // Check if user is signed in (non-null) and update UI accordingly.
//        FirebaseUser currentUser = mFirebaseAuth.getCurrentUser();
//        Log.d("AAAAAAAAAAA",currentUser.toString());
//        if(currentUser==null){
//            updateUI();
//        }
//
//    }

    private void updateUI() {
        Toast.makeText(getContext(), "Đã đăng xuất", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getContext(), LoginWithFbActivity.class);
        startActivity(intent);
    }

}
