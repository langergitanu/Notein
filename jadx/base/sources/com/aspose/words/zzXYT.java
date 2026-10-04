package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzXYT implements Iterable<zzXYU> {
    private ArrayList<zzXYU> zzZm = new ArrayList<>();

    public final void clear() {
        this.zzZm.clear();
    }

    public final int getCount() {
        return this.zzZm.size();
    }

    @Override // java.lang.Iterable
    public final Iterator<zzXYU> iterator() {
        return this.zzZm.iterator();
    }

    public final zzXYT zzXQA() {
        zzXYT zzxyt = new zzXYT();
        Iterator<zzXYU> it = iterator();
        while (it.hasNext()) {
            zzxyt.zzZ(it.next().zzXQB());
        }
        return zzxyt;
    }

    public final void zzZ(zzXYU zzxyu) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, zzxyu);
    }
}
