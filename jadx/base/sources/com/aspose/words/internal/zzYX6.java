package com.aspose.words.internal;

import com.aspose.words.internal.zzZ4M;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzYX6<T extends zzZ4M> implements zzZ4E<T> {
    public zzYX6() {
        zzZ0L.isReady();
        if (zzZ5L.zzXH0()) {
            throw new zzZ0H("Attempt to create unapproved factory in approved only mode");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.aspose.words.internal.zzZ4E
    /* JADX INFO: renamed from: zzT, reason: merged with bridge method [inline-methods] */
    public zzZ4R<T> zzY(zzZ5S zzz5s, T t) {
        if (zzZ5L.zzXH0()) {
            throw new zzZ0H("Attempt to create unapproved algorithm in approved only mode", t.zzXGV());
        }
        return zzV(zzz5s, t);
    }

    public abstract zzZ4R<T> zzV(zzZ5S zzz5s, T t);

    public abstract zzZ4P<T> zzX(zzZ5R zzz5r, T t);

    @Override // com.aspose.words.internal.zzZ4E
    public final zzZ4P<T> zzZ(zzZ5R zzz5r, T t) {
        if (zzZ5L.zzXH0()) {
            throw new zzZ0H("Attempt to create unapproved algorithm in approved only mode", t.zzXGV());
        }
        return zzX(zzz5r, t);
    }
}
