package com.example.ivan.firebaseproject;

import android.support.v7.app.AppCompatActivity;

import com.firebase.client.Firebase;

import Listener.ExistingAccountFirebaseDataListener;
import models.User;

/**
 * Created by Ivan on 9/11/2016.
 */
public class RegisterController {

    private User user;
    private AppCompatActivity appCompatActivity;

    public RegisterController(User user, AppCompatActivity appCompatActivity){
        this.user = user;
        this.appCompatActivity = appCompatActivity;
    }

    public void queryRegister(){
        String databaseURL = "https://fir-practice-62dca.firebaseio.com/android/practice";
        Firebase ref = new Firebase(databaseURL);
        String username = "users";
        ref.child(username).child(user.getUsername()).addListenerForSingleValueEvent(
                new ExistingAccountFirebaseDataListener(user, username, appCompatActivity){});
    }
}
