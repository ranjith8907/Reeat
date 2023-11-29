package com.example.vendor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class signup extends AppCompatActivity {
    private TextView loginuser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        loginuser=findViewById(R.id.loginuser);
        loginuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loginus=new Intent(signup.this,login.class);
                startActivity(loginus);
                finish();
            }
        });
    }
}