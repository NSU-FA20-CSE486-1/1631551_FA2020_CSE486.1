package com.example.happybirthdaytosomeone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String p = "Faysal";

        if(p.equals(null)){

            Log.e("MainActivity onCreate","p is missing");
        }
        else{
            Log.d("MainActivity onCreate","Wish printed");
        }
        Log.e("happy_birthday","You forgot the date");
    }
}