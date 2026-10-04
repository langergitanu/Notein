package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZDT {
    private int zzWIQ;
    private String zzWIW;
    private char[] zzZnz;

    /* JADX WARN: Removed duplicated region for block: B:4:0x0009 A[PHI: r0
      0x0009: PHI (r0v2 int) = (r0v0 int), (r0v1 int) binds: [B:3:0x0007, B:6:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzZDT(int i) {
        int i2 = i << 4;
        int i3 = 60;
        if (i2 < 60) {
            i2 = i3;
        } else {
            i3 = 120;
            if (i2 > 120) {
            }
        }
        this.zzZnz = new char[i2];
    }

    private void resize(int i) {
        char[] cArr = this.zzZnz;
        int length = cArr.length;
        int i2 = length >> 1;
        int i3 = this.zzWIQ;
        int i4 = 1 - (length - i3);
        if (i2 < i4) {
            i2 = i4;
        }
        char[] cArr2 = new char[length + i2];
        this.zzZnz = cArr2;
        System.arraycopy(cArr, 0, cArr2, 0, i3);
    }

    public final void reset() {
        this.zzWIQ = 0;
        this.zzWIW = null;
    }

    public final String toString() {
        return new String(this.zzZnz, 0, this.zzWIQ);
    }

    public final char[] zzXLd() {
        this.zzWIQ = this.zzZnz.length;
        resize(1);
        return this.zzZnz;
    }

    public final int zzXLe() {
        return this.zzWIQ;
    }

    public final char[] zzXLf() {
        return this.zzZnz;
    }

    public final String zzXLg() {
        if (this.zzWIW == null) {
            this.zzWIW = new String(this.zzZnz, 0, this.zzWIQ);
        }
        return this.zzWIW;
    }

    public final void zzga(int i) {
        this.zzWIQ = i;
    }
}
