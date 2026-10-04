package com.aspose.words.internal;

import com.aspose.words.internal.zzZ4M;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzYX7<T extends zzZ4M> implements zzZ4E<T> {
    public zzYX7() {
        zzZ0L.isReady();
        if (zzZ5L.zzXH0()) {
            throw new zzZ0H("Attempt to create unapproved factory in approved only mode");
        }
    }

    public abstract zzZ4S<T> zzU(zzZ5S zzz5s, T t);

    public abstract zzZ4P<T> zzX(zzZ5R zzz5r, T t);

    @Override // com.aspose.words.internal.zzZ4E
    public final zzZ4S<T> zzY(zzZ5S zzz5s, T t) {
        if (zzZ5L.zzXH0()) {
            throw new zzZ0H("Attempt to create unapproved algorithm in approved only mode", t.zzXGV());
        }
        return zzU(zzz5s, t);
    }

    @Override // com.aspose.words.internal.zzZ4E
    public final zzZ4P<T> zzZ(zzZ5R zzz5r, T t) {
        if (zzZ5L.zzXH0()) {
            throw new zzZ0H("Attempt to create unapproved algorithm in approved only mode", t.zzXGV());
        }
        return zzX(zzz5r, t);
    }
}
