package com.aspose.slides.internal.p156gw;

import OooO0O0.C20394OooO0Oo;
import com.aspose.slides.internal.p031aw.C1564k4;
import com.aspose.slides.o000oOoO;

/* JADX INFO: renamed from: com.aspose.slides.internal.gw.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C4400k4 implements Cloneable {

    /* JADX INFO: renamed from: c5 */
    private static final int[] f12022c5 = {4, 5, 4, 5, 2, 3, 6, 7};

    /* JADX INFO: renamed from: du */
    double f12023du;

    /* JADX INFO: renamed from: dy */
    private transient int f12024dy;

    /* JADX INFO: renamed from: h4 */
    double f12025h4;

    /* JADX INFO: renamed from: k4 */
    double f12026k4;

    /* JADX INFO: renamed from: kk */
    double f12027kk;

    /* JADX INFO: renamed from: m9 */
    transient int f12028m9;

    /* JADX INFO: renamed from: to */
    double f12029to;

    /* JADX INFO: renamed from: x1 */
    double f12030x1;

    public C4400k4() {
        this.f12029to = 1.0d;
        this.f12026k4 = 1.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a2 A[PHI: r1
      0x00a2: PHI (r1v6 int) = (r1v2 int), (r1v8 int) binds: [B:86:0x00e0, B:58:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a6 A[PHI: r1
      0x00a6: PHI (r1v5 int) = (r1v2 int), (r1v8 int), (r1v8 int) binds: [B:86:0x00e0, B:56:0x009c, B:58:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX INFO: renamed from: fa */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m17910fa() {
        int i;
        int i2;
        double d;
        int i3;
        double d2;
        int i4;
        double d3;
        double d4;
        double d5;
        double d6;
        m17934kk();
        switch (this.f12028m9) {
            case 0:
                i = 0;
            case 1:
                this.f12024dy = i;
                break;
            case 2:
                i = 0;
                double d7 = this.f12026k4;
                i2 = d7 < 0.0d ? 1 : 0;
                d = this.f12029to;
                if (i2 == (d < 0.0d ? 0 : 1)) {
                    i = d7 == (-d) ? (d7 == 1.0d || d7 == -1.0d) ? i | 64 : i | 66 : i | 68;
                } else if (i2 != 0) {
                    i = d7 == d ? i | 2 : i | 4;
                } else {
                    if (d7 == d) {
                        i = d7 != -1.0d ? i | 10 : i | 8;
                    }
                    i = i | 12;
                }
                this.f12024dy = i;
                break;
            case 3:
                i = 1;
                double d72 = this.f12026k4;
                if (d72 < 0.0d) {
                }
                d = this.f12029to;
                if (i2 == (d < 0.0d ? 0 : 1)) {
                }
                this.f12024dy = i;
                break;
            case 4:
                i = 0;
                double d8 = this.f12027kk;
                i3 = d8 < 0.0d ? 1 : 0;
                d2 = this.f12030x1;
                if (i3 != (d2 < 0.0d ? 0 : 1)) {
                    i = d8 == d2 ? i | 74 : i | 76;
                    this.f12024dy = i;
                } else {
                    if (d8 == (-d2)) {
                        if (d8 == 1.0d || d8 == -1.0d) {
                        }
                        this.f12024dy = i;
                    }
                    i = i | 12;
                    this.f12024dy = i;
                }
                break;
            case 5:
                i = 1;
                double d82 = this.f12027kk;
                if (d82 < 0.0d) {
                }
                d2 = this.f12030x1;
                if (i3 != (d2 < 0.0d ? 0 : 1)) {
                }
                break;
            case 6:
                i4 = 0;
                d3 = this.f12026k4;
                d4 = this.f12027kk;
                d5 = this.f12030x1;
                d6 = this.f12029to;
                if ((d5 * d6) + (d3 * d4) != 0.0d) {
                    i = ((d3 > 0.0d ? 1 : (d3 == 0.0d ? 0 : -1)) >= 0 ? 1 : 0) == (d6 < 0.0d ? 0 : 1) ? (d3 == d6 && d4 == (-d5)) ? (d3 * d6) - (d4 * d5) != 1.0d ? i4 | 18 : i4 | 16 : i4 | 20 : (d3 == (-d6) && d4 == d5) ? (d3 * d6) - (d4 * d5) != 1.0d ? i4 | 82 : i4 | 80 : i4 | 84;
                    this.f12024dy = i;
                } else {
                    this.f12024dy = 32;
                }
                break;
            default:
                m17917up();
            case 7:
                i4 = 1;
                d3 = this.f12026k4;
                d4 = this.f12027kk;
                d5 = this.f12030x1;
                d6 = this.f12029to;
                if ((d5 * d6) + (d3 * d4) != 0.0d) {
                }
                break;
        }
    }

    /* JADX INFO: renamed from: ks */
    private final void m17914ks() {
        double d = -this.f12026k4;
        this.f12026k4 = d;
        double d2 = -this.f12029to;
        this.f12029to = d2;
        int i = this.f12028m9;
        if ((i & 4) != 0) {
            this.f12027kk = -this.f12027kk;
            this.f12030x1 = -this.f12030x1;
        } else {
            this.f12028m9 = (d == 1.0d && d2 == 1.0d) ? i & (-3) : i | 2;
        }
        this.f12024dy = -1;
    }

    /* JADX INFO: renamed from: rv */
    private final void m17915rv() {
        double d = this.f12026k4;
        double d2 = -this.f12027kk;
        this.f12026k4 = d2;
        this.f12027kk = d;
        double d3 = this.f12030x1;
        this.f12030x1 = -this.f12029to;
        this.f12029to = d3;
        int i = f12022c5[this.f12028m9];
        if ((i & 6) == 2 && d2 == 1.0d && d3 == 1.0d) {
            i -= 2;
        }
        this.f12028m9 = i;
        this.f12024dy = -1;
    }

    /* JADX INFO: renamed from: up */
    private void m17917up() {
        throw new InternalError("missing case in transform state switch");
    }

    /* JADX INFO: renamed from: yj */
    private final void m17919yj() {
        double d = this.f12026k4;
        double d2 = this.f12027kk;
        this.f12026k4 = d2;
        this.f12027kk = -d;
        double d3 = this.f12030x1;
        this.f12030x1 = this.f12029to;
        double d4 = -d3;
        this.f12029to = d4;
        int i = f12022c5[this.f12028m9];
        if ((i & 6) == 2 && d2 == 1.0d && d4 == 1.0d) {
            i -= 2;
        }
        this.f12028m9 = i;
        this.f12024dy = -1;
    }

    /* JADX INFO: renamed from: c5 */
    public double m17920c5() {
        return this.f12025h4;
    }

    /* JADX INFO: renamed from: ck */
    public C4400k4 m17921ck() throws C1564k4 {
        switch (this.f12028m9) {
            case 0:
                return new C4400k4();
            case 1:
                return new C4400k4(1.0d, 0.0d, 0.0d, 1.0d, -this.f12023du, -this.f12025h4, 1);
            case 2:
                double d = this.f12026k4;
                if (d != 0.0d) {
                    double d2 = this.f12029to;
                    if (d2 != 0.0d) {
                        return new C4400k4(1.0d / d, 0.0d, 0.0d, 1.0d / d2, 0.0d, 0.0d, 2);
                    }
                }
                throw new C1564k4("Determinant is 0");
            case 3:
                double d3 = this.f12026k4;
                if (d3 != 0.0d) {
                    double d4 = this.f12029to;
                    if (d4 != 0.0d) {
                        return new C4400k4(1.0d / d3, 0.0d, 0.0d, 1.0d / d4, (-this.f12023du) / d3, (-this.f12025h4) / d4, 3);
                    }
                }
                throw new C1564k4("Determinant is 0");
            case 4:
                double d5 = this.f12027kk;
                if (d5 != 0.0d) {
                    double d6 = this.f12030x1;
                    if (d6 != 0.0d) {
                        return new C4400k4(0.0d, 1.0d / d5, 1.0d / d6, 0.0d, 0.0d, 0.0d, 4);
                    }
                }
                throw new C1564k4("Determinant is 0");
            case 5:
                double d7 = this.f12027kk;
                if (d7 != 0.0d) {
                    double d8 = this.f12030x1;
                    if (d8 != 0.0d) {
                        return new C4400k4(0.0d, 1.0d / d7, 1.0d / d8, 0.0d, (-this.f12025h4) / d8, (-this.f12023du) / d7, 5);
                    }
                }
                throw new C1564k4("Determinant is 0");
            case 6:
                double d9 = (this.f12026k4 * this.f12029to) - (this.f12027kk * this.f12030x1);
                if (Math.abs(d9) > Double.MIN_VALUE) {
                    return new C4400k4(this.f12029to / d9, (-this.f12030x1) / d9, (-this.f12027kk) / d9, this.f12026k4 / d9, 0.0d, 0.0d, 6);
                }
                throw new C1564k4("Determinant is " + d9);
            case 7:
                double d10 = (this.f12026k4 * this.f12029to) - (this.f12027kk * this.f12030x1);
                if (Math.abs(d10) <= Double.MIN_VALUE) {
                    throw new C1564k4("Determinant is " + d10);
                }
                double d11 = this.f12029to;
                double d12 = this.f12030x1;
                double d13 = (-d12) / d10;
                double d14 = this.f12027kk;
                double d15 = (-d14) / d10;
                double d16 = this.f12026k4;
                double d17 = this.f12025h4;
                double d18 = this.f12023du;
                return new C4400k4(d11 / d10, d13, d15, d16 / d10, C20394OooO0Oo.OooO00o(d11, d18, d14 * d17, d10), C20394OooO0Oo.OooO00o(d16, d17, d12 * d18, d10), 7);
            default:
                m17917up();
                return null;
        }
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new Error(e);
        }
    }

    /* JADX INFO: renamed from: du */
    public double m17922du() {
        return this.f12029to;
    }

    /* JADX INFO: renamed from: dy */
    public double m17924dy() {
        return this.f12023du;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4400k4)) {
            return false;
        }
        C4400k4 c4400k4 = (C4400k4) obj;
        return this.f12026k4 == c4400k4.f12026k4 && this.f12027kk == c4400k4.f12027kk && this.f12023du == c4400k4.f12023du && this.f12030x1 == c4400k4.f12030x1 && this.f12029to == c4400k4.f12029to && this.f12025h4 == c4400k4.f12025h4;
    }

    /* JADX INFO: renamed from: h4 */
    public double m17925h4() {
        return this.f12027kk;
    }

    public int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f12025h4) + ((Double.doubleToLongBits(this.f12029to) + ((Double.doubleToLongBits(this.f12030x1) + ((Double.doubleToLongBits(this.f12023du) + ((Double.doubleToLongBits(this.f12027kk) + (Double.doubleToLongBits(this.f12026k4) * 31)) * 31)) * 31)) * 31)) * 31);
        return ((int) jDoubleToLongBits) ^ ((int) (jDoubleToLongBits >> 32));
    }

    /* JADX INFO: renamed from: jd */
    public void m17927jd() {
        this.f12029to = 1.0d;
        this.f12026k4 = 1.0d;
        this.f12025h4 = 0.0d;
        this.f12023du = 0.0d;
        this.f12027kk = 0.0d;
        this.f12030x1 = 0.0d;
        this.f12028m9 = 0;
        this.f12024dy = 0;
    }

    /* JADX INFO: renamed from: k4 */
    public int m17928k4() {
        if (this.f12024dy == -1) {
            m17910fa();
        }
        return this.f12024dy;
    }

    /* JADX INFO: renamed from: kk */
    public void m17934kk() {
        if (this.f12027kk == 0.0d && this.f12030x1 == 0.0d) {
            if (this.f12026k4 == 1.0d && this.f12029to == 1.0d) {
                if (this.f12023du == 0.0d && this.f12025h4 == 0.0d) {
                    this.f12028m9 = 0;
                    this.f12024dy = 0;
                    return;
                } else {
                    this.f12028m9 = 1;
                    this.f12024dy = 1;
                    return;
                }
            }
            if (this.f12023du == 0.0d && this.f12025h4 == 0.0d) {
                this.f12028m9 = 2;
                this.f12024dy = -1;
                return;
            } else {
                this.f12028m9 = 3;
                this.f12024dy = -1;
                return;
            }
        }
        if (this.f12026k4 == 0.0d && this.f12029to == 0.0d) {
            if (this.f12023du == 0.0d && this.f12025h4 == 0.0d) {
                this.f12028m9 = 4;
                this.f12024dy = -1;
                return;
            } else {
                this.f12028m9 = 5;
                this.f12024dy = -1;
                return;
            }
        }
        if (this.f12023du == 0.0d && this.f12025h4 == 0.0d) {
            this.f12028m9 = 6;
            this.f12024dy = -1;
        } else {
            this.f12028m9 = 7;
            this.f12024dy = -1;
        }
    }

    /* JADX INFO: renamed from: m9 */
    public double m17939m9() {
        return this.f12030x1;
    }

    /* JADX INFO: renamed from: to */
    public double m17941to() {
        return this.f12026k4;
    }

    public String toString() {
        return "AffineTransform[[" + m17916to(this.f12026k4) + ", " + m17916to(this.f12027kk) + ", " + m17916to(this.f12023du) + "], [" + m17916to(this.f12030x1) + ", " + m17916to(this.f12029to) + ", " + m17916to(this.f12025h4) + "]]";
    }

    /* JADX INFO: renamed from: x1 */
    public double m17943x1() {
        switch (this.f12028m9) {
            case 0:
            case 1:
                return 1.0d;
            case 2:
            case 3:
                return this.f12026k4 * this.f12029to;
            case 4:
            case 5:
                return -(this.f12027kk * this.f12030x1);
            case 6:
            case 7:
                break;
            default:
                m17917up();
                break;
        }
        return (this.f12026k4 * this.f12029to) - (this.f12027kk * this.f12030x1);
    }

    public C4400k4(double d, double d2, double d3, double d4, double d5, double d6) {
        this.f12026k4 = d;
        this.f12030x1 = d2;
        this.f12027kk = d3;
        this.f12029to = d4;
        this.f12023du = d5;
        this.f12025h4 = d6;
        m17934kk();
    }

    /* JADX INFO: renamed from: k4 */
    public static C4400k4 m17911k4(double d) {
        C4400k4 c4400k4 = new C4400k4();
        c4400k4.m17935kk(d);
        return c4400k4;
    }

    /* JADX INFO: renamed from: to */
    private static double m17916to(double d) {
        return Math.rint(d * 1.0E15d) / 1.0E15d;
    }

    /* JADX INFO: renamed from: x1 */
    public static C4400k4 m17918x1(double d, double d2) {
        C4400k4 c4400k4 = new C4400k4();
        c4400k4.m17940m9(d, d2);
        return c4400k4;
    }

    /* JADX INFO: renamed from: du */
    public void m17923du(double d, double d2) {
        int i = this.f12028m9;
        switch (i) {
            case 0:
            case 1:
                this.f12027kk = d;
                this.f12030x1 = d2;
                if (d != 0.0d || d2 != 0.0d) {
                    this.f12028m9 = i | 6;
                    this.f12024dy = -1;
                }
                break;
            case 2:
            case 3:
                double d3 = this.f12026k4 * d;
                this.f12027kk = d3;
                double d4 = this.f12029to * d2;
                this.f12030x1 = d4;
                if (d3 != 0.0d || d4 != 0.0d) {
                    this.f12028m9 = i | 4;
                }
                this.f12024dy = -1;
                break;
            case 4:
            case 5:
                double d5 = this.f12027kk * d2;
                this.f12026k4 = d5;
                double d6 = this.f12030x1 * d;
                this.f12029to = d6;
                if (d5 != 0.0d || d6 != 0.0d) {
                    this.f12028m9 = i | 2;
                }
                this.f12024dy = -1;
                break;
            case 6:
            case 7:
                double d7 = this.f12026k4;
                double d8 = this.f12027kk;
                this.f12026k4 = (d8 * d2) + d7;
                this.f12027kk = (d7 * d) + d8;
                double d9 = this.f12030x1;
                double d10 = this.f12029to;
                this.f12030x1 = (d2 * d10) + d9;
                this.f12029to = (d9 * d) + d10;
                m17934kk();
                break;
            default:
                m17917up();
                break;
        }
    }

    /* JADX INFO: renamed from: h4 */
    public void m17926h4(double d, double d2) {
        this.f12026k4 = 1.0d;
        this.f12030x1 = 0.0d;
        this.f12027kk = 0.0d;
        this.f12029to = 1.0d;
        this.f12023du = d;
        this.f12025h4 = d2;
        int i = (d == 0.0d && d2 == 0.0d) ? 0 : 1;
        this.f12028m9 = i;
        this.f12024dy = i;
    }

    /* JADX INFO: renamed from: kk */
    public void m17935kk(double d) {
        double dCos;
        double dSin = Math.sin(d);
        if (dSin == 1.0d || dSin == -1.0d) {
            this.f12028m9 = 4;
            this.f12024dy = 8;
            dCos = 0.0d;
        } else {
            dCos = Math.cos(d);
            if (dCos == -1.0d) {
                this.f12028m9 = 2;
                this.f12024dy = 8;
            } else if (dCos == 1.0d) {
                this.f12028m9 = 0;
                this.f12024dy = 0;
            } else {
                this.f12028m9 = 6;
                this.f12024dy = 16;
            }
            dSin = 0.0d;
        }
        this.f12026k4 = dCos;
        this.f12030x1 = dSin;
        this.f12027kk = -dSin;
        this.f12029to = dCos;
        this.f12023du = 0.0d;
        this.f12025h4 = 0.0d;
    }

    /* JADX INFO: renamed from: m9 */
    public void m17940m9(double d, double d2) {
        int i;
        this.f12026k4 = d;
        this.f12030x1 = 0.0d;
        this.f12027kk = 0.0d;
        this.f12029to = d2;
        this.f12023du = 0.0d;
        this.f12025h4 = 0.0d;
        if (d == 1.0d && d2 == 1.0d) {
            i = 0;
            this.f12028m9 = 0;
        } else {
            this.f12028m9 = 2;
            i = -1;
        }
        this.f12024dy = i;
    }

    private C4400k4(double d, double d2, double d3, double d4, double d5, double d6, int i) {
        this.f12026k4 = d;
        this.f12030x1 = d2;
        this.f12027kk = d3;
        this.f12029to = d4;
        this.f12023du = d5;
        this.f12025h4 = d6;
        this.f12028m9 = i;
        this.f12024dy = -1;
    }

    /* JADX INFO: renamed from: k4 */
    public static C4400k4 m17912k4(double d, double d2) {
        C4400k4 c4400k4 = new C4400k4();
        c4400k4.m17926h4(d, d2);
        return c4400k4;
    }

    /* JADX INFO: renamed from: kk */
    public void m17936kk(double d, double d2) {
        switch (this.f12028m9) {
            case 0:
                this.f12023du = d;
                this.f12025h4 = d2;
                if (d != 0.0d || d2 != 0.0d) {
                    this.f12028m9 = 1;
                    this.f12024dy = 1;
                }
                break;
            case 1:
                double d3 = d + this.f12023du;
                this.f12023du = d3;
                double d4 = d2 + this.f12025h4;
                this.f12025h4 = d4;
                if (d3 == 0.0d && d4 == 0.0d) {
                    this.f12028m9 = 0;
                    this.f12024dy = 0;
                    break;
                }
                break;
            case 2:
                double d5 = d * this.f12026k4;
                this.f12023du = d5;
                double d6 = d2 * this.f12029to;
                this.f12025h4 = d6;
                if (d5 != 0.0d || d6 != 0.0d) {
                    this.f12028m9 = 3;
                    this.f12024dy |= 1;
                }
                break;
            case 3:
                double d7 = (d * this.f12026k4) + this.f12023du;
                this.f12023du = d7;
                double d8 = (d2 * this.f12029to) + this.f12025h4;
                this.f12025h4 = d8;
                if (d7 == 0.0d && d8 == 0.0d) {
                    this.f12028m9 = 2;
                    int i = this.f12024dy;
                    if (i != -1) {
                        this.f12024dy = i - 1;
                    }
                    break;
                }
                break;
            case 4:
                double d9 = d2 * this.f12027kk;
                this.f12023du = d9;
                double d10 = d * this.f12030x1;
                this.f12025h4 = d10;
                if (d9 != 0.0d || d10 != 0.0d) {
                    this.f12028m9 = 5;
                    this.f12024dy |= 1;
                }
                break;
            case 5:
                double d11 = (d2 * this.f12027kk) + this.f12023du;
                this.f12023du = d11;
                double d12 = (d * this.f12030x1) + this.f12025h4;
                this.f12025h4 = d12;
                if (d11 == 0.0d && d12 == 0.0d) {
                    this.f12028m9 = 4;
                    int i2 = this.f12024dy;
                    if (i2 != -1) {
                        this.f12024dy = i2 - 1;
                    }
                    break;
                }
                break;
            case 6:
                double d13 = (this.f12027kk * d2) + (this.f12026k4 * d);
                this.f12023du = d13;
                double d14 = (d2 * this.f12029to) + (d * this.f12030x1);
                this.f12025h4 = d14;
                if (d13 != 0.0d || d14 != 0.0d) {
                    this.f12028m9 = 7;
                    this.f12024dy |= 1;
                }
                break;
            case 7:
                double d15 = (this.f12027kk * d2) + (this.f12026k4 * d) + this.f12023du;
                this.f12023du = d15;
                double d16 = (d2 * this.f12029to) + (d * this.f12030x1) + this.f12025h4;
                this.f12025h4 = d16;
                if (d15 == 0.0d && d16 == 0.0d) {
                    this.f12028m9 = 6;
                    int i3 = this.f12024dy;
                    if (i3 != -1) {
                        this.f12024dy = i3 - 1;
                    }
                    break;
                }
                break;
            default:
                m17917up();
                break;
        }
    }

    /* JADX INFO: renamed from: to */
    public void m17942to(double d, double d2) {
        int i = this.f12028m9;
        switch (i) {
            case 0:
            case 1:
                this.f12026k4 = d;
                this.f12029to = d2;
                if (d != 1.0d || d2 != 1.0d) {
                    this.f12028m9 = i | 2;
                    this.f12024dy = -1;
                }
                break;
            case 2:
            case 3:
                double d3 = this.f12026k4 * d;
                this.f12026k4 = d3;
                double d4 = this.f12029to * d2;
                this.f12029to = d4;
                if (d3 == 1.0d && d4 == 1.0d) {
                    int i2 = i & 1;
                    this.f12028m9 = i2;
                    this.f12024dy = i2 != 0 ? 1 : 0;
                } else {
                    this.f12024dy = -1;
                }
                break;
            default:
                m17917up();
            case 6:
            case 7:
                this.f12026k4 *= d;
                this.f12029to *= d2;
            case 4:
            case 5:
                double d5 = this.f12027kk * d2;
                this.f12027kk = d5;
                double d6 = this.f12030x1 * d;
                this.f12030x1 = d6;
                if (d5 == 0.0d && d6 == 0.0d) {
                    int i3 = i & 1;
                    if (this.f12026k4 == 1.0d && this.f12029to == 1.0d) {
                        this.f12024dy = i3 != 0 ? 1 : 0;
                    } else {
                        i3 |= 2;
                        this.f12024dy = -1;
                    }
                    this.f12028m9 = i3;
                    break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public void m17944x1(double d) {
        double dSin = Math.sin(d);
        if (dSin == 1.0d) {
            m17919yj();
            return;
        }
        if (dSin == -1.0d) {
            m17915rv();
            return;
        }
        double dCos = Math.cos(d);
        if (dCos == -1.0d) {
            m17914ks();
            return;
        }
        if (dCos != 1.0d) {
            double d2 = this.f12026k4;
            double d3 = this.f12027kk;
            this.f12026k4 = (dSin * d3) + (dCos * d2);
            double d4 = -dSin;
            this.f12027kk = (d3 * dCos) + (d2 * d4);
            double d5 = this.f12030x1;
            double d6 = this.f12029to;
            this.f12030x1 = (dSin * d6) + (dCos * d5);
            this.f12029to = (dCos * d6) + (d4 * d5);
            m17934kk();
        }
    }

    public C4400k4(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f12026k4 = f;
        this.f12030x1 = f2;
        this.f12027kk = f3;
        this.f12029to = f4;
        this.f12023du = f5;
        this.f12025h4 = f6;
        m17934kk();
    }

    /* JADX INFO: renamed from: k4 */
    public static C4400k4 m17913k4(double d, double d2, double d3) {
        C4400k4 c4400k4 = new C4400k4();
        c4400k4.m17937kk(d, d2, d3);
        return c4400k4;
    }

    /* JADX INFO: renamed from: kk */
    public void m17937kk(double d, double d2, double d3) {
        m17935kk(d);
        double d4 = this.f12030x1;
        double d5 = 1.0d - this.f12026k4;
        double d6 = (d3 * d4) + (d2 * d5);
        this.f12023du = d6;
        double d7 = (d3 * d5) - (d2 * d4);
        this.f12025h4 = d7;
        if (d6 == 0.0d && d7 == 0.0d) {
            return;
        }
        this.f12028m9 |= 1;
        this.f12024dy |= 1;
    }

    /* JADX INFO: renamed from: x1 */
    public void m17945x1(double d, double d2, double d3) {
        m17936kk(d2, d3);
        m17944x1(d);
        m17936kk(-d2, -d3);
    }

    /* JADX INFO: renamed from: k4 */
    public void m17929k4(C4400k4 c4400k4) {
        this.f12026k4 = c4400k4.f12026k4;
        this.f12030x1 = c4400k4.f12030x1;
        this.f12027kk = c4400k4.f12027kk;
        this.f12029to = c4400k4.f12029to;
        this.f12023du = c4400k4.f12023du;
        this.f12025h4 = c4400k4.f12025h4;
        this.f12028m9 = c4400k4.f12028m9;
        this.f12024dy = c4400k4.f12024dy;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0151  */
    /* JADX INFO: renamed from: kk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m17938kk(C4400k4 c4400k4) {
        double d;
        double dOooO00o;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        int i = this.f12028m9;
        int i2 = c4400k4.f12028m9;
        int i3 = (i2 << 3) | i;
        switch (i3) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return;
            case 8:
            case 10:
            case 12:
            case 14:
                this.f12023du = c4400k4.f12023du;
                this.f12025h4 = c4400k4.f12025h4;
                this.f12028m9 = i | 1;
                this.f12024dy |= 1;
                return;
            case 9:
            case 11:
            case 13:
            case 15:
                this.f12023du += c4400k4.f12023du;
                this.f12025h4 += c4400k4.f12025h4;
                return;
            case 16:
            case 17:
                this.f12028m9 = i | 2;
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                switch (i3) {
                    case 36:
                    case 37:
                        i |= 2;
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                        this.f12028m9 = i ^ 4;
                    case 38:
                    case 39:
                        double d9 = c4400k4.f12027kk;
                        double d10 = c4400k4.f12030x1;
                        double d11 = this.f12026k4;
                        this.f12026k4 = this.f12030x1 * d9;
                        this.f12030x1 = d11 * d10;
                        double d12 = this.f12027kk;
                        this.f12027kk = this.f12029to * d9;
                        this.f12029to = d12 * d10;
                        double d13 = this.f12023du;
                        this.f12023du = this.f12025h4 * d9;
                        this.f12025h4 = d13 * d10;
                        this.f12024dy = -1;
                        break;
                    default:
                        double d14 = c4400k4.f12026k4;
                        double d15 = c4400k4.f12027kk;
                        double dOooO00o2 = c4400k4.f12023du;
                        double d16 = c4400k4.f12030x1;
                        double d17 = c4400k4.f12029to;
                        double dOooO00o3 = c4400k4.f12025h4;
                        switch (i) {
                            case 0:
                                d = d16;
                                dOooO00o = dOooO00o3;
                                this.f12023du = dOooO00o2;
                                this.f12025h4 = dOooO00o;
                                this.f12026k4 = d14;
                                this.f12030x1 = d;
                                this.f12027kk = d15;
                                this.f12029to = d17;
                                this.f12028m9 = i | i2;
                                this.f12024dy = -1;
                                break;
                            case 1:
                                d = d16;
                                double d18 = this.f12023du;
                                double d19 = this.f12025h4;
                                dOooO00o2 = o000oOoO.OooO00o(d19, d15, d18 * d14, dOooO00o2);
                                dOooO00o = o000oOoO.OooO00o(d19, d17, d18 * d, dOooO00o3);
                                d17 = d17;
                                this.f12023du = dOooO00o2;
                                this.f12025h4 = dOooO00o;
                                this.f12026k4 = d14;
                                this.f12030x1 = d;
                                this.f12027kk = d15;
                                this.f12029to = d17;
                                this.f12028m9 = i | i2;
                                this.f12024dy = -1;
                                break;
                            case 2:
                                d2 = d16;
                                d3 = d17;
                                this.f12023du = dOooO00o2;
                                this.f12025h4 = dOooO00o3;
                                double d20 = this.f12026k4;
                                this.f12026k4 = d20 * d14;
                                this.f12030x1 = d20 * d2;
                                double d21 = this.f12029to;
                                this.f12027kk = d15 * d21;
                                d4 = d21 * d3;
                                this.f12029to = d4;
                                m17934kk();
                                break;
                            case 3:
                                d2 = d16;
                                d3 = d17;
                                double d22 = this.f12023du;
                                double d23 = this.f12025h4;
                                dOooO00o2 = o000oOoO.OooO00o(d23, d15, d22 * d14, dOooO00o2);
                                dOooO00o3 = o000oOoO.OooO00o(d23, d3, d22 * d2, dOooO00o3);
                                this.f12023du = dOooO00o2;
                                this.f12025h4 = dOooO00o3;
                                double d202 = this.f12026k4;
                                this.f12026k4 = d202 * d14;
                                this.f12030x1 = d202 * d2;
                                double d212 = this.f12029to;
                                this.f12027kk = d15 * d212;
                                d4 = d212 * d3;
                                this.f12029to = d4;
                                m17934kk();
                                break;
                            case 4:
                                d5 = d16;
                                d6 = d17;
                                this.f12023du = dOooO00o2;
                                this.f12025h4 = dOooO00o3;
                                double d24 = this.f12030x1;
                                this.f12026k4 = d15 * d24;
                                this.f12030x1 = d24 * d6;
                                double d25 = this.f12027kk;
                                this.f12027kk = d25 * d14;
                                d4 = d25 * d5;
                                this.f12029to = d4;
                                m17934kk();
                                break;
                            case 5:
                                d5 = d16;
                                d6 = d17;
                                double d26 = this.f12023du;
                                double d27 = this.f12025h4;
                                dOooO00o2 = o000oOoO.OooO00o(d27, d15, d26 * d14, dOooO00o2);
                                dOooO00o3 = o000oOoO.OooO00o(d27, d6, d26 * d5, dOooO00o3);
                                this.f12023du = dOooO00o2;
                                this.f12025h4 = dOooO00o3;
                                double d242 = this.f12030x1;
                                this.f12026k4 = d15 * d242;
                                this.f12030x1 = d242 * d6;
                                double d252 = this.f12027kk;
                                this.f12027kk = d252 * d14;
                                d4 = d252 * d5;
                                this.f12029to = d4;
                                m17934kk();
                                break;
                            case 6:
                                d7 = d16;
                                d8 = d17;
                                this.f12023du = dOooO00o2;
                                this.f12025h4 = dOooO00o3;
                                double d28 = this.f12026k4;
                                double d29 = this.f12030x1;
                                this.f12026k4 = (d29 * d15) + (d28 * d14);
                                this.f12030x1 = (d29 * d8) + (d28 * d7);
                                double d30 = this.f12027kk;
                                double d31 = this.f12029to;
                                this.f12027kk = (d15 * d31) + (d30 * d14);
                                this.f12029to = (d31 * d8) + (d30 * d7);
                                m17934kk();
                                break;
                            default:
                                m17917up();
                            case 7:
                                double d32 = this.f12023du;
                                d7 = d16;
                                double d33 = this.f12025h4;
                                d8 = d17;
                                dOooO00o2 = o000oOoO.OooO00o(d33, d15, d32 * d14, dOooO00o2);
                                dOooO00o3 = o000oOoO.OooO00o(d33, d8, d32 * d7, dOooO00o3);
                                this.f12023du = dOooO00o2;
                                this.f12025h4 = dOooO00o3;
                                double d282 = this.f12026k4;
                                double d292 = this.f12030x1;
                                this.f12026k4 = (d292 * d15) + (d282 * d14);
                                this.f12030x1 = (d292 * d8) + (d282 * d7);
                                double d302 = this.f12027kk;
                                double d312 = this.f12029to;
                                this.f12027kk = (d15 * d312) + (d302 * d14);
                                this.f12029to = (d312 * d8) + (d302 * d7);
                                m17934kk();
                                break;
                        }
                        break;
                }
                return;
        }
        double d34 = c4400k4.f12026k4;
        double d35 = c4400k4.f12029to;
        if ((i & 4) != 0) {
            this.f12027kk *= d34;
            this.f12030x1 *= d35;
            if ((i & 2) != 0) {
                this.f12026k4 *= d34;
                this.f12029to *= d35;
            }
        }
        if ((i & 1) != 0) {
            this.f12023du *= d34;
            this.f12025h4 *= d35;
        }
        this.f12024dy = -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: x1 */
    public void m17946x1(C4400k4 c4400k4) {
        int i = this.f12028m9;
        int i2 = c4400k4.f12028m9;
        int i3 = (i2 << 3) | i;
        if (i3 != 48) {
            if (i3 != 56) {
                switch (i3) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return;
                    case 8:
                        break;
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        m17936kk(c4400k4.f12023du, c4400k4.f12025h4);
                        return;
                    case 16:
                        break;
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        m17942to(c4400k4.f12026k4, c4400k4.f12029to);
                        return;
                    case 24:
                        break;
                    default:
                        switch (i3) {
                            case 32:
                                break;
                            case 33:
                                this.f12026k4 = 0.0d;
                                this.f12027kk = c4400k4.f12027kk;
                                this.f12030x1 = c4400k4.f12030x1;
                                this.f12029to = 0.0d;
                                this.f12028m9 = 5;
                                this.f12024dy = -1;
                                return;
                            case 34:
                            case 35:
                                this.f12027kk = this.f12026k4 * c4400k4.f12027kk;
                                this.f12026k4 = 0.0d;
                                this.f12030x1 = this.f12029to * c4400k4.f12030x1;
                                this.f12029to = 0.0d;
                                this.f12028m9 = i ^ 6;
                                this.f12024dy = -1;
                                return;
                            case 36:
                            case 37:
                                this.f12026k4 = this.f12027kk * c4400k4.f12030x1;
                                this.f12027kk = 0.0d;
                                this.f12029to = this.f12030x1 * c4400k4.f12027kk;
                                this.f12030x1 = 0.0d;
                                this.f12028m9 = i ^ 6;
                                this.f12024dy = -1;
                                return;
                            case 38:
                            case 39:
                                double d = c4400k4.f12027kk;
                                double d2 = c4400k4.f12030x1;
                                double d3 = this.f12026k4;
                                this.f12026k4 = this.f12027kk * d2;
                                this.f12027kk = d3 * d;
                                double d4 = this.f12030x1;
                                this.f12030x1 = this.f12029to * d2;
                                this.f12029to = d4 * d;
                                this.f12024dy = -1;
                                return;
                            case 40:
                                this.f12023du = c4400k4.f12023du;
                                this.f12025h4 = c4400k4.f12025h4;
                                break;
                            default:
                                double d5 = c4400k4.f12026k4;
                                double d6 = c4400k4.f12027kk;
                                double d7 = c4400k4.f12023du;
                                double d8 = c4400k4.f12030x1;
                                double d9 = c4400k4.f12029to;
                                double d10 = c4400k4.f12025h4;
                                switch (i) {
                                    case 1:
                                        this.f12026k4 = d5;
                                        this.f12027kk = d6;
                                        this.f12023du += d7;
                                        this.f12030x1 = d8;
                                        this.f12029to = d9;
                                        this.f12025h4 += d10;
                                        this.f12028m9 = i2 | 1;
                                        this.f12024dy = -1;
                                        break;
                                    case 2:
                                    case 3:
                                        double d11 = this.f12026k4;
                                        this.f12026k4 = d5 * d11;
                                        this.f12027kk = d6 * d11;
                                        this.f12023du = (d7 * d11) + this.f12023du;
                                        double d12 = this.f12029to;
                                        this.f12030x1 = d8 * d12;
                                        this.f12029to = d9 * d12;
                                        this.f12025h4 = (d10 * d12) + this.f12025h4;
                                        m17934kk();
                                        break;
                                    case 4:
                                    case 5:
                                        double d13 = this.f12027kk;
                                        this.f12026k4 = d8 * d13;
                                        this.f12027kk = d9 * d13;
                                        this.f12023du = (d10 * d13) + this.f12023du;
                                        double d14 = this.f12030x1;
                                        this.f12030x1 = d5 * d14;
                                        this.f12029to = d6 * d14;
                                        this.f12025h4 = (d7 * d14) + this.f12025h4;
                                        m17934kk();
                                        break;
                                    case 6:
                                        this.f12028m9 = i | i2;
                                        double d15 = this.f12026k4;
                                        double d16 = this.f12027kk;
                                        this.f12026k4 = (d8 * d16) + (d5 * d15);
                                        this.f12027kk = (d9 * d16) + (d6 * d15);
                                        this.f12023du = o000oOoO.OooO00o(d10, d16, d7 * d15, this.f12023du);
                                        double d17 = this.f12030x1;
                                        double d18 = this.f12029to;
                                        this.f12030x1 = (d8 * d18) + (d5 * d17);
                                        this.f12029to = (d9 * d18) + (d6 * d17);
                                        this.f12025h4 = o000oOoO.OooO00o(d10, d18, d7 * d17, this.f12025h4);
                                        this.f12024dy = -1;
                                        break;
                                    case 7:
                                        double d152 = this.f12026k4;
                                        double d162 = this.f12027kk;
                                        this.f12026k4 = (d8 * d162) + (d5 * d152);
                                        this.f12027kk = (d9 * d162) + (d6 * d152);
                                        this.f12023du = o000oOoO.OooO00o(d10, d162, d7 * d152, this.f12023du);
                                        double d172 = this.f12030x1;
                                        double d182 = this.f12029to;
                                        this.f12030x1 = (d8 * d182) + (d5 * d172);
                                        this.f12029to = (d9 * d182) + (d6 * d172);
                                        this.f12025h4 = o000oOoO.OooO00o(d10, d182, d7 * d172, this.f12025h4);
                                        this.f12024dy = -1;
                                        break;
                                    default:
                                        m17917up();
                                        this.f12028m9 = i | i2;
                                        double d1522 = this.f12026k4;
                                        double d1622 = this.f12027kk;
                                        this.f12026k4 = (d8 * d1622) + (d5 * d1522);
                                        this.f12027kk = (d9 * d1622) + (d6 * d1522);
                                        this.f12023du = o000oOoO.OooO00o(d10, d1622, d7 * d1522, this.f12023du);
                                        double d1722 = this.f12030x1;
                                        double d1822 = this.f12029to;
                                        this.f12030x1 = (d8 * d1822) + (d5 * d1722);
                                        this.f12029to = (d9 * d1822) + (d6 * d1722);
                                        this.f12025h4 = o000oOoO.OooO00o(d10, d1822, d7 * d1722, this.f12025h4);
                                        this.f12024dy = -1;
                                        break;
                                }
                                return;
                        }
                        this.f12027kk = c4400k4.f12027kk;
                        this.f12030x1 = c4400k4.f12030x1;
                        this.f12029to = 0.0d;
                        this.f12026k4 = 0.0d;
                        this.f12028m9 = i2;
                        this.f12024dy = c4400k4.f12024dy;
                        return;
                }
                this.f12023du = c4400k4.f12023du;
                this.f12025h4 = c4400k4.f12025h4;
                this.f12028m9 = i2;
                this.f12024dy = c4400k4.f12024dy;
                return;
            }
            this.f12027kk = c4400k4.f12027kk;
            this.f12030x1 = c4400k4.f12030x1;
            this.f12026k4 = c4400k4.f12026k4;
            this.f12029to = c4400k4.f12029to;
            this.f12023du = c4400k4.f12023du;
            this.f12025h4 = c4400k4.f12025h4;
            this.f12028m9 = i2;
            this.f12024dy = c4400k4.f12024dy;
            return;
        }
        this.f12027kk = c4400k4.f12027kk;
        this.f12030x1 = c4400k4.f12030x1;
        this.f12026k4 = c4400k4.f12026k4;
        this.f12029to = c4400k4.f12029to;
        this.f12028m9 = i2;
        this.f12024dy = c4400k4.f12024dy;
    }

    /* JADX INFO: renamed from: k4 */
    public void m17930k4(double[] dArr, int i, double[] dArr2, int i2, int i3) {
        int i4 = i;
        int i5 = i2;
        if (dArr2 == dArr && i5 > i4) {
            int i6 = i3 * 2;
            if (i5 < i4 + i6) {
                System.arraycopy(dArr, i4, dArr2, i5, i6);
                i4 = i5;
            }
        }
        switch (this.f12028m9) {
            case 0:
                if (dArr != dArr2 || i4 != i5) {
                    System.arraycopy(dArr, i4, dArr2, i5, i3 * 2);
                }
                break;
            case 1:
                double d = this.f12023du;
                double d2 = this.f12025h4;
                int i7 = i4;
                int i8 = i3;
                while (true) {
                    i8--;
                    if (i8 >= 0) {
                        int i9 = i5 + 1;
                        int i10 = i7 + 1;
                        dArr2[i5] = dArr[i7] + d;
                        i5 += 2;
                        i7 += 2;
                        dArr2[i9] = dArr[i10] + d2;
                    }
                    break;
                }
                break;
            case 2:
                double d3 = this.f12026k4;
                double d4 = this.f12029to;
                int i11 = i4;
                int i12 = i3;
                while (true) {
                    i12--;
                    if (i12 >= 0) {
                        int i13 = i5 + 1;
                        int i14 = i11 + 1;
                        dArr2[i5] = dArr[i11] * d3;
                        i5 += 2;
                        i11 += 2;
                        dArr2[i13] = dArr[i14] * d4;
                    }
                    break;
                }
                break;
            case 3:
                double d5 = this.f12026k4;
                double d6 = this.f12023du;
                double d7 = this.f12029to;
                double d8 = this.f12025h4;
                int i15 = i4;
                int i16 = i3;
                while (true) {
                    i16--;
                    if (i16 >= 0) {
                        int i17 = i5 + 1;
                        int i18 = i15 + 1;
                        dArr2[i5] = (dArr[i15] * d5) + d6;
                        i5 += 2;
                        i15 += 2;
                        dArr2[i17] = (dArr[i18] * d7) + d8;
                    }
                    break;
                }
                break;
            case 4:
                double d9 = this.f12027kk;
                double d10 = this.f12030x1;
                int i19 = i4;
                int i20 = i3;
                while (true) {
                    i20--;
                    if (i20 >= 0) {
                        int i21 = i19 + 1;
                        double d11 = dArr[i19];
                        int i22 = i5 + 1;
                        i19 += 2;
                        dArr2[i5] = dArr[i21] * d9;
                        i5 += 2;
                        dArr2[i22] = d11 * d10;
                    }
                    break;
                }
                break;
            case 5:
                double d12 = this.f12027kk;
                double d13 = this.f12023du;
                double d14 = this.f12030x1;
                double d15 = this.f12025h4;
                int i23 = i4;
                int i24 = i3;
                while (true) {
                    i24--;
                    if (i24 >= 0) {
                        int i25 = i23 + 1;
                        double d16 = dArr[i23];
                        int i26 = i5 + 1;
                        i23 += 2;
                        dArr2[i5] = (dArr[i25] * d12) + d13;
                        i5 += 2;
                        dArr2[i26] = (d16 * d14) + d15;
                    }
                    break;
                }
                break;
            case 6:
                double d17 = this.f12026k4;
                double d18 = this.f12027kk;
                double d19 = this.f12030x1;
                double d20 = this.f12029to;
                int i27 = i4;
                int i28 = i3;
                while (true) {
                    i28--;
                    if (i28 >= 0) {
                        int i29 = i27 + 1;
                        double d21 = dArr[i27];
                        i27 += 2;
                        double d22 = dArr[i29];
                        int i30 = i5 + 1;
                        dArr2[i5] = (d18 * d22) + (d17 * d21);
                        i5 += 2;
                        dArr2[i30] = (d22 * d20) + (d21 * d19);
                    }
                    break;
                }
                break;
            case 7:
                double d23 = this.f12026k4;
                double d24 = this.f12027kk;
                double d25 = this.f12023du;
                double d26 = this.f12030x1;
                double d27 = this.f12029to;
                double d28 = this.f12025h4;
                int i31 = i4;
                int i32 = i3;
                while (true) {
                    i32--;
                    if (i32 >= 0) {
                        double d29 = dArr[i31];
                        int i33 = i31 + 2;
                        double d30 = dArr[i31 + 1];
                        int i34 = i5 + 1;
                        double d31 = d27;
                        double d32 = d26;
                        dArr2[i5] = o000oOoO.OooO00o(d24, d30, d23 * d29, d25);
                        i5 += 2;
                        double d33 = d28;
                        dArr2[i34] = o000oOoO.OooO00o(d31, d30, d32 * d29, d33);
                        d27 = d31;
                        d28 = d33;
                        i31 = i33;
                        d26 = d32;
                    }
                    break;
                }
                break;
            default:
                m17917up();
                break;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public void m17947x1(double[] dArr, int i, double[] dArr2, int i2, int i3) {
        int i4 = i;
        int i5 = i2;
        if (dArr2 == dArr && i5 > i4) {
            int i6 = i3 * 2;
            if (i5 < i4 + i6) {
                System.arraycopy(dArr, i4, dArr2, i5, i6);
                i4 = i5;
            }
        }
        switch (this.f12028m9) {
            case 0:
            case 1:
                if (dArr != dArr2 || i4 != i5) {
                    System.arraycopy(dArr, i4, dArr2, i5, i3 * 2);
                }
                break;
            case 2:
            case 3:
                double d = this.f12026k4;
                double d2 = this.f12029to;
                int i7 = i4;
                int i8 = i3;
                while (true) {
                    i8--;
                    if (i8 >= 0) {
                        int i9 = i5 + 1;
                        int i10 = i7 + 1;
                        dArr2[i5] = dArr[i7] * d;
                        i5 += 2;
                        i7 += 2;
                        dArr2[i9] = dArr[i10] * d2;
                    }
                    break;
                }
                break;
            case 4:
            case 5:
                double d3 = this.f12027kk;
                double d4 = this.f12030x1;
                int i11 = i4;
                int i12 = i3;
                while (true) {
                    i12--;
                    if (i12 >= 0) {
                        int i13 = i11 + 1;
                        double d5 = dArr[i11];
                        int i14 = i5 + 1;
                        i11 += 2;
                        dArr2[i5] = dArr[i13] * d3;
                        i5 += 2;
                        dArr2[i14] = d5 * d4;
                    }
                    break;
                }
                break;
            case 6:
            case 7:
                double d6 = this.f12026k4;
                double d7 = this.f12027kk;
                double d8 = this.f12030x1;
                double d9 = this.f12029to;
                int i15 = i4;
                int i16 = i3;
                while (true) {
                    i16--;
                    if (i16 >= 0) {
                        int i17 = i15 + 1;
                        double d10 = dArr[i15];
                        i15 += 2;
                        double d11 = dArr[i17];
                        int i18 = i5 + 1;
                        dArr2[i5] = (d11 * d7) + (d10 * d6);
                        i5 += 2;
                        dArr2[i18] = (d11 * d9) + (d10 * d8);
                    }
                    break;
                }
                break;
            default:
                m17917up();
                break;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m17931k4(double[] dArr, int i, float[] fArr, int i2, int i3) {
        switch (this.f12028m9) {
            case 0:
                int i4 = i;
                int i5 = i2;
                int i6 = i3;
                while (true) {
                    i6--;
                    if (i6 >= 0) {
                        int i7 = i5 + 1;
                        int i8 = i4 + 1;
                        fArr[i5] = (float) dArr[i4];
                        i5 += 2;
                        i4 += 2;
                        fArr[i7] = (float) dArr[i8];
                    }
                    break;
                }
                break;
            case 1:
                double d = this.f12023du;
                double d2 = this.f12025h4;
                int i9 = i;
                int i10 = i2;
                int i11 = i3;
                while (true) {
                    i11--;
                    if (i11 >= 0) {
                        int i12 = i10 + 1;
                        int i13 = i9 + 1;
                        fArr[i10] = (float) (dArr[i9] + d);
                        i10 += 2;
                        i9 += 2;
                        fArr[i12] = (float) (dArr[i13] + d2);
                    }
                    break;
                }
                break;
            case 2:
                double d3 = this.f12026k4;
                double d4 = this.f12029to;
                int i14 = i;
                int i15 = i2;
                int i16 = i3;
                while (true) {
                    i16--;
                    if (i16 >= 0) {
                        int i17 = i15 + 1;
                        int i18 = i14 + 1;
                        fArr[i15] = (float) (dArr[i14] * d3);
                        i15 += 2;
                        i14 += 2;
                        fArr[i17] = (float) (dArr[i18] * d4);
                    }
                    break;
                }
                break;
            case 3:
                double d5 = this.f12026k4;
                double d6 = this.f12023du;
                double d7 = this.f12029to;
                double d8 = this.f12025h4;
                int i19 = i;
                int i20 = i2;
                int i21 = i3;
                while (true) {
                    i21--;
                    if (i21 >= 0) {
                        int i22 = i20 + 1;
                        int i23 = i19 + 1;
                        fArr[i20] = (float) ((dArr[i19] * d5) + d6);
                        i20 += 2;
                        i19 += 2;
                        fArr[i22] = (float) ((dArr[i23] * d7) + d8);
                    }
                    break;
                }
                break;
            case 4:
                double d9 = this.f12027kk;
                double d10 = this.f12030x1;
                int i24 = i;
                int i25 = i2;
                int i26 = i3;
                while (true) {
                    i26--;
                    if (i26 >= 0) {
                        int i27 = i24 + 1;
                        double d11 = dArr[i24];
                        int i28 = i25 + 1;
                        i24 += 2;
                        fArr[i25] = (float) (dArr[i27] * d9);
                        i25 += 2;
                        fArr[i28] = (float) (d11 * d10);
                    }
                    break;
                }
                break;
            case 5:
                double d12 = this.f12027kk;
                double d13 = this.f12023du;
                double d14 = this.f12030x1;
                double d15 = this.f12025h4;
                int i29 = i;
                int i30 = i2;
                int i31 = i3;
                while (true) {
                    i31--;
                    if (i31 >= 0) {
                        int i32 = i29 + 1;
                        double d16 = dArr[i29];
                        int i33 = i30 + 1;
                        i29 += 2;
                        fArr[i30] = (float) ((dArr[i32] * d12) + d13);
                        i30 += 2;
                        fArr[i33] = (float) ((d16 * d14) + d15);
                        d12 = d12;
                    }
                    break;
                }
                break;
            case 6:
                double d17 = this.f12026k4;
                double d18 = this.f12027kk;
                double d19 = this.f12030x1;
                double d20 = this.f12029to;
                int i34 = i;
                int i35 = i2;
                int i36 = i3;
                while (true) {
                    i36--;
                    if (i36 >= 0) {
                        int i37 = i34 + 1;
                        double d21 = dArr[i34];
                        i34 += 2;
                        double d22 = dArr[i37];
                        int i38 = i35 + 1;
                        fArr[i35] = (float) ((d18 * d22) + (d17 * d21));
                        i35 += 2;
                        fArr[i38] = (float) ((d22 * d20) + (d21 * d19));
                        d17 = d17;
                    }
                    break;
                }
                break;
            case 7:
                double d23 = this.f12026k4;
                double d24 = this.f12027kk;
                double d25 = this.f12023du;
                double d26 = this.f12030x1;
                double d27 = this.f12029to;
                double d28 = this.f12025h4;
                int i39 = i;
                int i40 = i2;
                int i41 = i3;
                while (true) {
                    int i42 = i41 - 1;
                    if (i42 >= 0) {
                        double d29 = dArr[i39];
                        int i43 = i39 + 2;
                        double d30 = dArr[i39 + 1];
                        double d31 = d28;
                        fArr[i40] = (float) o000oOoO.OooO00o(d24, d30, d23 * d29, d25);
                        fArr[i40 + 1] = (float) o000oOoO.OooO00o(d27, d30, d26 * d29, d31);
                        i40 += 2;
                        d28 = d31;
                        i41 = i42;
                        i39 = i43;
                    }
                    break;
                }
                break;
            default:
                m17917up();
                break;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m17932k4(float[] fArr, int i, double[] dArr, int i2, int i3) {
        switch (this.f12028m9) {
            case 0:
                int i4 = i;
                int i5 = i2;
                int i6 = i3;
                while (true) {
                    i6--;
                    if (i6 >= 0) {
                        int i7 = i5 + 1;
                        int i8 = i4 + 1;
                        dArr[i5] = fArr[i4];
                        i5 += 2;
                        i4 += 2;
                        dArr[i7] = fArr[i8];
                    }
                    break;
                }
                break;
            case 1:
                double d = this.f12023du;
                double d2 = this.f12025h4;
                int i9 = i;
                int i10 = i2;
                int i11 = i3;
                while (true) {
                    i11--;
                    if (i11 >= 0) {
                        int i12 = i10 + 1;
                        int i13 = i9 + 1;
                        dArr[i10] = ((double) fArr[i9]) + d;
                        i10 += 2;
                        i9 += 2;
                        dArr[i12] = ((double) fArr[i13]) + d2;
                    }
                    break;
                }
                break;
            case 2:
                double d3 = this.f12026k4;
                double d4 = this.f12029to;
                int i14 = i;
                int i15 = i2;
                int i16 = i3;
                while (true) {
                    i16--;
                    if (i16 >= 0) {
                        int i17 = i15 + 1;
                        int i18 = i14 + 1;
                        dArr[i15] = ((double) fArr[i14]) * d3;
                        i15 += 2;
                        i14 += 2;
                        dArr[i17] = ((double) fArr[i18]) * d4;
                    }
                    break;
                }
                break;
            case 3:
                double d5 = this.f12026k4;
                double d6 = this.f12023du;
                double d7 = this.f12029to;
                double d8 = this.f12025h4;
                int i19 = i;
                int i20 = i2;
                int i21 = i3;
                while (true) {
                    i21--;
                    if (i21 >= 0) {
                        int i22 = i20 + 1;
                        int i23 = i19 + 1;
                        dArr[i20] = (((double) fArr[i19]) * d5) + d6;
                        i20 += 2;
                        i19 += 2;
                        dArr[i22] = (((double) fArr[i23]) * d7) + d8;
                    }
                    break;
                }
                break;
            case 4:
                double d9 = this.f12027kk;
                double d10 = this.f12030x1;
                int i24 = i;
                int i25 = i2;
                int i26 = i3;
                while (true) {
                    i26--;
                    if (i26 >= 0) {
                        int i27 = i24 + 1;
                        double d11 = fArr[i24];
                        int i28 = i25 + 1;
                        i24 += 2;
                        dArr[i25] = ((double) fArr[i27]) * d9;
                        i25 += 2;
                        dArr[i28] = d11 * d10;
                    }
                    break;
                }
                break;
            case 5:
                double d12 = this.f12027kk;
                double d13 = this.f12023du;
                double d14 = this.f12030x1;
                double d15 = this.f12025h4;
                int i29 = i;
                int i30 = i2;
                int i31 = i3;
                while (true) {
                    i31--;
                    if (i31 >= 0) {
                        int i32 = i29 + 1;
                        double d16 = fArr[i29];
                        int i33 = i30 + 1;
                        i29 += 2;
                        double d17 = d12;
                        dArr[i30] = (((double) fArr[i32]) * d17) + d13;
                        i30 += 2;
                        dArr[i33] = (d16 * d14) + d15;
                        d12 = d17;
                    }
                    break;
                }
                break;
            case 6:
                double d18 = this.f12026k4;
                double d19 = this.f12027kk;
                double d20 = this.f12030x1;
                double d21 = this.f12029to;
                int i34 = i;
                int i35 = i2;
                int i36 = i3;
                while (true) {
                    i36--;
                    if (i36 >= 0) {
                        int i37 = i34 + 1;
                        double d22 = fArr[i34];
                        i34 += 2;
                        double d23 = d18;
                        double d24 = fArr[i37];
                        int i38 = i35 + 1;
                        dArr[i35] = (d19 * d24) + (d23 * d22);
                        i35 += 2;
                        dArr[i38] = (d24 * d21) + (d22 * d20);
                        d18 = d23;
                    }
                    break;
                }
                break;
            case 7:
                double d25 = this.f12026k4;
                double d26 = this.f12027kk;
                double d27 = this.f12023du;
                double d28 = this.f12030x1;
                double d29 = this.f12029to;
                double d30 = this.f12025h4;
                int i39 = i;
                int i40 = i2;
                int i41 = i3;
                while (true) {
                    int i42 = i41 - 1;
                    if (i42 >= 0) {
                        double d31 = d25;
                        double d32 = fArr[i39];
                        int i43 = i39 + 2;
                        double d33 = fArr[i39 + 1];
                        double d34 = d30;
                        dArr[i40] = o000oOoO.OooO00o(d26, d33, d31 * d32, d27);
                        dArr[i40 + 1] = o000oOoO.OooO00o(d29, d33, d28 * d32, d34);
                        i40 += 2;
                        d30 = d34;
                        i41 = i42;
                        d25 = d31;
                        i39 = i43;
                    }
                    break;
                }
                break;
            default:
                m17917up();
                break;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m17933k4(float[] fArr, int i, float[] fArr2, int i2, int i3) {
        int i4 = i;
        int i5 = i2;
        if (fArr2 == fArr && i5 > i4) {
            int i6 = i3 * 2;
            if (i5 < i4 + i6) {
                System.arraycopy(fArr, i4, fArr2, i5, i6);
                i4 = i5;
            }
        }
        switch (this.f12028m9) {
            case 0:
                if (fArr != fArr2 || i4 != i5) {
                    System.arraycopy(fArr, i4, fArr2, i5, i3 * 2);
                }
                break;
            case 1:
                double d = this.f12023du;
                double d2 = this.f12025h4;
                int i7 = i4;
                int i8 = i3;
                while (true) {
                    i8--;
                    if (i8 >= 0) {
                        int i9 = i5 + 1;
                        int i10 = i7 + 1;
                        fArr2[i5] = (float) (((double) fArr[i7]) + d);
                        i5 += 2;
                        i7 += 2;
                        fArr2[i9] = (float) (((double) fArr[i10]) + d2);
                    }
                    break;
                }
                break;
            case 2:
                double d3 = this.f12026k4;
                double d4 = this.f12029to;
                int i11 = i4;
                int i12 = i3;
                while (true) {
                    i12--;
                    if (i12 >= 0) {
                        int i13 = i5 + 1;
                        int i14 = i11 + 1;
                        fArr2[i5] = (float) (((double) fArr[i11]) * d3);
                        i5 += 2;
                        i11 += 2;
                        fArr2[i13] = (float) (((double) fArr[i14]) * d4);
                    }
                    break;
                }
                break;
            case 3:
                double d5 = this.f12026k4;
                double d6 = this.f12023du;
                double d7 = this.f12029to;
                double d8 = this.f12025h4;
                int i15 = i4;
                int i16 = i3;
                while (true) {
                    int i17 = i16 - 1;
                    if (i17 >= 0) {
                        int i18 = i5 + 1;
                        int i19 = i15 + 1;
                        int i20 = i5;
                        double d9 = d5;
                        fArr2[i20] = (float) ((d9 * ((double) fArr[i15])) + d6);
                        i5 = i20 + 2;
                        i15 += 2;
                        fArr2[i18] = (float) ((((double) fArr[i19]) * d7) + d8);
                        i16 = i17;
                        d5 = d9;
                    }
                    break;
                }
                break;
            case 4:
                double d10 = this.f12027kk;
                double d11 = this.f12030x1;
                int i21 = i4;
                int i22 = i3;
                while (true) {
                    i22--;
                    if (i22 >= 0) {
                        int i23 = i21 + 1;
                        double d12 = fArr[i21];
                        int i24 = i5 + 1;
                        i21 += 2;
                        fArr2[i5] = (float) (((double) fArr[i23]) * d10);
                        i5 += 2;
                        fArr2[i24] = (float) (d12 * d11);
                    }
                    break;
                }
                break;
            case 5:
                double d13 = this.f12027kk;
                double d14 = this.f12023du;
                double d15 = this.f12030x1;
                double d16 = this.f12025h4;
                int i25 = i4;
                int i26 = i3;
                while (true) {
                    i26--;
                    if (i26 >= 0) {
                        int i27 = i25 + 1;
                        int i28 = i5;
                        double d17 = d13;
                        double d18 = fArr[i25];
                        i25 += 2;
                        fArr2[i28] = (float) ((((double) fArr[i27]) * d17) + d14);
                        fArr2[i28 + 1] = (float) ((d18 * d15) + d16);
                        i5 = i28 + 2;
                        d13 = d17;
                    }
                    break;
                }
                break;
            case 6:
                double d19 = this.f12026k4;
                double d20 = this.f12027kk;
                double d21 = this.f12030x1;
                double d22 = this.f12029to;
                int i29 = i4;
                int i30 = i3;
                while (true) {
                    i30--;
                    if (i30 >= 0) {
                        int i31 = i29 + 1;
                        int i32 = i5;
                        double d23 = d19;
                        double d24 = fArr[i29];
                        i29 += 2;
                        double d25 = fArr[i31];
                        fArr2[i32] = (float) ((d20 * d25) + (d23 * d24));
                        i5 = i32 + 2;
                        fArr2[i32 + 1] = (float) ((d25 * d22) + (d21 * d24));
                        d19 = d23;
                    }
                    break;
                }
                break;
            case 7:
                double d26 = this.f12026k4;
                double d27 = this.f12027kk;
                double d28 = this.f12023du;
                double d29 = this.f12030x1;
                double d30 = this.f12029to;
                double d31 = this.f12025h4;
                int i33 = i4;
                int i34 = i3;
                while (true) {
                    int i35 = i34 - 1;
                    if (i35 >= 0) {
                        int i36 = i5;
                        double d32 = d31;
                        double d33 = fArr[i33];
                        double d34 = fArr[i33 + 1];
                        double d35 = d30;
                        double d36 = d29;
                        fArr2[i36] = (float) o000oOoO.OooO00o(d27, d34, d26 * d33, d28);
                        fArr2[i36 + 1] = (float) o000oOoO.OooO00o(d35, d34, d36 * d33, d32);
                        i33 += 2;
                        d29 = d36;
                        i5 = i36 + 2;
                        d30 = d35;
                        d31 = d32;
                        i34 = i35;
                    }
                    break;
                }
                break;
            default:
                m17917up();
                break;
        }
    }
}
