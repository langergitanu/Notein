package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZII extends zzZIO {
    short[][] zzZIE;
    short[] zzZIF;

    public zzZII(int i) {
        super(1, i);
        short[] sArr = new short[i];
        this.zzZIF = sArr;
        this.zzZIE = new short[][]{sArr};
    }

    @Override // com.aspose.words.internal.zzZIO
    public final int zzPC(int i) {
        return this.zzZIF[i + this.offset] & 65535;
    }

    @Override // com.aspose.words.internal.zzZIO
    public final int zzYP(int i, int i2) {
        return this.zzZIE[i][i2 + this.zzZIN[i]] & 65535;
    }

    public final short[] zzcT() {
        return this.zzZIF;
    }

    @Override // com.aspose.words.internal.zzZIO
    public final void zzq(int i, int i2, int i3) {
        this.zzZIE[i][i2 + this.zzZIN[i]] = (short) (65535 & i3);
    }

    public zzZII(int i, int i2) {
        super(1, i, i2);
        this.zzZIE = new short[i2][];
        for (int i3 = 0; i3 < i2; i3++) {
            this.zzZIE[i3] = new short[i];
        }
        this.zzZIF = this.zzZIE[0];
    }
}
