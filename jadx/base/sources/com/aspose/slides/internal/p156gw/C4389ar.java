package com.aspose.slides.internal.p156gw;

import androidx.appcompat.widget.C21532OooOOo;
import androidx.datastore.preferences.protobuf.C21825OoooOO0;
import com.aspose.slides.internal.p475wh.C12007ix;
import java.util.Vector;

/* JADX INFO: renamed from: com.aspose.slides.internal.gw.ar */
/* JADX INFO: loaded from: classes.dex */
final class C4389ar extends AbstractC4393ck {

    /* JADX INFO: renamed from: c5 */
    private double f11946c5;

    /* JADX INFO: renamed from: ck */
    private double f11947ck;

    /* JADX INFO: renamed from: du */
    private double f11948du;

    /* JADX INFO: renamed from: dy */
    private double f11949dy;

    /* JADX INFO: renamed from: fa */
    private double f11950fa;

    /* JADX INFO: renamed from: h4 */
    private double f11951h4;

    /* JADX INFO: renamed from: jd */
    private double f11952jd;

    /* JADX INFO: renamed from: kk */
    private double f11953kk;

    /* JADX INFO: renamed from: ks */
    private double f11954ks;

    /* JADX INFO: renamed from: m9 */
    private double f11955m9;

    /* JADX INFO: renamed from: to */
    private double f11956to;

    /* JADX INFO: renamed from: up */
    private double f11957up;

    /* JADX INFO: renamed from: x1 */
    private double f11958x1;

    /* JADX INFO: renamed from: yj */
    private double f11959yj;

    public C4389ar(double d, double d2, double d3, double d4, double d5, double d6, int i) {
        super(i);
        if (d4 < d2) {
            d4 = d2;
        } else if (d4 > d6) {
            d4 = d6;
        }
        this.f11958x1 = d;
        this.f11953kk = d2;
        this.f11956to = d3;
        this.f11948du = d4;
        this.f11951h4 = d5;
        this.f11955m9 = d6;
        this.f11949dy = Math.min(Math.min(d, d5), d3);
        this.f11946c5 = Math.max(Math.max(d, d5), d3);
        this.f11952jd = d;
        this.f11947ck = ((d3 + d3) - d) - d;
        this.f11950fa = ((d - d3) - d3) + d5;
        this.f11957up = d2;
        this.f11959yj = ((d4 + d4) - d2) - d2;
        this.f11954ks = ((d2 - d4) - d4) + d6;
    }

    /* JADX INFO: renamed from: k4 */
    public static double m17792k4(double d, double d2, double d3, double d4) {
        double d5 = d2 - d;
        if (d4 == 0.0d) {
            double d6 = (-d5) / d3;
            if (d6 >= 0.0d && d6 <= 1.0d) {
                return d6;
            }
        } else {
            double dOooO00o = C21825OoooOO0.OooO00o(d4, 4.0d, d5, d3 * d3);
            if (dOooO00o >= 0.0d) {
                double dSqrt = Math.sqrt(dOooO00o);
                if (d3 < 0.0d) {
                    dSqrt = -dSqrt;
                }
                double d7 = (dSqrt + d3) / (-2.0d);
                double d8 = d7 / d4;
                if (d8 >= 0.0d && d8 <= 1.0d) {
                    return d8;
                }
                if (d7 != 0.0d) {
                    double d9 = d5 / d7;
                    if (d9 >= 0.0d && d9 <= 1.0d) {
                        return d9;
                    }
                }
            }
        }
        return 0.0d < (((d5 + d3) + d4) + d5) / 2.0d ? 0.0d : 1.0d;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: c5 */
    public double mo17797c5() {
        return this.f11992k4 == 1 ? this.f11958x1 : this.f11951h4;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: ck */
    public double mo17798ck() {
        return this.f11992k4 == -1 ? this.f11958x1 : this.f11951h4;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: du */
    public double mo17799du() {
        return this.f11953kk;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: dy */
    public double mo17801dy() {
        return this.f11946c5;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: fa */
    public double mo17802fa() {
        return this.f11992k4 == -1 ? this.f11953kk : this.f11955m9;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: h4 */
    public double mo17803h4() {
        return this.f11955m9;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: jd */
    public double mo17804jd() {
        return this.f11992k4 == 1 ? this.f11953kk : this.f11955m9;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: kk */
    public double mo17808kk(double d) {
        if (d <= this.f11953kk) {
            return 0.0d;
        }
        if (d >= this.f11955m9) {
            return 1.0d;
        }
        return m17792k4(d, this.f11957up, this.f11959yj, this.f11954ks);
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: m9 */
    public double mo17810m9() {
        return this.f11949dy;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: to */
    public double mo17811to() {
        return this.f11958x1;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: up */
    public AbstractC4393ck mo17813up() {
        return new C4389ar(this.f11958x1, this.f11953kk, this.f11956to, this.f11948du, this.f11951h4, this.f11955m9, -this.f11992k4);
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: x1 */
    public double mo17814x1(double d) {
        return d <= this.f11953kk ? this.f11958x1 : d >= this.f11955m9 ? this.f11951h4 : mo17812to(mo17808kk(d));
    }

    /* JADX INFO: renamed from: k4 */
    public static int m17793k4(double d, double d2, double d3, double[] dArr) {
        if (d <= d2 && d2 <= d3) {
            return 0;
        }
        double d4 = d - d2;
        double d5 = (d3 - d2) + d4;
        if (d5 == 0.0d) {
            return 0;
        }
        double d6 = d4 / d5;
        if (d6 <= 0.0d || d6 >= 1.0d) {
            return 0;
        }
        dArr[0] = d6;
        return 1;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: du */
    public double mo17800du(double d) {
        return (((this.f11954ks * d) + this.f11959yj) * d) + this.f11957up;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: kk */
    public int mo17809kk() {
        return 2;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: to */
    public double mo17812to(double d) {
        return (((this.f11950fa * d) + this.f11947ck) * d) + this.f11952jd;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: x1 */
    public double mo17815x1(double d, double d2) {
        double d3 = (-this.f11947ck) / (this.f11950fa * 2.0d);
        return (d3 <= d || d3 >= d2) ? d2 : d3;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: k4 */
    public int mo17805k4(double[] dArr) {
        dArr[0] = this.f11956to;
        dArr[1] = this.f11948du;
        if (this.f11992k4 == 1) {
            dArr[2] = this.f11951h4;
            dArr[3] = this.f11955m9;
        } else {
            dArr[2] = this.f11958x1;
            dArr[3] = this.f11953kk;
        }
        return 2;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: x1 */
    public String mo17816x1() {
        return "(" + AbstractC4393ck.m17859k4(this.f11956to) + ", " + AbstractC4393ck.m17859k4(this.f11948du) + "), ";
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: k4 */
    public AbstractC4393ck mo17806k4(double d, double d2, int i) {
        int i2;
        double dM17792k4;
        if (d > this.f11953kk) {
            i2 = i;
            dM17792k4 = m17792k4(d, this.f11957up, this.f11959yj, this.f11954ks);
        } else {
            if (d2 >= this.f11955m9) {
                return m17874k4(i);
            }
            i2 = i;
            dM17792k4 = 0.0d;
        }
        double dM17792k42 = d2 >= this.f11955m9 ? 1.0d : m17792k4(d2, this.f11957up, this.f11959yj, this.f11954ks);
        int i3 = 0;
        double[] dArr = {this.f11958x1, this.f11953kk, this.f11956to, this.f11948du, this.f11951h4, this.f11955m9, 0.0d, 0.0d, 0.0d, 0.0d};
        if (dM17792k42 < 1.0d) {
            m17796k4(dArr, 0, dM17792k42);
        }
        if (dM17792k4 > 0.0d) {
            m17796k4(dArr, 0, dM17792k4 / dM17792k42);
            i3 = 4;
        }
        return new C4389ar(dArr[i3], d, dArr[i3 + 2], dArr[i3 + 3], dArr[i3 + 4], d2, i2);
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: k4 */
    public void mo17807k4(C12007ix c12007ix) {
        c12007ix.m56559k4(this.f11958x1, this.f11953kk);
        double d = (-this.f11947ck) / (this.f11950fa * 2.0d);
        if (d > 0.0d && d < 1.0d) {
            c12007ix.m56559k4(mo17812to(d), mo17800du(d));
        }
        c12007ix.m56559k4(this.f11951h4, this.f11955m9);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m17794k4(Vector vector, double d, double d2, double d3, double d4, double d5, double d6, int i) {
        if (d2 > d6) {
            vector.add(new C4389ar(d5, d6, d3, d4, d, d2, -i));
        } else if (d6 > d2) {
            vector.add(new C4389ar(d, d2, d3, d4, d5, d6, i));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m17795k4(Vector vector, double[] dArr, double d, double d2, double d3, double d4, double d5, double d6, int i) {
        Vector vector2;
        double d7;
        double d8;
        double d9;
        double d10;
        double d11;
        double d12;
        if (m17793k4(d2, d4, d6, dArr) == 0) {
            vector2 = vector;
            d7 = d;
            d8 = d2;
            d9 = d3;
            d10 = d4;
            d11 = d5;
            d12 = d6;
        } else {
            double d13 = dArr[0];
            dArr[0] = d;
            dArr[1] = d2;
            dArr[2] = d3;
            dArr[3] = d4;
            dArr[4] = d5;
            dArr[5] = d6;
            m17796k4(dArr, 0, d13);
            int i2 = i != 1 ? 4 : 0;
            vector2 = vector;
            m17794k4(vector2, dArr[i2], dArr[i2 + 1], dArr[i2 + 2], dArr[i2 + 3], dArr[i2 + 4], dArr[i2 + 5], i);
            d7 = dArr[4 - i2];
            d8 = dArr[5 - i2];
            d9 = dArr[6 - i2];
            d10 = dArr[7 - i2];
            d11 = dArr[8 - i2];
            d12 = dArr[9 - i2];
        }
        m17794k4(vector2, d7, d8, d9, d10, d11, d12, i);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m17796k4(double[] dArr, int i, double d) {
        int i2 = i + 4;
        double d2 = dArr[i2];
        dArr[i + 8] = d2;
        int i3 = i + 5;
        double d3 = dArr[i3];
        dArr[i + 9] = d3;
        int i4 = i + 2;
        double d4 = dArr[i4];
        int i5 = i + 3;
        double d5 = dArr[i5];
        double dOooO0O0 = C21532OooOOo.OooO0O0(d2, d4, d, d4);
        double dOooO0O02 = C21532OooOOo.OooO0O0(d3, d5, d, d5);
        double d6 = dArr[i];
        double d7 = dArr[i + 1];
        double dOooO0O03 = C21532OooOOo.OooO0O0(d4, d6, d, d6);
        double dOooO0O04 = C21532OooOOo.OooO0O0(d5, d7, d, d7);
        double dOooO0O05 = C21532OooOOo.OooO0O0(dOooO0O0, dOooO0O03, d, dOooO0O03);
        double dOooO0O06 = C21532OooOOo.OooO0O0(dOooO0O02, dOooO0O04, d, dOooO0O04);
        dArr[i4] = dOooO0O03;
        dArr[i5] = dOooO0O04;
        dArr[i2] = dOooO0O05;
        dArr[i3] = dOooO0O06;
        dArr[i + 6] = dOooO0O0;
        dArr[i + 7] = dOooO0O02;
    }
}
