package com.aspose.words.internal;

import java.util.LinkedList;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZQE<E> extends LinkedList<E> {
    public final void zzZ(zzZQD<E> zzzqd) {
        addLast(zzzqd.getValue());
    }

    public final zzZQD<E> zzl6() {
        try {
            return new zzZQD<>(getFirst(), this);
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    public final zzZQD<E> zzl7() {
        try {
            return new zzZQD<>(getLast(), this);
        } catch (NoSuchElementException unused) {
            return null;
        }
    }
}
