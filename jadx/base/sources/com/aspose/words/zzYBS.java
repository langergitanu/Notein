package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYBS {
    protected zzYE7 zzXeJ;
    protected zzYE8 zzXpP;

    public zzYBS(zzYE8 zzye8) {
        this.zzXpP = zzye8;
        this.zzXeJ = new zzYE7(zzye8);
    }

    public abstract void apply();

    public final void zzL(char c, int i) {
        zzT(c, i, i);
    }

    public final void zzT(char c, int i, int i2) {
        this.zzXeJ.zzV(i, c);
        this.zzXeJ.zzn0(i2);
    }
}
