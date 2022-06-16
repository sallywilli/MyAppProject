package com.example.myappproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third);     //third.xml 화면이 보여짐

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.title);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);

        btn1.setOnClickListener(new View.OnClickListener() {    //버튼1 클릭 시 화면 전환
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Button1.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {     //버튼2 클릭 시 화면 전환
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Button2.class);
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {     //버튼3 클릭 시 화면 전환
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Button3.class);
                startActivity(intent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {     //버튼4 클릭 시 다이얼로그 팝업
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(ThirdActivity.this);
                dlg.setTitle("앱 버전");  //다이얼로그 제목
                dlg.setMessage("최신버전입니다");  //버전 정보 보여줌
                dlg.setIcon(R.drawable.title);
                dlg.setPositiveButton("확인", null);
                dlg.show();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {     //버튼5 클릭 시 화면 전환
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Button5.class);
                startActivity(intent);
            }
        });
    }
}
