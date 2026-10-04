package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class DownsampleOptions {
    private int zzL8;
    private boolean zzA = true;
    private int zzL9 = 220;

    public boolean getDownsampleImages() {
        return this.zzA;
    }

    public int getResolution() {
        return this.zzL9;
    }

    public int getResolutionThreshold() {
        return this.zzL8;
    }

    public void setDownsampleImages(boolean z) {
        this.zzA = z;
    }

    public void setResolution(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zzL9 = i;
    }

    public void setResolutionThreshold(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: value");
        }
        this.zzL8 = i;
    }

    public final com.aspose.words.internal.zzQL zzZjZ() {
        com.aspose.words.internal.zzQL zzql = new com.aspose.words.internal.zzQL();
        zzql.setDownsampleImages(getDownsampleImages());
        zzql.setResolution(getResolution());
        zzql.setResolutionThreshold(getResolutionThreshold());
        return zzql;
    }
}
