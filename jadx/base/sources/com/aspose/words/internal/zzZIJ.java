package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZIJ extends zzZIO {
    short[][] zzZIE;
    short[] zzZIF;

    public zzZIJ(int i, int i2) {
        super(2, i, i2);
        this.zzZIE = new short[i2][];
        for (int i3 = 0; i3 < i2; i3++) {
            this.zzZIE[i3] = new short[i];
        }
        this.zzZIF = this.zzZIE[0];
    }

    @Override // com.aspose.words.internal.zzZIO
    public final int zzPC(int i) {
        return this.zzZIF[i + this.offset];
    }

    @Override // com.aspose.words.internal.zzZIO
    public final int zzYP(int i, int i2) {
        return this.zzZIE[i][i2 + this.zzZIN[i]];
    }

    public final short[] zzcT() {
        return this.zzZIF;
    }

    @Override // com.aspose.words.internal.zzZIO
    public final void zzq(int i, int i2, int i3) {
        this.zzZIE[i][i2 + this.zzZIN[i]] = (short) i3;
    }
}
