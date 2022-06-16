package com.example.myappproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class CardActivity extends MainActivity {

    CheckBox ck1, ck2, ck3, ck4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.title);

        ck1 = findViewById(R.id.ck1);
        ck2 = findViewById(R.id.ck2);
        ck3 = findViewById(R.id.ck3);
        ck4 = findViewById(R.id.ck4);

                ck1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {   //첫번째 체크박스 클릭 시 메시지 창 팝업
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if(b == true){
                            AlertDialog.Builder dlg = new AlertDialog.Builder(CardActivity.this);
                            dlg.setTitle("카드 신청");  //메시지 창 제목 설정
                            dlg.setMessage("선택 카드: 토스 D4@카드의 정석 우리카드"); //메시지 창 문구
                            dlg.setIcon(R.drawable.title);
                            dlg.setPositiveButton("확인",null);
                            dlg.show();
                        }
                    }
                });
                ck2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {   //두번째 체크박스 클릭 시 메시지 창 팝업
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if(b == true){
                            AlertDialog.Builder dlg1 = new AlertDialog.Builder(CardActivity.this);
                            dlg1.setTitle("카드 신청"); 
                            dlg1.setMessage("선택 카드: KB국민 톡톡with 토스");
                            dlg1.setIcon(R.drawable.title);
                            dlg1.setPositiveButton("확인",null);
                            dlg1.show();
                        }
                    }
                });
                ck3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {   //세번째 체크박스 클릭 시 메시지 창 팝업
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if(b == true){
                            AlertDialog.Builder dlg2 = new AlertDialog.Builder(CardActivity.this);
                            dlg2.setTitle("카드 신청");
                            dlg2.setMessage("선택 카드: 삼성 iD ON 카드");
                            dlg2.setIcon(R.drawable.title);
                            dlg2.setPositiveButton("확인",null);
                            dlg2.show();
                        }
                    }
                });
                ck4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {   //네번째 체크박스 클릭 시 메시지 창 팝업
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        if(b == true){
                            AlertDialog.Builder dlg3 = new AlertDialog.Builder(CardActivity.this);
                            dlg3.setTitle("카드 신청");
                            dlg3.setMessage("선택 카드: 올바른 FLEX 카드");
                            dlg3.setIcon(R.drawable.title);
                            dlg3.setPositiveButton("확인",null);
                            dlg3.show();
                        }
                    }
                });
    }
}
