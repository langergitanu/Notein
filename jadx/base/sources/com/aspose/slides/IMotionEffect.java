package com.aspose.slides;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public interface IMotionEffect extends IBehavior {
    float getAngle();

    PointF getBy();

    PointF getFrom();

    int getOrigin();

    IMotionPath getPath();

    int getPathEditMode();

    PointF getRotationCenter();

    PointF getTo();

    void setAngle(float f);

    void setBy(PointF pointF);

    void setFrom(PointF pointF);

    void setOrigin(int i);

    void setPath(IMotionPath iMotionPath);

    void setPathEditMode(int i);

    void setRotationCenter(PointF pointF);

    void setTo(PointF pointF);
}
