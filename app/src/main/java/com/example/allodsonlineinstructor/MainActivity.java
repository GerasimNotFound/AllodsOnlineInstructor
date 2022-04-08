package com.example.allodsonlineinstructor;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView welcome;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        welcome = findViewById(R.id.welcome);
        next = findViewById(R.id.next);
        next.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this,Mode.class);
        startActivity(intent);
    }
}