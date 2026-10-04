package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zz6I {
    private boolean zzlB;
    private boolean zzlC;
    private boolean zzlD;
    private boolean zzlE;
    private zzPF zzt6;

    public zz6I(zzPF zzpf, boolean z, boolean z2, boolean z3) {
        this.zzlE = z;
        this.zzlD = z2;
        this.zzlC = z3;
        this.zzt6 = zzpf;
        this.zzlB = (zzpf.zzOB().getType() == 0 && this.zzt6.zzOA().getType() == 0) ? false : true;
    }

    public final zzPF zzNO() {
        return this.zzt6;
    }

    public final boolean zzwN() {
        return this.zzlB;
    }

    public final boolean zzwO() {
        return this.zzlC;
    }

    public final boolean zzwP() {
        return this.zzlD;
    }

    public final boolean zzwQ() {
        return this.zzlE;
    }
}
