package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zz4Q {
    private zz4O zzji;
    private int zzjj;
    private zzZQ9 zzjk;
    private String zzjl;
    private String zzjm;
    private zzWZ zzjn;

    public zz4Q(zzWZ zzwz, String str, String str2, zzZQ9 zzzq9, int i, zz4O zz4o) {
        zzZQ9 zzzq92 = zzZQ9.zz35;
        this.zzji = zz4o;
        this.zzjn = zzwz;
        this.zzjm = str;
        this.zzjl = str2;
        this.zzjk = zzzq9;
        this.zzjj = i;
    }

    public final int getHashAlgorithm() {
        return this.zzjj;
    }

    public final String getLocation() {
        return this.zzjl;
    }

    public final String getReason() {
        return this.zzjm;
    }

    public final zz4O zzuT() {
        return this.zzji;
    }

    public final zzZQ9 zzuU() {
        return this.zzjk;
    }

    public final zzWZ zzuV() {
        return this.zzjn;
    }
}
