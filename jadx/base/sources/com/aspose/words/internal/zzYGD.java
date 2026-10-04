package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYGD extends IllegalStateException {
    private Throwable zzWIA;

    public zzYGD(String str, Throwable th) {
        super(str);
        this.zzWIA = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.zzWIA;
    }
}
