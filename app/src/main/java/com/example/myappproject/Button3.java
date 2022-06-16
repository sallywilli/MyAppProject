package com.example.myappproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Button3 extends ThirdActivity{ //third.xml에 있는 세번째 버튼인 btn3을 누르면 btn3.xml 화면으로 이동합니다.

    Button complete;
    CheckBox check1, check2;
    DatePicker dp;
    TextView tv, tv2;
    EditText et;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.btn3);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.title);

        complete = findViewById(R.id.complete);
        check1 = findViewById(R.id.check1);
        check2 = findViewById(R.id.check2);
        dp = findViewById(R.id.dp);
        tv = findViewById(R.id.tv);
        tv2 = findViewById(R.id.tv2);
        et = findViewById(R.id.et);

        check1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        check1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {    //체크박스1 클릭 시 안 보이도록 해 놓은 텍스트뷰와 에디트텍스트가 보입니다
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b == true){
                    tv.setVisibility(View.VISIBLE);
                    tv2.setVisibility(View.VISIBLE);
                    dp.setVisibility(View.VISIBLE);
                    et.setVisibility(View.VISIBLE);
                }
                else{
                    tv.setVisibility(View.INVISIBLE);
                    tv2.setVisibility(View.INVISIBLE);
                    dp.setVisibility(View.INVISIBLE);
                    et.setVisibility(View.INVISIBLE);
                }
            }
        });
        check2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {    //체크박스2 클릭 시 안 보이도록 해 놓은 텍스트뷰와 에디트텍스트가 보입니다
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b == true){
                    tv.setVisibility(View.VISIBLE);
                    tv2.setVisibility(View.VISIBLE);
                    dp.setVisibility(View.VISIBLE);
                    et.setVisibility(View.VISIBLE);
                }
                else{
                    tv.setVisibility(View.INVISIBLE);
                    tv2.setVisibility(View.INVISIBLE);
                    dp.setVisibility(View.INVISIBLE);
                    et.setVisibility(View.INVISIBLE);
                }
            }
        });
        complete.setOnClickListener(new View.OnClickListener() {    //완료 버튼 클릭 시 카드 추가 완료 문구로 토스트가 뜹니다
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "카드 추가가 완료되었습니다",
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
