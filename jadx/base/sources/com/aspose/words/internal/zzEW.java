package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzEW {
    private int zzVu;
    private int zzVv;
    private int zzVw;
    private int zzVx;
    private int zzVz;
    private byte[] zzwP;
    private byte[] zzwQ;
    private byte[] zzwR;
    private int zzwS;
    private int zzwT;
    private int zzwU;

    public zzEW(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.zzwU = i;
        this.zzwT = i2;
        this.zzwS = i3;
        this.zzVz = i4;
        this.zzVx = i5;
        this.zzVw = i6;
        this.zzVv = i7;
        this.zzVu = i8;
        this.zzwR = bArr;
        this.zzwQ = bArr2;
        this.zzwP = bArr3;
    }

    public final byte[] zzEe() {
        return this.zzwP;
    }

    public final byte[] zzEf() {
        return this.zzwQ;
    }

    public final byte[] zzEg() {
        return this.zzwR;
    }

    public final int zzEh() {
        return this.zzwS;
    }

    public final boolean zzEi() {
        byte[] bArr = this.zzwR;
        return bArr == null || bArr.length == 0;
    }

    public final int zzJn() {
        return this.zzwU;
    }
}
