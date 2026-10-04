package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.C7254aj;
import com.aspose.slides.internal.p332p7.C8646r2;
import com.aspose.slides.p559ms.System.C14057f9;

/* JADX INFO: loaded from: classes3.dex */
class h4g extends AbstractC0910dq {

    /* JADX INFO: renamed from: rv */
    private static final C7017h4 f5398rv = new C7017h4("upr", "grav");

    /* JADX INFO: renamed from: c5 */
    private boolean f5399c5;

    /* JADX INFO: renamed from: ck */
    private int f5400ck;

    /* JADX INFO: renamed from: du */
    private double f5401du;

    /* JADX INFO: renamed from: dy */
    private boolean f5402dy;

    /* JADX INFO: renamed from: fa */
    private int f5403fa;

    /* JADX INFO: renamed from: h4 */
    private int f5404h4;

    /* JADX INFO: renamed from: jd */
    private int f5405jd;

    /* JADX INFO: renamed from: k4 */
    private int f5406k4;

    /* JADX INFO: renamed from: kk */
    private double f5407kk;

    /* JADX INFO: renamed from: ks */
    private int f5408ks;

    /* JADX INFO: renamed from: m9 */
    private boolean f5409m9;

    /* JADX INFO: renamed from: to */
    private double f5410to;

    /* JADX INFO: renamed from: up */
    private int f5411up;

    /* JADX INFO: renamed from: x1 */
    private double f5412x1;

    /* JADX INFO: renamed from: yj */
    private int f5413yj;

    public h4g(C7254aj c7254aj) {
        int iM5206k4;
        int iM5206k42;
        this.f5406k4 = 1;
        this.f5412x1 = 15.0d;
        this.f5407kk = 35.0d;
        this.f5410to = 90.0d;
        this.f5401du = 90.0d;
        this.f5405jd = 2;
        this.f5400ck = 2;
        this.f5403fa = 0;
        this.f5411up = 0;
        this.f5404h4 = 2;
        this.f5413yj = 2;
        this.f5408ks = 1;
        this.f5409m9 = false;
        this.f5402dy = false;
        this.f5399c5 = false;
        for (C8646r2 c8646r2 : c7254aj.m28286x1()) {
            int iM39851k4 = c8646r2.m39851k4();
            if (iM39851k4 == 2) {
                this.f5406k4 = m6997to(c8646r2.m39852x1());
            } else if (iM39851k4 == 21) {
                m5211k4(AbstractC0910dq.m5206k4(c8646r2.m39852x1()));
            } else if (iM39851k4 == 46) {
                this.f5404h4 = C14057f9.m66582k4(c8646r2.m39852x1());
            } else if (iM39851k4 != 54) {
                if (iM39851k4 != 30) {
                    if (iM39851k4 == 31) {
                        iM5206k42 = AbstractC0910dq.m5206k4(c8646r2.m39852x1());
                        this.f5400ck = iM5206k42;
                    } else if (iM39851k4 == 41) {
                        iM5206k4 = AbstractC0910dq.m5206k4(c8646r2.m39852x1());
                    } else if (iM39851k4 != 42) {
                        switch (iM39851k4) {
                            case 23:
                                this.f5412x1 = AbstractC0910dq.m5205k4(c8646r2.m39852x1(), 15.0d);
                                break;
                            case 24:
                                this.f5407kk = AbstractC0910dq.m5205k4(c8646r2.m39852x1(), 35.0d);
                                break;
                            case 25:
                                this.f5410to = AbstractC0910dq.m5205k4(c8646r2.m39852x1(), 90.0d);
                                break;
                            case 26:
                                this.f5401du = AbstractC0910dq.m5205k4(c8646r2.m39852x1(), 90.0d);
                                break;
                            default:
                                switch (iM39851k4) {
                                    case 48:
                                        this.f5402dy = "ctr".equals(c8646r2.m39852x1());
                                        break;
                                    case 49:
                                        this.f5399c5 = "ctr".equals(c8646r2.m39852x1());
                                        break;
                                    case 50:
                                        this.f5413yj = AbstractC0910dq.m5209x1(c8646r2.m39852x1());
                                        break;
                                    case 51:
                                        this.f5408ks = AbstractC0910dq.m5209x1(c8646r2.m39852x1());
                                        break;
                                    case 52:
                                        this.f5409m9 = "vert".equals(c8646r2.m39852x1());
                                        break;
                                }
                                break;
                        }
                    } else {
                        iM5206k42 = AbstractC0910dq.m5206k4(c8646r2.m39852x1());
                    }
                    this.f5411up = iM5206k42;
                } else {
                    iM5206k4 = AbstractC0910dq.m5206k4(c8646r2.m39852x1());
                    this.f5405jd = iM5206k4;
                }
                this.f5403fa = iM5206k4;
            } else {
                m5213x1(AbstractC0910dq.m5209x1(c8646r2.m39852x1()));
            }
        }
        if (this.f5403fa == 0) {
            this.f5403fa = 1;
        }
        if (this.f5411up == 0) {
            this.f5411up = 3;
        }
    }

    /* JADX INFO: renamed from: c5 */
    public final int m6998c5() {
        return this.f5403fa;
    }

    /* JADX INFO: renamed from: ck */
    public final int m6999ck() {
        return this.f5413yj;
    }

    /* JADX INFO: renamed from: du */
    public final double m7000du() {
        return this.f5407kk;
    }

    /* JADX INFO: renamed from: dy */
    public final int m7001dy() {
        return this.f5405jd;
    }

    /* JADX INFO: renamed from: fa */
    public final int m7002fa() {
        return this.f5408ks;
    }

    /* JADX INFO: renamed from: h4 */
    public final double m7003h4() {
        return this.f5410to;
    }

    /* JADX INFO: renamed from: jd */
    public final int m7004jd() {
        return this.f5404h4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m7005kk() {
        return this.f5406k4;
    }

    /* JADX INFO: renamed from: ks */
    public final boolean m7006ks() {
        return this.f5399c5;
    }

    /* JADX INFO: renamed from: m9 */
    public final double m7007m9() {
        return this.f5401du;
    }

    /* JADX INFO: renamed from: to */
    public final double m7008to() {
        return this.f5412x1;
    }

    /* JADX INFO: renamed from: up */
    public final boolean m7009up() {
        return this.f5409m9;
    }

    /* JADX INFO: renamed from: yj */
    public final boolean m7010yj() {
        return this.f5402dy;
    }

    /* JADX INFO: renamed from: to */
    private int m6997to(String str) {
        int iM27428k4 = f5398rv.m27428k4(str);
        if (iM27428k4 != 0) {
            return iM27428k4 != 1 ? 0 : 2;
        }
        return 1;
    }
}
