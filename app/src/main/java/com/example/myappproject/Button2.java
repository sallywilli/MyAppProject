package com.example.myappproject;

import android.os.Bundle;

import androidx.annotation.Nullable;

public class Button2 extends ThirdActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.btn2);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.title);
    }
}
