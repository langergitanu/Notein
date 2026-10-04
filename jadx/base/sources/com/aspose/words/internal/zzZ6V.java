package com.aspose.words.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ6V extends IOException {
    private Throwable zzWIA;

    public zzZ6V(String str, Throwable th) {
        super(str);
        this.zzWIA = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.zzWIA;
    }
}
