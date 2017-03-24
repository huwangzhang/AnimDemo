package com.example.huwang.animdemo;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.TextView;

import com.example.huwang.animdemo.evaluator.ColorEvaluator;
import com.example.huwang.animdemo.view.MyAnimView;

import static com.example.huwang.animdemo.R.id.textview;

/**
 * Created by huwang on 2017/3/24.
 */

public class ValueAnimationDemo extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo);
    }
//        Button valueama = (Button) findViewById(R.id.valueam);
//        Button comp = (Button) findViewById(R.id.comp);
//
//        final TextView textview = (TextView)findViewById(R.id.textview);
//        comp.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Animator am = AnimatorInflater.loadAnimator(v.getContext(), R.animator.comp);
//                am.setTarget(textview);
//                am.start();;
//            }
//        });
//        valueama.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                ObjectAnimator moveIn = ObjectAnimator.ofFloat(textview, "translationX", -500f, 0f);
//                ObjectAnimator rotate = ObjectAnimator.ofFloat(textview, "rotation", 0f, 360f);
//                ObjectAnimator fadeInOut = ObjectAnimator.ofFloat(textview, "alpha", 1f, 0f, 1f);
//                AnimatorSet animSet = new AnimatorSet();
//                animSet.play(rotate).with(fadeInOut).after(moveIn);
//                animSet.setDuration(5000);
//                animSet.start();
//            }
//        });
//    }
//    public void prePage(View view) {
//        startActivity(new Intent(this, MainActivity.class));
//        finish();
//    }
}
