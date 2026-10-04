package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZD6 extends IllegalStateException {
    private Throwable zzWIA;

    public zzZD6(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.zzWIA;
    }

    public zzZD6(String str, Throwable th) {
        super(str);
        this.zzWIA = th;
    }
}
