package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZX9 {
    private int zz9B;
    private int zz9C;
    private int zz9D;
    private int zz9E;
    private int zz9F;
    private zzZX8 zz9G;
    private int zzZq;

    public zzZX9(int i, int i2, int i3, int i4, int i5) {
        this.zz9F = i;
        this.zz9E = i2;
        this.zz9D = i3;
        this.zz9C = i4;
        this.zz9B = i5;
    }

    public final int getGlyphIndex() {
        return this.zz9F;
    }

    public final void zzSz(int i) {
        this.zzZq = i;
    }

    public final void zzZ(zzZX8 zzzx8) {
        this.zz9G = zzzx8;
    }

    public final int zzZD() {
        return this.zzZq;
    }

    public final boolean zzoW() {
        return this.zz9G != null;
    }

    public final zzZX8 zzoX() {
        return this.zz9G;
    }

    public final int zzoY() {
        return this.zz9C;
    }

    public final int zzoZ() {
        return this.zz9E;
    }
}
