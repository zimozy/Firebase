package com.example.tim.firebasechat.ui.activities;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.tim.firebasechat.BuildConfig;
import com.example.tim.firebasechat.R;
import com.example.tim.firebasechat.utils.Constants;
import com.google.firebase.auth.FirebaseAuth;

public class SplashActivity extends AppCompatActivity {
    private static final int SPLASH_TIME_MS = 700;
    private Handler mHandler;
    private Runnable mRunnable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        mHandler = new Handler();

        mRunnable = new Runnable() {
            @Override
            public void run() {
                // check if user is already logged in or not
//                FirebaseUser msg = FirebaseAuth.getInstance().getCurrentUser();
//                if (msg == null) Log.e(Constants.TAG, "NULL");
//                if (BuildConfig.DEBUG) { Log.e(Constants.TAG, "whoops"); }

                if (FirebaseAuth.getInstance().getCurrentUser() != null) {
                    // if logged in redirect the user to user listing activity
                    if (BuildConfig.DEBUG) { Log.e(Constants.TAG, "You're logged in."); }
                    UserListingActivity.startActivity(SplashActivity.this);
                } else {
                    // otherwise redirect the user to login activity
                    if (BuildConfig.DEBUG) { Log.e(Constants.TAG, "You are not logged in."); }
                    LoginActivity.startIntent(SplashActivity.this);
                }
                finish();
            }
        };

        mHandler.postDelayed(mRunnable, SPLASH_TIME_MS);
    }

    /*@Override
    protected void onPause() {
        super.onPause();
        mHandler.removeCallbacks(mRunnable);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mHandler.postDelayed(mRunnable, SPLASH_TIME_MS);
    }*/
}
