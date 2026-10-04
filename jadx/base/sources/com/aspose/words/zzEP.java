package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzEP {
    private float zzZcj;
    private long zzYV = 0;
    private com.aspose.words.internal.zzG zzZck = new com.aspose.words.internal.zzG();

    public final long getSize() {
        return this.zzYV;
    }

    public final void zzY(com.aspose.words.internal.zzG zzg, long j) {
        zzg.zzW(new com.aspose.words.internal.zzP9());
        zzg.zzZO().zzY(this.zzZcj, 0.0f, 0);
        this.zzZck.zzX((com.aspose.words.internal.zzZL) zzg);
        float fIntBitsToFloat = Float.intBitsToFloat((int) j) + 0.0f + this.zzZcj;
        this.zzZcj = fIntBitsToFloat;
        this.zzYV = com.aspose.words.internal.zzZPW.zzG(fIntBitsToFloat, Math.max(com.aspose.words.internal.zzZPW.zzYz(this.zzYV), com.aspose.words.internal.zzZPW.zzYz(j)));
    }

    public final com.aspose.words.internal.zzG zzZLL() {
        return this.zzZck;
    }

    public final void zzZl(float f) {
        this.zzZcj += f;
    }
}
