package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zzYV2 extends Exception {
    private Throwable zzWIA;

    public zzYV2() {
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.zzWIA;
    }

    public zzYV2(String str) {
        super(str);
    }

    public zzYV2(String str, Throwable th) {
        super(str);
        this.zzWIA = th;
    }
}
