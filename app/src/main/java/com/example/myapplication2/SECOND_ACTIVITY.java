package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SECOND_ACTIVITY extends AppCompatActivity {
TextView receiver_msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        receiver_msg=(TextView)findViewById(R.id.textView);
        Intent intent=getIntent();
        String str=intent.getStringExtra("message_key");
        receiver_msg.setText("Hello "+str+" !");
    }
}