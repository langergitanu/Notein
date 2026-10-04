package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzYTT extends zzY3E {
    private int zzXSa;
    private int zzXSb;

    public zzYTT(int i) {
        this.zzXSb = i;
        this.zzXSa = -1;
    }

    private boolean zzYym() {
        return this.zzXSa >= 0;
    }

    public String toString() {
        String strZzWD = com.aspose.words.internal.zzJB.zzWD(this.zzXSb);
        if (!zzYym()) {
            return strZzWD;
        }
        return com.aspose.words.internal.zzZKN.zzZI(strZzWD, "." + com.aspose.words.internal.zzJB.zzWD(this.zzXSa));
    }

    @Override // com.aspose.words.zzY3E
    public final boolean zzZ(zzY3E zzy3e, int i) {
        zzYTT zzytt = (zzYTT) com.aspose.words.internal.zzZKW.zzZ(zzy3e, zzYTT.class);
        if (zzytt == null) {
            return false;
        }
        int iZzZ = zzZ(zzytt);
        if (i == 0) {
            return iZzZ == 0;
        }
        if (i == 1) {
            return iZzZ > 0;
        }
        if (i == 2) {
            return iZzZ >= 0;
        }
        if (i == 3) {
            return iZzZ < 0;
        }
        if (i == 4) {
            return iZzZ <= 0;
        }
        throw new IllegalStateException();
    }

    public zzYTT(int i, int i2) {
        this.zzXSb = i;
        this.zzXSa = i2;
    }

    private int zzZ(zzYTT zzytt) {
        int iZzZ7 = com.aspose.words.internal.zzZKR.zzZ7(this.zzXSb, zzytt.zzXSb);
        return (iZzZ7 == 0 && zzYym() && zzytt.zzYym()) ? com.aspose.words.internal.zzZKR.zzZ7(this.zzXSa, zzytt.zzXSa) : iZzZ7;
    }
}
