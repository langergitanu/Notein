package com.aspose.words.internal;

import com.aspose.words.internal.zzZ4M;
import com.aspose.words.internal.zzZ5R;
import com.aspose.words.internal.zzZ5S;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzYXD<T extends zzZ4M, P extends zzZ5R, S extends zzZ5S> implements zzZ5U<T, P, S> {
    private T zzWil;

    public zzYXD(T t) {
        zzZ0L.isReady();
        if (zzZ5L.zzXH0()) {
            throw new zzZ0H("Attempt to create unapproved factory in approved only mode");
        }
        this.zzWil = t;
    }

    public abstract zzZ3G<P, S> zzXDI();

    @Override // com.aspose.words.internal.zzZ5U
    public final zzZ3G<P, S> zzXH4() {
        if (zzZ5L.zzXH0()) {
            throw new zzZ0H("Attempt to generate key for unapproved algorithm in approved only mode");
        }
        return zzXDI();
    }

    public final T zzXH6() {
        return this.zzWil;
    }
}
