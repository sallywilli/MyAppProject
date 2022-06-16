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
        setContentView(R.layout.spend);     //spend.xml 화면이 보여짐
        setTitle("소비 기록");

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.title);

        dp = findViewById(R.id.dp);
        et = findViewById(R.id.et);
        btn = findViewById(R.id.btn);
        now = findViewById(R.id.now);

        Calendar sss = Calendar.getInstance();     //캘린더
        int cy = sss.get(Calendar.YEAR);
        int cm = sss.get(Calendar.MONTH);
        int cd = sss.get(Calendar.DAY_OF_MONTH);
        dp.init(cy, cm, cd, new DatePicker.OnDateChangedListener() {       //데이트 피커 기능
            @Override
            public void onDateChanged(DatePicker datePicker, int i, int i1, int i2) {
                filename = Integer.toString(i)+"_"+Integer.toString(i1+1)+"_"+Integer.toString(i2)+".txt";      //해당 내용이 텍스트파일에 저장되도록 파일 이름 설정
                String str = readDiary(filename);
                et.setText(str);
                btn.setEnabled(true);
            }
        });

        btn.setOnTouchListener(new View.OnTouchListener() { //버튼 클릭 시 
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                try{
                    FileOutputStream outFs = openFileOutput(filename, Context.MODE_PRIVATE);
                    String str = et.getText().toString();
                    now.setText("   " + str + "원을 소비했습니다");     //버튼 클릭과 동시에 입력한 금액과 문구가 화면 윗 부분에 보여집니다
                    outFs.write(str.getBytes());
                    outFs.close();
                    Toast.makeText(getApplicationContext(), filename+"이 저장됨", Toast.LENGTH_LONG).show();     //저장 알림 토스트
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
            btn.setText("수정하기");    //이미 소비 일기를 작성한 날짜를 선택했을 경우 버튼의 문구가 '저장'이 아닌 '수정하기'로 보여짐
        } catch (IOException e){
            et.setHint("일기 없음");    //작성된 일기가 없는 날짜의 경우 '일기없음'으로 힌트가 보여짐
            btn.setText("새로 저장");   //작성된 일기가 없는 날짜의 경우 버튼의 문구가 '새로저장'으로 보여짐
        }
        return diaryStr;
    }
}
