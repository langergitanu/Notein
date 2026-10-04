package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzQB extends zzMD {
    @Override // com.aspose.words.zzMD
    public final zzMC zzMv(int i) {
        return new zzQA(this, i);
    }

    public final zzQ7 zzZ(zzQB zzqb) {
        ArrayList arrayList = new ArrayList(1);
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzQI>) arrayList, new zzQI(this));
        return new zzQ7(zzqb, arrayList);
    }

    public abstract boolean zzZ(zzZBM zzzbm, int i);

    public boolean zzZWv() {
        return false;
    }
}
