package com.aspose.words.internal;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzIM<T> implements zzFQ<T> {
    private HashMap<T, Boolean> zzyj;

    public zzIM() {
        this.zzyj = new HashMap<>();
    }

    @Override // com.aspose.words.internal.zzFQ
    public final boolean add(T t) {
        if (this.zzyj.containsKey(t)) {
            return false;
        }
        zzZQF.zzY(this.zzyj, t, Boolean.FALSE);
        return true;
    }

    public final void clear() {
        this.zzyj.clear();
    }

    @Override // com.aspose.words.internal.zzFQ
    public final boolean contains(T t) {
        return this.zzyj.containsKey(t);
    }

    public final int getCount() {
        return this.zzyj.size();
    }

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        return this.zzyj.keySet().iterator();
    }

    public final boolean remove(T t) {
        if (!this.zzyj.containsKey(t)) {
            return false;
        }
        zzZQF.zzY(this.zzyj, t);
        return true;
    }

    public zzIM(int i) {
        this.zzyj = new HashMap<>(i);
    }

    public zzIM(Iterable<T> iterable) {
        this.zzyj = new HashMap<>();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }
}
