package com.example.mdk_7_saaya_pr_21_102;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        //Button button = (Button)findViewById(R.id.btnRegister);
        //button.setOnClickListener(registerClicked);
    }

    public void registerClicked(View view) {
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }
}