package com.example.allodsonlineinstructor;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.google.android.material.shape.ShapeAppearanceModel;

public class ImageSkillNum extends View {
    int a = 0;
    SharedPreferences sharedPreferences;
    public ImageSkillNum(Context context) {
        super(context);
    }

    public ImageSkillNum(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        load();
    }

    public ImageSkillNum(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        load();


    }

    public ImageSkillNum(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        load();
    }
    @Override
    protected void onDraw(Canvas canvas) {
        Paint p = new Paint();
        p.setTextSize(80);
        p.setColor(Color.CYAN);
        canvas.drawText(a + "",110,150,p);
        super.onDraw(canvas);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        a++;
        if(a > 3){
            a = 0;
        }
        save();
        invalidate();
        return super.onTouchEvent(event);
    }
    void save(){
        sharedPreferences = getContext().getSharedPreferences("prefs",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt(""+getId(),a);
        editor.commit();

    }
    void load(){
        sharedPreferences = getContext().getSharedPreferences("prefs",Context.MODE_PRIVATE);
        a = sharedPreferences.getInt(getId()+"",0);

    }
}
