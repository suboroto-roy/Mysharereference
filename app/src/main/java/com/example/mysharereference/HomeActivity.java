package com.example.mysharereference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;

    private Button Login;
    private Button Reg;
    private int counter=5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Name=(EditText)findViewById(R.id.etName);
        Password=(EditText)findViewById(R.id.etPassword);
        Login=(Button)findViewById(R.id.btnLogin);
        Reg=(Button)findViewById(R.id.Regbutton);
        Reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent i=new Intent(HomeActivity.this,REG.class);
               startActivity(i);
            }
        });

        Login.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                 validate(Name.getText().toString(), Password.getText().toString());
            }
        });
    }
    private void validate(String userName,String userPassword){
        if((userName.equals("subroto" ))&& (userPassword.equals("1234"))){
            Intent intent=new Intent(HomeActivity.this,Logout.class);
            startActivity(intent);

        }
        else{
            counter--;
            if(counter==0){
                Login.setEnabled(false);
            }

        }
    }
}
