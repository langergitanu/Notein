package com.facebook.animated.webp;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes5.dex */
public class WebPFrame {
    private long mNativeContext;

    public WebPFrame(long j) {
        this.mNativeContext = j;
    }

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDurationMs();

    private native int nativeGetHeight();

    private native int nativeGetWidth();

    private native int nativeGetXOffset();

    private native int nativeGetYOffset();

    private native boolean nativeIsBlendWithPreviousFrame();

    private native void nativeRenderFrame(int i, int i2, Bitmap bitmap);

    private native boolean nativeShouldDisposeToBackgroundColor();

    public final void OooO00o() {
        nativeDispose();
    }

    public final int OooO0O0() {
        return nativeGetHeight();
    }

    public final int OooO0OO() {
        return nativeGetWidth();
    }

    public final int OooO0Oo() {
        return nativeGetXOffset();
    }

    public final boolean OooO0o() {
        return nativeIsBlendWithPreviousFrame();
    }

    public final int OooO0o0() {
        return nativeGetYOffset();
    }

    public final void OooO0oO(int i, int i2, Bitmap bitmap) {
        nativeRenderFrame(i, i2, bitmap);
    }

    public final boolean OooO0oo() {
        return nativeShouldDisposeToBackgroundColor();
    }

    public final void finalize() {
        nativeFinalize();
    }
}
