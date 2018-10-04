package com.example.anonymous.homnayangi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

public class LoginWithFbActivity extends AppCompatActivity {
    CallbackManager callbackManager;
    LoginButton loginButton;
    LoginManager loginManager;
    OnClickSetName onClickSetName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_with_fb);
        callbackManager = CallbackManager.Factory.create();
        addControls();
        if (AccessToken.getCurrentAccessToken() != null) {
            Intent intent = new Intent(LoginWithFbActivity.this, BottomNavigationActivity.class);
            startActivity(intent);
            finish();
        }

    }

    public void setOnClickSetName(OnClickSetName onClickSetName) {
        this.onClickSetName = onClickSetName;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        callbackManager.onActivityResult(requestCode, resultCode, data);
        super.onActivityResult(requestCode, resultCode, data);
    }

    private void addControls() {
        loginButton = (LoginButton) findViewById(R.id.login_button);
        loginButton.setReadPermissions("email");

        // Callback registration
        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                // App code
                Intent intent = new Intent(LoginWithFbActivity.this, BottomNavigationActivity.class);
                startActivity(intent);
                finish();
            }

            @Override
            public void onCancel() {
                // App code
            }

            @Override
            public void onError(FacebookException exception) {
                // App code
            }
        });
        callbackManager = CallbackManager.Factory.create();

        LoginManager.getInstance().registerCallback(callbackManager,
                new FacebookCallback<LoginResult>() {
                    @Override
                    public void onSuccess(LoginResult loginResult) {
                        // App code
                        Intent intent = new Intent(LoginWithFbActivity.this, BottomNavigationActivity.class);
                        startActivity(intent);
                    }

                    @Override
                    public void onCancel() {
                        // App code
                    }

                    @Override
                    public void onError(FacebookException exception) {
                        // App code
                    }
                });
    }

}
