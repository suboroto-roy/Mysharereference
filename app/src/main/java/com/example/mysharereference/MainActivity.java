package com.example.mysharereference;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        SharedPreferences pref=this.getSharedPreferences("TestApp", Activity.MODE_PRIVATE);
        boolean isLogedIN = pref.getBoolean("IS_LOGED_in", false);
        if(isLogedIN){
            Intent i=new Intent(MainActivity.this,HomeActivity.class);
            startActivity(i);
            finish();
        }
        else if(!isLogedIN){
            Intent i=new Intent(MainActivity.this,splashActivity.class);
            startActivity(i);
            finish();
        }
        else {
            Intent i=new Intent(MainActivity.this,Logout.class);
            startActivity(i);
            finish();
        }

    }
}
