package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz10 {
    private zzPV zzZf = zzPV.zzHZ;
    private byte[] zzeW;
    private int zzeX;
    private zz12 zzfa;
    private zz11 zzfd;
    private zz16 zzfi;

    public zz10(int i) {
        this.zzeX = i;
    }

    public final void zzY(zzPV zzpv) {
        if (!zzsG()) {
            throw new IllegalArgumentException("Non desired pattern cannot have color.");
        }
        this.zzZf = zzpv;
    }

    public final void zzZ(zz11 zz11Var) {
        if (zzsG()) {
            throw new IllegalArgumentException("Desired pattern cannot have PixMap.");
        }
        this.zzfd = zz11Var;
    }

    public final void zzZg(byte[] bArr) {
        this.zzeW = bArr;
    }

    public final boolean zzsG() {
        return this.zzeX == 2;
    }

    public final zz11 zzsS() {
        return this.zzfd;
    }

    public final zz16 zzsU() {
        return this.zzfi;
    }

    public final void zzZ(zz16 zz16Var) {
        if (!zzsG()) {
            this.zzfi = zz16Var;
            return;
        }
        throw new IllegalArgumentException("Desired pattern cannot have ColorTable.");
    }

    public final void zzZ(zz12 zz12Var) {
        if (!zzsG()) {
            this.zzfa = zz12Var;
            return;
        }
        throw new IllegalArgumentException("Desired pattern cannot have PixData.");
    }
}
