package com.example.allodsonlineinstructor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Mode extends AppCompatActivity implements View.OnClickListener {
    TextView chose;
    Button basic,profi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode);
        chose = findViewById(R.id.chose);
        basic = findViewById(R.id.basic);
        profi = findViewById(R.id.profi);
        basic.setOnClickListener(this);
        profi.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, Sections.class);
        basic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
        Intent intent1 = new Intent(this, ProfiText.class);
        profi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent1);
            }
        });
    }
}