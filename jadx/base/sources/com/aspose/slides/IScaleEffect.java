package com.aspose.slides;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public interface IScaleEffect extends IBehavior {
    PointF getBy();

    PointF getFrom();

    PointF getTo();

    byte getZoomContent();

    void setBy(PointF pointF);

    void setFrom(PointF pointF);

    void setTo(PointF pointF);

    void setZoomContent(byte b);
}
