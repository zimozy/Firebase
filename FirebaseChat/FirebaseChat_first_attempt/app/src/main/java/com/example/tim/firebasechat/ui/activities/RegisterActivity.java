package com.example.tim.firebasechat.ui.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.tim.firebasechat.R;
import com.example.tim.firebasechat.ui.fragments.RegisterFragment;

/**
 * Created by tim on 9/19/17.
 */

public class RegisterActivity extends AppCompatActivity {
    private Toolbar mToolbar;

    public static void startActivity(Context context) {
        Intent intent = new Intent(context, RegisterActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        bindViews();
        init();
    }

    private void bindViews() { mToolbar = (Toolbar) findViewById(R.id.toolbar); }

    private void init() {
        setSupportActionBar(mToolbar);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout_content_register,
                RegisterFragment.newInstance(),
                RegisterFragment.class.getSimpleName());
        fragmentTransaction.commit();
    }

}
