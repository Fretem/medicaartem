package com.example.artemanis2may;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class vhodandregistrachia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_vhodandregistrachia);
    }
    public void run(View v) {
        Intent intent=new Intent(vhodandregistrachia.this, yandex.class);
        startActivity(intent);
    }
    public void run1(View v) {
        Intent intent=new Intent(vhodandregistrachia.this, Parol.class);
        startActivity(intent);
    }
}