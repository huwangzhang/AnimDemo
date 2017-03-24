package com.example.gestureuitls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener {
    private int[] images = {R.drawable.sample1, R.drawable.sample12, R.drawable.sample31};
    private ViewFlipper viewFlipper = null;
    private GestureDetector gestureDetector = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewFlipper = (ViewFlipper)findViewById(R.id.viewflipper);
        gestureDetector = new GestureDetector(this);
        for (int i = 0; i < images.length; i++) {
            // 定义一个ImageView对象
            ImageView image = new ImageView(this);
            image.setImageResource(images[i]);
            // 充满父控件
            image.setScaleType(ImageView.ScaleType.FIT_XY);
            // 添加到viewFlipper中
            viewFlipper.addView(image, new ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        }
    }

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        //对手指滑动的距离进行了计算，如果滑动距离大于120像素，就做切换动作，否则不做任何切换动作。
        // 从左向右滑动
        if (e1.getX() - e2.getX() > 120)
        {
            // 添加动画
            this.viewFlipper.setInAnimation(AnimationUtils.loadAnimation(this,
                    R.anim.push_left_in));
            this.viewFlipper.setOutAnimation(AnimationUtils.loadAnimation(this,
                    R.anim.push_left_out));
            this.viewFlipper.showNext();
            return true;
        }// 从右向左滑动
        else if (e1.getX() - e2.getX() < -120)
        {
            this.viewFlipper.setInAnimation(AnimationUtils.loadAnimation(this,
                    R.anim.push_right_in));
            this.viewFlipper.setOutAnimation(AnimationUtils.loadAnimation(this,
                    R.anim.push_right_out));
            this.viewFlipper.showPrevious();
            return true;
        }
        return true;
    }
    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        return this.gestureDetector.onTouchEvent(event);
    }
}
