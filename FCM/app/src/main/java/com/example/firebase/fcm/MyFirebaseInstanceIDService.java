package com.example.firebase.fcm;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by tim on 9/28/17.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {

    private static final String TAG = "MyFBInstanceIDService";

    @Override
    public void onTokenRefresh() {
        // Get updated token
        String regreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "New Token: " + regreshedToken);
    }
}
