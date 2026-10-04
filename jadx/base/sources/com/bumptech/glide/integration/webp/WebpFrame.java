package com.bumptech.glide.integration.webp;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes5.dex */
public class WebpFrame {
    static final int FRAME_DURATION_MS_FOR_MIN = 100;
    static final int MIN_FRAME_DURATION_MS = 11;
    boolean blendPreviousFrame;
    int delay;
    boolean disposeBackgroundColor;

    /* JADX INFO: renamed from: ih */
    int f51320ih;

    /* JADX INFO: renamed from: iw */
    int f51321iw;

    /* JADX INFO: renamed from: ix */
    int f51322ix;

    /* JADX INFO: renamed from: iy */
    int f51323iy;
    private long mNativePtr;

    public WebpFrame(long j, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        this.mNativePtr = j;
        this.f51322ix = i;
        this.f51323iy = i2;
        this.f51321iw = i3;
        this.f51320ih = i4;
        this.delay = i5;
        this.blendPreviousFrame = z;
        this.disposeBackgroundColor = z2;
        fixFrameDuration();
    }

    private void fixFrameDuration() {
        if (this.delay < 11) {
            this.delay = 100;
        }
    }

    private native void nativeDispose();

    private native void nativeFinalize();

    private native void nativeRenderFrame(int i, int i2, Bitmap bitmap);

    public void dispose() {
        nativeDispose();
    }

    public void finalize() throws Throwable {
        nativeFinalize();
    }

    public int getDurationMs() {
        return this.delay;
    }

    public int getHeight() {
        return this.f51320ih;
    }

    public int getWidth() {
        return this.f51321iw;
    }

    public int getXOffest() {
        return this.f51322ix;
    }

    public int getYOffest() {
        return this.f51323iy;
    }

    public boolean isBlendWithPreviousFrame() {
        return this.blendPreviousFrame;
    }

    public void renderFrame(int i, int i2, Bitmap bitmap) {
        nativeRenderFrame(i, i2, bitmap);
    }

    public boolean shouldDisposeToBackgroundColor() {
        return this.disposeBackgroundColor;
    }
}
