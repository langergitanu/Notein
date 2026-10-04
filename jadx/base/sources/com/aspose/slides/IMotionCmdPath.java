package com.aspose.slides;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes3.dex */
public interface IMotionCmdPath {
    int getCommandType();

    PointF[] getPoints();

    int getPointsType();

    boolean isRelative();

    void setCommandType(int i);

    void setPoints(PointF[] pointFArr);

    void setPointsType(int i);

    void setRelative(boolean z);
}
