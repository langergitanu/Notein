package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzIO {
    private float zzPp;
    private float zzZhH;
    private boolean zzZhI;
    private float zzZhJ;
    private float zzZhK;
    private zz9K zzZii;
    private float zzwo;

    public zzIO(zz9K zz9k, zzIW zziw) {
        this.zzZii = zz9k;
        float fZzYb = zziw.zzYb(zz9k.zzZDQ());
        float fZzYc = zziw.zzYc(this.zzZii.zzZDQ());
        this.zzPp = 1.0f;
        this.zzZhK = fZzYc;
        this.zzZhI = fZzYc < 0.0f || fZzYb < 0.0f;
        this.zzZhJ = fZzYc < 0.0f ? 0.0f : fZzYc;
        this.zzwo = fZzYb;
    }

    public final float getHeight() {
        return this.zzwo;
    }

    public final float getWidth() {
        return this.zzZhJ * this.zzPp;
    }

    public final void setScale(float f) {
        this.zzPp = f;
    }

    public final float zzOG() {
        return this.zzZhH * this.zzPp;
    }

    public final void zzZA(float f) {
        this.zzZhH = f;
    }

    public final float zzZRI() {
        return this.zzZhK * this.zzPp;
    }

    public final float zzZRJ() {
        return this.zzZhH;
    }

    public final boolean zzZRK() {
        return this.zzZhI;
    }

    public final float zzZRL() {
        return this.zzZhJ;
    }

    public final float zzZRM() {
        return this.zzZhK;
    }

    public final zz9K zzZSg() {
        return this.zzZii;
    }
}
