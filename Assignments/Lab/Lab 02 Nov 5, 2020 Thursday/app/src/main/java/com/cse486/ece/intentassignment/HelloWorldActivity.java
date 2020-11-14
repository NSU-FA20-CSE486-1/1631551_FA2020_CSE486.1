package com.cse486.ece.intentassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HelloWorldActivity extends AppCompatActivity {

    private TextView textView;
    private Button btn;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);

        textView = findViewById(R.id.textView1);
        btn = findViewById(R.id.button2);
        btn.setBackgroundColor(Color.RED);

        String s1 = getIntent().getExtras().getString("passValueToAnotherActivity");
        textView.setText(s1);




    }

    public void goBack(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}