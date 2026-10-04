package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY0K extends zzY0I {
    private float zzWUn;
    private float zzWUo;
    private float zzWUp;
    private float zzWUq;

    @Override // com.aspose.words.zzY0I
    public final long zzXb(long j) throws Exception {
        float fIntBitsToFloat = Float.intBitsToFloat((int) j) - this.zzWUq;
        float fZzYC = com.aspose.words.internal.zzZPY.zzYC(j) - this.zzWUp;
        float f = fIntBitsToFloat / this.zzWUo;
        float f2 = fZzYC / this.zzWUn;
        if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        long jZzZ = com.aspose.words.internal.zzP1.zzZ(this.zzZ3Q[0], this.zzWUl[0] * f);
        long jZzZ2 = com.aspose.words.internal.zzP1.zzZ(this.zzZ3Q[1], f * this.zzWUl[1]);
        return com.aspose.words.internal.zzJ6.zzV(jZzZ, jZzZ2, com.aspose.words.internal.zzJ6.zzO(jZzZ, jZzZ2) * f2);
    }

    @Override // com.aspose.words.zzY0I
    public final void zzZzf() throws Exception {
        super.zzZzf();
        this.zzWUq = this.zzZ3N.zzZm();
        this.zzWUp = this.zzZ3N.zzZo();
        this.zzWUo = this.zzZ3N.getWidth();
        this.zzWUn = this.zzZ3N.getHeight();
    }
}
