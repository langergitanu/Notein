package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZIK extends zzZIO {
    int[][] zzZIG;
    int[] zzZIH;

    public zzZIK(int i) {
        super(3, i);
        int[] iArr = new int[i];
        this.zzZIH = iArr;
        this.zzZIG = new int[][]{iArr};
    }

    @Override // com.aspose.words.internal.zzZIO
    public final int zzPC(int i) {
        return this.zzZIH[i + this.offset];
    }

    @Override // com.aspose.words.internal.zzZIO
    public final int zzYP(int i, int i2) {
        return this.zzZIG[i][i2 + this.zzZIN[i]];
    }

    public final int[] zzcU() {
        return this.zzZIH;
    }

    @Override // com.aspose.words.internal.zzZIO
    public final void zzq(int i, int i2, int i3) {
        this.zzZIG[i][i2 + this.zzZIN[i]] = i3;
    }

    public zzZIK(int i, int i2) {
        super(3, i, i2);
        this.zzZIG = new int[i2][];
        for (int i3 = 0; i3 < i2; i3++) {
            this.zzZIG[i3] = new int[i];
        }
        this.zzZIH = this.zzZIG[0];
    }
}
