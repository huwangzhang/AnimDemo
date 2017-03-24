package com.example.huwang.animdemo;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by huwang on 2017/3/24.
 */

public class FrameAnimationDemo extends Activity {
    ImageView imageView;
    AnimationDrawable am;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);
        imageView = (ImageView)findViewById(R.id.view);
        am = (AnimationDrawable)imageView.getBackground();
        Button prePage = (Button)findViewById(R.id.prePage);
        prePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(), MainActivity.class));
                finish();
            }
        });
    }
    public void play(View view) {
        am.start();
    }
    public void stop(View view) {
        am.stop();
    }
}
