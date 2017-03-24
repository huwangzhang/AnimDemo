package com.example.huwang.animdemo;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button frame_btn = (Button) findViewById(R.id.frame_btn);
        Button tween_btn = (Button) findViewById(R.id.tween_btn);
        Button value_btn = (Button) findViewById(R.id.value_btn);
        frame_btn.setOnClickListener(this);
        tween_btn.setOnClickListener(this);
        value_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tween_btn :
                startActivity(new Intent(v.getContext(), TweenAnimationDemo.class));
                finish();
                break;
            case R.id.frame_btn :
                startActivity(new Intent(v.getContext(), FrameAnimationDemo.class));
                finish();
                break;
            case R.id.value_btn :
                startActivity(new Intent(v.getContext(), ValueAnimationDemo.class));
                finish();
                break;
        }
    }
}
