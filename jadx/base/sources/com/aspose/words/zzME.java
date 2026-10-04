package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzME {
    private zzMC[] zzZoO;
    private zzPS zzZq9;

    public zzME(zzLT zzlt, int i) {
        this.zzZq9 = zzlt.zzZWe();
        this.zzZoO = new zzMC[zzlt.zzZUV().length];
        for (int i2 = 0; i2 < zzlt.zzZUV().length; i2++) {
            this.zzZoO[i2] = zzlt.zzZUV()[i2].zzMv(i);
        }
    }

    public final ArrayList<zzMD> zzQ(zzZBM zzzbm) {
        ArrayList<zzMD> arrayList = null;
        for (zzMC zzmc : this.zzZoO) {
            if (zzmc.zzZ(zzzbm)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>(this.zzZoO.length);
                }
                com.aspose.words.internal.zzZQG.zzZ(arrayList, zzmc.zzZVl());
            }
        }
        return arrayList;
    }

    public final void zzZP() {
        for (zzMC zzmc : this.zzZoO) {
            zzmc.zzZP();
        }
    }

    public final zzPS zzZWe() {
        return this.zzZq9;
    }
}
