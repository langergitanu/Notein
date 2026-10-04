package com.aspose.words;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYKC {
    private static int zzXD3 = 4;
    private com.aspose.words.internal.zzOI[] zzXD4;
    private com.aspose.words.internal.zzZG[] zzXD5 = new com.aspose.words.internal.zzZG[zzXD3];

    public zzYKC() {
        zzYmq();
    }

    private void zzYmq() {
        com.aspose.words.internal.zzOI[] zzoiArr = new com.aspose.words.internal.zzOI[zzXD3];
        this.zzXD4 = zzoiArr;
        zzoiArr[0] = new com.aspose.words.internal.zzOI(new com.aspose.words.internal.zzPV(102, com.aspose.words.internal.zzPV.zzKa));
        this.zzXD4[1] = new com.aspose.words.internal.zzOI(new com.aspose.words.internal.zzPV(51, com.aspose.words.internal.zzPV.zzKa));
        this.zzXD4[2] = new com.aspose.words.internal.zzOI(new com.aspose.words.internal.zzPV(102, com.aspose.words.internal.zzPV.zzI5));
        this.zzXD4[3] = new com.aspose.words.internal.zzOI(new com.aspose.words.internal.zzPV(51, com.aspose.words.internal.zzPV.zzI5));
    }

    private void zzpE(int i) {
        com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG();
        zzzg.zzY(this.zzXD4[i]);
        com.aspose.words.internal.zzZQG.zzZ(zzzg.zzZ0().zzO7(), new com.aspose.words.internal.zzP5());
        this.zzXD5[i] = zzzg;
    }

    private com.aspose.words.internal.zzZG zzpF(int i) {
        if (this.zzXD5[i] == null) {
            zzpE(i);
        }
        return this.zzXD5[i];
    }

    public final com.aspose.words.internal.zzZG zzYmm() {
        return zzpF(3);
    }

    public final com.aspose.words.internal.zzZG zzYmn() {
        return zzpF(2);
    }

    public final com.aspose.words.internal.zzZG zzYmo() {
        return zzpF(1);
    }

    public final com.aspose.words.internal.zzZG zzYmp() {
        return zzpF(0);
    }

    public final Collection<com.aspose.words.internal.zzZG> zzYmr() {
        ArrayList arrayList = new ArrayList();
        com.aspose.words.internal.zzZG zzzg = this.zzXD5[0];
        if (zzzg != null) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzZG>) arrayList, zzzg);
        }
        com.aspose.words.internal.zzZG zzzg2 = this.zzXD5[1];
        if (zzzg2 != null) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzZG>) arrayList, zzzg2);
        }
        com.aspose.words.internal.zzZG zzzg3 = this.zzXD5[2];
        if (zzzg3 != null) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzZG>) arrayList, zzzg3);
        }
        com.aspose.words.internal.zzZG zzzg4 = this.zzXD5[3];
        if (zzzg4 != null) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzZG>) arrayList, zzzg4);
        }
        return arrayList;
    }

    public void zzZ(int i, com.aspose.words.internal.zzOS zzos) {
    }

    public void zzZ(int i, com.aspose.words.internal.zzPZ zzpz, int i2) {
    }
}
