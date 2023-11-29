package com.example.vendor;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.EmojiCompatConfigurationView;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewPassword extends AppCompatActivity {
    private Button movelogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_password);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        movelogin=findViewById(R.id.movelogin);
        movelogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent move=new Intent(NewPassword.this,login.class);
                startActivity(move);
                finish();
            }
        });
    }
}