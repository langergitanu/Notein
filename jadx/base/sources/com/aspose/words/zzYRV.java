package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYRV {
    private ArrayList<zzYRW> zzXPD = new ArrayList<>();

    public final zzYRU zzEJ(String str) {
        Iterator<zzYRW> it = this.zzXPD.iterator();
        while (it.hasNext()) {
            zzYRU zzyruZzEI = it.next().zzYwh().zzEI(str);
            if (zzyruZzEI != null) {
                return zzyruZzEI;
            }
        }
        return null;
    }

    public final void zzZ(zzYRW zzyrw) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzXPD, zzyrw);
    }
}
