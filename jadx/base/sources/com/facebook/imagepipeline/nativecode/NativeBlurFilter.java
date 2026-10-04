package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import o00ooOo0.C25787OooO00o;

/* JADX INFO: loaded from: classes5.dex */
public class NativeBlurFilter {
    static {
        C25787OooO00o.OooO0O0("native-filters");
    }

    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);
}
