package com.aspose.words.internal;

import com.aspose.words.internal.zzZ4M;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzYX4<T extends zzZ4M> implements zzZ45 {
    public zzYX4() {
        zzZ0L.isReady();
        if (zzZ5L.zzXH0()) {
            throw new zzZ0H("Attempt to create unapproved factory in approved only mode");
        }
    }

    public abstract zzZ46 zzXDT();

    @Override // com.aspose.words.internal.zzZ45
    public final zzZ46 zzXGH() {
        if (zzZ5L.zzXH0()) {
            throw new zzZ0H("Attempt to generate key for unapproved algorithm in approved only mode");
        }
        return zzXDT();
    }
}
