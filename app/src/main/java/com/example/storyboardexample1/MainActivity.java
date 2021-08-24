package com.example.storyboardexample1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    FrameLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        container = findViewById(R.id.container);

        LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.sub_home, container, true);

        Button button_home = findViewById(R.id.button_home);
        button_home.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                container.removeAllViews();
                inflater.inflate(R.layout.sub_home, container, true);
            }
        });

        Button button_map = findViewById(R.id.button_map);
        button_map.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                container.removeAllViews();
                inflater.inflate(R.layout.sub_map, container, true);

            }
        });


        Button button_community = findViewById(R.id.button_community);
        button_community.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                container.removeAllViews();
                inflater.inflate(R.layout.sub_community, container,true);
            }
        });


        Button button_mypage = findViewById(R.id.button_mypage);
        button_mypage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                container.removeAllViews();
                inflater.inflate(R.layout.sub_mypage, container, true);
            }
        });


    }

}

