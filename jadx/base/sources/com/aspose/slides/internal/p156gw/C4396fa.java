package com.aspose.slides.internal.p156gw;

/* JADX INFO: renamed from: com.aspose.slides.internal.gw.fa */
/* JADX INFO: loaded from: classes.dex */
final class C4396fa {

    /* JADX INFO: renamed from: du */
    C4396fa f12005du;

    /* JADX INFO: renamed from: k4 */
    AbstractC4393ck f12006k4;

    /* JADX INFO: renamed from: kk */
    double f12007kk;

    /* JADX INFO: renamed from: to */
    int f12008to;

    /* JADX INFO: renamed from: x1 */
    double f12009x1;

    public C4396fa(AbstractC4393ck abstractC4393ck, double d, double d2, int i) {
        this.f12006k4 = abstractC4393ck;
        this.f12009x1 = d;
        this.f12007kk = d2;
        this.f12008to = i;
        if (d < abstractC4393ck.mo17799du() || this.f12007kk > abstractC4393ck.mo17803h4()) {
            throw new InternalError("bad curvelink [" + this.f12009x1 + "=>" + this.f12007kk + "] for " + abstractC4393ck);
        }
    }

    /* JADX INFO: renamed from: du */
    public double m17887du() {
        return this.f12006k4.mo17814x1(this.f12007kk);
    }

    /* JADX INFO: renamed from: dy */
    public C4396fa m17888dy() {
        return this.f12005du;
    }

    /* JADX INFO: renamed from: h4 */
    public double m17889h4() {
        return this.f12006k4.mo17814x1(this.f12009x1);
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC4393ck m17890k4() {
        return (this.f12009x1 == this.f12006k4.mo17799du() && this.f12007kk == this.f12006k4.mo17803h4()) ? this.f12006k4.m17874k4(this.f12008to) : this.f12006k4.mo17806k4(this.f12009x1, this.f12007kk, this.f12008to);
    }

    /* JADX INFO: renamed from: kk */
    public double m17893kk() {
        return this.f12006k4.mo17814x1(this.f12009x1);
    }

    /* JADX INFO: renamed from: m9 */
    public int m17894m9() {
        return this.f12008to;
    }

    /* JADX INFO: renamed from: to */
    public double m17895to() {
        return this.f12009x1;
    }

    /* JADX INFO: renamed from: x1 */
    public AbstractC4393ck m17896x1() {
        return new C4414wl(m17893kk(), m17895to());
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m17891k4(AbstractC4393ck abstractC4393ck, double d, double d2, int i) {
        if (this.f12006k4 != abstractC4393ck || this.f12008to != i || this.f12007kk < d || this.f12009x1 > d2) {
            return false;
        }
        if (d >= abstractC4393ck.mo17799du() && d2 <= abstractC4393ck.mo17803h4()) {
            this.f12009x1 = Math.min(this.f12009x1, d);
            this.f12007kk = Math.max(this.f12007kk, d2);
            return true;
        }
        throw new InternalError("bad curvelink [" + d + "=>" + d2 + "] for " + abstractC4393ck);
    }

    /* JADX INFO: renamed from: x1 */
    public void m17897x1(C4396fa c4396fa) {
        this.f12005du = c4396fa;
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m17892k4(C4396fa c4396fa) {
        return m17891k4(c4396fa.f12006k4, c4396fa.f12009x1, c4396fa.f12007kk, c4396fa.f12008to);
    }
}
