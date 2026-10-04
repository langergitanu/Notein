package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzIE {
    private float zzPp;
    private boolean zzZhI;
    private float zzZhJ;
    private float zzZhK;
    private float zzZhw;
    private boolean zzZhx;
    private zz9K zzZii;
    private long zzZr = 0;

    public zzIE(zz9K zz9k, long j) {
        this.zzZii = zz9k;
        int i = (int) j;
        this.zzZhK = Float.intBitsToFloat(i);
        this.zzZhw = com.aspose.words.internal.zzZPW.zzYz(j) >= 0.0f ? com.aspose.words.internal.zzZPW.zzYz(j) : 0.0f;
        this.zzZhJ = Float.intBitsToFloat(i) >= 0.0f ? Float.intBitsToFloat(i) : 0.0f;
        this.zzZhI = Float.intBitsToFloat(i) < 0.0f || com.aspose.words.internal.zzZPW.zzYz(j) < 0.0f;
        this.zzZhx = zz9k.zzZDU().getType() == 5;
    }

    public final float getHeight() {
        return this.zzZhw * this.zzPp;
    }

    public final long getSize() {
        return com.aspose.words.internal.zzZPW.zzG(getWidth(), getHeight());
    }

    public final float getWidth() {
        return this.zzZhJ * this.zzPp;
    }

    public final void zzA(long j) {
        this.zzZr = j;
    }

    public final long zzZE() {
        return this.zzZr;
    }

    public final float zzZRI() {
        return this.zzZhK * this.zzPp;
    }

    public final boolean zzZRK() {
        return this.zzZhI;
    }

    public final boolean zzZRq() {
        return !this.zzZhx && this.zzZhK >= 0.0f;
    }

    public final boolean zzZRr() {
        return this.zzZhx;
    }

    public final zz9K zzZSg() {
        return this.zzZii;
    }

    public final void zzZx(float f) {
        this.zzPp = f;
    }
}
