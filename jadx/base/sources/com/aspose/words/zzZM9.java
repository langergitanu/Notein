package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZM9 extends zzZMB {
    private zzUX zzYvP;

    public zzZM9(DocumentBase documentBase, zzUX zzux) {
        super(documentBase, zzux);
        this.zzYvP = zzux;
    }

    private boolean zzZ5W() {
        return this.zzYvP.zzZZW() == 2;
    }

    private void zzZ5X() throws Exception {
        this.zzYvS.zzX(zzZLV.zzZ(this.zzYvP, this.zzYKc).zzZc(com.aspose.words.internal.zzZQ4.zzX(zzZ67().zzZm() + (this.zzYvP.zzZ6q() ? 9.0f : 3.0f), zzZ67().zzZo() + 3.0f, zzZ67().zzkw() - (zzZ5W() ? 16.0f : 3.0f), zzZ67().zzZn() - 2.0f)));
    }

    private void zzZ5Y() {
        if (zzZ5W()) {
            float fZzZ62 = zzZ62();
            com.aspose.words.internal.zzZQ4 zzzq4ZzX = com.aspose.words.internal.zzZQ4.zzX((zzZ67().zzkw() - fZzZ62) - 12.0f, zzZ67().zzZo() + fZzZ62, zzZ67().zzkw() - fZzZ62, zzZ67().zzZn() - fZzZ62);
            zzZe(zzzq4ZzX);
            int iZzZZV = this.zzYvP.zzZZV();
            if (iZzZZV == 1) {
                zzZf(zzzq4ZzX);
            } else if (iZzZZV == 2) {
                zzZg(zzzq4ZzX);
            } else {
                if (iZzZZV != 3) {
                    return;
                }
                zzZh(zzzq4ZzX);
            }
        }
    }

    private void zzZe(com.aspose.words.internal.zzZQ4 zzzq4) {
        com.aspose.words.internal.zzZG zzzgZzW = com.aspose.words.internal.zzZG.zzW(zzzq4);
        zzzgZzW.zzY(new com.aspose.words.internal.zzOI(com.aspose.words.internal.zzPV.zzYR(com.aspose.words.internal.zzZQ2.zz2y)));
        this.zzYvS.zzX(zzzgZzW);
        this.zzYvS.zzX(zzZMC.zzZm(zzzq4));
    }

    private void zzZf(com.aspose.words.internal.zzZQ4 zzzq4) {
        this.zzYvS.zzX(zzZMC.zzX(zzzq4, com.aspose.words.internal.zzPV.zzKa));
    }

    private void zzZg(com.aspose.words.internal.zzZQ4 zzzq4) {
        float width = ((zzzq4.getWidth() / 2.0f) + zzzq4.zzZm()) - 3.0f;
        float fZzZn = (zzzq4.zzZn() - 3.0f) - 1.2f;
        com.aspose.words.internal.zzZG zzzgZzW = com.aspose.words.internal.zzZG.zzW(new com.aspose.words.internal.zzZQ4(width, fZzZn, 1.2f, 1.2f));
        zzzgZzW.zzY(new com.aspose.words.internal.zzOI(com.aspose.words.internal.zzPV.zzKa));
        com.aspose.words.internal.zzZG zzzgZzW2 = com.aspose.words.internal.zzZG.zzW(new com.aspose.words.internal.zzZQ4(2.4f + width, fZzZn, 1.2f, 1.2f));
        zzzgZzW2.zzY(new com.aspose.words.internal.zzOI(com.aspose.words.internal.zzPV.zzKa));
        com.aspose.words.internal.zzZG zzzgZzW3 = com.aspose.words.internal.zzZG.zzW(new com.aspose.words.internal.zzZQ4(width + 4.8f, fZzZn, 1.2f, 1.2f));
        zzzgZzW3.zzY(new com.aspose.words.internal.zzOI(com.aspose.words.internal.zzPV.zzKa));
        this.zzYvS.zzX(zzzgZzW);
        this.zzYvS.zzX(zzzgZzW2);
        this.zzYvS.zzX(zzzgZzW3);
    }

    private void zzZh(com.aspose.words.internal.zzZQ4 zzzq4) {
        com.aspose.words.internal.zzZG zzzgZzW = com.aspose.words.internal.zzZG.zzW(new com.aspose.words.internal.zzZQ4(((zzzq4.getWidth() / 2.0f) + zzzq4.zzZm()) - 3.0f, (zzzq4.zzZn() - 3.0f) - 1.2f, 3.6000001f, 1.2f));
        zzzgZzW.zzY(new com.aspose.words.internal.zzOI(com.aspose.words.internal.zzPV.zzKa));
        this.zzYvS.zzX(zzzgZzW);
    }

    @Override // com.aspose.words.zzZMB
    public final void zzZ68() throws Exception {
        zzZ66();
        zzZ64();
        zzZ5X();
        zzZ5Y();
    }
}
