package com.example.huwang.animdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.example.huwang.animdemo.animation.MyAnimation;

/**
 * Created by huwang on 2017/3/24.
 */

public class TweenAnimationDemo extends Activity {
    private ImageView imageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween);
        imageView = (ImageView)findViewById(R.id.image_view);
        Button bt = (Button) findViewById(R.id.translate_start);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation am = AnimationUtils.loadAnimation(v.getContext(), R.anim.translate);
                imageView.startAnimation(am);
            }
        });
        Button prePage = (Button)findViewById(R.id.prePage);
        prePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), MainActivity.class));
                finish();
            }
        });
    }
    public void mystart(View view) {
        Animation am = new MyAnimation(100, 100, 3000);
        imageView.startAnimation(am);
    }
    public void set(View view) {
        Animation am = AnimationUtils.loadAnimation(view.getContext(), R.anim.tryset);
        imageView.startAnimation(am);
    }
    /**
     * @param view
     */
    public void alpha(View view) {
        // 方式一：代码形式
//        AlphaAnimation am = new AlphaAnimation(0.0f, 1.0f);
//        am.setDuration(3000);
//        am.setFillAfter(true);
//        imageView.startAnimation(am);
        //方式二
        Animation am = AnimationUtils.loadAnimation(imageView.getContext(), R.anim.alpha);
        imageView.startAnimation(am);
    }

    public void rotate(View view) {
        Animation am = AnimationUtils.loadAnimation(view.getContext(), R.anim.rotate);
        imageView.startAnimation(am);
    }

    public void scale(View view) {
        Animation am = AnimationUtils.loadAnimation(view.getContext(), R.anim.scale);
        imageView.startAnimation(am);
    }
}
