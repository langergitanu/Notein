package com.aspose.words.internal;

import com.aspose.words.internal.zzZ4M;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzYX5<T extends zzZ4M> implements zzZ4D<T> {
    public zzYX5() {
        zzZ0L.isReady();
        if (zzZ5L.zzXH0()) {
            throw new zzZ0H("Attempt to create unapproved factory in approved only mode");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.aspose.words.internal.zzZ4E
    /* JADX INFO: renamed from: zzS, reason: merged with bridge method [inline-methods] */
    public zzZ4Q<T> zzY(zzZ5S zzz5s, T t) {
        if (zzZ5L.zzXH0()) {
            throw new zzZ0H("Attempt to create unapproved algorithm in approved only mode", t.zzXGV());
        }
        return zzR(zzz5s, t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.aspose.words.internal.zzZ4E
    /* JADX INFO: renamed from: zzW, reason: merged with bridge method [inline-methods] */
    public zzZ4O<T> zzZ(zzZ5R zzz5r, T t) {
        if (zzZ5L.zzXH0()) {
            throw new zzZ0H("Attempt to create unapproved algorithm in approved only mode", t.zzXGV());
        }
        return zzV(zzz5r, t);
    }

    public abstract zzZ4Q<T> zzR(zzZ5S zzz5s, T t);

    public abstract zzZ4O<T> zzV(zzZ5R zzz5r, T t);
}
