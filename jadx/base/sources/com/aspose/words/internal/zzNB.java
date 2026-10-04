package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzNB {
    private zzNO zzEA = new zzNO();
    private int zzEw;
    private int zzEx;
    private long zzEy;
    private int zzEz;
    private zzO8 zzFs;

    public zzNB(zzO8 zzo8) {
        this.zzFs = zzo8;
    }

    public final int getDataSize() {
        return this.zzEz;
    }

    public final int zzLk() {
        return this.zzEx;
    }

    public final int zzLl() {
        return this.zzEw;
    }

    public final zzNO zzLm() {
        return this.zzEA;
    }

    public final void zzLn() throws Exception {
        this.zzFs.zzq().zzH(this.zzEy);
    }

    public final void zzLo() throws Exception {
        long position = this.zzFs.zzq().getPosition();
        this.zzEw = this.zzFs.zzXa();
        this.zzEA.zzZ(this.zzFs);
        this.zzEx = this.zzFs.zzXc();
        this.zzEz = this.zzFs.zzXc();
        this.zzEy = position + ((long) this.zzEx);
    }
}
