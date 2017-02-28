package com.zyh.vovo.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by DELL-002 on 2017/2/28.
 * 不能滚动的Viewpage
 */

public class NoScrollViewPager extends ViewPager {

    public NoScrollViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NoScrollViewPager(Context context) {
        super(context, null);
    }



    @Override
    public boolean onTouchEvent(MotionEvent arg0) {
        /* return false;//super.onTouchEvent(arg0); */
        return false;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent arg0) {

        return true;
    }


}
