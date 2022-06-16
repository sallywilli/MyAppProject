package com.example.myappproject;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InformActivity extends MainActivity{

    Button inform;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.insurance); //insurance.xml 화면(보험창)을 보여줍니다.

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.title);

        inform = findViewById(R.id.inform);

        inform.setOnClickListener(new View.OnClickListener() {  //inform 버튼 클릭 시
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/1599-9999"));    //해당 전화번호 다이얼로 이동
                startActivity(intent);
            }
        });
    }
}
