package com.example.buttonwiinnerclass;

import android.view.View;

public class MyOnClickListner implements View.OnClickListener {
    MainActivity mainActivity;
    public MyOnClickListner(MainActivity mainActivity) {
    }

    @Override
    public void onClick(View v){
        mainActivity.mtextview1.setText("You Clicked SB's button!");
    }

}
