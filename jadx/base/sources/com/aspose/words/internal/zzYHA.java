package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zzYHA extends Exception {
    private Throwable zzWIA;

    public zzYHA(String str, Throwable th) {
        super(str);
        this.zzWIA = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.zzWIA;
    }
}
