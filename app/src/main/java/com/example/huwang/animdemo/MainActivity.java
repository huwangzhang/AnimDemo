package com.example.huwang.animdemo;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    AnimationDrawable am;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView)findViewById(R.id.view);
        am = (AnimationDrawable)imageView.getBackground();
    }
    public void play(View view) {
        am.start();
    }
    public void stop(View view) {
        am.stop();
    }
}
