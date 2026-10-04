package com.aspose.words;

import com.aspose.words.internal.C22244OooO0o0;

/* JADX INFO: loaded from: classes6.dex */
final class zzZM7 extends zzZMB {
    private zzZ8M zzYvN;

    public zzZM7(DocumentBase documentBase, zzZ8M zzz8m) {
        super(documentBase, zzz8m);
        this.zzYvN = zzz8m;
    }

    private com.aspose.words.internal.zzZQ4 zzT(com.aspose.words.internal.zzZQ4 zzzq4, long j) {
        long jZzU = zzU(zzzq4, j);
        int iZzYW5 = this.zzYvN.zzYW5();
        if (iZzYW5 == 0) {
            return new com.aspose.words.internal.zzZQ4(zzzq4.zzZE(), jZzU);
        }
        if (iZzYW5 == 1) {
            return com.aspose.words.internal.zzZQ4.zzX(zzzq4.zzkw() - Float.intBitsToFloat((int) jZzU), zzzq4.zzZo(), zzzq4.zzkw(), com.aspose.words.internal.zzZPW.zzYz(jZzU) + zzzq4.zzZo());
        }
        if (iZzYW5 == 3) {
            return com.aspose.words.internal.zzZQ4.zzX(zzzq4.zzZm(), zzzq4.zzZn() - com.aspose.words.internal.zzZPW.zzYz(jZzU), Float.intBitsToFloat((int) jZzU) + zzzq4.zzZm(), zzzq4.zzZn());
        }
        if (iZzYW5 == 4) {
            return com.aspose.words.internal.zzZQ4.zzX(zzzq4.zzkw() - Float.intBitsToFloat((int) jZzU), zzzq4.zzZn() - com.aspose.words.internal.zzZPW.zzYz(jZzU), zzzq4.zzkw(), zzzq4.zzZn());
        }
        int i = (int) jZzU;
        return new com.aspose.words.internal.zzZQ4(C22244OooO0o0.OooO00o(zzzq4, 2.0f, zzzq4.zzZm()) - (Float.intBitsToFloat(i) / 2.0f), ((zzzq4.getHeight() / 2.0f) + zzzq4.zzZo()) - (com.aspose.words.internal.zzZPW.zzYz(jZzU) / 2.0f), Float.intBitsToFloat(i), com.aspose.words.internal.zzZPW.zzYz(jZzU));
    }

    private long zzU(com.aspose.words.internal.zzZQ4 zzzq4, long j) {
        if (this.zzYvN.zzYW6() == 0) {
            return j;
        }
        this.zzYvN.zzYW6();
        int i = (int) j;
        float fMin = Math.min(zzzq4.getWidth() / Float.intBitsToFloat(i), zzzq4.getHeight() / com.aspose.words.internal.zzZPW.zzYz(j));
        return com.aspose.words.internal.zzZPW.zzG(Float.intBitsToFloat(i) * fMin, com.aspose.words.internal.zzZPW.zzYz(j) * fMin);
    }

    private void zzZ5V() throws Exception {
        byte[] bArrZzZ6n = this.zzYvN.zzZ6n();
        if (bArrZzZ6n == null) {
            return;
        }
        com.aspose.words.internal.zzZQ4 zzzq4ZzZ63 = zzZ63();
        if (this.zzYvN.zzYW6() == 1) {
            this.zzYvS.zzX(new com.aspose.words.internal.zzZP(zzzq4ZzZ63.zzZE(), zzzq4ZzZ63.getSize(), bArrZzZ6n));
            return;
        }
        com.aspose.words.internal.zzEG zzegZzZT = com.aspose.words.internal.zzEF.zzZT(bArrZzZ6n);
        com.aspose.words.internal.zzZQ4 zzzq4ZzT = zzT(zzzq4ZzZ63, com.aspose.words.internal.zzZPW.zzG((float) zzegZzZT.getWidthPoints(), (float) zzegZzZT.getHeightPoints()));
        if (!this.zzYvN.zzYW4()) {
            com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
            zzg.zzZ(com.aspose.words.internal.zzP8.zzM(zzzq4ZzZ63));
            zzg.zzX(new com.aspose.words.internal.zzZP(zzzq4ZzT.zzZE(), zzzq4ZzT.getSize(), bArrZzZ6n));
            this.zzYvS.zzX((com.aspose.words.internal.zzZL) zzg);
            return;
        }
        com.aspose.words.internal.zzOH zzoh = new com.aspose.words.internal.zzOH(bArrZzZ6n, 0);
        zzoh.zzL(com.aspose.words.internal.zzP9.zzZ(new com.aspose.words.internal.zzZQ4(0.0f, 0.0f, zzegZzZT.getWidth(), zzegZzZT.getHeight()), zzzq4ZzT));
        com.aspose.words.internal.zzZG zzzgZzW = com.aspose.words.internal.zzZG.zzW(zzzq4ZzZ63);
        zzzgZzW.zzY(zzoh);
        this.zzYvS.zzX(zzzgZzW);
    }

    @Override // com.aspose.words.zzZMB
    public final void zzZ68() throws Exception {
        zzZ66();
        zzZ64();
        zzZ5V();
    }
}
