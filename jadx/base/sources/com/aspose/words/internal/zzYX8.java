package com.aspose.words.internal;

import com.aspose.words.internal.zzZ4M;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzYX8<T extends zzZ4M> implements zzZ4J<T> {
    public zzYX8() {
        zzZ0L.isReady();
        if (zzZ5L.zzXH0()) {
            throw new zzZ0H("Attempt to create unapproved factory in approved only mode");
        }
    }
}
