package com.example.ivan.firebaseproject;

import android.support.v7.app.AppCompatActivity;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.Query;

import Listener.NonExistentAccountFirebaseDataListener;
import models.LoggingUser;
import models.User;

/**
 * Created by Ivan on 9/11/2016.
 */
public class LoginController {
    private LoggingUser user;
    private AppCompatActivity appCompatActivity;

    public LoginController(LoggingUser user, AppCompatActivity appCompatActivity) {
        this.user = user;
        this.appCompatActivity = appCompatActivity;
    }

    public void validateLogin(){
        String databaseURL = "https://fir-practice-62dca.firebaseio.com/android/practice";
        Firebase ref = new Firebase(databaseURL);
        Query query = ref.orderByChild("users").equalTo(user.getUsername());
        query.addListenerForSingleValueEvent(new NonExistentAccountFirebaseDataListener("account", user, appCompatActivity){});
    }
}
