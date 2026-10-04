package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzQL {
    private int zzL8;
    private boolean zzA = true;
    private int zzL9 = 220;

    public final boolean getDownsampleImages() {
        return this.zzA;
    }

    public final int getResolution() {
        return this.zzL9;
    }

    public final int getResolutionThreshold() {
        return this.zzL8;
    }

    public final void setDownsampleImages(boolean z) {
        this.zzA = z;
    }

    public final void setResolution(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zzL9 = i;
    }

    public final void setResolutionThreshold(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zzL8 = i;
    }
}
