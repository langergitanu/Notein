package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYF8 {

    /* JADX INFO: renamed from: fr */
    protected final int f50785fr;

    /* JADX INFO: renamed from: fs */
    protected zzYF6 f50786fs;
    protected zzZQY zzWOA;
    protected final String zzYBj;
    protected String zzmP;

    public zzYF8(zzZQY zzzqy, String str) {
        this(zzzqy, str, 2);
    }

    public final String getMessage() {
        return this.zzYBj;
    }

    public final String getType() {
        return this.zzmP;
    }

    public final void zzPy(String str) {
        this.zzmP = str;
    }

    public final int zzXye() {
        return this.f50785fr;
    }

    public final void zzY(zzZQY zzzqy) {
        this.zzWOA = zzzqy;
    }

    public final zzZQY zzlj() {
        return this.zzWOA;
    }

    public zzYF8(zzZQY zzzqy, String str, int i) {
        this(zzzqy, str, i, null);
    }

    public final void zzY(zzYF6 zzyf6) {
        this.f50786fs = zzyf6;
    }

    public zzYF8(zzZQY zzzqy, String str, int i, String str2) {
        this.zzWOA = zzzqy;
        this.zzYBj = str;
        this.f50785fr = i;
        this.zzmP = str2;
    }
}
