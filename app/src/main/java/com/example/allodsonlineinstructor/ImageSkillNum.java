package com.example.allodsonlineinstructor;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class ImageSkillNum extends View {
    int a = 0;
    public ImageSkillNum(Context context) {
        super(context);
    }

    public ImageSkillNum(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ImageSkillNum(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public ImageSkillNum(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint p = new Paint();
        Paint p1 = new Paint();
        canvas.drawRect(0,0,200,200,p);
        p.setColor(Color.TRANSPARENT);
        p1.setTextSize(80);
        p1.setColor(Color.WHITE);
        canvas.drawText(a + "",110,150,p1);
        super.onDraw(canvas);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        a++;
        if(a > 3){
            a = 0;
        }
        invalidate();
        return super.onTouchEvent(event);
    }
}
