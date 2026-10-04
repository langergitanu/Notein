package com.bumptech.glide.integration.webp;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f67170OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f67171OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f67172OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f67173OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f67174OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f67175OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f67176OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f67177OooO0oo;

    public OooO00o(int i, WebpFrame webpFrame) {
        this.f67170OooO00o = i;
        this.f67171OooO0O0 = webpFrame.getXOffest();
        this.f67172OooO0OO = webpFrame.getYOffest();
        this.f67173OooO0Oo = webpFrame.getWidth();
        this.f67175OooO0o0 = webpFrame.getHeight();
        this.f67174OooO0o = webpFrame.getDurationMs();
        this.f67176OooO0oO = webpFrame.isBlendWithPreviousFrame();
        this.f67177OooO0oo = webpFrame.shouldDisposeToBackgroundColor();
    }

    public final String toString() {
        return "frameNumber=" + this.f67170OooO00o + ", xOffset=" + this.f67171OooO0O0 + ", yOffset=" + this.f67172OooO0OO + ", width=" + this.f67173OooO0Oo + ", height=" + this.f67175OooO0o0 + ", duration=" + this.f67174OooO0o + ", blendPreviousFrame=" + this.f67176OooO0oO + ", disposeBackgroundColor=" + this.f67177OooO0oo;
    }
}
