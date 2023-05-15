package com.example.artemanis2may;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Parol extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parol);
    }
    public void run(View v) {
        Intent intent=new Intent(Parol.this, karta.class);
        startActivity(intent);
    }
}