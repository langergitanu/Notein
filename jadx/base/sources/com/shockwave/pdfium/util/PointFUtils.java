package com.shockwave.pdfium.util;

import OooooOo.C21385OooOOOO;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes10.dex */
public class PointFUtils {
    public static PointF calculateMiddlePoint(PointF pointF, PointF pointF2) {
        return new PointF((pointF.x + pointF2.x) / 2.0f, (pointF.y + pointF2.y) / 2.0f);
    }

    public static PointF calculateRotatedPoint(PointF pointF, PointF pointF2, float f) {
        float f2 = pointF.x;
        float f3 = pointF.y;
        float f4 = pointF2.x;
        float f5 = pointF2.y;
        double radians = Math.toRadians(f);
        double d = f2 - f4;
        double d2 = f3 - f5;
        return new PointF((float) (((Math.cos(radians) * d) - (Math.sin(radians) * d2)) + ((double) f4)), (float) (C21385OooOOOO.OooO0O0(radians, d2, Math.sin(radians) * d) + ((double) f5)));
    }
}
