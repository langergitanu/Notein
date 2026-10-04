package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zzZ14 extends AssertionError {
    private final Throwable zzWIA;

    public zzZ14(String str) {
        this(str, null);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.zzWIA;
    }

    public zzZ14(String str, Throwable th) {
        super(str);
        this.zzWIA = th;
    }
}
