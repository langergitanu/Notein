package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import java.util.List;
import o00ooOo0.C25787OooO00o;

/* JADX INFO: loaded from: classes5.dex */
public class Bitmaps {
    static {
        List<String> list = OooO00o.f67269OooO00o;
        C25787OooO00o.OooO0O0("imagepipeline");
    }

    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        if (!(bitmap2.getConfig() == bitmap.getConfig())) {
            throw new IllegalArgumentException();
        }
        if (!bitmap.isMutable()) {
            throw new IllegalArgumentException();
        }
        if (!(bitmap.getWidth() == bitmap2.getWidth())) {
            throw new IllegalArgumentException();
        }
        if (!(bitmap.getHeight() == bitmap2.getHeight())) {
            throw new IllegalArgumentException();
        }
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }

    private static native void nativeCopyBitmap(Bitmap bitmap, int i, Bitmap bitmap2, int i2, int i3);
}
