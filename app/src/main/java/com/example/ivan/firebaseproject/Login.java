package com.example.ivan.firebaseproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import models.LoggingUser;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void processLogin(View view){
        String username = ((EditText) findViewById(R.id.usernameRegister)).getText().toString();
        String password = ((EditText) findViewById(R.id.passwordRegister)).getText().toString();
        LoggingUser loggingUser = new LoggingUser(username, password);

    }

    public void goBack(View view){
        Intent goBackIntent = new Intent(view.getContext(), LoginRegister.class);
        startActivityForResult(goBackIntent, 0);
    }

}
