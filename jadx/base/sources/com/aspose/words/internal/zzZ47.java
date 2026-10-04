package com.aspose.words.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class zzZ47 extends IOException {
    private final Throwable zzWIA;

    public zzZ47(String str, Throwable th) {
        super(str);
        this.zzWIA = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.zzWIA;
    }
}
