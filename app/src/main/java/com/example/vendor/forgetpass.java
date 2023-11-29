package com.example.vendor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class forgetpass extends AppCompatActivity {
    private Button newpass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgetpass);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        newpass=findViewById(R.id.newpass);
        newpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newpa=new Intent(forgetpass.this,NewPassword.class);
                startActivity(newpa);
                finish();
            }
        });
    }
}