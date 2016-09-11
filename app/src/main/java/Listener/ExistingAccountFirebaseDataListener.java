package Listener;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.example.ivan.firebaseproject.R;
import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;

import models.User;

/**
 * Created by Ivan on 9/11/2016.
 */
public abstract class ExistingAccountFirebaseDataListener implements ValueEventListener {
    private AppCompatActivity appCompatActivity;
    private String type;
    private User user;

    public ExistingAccountFirebaseDataListener(User user, String type, AppCompatActivity appCompatActivity ){
        this.type = type;
        this.appCompatActivity = appCompatActivity;
        this.user = user;
    }

    @Override
    public void onDataChange(DataSnapshot snapshot){
        Context context = appCompatActivity.getApplicationContext();
        if(snapshot.exists()){
            Toast.makeText(context, "The username " + snapshot.getKey() + " already exists.", Toast.LENGTH_SHORT).show();
        }
        else{
            String databaseURL = "https://fir-practice-62dca.firebaseio.com/android/practice";
            Firebase newUserRef = new Firebase(databaseURL).child("users").child(user.getUsername());
            newUserRef.setValue(user, new InsertedFirebaseDataListener(context) {});
            appCompatActivity.setContentView(R.layout.activity_front);
            appCompatActivity.finish();
        }
    }

    @Override
    public void onCancelled(FirebaseError firebaseError) {

    }

}
