package com.aspose.words.internal;

import com.aspose.words.internal.zzZ4M;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzYXB<T extends zzZ4M> implements zzZ5J<T> {
    public zzYXB() {
        zzZ0L.isReady();
        if (zzZ5L.zzXH0()) {
            throw new zzZ0H("Attempt to create unapproved factory in approved only mode");
        }
    }
}
