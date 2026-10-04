package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYL7 {
    private int zzXDN;
    private int zzXDO;
    private int zzXDP;
    private int zzXDQ;
    private float zzZif = Float.MAX_VALUE;

    public zzYL7(zzYLC zzylc, zzYLC zzylc2, int i, int i2) {
        this.zzXDO = i;
        this.zzXDN = i2;
        zzR(zzylc, zzylc2);
    }

    private void zzR(zzYLC zzylc, zzYLC zzylc2) {
        for (int i = 0; i < zzylc.zzYnj(); i++) {
            for (int i2 = 0; i2 < zzylc2.zzYnj(); i2++) {
                float fZzO = com.aspose.words.internal.zzJ6.zzO(zzylc.zzq1(i).zzYn8(), zzylc2.zzq1(i2).zzYn8());
                if (fZzO < this.zzZif) {
                    this.zzZif = fZzO;
                    this.zzXDQ = i;
                    this.zzXDP = i2;
                }
            }
        }
    }

    public final int zzYn4() {
        return this.zzXDN;
    }

    public final int zzYn5() {
        return this.zzXDO;
    }

    public final int zzYn6() {
        return this.zzXDP;
    }

    public final int zzYn7() {
        return this.zzXDQ;
    }

    public final float zzZSd() {
        return this.zzZif;
    }
}
