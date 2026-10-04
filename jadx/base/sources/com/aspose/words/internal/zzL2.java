package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzL2<T> implements Iterator<T> {
    private static Iterator<Object> zzCH = new zzL2();

    private zzL2() {
    }

    public static <T> Iterator<T> zzIX() {
        return (Iterator<T>) zzCH;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
