package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzBY<T> {
    private T zzth;

    public final T getValue() {
        T t = this.zzth;
        if (t != null) {
            return t;
        }
        T tZzBL = zzBL();
        this.zzth = tZzBL;
        return tZzBL;
    }

    public abstract T zzBL();
}
