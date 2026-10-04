package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzKV<T> {
    private Iterator<T> zzCA;
    private T zzCz;

    public zzKV(Iterator<T> it) {
        this.zzCA = it;
    }

    public final T getCurrent() {
        return this.zzCz;
    }

    public final boolean moveNext() {
        if (this.zzCA.hasNext()) {
            this.zzCz = this.zzCA.next();
            return true;
        }
        this.zzCz = null;
        return false;
    }
}
