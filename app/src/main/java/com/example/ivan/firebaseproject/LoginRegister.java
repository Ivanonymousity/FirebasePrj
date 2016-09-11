package com.example.ivan.firebaseproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.firebase.client.Firebase;

public class LoginRegister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);
        setTitle("Firebase Application");
        Firebase.setAndroidContext(this);
        Firebase.getDefaultConfig().setPersistenceEnabled(true);
    }

    public void gotoLoginPage(View v){
        Intent myIntent = new Intent(v.getContext(), Login.class);
        startActivityForResult(myIntent, 0);
    }

    public void gotoRegisterPage(View v) {
        Intent myIntent = new Intent(v.getContext(), Register.class);
        startActivityForResult(myIntent, 0);
//        setContentView(R.layout.activity_register);
    }

}
