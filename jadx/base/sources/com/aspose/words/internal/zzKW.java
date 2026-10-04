package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzKW {
    private final Iterator zzCA;
    private Object zzCz;

    public zzKW(Iterator it) {
        this.zzCA = it;
    }

    public final Object getCurrent() {
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
