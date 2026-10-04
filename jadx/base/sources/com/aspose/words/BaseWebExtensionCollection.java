package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseWebExtensionCollection<T> implements Iterable<T> {
    private ArrayList<T> zzZm = new ArrayList<>();

    public void add(T t) {
        if (t == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: item");
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, t);
    }

    public void clear() {
        this.zzZm.clear();
    }

    public T get(int i) {
        return this.zzZm.get(i);
    }

    public int getCount() {
        return this.zzZm.size();
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this.zzZm.iterator();
    }

    public void remove(int i) {
        this.zzZm.remove(i);
    }

    public void set(int i, T t) {
        this.zzZm.set(i, t);
    }
}
