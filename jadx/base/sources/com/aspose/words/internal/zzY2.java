package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzY2 {
    private boolean zzW7;
    private boolean zzW8;
    private zzY5 zzW9;
    private String zzZi;

    public zzY2(String str) {
        this(str, new zzY5());
    }

    public final String getText() {
        return this.zzZi;
    }

    public final boolean zzXf() {
        return this.zzW7;
    }

    public final boolean zzXg() {
        return this.zzW8;
    }

    public final zzY5 zzXh() {
        return this.zzW9;
    }

    public zzY2(String str, zzY5 zzy5) {
        this(str, zzy5, true, false);
    }

    public zzY2(String str, boolean z, boolean z2) {
        this(str, new zzY5(), z, z2);
    }

    private zzY2(String str, zzY5 zzy5, boolean z, boolean z2) {
        this.zzZi = str;
        this.zzW9 = zzy5;
        this.zzW8 = z;
        this.zzW7 = z2;
    }
}
