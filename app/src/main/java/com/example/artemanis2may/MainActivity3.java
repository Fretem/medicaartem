package com.example.artemanis2may;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main3);
    }

    public void run(View v) {
        Intent intent=new Intent(MainActivity3.this, MainActivity4.class);
        startActivity(intent);
    }
    public void rundalee(View v) {
        Intent intent=new Intent(MainActivity3.this, MainActivity4.class);
        startActivity(intent);
    }
}