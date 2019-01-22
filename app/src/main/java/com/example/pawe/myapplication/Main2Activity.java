package com.example.pawe.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        if (savedInstanceState != null) {
            String message = intent.getStringExtra(MainActivity.MESSAGE);
            ((TextView) findViewById(R.id.textView2)).setText(message);
        }
    }
}
