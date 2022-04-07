package com.example.allodsonlineinstructor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Sections extends AppCompatActivity implements View.OnClickListener {
    TextView goNext;
    Button basicmeha,classes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sections);
        goNext = findViewById(R.id.gonext);
        basicmeha = findViewById(R.id.basicmeha);
        classes = findViewById(R.id.classes);
        basicmeha.setOnClickListener(this);
        classes.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, BasicMeha.class);
        basicmeha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
        Intent intent1 = new Intent(this, Classes.class);
        classes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent1);
            }
        });
    }
}