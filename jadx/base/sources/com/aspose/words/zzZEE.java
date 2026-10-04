package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZEE extends zzZE9 {
    private String mName;
    private boolean zzYkS;
    private boolean zzYkT;
    private zzZK8 zzYqY;

    public zzZEE(String str, boolean z, boolean z2, zzZK8 zzzk8) {
        super(3);
        com.aspose.words.internal.zzZYD.zzXk(str);
        this.mName = str;
        this.zzYkT = z;
        this.zzYkS = z2;
        this.zzYqY = zzzk8;
    }

    public final String getName() {
        return this.mName;
    }

    public final boolean zzYYo() {
        return this.zzYkS;
    }

    public final zzZK8 zzZ2B() {
        return this.zzYqY;
    }

    public final boolean zzZou() {
        return this.zzYkT;
    }
}
