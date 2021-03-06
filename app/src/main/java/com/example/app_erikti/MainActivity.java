package com.example.app_erikti;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageButton btnNews;
    private ImageButton btnMap;
    private ImageButton btnUser;
    private Button btnTirkelu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNews = findViewById(R.id.btnNews);
        btnMap = findViewById(R.id.btnMap);
        btnUser = findViewById(R.id.btnUser);
        btnTirkelu = findViewById(R.id.btnTirkelu);

        btnNews.setOnClickListener(this);
        btnMap.setOnClickListener(this);
        btnUser.setOnClickListener(this);
        btnTirkelu.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnNews){
            Intent news_page = new Intent(this,newsPage.class);
            startActivity(news_page);
        }
        else if (v.getId() == R.id.btnMap){
            Intent map_page = new Intent(this,mapPage.class);
            startActivity(map_page);
        }
        else if (v.getId() == R.id.btnTirkelu){
            Intent tirk = new Intent(this,tirkelu.class);
            startActivity(tirk);
        }
        else {
            Intent user_page = new Intent(this,MainActivity.class);
            startActivity(user_page);
        }


    }
}
