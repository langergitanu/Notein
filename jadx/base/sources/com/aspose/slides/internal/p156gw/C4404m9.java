package com.aspose.slides.internal.p156gw;

/* JADX INFO: renamed from: com.aspose.slides.internal.gw.m9 */
/* JADX INFO: loaded from: classes.dex */
final class C4404m9 {

    /* JADX INFO: renamed from: k4 */
    C4396fa f12049k4;

    /* JADX INFO: renamed from: kk */
    C4404m9 f12050kk;

    /* JADX INFO: renamed from: to */
    int f12051to;

    /* JADX INFO: renamed from: x1 */
    C4396fa f12052x1;

    public C4404m9(C4396fa c4396fa, C4404m9 c4404m9) {
        this.f12049k4 = c4396fa;
        this.f12052x1 = c4396fa;
        this.f12050kk = c4404m9;
        this.f12051to = c4396fa.m17894m9();
    }

    /* JADX INFO: renamed from: k4 */
    public double m17962k4() {
        return (this.f12051to == 1 ? this.f12052x1 : this.f12049k4).m17887du();
    }

    /* JADX INFO: renamed from: x1 */
    public C4396fa m17965x1(C4404m9 c4404m9) {
        int i;
        C4404m9 c4404m92;
        C4404m9 c4404m93;
        int i2 = this.f12051to;
        if (i2 == 0 || (i = c4404m9.f12051to) == 0) {
            throw new InternalError("ChainEnd linked more than once!");
        }
        if (i2 == i) {
            throw new InternalError("Linking chains of the same type!");
        }
        if (i2 == 1) {
            c4404m93 = this;
            c4404m92 = c4404m9;
        } else {
            c4404m92 = this;
            c4404m93 = c4404m9;
        }
        this.f12051to = 0;
        c4404m9.f12051to = 0;
        c4404m93.f12052x1.m17897x1(c4404m92.f12049k4);
        c4404m93.f12052x1 = c4404m92.f12052x1;
        if (this.f12050kk == c4404m9) {
            return c4404m93.f12049k4;
        }
        C4404m9 c4404m94 = c4404m92.f12050kk;
        C4404m9 c4404m95 = c4404m93.f12050kk;
        c4404m94.f12050kk = c4404m95;
        c4404m95.f12050kk = c4404m94;
        if (c4404m93.f12049k4.m17895to() < c4404m94.f12049k4.m17895to()) {
            c4404m93.f12052x1.m17897x1(c4404m94.f12049k4);
            c4404m94.f12049k4 = c4404m93.f12049k4;
            return null;
        }
        c4404m95.f12052x1.m17897x1(c4404m93.f12049k4);
        c4404m95.f12052x1 = c4404m93.f12052x1;
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public void m17963k4(C4396fa c4396fa) {
        if (this.f12051to == 1) {
            this.f12052x1.m17897x1(c4396fa);
            this.f12052x1 = c4396fa;
        } else {
            c4396fa.m17897x1(this.f12049k4);
            this.f12049k4 = c4396fa;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m17964k4(C4404m9 c4404m9) {
        this.f12050kk = c4404m9;
    }
}
