package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZI4 {
    private boolean zzYqJ;

    public abstract String getUri() throws Exception;

    public final void write(String str) throws Exception {
        zzKL(str);
        this.zzYqJ = true;
    }

    public abstract void zzKL(String str) throws Exception;

    public final boolean zzZ2s() {
        return this.zzYqJ;
    }
}
