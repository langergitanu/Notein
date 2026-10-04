package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZFL {
    private char[] zzWMA = null;
    private char[] zzWMz = null;
    private char[] zzWMy = null;
    private byte[] zzWMx = null;

    public final void zzK(char[] cArr) {
        this.zzWMy = cArr;
    }

    public final void zzL(char[] cArr) {
        this.zzWMz = cArr;
    }

    public final void zzM(char[] cArr) {
        this.zzWMA = cArr;
    }

    public final void zzXs(byte[] bArr) {
        this.zzWMx = bArr;
    }

    public final byte[] zzgN(int i) {
        byte[] bArr = this.zzWMx;
        if (bArr == null || bArr.length < i) {
            return null;
        }
        this.zzWMx = null;
        return bArr;
    }

    public final char[] zzgO(int i) {
        char[] cArr = this.zzWMy;
        if (cArr == null || cArr.length < i) {
            return null;
        }
        this.zzWMy = null;
        return cArr;
    }

    public final char[] zzgP(int i) {
        char[] cArr = this.zzWMz;
        if (cArr == null || cArr.length < i) {
            return null;
        }
        this.zzWMz = null;
        return cArr;
    }

    public final char[] zzgQ(int i) {
        char[] cArr = this.zzWMA;
        if (cArr == null || cArr.length < 128) {
            return null;
        }
        this.zzWMA = null;
        return cArr;
    }
}
