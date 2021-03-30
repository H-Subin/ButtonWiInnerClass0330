package com.example.buttonwiinnerclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button mButton1, mButton2;
    TextView mtextview1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton1 = findViewById(R.id.button1);
        mButton2 = findViewById(R.id.button2);
        mtextview1 = findViewById(R.id.textView1);

        mButton1.setOnClickListener(new MyOnClickListner());
        mButton2.setOnClickListener(new MyOnClickListner2());

    }

     class MyOnClickListner implements View.OnClickListener {
        @Override
        public void onClick(View v){
            mtextview1.setText("You Clicked SB's button!");
        }

    }

    private class MyOnClickListner2 implements View.OnClickListener {
        @Override
        public void onClick(View v){
            mtextview1.setText("You Clicked my 2nd button!");
        }

    }

}