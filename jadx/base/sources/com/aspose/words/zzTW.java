package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzTW implements zzZB1 {
    private ArrayList<zzZB1> zzZt2 = new ArrayList<>();

    @Override // com.aspose.words.zzZB1
    public final void zzZ(zzYWB zzywb) throws Exception {
        Iterator<zzZB1> it = this.zzZt2.iterator();
        while (it.hasNext()) {
            it.next().zzZ(zzywb);
        }
    }

    public final void zzZ(zzZB1 zzzb1) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZt2, zzzb1);
    }
}
