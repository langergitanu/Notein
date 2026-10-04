package com.google.android.gms.internal.mlkit_translate;

/* JADX INFO: loaded from: classes7.dex */
public class zzcf extends RuntimeException {
    public zzcf(String str) {
        super("Did not consume the entire document.");
    }

    public zzcf(String str, Throwable th) {
        super(str, th);
    }

    public zzcf(Throwable th) {
        super(th);
    }
}
