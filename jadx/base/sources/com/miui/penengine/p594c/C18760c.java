package com.miui.penengine.p594c;

import OooOO0.OooO0OO;
import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: renamed from: com.miui.penengine.c.c */
/* JADX INFO: loaded from: classes9.dex */
public class C18760c {
    /* JADX INFO: renamed from: a */
    public static float m80281a(float f, float f2) {
        return (float) Math.toDegrees(Math.atan2(f, f2));
    }

    /* JADX INFO: renamed from: b */
    public static float m80286b(float f, float f2) {
        return 0.0f;
    }

    /* JADX INFO: renamed from: a */
    public static double m80280a(float f, float f2, float f3, float f4) {
        return Math.sqrt(Math.pow(f2 - f4, 2.0d) + Math.pow(f - f3, 2.0d));
    }

    /* JADX INFO: renamed from: b */
    public static PointF[] m80288b(RectF rectF) {
        return new PointF[]{new PointF(rectF.left, rectF.top), new PointF(rectF.right, rectF.top), new PointF(rectF.right, rectF.bottom), new PointF(rectF.left, rectF.bottom)};
    }

    /* JADX INFO: renamed from: a */
    public static float[] m80285a(RectF rectF) {
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        return new float[]{f, f2, f3, f2, f3, f4, f, f4};
    }

    /* JADX INFO: renamed from: b */
    public static float m80287b(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        double dAsin = (Math.asin(Math.abs(((double) f6) / Math.sqrt((f6 * f6) + (f5 * f5)))) / 3.141592653589793d) * 180.0d;
        if (f5 > 0.0f && f6 < 0.0f) {
            dAsin = -dAsin;
        } else if (f5 < 0.0f && f6 < 0.0f) {
            dAsin -= 180.0d;
        }
        if (f5 < 0.0f && f6 > 0.0f) {
            dAsin = 180.0d - dAsin;
        }
        return (float) dAsin;
    }

    /* JADX INFO: renamed from: a */
    public static PointF m80283a(PointF pointF, PointF pointF2) {
        if (pointF == null || pointF2 == null) {
            return null;
        }
        return new PointF((pointF.x + pointF2.x) / 2.0f, (pointF.y + pointF2.y) / 2.0f);
    }

    /* JADX INFO: renamed from: a */
    public static float m80282a(float f, float f2, float f3) {
        if (Float.isNaN(f3)) {
            return f2;
        }
        float fMin = Math.min(f, f2);
        float fMax = Math.max(f, f2);
        if (f3 > 1.0f) {
            f3 = 1.0f / f3;
        }
        return OooO0OO.OooO0O0(fMax, fMin, f3, fMin);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m80284a(float f, float f2, float f3, float f4, float f5, float f6) {
        return m80280a(f, f2, f4, f5) < ((double) (f3 + f6));
    }
}
