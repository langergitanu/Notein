package com.google.common.collect;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes8.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractSequentialIterator<T> extends UnmodifiableIterator<T> {
    private T nextOrNull;

    public AbstractSequentialIterator(T t) {
        this.nextOrNull = t;
    }

    public abstract T computeNext(T t);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.nextOrNull != null;
    }

    @Override // java.util.Iterator
    public final T next() {
        T t = this.nextOrNull;
        if (t == null) {
            throw new NoSuchElementException();
        }
        this.nextOrNull = computeNext(t);
        return t;
    }
}
