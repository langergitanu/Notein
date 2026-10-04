package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZR0 extends Error {
    Exception zz3y;

    public zzZR0() {
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        Exception exc;
        String message = super.getMessage();
        if (message != null || (exc = this.zz3y) == null) {
            return message;
        }
        String message2 = exc.getMessage();
        return message2 == null ? this.zz3y.getClass().toString() : message2;
    }

    public zzZR0(String str, Exception exc) {
        super(str);
        this.zz3y = exc;
    }
}
