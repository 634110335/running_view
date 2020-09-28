package com.example.runingview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class RunningView extends View {
    //在new的时候会调用此构造
    public RunningView(Context context) {
        super(context);
    }
    //在layout中使用
    public RunningView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
    //在layout中调用，但是会在style
    public RunningView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        //指定控件的宽高
        //获取宽高的模式
        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        if (widthMode == MeasureSpec.AT_MOST){
            // 指定的是wrap_content
        }else if (widthMode == MeasureSpec.EXACTLY){
            //指定的是确切的值
        }else if (widthMode == MeasureSpec.UNSPECIFIED){
            //尽可能的大
        }
    }
}
