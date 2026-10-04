package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZIM extends zzZIO {
    double[] zzZIK;
    double[][] zzZIL;

    public zzZIM(int i, int i2) {
        super(5, i, i2);
        this.zzZIL = new double[i2][];
        for (int i3 = 0; i3 < i2; i3++) {
            this.zzZIL[i3] = new double[i];
        }
        this.zzZIK = this.zzZIL[0];
    }

    @Override // com.aspose.words.internal.zzZIO
    public final int zzPC(int i) {
        return (int) this.zzZIK[i + this.offset];
    }

    @Override // com.aspose.words.internal.zzZIO
    public final int zzYP(int i, int i2) {
        return (int) this.zzZIL[i][i2 + this.zzZIN[i]];
    }

    @Override // com.aspose.words.internal.zzZIO
    public final void zzq(int i, int i2, int i3) {
        this.zzZIL[i][i2 + this.zzZIN[i]] = i3;
    }
}
