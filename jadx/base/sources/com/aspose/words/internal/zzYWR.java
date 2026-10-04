package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYWR extends AssertionError {
    private final Throwable zzWIA;

    public zzYWR(String str) {
        this(str, null);
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.zzWIA;
    }

    public zzYWR(String str, Throwable th) {
        super(str);
        this.zzWIA = th;
    }
}
