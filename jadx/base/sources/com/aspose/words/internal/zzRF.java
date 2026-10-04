package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzRF extends zzYR {
    private float[] zzMN;
    private int zzMO;
    private int zzMP;

    public zzRF(zzZG zzzg, zz6I zz6i) {
        super(zzzg, zz6i);
        this.zzMP = zzzg.zzZ2().getDashStyle();
        this.zzMO = zzzg.zzZ2().zzNJ();
        this.zzMN = zzzg.zzZ2().zzNH();
    }

    @Override // com.aspose.words.internal.zzYR
    public final void zzZ(ArrayList<zzOS> arrayList, ArrayList<zzOS> arrayList2) {
    }

    @Override // com.aspose.words.internal.zzYR
    public final void zzZ(ArrayList<zzZG> arrayList, zzZG zzzg) throws Exception {
        if (zzYt()) {
            zzRG.zzZ(arrayList, zzzg, this.zzMP, this.zzMO, this.zzMN);
        } else {
            zzZQG.zzZ(arrayList, zzzg);
        }
    }
}
