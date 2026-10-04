package com.aspose.words;

import com.aspose.words.internal.C22243OooO0Oo;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ71 {
    private com.aspose.words.internal.zz7 zzYgA;
    private zzZ6R zzYj1;
    private zzZN8 zzYs5 = new zzZN8();
    private long zzDs = 0;
    private com.aspose.words.internal.zzZQC<com.aspose.words.internal.zz7> zzYA = new com.aspose.words.internal.zzZQC<>();

    public zzZ71(com.aspose.words.internal.zz7 zz7Var, zzZ6R zzz6r) {
        this.zzYgA = zz7Var;
        this.zzYj1 = zzz6r;
    }

    private static com.aspose.words.internal.zzP9 zzXD(long j) {
        return new com.aspose.words.internal.zzP9(1.0f, 0.0f, 0.0f, 1.0f, Float.intBitsToFloat((int) j), com.aspose.words.internal.zzZPY.zzYC(j));
    }

    public final com.aspose.words.internal.zzPV zz7(com.aspose.words.internal.zzPV zzpv) {
        return this.zzYs5.zz7(zzpv);
    }

    public final void zzL(com.aspose.words.internal.zz7 zz7Var) {
        this.zzYA.push(this.zzYgA);
        this.zzYgA.zzX(zz7Var);
        this.zzYgA = zz7Var;
    }

    public final com.aspose.words.internal.zzG zzP(long j, boolean z) {
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzg.zzW(zzXD(j));
        zzg.zzR(z);
        zzL(zzg);
        return zzg;
    }

    public final com.aspose.words.internal.zzPV zzQ(com.aspose.words.internal.zzPV zzpv, com.aspose.words.internal.zzPV zzpv2) {
        return this.zzYs5.zzQ(zzpv, zzpv2);
    }

    public final void zzS(com.aspose.words.internal.zzZL zzzl) {
        this.zzYgA.zzX(zzzl);
    }

    public final void zzU(com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzPV zzpv) {
        com.aspose.words.internal.zzZG zzzgZzW = com.aspose.words.internal.zzZG.zzW(zzzq4);
        zzzgZzW.zzX(new com.aspose.words.internal.zzOU(zzpv));
        zzS(zzzgZzW);
    }

    public final long zzXB(long j) {
        return C22243OooO0Oo.OooO00o(com.aspose.words.internal.zzZPY.zzYC(this.zzDs), Float.intBitsToFloat((int) j) + Float.intBitsToFloat((int) this.zzDs), j);
    }

    public final void zzXC(long j) {
        this.zzDs = j;
    }

    public final com.aspose.words.internal.zzG zzXE(long j) {
        return zzP(j, false);
    }

    public final zzZ6R zzYTR() {
        return this.zzYj1;
    }

    public final com.aspose.words.internal.zz7 zzYTS() {
        return this.zzYgA;
    }

    public final void zzZ(long[] jArr, com.aspose.words.internal.zzPV zzpv) {
        com.aspose.words.internal.zzZG zzzgZzZ = com.aspose.words.internal.zzZG.zzZ(jArr, false, true);
        zzzgZzZ.zzX(new com.aspose.words.internal.zzOU(zzpv));
        zzS(zzzgZzZ);
    }

    public final void zzZ7c() {
        this.zzYs5.zzZ7c();
    }

    public final com.aspose.words.internal.zzZQ4 zzZ9(com.aspose.words.internal.zzZQ4 zzzq4) {
        return new com.aspose.words.internal.zzZQ4(zzXB(zzzq4.zzZE()), zzzq4.getSize());
    }

    public final void zzZI() {
        this.zzYgA = this.zzYA.pop();
    }

    public final com.aspose.words.internal.zzZS zzy0(int i) {
        com.aspose.words.internal.zzZS zzzs = new com.aspose.words.internal.zzZS(i);
        zzL(zzzs);
        return zzzs;
    }

    public final boolean zzQ(Shading shading) {
        return this.zzYs5.zzZ(shading, this.zzYj1.getOptimizeOutput());
    }

    public final void zzU(Shading shading) {
        this.zzYs5.zzU(shading);
    }
}
