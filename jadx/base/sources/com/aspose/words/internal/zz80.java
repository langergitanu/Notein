package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
abstract class zz80 implements zzG4 {
    private ArrayList<zzGD> zzqS = new ArrayList<>();

    public final void onChanged() {
        Iterator<zzGD> it = this.zzqS.iterator();
        while (it.hasNext()) {
            it.next().zzFu();
        }
    }

    @Override // com.aspose.words.internal.zzG4
    public abstract zzP9 zzMq();

    @Override // com.aspose.words.internal.zzG4
    public final long zzR(long j) {
        return zzMq().zzR(j);
    }

    @Override // com.aspose.words.internal.zzG4
    public final void zzY(zzGD zzgd) {
        zzZQG.zzZ(this.zzqS, zzgd);
    }

    @Override // com.aspose.words.internal.zzG4
    public final void zzZ(long[] jArr) {
        zzMq().zzZ(jArr);
    }
}
