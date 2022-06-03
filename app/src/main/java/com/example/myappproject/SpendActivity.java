package com.example.myappproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

public class SpendActivity extends AppCompatActivity {

    DatePicker dp;
    EditText et;
    Button btn;
    String filename;
    TextView now;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spend);
        setTitle("소비 기록");

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.title);

        dp = findViewById(R.id.dp);
        et = findViewById(R.id.et);
        btn = findViewById(R.id.btn);
        now = findViewById(R.id.now);

        Calendar sss = Calendar.getInstance();
        int cy = sss.get(Calendar.YEAR);
        int cm = sss.get(Calendar.MONTH);
        int cd = sss.get(Calendar.DAY_OF_MONTH);
        dp.init(cy, cm, cd, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker datePicker, int i, int i1, int i2) {
                filename = Integer.toString(i)+"_"+Integer.toString(i1+1)+"_"+Integer.toString(i2)+".txt";
                String str = readDiary(filename);
                et.setText(str);
                btn.setEnabled(true);
            }
        });

        btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                try{
                    FileOutputStream outFs = openFileOutput(filename, Context.MODE_PRIVATE);
                    String str = et.getText().toString();
                    now.setText("   " + str + "원을 소비했습니다");
                    outFs.write(str.getBytes());
                    outFs.close();
                    Toast.makeText(getApplicationContext(), filename+"이 저장됨", Toast.LENGTH_LONG).show();
                } catch (IOException e){
                    e.printStackTrace();
                }
                return false;
            }
        });
    }
    public String readDiary(String filename){
        String diaryStr = null;
        try{
            FileInputStream inFs = openFileInput(filename);
            byte[] txt = new byte[100];
            inFs.read(txt);
            inFs.close();
            String str = new String(txt);
            diaryStr = str.trim();
            btn.setText("수정하기");
        } catch (IOException e){
            et.setHint("일기 없음");
            btn.setText("새로 저장");
        }
        return diaryStr;
    }
}