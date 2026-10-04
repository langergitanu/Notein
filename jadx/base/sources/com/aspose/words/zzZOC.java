package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZOC {
    zzZZH zzYzv = new zzZZH(0);
    zzY8X zzYzu = new zzY8X();
    zzY8W zzYzt = new zzY8W();

    public zzZOC(zzZRA zzzra, com.aspose.words.internal.zzZOX zzzox) throws Exception {
        if (zzzra.zzYHw) {
            zzZRG zzzrg = zzzra.zzYGE.zzXAv;
            if (zzzrg.zzYHJ > 0) {
                this.zzYzv.zzZ(zzzox, zzzrg);
            }
            zzZRG zzzrg2 = zzzra.zzYGE.zzXAw;
            int i = zzzrg2.zzYHJ;
            if (i > 0) {
                this.zzYzu.zzT(zzzox, zzzrg2.zzYHK, i);
            }
            zzZRG zzzrg3 = zzzra.zzYGE.zzXzk;
            int i2 = zzzrg3.zzYHJ;
            if (i2 > 0) {
                this.zzYzt.zzT(zzzox, zzzrg3.zzYHK, i2);
            }
        }
    }
}
