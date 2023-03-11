package com.example.clicer10;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import  java.lang.CharSequence;

public class MainActivity extends AppCompatActivity {
    Integer counter = 0;
    private static final String KEY_COUNT = "counter";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView)findViewById(R.id.txt_counter);
        if (savedInstanceState != null) {
            counter = savedInstanceState.getInt(KEY_COUNT, 1);
        }
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_COUNT, counter);
    }
        @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        counter = savedInstanceState.getInt(KEY_COUNT);
    }
    public void Click (View view){
        counter++;
        TextView text = (TextView)findViewById(R.id.txt_counter);
        text.setText(counter.toString());
    }
    public void onClickButton (View view){
        counter = 0;
        TextView text = findViewById(R.id.txt_counter);
        text.setText(counter.toString());
    }
}
