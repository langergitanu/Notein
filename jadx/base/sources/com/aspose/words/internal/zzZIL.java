package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZIL extends zzZIO {
    float[] zzZII;
    float[][] zzZIJ;

    public zzZIL(int i, int i2) {
        super(4, i, i2);
        this.zzZIJ = new float[i2][];
        for (int i3 = 0; i3 < i2; i3++) {
            this.zzZIJ[i3] = new float[i];
        }
        this.zzZII = this.zzZIJ[0];
    }

    @Override // com.aspose.words.internal.zzZIO
    public final int zzPC(int i) {
        return (int) this.zzZII[i + this.offset];
    }

    @Override // com.aspose.words.internal.zzZIO
    public final int zzYP(int i, int i2) {
        return (int) this.zzZIJ[i][i2 + this.zzZIN[i]];
    }

    public final float[] zzcV() {
        return this.zzZII;
    }

    @Override // com.aspose.words.internal.zzZIO
    public final void zzq(int i, int i2, int i3) {
        this.zzZIJ[i][i2 + this.zzZIN[i]] = i3;
    }
}
