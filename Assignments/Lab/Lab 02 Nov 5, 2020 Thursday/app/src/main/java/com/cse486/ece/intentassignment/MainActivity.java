package com.cse486.ece.intentassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button1);
        button.setBackgroundColor(Color.GREEN);
        editText = findViewById(R.id.editText1);

    }

    public void show(View view) {





        Intent intent = new Intent(getApplicationContext(),HelloWorldActivity.class);
        String s = editText.getText().toString();
        intent.putExtra("passValueToAnotherActivity",s);
        startActivity(intent);
        finish();

    }
}