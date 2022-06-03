package com.example.myappproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CustomerActivity extends AppCompatActivity {

    Button customer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customer);

        final MediaPlayer mPlayer;
        mPlayer = MediaPlayer.create(this,R.raw.song1);

        final Switch switch1 = findViewById(R.id.switch1);

        switch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (switch1.isChecked() == true)
                    mPlayer.start();
                else
                    mPlayer.stop();
            }
        });
        customer = findViewById(R.id.customer);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.title);

        registerForContextMenu(customer);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater menuInflater = getMenuInflater();
        if (v == customer){
            menu.setHeaderTitle("고객센터");
            menuInflater.inflate(R.menu.menu1, menu);
        }
    }
    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        super.onContextItemSelected(item);
        switch (item.getItemId()){
            case R.id.item1:
                Uri uri = Uri.parse("tel:/1588-9999");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
                return true;
            case R.id.item2:
                Uri uri1 = Uri.parse("tel:/1599-9999");
                Intent intent2 = new Intent(Intent.ACTION_VIEW, uri1);
                startActivity(intent2);
                return true;
        }
        return false;
    }


}
