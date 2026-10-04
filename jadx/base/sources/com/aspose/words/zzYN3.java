package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYN3 implements Iterable<Integer>, Iterator<Integer> {
    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public abstract Integer next();

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
