package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zzYH1 extends Exception {

    /* JADX INFO: renamed from: ep */
    Throwable f50843ep;

    public zzYH1(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f50843ep;
    }

    public zzYH1(String str, Throwable th) {
        super(str);
        this.f50843ep = th;
    }
}
