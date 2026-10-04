package com.aspose.slides;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public interface IGeometryPath {
    void arcTo(float f, float f2, float f3, float f4);

    void closeFigure();

    void cubicBezierTo(float f, float f2, float f3, float f4, float f5, float f6);

    void cubicBezierTo(float f, float f2, float f3, float f4, float f5, float f6, long j);

    void cubicBezierTo(PointF pointF, PointF pointF2, PointF pointF3);

    void cubicBezierTo(PointF pointF, PointF pointF2, PointF pointF3, long j);

    byte getFillMode();

    IPathSegment[] getPathData();

    boolean getStroke();

    void lineTo(float f, float f2);

    void lineTo(float f, float f2, long j);

    void lineTo(PointF pointF);

    void lineTo(PointF pointF, long j);

    void moveTo(float f, float f2);

    void moveTo(PointF pointF);

    void quadraticBezierTo(float f, float f2, float f3, float f4);

    void quadraticBezierTo(float f, float f2, float f3, float f4, long j);

    void quadraticBezierTo(PointF pointF, PointF pointF2);

    void quadraticBezierTo(PointF pointF, PointF pointF2, long j);

    void removeAt(int i);

    void setFillMode(byte b);

    void setStroke(boolean z);
}
