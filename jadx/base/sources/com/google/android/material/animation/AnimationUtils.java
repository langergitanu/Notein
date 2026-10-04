package com.google.android.material.animation;

import OooOO0.OooO0OO;
import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import o000Oooo.C24551OooO00o;
import o000Oooo.C24552OooO0O0;
import o000Oooo.C24553OooO0OO;

/* JADX INFO: loaded from: classes7.dex */
public class AnimationUtils {
    public static final TimeInterpolator LINEAR_INTERPOLATOR = new LinearInterpolator();
    public static final TimeInterpolator FAST_OUT_SLOW_IN_INTERPOLATOR = new C24552OooO0O0();
    public static final TimeInterpolator FAST_OUT_LINEAR_IN_INTERPOLATOR = new C24551OooO00o();
    public static final TimeInterpolator LINEAR_OUT_SLOW_IN_INTERPOLATOR = new C24553OooO0OO(C24553OooO0OO.f83132OooO0OO);
    public static final TimeInterpolator DECELERATE_INTERPOLATOR = new DecelerateInterpolator();

    public static float lerp(float f, float f2, float f3) {
        return OooO0OO.OooO0O0(f2, f, f3, f);
    }

    public static int lerp(int i, int i2, float f) {
        return Math.round(f * (i2 - i)) + i;
    }

    public static float lerp(float f, float f2, float f3, float f4, float f5) {
        return f5 <= f3 ? f : f5 >= f4 ? f2 : lerp(f, f2, (f5 - f3) / (f4 - f3));
    }
}
