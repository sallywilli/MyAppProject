package com.example.myappproject;

import android.os.Bundle;

import androidx.annotation.Nullable;

public class Button2 extends ThirdActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {  //third.xml에 있는 두번째 버튼인 btn2을 누르면 btn2.xml 화면으로 이동합니다.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.btn2);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.title);
    }
}
