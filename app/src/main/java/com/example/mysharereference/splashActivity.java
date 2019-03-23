package com.example.mysharereference;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        final SharedPreferences pref=this.getSharedPreferences("TestApp", Activity.MODE_PRIVATE);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(splashActivity.this,HomeActivity.class);
                startActivity(i);

                pref.edit().putBoolean("IS_LOGED_in",true).apply();
                finish();
            }
        } ,5000);
    }
}
