package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzEQ {
    private float zzZ3;
    private float zzZ4;
    private int zzwt;

    public zzEQ() {
        this(0, 0.5f, 0.5f);
    }

    public static boolean zzl(float f) {
        return f > 0.49f && f < 0.51f;
    }

    public static boolean zzm(float f) {
        return f > 0.49f && f < 0.51f;
    }

    public final int getColorMode() {
        return this.zzwt;
    }

    public final float zzDY() {
        return this.zzZ4;
    }

    public final float zzDZ() {
        return this.zzZ3;
    }

    public zzEQ(int i, float f, float f2) {
        this.zzwt = i;
        if (f > 1.0f) {
            f = 1.0f;
        } else if (f < 0.0f) {
            f = 0.0f;
        }
        this.zzZ3 = f;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        } else if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        this.zzZ4 = f2;
    }
}
