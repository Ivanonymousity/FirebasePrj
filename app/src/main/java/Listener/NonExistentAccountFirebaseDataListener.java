package Listener;

import android.support.v7.app.AppCompatActivity;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.Query;
import com.firebase.client.ValueEventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import models.LoggingUser;
import models.User;

/**
 * Created by Ivan on 9/11/2016.
 */
public abstract class NonExistentAccountFirebaseDataListener implements ValueEventListener {
    private LoggingUser loggingUser;
    private AppCompatActivity appCompatActivity;
    private String type;

    public NonExistentAccountFirebaseDataListener(String type, LoggingUser loggingUser, AppCompatActivity appCompatActivity){
        this.loggingUser = loggingUser;
        this.type = type;
    }

    @Override
    public void onDataChange(DataSnapshot snapshot) {
//        Map<String, String> users = (List<User>)snapshot.getValue();
//        if(users != null){
//            String databaseURL = "https://fir-practice-62dca.firebaseio.com/android/practice";
//            Firebase ref = new Firebase(databaseURL);
//            Query query = ref.child("users").child()
//        }
    }
    @Override
    public void onCancelled(FirebaseError firebaseError) {
//        System.out.println("The read failed: " + firebaseError.getMessage());
    }

}
