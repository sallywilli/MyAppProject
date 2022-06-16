package com.example.myappproject;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SendActivity2 extends AppCompatActivity {
    String str4;
    EditText e1;
    Button ok;
    Integer result2;
    TextView total2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.send2);     //send2.xml 화면이 보여짐
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.title);
        ok = findViewById(R.id.ok);
        e1 = findViewById(R.id.e1);
        total2 = findViewById(R.id.total2);

        ok.setOnTouchListener(new View.OnTouchListener() {      //확인 버튼 클릭 시
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                str4 = e1.getText().toString();    
                result2 = 600000 - Integer.parseInt(str4);      //계좌 총액을 6만원이라고 가정했을 때, 에디트텍스트에 입력받은 금액만큼 삭감함
                total2.setText("잔액: " + result2.toString());        //송금 이후 남은 잔액이 보여짐

                Toast.makeText(getApplicationContext(), "송금이 완료되었습니다",      //송금 완료 토스트
                        Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }
}
