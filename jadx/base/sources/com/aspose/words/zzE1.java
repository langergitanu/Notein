package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzE1 {
    private com.aspose.words.internal.zzD3<zzE2> zzZfh = new com.aspose.words.internal.zzD3<>();

    public final void zzZ(zzE2 zze2) {
        this.zzZfh.set(zze2.getIndex(), zze2);
    }

    public final com.aspose.words.internal.zzD3<zzE2> zzZKU() {
        return this.zzZfh;
    }

    public final zzE1 zzZKV() {
        zzE1 zze1 = new zzE1();
        Iterator<zzE2> it = this.zzZfh.zzCJ().iterator();
        while (it.hasNext()) {
            zze1.zzZ(it.next().zzZKX());
        }
        return zze1;
    }
}
