package com.aspose.slides.internal.p156gw;

import OooO0O0.C20394OooO0Oo;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.datastore.preferences.protobuf.C21825OoooOO0;
import com.aspose.slides.internal.p475wh.C12007ix;

/* JADX INFO: renamed from: com.aspose.slides.internal.gw.qq */
/* JADX INFO: loaded from: classes.dex */
final class C4406qq extends AbstractC4393ck {

    /* JADX INFO: renamed from: du */
    private double f12053du;

    /* JADX INFO: renamed from: h4 */
    private double f12054h4;

    /* JADX INFO: renamed from: kk */
    private double f12055kk;

    /* JADX INFO: renamed from: m9 */
    private double f12056m9;

    /* JADX INFO: renamed from: to */
    private double f12057to;

    /* JADX INFO: renamed from: x1 */
    private double f12058x1;

    public C4406qq(double d, double d2, double d3, double d4, int i) {
        super(i);
        this.f12058x1 = d;
        this.f12055kk = d2;
        this.f12057to = d3;
        this.f12053du = d4;
        if (d < d3) {
            this.f12054h4 = d;
            this.f12056m9 = d3;
        } else {
            this.f12054h4 = d3;
            this.f12056m9 = d;
        }
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: c5 */
    public double mo17797c5() {
        return this.f11992k4 == 1 ? this.f12058x1 : this.f12057to;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: ck */
    public double mo17798ck() {
        return this.f11992k4 == -1 ? this.f12058x1 : this.f12057to;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: du */
    public double mo17799du() {
        return this.f12055kk;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: dy */
    public double mo17801dy() {
        return this.f12056m9;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: fa */
    public double mo17802fa() {
        return this.f11992k4 == -1 ? this.f12055kk : this.f12053du;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: h4 */
    public double mo17803h4() {
        return this.f12053du;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: jd */
    public double mo17804jd() {
        return this.f11992k4 == 1 ? this.f12055kk : this.f12053du;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: k4 */
    public int mo17873k4(AbstractC4393ck abstractC4393ck, double[] dArr) {
        double d;
        double dMax;
        if (!(abstractC4393ck instanceof C4406qq)) {
            return super.mo17873k4(abstractC4393ck, dArr);
        }
        C4406qq c4406qq = (C4406qq) abstractC4393ck;
        double d2 = dArr[1];
        if (d2 <= dArr[0]) {
            throw new InternalError("yrange already screwed up...");
        }
        double dMin = Math.min(Math.min(d2, this.f12053du), c4406qq.f12053du);
        dArr[1] = dMin;
        double d3 = dArr[0];
        if (dMin <= d3) {
            throw new InternalError("backstepping from " + dArr[0] + " to " + dArr[1]);
        }
        if (this.f12056m9 <= c4406qq.f12054h4) {
            return this.f12054h4 == c4406qq.f12056m9 ? 0 : -1;
        }
        if (this.f12054h4 >= c4406qq.f12056m9) {
            return 1;
        }
        double d4 = this.f12057to;
        double d5 = this.f12058x1;
        double d6 = d4 - d5;
        double d7 = this.f12053du;
        double d8 = this.f12055kk;
        double d9 = d7 - d8;
        double d10 = c4406qq.f12057to;
        double d11 = c4406qq.f12058x1;
        double d12 = d10 - d11;
        double d13 = c4406qq.f12053du;
        double d14 = c4406qq.f12055kk;
        double d15 = d13 - d14;
        double d16 = (d12 * d9) - (d6 * d15);
        if (d16 != 0.0d) {
            double dOooO0O0 = C20394OooO0Oo.OooO0O0(d5, d11, d9, d15);
            d = d8;
            double dOooO00o = (((d14 * d12) * d9) + C21825OoooOO0.OooO00o(d, d6, d15, dOooO0O0)) / d16;
            if (dOooO00o <= d3) {
                dMax = Math.min(d7, d13);
                return AbstractC4393ck.m17860k4(mo17814x1(dMax), c4406qq.mo17814x1(dMax));
            }
            if (dOooO00o < dMin) {
                dArr[1] = dOooO00o;
            }
        } else {
            d = d8;
        }
        dMax = Math.max(d, d14);
        return AbstractC4393ck.m17860k4(mo17814x1(dMax), c4406qq.mo17814x1(dMax));
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: kk */
    public double mo17808kk(double d) {
        double d2 = this.f12055kk;
        if (d <= d2) {
            return 0.0d;
        }
        double d3 = this.f12053du;
        if (d >= d3) {
            return 1.0d;
        }
        return (d - d2) / (d3 - d2);
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: m9 */
    public double mo17810m9() {
        return this.f12054h4;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: to */
    public double mo17811to() {
        return this.f12058x1;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: up */
    public AbstractC4393ck mo17813up() {
        return new C4406qq(this.f12058x1, this.f12055kk, this.f12057to, this.f12053du, -this.f11992k4);
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: x1 */
    public double mo17814x1(double d) {
        double d2 = this.f12058x1;
        double d3 = this.f12057to;
        if (d2 != d3) {
            double d4 = this.f12055kk;
            if (d > d4) {
                double d5 = this.f12053du;
                if (d >= d5) {
                    return d3;
                }
                return (((d3 - d2) * (d - d4)) / (d5 - d4)) + d2;
            }
        }
        return d2;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: du */
    public double mo17800du(double d) {
        double d2 = this.f12055kk;
        return C21532OooOOo.OooO0O0(this.f12053du, d2, d, d2);
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: k4 */
    public int mo17805k4(double[] dArr) {
        if (this.f11992k4 == 1) {
            dArr[0] = this.f12057to;
            dArr[1] = this.f12053du;
        } else {
            dArr[0] = this.f12058x1;
            dArr[1] = this.f12055kk;
        }
        return 1;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: kk */
    public int mo17809kk() {
        return 1;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: to */
    public double mo17812to(double d) {
        double d2 = this.f12058x1;
        return C21532OooOOo.OooO0O0(this.f12057to, d2, d, d2);
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: x1 */
    public double mo17815x1(double d, double d2) {
        return d2;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: k4 */
    public AbstractC4393ck mo17806k4(double d, double d2, int i) {
        double d3 = this.f12055kk;
        if (d == d3 && d2 == this.f12053du) {
            return m17874k4(i);
        }
        double d4 = this.f12058x1;
        double d5 = this.f12057to;
        if (d4 == d5) {
            return new C4406qq(d4, d, d5, d2, i);
        }
        double d6 = d4 - d5;
        double d7 = d3 - this.f12053du;
        return new C4406qq((((d - d3) * d6) / d7) + d4, d, (((d2 - d3) * d6) / d7) + d4, d2, i);
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: k4 */
    public void mo17807k4(C12007ix c12007ix) {
        c12007ix.m56559k4(this.f12058x1, this.f12055kk);
        c12007ix.m56559k4(this.f12057to, this.f12053du);
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: k4 */
    public boolean mo17876k4(AbstractC4395dy abstractC4395dy) {
        double d;
        double dMo17814x1;
        double d2;
        double dMo17814x12;
        double dM17881k4 = abstractC4395dy.m17881k4();
        double dM17886x1 = abstractC4395dy.m17886x1();
        double dM17884kk = abstractC4395dy.m17884kk();
        double dM17885to = abstractC4395dy.m17885to();
        if (this.f12054h4 >= dM17884kk) {
            return false;
        }
        double d3 = this.f12055kk;
        if (d3 < dM17886x1) {
            if (this.f12053du <= dM17886x1) {
                return false;
            }
            dMo17814x1 = mo17814x1(dM17886x1);
            d = dM17886x1;
        } else {
            if (d3 >= dM17885to) {
                return false;
            }
            d = d3;
            dMo17814x1 = this.f12058x1;
        }
        double d4 = this.f12053du;
        if (d4 > dM17885to) {
            dMo17814x12 = mo17814x1(dM17885to);
            d2 = dM17885to;
        } else {
            d2 = d4;
            dMo17814x12 = this.f12057to;
        }
        if (dMo17814x1 >= dM17884kk && dMo17814x12 >= dM17884kk) {
            return false;
        }
        if (dMo17814x1 > dM17881k4 || dMo17814x12 > dM17881k4) {
            return true;
        }
        abstractC4395dy.mo17882k4(d, d2, this.f11992k4);
        return false;
    }
}
