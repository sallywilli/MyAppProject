package com.example.myappproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AccountActivity extends AppCompatActivity {

    Button update;
    String str1, str2, str3;
    EditText money1, money2, money3;
    ImageButton logo1, logo2, logo3;
    Integer result;
    TextView total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.title);

        logo1 = findViewById(R.id.logo1);
        logo2 = findViewById(R.id.logo2);
        logo3 = findViewById(R.id.logo3);
        money1 = findViewById(R.id.money1);
        money2 = findViewById(R.id.money2);
        money3 = findViewById(R.id.money3);
        update = findViewById(R.id.update);
        total = findViewById(R.id.total);

        logo1.setOnClickListener(new View.OnClickListener() { //해당 은행 이미지버튼 클릭하면 송금창으로 이동
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SendActivity.class);
                startActivity(intent);
            }
        });
        logo2.setOnClickListener(new View.OnClickListener() {   //해당 은행 이미지버튼 클릭하면 송금창으로 이동
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SendActivity.class);
                startActivity(intent);
            }
        });
        logo3.setOnClickListener(new View.OnClickListener() {   //해당 은행 이미지버튼 클릭하면 송금창으로 이동
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SendActivity.class);
                startActivity(intent);
            }
        });

        MyListen myListen = new MyListen();
        update.setOnTouchListener(myListen);
    }
    class MyListen implements View.OnTouchListener{
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            str1 = money1.getText().toString();
            str2 = money2.getText().toString();
            str3 = money3.getText().toString();
            result = Integer.parseInt(str1) + Integer.parseInt(str2) + Integer.parseInt(str3);
            total.setText("총 계좌 잔액: " + result.toString()); //앞서 금액을 입력하고 업데이트 버튼을 누르면 총 계좌 잔액으로 금액들이 합산되어 보여집니다.
            return false;
        }
    }
}
