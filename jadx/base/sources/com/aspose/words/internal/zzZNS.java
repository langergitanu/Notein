package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZNS implements Iterable<zzZNT> {
    private ArrayList<zzZNT> zz8b = new ArrayList<>();

    public final int getCount() {
        return this.zz8b.size();
    }

    @Override // java.lang.Iterable
    public final Iterator<zzZNT> iterator() {
        return this.zz8b.iterator();
    }

    public final zzZNT zzQw(int i) {
        return this.zz8b.get(i);
    }

    public final void zzY(zzZNT zzznt) {
        this.zz8b.add(zzznt);
    }
}
