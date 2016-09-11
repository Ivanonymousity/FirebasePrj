package Listener;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;

/**
 * Created by Ivan on 9/11/2016.
 */
public abstract class InsertedFirebaseDataListener implements Firebase.CompletionListener{
    private Context androidContext;

    public InsertedFirebaseDataListener(Context androidContext){
        this.androidContext = androidContext;
        Log.e("complete", "centrum");
    }

    @Override
    public void onComplete(FirebaseError firebaseError, Firebase firebase){
        if (firebaseError != null) {
            Toast.makeText(androidContext, "Data could not be saved. " + firebaseError.getMessage(), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(androidContext, "Data saved. ", Toast.LENGTH_SHORT).show();
        }

    }
}
