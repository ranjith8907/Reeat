package com.example.vendor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class usersign extends AppCompatActivity {
    private Button login,createnew;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usersign);
        //getSupportActionBar().hide();
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        login=findViewById(R.id.login);
        createnew=findViewById(R.id.createnew);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next=new Intent(usersign.this,login.class);
                startActivity(next);
            }
        });
        createnew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signup1=new Intent(usersign.this,signup.class);
                startActivity(signup1);
            }
        });
    }
}