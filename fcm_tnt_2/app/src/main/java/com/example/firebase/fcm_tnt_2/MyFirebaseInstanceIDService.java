package com.example.firebase.fcm_tnt_2;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by tim on 9/29/17.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {

    private static String TAG = "Registration";

    @Override
    public void onTokenRefresh() {
        //get upd instaceid token
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token: " + refreshedToken);
        //TODO: implement this method to send any registration to your app's servers
        Log.d(TAG, "onTokenRefresh: " + refreshedToken);
    }
}
