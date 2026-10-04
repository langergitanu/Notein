package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public class zzYT<T> implements Iterable<T> {
    private ArrayList<T> zzXK;

    public zzYT() {
        this.zzXK = new ArrayList<>();
    }

    public final void add(T t) {
        zzZQG.zzZ(this.zzXK, t);
    }

    public final void clear() {
        this.zzXK.clear();
    }

    public final T get(int i) {
        return this.zzXK.get(i);
    }

    public final int getCount() {
        return this.zzXK.size();
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this.zzXK.iterator();
    }

    public final void reverse() {
        Collections.reverse(this.zzXK);
    }

    public final void set(int i, T t) {
        this.zzXK.set(i, t);
    }

    public final void sort(Comparator<T> comparator) {
        Collections.sort(this.zzXK, comparator);
    }

    public final void zzH(int i) {
        this.zzXK.ensureCapacity(i);
    }

    public final void zzYw() {
        this.zzXK.remove(0);
    }

    public zzYT(int i) {
        this.zzXK = new ArrayList<>(i);
    }
}
