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
        setContentView(R.layout.send2);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.title);
        ok = findViewById(R.id.ok);
        e1 = findViewById(R.id.e1);
        total2 = findViewById(R.id.total2);

        ok.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                str4 = e1.getText().toString();
                result2 = 600000 - Integer.parseInt(str4);
                total2.setText("잔액: " + result2.toString());

                Toast.makeText(getApplicationContext(), "송금이 완료되었습니다",
                        Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }
}
