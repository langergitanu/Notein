package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz82 {
    private int zzoh;
    private int zzoi;
    private int zzoj;
    private int zzok;

    public zz82(int i, int i2, int i3, int i4) {
        this.zzok = i;
        this.zzoj = i2;
        this.zzoi = i3;
        this.zzoh = i4;
    }

    public final long zzZw(long j) {
        if (this.zzok == 0 || this.zzoi == 0) {
            throw new IllegalStateException("Invalid scale values.");
        }
        return zzZPW.zzG((Float.intBitsToFloat((int) j) * this.zzoh) / this.zzoi, (zzZPW.zzYz(j) * this.zzoj) / this.zzok);
    }
}
