package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzC7 {
    private char[] zzNv;
    private int zzty;

    public zzC7() {
    }

    private String zzVr(int i) {
        return new String(this.zzNv, 0, i);
    }

    private void zzY(zzHF zzhf, int i) {
        char[] cArrZzZ = zzXG.zzZ(zzhf, (this.zzty + i) * 2);
        char[] cArr = this.zzNv;
        if (cArr != null) {
            System.arraycopy(cArr, 0, cArrZzZ, 0, this.zzty);
        }
        this.zzNv = cArrZzZ;
    }

    public final int getPosition() {
        return this.zzty;
    }

    public final boolean isEmpty() {
        return this.zzNv == null;
    }

    public final String toString() {
        return zzVr(this.zzty);
    }

    public final char[] zzCf() {
        return this.zzNv;
    }

    public final void zzCg() {
        if (this.zzNv != null) {
            this.zzNv = null;
        }
        this.zzty = 0;
    }

    public final void zzCh() {
        this.zzty = 0;
    }

    public final void zzZ(zzHF zzhf, char c) {
        if (this.zzty == this.zzNv.length) {
            zzY(zzhf, 1);
        }
        char[] cArr = this.zzNv;
        int i = this.zzty;
        this.zzty = i + 1;
        cArr[i] = c;
    }

    public zzC7(zzHF zzhf) {
        this(zzXG.zzZ(zzhf, 1024));
    }

    private zzC7(char[] cArr) {
        this.zzNv = cArr;
        this.zzty = 0;
    }

    public final void zzZ(zzHF zzhf, char[] cArr, int i, int i2) {
        if (this.zzty + i2 >= this.zzNv.length) {
            zzY(zzhf, i2);
        }
        zzZKV.zzZ(cArr, i, this.zzNv, this.zzty, i2);
        this.zzty += i2;
    }
}
