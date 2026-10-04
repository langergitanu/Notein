package com.aspose.words.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
final class zzYU3 extends IOException {
    private final Throwable zzWIA;

    public zzYU3(String str, Throwable th) {
        super(str);
        this.zzWIA = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.zzWIA;
    }
}
