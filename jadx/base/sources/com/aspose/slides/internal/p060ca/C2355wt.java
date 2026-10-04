package com.aspose.slides.internal.p060ca;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.wt */
/* JADX INFO: loaded from: classes3.dex */
class C2355wt {

    /* JADX INFO: renamed from: c5 */
    private double f8171c5;

    /* JADX INFO: renamed from: du */
    private double[] f8172du;

    /* JADX INFO: renamed from: dy */
    private double[] f8173dy;

    /* JADX INFO: renamed from: h4 */
    private double[] f8174h4;

    /* JADX INFO: renamed from: jd */
    private double f8175jd;

    /* JADX INFO: renamed from: k4 */
    private boolean f8176k4 = false;

    /* JADX INFO: renamed from: kk */
    private InterfaceC2416zz f8177kk;

    /* JADX INFO: renamed from: m9 */
    private double[] f8178m9;

    /* JADX INFO: renamed from: to */
    private int f8179to;

    /* JADX INFO: renamed from: x1 */
    private C2305th[] f8180x1;

    public C2355wt(InterfaceC2416zz interfaceC2416zz) {
        this.f8177kk = interfaceC2416zz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m11620k4(double d, double d2) {
        int i = this.f8179to;
        switch (i) {
            case 0:
                this.f8171c5 = d;
                this.f8175jd = d2;
                break;
            case 1:
                this.f8174h4[i - 1] = d + this.f8171c5;
                this.f8172du[i - 1] = d2 + this.f8175jd;
                break;
            case 2:
            case 3:
                this.f8174h4[i - 1] = d;
                this.f8172du[i - 1] = d2;
                break;
            case 4:
            case 5:
            case 6:
                this.f8173dy[i - 4] = d;
                this.f8178m9[i - 4] = d2;
                break;
        }
        this.f8179to = i + 1;
    }

    /* JADX INFO: renamed from: kk */
    public final void m11622kk() {
        this.f8176k4 = true;
        this.f8179to = 0;
        this.f8180x1 = new C2305th[2];
        this.f8172du = new double[3];
        this.f8174h4 = new double[3];
        this.f8178m9 = new double[3];
        this.f8173dy = new double[3];
    }

    /* JADX INFO: renamed from: to */
    public final void m11623to() {
        C2305th[] c2305thArr = this.f8180x1;
        InterfaceC2416zz interfaceC2416zz = this.f8177kk;
        double[] dArr = this.f8174h4;
        double d = dArr[0];
        double[] dArr2 = this.f8172du;
        c2305thArr[0] = C2308tp.m11450k4(interfaceC2416zz, d, dArr2[0], dArr[1], dArr2[1], dArr[2], dArr2[2]);
        C2305th[] c2305thArr2 = this.f8180x1;
        InterfaceC2416zz interfaceC2416zz2 = this.f8177kk;
        double[] dArr3 = this.f8173dy;
        double d2 = dArr3[0];
        double[] dArr4 = this.f8178m9;
        c2305thArr2[1] = C2308tp.m11450k4(interfaceC2416zz2, d2, dArr4[0], dArr3[1], dArr4[1], dArr3[2], dArr4[2]);
        this.f8176k4 = false;
    }

    /* JADX INFO: renamed from: x1 */
    public final C2305th[] m11624x1() {
        return this.f8180x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m11621k4() {
        return this.f8176k4;
    }
}
