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

public class Button3 extends ThirdActivity{

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

        check1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
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
        check2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
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
        complete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "카드 추가가 완료되었습니다",
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
