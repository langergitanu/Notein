package com.google.common.base;

import java.lang.ref.PhantomReference;

/* JADX INFO: loaded from: classes6.dex */
@ElementTypesAreNonnullByDefault
public abstract class FinalizablePhantomReference<T> extends PhantomReference<T> implements FinalizableReference {
    public FinalizablePhantomReference(T t, FinalizableReferenceQueue finalizableReferenceQueue) {
        super(t, finalizableReferenceQueue.queue);
        finalizableReferenceQueue.cleanUp();
    }
}
