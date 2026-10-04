package com.aspose.slides.internal.p313oa;

/* JADX INFO: renamed from: com.aspose.slides.internal.oa.ks */
/* JADX INFO: loaded from: classes4.dex */
abstract class AbstractC6994ks extends AbstractC7002u4 {

    /* JADX INFO: renamed from: k4 */
    protected boolean f19036k4 = true;

    /* JADX INFO: renamed from: x1 */
    protected byte f19039x1 = 0;

    /* JADX INFO: renamed from: kk */
    protected byte f19037kk = 0;

    /* JADX INFO: renamed from: c5 */
    private int f19030c5 = 1061109567;

    /* JADX INFO: renamed from: jd */
    private int f19035jd = 1061109567;

    /* JADX INFO: renamed from: to */
    protected AbstractC6981c5[] f19038to = null;

    /* JADX INFO: renamed from: ck */
    private C6985du f19031ck = null;

    /* JADX INFO: renamed from: du */
    protected AbstractC6981c5[] f19032du = null;

    /* JADX INFO: renamed from: fa */
    private C7013yj f19033fa = null;

    /* JADX INFO: renamed from: h4 */
    protected AbstractC6981c5[] f19034h4 = null;

    /* JADX INFO: renamed from: c5 */
    public C6985du m27361c5() {
        return this.f19031ck;
    }

    /* JADX INFO: renamed from: ck */
    public boolean mo27298ck() {
        return false;
    }

    /* JADX INFO: renamed from: du */
    public byte m27362du() {
        return this.f19037kk;
    }

    /* JADX INFO: renamed from: dy */
    public AbstractC6981c5[] m27363dy() {
        return this.f19034h4;
    }

    /* JADX INFO: renamed from: h4 */
    public AbstractC6981c5[] m27364h4() {
        return this.f19038to;
    }

    /* JADX INFO: renamed from: jd */
    public C7013yj m27365jd() {
        return this.f19033fa;
    }

    /* JADX INFO: renamed from: k4 */
    public C6985du m27366k4(byte b, byte b2) {
        if (this.f19031ck == null) {
            this.f19031ck = C6985du.m27329k4(this.f19039x1, this.f19037kk, b, b2);
        }
        return this.f19031ck;
    }

    /* JADX INFO: renamed from: kk */
    public AbstractC6981c5[] m27370kk() {
        if (this.f19034h4 == null) {
            this.f19034h4 = new AbstractC6981c5[this.f19036k4 ? this.f19039x1 : this.f19037kk];
        }
        return this.f19034h4;
    }

    /* JADX INFO: renamed from: m9 */
    public AbstractC6981c5[] m27371m9() {
        return this.f19032du;
    }

    /* JADX INFO: renamed from: to */
    public boolean m27372to() {
        return this.f19036k4;
    }

    /* JADX INFO: renamed from: x1 */
    public AbstractC6981c5[] m27373x1() {
        if (this.f19032du == null) {
            this.f19032du = new AbstractC6981c5[this.f19036k4 ? this.f19039x1 : this.f19037kk];
        }
        return this.f19032du;
    }

    /* JADX INFO: renamed from: k4 */
    public C7013yj m27367k4(float[] fArr) {
        if (this.f19033fa == null) {
            this.f19033fa = new C7013yj(fArr);
        }
        return this.f19033fa;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo27368k4(int i, int i2) {
        this.f19030c5 = i;
        this.f19035jd = i2;
    }

    /* JADX INFO: renamed from: k4 */
    public AbstractC6981c5[] m27369k4() {
        if (this.f19038to == null) {
            this.f19038to = new AbstractC6981c5[!this.f19036k4 ? this.f19039x1 : this.f19037kk];
        }
        return this.f19038to;
    }
}
