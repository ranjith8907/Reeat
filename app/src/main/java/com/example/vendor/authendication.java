package com.example.vendor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class authendication extends AppCompatActivity {
    private Button livetra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authendication);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        livetra=findViewById(R.id.livetra);
        livetra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent live=new Intent(authendication.this,Livetracking.class);
                startActivity(live);
                finish();
            }
        });
    }
}