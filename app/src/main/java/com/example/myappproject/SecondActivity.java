package com.example.myappproject;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    Button insert;
    View dialogView;
    EditText et1, et2, et3, et4, et5, et6;
    TextView t1, t2, t3, t4, t5, t6;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.title);

        insert = findViewById(R.id.insert);
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t4 = findViewById(R.id.t4);
        t5 = findViewById(R.id.t5);
        t6 = findViewById(R.id.t6);

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogView = View.inflate(SecondActivity.this, R.layout.second, null);
                AlertDialog.Builder dlg = new AlertDialog.Builder(SecondActivity.this);
                dlg.setTitle("내 정보 입력");
                dlg.setIcon(R.drawable.icon);
                dlg.setView(dialogView);
                dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        et1 = dialogView.findViewById(R.id.et1);
                        et2 = dialogView.findViewById(R.id.et2);
                        et3 = dialogView.findViewById(R.id.et3);
                        et4 = dialogView.findViewById(R.id.et4);
                        et5 = dialogView.findViewById(R.id.et5);
                        et6 = dialogView.findViewById(R.id.et6);
                        t1.setText("이름: " + et1.getText().toString());
                        t2.setText("생년월일: " + et2.getText().toString());
                        t3.setText("이메일: " + et3.getText().toString());
                        t4.setText("전화번호: " + et4.getText().toString());
                        t5.setText("집 주소: " + et5.getText().toString());
                        t6.setText("집 전화번호: " + et6.getText().toString());
                    }
                });
                dlg.setNegativeButton("취소", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast toast = new Toast(SecondActivity.this);
                        toast.setText("취소했습니다");
                        toast.show();
                    }
                });
                dlg.show();
            }
        });
    }
}
