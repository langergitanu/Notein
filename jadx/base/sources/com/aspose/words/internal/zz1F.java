package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zz1F extends zz33 {
    private boolean zzfp;
    private boolean zzfq;
    private boolean zzfr;
    private boolean zzfs;
    private boolean zzft;
    private boolean zzfu;
    private int zzfv;
    private int zzfw;
    private int zzfx;
    private int zzfy;
    private int zzfz;
    private boolean zzgM;

    public zz1F(zz4W zz4w) {
        super(zz4w);
        this.zzfz = 1;
        this.zzfy = 1;
        this.zzfx = 1;
        this.zzfw = 1;
        this.zzfv = 0;
        this.zzfu = false;
        this.zzgM = false;
        this.zzft = false;
        this.zzfs = false;
        this.zzfr = false;
        this.zzfq = false;
        this.zzfp = false;
    }

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFY zzfy) throws Exception {
        int i;
        zzfy.zzFd();
        int i2 = this.zzfz;
        if (i2 != 1) {
            zzfy.zzH("/PrintClip", zz4C.zzU6(i2));
        }
        int i3 = this.zzfy;
        if (i3 != 1) {
            zzfy.zzH("/PrintArea", zz4C.zzU6(i3));
        }
        int i4 = this.zzfx;
        if (i4 != 1) {
            zzfy.zzH("/ViewClip", zz4C.zzU6(i4));
        }
        int i5 = this.zzfw;
        if (i5 != 1) {
            zzfy.zzH("/ViewArea", zz4C.zzU6(i5));
        }
        if (this.zzfu && (i = this.zzfv) != 0) {
            zzfy.zzH("/NonFullScreenPageMode", zz4C.zzU5(i));
        }
        boolean z = this.zzgM;
        if (z) {
            zzfy.zzT("/DisplayDocTitle", z);
        }
        boolean z2 = this.zzft;
        if (z2) {
            zzfy.zzT("/CenterWindow", z2);
        }
        boolean z3 = this.zzfs;
        if (z3) {
            zzfy.zzT("/FitWindow", z3);
        }
        boolean z4 = this.zzfr;
        if (z4) {
            zzfy.zzT("/HideWindowUI", z4);
        }
        boolean z5 = this.zzfq;
        if (z5) {
            zzfy.zzT("/HideMenubar", z5);
        }
        boolean z6 = this.zzfp;
        if (z6) {
            zzfy.zzT("/HideToolbar", z6);
        }
        zzfy.zzFc();
    }

    public final void zzt7() {
        this.zzfu = true;
    }

    public final void zzt8() {
        this.zzgM = true;
    }
}
