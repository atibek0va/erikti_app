package com.example.app_erikti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class sectionPage extends AppCompatActivity implements View.OnClickListener {
    private ImageButton btnElka;
    private ImageButton btnAdam;
    private ImageButton btnJanuar;
    private ImageButton btnBasqa;
    private ImageButton btnNews;
    private ImageButton btnMap;
    private ImageButton btnUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_page);

        btnAdam = findViewById(R.id.btnAdam);
        btnAdam.setOnClickListener(this);
        btnElka = findViewById(R.id.btnElka);
        btnElka.setOnClickListener(this);
        btnJanuar = findViewById(R.id.btnJanuar);
        btnJanuar.setOnClickListener(this);
        btnBasqa = findViewById(R.id.btnBasqa);
        btnBasqa.setOnClickListener(this);

        btnNews = findViewById(R.id.btnNews);
        btnMap = findViewById(R.id.btnMap);
        btnUser = findViewById(R.id.btnUser);

        btnNews.setOnClickListener(this);
        btnMap.setOnClickListener(this);
        btnUser.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnElka){
            Intent elka = new Intent(this,tabigat.class);
            startActivity(elka);
        }
        else if(v.getId() == R.id.btnAdam){
            Intent adam = new Intent(this,komek.class);
            startActivity(adam);
        }
        else if(v.getId() == R.id.btnJanuar){
            Intent jan = new Intent(this,januar.class);
            startActivity(jan);
        }
        else if (v.getId() == R.id.btnBasqa){
            Intent basqa = new Intent(this,mapPage.class);
            startActivity(basqa);

        }
        else if (v.getId() == R.id.btnNews){
            Intent news_page = new Intent(this,newsPage.class);
            startActivity(news_page);
        }
        else if (v.getId() == R.id.btnMap){
            Intent map_page = new Intent(this,mapPage.class);
            startActivity(map_page);
        }
        else {
            Intent user_page = new Intent(this,MainActivity.class);
            startActivity(user_page);
        }
    }
}