package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ6M extends Exception {
    Exception zzWn7;

    public zzZ6M(String str, Exception exc) {
        super(str);
        this.zzWn7 = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.zzWn7;
    }

    public final Exception zzXHn() {
        return this.zzWn7;
    }
}
