package com.example.vendor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Map;

public class login extends AppCompatActivity {
    private TextView forget,signupuser;
    private Button authu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        forget=findViewById(R.id.forget);
        signupuser=findViewById(R.id.signupuser);
        authu=findViewById(R.id.authu);
        forget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  Intent forgetpass=new Intent(login.this,forgetpass.class);
                  startActivity(forgetpass);
                  finish();
            }
        });
        signupuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signupus=new Intent(login.this,signup.class);
                startActivity(signupus);
                finish();
            }
        });
        authu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent authucan=new Intent(login.this,authendication.class);
                startActivity(authucan);
                finish();
            }
        });
    }
}