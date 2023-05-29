package com.example.artemanis2may;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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
   // Button one = (Button) findViewById(R.id.button3) ;
    //Button two = (Button) findViewById(R.id.button4) ;
   // Button fore = (Button) findViewById(R.id.button10) ;
   // Button five = (Button) findViewById(R.id.button6)  ;
   // Button six = (Button) findViewById(R.id.button7) ;
   // Button seven = (Button) findViewById(R.id.button8) ;
  //  Button eight = (Button) findViewById(R.id.button12) ;
  //  Button nine = (Button) findViewById(R.id.button9);
   // Button zero = (Button) findViewById(R.id.button11);


}