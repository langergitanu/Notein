package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzCW extends IllegalStateException {
    private Class zzuo;
    private Object zzup;

    public zzCW(String str) {
        super(str);
    }

    public final Object zzCA() {
        return this.zzup;
    }

    public final Class zzCz() {
        return this.zzuo;
    }

    public zzCW(String str, Object obj, Class cls) {
        this(str);
        this.zzup = obj;
        this.zzuo = cls;
    }
}
