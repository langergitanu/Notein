package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11683c5;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14046bv;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: loaded from: classes3.dex */
abstract class vfb extends ValueAxisBase {
    public vfb(C14787xi c14787xi) {
        super(c14787xi);
    }

    /* JADX INFO: renamed from: ai */
    private void m72196ai() {
        double d = ((ValueAxisBase) this).f3636m9 - ((ValueAxisBase) this).f3632dy;
        this.f3631ck = m73026k4().m73384dy().getMajorUnit();
        double dM67477k4 = 0.0d;
        double[] dArr = {0.0d};
        double[] dArr2 = {0.0d};
        C14743wm.m72796k4(d, dArr, dArr2, m73026k4());
        double d2 = dArr[0];
        double d3 = dArr2[0];
        double d4 = ((ValueAxisBase) this).f3632dy;
        if (d4 / d < 5.0d) {
            if (this.f3633fa && this.f3638up) {
                this.f3638up = false;
            }
            ((ValueAxisBase) this).f3634jd = 0.0d;
            return;
        }
        ((ValueAxisBase) this).f3634jd = d4;
        ((ValueAxisBase) this).f3630c5 = d4 + d3;
        double dM67475k4 = C14116yg.m67475k4(d2);
        int iM63760to = kc0.m63760to(dM67475k4);
        while (dM67477k4 > ((ValueAxisBase) this).f3634jd) {
            dM67477k4 = C14116yg.m67477k4(dM67477k4, iM63760to) - dM67475k4;
        }
        if (this.f3633fa && this.f3638up) {
            ((ValueAxisBase) this).f3634jd = dM67477k4 + this.f3631ck;
            this.f3638up = false;
        }
    }

    /* JADX INFO: renamed from: em */
    private void m72197em() {
        int iM66582k4;
        double d;
        char cM67042x1 = C14080ne.m67042x1(C11683c5.m55034jd().m55062ne());
        double d2 = this.f3631ck;
        int i = 0;
        boolean z = d2 >= 0.0d;
        double dM67475k4 = C14116yg.m67475k4(d2);
        this.f3631ck = dM67475k4;
        if (dM67475k4 > 1.0d) {
            iM66582k4 = C14057f9.m66582k4(C14117yj.m67537ne(C14044b3.m66425h4(dM67475k4).charAt(0)));
        } else {
            if (dM67475k4 == 0.0d) {
                this.f3631ck = 0.0d;
                return;
            }
            iM66582k4 = 1;
        }
        double d3 = this.f3631ck;
        if (d3 < 1.0d) {
            String strM66425h4 = C14044b3.m66425h4(d3);
            while (true) {
                if (i < strM66425h4.length()) {
                    if (strM66425h4.charAt(i) != '0' && strM66425h4.charAt(i) != cM67042x1) {
                        iM66582k4 = C14057f9.m66582k4(C14117yj.m67537ne(strM66425h4.charAt(i)));
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
        double d4 = 2.0d;
        if (iM66582k4 == 1 || iM66582k4 == 2) {
            d = this.f3631ck;
        } else {
            d = this.f3631ck * 2.0d;
            d4 = 5.0d;
        }
        this.f3631ck = d / d4;
        if (z) {
            return;
        }
        this.f3631ck = -this.f3631ck;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0156  */
    /* JADX INFO: renamed from: f9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m72198f9() {
        Double dValueOf;
        Double dValueOf2;
        int iM63760to = kc0.m63760to(this.f3631ck);
        double dM67477k4 = 0.0d;
        double d = 0.0d;
        while (true) {
            double d2 = ((ValueAxisBase) this).f3634jd;
            if (d > d2 && kc0.m63750k4(d, d2) >= this.f3631ck) {
                break;
            }
            double dM67477k42 = C14116yg.m67477k4(d, iM63760to);
            if (!m73026k4().m73384dy().isAutomaticMaxValue()) {
                double d3 = ((ValueAxisBase) this).f3634jd;
                dValueOf = dM67477k42 > d3 ? Double.valueOf(d3) : Double.valueOf(dM67477k42);
            }
            m73025k4(dValueOf);
            d = dM67477k42 + this.f3631ck;
        }
        boolean zIsAutomaticMaxValue = m73026k4().m73384dy().isAutomaticMaxValue();
        Class cls = Double.TYPE;
        if (zIsAutomaticMaxValue && !m3031bv()) {
            double dDoubleValue = ((AbstractC14763x3) this).f49904k4.size() > 0 ? ((Double) C7019kk.m27464to(((nxm) OooO0O0.OooO00o(((AbstractC14763x3) this).f49904k4, 1)).m68259m9(), cls)).doubleValue() : -2.147483648E9d;
            double d4 = ((ValueAxisBase) this).f3632dy;
            double d5 = dDoubleValue - d4;
            double d6 = this.f3631ck;
            if (d5 > d6) {
                double d7 = ((ValueAxisBase) this).f3636m9;
                if ((d4 - d7) / ((dDoubleValue - d6) - d7) <= 0.9523809523809523d) {
                    m73028k4((nxm) OooO0O0.OooO00o(((AbstractC14763x3) this).f49904k4, 1));
                }
            } else {
                double d8 = ((ValueAxisBase) this).f3636m9;
                if ((d4 - d8) / (dDoubleValue - d8) > 0.9523809523809523d) {
                    m73025k4(Double.valueOf(C14116yg.m67477k4(dDoubleValue + d6, iM63760to)));
                }
            }
        }
        ((AbstractC14763x3) this).f49904k4.reverse();
        while (true) {
            double d9 = dM67477k4 - this.f3631ck;
            double d10 = ((ValueAxisBase) this).f3630c5;
            if (d9 < d10 && kc0.m63750k4(d10, d9) >= this.f3631ck) {
                break;
            }
            dM67477k4 = C14116yg.m67477k4(d9, iM63760to);
            if (!m73026k4().m73384dy().isAutomaticMinValue()) {
                double d11 = ((ValueAxisBase) this).f3630c5;
                dValueOf2 = dM67477k4 < d11 ? Double.valueOf(d11) : Double.valueOf(dM67477k4);
            }
            m73025k4(dValueOf2);
        }
        if (m73026k4().m73384dy().isAutomaticMinValue()) {
            double dDoubleValue2 = ((AbstractC14763x3) this).f49904k4.size() > 0 ? ((Double) C7019kk.m27464to(((nxm) OooO0O0.OooO00o(((AbstractC14763x3) this).f49904k4, 1)).m68259m9(), cls)).doubleValue() : 2.147483647E9d;
            double d12 = ((ValueAxisBase) this).f3636m9;
            double d13 = d12 - dDoubleValue2;
            double d14 = this.f3631ck;
            if (d13 > d14) {
                double d15 = ((ValueAxisBase) this).f3632dy;
                if ((d12 - d15) / ((dDoubleValue2 + d14) - d15) <= 0.9523809523809523d) {
                    m73028k4((nxm) OooO0O0.OooO00o(((AbstractC14763x3) this).f49904k4, 1));
                    return;
                }
                return;
            }
            double d16 = ((ValueAxisBase) this).f3632dy;
            if ((d12 - d16) / (dDoubleValue2 - d16) > 0.9523809523809523d) {
                m73025k4(Double.valueOf(C14116yg.m67477k4(dDoubleValue2 - d14, iM63760to)));
            }
        }
    }

    /* JADX INFO: renamed from: j2 */
    private void m72199j2() {
        double d = ((ValueAxisBase) this).f3636m9 - ((ValueAxisBase) this).f3632dy;
        double dM67477k4 = 0.0d;
        double[] dArr = {0.0d};
        double[] dArr2 = {0.0d};
        C14743wm.m72796k4(d, dArr, dArr2, m73026k4());
        double d2 = dArr[0];
        double d3 = dArr2[0];
        if (((ValueAxisBase) this).f3636m9 / d < 5.0d) {
            if (this.f3633fa && this.f3638up) {
                this.f3638up = false;
            }
            ((ValueAxisBase) this).f3634jd = 0.0d;
            return;
        }
        double d4 = ((ValueAxisBase) this).f3632dy;
        ((ValueAxisBase) this).f3634jd = d4 - (d3 / 2.0d);
        ((ValueAxisBase) this).f3630c5 = d4 + d3;
        double dM67475k4 = C14116yg.m67475k4(d2);
        this.f3631ck = dM67475k4;
        if ((((ValueAxisBase) this).f3632dy - ((ValueAxisBase) this).f3636m9) / dM67475k4 >= 8.0d) {
            m72200os();
        }
        int iM63760to = kc0.m63760to(this.f3631ck);
        while (dM67477k4 - (this.f3631ck * 3.0d) > ((ValueAxisBase) this).f3632dy) {
            dM67477k4 = C14116yg.m67477k4(dM67477k4, iM63760to) - this.f3631ck;
        }
        if (this.f3633fa && this.f3638up) {
            ((ValueAxisBase) this).f3634jd = dM67477k4;
        }
    }

    /* JADX INFO: renamed from: os */
    private void m72200os() {
        int iM66582k4;
        char cM67042x1 = C14080ne.m67042x1(C11683c5.m55034jd().m55062ne());
        double d = this.f3631ck;
        int i = 0;
        boolean z = d >= 0.0d;
        double dM67475k4 = C14116yg.m67475k4(d);
        this.f3631ck = dM67475k4;
        if (dM67475k4 > 1.0d) {
            iM66582k4 = C14057f9.m66582k4(C14117yj.m67537ne(C14044b3.m66425h4(dM67475k4).charAt(0)));
        } else {
            if (dM67475k4 == 0.0d) {
                this.f3631ck = 0.0d;
            }
            iM66582k4 = 1;
        }
        double d2 = this.f3631ck;
        if (d2 < 1.0d) {
            String strM66425h4 = C14044b3.m66425h4(d2);
            while (true) {
                if (i < strM66425h4.length()) {
                    if (strM66425h4.charAt(i) != '0' && strM66425h4.charAt(i) != cM67042x1) {
                        iM66582k4 = C14057f9.m66582k4(C14117yj.m67537ne(strM66425h4.charAt(i)));
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
        this.f3631ck = (iM66582k4 == 1 || iM66582k4 == 5) ? this.f3631ck * 2.0d : (this.f3631ck * 5.0d) / 2.0d;
        if (z) {
            return;
        }
        this.f3631ck = -this.f3631ck;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX INFO: renamed from: qw */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m72201qw() {
        boolean z = this.f3633fa;
        if (z && this.f3638up) {
            this.f3639yj = 2;
            double d = ((ValueAxisBase) this).f3636m9;
            if (d != 0.0d) {
                double d2 = ((ValueAxisBase) this).f3632dy;
                if (d2 == d && d2 > 0.0d) {
                    this.f3639yj = 1;
                    ((ValueAxisBase) this).f3630c5 = 0.0d;
                }
            }
            double d3 = ((ValueAxisBase) this).f3632dy;
            if (d3 == 0.0d || (d3 == d && d3 < 0.0d)) {
                this.f3639yj = 0;
                ((ValueAxisBase) this).f3634jd = 0.0d;
                return;
            }
            return;
        }
        if (z && !this.f3638up) {
            this.f3639yj = 0;
            double dM3041v4 = m3041v4();
            ((ValueAxisBase) this).f3634jd = dM3041v4;
            double d4 = ((ValueAxisBase) this).f3636m9;
            if (d4 <= 0.0d || d4 / dM3041v4 >= 0.8333333134651184d) {
                return;
            }
            ((ValueAxisBase) this).f3630c5 = 0.0d;
            return;
        }
        if (!z && this.f3638up) {
            this.f3639yj = 1;
            ((ValueAxisBase) this).f3630c5 = m3036kp();
            return;
        }
        this.f3639yj = 1;
        ((ValueAxisBase) this).f3630c5 = m3036kp();
        ((ValueAxisBase) this).f3634jd = m3041v4();
        if (m73026k4().m73384dy().isAutomaticMajorUnit()) {
            double[] dArr = {0.0d};
            C14743wm.m72796k4(kc0.m63750k4(((ValueAxisBase) this).f3634jd, ((ValueAxisBase) this).f3630c5), dArr, new double[]{0.0d}, m73026k4());
            this.f3631ck = dArr[0];
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m72202ri() {
        double d = ((ValueAxisBase) this).f3634jd - ((ValueAxisBase) this).f3630c5;
        this.f3631ck = m73026k4().m73384dy().getMajorUnit();
        double dM67477k4 = 0.0d;
        double[] dArr = {0.0d};
        double[] dArr2 = {0.0d};
        C14743wm.m72796k4(d, dArr, dArr2, m73026k4());
        double d2 = dArr[0];
        double d3 = dArr2[0];
        double d4 = ((ValueAxisBase) this).f3636m9;
        if (d4 / d < 5.0d) {
            if (this.f3633fa && this.f3638up) {
                this.f3633fa = false;
            }
            ((ValueAxisBase) this).f3630c5 = 0.0d;
            return;
        }
        ((ValueAxisBase) this).f3630c5 = d4;
        ((ValueAxisBase) this).f3634jd = d4 + d3;
        double dM67475k4 = C14116yg.m67475k4(d2);
        int iM63760to = kc0.m63760to(dM67475k4);
        while (dM67477k4 < ((ValueAxisBase) this).f3630c5) {
            dM67477k4 = C14116yg.m67477k4(dM67477k4, iM63760to) + dM67475k4;
        }
        if (this.f3633fa && this.f3638up) {
            ((ValueAxisBase) this).f3630c5 = dM67477k4 - this.f3631ck;
            this.f3633fa = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0106 A[PHI: r4
      0x0106: PHI (r4v11 double) = (r4v8 double), (r4v13 double) binds: [B:51:0x0120, B:45:0x0104] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010e  */
    /* JADX INFO: renamed from: t6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m72203t6() {
        Double dValueOf;
        double d = ((ValueAxisBase) this).f3630c5;
        int iM63760to = kc0.m63760to(this.f3631ck);
        while (true) {
            double d2 = ((ValueAxisBase) this).f3634jd;
            if (d > d2 && d >= d2 + this.f3631ck) {
                break;
            }
            double dM67477k4 = C14116yg.m67477k4(d, iM63760to);
            if (!m73026k4().m73384dy().isAutomaticMaxValue()) {
                double d3 = ((ValueAxisBase) this).f3634jd;
                if (dM67477k4 > d3) {
                    dValueOf = Double.valueOf(d3);
                } else {
                    if (!m73026k4().m73384dy().isAutomaticMinValue()) {
                        d3 = ((ValueAxisBase) this).f3630c5;
                        if (dM67477k4 < d3) {
                        }
                    }
                    dValueOf = Double.valueOf(dM67477k4);
                }
            }
            m73025k4(dValueOf);
            d = dM67477k4 + this.f3631ck;
        }
        boolean zM3031bv = m3031bv();
        Class cls = Double.TYPE;
        if (zM3031bv) {
            List<nxm> list = ((AbstractC14763x3) this).f49904k4;
            while (true) {
                double dDoubleValue = ((Double) C7019kk.m27464to(((nxm) OooO0O0.OooO00o(list, 1)).m68259m9(), cls)).doubleValue();
                if (dDoubleValue == 0.0d || dDoubleValue <= ((ValueAxisBase) this).f3632dy * 2.0d) {
                    break;
                }
                m73028k4((nxm) OooO0O0.OooO00o(((AbstractC14763x3) this).f49904k4, 1));
                list = ((AbstractC14763x3) this).f49904k4;
            }
        } else if (m73026k4().m73384dy().isAutomaticMaxValue()) {
            double dDoubleValue2 = ((AbstractC14763x3) this).f49904k4.size() > 0 ? ((Double) C7019kk.m27464to(((nxm) OooO0O0.OooO00o(((AbstractC14763x3) this).f49904k4, 1)).m68259m9(), cls)).doubleValue() : -2.147483648E9d;
            double dM63750k4 = kc0.m63750k4(dDoubleValue2, ((ValueAxisBase) this).f3632dy);
            double d4 = this.f3631ck;
            if (dM63750k4 > d4 && dDoubleValue2 != 0.0d) {
                while (true) {
                    double dM63750k42 = kc0.m63750k4(dDoubleValue2, ((ValueAxisBase) this).f3632dy);
                    double d5 = this.f3631ck;
                    if (dM63750k42 > d5 && dDoubleValue2 != 0.0d) {
                        double d6 = ((ValueAxisBase) this).f3632dy;
                        double d7 = ((ValueAxisBase) this).f3630c5;
                        if ((d6 - d7) / (dDoubleValue2 - d7) > 0.9523809523809523d) {
                            break;
                        }
                        dDoubleValue2 -= d5;
                        if ((d6 - d7) / (dDoubleValue2 - d7) <= 0.9523809523809523d) {
                            m73028k4((nxm) OooO0O0.OooO00o(((AbstractC14763x3) this).f49904k4, 1));
                        }
                    } else {
                        break;
                    }
                }
            } else {
                double d8 = ((ValueAxisBase) this).f3632dy;
                double d9 = ((ValueAxisBase) this).f3630c5;
                if ((d8 - d9) / (dDoubleValue2 - d9) > 0.9523809523809523d && dDoubleValue2 != 0.0d) {
                    m73025k4(Double.valueOf(C14116yg.m67477k4(dDoubleValue2 + d4, iM63760to)));
                }
            }
        }
        ((AbstractC14763x3) this).f49904k4.reverse();
    }

    /* JADX INFO: renamed from: tq */
    private void m72204tq() {
        double dM63750k4 = kc0.m63750k4(((ValueAxisBase) this).f3632dy, ((ValueAxisBase) this).f3636m9);
        double[] dArr = {0.0d};
        double[] dArr2 = {0.0d};
        C14743wm.m72796k4(dM63750k4, dArr, dArr2, m73026k4());
        double d = dArr[0];
        double d2 = dArr2[0];
        double d3 = ((ValueAxisBase) this).f3636m9;
        if (d3 / dM63750k4 < 5.0d) {
            if (this.f3633fa && this.f3638up) {
                this.f3633fa = false;
            }
            ((ValueAxisBase) this).f3630c5 = 0.0d;
            return;
        }
        ((ValueAxisBase) this).f3634jd = d3 + d2;
        this.f3631ck = C14116yg.m67475k4(d);
        if (kc0.m63750k4(((ValueAxisBase) this).f3632dy, ((ValueAxisBase) this).f3636m9) / this.f3631ck >= 5.0d) {
            m72200os();
        }
        int iM63760to = kc0.m63760to(this.f3631ck);
        double dM67477k4 = C14116yg.m67477k4((((ValueAxisBase) this).f3636m9 * 3.0d) - ((ValueAxisBase) this).f3632dy, 10);
        double d4 = this.f3631ck * 2.0d;
        double dM67490kk = C14116yg.m67490kk(dM67477k4 / d4);
        if (this.f3633fa && this.f3638up) {
            this.f3633fa = false;
            if (ChartTypeCharacterizer.isSeriesUsesXValueCoordinate(((AbstractC14763x3) this).f49908x1.get_Item(0).m64945h4().getType())) {
                ((ValueAxisBase) this).f3630c5 = ((ValueAxisBase) this).f3636m9 - this.f3631ck;
                return;
            }
            double dM67477k42 = C14116yg.m67477k4(dM67490kk * this.f3631ck, iM63760to);
            if ((((ValueAxisBase) this).f3636m9 - dM67477k42) / d4 > 2.0d) {
                dM67477k42 -= this.f3631ck;
            }
            ((ValueAxisBase) this).f3630c5 = dM67477k42;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080 A[PHI: r1
      0x0080: PHI (r1v14 double) = (r1v0 double), (r1v19 double) binds: [B:50:0x00ed, B:28:0x007e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b8 A[PHI: r1 r3 r10
      0x00b8: PHI (r1v13 double) = (r1v0 double), (r1v19 double) binds: [B:75:0x015f, B:44:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x00b8: PHI (r3v8 double) = (r3v6 double), (r3v12 double) binds: [B:75:0x015f, B:44:0x00b6] A[DONT_GENERATE, DONT_INLINE]
      0x00b8: PHI (r10v25 double) = (r10v20 double), (r10v29 double) binds: [B:75:0x015f, B:44:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: vh */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m72205vh() {
        boolean z;
        double dAbs;
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double dM67477k4 = ((ValueAxisBase) this).f3630c5;
        double dM67477k42 = ((ValueAxisBase) this).f3634jd;
        int iM63760to = kc0.m63760to(this.f3631ck);
        int i = this.f3639yj;
        if (i == 0) {
            double dM63750k4 = ((ValueAxisBase) this).f3634jd;
            if (m73026k4().m73384dy().isAutomaticMinValue()) {
                boolean z2 = false;
                while (true) {
                    double d6 = ((ValueAxisBase) this).f3630c5;
                    if (dM63750k4 < d6 && d6 - dM63750k4 >= this.f3631ck) {
                        break;
                    }
                    dM67477k4 = C14116yg.m67477k4(dM63750k4, iM63760to);
                    double d7 = this.f3631ck;
                    if (!z2) {
                        double d8 = dM67477k4 - d7;
                        if (Double.isInfinite(Math.abs(((ValueAxisBase) this).f3630c5 / d8)) || Math.abs(((ValueAxisBase) this).f3630c5 / d8) <= 20.0d) {
                            z = z2;
                            dAbs = dM67477k4;
                        } else {
                            dAbs = ((Math.abs(((ValueAxisBase) this).f3630c5 / d8) * d8) - d8) + dM67477k4;
                            z = true;
                        }
                    }
                    dM63750k4 = kc0.m63750k4(dAbs, d7);
                    z2 = z;
                }
                double dM63750k42 = kc0.m63750k4(((ValueAxisBase) this).f3636m9, dM67477k4);
                double d9 = this.f3631ck;
                if ((dM63750k42 <= d9 || dM67477k4 == 0.0d) && (((ValueAxisBase) this).f3636m9 - ((ValueAxisBase) this).f3630c5) / (dM67477k4 - ((ValueAxisBase) this).f3634jd) > 0.9523809523809523d && dM67477k4 != 0.0d) {
                    dM67477k4 = C14116yg.m67477k4(dM67477k4 - d9, iM63760to);
                }
            } else {
                dM67477k4 = m3036kp();
            }
        } else if (i == 1) {
            double d10 = 0.9523809523809523d;
            double d11 = ((ValueAxisBase) this).f3630c5;
            if (m73026k4().m73384dy().isAutomaticMaxValue()) {
                double dM67477k43 = C14116yg.m67477k4(d11, iM63760to);
                double d12 = this.f3631ck;
                int i2 = m3031bv() ? 20 : 10;
                while (true) {
                    d = dM67477k43;
                    double d13 = ((ValueAxisBase) this).f3632dy - ((ValueAxisBase) this).f3630c5;
                    double d14 = this.f3631ck;
                    d2 = d10;
                    if ((d13 + d14) / d14 >= i2) {
                        break;
                    }
                    m72197em();
                    d12 = d14;
                    dM67477k43 = d;
                    d10 = d2;
                }
                this.f3631ck = d12;
                double d15 = m3031bv() ? ((ValueAxisBase) this).f3632dy * 2.0d : ((ValueAxisBase) this).f3632dy + this.f3631ck;
                double dM63761x1 = d;
                while (dM63761x1 < d15) {
                    dM67477k42 = C14116yg.m67477k4(dM63761x1, iM63760to);
                    dM63761x1 = kc0.m63761x1(dM67477k42, this.f3631ck);
                }
                double dM63750k43 = kc0.m63750k4(dM67477k42, ((ValueAxisBase) this).f3632dy);
                d3 = this.f3631ck;
                if (dM63750k43 <= d3 || dM67477k42 == 0.0d) {
                    double d16 = ((ValueAxisBase) this).f3632dy;
                    double d17 = ((ValueAxisBase) this).f3630c5;
                    if ((d16 - d17) / (dM67477k42 - d17) > d2 && dM67477k42 != 0.0d) {
                    }
                }
            }
        } else if (i == 2) {
            if (m73026k4().m73384dy().isAutomaticMinValue()) {
                double dM63750k44 = 0.0d;
                d4 = 0.9523809523809523d;
                while (true) {
                    double d18 = ((ValueAxisBase) this).f3630c5;
                    if (dM63750k44 < d18) {
                        d5 = 0.0d;
                        if (d18 - dM63750k44 >= this.f3631ck) {
                            break;
                        }
                    }
                    dM67477k4 = C14116yg.m67477k4(dM63750k44, iM63760to);
                    dM63750k44 = kc0.m63750k4(dM67477k4, this.f3631ck);
                }
                double dM63750k45 = kc0.m63750k4(((ValueAxisBase) this).f3636m9, dM67477k4);
                double d19 = this.f3631ck;
                if ((dM63750k45 <= d19 || dM67477k4 == 0.0d) && (((ValueAxisBase) this).f3636m9 - ((ValueAxisBase) this).f3630c5) / (dM67477k4 - ((ValueAxisBase) this).f3634jd) > 0.9523809523809523d && dM67477k4 != 0.0d) {
                    dM67477k4 = C14116yg.m67477k4(dM67477k4 - d19, iM63760to);
                }
            } else {
                dM67477k4 = m3036kp();
                d4 = 0.9523809523809523d;
                d5 = 0.0d;
            }
            if (m73026k4().m73384dy().isAutomaticMaxValue()) {
                double dM63761x12 = d5;
                while (true) {
                    double d20 = ((ValueAxisBase) this).f3634jd;
                    if (dM63761x12 > d20 && dM63761x12 >= d20 + this.f3631ck) {
                        break;
                    }
                    dM67477k42 = C14116yg.m67477k4(dM63761x12, iM63760to);
                    dM63761x12 = kc0.m63761x1(dM67477k42, this.f3631ck);
                }
                double dM63750k46 = kc0.m63750k4(dM67477k42, ((ValueAxisBase) this).f3632dy);
                d3 = this.f3631ck;
                if (dM63750k46 <= d3 || dM67477k42 == d5) {
                    double d21 = ((ValueAxisBase) this).f3632dy;
                    double d22 = ((ValueAxisBase) this).f3630c5;
                    if ((d21 - d22) / (dM67477k42 - d22) > d4 && dM67477k42 != d5) {
                        dM67477k42 = C14116yg.m67477k4(dM67477k42 + d3, iM63760to);
                    }
                }
            } else {
                dM67477k42 = m3041v4();
            }
        }
        if (ChartTypeCharacterizer.m761jd(m73026k4().m73423wy().m69834fa().getType()) || ChartTypeCharacterizer.m761jd(((AbstractC14763x3) this).f49908x1.get_Item(0).m64945h4().getType())) {
            if (((ValueAxisBase) this).f3632dy == 1.0d && m73026k4().m73384dy().isAutomaticMaxValue()) {
                ((ValueAxisBase) this).f3634jd = 1.0d;
                dM67477k42 = 1.0d;
            }
            if (((ValueAxisBase) this).f3636m9 == -1.0d && m73026k4().m73384dy().isAutomaticMinValue()) {
                ((ValueAxisBase) this).f3630c5 = -1.0d;
                dM67477k4 = -1.0d;
            }
        }
        double d23 = this.f3631ck;
        double d24 = dM67477k42 - dM67477k4;
        if (d24 / d23 > (m3031bv() ? 21 : 11)) {
            m72200os();
            return;
        }
        m72197em();
        if (d24 > this.f3631ck * 10.0d) {
            this.f3631ck = d23;
        }
    }

    /* JADX INFO: renamed from: vj */
    private void m72206vj() {
        double dM3036kp = m73026k4().m73384dy().isAutomaticMinValue() ? ((ValueAxisBase) this).f3636m9 : m3036kp();
        double dM3041v4 = (!m73026k4().m73384dy().isAutomaticMaxValue() || m3031bv()) ? m3041v4() : ((ValueAxisBase) this).f3632dy;
        double[] dArr = {0.0d};
        double[] dArr2 = {0.0d};
        C14743wm.m72796k4(dM3036kp, dArr, dArr2, m73026k4());
        double d = dArr[0];
        double d2 = dArr2[0];
        double[] dArr3 = {0.0d};
        double[] dArr4 = {0.0d};
        C14743wm.m72796k4(dM3041v4, dArr3, dArr4, m73026k4());
        double d3 = dArr3[0];
        double d4 = dArr4[0];
        double dM67502x1 = C14116yg.m67502x1(d, d3);
        this.f3631ck = dM67502x1;
        this.f3631ck = C14116yg.m67475k4(dM67502x1);
        ((ValueAxisBase) this).f3630c5 = C14116yg.m67491kk(dM3036kp, d2);
        ((ValueAxisBase) this).f3634jd = C14116yg.m67502x1(dM3041v4, d4);
        if (dM3036kp != dM3041v4) {
            if (dM3036kp > 0.0d && dM3041v4 > 0.0d) {
                m72204tq();
            } else if (dM3036kp < 0.0d && dM3041v4 < 0.0d) {
                m72199j2();
            } else if (dM3036kp < 0.0d && dM3041v4 >= 0.0d) {
                m72207w6();
            }
        }
        m72201qw();
        m72205vh();
    }

    /* JADX INFO: renamed from: w6 */
    private void m72207w6() {
        double[] dArr = {0.0d};
        C14743wm.m72796k4(((ValueAxisBase) this).f3632dy - ((ValueAxisBase) this).f3636m9, dArr, new double[]{0.0d}, m73026k4());
        double dM67475k4 = C14116yg.m67475k4(dArr[0]);
        this.f3631ck = dM67475k4;
        if ((((ValueAxisBase) this).f3632dy - ((ValueAxisBase) this).f3636m9) / dM67475k4 > 9.0d) {
            m72200os();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x011d  */
    /* JADX INFO: renamed from: xw */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m72208xw() {
        Double dValueOf;
        C14046bv c14046bvClone = C7019kk.m27440jd(Double.valueOf(((ValueAxisBase) this).f3634jd), 14).Clone();
        int iM63760to = kc0.m63760to(this.f3631ck);
        while (true) {
            if (!C14046bv.m66460jd(c14046bvClone, C7019kk.m27440jd(Double.valueOf(((ValueAxisBase) this).f3630c5), 14)) && !C14046bv.m66448ck(C14046bv.m66490to(C7019kk.m27440jd(Double.valueOf(((ValueAxisBase) this).f3630c5), 14), c14046bvClone), C7019kk.m27440jd(Double.valueOf(this.f3631ck), 14))) {
                break;
            }
            double dM67477k4 = C14116yg.m67477k4(C7019kk.m27433c5(c14046bvClone, 15), iM63760to);
            if (!m73026k4().m73384dy().isAutomaticMinValue()) {
                double d = ((ValueAxisBase) this).f3630c5;
                dValueOf = dM67477k4 < d ? Double.valueOf(d) : Double.valueOf(dM67477k4);
            }
            m73025k4(dValueOf);
            C14046bv.m66490to(c14046bvClone, C7019kk.m27440jd(Double.valueOf(this.f3631ck), 14)).CloneTo(c14046bvClone);
        }
        if (m73026k4().m73384dy().isAutomaticMinValue()) {
            double dDoubleValue = ((AbstractC14763x3) this).f49904k4.size() > 0 ? ((Double) C7019kk.m27464to(((nxm) OooO0O0.OooO00o(((AbstractC14763x3) this).f49904k4, 1)).m68259m9(), Double.TYPE)).doubleValue() : 2.147483647E9d;
            double d2 = ((ValueAxisBase) this).f3636m9;
            double d3 = d2 - dDoubleValue;
            double d4 = this.f3631ck;
            if (d3 <= d4 || dDoubleValue == 0.0d) {
                double d5 = ((ValueAxisBase) this).f3634jd;
                if ((d2 - d5) / (dDoubleValue - d5) > 0.9523809523809523d && dDoubleValue != 0.0d) {
                    C7019kk.m27440jd(Double.valueOf(C14116yg.m67477k4(dDoubleValue - d4, iM63760to)), 14).CloneTo(c14046bvClone);
                    m73025k4(c14046bvClone.Clone());
                }
            } else {
                double d6 = ((ValueAxisBase) this).f3634jd;
                if ((d2 - d6) / ((dDoubleValue + d4) - d6) <= 0.9523809523809523d) {
                    m73028k4((nxm) OooO0O0.OooO00o(((AbstractC14763x3) this).f49904k4, 1));
                }
            }
        }
        for (int i = 0; i < ((AbstractC14763x3) this).f49904k4.size(); i++) {
            ((AbstractC14763x3) this).f49904k4.get_Item(i).m68256k4(Double.valueOf(C14080ne.m66903fa(((AbstractC14763x3) this).f49904k4.get_Item(i).m68259m9())));
        }
    }

    /* JADX INFO: renamed from: zj */
    private void m72209zj() {
        double d = ((ValueAxisBase) this).f3636m9;
        double d2 = ((ValueAxisBase) this).f3632dy;
        if (d != d2) {
            if (d >= 0.0d && d2 >= 0.0d) {
                m72202ri();
            } else if (d < 0.0d && d2 < 0.0d) {
                m72196ai();
            }
        }
        m72201qw();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005a  */
    /* JADX INFO: renamed from: ar */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m72210ar() {
        for (int i = 0; i < ((AbstractC14763x3) this).f49904k4.size(); i++) {
            int i2 = i - 1;
            Class cls = Double.TYPE;
            if (i2 <= 0) {
                int i3 = i + 1;
                if (i3 >= ((AbstractC14763x3) this).f49904k4.size() || C14116yg.m67475k4(kc0.m63750k4(this.f3631ck, C14116yg.m67475k4(kc0.m63750k4(((Double) C7019kk.m27464to(((AbstractC14763x3) this).f49904k4.get_Item(i).m68259m9(), cls)).doubleValue(), ((Double) C7019kk.m27464to(((AbstractC14763x3) this).f49904k4.get_Item(i3).m68259m9(), cls)).doubleValue())))) / this.f3631ck <= 1.0E-6d) {
                }
            } else if (C14116yg.m67475k4(kc0.m63750k4(this.f3631ck, C14116yg.m67475k4(kc0.m63750k4(((Double) C7019kk.m27464to(((AbstractC14763x3) this).f49904k4.get_Item(i).m68259m9(), cls)).doubleValue(), ((Double) C7019kk.m27464to(((AbstractC14763x3) this).f49904k4.get_Item(i2).m68259m9(), cls)).doubleValue())))) / this.f3631ck > 1.0E-6d) {
                ((AbstractC14763x3) this).f49904k4.get_Item(i).mo63967x1(false);
            }
        }
    }

    @Override // com.aspose.slides.ValueAxisBase
    /* JADX INFO: renamed from: qq */
    public void mo3038qq() {
        this.f3633fa = m73026k4().m73384dy().isAutomaticMinValue();
        this.f3638up = m73026k4().m73384dy().isAutomaticMaxValue();
        if (m73026k4().m73422wl()) {
            m72206vj();
        } else {
            m72209zj();
        }
        if (!m73026k4().m73411qq() && this.f3631ck < m73026k4().m73374ar()) {
            this.f3631ck = m73026k4().m73374ar();
        }
        if (!m73026k4().m73384dy().isAutomaticMajorUnit()) {
            this.f3631ck = m73026k4().m73384dy().getMajorUnit();
        }
        while (true) {
            double d = ((ValueAxisBase) this).f3634jd - ((ValueAxisBase) this).f3630c5;
            double d2 = this.f3631ck;
            if (d / d2 <= 1000.0d) {
                return;
            } else {
                this.f3631ck = d2 * 2.0d;
            }
        }
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: u4 */
    public List<Float> mo63717u4() {
        List<Float> list = new List<>();
        for (int size = ((AbstractC14763x3) this).f49904k4.size() - 1; size >= 0; size--) {
            if (((AbstractC14763x3) this).f49904k4.get_Item(size).mo3221T_()) {
                list.addItem(Float.valueOf(mo4964k4(((Double) C7019kk.m27464to(((AbstractC14763x3) this).f49904k4.get_Item(size).m68259m9(), Double.TYPE)).doubleValue())));
            }
        }
        return list;
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: up */
    public float mo63718up() {
        return mo4964k4(mo63720yj());
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: uz */
    public List<Float> mo63719uz() {
        float f;
        List<Float> list = new List<>();
        float fM73203ak = m73020du() ? m73203ak() : m73225wy();
        float fM73374ar = (float) ((m73026k4().m73374ar() / (m3033gi() - m3039s7())) * ((double) fM73203ak));
        if (fM73374ar == 0.0f) {
            throw new PptxException("MinorTickMarkElement step can't be equal 0");
        }
        if (m73026k4().m73384dy().isPlotOrderReversed()) {
            f = 0.0f;
        } else {
            fM73374ar = -fM73374ar;
            f = fM73203ak;
        }
        do {
            list.addItem(Float.valueOf(f));
            f += fM73374ar;
            if (f < 0.0f) {
                break;
            }
        } while (f <= fM73203ak);
        return list;
    }

    @Override // com.aspose.slides.ValueAxisBase
    /* JADX INFO: renamed from: wl */
    public void mo3042wl() {
        ((AbstractC14763x3) this).f49904k4.clear();
        m73224wp();
        int i = this.f3639yj;
        if (i == 0) {
            m72208xw();
        } else if (i == 1) {
            m72203t6();
        } else if (i == 2) {
            m72198f9();
        }
        if ((ChartTypeCharacterizer.m761jd(m73026k4().m73423wy().m69834fa().getType()) || ChartTypeCharacterizer.m761jd(((AbstractC14763x3) this).f49908x1.get_Item(0).m64945h4().getType())) && ((Double) C7019kk.m27464to(((AbstractC14763x3) this).f49904k4.get_Item(0).m68259m9(), Double.TYPE)).doubleValue() > ((ValueAxisBase) this).f3634jd) {
            m73028k4(((AbstractC14763x3) this).f49904k4.get_Item(0));
        }
    }

    @Override // com.aspose.slides.AbstractC14763x3
    /* JADX INFO: renamed from: yj */
    public double mo63720yj() {
        double d = ((ValueAxisBase) this).f3634jd;
        double d2 = ((ValueAxisBase) this).f3630c5;
        double crossAt = m73026k4().m73384dy().getCrossAt();
        if (m73026k4().m73384dy().getCrossType() == 1) {
            crossAt = d;
        }
        if (crossAt <= d) {
            d = crossAt;
        }
        if (d < d2) {
            d = d2;
        }
        return (((AbstractC14763x3) this).f49908x1.get_Item(0).m64945h4().getType() == 78 || ((AbstractC14763x3) this).f49908x1.get_Item(0).m64945h4().getType() == 79) ? d2 : d;
    }
}
