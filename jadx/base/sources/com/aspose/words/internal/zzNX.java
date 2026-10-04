package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzNX {
    private zzNB zzFr;
    private zzO8 zzFs;
    private zzNI zzFt;
    private boolean zzFu;
    private int zzFv;
    private zzN6 zzFz;
    private zzPV zzZf;

    public zzNX(zzN6 zzn6) {
        this.zzFz = zzn6;
        this.zzFr = zzn6.zzKm();
        this.zzFs = this.zzFz.zzKl();
        this.zzFt = this.zzFz.zzKk();
    }

    public final void zzMw() throws Exception {
        boolean zZzXu = this.zzFr.zzLm().zzXu(0);
        this.zzFu = zZzXu;
        if (zZzXu) {
            this.zzZf = this.zzFs.zzMV();
        } else {
            this.zzFv = this.zzFs.zzXc();
        }
    }

    public final zzPY zzMx() {
        return this.zzFu ? new zzOI(this.zzZf) : this.zzFt.zzXs(this.zzFv);
    }
}
