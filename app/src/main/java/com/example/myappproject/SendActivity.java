package com.example.myappproject;

import android.app.TabActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TabHost;

public class SendActivity extends TabActivity {

    ImageView image1, image2, image3, image4;
    Button b1, b2, b4, b5, b6, b7, b8, b9, b10, b11;
    ImageButton ib1, ib2, ib3, ib4, ib5, ib6, ib7, ib8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.send);

        TabHost tabHost = getTabHost();

        TabHost.TabSpec tab1 = tabHost.newTabSpec("tab1").setIndicator("추천");
        tab1.setContent(R.id.tab1);
        tabHost.addTab(tab1);

        TabHost.TabSpec tab2 = tabHost.newTabSpec("tab2").setIndicator("즐겨찾기");
        tab2.setContent(R.id.tab2);
        tabHost.addTab(tab2);

        TabHost.TabSpec tab3 = tabHost.newTabSpec("tab3").setIndicator("연락처");
        tab3.setContent(R.id.tab3);
        tabHost.addTab(tab3);

        tabHost.setCurrentTab(0);

        b1 = findViewById(R.id.b1); b2 = findViewById(R.id.b2);
        b4 = findViewById(R.id.b4); b5 = findViewById(R.id.b5); b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7); b8 = findViewById(R.id.b8); b9 = findViewById(R.id.b9);
        b10 = findViewById(R.id.b10); b11 = findViewById(R.id.b11);
        image1 = findViewById(R.id.image1); image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3); image4 = findViewById(R.id.image4);
        ib1 = findViewById(R.id.ib1); ib2 = findViewById(R.id.ib2); ib3 = findViewById(R.id.ib3);
        ib4 = findViewById(R.id.ib4); ib5 = findViewById(R.id.ib5); ib6 = findViewById(R.id.ib6);
        ib7 = findViewById(R.id.ib7); ib8 = findViewById(R.id.ib8);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SendActivity2.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SendActivity2.class);
                startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image1.setVisibility(View.VISIBLE);
                b8.setVisibility(View.VISIBLE);
                Intent intent = new Intent(getApplicationContext(), SendActivity2.class);
                startActivity(intent);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image2.setVisibility(View.VISIBLE);
                b9.setVisibility(View.VISIBLE);
                Intent intent = new Intent(getApplicationContext(), SendActivity2.class);
                startActivity(intent);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image3.setVisibility(View.VISIBLE);
                b10.setVisibility(View.VISIBLE);
                Intent intent = new Intent(getApplicationContext(), SendActivity2.class);
                startActivity(intent);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image4.setVisibility(View.VISIBLE);
                b11.setVisibility(View.VISIBLE);
                Intent intent = new Intent(getApplicationContext(), SendActivity2.class);
                startActivity(intent);
            }
        });
        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/010-1111-1111"));
                startActivity(intent);
            }
        });
        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/010-2222-2222"));
                startActivity(intent);
            }
        });
        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/010-3333-3333"));
                startActivity(intent);
            }
        });
        ib4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/010-4444-4444"));
                startActivity(intent);
            }
        });
        ib5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/010-5555-5555"));
                startActivity(intent);
            }
        });
        ib6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/010-6666-6666"));
                startActivity(intent);
            }
        });
        ib7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/010-7777-7777"));
                startActivity(intent);
            }
        });
        ib8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/010-8888-8888"));
                startActivity(intent);
            }
        });
    }
}
