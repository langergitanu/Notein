package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ2G implements Iterable<zzZ2H> {
    private ArrayList<zzZ2H> zzZm = new ArrayList<>();

    public final int getCount() {
        return this.zzZm.size();
    }

    @Override // java.lang.Iterable
    public final Iterator<zzZ2H> iterator() {
        return this.zzZm.iterator();
    }

    public final void zzO(zzZ2H zzz2h) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, zzz2h);
    }

    public final zzZ2H zzvd(int i) {
        return this.zzZm.get(i);
    }
}
