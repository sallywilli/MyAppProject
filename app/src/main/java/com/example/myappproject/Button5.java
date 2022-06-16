package com.example.myappproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;

public class Button5 extends ThirdActivity{

    Button finish;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {  //third.xml에 있는 다섯번째 버튼인 btn5을 누르면 btn5.xml 화면으로 이동합니다.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.btn5);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.title);

        finish = findViewById(R.id.finish);

        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(Button5.this);
                dlg.setTitle("회원탈퇴");   //메시지 창 제목 설정
                dlg.setMessage("이용해주셔서 감사합니다");     //탈퇴하기 버튼 클릭 시 메시지 창이 뜹니다
                dlg.setIcon(R.drawable.title);
                dlg.setPositiveButton("확인", null);
                dlg.show();
            }
        });
    }
}
