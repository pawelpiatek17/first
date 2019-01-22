package com.example.pawe.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessageOnClick(View view) {
        Intent intent = new Intent(this,Main2Activity.class);
        intent.putExtra(MESSAGE,((EditText)findViewById(R.id.editText)).getText().toString());
        startActivity(intent);
    }
}
