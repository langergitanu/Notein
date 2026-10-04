package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzYQQ extends Exception {
    private Throwable zzVWy;

    public zzYQQ(String str, Throwable th) {
        super(str);
        this.zzVWy = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.zzVWy;
    }

    public zzYQQ(String str) {
        this(str, null);
    }
}
