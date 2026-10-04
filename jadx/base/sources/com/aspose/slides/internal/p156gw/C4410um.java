package com.aspose.slides.internal.p156gw;

import OooO0O0.C20394OooO0Oo;
import OooO0O0.OooO0OO;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.core.graphics.OooO00o;
import androidx.datastore.preferences.protobuf.C21825OoooOO0;
import com.aspose.slides.OooOO0;
import com.aspose.slides.internal.p475wh.C12007ix;
import java.util.Vector;

/* JADX INFO: renamed from: com.aspose.slides.internal.gw.um */
/* JADX INFO: loaded from: classes.dex */
final class C4410um extends AbstractC4393ck {

    /* JADX INFO: renamed from: ar */
    private double f12080ar;

    /* JADX INFO: renamed from: c5 */
    private double f12081c5;

    /* JADX INFO: renamed from: ck */
    private double f12082ck;

    /* JADX INFO: renamed from: du */
    private double f12083du;

    /* JADX INFO: renamed from: dy */
    private double f12084dy;

    /* JADX INFO: renamed from: fa */
    private double f12085fa;

    /* JADX INFO: renamed from: h4 */
    private double f12086h4;

    /* JADX INFO: renamed from: ix */
    private double f12087ix;

    /* JADX INFO: renamed from: jd */
    private double f12088jd;

    /* JADX INFO: renamed from: kk */
    private double f12089kk;

    /* JADX INFO: renamed from: ks */
    private double f12090ks;

    /* JADX INFO: renamed from: m9 */
    private double f12091m9;

    /* JADX INFO: renamed from: ne */
    private double f12092ne;

    /* JADX INFO: renamed from: qq */
    private double f12093qq;

    /* JADX INFO: renamed from: rv */
    private double f12094rv;

    /* JADX INFO: renamed from: to */
    private double f12095to;

    /* JADX INFO: renamed from: u4 */
    private double f12096u4;

    /* JADX INFO: renamed from: um */
    private double f12097um;

    /* JADX INFO: renamed from: up */
    private double f12098up;

    /* JADX INFO: renamed from: uz */
    private double f12099uz;

    /* JADX INFO: renamed from: wl */
    private double f12100wl;

    /* JADX INFO: renamed from: x1 */
    private double f12101x1;

    /* JADX INFO: renamed from: x6 */
    private double f12102x6;

    /* JADX INFO: renamed from: yj */
    private double f12103yj;

    public C4410um(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, int i) {
        super(i);
        double d9 = d4 < d2 ? d2 : d4;
        double d10 = d6 > d8 ? d8 : d6;
        this.f12101x1 = d;
        this.f12089kk = d2;
        this.f12095to = d3;
        this.f12083du = d9;
        this.f12086h4 = d5;
        this.f12091m9 = d10;
        this.f12084dy = d7;
        this.f12081c5 = d8;
        double d11 = d9;
        this.f12088jd = Math.min(Math.min(d, d7), Math.min(d3, d5));
        this.f12082ck = Math.max(Math.max(d, d7), Math.max(d3, d5));
        this.f12085fa = d;
        this.f12098up = (d3 - d) * 3.0d;
        double d12 = d5 - d3;
        this.f12103yj = ((d12 - d3) + d) * 3.0d;
        this.f12090ks = (d7 - (d12 * 3.0d)) - d;
        this.f12094rv = d2;
        this.f12102x6 = (d11 - d2) * 3.0d;
        double d13 = d10 - d11;
        this.f12092ne = ((d13 - d11) + d2) * 3.0d;
        this.f12087ix = (d8 - (d13 * 3.0d)) - d2;
        this.f12097um = d2;
        this.f12093qq = d2;
        this.f12099uz = d2;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: c5 */
    public double mo17797c5() {
        return this.f11992k4 == 1 ? this.f12101x1 : this.f12084dy;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: ck */
    public double mo17798ck() {
        return this.f11992k4 == -1 ? this.f12101x1 : this.f12084dy;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: du */
    public double mo17799du() {
        return this.f12089kk;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: dy */
    public double mo17801dy() {
        return this.f12082ck;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: fa */
    public double mo17802fa() {
        return this.f11992k4 == -1 ? this.f12089kk : this.f12081c5;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: h4 */
    public double mo17803h4() {
        return this.f12081c5;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: jd */
    public double mo17804jd() {
        return this.f11992k4 == 1 ? this.f12089kk : this.f12081c5;
    }

    /* JADX INFO: renamed from: k4 */
    public double m17996k4(double d, double d2, double d3, double d4, double d5) {
        double d6;
        double d7;
        double dOooO00o = d5;
        if (dOooO00o < -0.1d || dOooO00o > 1.1d) {
            return -1.0d;
        }
        double dMo17800du = mo17800du(dOooO00o);
        if (dMo17800du < d4) {
            d7 = dOooO00o;
            d6 = 1.0d;
        } else {
            d6 = dOooO00o;
            d7 = 0.0d;
        }
        double dMo17800du2 = dMo17800du;
        boolean z = true;
        while (dMo17800du2 != d4) {
            if (z) {
                double dM17997k4 = m17997k4(dOooO00o, 1);
                if (dM17997k4 != 0.0d) {
                    double d8 = dOooO00o;
                    dOooO00o = OooOO0.OooO00o(d4, dMo17800du2, dM17997k4, d8);
                    if (dOooO00o == d8 || dOooO00o <= d7 || dOooO00o >= d6) {
                        dOooO00o = d8;
                    }
                }
                z = false;
            } else {
                double d9 = (d7 + d6) / 2.0d;
                if (d9 == d7 || d9 == d6) {
                    break;
                }
                dOooO00o = d9;
            }
            dMo17800du2 = mo17800du(dOooO00o);
            if (dMo17800du2 >= d4) {
                if (dMo17800du2 <= d4) {
                    break;
                }
                d6 = dOooO00o;
            } else {
                d7 = dOooO00o;
            }
        }
        dOooO00o = dOooO00o;
        if (dOooO00o > 1.0d) {
            return -1.0d;
        }
        return dOooO00o;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: kk */
    public double mo17808kk(double d) {
        C4410um c4410um;
        double d2;
        double dM17996k4;
        if (d <= this.f12089kk) {
            return 0.0d;
        }
        double d3 = 1.0d;
        if (d >= this.f12081c5) {
            return 1.0d;
        }
        if (d == this.f12099uz) {
            return this.f12096u4;
        }
        if (d == this.f12093qq) {
            return this.f12100wl;
        }
        if (d == this.f12097um) {
            return this.f12080ar;
        }
        double d4 = this.f12087ix;
        if (d4 == 0.0d) {
            return C4389ar.m17792k4(d, this.f12094rv, this.f12102x6, this.f12092ne);
        }
        double d5 = this.f12092ne / d4;
        double d6 = this.f12102x6 / d4;
        double d7 = (this.f12094rv - d) / d4;
        double dOooO00o = C20394OooO0Oo.OooO00o(d6, 3.0d, d5 * d5, 9.0d);
        double dOooO00o2 = OooO0OO.OooO00o(d7, 27.0d, C21825OoooOO0.OooO00o(d5, 9.0d, d6, d5 * 2.0d * d5 * d5), 54.0d);
        double d8 = dOooO00o2 * dOooO00o2;
        double d9 = dOooO00o * dOooO00o * dOooO00o;
        double d10 = d5 / 3.0d;
        if (d8 < d9) {
            double dAcos = Math.acos(dOooO00o2 / Math.sqrt(d9));
            double dSqrt = Math.sqrt(dOooO00o) * (-2.0d);
            dM17996k4 = m17996k4(d5, d6, d7, d, (Math.cos(dAcos / 3.0d) * dSqrt) - d10);
            if (dM17996k4 < 0.0d) {
                dM17996k4 = m17996k4(d5, d6, d7, d, (Math.cos((dAcos + 6.283185307179586d) / 3.0d) * dSqrt) - d10);
            }
            if (dM17996k4 < 0.0d) {
                dM17996k4 = m17996k4(d5, d6, d7, d, (Math.cos((dAcos - 6.283185307179586d) / 3.0d) * dSqrt) - d10);
            }
            c4410um = this;
            d2 = d;
        } else {
            boolean z = dOooO00o2 < 0.0d;
            double dSqrt2 = Math.sqrt(d8 - d9);
            if (z) {
                dOooO00o2 = -dOooO00o2;
            }
            double dPow = Math.pow(dOooO00o2 + dSqrt2, 0.3333333333333333d);
            if (!z) {
                dPow = -dPow;
            }
            c4410um = this;
            d2 = d;
            dM17996k4 = c4410um.m17996k4(d5, d6, d7, d2, (dPow + (dPow == 0.0d ? 0.0d : dOooO00o / dPow)) - d10);
        }
        if (dM17996k4 < 0.0d) {
            double d11 = 0.0d;
            while (true) {
                dM17996k4 = (d11 + d3) / 2.0d;
                if (dM17996k4 != d11 && dM17996k4 != d3) {
                    double dMo17800du = c4410um.mo17800du(dM17996k4);
                    if (dMo17800du >= d2) {
                        if (dMo17800du <= d2) {
                            break;
                        }
                        d3 = dM17996k4;
                    } else {
                        d11 = dM17996k4;
                    }
                } else {
                    break;
                }
            }
        }
        if (dM17996k4 >= 0.0d) {
            c4410um.f12080ar = c4410um.f12100wl;
            c4410um.f12097um = c4410um.f12093qq;
            c4410um.f12100wl = c4410um.f12096u4;
            c4410um.f12093qq = c4410um.f12099uz;
            c4410um.f12096u4 = dM17996k4;
            c4410um.f12099uz = d2;
        }
        return dM17996k4;
    }

    /* JADX INFO: renamed from: ks */
    public double m17998ks() {
        return this.f11992k4 == 1 ? this.f12083du : this.f12091m9;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: m9 */
    public double mo17810m9() {
        return this.f12088jd;
    }

    /* JADX INFO: renamed from: rv */
    public double m17999rv() {
        return this.f11992k4 == -1 ? this.f12095to : this.f12086h4;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: to */
    public double mo17811to() {
        return this.f12101x1;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: up */
    public AbstractC4393ck mo17813up() {
        return new C4410um(this.f12101x1, this.f12089kk, this.f12095to, this.f12083du, this.f12086h4, this.f12091m9, this.f12084dy, this.f12081c5, -this.f11992k4);
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: x1 */
    public double mo17814x1(double d) {
        return d <= this.f12089kk ? this.f12101x1 : d >= this.f12081c5 ? this.f12084dy : mo17812to(mo17808kk(d));
    }

    /* JADX INFO: renamed from: x6 */
    public double m18000x6() {
        return this.f11992k4 == -1 ? this.f12083du : this.f12091m9;
    }

    /* JADX INFO: renamed from: yj */
    public double m18001yj() {
        return this.f11992k4 == 1 ? this.f12095to : this.f12086h4;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: du */
    public double mo17800du(double d) {
        return (((((this.f12087ix * d) + this.f12092ne) * d) + this.f12102x6) * d) + this.f12094rv;
    }

    /* JADX INFO: renamed from: k4 */
    public double m17997k4(double d, int i) {
        if (i == 0) {
            return (((((this.f12087ix * d) + this.f12092ne) * d) + this.f12102x6) * d) + this.f12094rv;
        }
        if (i == 1) {
            return OooO00o.OooO00o(this.f12092ne, 2.0d, this.f12087ix * 3.0d * d, d) + this.f12102x6;
        }
        if (i == 2) {
            return (this.f12092ne * 2.0d) + (this.f12087ix * 6.0d * d);
        }
        if (i != 3) {
            return 0.0d;
        }
        return this.f12087ix * 6.0d;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: kk */
    public int mo17809kk() {
        return 3;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: to */
    public double mo17812to(double d) {
        return (((((this.f12090ks * d) + this.f12103yj) * d) + this.f12098up) * d) + this.f12085fa;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: x1 */
    public double mo17815x1(double d, double d2) {
        double[] dArr = {this.f12098up, this.f12103yj * 2.0d, this.f12090ks * 3.0d};
        int iM17952k4 = AbstractC4403lr.m17952k4(dArr, dArr);
        for (int i = 0; i < iM17952k4; i++) {
            double d3 = dArr[i];
            if (d3 > d && d3 < d2) {
                d2 = d3;
            }
        }
        return d2;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m17992k4(double d, double d2, double d3, double d4, double[] dArr) {
        if (d <= d2 && d2 <= d3 && d3 <= d4) {
            return 0;
        }
        double d5 = d4 - d3;
        double d6 = d3 - d2;
        double d7 = d2 - d;
        dArr[0] = d7;
        dArr[1] = (d6 - d7) * 2.0d;
        dArr[2] = ((d5 - d6) - d6) + d7;
        int iM17952k4 = AbstractC4403lr.m17952k4(dArr, dArr);
        int i = 0;
        for (int i2 = 0; i2 < iM17952k4; i2++) {
            double d8 = dArr[i2];
            if (d8 > 0.0d && d8 < 1.0d) {
                if (i < i2) {
                    dArr[i] = d8;
                }
                i++;
            }
        }
        return i;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: x1 */
    public String mo17816x1() {
        return "(" + AbstractC4393ck.m17859k4(m18001yj()) + ", " + AbstractC4393ck.m17859k4(m17998ks()) + "), (" + AbstractC4393ck.m17859k4(m17999rv()) + ", " + AbstractC4393ck.m17859k4(m18000x6()) + "), ";
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: k4 */
    public int mo17805k4(double[] dArr) {
        if (this.f11992k4 == 1) {
            dArr[0] = this.f12095to;
            dArr[1] = this.f12083du;
            dArr[2] = this.f12086h4;
            dArr[3] = this.f12091m9;
            dArr[4] = this.f12084dy;
            dArr[5] = this.f12081c5;
        } else {
            dArr[0] = this.f12086h4;
            dArr[1] = this.f12091m9;
            dArr[2] = this.f12095to;
            dArr[3] = this.f12083du;
            dArr[4] = this.f12101x1;
            dArr[5] = this.f12089kk;
        }
        return 3;
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: k4 */
    public AbstractC4393ck mo17806k4(double d, double d2, int i) {
        if (d > this.f12089kk || d2 < this.f12081c5) {
            double dMo17808kk = mo17808kk(d);
            double dMo17808kk2 = mo17808kk(d2);
            int i2 = 0;
            double[] dArr = {this.f12101x1, this.f12089kk, this.f12095to, this.f12083du, this.f12086h4, this.f12091m9, this.f12084dy, this.f12081c5, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d};
            if (dMo17808kk <= dMo17808kk2) {
                dMo17808kk2 = dMo17808kk;
                dMo17808kk = dMo17808kk2;
            }
            if (dMo17808kk < 1.0d) {
                m17995k4(dArr, 0, dMo17808kk);
            }
            if (dMo17808kk2 > 0.0d) {
                m17995k4(dArr, 0, dMo17808kk2 / dMo17808kk);
                i2 = 6;
            }
            return new C4410um(dArr[i2], d, dArr[i2 + 2], dArr[i2 + 3], dArr[i2 + 4], dArr[i2 + 5], dArr[i2 + 6], d2, i);
        }
        return m17874k4(i);
    }

    @Override // com.aspose.slides.internal.p156gw.AbstractC4393ck
    /* JADX INFO: renamed from: k4 */
    public void mo17807k4(C12007ix c12007ix) {
        c12007ix.m56559k4(this.f12101x1, this.f12089kk);
        double[] dArr = {this.f12098up, this.f12103yj * 2.0d, this.f12090ks * 3.0d};
        int iM17952k4 = AbstractC4403lr.m17952k4(dArr, dArr);
        for (int i = 0; i < iM17952k4; i++) {
            double d = dArr[i];
            if (d > 0.0d && d < 1.0d) {
                c12007ix.m56559k4(mo17812to(d), mo17800du(d));
            }
        }
        c12007ix.m56559k4(this.f12084dy, this.f12081c5);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m17993k4(Vector vector, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, int i) {
        if (d2 > d8) {
            vector.add(new C4410um(d7, d8, d5, d6, d3, d4, d, d2, -i));
        } else if (d8 > d2) {
            vector.add(new C4410um(d, d2, d3, d4, d5, d6, d7, d8, i));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m17994k4(Vector vector, double[] dArr, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, int i) {
        int iM17992k4 = m17992k4(d2, d4, d6, d8, dArr);
        if (iM17992k4 == 0) {
            m17993k4(vector, d, d2, d3, d4, d5, d6, d7, d8, i);
            return;
        }
        int i2 = i;
        double[] dArr2 = dArr;
        dArr2[3] = d;
        dArr2[4] = d2;
        dArr2[5] = d3;
        dArr2[6] = d4;
        dArr2[7] = d5;
        dArr2[8] = d6;
        dArr2[9] = d7;
        dArr2[10] = d8;
        double d9 = dArr2[0];
        if (iM17992k4 > 1) {
            double d10 = dArr2[1];
            if (d9 > d10) {
                dArr2[0] = d10;
                dArr2[1] = d9;
                d9 = d10;
            }
        }
        m17995k4(dArr2, 3, d9);
        if (iM17992k4 > 1) {
            m17995k4(dArr2, 9, (dArr2[1] - d9) / (1.0d - d9));
        }
        int i3 = i2 == -1 ? 3 + (iM17992k4 * 6) : 3;
        int i4 = iM17992k4;
        while (i4 >= 0) {
            int i5 = i3 + 6;
            int i6 = i2;
            m17993k4(vector, dArr2[i3], dArr2[i3 + 1], dArr2[i3 + 2], dArr2[i3 + 3], dArr2[i3 + 4], dArr2[i3 + 5], dArr2[i5], dArr2[i3 + 7], i6);
            i2 = i6;
            i4--;
            if (i2 == 1) {
                dArr2 = dArr;
                i3 = i5;
            } else {
                i3 -= 6;
                dArr2 = dArr;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m17995k4(double[] dArr, int i, double d) {
        int i2 = i + 6;
        double d2 = dArr[i2];
        dArr[i + 12] = d2;
        int i3 = i + 7;
        double d3 = dArr[i3];
        dArr[i + 13] = d3;
        int i4 = i + 4;
        double d4 = dArr[i4];
        int i5 = i + 5;
        double d5 = dArr[i5];
        double dOooO0O0 = C21532OooOOo.OooO0O0(d2, d4, d, d4);
        double dOooO0O02 = C21532OooOOo.OooO0O0(d3, d5, d, d5);
        double d6 = dArr[i];
        double d7 = dArr[i + 1];
        int i6 = i + 2;
        double d8 = dArr[i6];
        int i7 = i + 3;
        double d9 = dArr[i7];
        double dOooO0O03 = C21532OooOOo.OooO0O0(d8, d6, d, d6);
        double dOooO0O04 = C21532OooOOo.OooO0O0(d9, d7, d, d7);
        double dOooO0O05 = C21532OooOOo.OooO0O0(d4, d8, d, d8);
        double dOooO0O06 = C21532OooOOo.OooO0O0(d5, d9, d, d9);
        double dOooO0O07 = C21532OooOOo.OooO0O0(dOooO0O0, dOooO0O05, d, dOooO0O05);
        double dOooO0O08 = C21532OooOOo.OooO0O0(dOooO0O02, dOooO0O06, d, dOooO0O06);
        double dOooO0O09 = C21532OooOOo.OooO0O0(dOooO0O05, dOooO0O03, d, dOooO0O03);
        double dOooO0O010 = C21532OooOOo.OooO0O0(dOooO0O06, dOooO0O04, d, dOooO0O04);
        dArr[i6] = dOooO0O03;
        dArr[i7] = dOooO0O04;
        dArr[i4] = dOooO0O09;
        dArr[i5] = dOooO0O010;
        dArr[i2] = C21532OooOOo.OooO0O0(dOooO0O07, dOooO0O09, d, dOooO0O09);
        dArr[i3] = C21532OooOOo.OooO0O0(dOooO0O08, dOooO0O010, d, dOooO0O010);
        dArr[i + 8] = dOooO0O07;
        dArr[i + 9] = dOooO0O08;
        dArr[i + 10] = dOooO0O0;
        dArr[i + 11] = dOooO0O02;
    }
}
