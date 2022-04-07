package com.example.allodsonlineinstructor;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class ImageSkillNum extends View {
    private TextView SkillNum;
    int a = 0;
    public ImageSkillNum(Context context) {
        super(context);
        SkillNum.setText(a);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint p = new Paint();
        canvas.drawRect(0,0,50,50,p);
        p.setColor(INVISIBLE);
        canvas.drawText(a + "",45,45,p);
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
