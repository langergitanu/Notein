package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zz0E {
    private String mName;
    private int zzYG;
    private Object zzth;

    public zz0E(int i, String str, Object obj) {
        this.zzYG = i;
        this.mName = str;
        this.zzth = obj;
    }

    public final int getId() {
        return this.zzYG;
    }

    public final String getName() {
        return this.mName;
    }

    public final Object getValue() {
        return this.zzth;
    }

    public final boolean zzsa() {
        return zzZYD.zzXk(this.mName);
    }
}
