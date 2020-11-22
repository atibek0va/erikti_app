package com.example.app_erikti;

import androidx.appcompat.app.AppCompatActivity;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.ImageButton;


public class mapPage extends AppCompatActivity implements View.OnClickListener {
    private ImageButton btnNews;
    private ImageButton btnMap;
    private ImageButton btnUser;
    private Button btnAlmaty;
    private Button btnTaraz;
    private Button btnAstana;
    private Button btnAqtau;
    private Button btnShymkent;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_page);
        btnNews = findViewById(R.id.btnNews);
        btnMap = findViewById(R.id.btnMap);
        btnUser = findViewById(R.id.btnUser);

        btnAlmaty = findViewById(R.id.btnAlmaty);
        btnAqtau = findViewById(R.id.btnAqtau);
        btnAstana = findViewById(R.id.btnAstana);
        btnTaraz = findViewById(R.id.btnTaraz);
        btnShymkent = findViewById(R.id.btnShymkent);

        btnNews.setOnClickListener(this);
        btnMap.setOnClickListener(this);
        btnUser.setOnClickListener(this);
        btnAlmaty.setOnClickListener(this);
        btnAstana.setOnClickListener(this);
        btnAqtau.setOnClickListener(this);
        btnTaraz.setOnClickListener(this);
        btnShymkent.setOnClickListener(this);
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

        else if (v.getId() == R.id.btnUser){
            Intent user_page = new Intent(this,MainActivity.class);
            startActivity(user_page);
        }
        else if (v.getId() == R.id.btnAstana){
            Intent section1 = new Intent(this,sectionPage.class);
            startActivity(section1);
        }
        else if (v.getId() == R.id.btnAlmaty){
            Intent section2 = new Intent(this,sectionPage.class);
            startActivity(section2);
        }
        else if (v.getId() == R.id.btnTaraz){
            Intent section3 = new Intent(this,sectionPage.class);
            startActivity(section3);
        }
        else if (v.getId() == R.id.btnAqtau){
            Intent section4 = new Intent(this,sectionPage.class);
            startActivity(section4);
        }
        else if (v.getId() == R.id.btnShymkent){
            Intent section4 = new Intent(this,sectionPage.class);
            startActivity(section4);
        }

    }
}