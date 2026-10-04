package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzDH extends zzDK {
    private ArrayList<zzDK> zzZc = new ArrayList<>();

    public final ArrayList<zzDK> zzQw() {
        return this.zzZc;
    }

    @Override // com.aspose.words.internal.zzDK
    public final void zzZ(zzGM zzgm) {
        Iterator<zzDK> it = this.zzZc.iterator();
        while (it.hasNext()) {
            it.next().zzZ(zzgm);
        }
    }
}
