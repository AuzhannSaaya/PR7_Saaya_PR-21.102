package com.example.mdk_7_saaya_pr_21_102;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        TextView tv = (TextView) findViewById(R.id.txtName);
        tv.setText(Globals.username + ",");
    }

    public void goToChats(View view) {
        Intent intent = new Intent(this, Chats.class);
        startActivity(intent);
    }
}