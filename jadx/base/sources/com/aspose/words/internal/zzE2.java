package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zzE2 {
    private zzDU zzvJ;

    public final ArrayList<zzEB> zzDu() {
        return this.zzvJ.zzDg().zzDu();
    }

    public final zzDU zzDv() {
        return this.zzvJ;
    }

    public final zzE7 zzVK(int i) {
        for (zzE7 zze7 : this.zzvJ.zzDf()) {
            if (zze7.zzDy() == i && zze7.zzDB() == 1) {
                return zze7;
            }
        }
        return null;
    }

    public final int zzVL(int i) {
        return ((zzE9) this.zzvJ.zzDg().zzDu().get(zzVM(i))).zzDA();
    }

    public final int zzVM(int i) {
        for (int i2 = 0; i2 < this.zzvJ.zzDg().zzDu().size(); i2++) {
            if (this.zzvJ.zzDg().zzDu().get(i2).zzDB() == i) {
                return i2;
            }
        }
        return -1;
    }

    public final void zzZ(zzDU zzdu) {
        this.zzvJ = zzdu;
    }
}
