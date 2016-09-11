package com.example.ivan.firebaseproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.firebase.client.Firebase;

import models.User;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void proceedRegister(View view){
        String username = ((EditText) findViewById(R.id.usernameRegister)).getText().toString();
        String name = ((EditText) findViewById(R.id.nameRegister)).getText().toString();
        String password = ((EditText) findViewById(R.id.passwordRegister)).getText().toString();

        RegisterController registerController = new RegisterController(new User(username, name, password), this);
        registerController.queryRegister();
    }

    public void goBack(View view){
        Intent goBackIntent = new Intent(view.getContext(), LoginRegister.class);
        startActivityForResult(goBackIntent, 0);
    }
}
