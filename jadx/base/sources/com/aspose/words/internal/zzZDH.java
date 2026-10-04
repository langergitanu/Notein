package com.aspose.words.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZDH extends IOException {
    private Throwable zzWIA;

    public zzZDH(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.zzWIA;
    }

    public zzZDH(String str, Throwable th) {
        super(str);
        this.zzWIA = th;
    }
}
