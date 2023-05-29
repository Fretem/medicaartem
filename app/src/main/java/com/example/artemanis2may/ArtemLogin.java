package com.example.artemanis2may;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ArtemLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_artem_login);
    }
}