package com.example.artemanis2may;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Parol extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_parol);
    }
    public void run(View v) {
        Intent intent=new Intent(Parol.this, karta.class);
        startActivity(intent);
    }
    //ImageButton one = (ImageButton) findViewById(R.id.imageButton3) ;
    //ImageButton two = (ImageButton) findViewById(R.id.imageButton4) ;
    //ImageButton three = (ImageButton) findViewById(R.id.imageButton5) ;
    //ImageButton fore = (ImageButton) findViewById(R.id.imageButton10) ;
    //ImageButton five = (ImageButton) findViewById(R.id.imageButton6) ;
    //ImageButton six = (ImageButton) findViewById(R.id.imageButton7) ;
    //ImageButton seven = (ImageButton) findViewById(R.id.imageButton8) ;
    //ImageButton eight = (ImageButton) findViewById(R.id.imageButton12) ;
    //ImageButton nine = (ImageButton) findViewById(R.id.imageButton9) ;
    //ImageButton zero = (ImageButton) findViewById(R.id.imageButton11) ;










}