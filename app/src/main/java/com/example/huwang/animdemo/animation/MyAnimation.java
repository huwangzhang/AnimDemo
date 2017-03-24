package com.example.huwang.animdemo.animation;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;

/**
 * Created by huwang on 2017/3/24.
 */

public class MyAnimation extends Animation {
    private float centerX;
    private float centerY;
    private int duration;
    private Camera camera = new Camera();

    public MyAnimation(float centerX, float centerY, int duration) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.duration = duration;
    }

    @Override
    public void initialize(int width, int height, int parentWidth, int parentHeight) {
        super.initialize(width, height, parentWidth, parentHeight);
        setDuration(duration);
        setFillAfter(true);
        setInterpolator(new LinearInterpolator());
    }

    /**
     * @param interpolatedTime 代表了动画的时间进行比
     * @param t 代表了补间动画在不同时刻对图形或组建的变形程度
     */
    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t) {
        camera.save();
        camera.translate(100.0f - 100.0f*interpolatedTime, 150.0f * interpolatedTime-150, 80.0f-80.0f*interpolatedTime);
        camera.rotateY(360*interpolatedTime);
        camera.rotateX(360*interpolatedTime);
        Matrix matrix = t.getMatrix();
        camera.getMatrix(matrix);
        matrix.preTranslate(-centerX, -centerY);
        matrix.postTranslate(centerX, centerY);
        camera.restore();
    }
}
