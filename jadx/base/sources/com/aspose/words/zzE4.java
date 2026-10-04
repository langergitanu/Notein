package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzE4 {
    private long zzZbI;
    private long zzZbJ;
    private long zzZbK;
    private long zzZbL;
    private long zzZi7;

    public zzE4(long j, long j2, long j3, long j4) {
        this.zzZi7 = 0L;
        this.zzZbL = j;
        this.zzZbK = j2;
        this.zzZbJ = j3;
        this.zzZbI = j4;
        this.zzZi7 = com.aspose.words.internal.zzZPY.zzG((Float.intBitsToFloat((int) this.zzZbJ) + Float.intBitsToFloat((int) j)) / 2.0f, (com.aspose.words.internal.zzZPY.zzYC(this.zzZbJ) + com.aspose.words.internal.zzZPY.zzYC(this.zzZbL)) / 2.0f);
    }

    private long zzU(long j, float f) {
        int i = (int) j;
        return com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat(i) - ((Float.intBitsToFloat(i) - Float.intBitsToFloat((int) this.zzZi7)) * f), com.aspose.words.internal.zzZPY.zzYC(j) - ((com.aspose.words.internal.zzZPY.zzYC(j) - com.aspose.words.internal.zzZPY.zzYC(this.zzZi7)) * f));
    }

    public final long zzPT() {
        return this.zzZi7;
    }

    public final void zzR(float f) {
        this.zzZbL = zzU(this.zzZbL, f);
        this.zzZbK = zzU(this.zzZbK, f);
        this.zzZbJ = zzU(this.zzZbJ, f);
        this.zzZbI = zzU(this.zzZbI, f);
    }

    public final long[] zzZL3() {
        return new long[]{this.zzZbL, this.zzZbK, this.zzZbJ, this.zzZbI};
    }

    public final long zzZL4() {
        return this.zzZbI;
    }

    public final long zzZL5() {
        return this.zzZbJ;
    }

    public final long zzZL6() {
        return this.zzZbK;
    }

    public final long zzZL7() {
        return this.zzZbL;
    }

    public final com.aspose.words.internal.zzZQ4 zzZL8() {
        return com.aspose.words.internal.zzZQ4.zzX((Float.intBitsToFloat((int) this.zzZbK) + Float.intBitsToFloat((int) this.zzZbL)) / 2.0f, (com.aspose.words.internal.zzZPY.zzYC(this.zzZbI) + com.aspose.words.internal.zzZPY.zzYC(this.zzZbL)) / 2.0f, (Float.intBitsToFloat((int) this.zzZbJ) + Float.intBitsToFloat((int) this.zzZbI)) / 2.0f, (com.aspose.words.internal.zzZPY.zzYC(this.zzZbJ) + com.aspose.words.internal.zzZPY.zzYC(this.zzZbK)) / 2.0f);
    }
}
