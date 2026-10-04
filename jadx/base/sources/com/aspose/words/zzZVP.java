package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZVP implements zzZBP {
    @Override // com.aspose.words.zzZBP
    public final int zzV(com.aspose.words.internal.zzQG[] zzqgArr) {
        int count = 0;
        for (com.aspose.words.internal.zzQG zzqg : zzqgArr) {
            Iterator<com.aspose.words.internal.zzQD> it = zzqg.zzQw().iterator();
            while (it.hasNext()) {
                count += it.next().getCount();
            }
        }
        return count;
    }
}
