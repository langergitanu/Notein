package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZLY implements Iterable<zzZLZ> {
    private List<zzZLZ> zzZSp = new ArrayList();

    public final void clear() {
        this.zzZSp.clear();
    }

    public final int getCount() {
        return this.zzZSp.size();
    }

    @Override // java.lang.Iterable
    public final Iterator<zzZLZ> iterator() {
        return this.zzZSp.iterator();
    }

    public final zzZLZ zzQt(int i) {
        return this.zzZSp.get(i);
    }

    public final boolean zzV(zzZLZ zzzlz) {
        return this.zzZSp.contains(zzzlz);
    }

    public final void zzW(zzZLZ zzzlz) {
        this.zzZSp.add(zzzlz);
    }
}
