package com.example.allodsonlineinstructor;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SharedPref extends AppCompatActivity {
    private SharedPreferences pref;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }
    public void onClickSave(View view){
    }
    public void onClickGet(View view){
    }
    private void init(){
        pref = getSharedPreferences("ImageNum",MODE_PRIVATE);
    }
}
