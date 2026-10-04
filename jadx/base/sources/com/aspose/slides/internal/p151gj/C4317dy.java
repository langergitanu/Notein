package com.aspose.slides.internal.p151gj;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p431ty.C11241kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.gj.dy */
/* JADX INFO: loaded from: classes.dex */
public class C4317dy {

    /* JADX INFO: renamed from: c5 */
    private static final int[] f11769c5 = {4, 5, 4, 5, 2, 3, 6, 7};

    /* JADX INFO: renamed from: du */
    private float f11770du;

    /* JADX INFO: renamed from: dy */
    private int f11771dy;

    /* JADX INFO: renamed from: h4 */
    private float f11772h4;

    /* JADX INFO: renamed from: k4 */
    private float f11773k4;

    /* JADX INFO: renamed from: kk */
    private float f11774kk;

    /* JADX INFO: renamed from: m9 */
    private int f11775m9;

    /* JADX INFO: renamed from: to */
    private float f11776to;

    /* JADX INFO: renamed from: x1 */
    private float f11777x1;

    public C4317dy() {
        this.f11776to = 1.0f;
        this.f11773k4 = 1.0f;
    }

    /* JADX INFO: renamed from: ck */
    private void m17319ck() {
        float f = -this.f11773k4;
        this.f11773k4 = f;
        float f2 = -this.f11776to;
        this.f11776to = f2;
        int i = this.f11775m9;
        if ((i & 4) != 0) {
            this.f11774kk = -this.f11774kk;
            this.f11777x1 = -this.f11777x1;
        } else {
            this.f11775m9 = (f == 1.0f && f2 == 1.0f) ? i & (-3) : i | 2;
        }
        this.f11771dy = -1;
    }

    /* JADX INFO: renamed from: fa */
    private void m17320fa() {
        float f = this.f11773k4;
        float f2 = -this.f11774kk;
        this.f11773k4 = f2;
        this.f11774kk = f;
        float f3 = this.f11777x1;
        this.f11777x1 = -this.f11776to;
        this.f11776to = f3;
        int i = f11769c5[this.f11775m9];
        if ((i & 6) == 2 && f2 == 1.0f && f3 == 1.0f) {
            i -= 2;
        }
        this.f11775m9 = i;
        this.f11771dy = -1;
    }

    /* JADX INFO: renamed from: jd */
    private void m17321jd() {
        float f = this.f11773k4;
        float f2 = this.f11774kk;
        this.f11773k4 = f2;
        this.f11774kk = -f;
        float f3 = this.f11777x1;
        this.f11777x1 = this.f11776to;
        float f4 = -f3;
        this.f11776to = f4;
        int i = f11769c5[this.f11775m9];
        if ((i & 6) == 2 && f2 == 1.0f && f4 == 1.0f) {
            i -= 2;
        }
        this.f11775m9 = i;
        this.f11771dy = -1;
    }

    /* JADX INFO: renamed from: ks */
    private void m17323ks() {
        float f = this.f11773k4;
        this.f11773k4 = this.f11777x1;
        this.f11777x1 = -f;
        float f2 = this.f11774kk;
        this.f11774kk = this.f11776to;
        this.f11776to = -f2;
        float f3 = this.f11770du;
        this.f11770du = this.f11772h4;
        this.f11772h4 = -f3;
        m17324rv();
    }

    /* JADX INFO: renamed from: rv */
    private void m17324rv() {
        if (this.f11774kk == 0.0f && this.f11777x1 == 0.0f) {
            if (this.f11773k4 == 1.0f && this.f11776to == 1.0f) {
                if (this.f11770du == 0.0f && this.f11772h4 == 0.0f) {
                    this.f11775m9 = 0;
                    this.f11771dy = 0;
                    return;
                } else {
                    this.f11775m9 = 1;
                    this.f11771dy = 1;
                    return;
                }
            }
            if (this.f11770du == 0.0f && this.f11772h4 == 0.0f) {
                this.f11775m9 = 2;
                this.f11771dy = -1;
                return;
            } else {
                this.f11775m9 = 3;
                this.f11771dy = -1;
                return;
            }
        }
        if (this.f11773k4 == 0.0f && this.f11776to == 0.0f) {
            if (this.f11770du == 0.0f && this.f11772h4 == 0.0f) {
                this.f11775m9 = 4;
                this.f11771dy = -1;
                return;
            } else {
                this.f11775m9 = 5;
                this.f11771dy = -1;
                return;
            }
        }
        if (this.f11770du == 0.0f && this.f11772h4 == 0.0f) {
            this.f11775m9 = 6;
            this.f11771dy = -1;
        } else {
            this.f11775m9 = 7;
            this.f11771dy = -1;
        }
    }

    /* JADX INFO: renamed from: up */
    private void m17325up() {
        float f = this.f11773k4;
        this.f11773k4 = -this.f11777x1;
        this.f11777x1 = f;
        float f2 = this.f11774kk;
        this.f11774kk = -this.f11776to;
        this.f11776to = f2;
        float f3 = this.f11770du;
        this.f11770du = -this.f11772h4;
        this.f11772h4 = f3;
        m17324rv();
    }

    /* JADX INFO: renamed from: x6 */
    private static void m17326x6() {
        throw new Exception("missing case in transform state switch");
    }

    /* JADX INFO: renamed from: yj */
    private void m17327yj() {
        this.f11773k4 = -this.f11773k4;
        this.f11774kk = -this.f11774kk;
        this.f11777x1 = -this.f11777x1;
        this.f11776to = -this.f11776to;
        this.f11770du = -this.f11770du;
        this.f11772h4 = -this.f11772h4;
        m17324rv();
    }

    /* JADX INFO: renamed from: c5 */
    public final float m17328c5() {
        return this.f11772h4;
    }

    /* JADX INFO: renamed from: du */
    public final float m17329du() {
        return this.f11777x1;
    }

    /* JADX INFO: renamed from: dy */
    public final float m17330dy() {
        return this.f11770du;
    }

    public boolean equals(Object obj) {
        C4317dy c4317dy = (C4317dy) C7019kk.m27452k4(obj, C4317dy.class);
        if (c4317dy == null) {
            return false;
        }
        return m17322k4(this, c4317dy);
    }

    /* JADX INFO: renamed from: h4 */
    public final float m17331h4() {
        return this.f11774kk;
    }

    public int hashCode() {
        long jM66708k4 = (((((((((((long) C14064he.m66708k4(this.f11773k4)) * 31) + ((long) C14064he.m66708k4(this.f11774kk))) * 31) + ((long) C14064he.m66708k4(this.f11770du))) * 31) + ((long) C14064he.m66708k4(this.f11777x1))) * 31) + ((long) C14064he.m66708k4(this.f11776to))) * 31) + ((long) C14064he.m66708k4(this.f11772h4));
        return ((int) (jM66708k4 >> 32)) ^ ((int) jM66708k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12007ix m17332k4(C12007ix c12007ix) {
        C12025x6 c12025x6Clone = m17333k4(new C12025x6(c12007ix.m56571to(), c12007ix.m56554dy())).Clone();
        C12025x6 c12025x6Clone2 = m17333k4(new C12025x6(c12007ix.m56556h4(), c12007ix.m56558k4())).Clone();
        float fM67504x1 = C14116yg.m67504x1(c12025x6Clone.m56897x1(), c12025x6Clone2.m56897x1());
        float fM67504x12 = C14116yg.m67504x1(c12025x6Clone.m56895kk(), c12025x6Clone2.m56895kk());
        return new C12007ix(fM67504x1, fM67504x12, C14116yg.m67481k4(c12025x6Clone.m56897x1(), c12025x6Clone2.m56897x1()) - fM67504x1, C14116yg.m67481k4(c12025x6Clone.m56895kk(), c12025x6Clone2.m56895kk()) - fM67504x12);
    }

    /* JADX INFO: renamed from: kk */
    public final C4317dy m17345kk() {
        C4317dy c4317dy = new C4317dy();
        c4317dy.f11773k4 = this.f11773k4;
        c4317dy.f11777x1 = this.f11777x1;
        c4317dy.f11774kk = this.f11774kk;
        c4317dy.f11776to = this.f11776to;
        c4317dy.f11770du = this.f11770du;
        c4317dy.f11772h4 = this.f11772h4;
        c4317dy.f11775m9 = this.f11775m9;
        c4317dy.f11771dy = this.f11771dy;
        return c4317dy;
    }

    /* JADX INFO: renamed from: m9 */
    public final float m17346m9() {
        return this.f11776to;
    }

    /* JADX INFO: renamed from: to */
    public final float m17347to() {
        return this.f11773k4;
    }

    public String toString() {
        return C14113y2.m67402k4("{0}, {1}, {2}, {3}, {4}, {5}", Float.valueOf(this.f11773k4), Float.valueOf(this.f11777x1), Float.valueOf(this.f11774kk), Float.valueOf(this.f11776to), Float.valueOf(this.f11770du), Float.valueOf(this.f11772h4));
    }

    /* JADX INFO: renamed from: x1 */
    public final void m17348x1(float f, float f2) {
        switch (this.f11775m9) {
            case 0:
                this.f11770du = f;
                this.f11772h4 = f2;
                if (f != 0.0f || f2 != 0.0f) {
                    this.f11775m9 = 1;
                    this.f11771dy = 1;
                }
                break;
            case 1:
                float f3 = f + this.f11770du;
                this.f11770du = f3;
                float f4 = f2 + this.f11772h4;
                this.f11772h4 = f4;
                if (f3 == 0.0f && f4 == 0.0f) {
                    this.f11775m9 = 0;
                    this.f11771dy = 0;
                    break;
                }
                break;
            case 2:
                float f5 = f * this.f11773k4;
                this.f11770du = f5;
                float f6 = f2 * this.f11776to;
                this.f11772h4 = f6;
                if (f5 != 0.0d || f6 != 0.0d) {
                    this.f11775m9 = 3;
                    this.f11771dy |= 1;
                }
                break;
            case 3:
                float f7 = (f * this.f11773k4) + this.f11770du;
                this.f11770du = f7;
                float f8 = (f2 * this.f11776to) + this.f11772h4;
                this.f11772h4 = f8;
                if (f7 == 0.0d && f8 == 0.0d) {
                    this.f11775m9 = 2;
                    int i = this.f11771dy;
                    if (i != -1) {
                        this.f11771dy = i - 1;
                    }
                    break;
                }
                break;
            case 4:
                float f9 = f2 * this.f11774kk;
                this.f11770du = f9;
                float f10 = f * this.f11777x1;
                this.f11772h4 = f10;
                if (f9 != 0.0d || f10 != 0.0d) {
                    this.f11775m9 = 5;
                    this.f11771dy |= 1;
                }
                break;
            case 5:
                float f11 = (f2 * this.f11774kk) + this.f11770du;
                this.f11770du = f11;
                float f12 = (f * this.f11777x1) + this.f11772h4;
                this.f11772h4 = f12;
                if (f11 == 0.0d && f12 == 0.0d) {
                    this.f11775m9 = 4;
                    int i2 = this.f11771dy;
                    if (i2 != -1) {
                        this.f11771dy = i2 - 1;
                    }
                    break;
                }
                break;
            case 6:
                float f13 = (this.f11774kk * f2) + (this.f11773k4 * f);
                this.f11770du = f13;
                float f14 = (f2 * this.f11776to) + (f * this.f11777x1);
                this.f11772h4 = f14;
                if (f13 != 0.0d || f14 != 0.0d) {
                    this.f11775m9 = 7;
                    this.f11771dy |= 1;
                }
                break;
            case 7:
                float f15 = (this.f11774kk * f2) + (this.f11773k4 * f) + this.f11770du;
                this.f11770du = f15;
                float f16 = (f2 * this.f11776to) + (f * this.f11777x1) + this.f11772h4;
                this.f11772h4 = f16;
                if (f15 == 0.0d && f16 == 0.0d) {
                    this.f11775m9 = 6;
                    int i3 = this.f11771dy;
                    if (i3 != -1) {
                        this.f11771dy = i3 - 1;
                    }
                    break;
                }
                break;
            default:
                m17326x6();
                break;
        }
    }

    public C4317dy(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f11773k4 = f;
        this.f11777x1 = f2;
        this.f11774kk = f3;
        this.f11776to = f4;
        this.f11770du = f5;
        this.f11772h4 = f6;
        m17324rv();
    }

    /* JADX INFO: renamed from: k4 */
    public final C12025x6 m17333k4(C12025x6 c12025x6) {
        C12025x6 c12025x62 = new C12025x6(c12025x6.m56897x1(), c12025x6.m56895kk());
        int i = this.f11775m9;
        float fM56897x1 = c12025x62.m56897x1();
        float fM56895kk = c12025x62.m56895kk();
        switch (i) {
            case 0:
                return c12025x62;
            case 1:
                return new C12025x6(fM56897x1 + this.f11770du, fM56895kk + this.f11772h4);
            case 2:
                return new C12025x6(fM56897x1 * this.f11773k4, fM56895kk * this.f11776to);
            case 3:
                return new C12025x6((fM56897x1 * this.f11773k4) + this.f11770du, (fM56895kk * this.f11776to) + this.f11772h4);
            case 4:
                return new C12025x6(fM56895kk * this.f11774kk, fM56897x1 * this.f11777x1);
            case 5:
                return new C12025x6((fM56895kk * this.f11774kk) + this.f11770du, (fM56897x1 * this.f11777x1) + this.f11772h4);
            case 6:
                return new C12025x6((this.f11774kk * fM56895kk) + (this.f11773k4 * fM56897x1), (fM56895kk * this.f11776to) + (fM56897x1 * this.f11777x1));
            case 7:
                return new C12025x6((this.f11774kk * fM56895kk) + (this.f11773k4 * fM56897x1) + this.f11770du, (fM56895kk * this.f11776to) + (fM56897x1 * this.f11777x1) + this.f11772h4);
            default:
                m17326x6();
                return c12025x62;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m17349x1(float f, float f2, int i) {
        if (i == 0) {
            m17348x1(f, f2);
        }
        int i2 = this.f11775m9;
        switch (i2) {
            case 0:
            case 2:
            case 4:
            case 6:
                this.f11770du = f;
                this.f11772h4 = f2;
                this.f11775m9 = i2 | 1;
                this.f11771dy |= 1;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
                this.f11770du += f;
                this.f11772h4 += f2;
                break;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17334k4(float f) {
        if (f == 0.0f) {
            return;
        }
        if (f == 90.0f || f == -270.0f) {
            m17321jd();
            return;
        }
        if (f == -90.0f || f == 270.0f) {
            m17320fa();
            return;
        }
        if (f == 180.0f || f == -180.0f) {
            m17319ck();
            return;
        }
        double dM54223k4 = C11241kk.m54223k4(f);
        double dM67495m9 = C14116yg.m67495m9(dM54223k4);
        double dM67470dy = C14116yg.m67470dy(dM54223k4);
        if (dM67470dy != 1.0d) {
            double d = this.f11773k4;
            double d2 = this.f11774kk;
            this.f11773k4 = (float) ((dM67495m9 * d2) + (dM67470dy * d));
            double d3 = -dM67495m9;
            this.f11774kk = (float) ((d2 * dM67470dy) + (d * d3));
            double d4 = this.f11777x1;
            double d5 = this.f11776to;
            this.f11777x1 = (float) ((dM67495m9 * d5) + (dM67470dy * d4));
            this.f11776to = (float) ((dM67470dy * d5) + (d3 * d4));
            m17324rv();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final float[] m17350x1() {
        return new float[]{this.f11773k4, this.f11777x1, this.f11774kk, this.f11776to, this.f11770du, this.f11772h4};
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17335k4(float f, float f2) {
        int i = this.f11775m9;
        if ((i & 2) != 0) {
            this.f11773k4 *= f;
            this.f11776to *= f2;
        }
        switch (i) {
            case 0:
            case 1:
                this.f11773k4 = f;
                this.f11776to = f2;
                if (f != 1.0f || f2 != 1.0f) {
                    this.f11775m9 = i | 2;
                    this.f11771dy = -1;
                }
                break;
            case 2:
            case 3:
                if (this.f11773k4 == 1.0f && this.f11776to == 1.0f) {
                    int i2 = i & 1;
                    this.f11775m9 = i2;
                    this.f11771dy = i2 != 0 ? 1 : 0;
                } else {
                    this.f11771dy = -1;
                }
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                float f3 = this.f11774kk * f2;
                this.f11774kk = f3;
                float f4 = this.f11777x1 * f;
                this.f11777x1 = f4;
                if (f3 == 0.0f && f4 == 0.0f) {
                    int i3 = i & 1;
                    if (this.f11773k4 == 1.0f && this.f11776to == 1.0f) {
                        this.f11771dy = i3 != 0 ? 1 : 0;
                    } else {
                        i3 |= 2;
                        this.f11771dy = -1;
                    }
                    this.f11775m9 = i3;
                    break;
                }
                break;
            default:
                m17326x6();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m17336k4(float f, float f2, int i) {
        if (i == 0) {
            m17335k4(f, f2);
            return;
        }
        int i2 = this.f11775m9;
        if (i2 == 1 || i2 == 0) {
            this.f11775m9 = i2 | 2;
        }
        int i3 = this.f11775m9;
        if ((i3 & 4) != 0) {
            this.f11774kk *= f;
            this.f11777x1 *= f2;
            if ((i3 & 2) != 0) {
                this.f11773k4 *= f;
                this.f11776to *= f2;
            }
        }
        if ((i3 & 1) != 0) {
            this.f11770du *= f;
            this.f11772h4 *= f2;
        }
        this.f11771dy = -1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17337k4(float f, int i) {
        if (f == 0.0f) {
            return;
        }
        if (i == 0) {
            m17334k4(f);
            return;
        }
        if (f == 90.0f || f == -270.0f) {
            m17325up();
            return;
        }
        if (f == -90.0f || f == 270.0f) {
            m17323ks();
            return;
        }
        if (f == 180.0f || f == -180.0f) {
            m17327yj();
            return;
        }
        double dM54223k4 = C11241kk.m54223k4(f);
        double dM67495m9 = C14116yg.m67495m9(dM54223k4);
        double dM67470dy = C14116yg.m67470dy(dM54223k4);
        if (dM67470dy != 1.0d) {
            double d = this.f11773k4;
            double d2 = this.f11777x1;
            this.f11773k4 = (float) ((dM67470dy * d) - (dM67495m9 * d2));
            this.f11777x1 = (float) ((d2 * dM67470dy) + (d * dM67495m9));
            double d3 = this.f11774kk;
            double d4 = this.f11776to;
            this.f11774kk = (float) ((dM67470dy * d3) - (dM67495m9 * d4));
            this.f11776to = (float) ((d4 * dM67470dy) + (d3 * dM67495m9));
            double d5 = this.f11770du;
            double d6 = this.f11772h4;
            this.f11770du = (float) ((dM67470dy * d5) - (dM67495m9 * d6));
            this.f11772h4 = (float) ((dM67470dy * d6) + (dM67495m9 * d5));
            m17324rv();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17338k4(float f, C12025x6 c12025x6) {
        m17348x1(c12025x6.m56897x1(), c12025x6.m56895kk());
        m17334k4(f);
        m17348x1(-c12025x6.m56897x1(), -c12025x6.m56895kk());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17339k4(float f, C12025x6 c12025x6, int i) {
        if (i == 0) {
            m17338k4(f, c12025x6.Clone());
            return;
        }
        m17349x1(-c12025x6.m56897x1(), -c12025x6.m56895kk(), 1);
        m17337k4(f, 1);
        m17349x1(c12025x6.m56897x1(), c12025x6.m56895kk(), 1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17340k4(C4317dy c4317dy) {
        int i = this.f11775m9;
        int i2 = c4317dy.f11775m9;
        if (i == 0) {
            if ((i2 & 2) != 0) {
                this.f11773k4 = c4317dy.f11773k4;
                this.f11776to = c4317dy.f11776to;
            }
            if ((i2 & 4) != 0) {
                this.f11774kk = c4317dy.f11774kk;
                this.f11777x1 = c4317dy.f11777x1;
            }
            if ((i2 & 1) != 0) {
                this.f11770du = c4317dy.f11770du;
                this.f11772h4 = c4317dy.f11772h4;
            }
            this.f11775m9 = i2;
            this.f11771dy = c4317dy.f11771dy;
            return;
        }
        if (i2 != 0) {
            if (i2 == 1) {
                m17348x1(c4317dy.f11770du, c4317dy.f11772h4);
                return;
            }
            if (i2 == 2) {
                m17335k4(c4317dy.f11773k4, c4317dy.f11776to);
                return;
            }
            if (i2 == 4) {
                switch (i) {
                    case 1:
                        this.f11773k4 = 0.0f;
                        this.f11774kk = c4317dy.f11774kk;
                        this.f11777x1 = c4317dy.f11777x1;
                        this.f11776to = 0.0f;
                        this.f11775m9 = 5;
                        this.f11771dy = -1;
                        break;
                    case 2:
                    case 3:
                        this.f11774kk = this.f11773k4 * c4317dy.f11774kk;
                        this.f11773k4 = 0.0f;
                        this.f11777x1 = this.f11776to * c4317dy.f11777x1;
                        this.f11776to = 0.0f;
                        this.f11775m9 = i ^ 6;
                        this.f11771dy = -1;
                        break;
                    case 4:
                    case 5:
                        this.f11773k4 = this.f11774kk * c4317dy.f11777x1;
                        this.f11774kk = 0.0f;
                        this.f11776to = this.f11777x1 * c4317dy.f11774kk;
                        this.f11777x1 = 0.0f;
                        this.f11775m9 = i ^ 6;
                        this.f11771dy = -1;
                        break;
                    case 6:
                    case 7:
                        float f = c4317dy.f11774kk;
                        float f2 = c4317dy.f11777x1;
                        float f3 = this.f11773k4;
                        this.f11773k4 = this.f11774kk * f2;
                        this.f11774kk = f3 * f;
                        float f4 = this.f11777x1;
                        this.f11777x1 = this.f11776to * f2;
                        this.f11776to = f4 * f;
                        this.f11771dy = -1;
                        break;
                }
                return;
            }
            float f5 = c4317dy.f11773k4;
            float f6 = c4317dy.f11774kk;
            float f7 = c4317dy.f11770du;
            float f8 = c4317dy.f11777x1;
            float f9 = c4317dy.f11776to;
            float f10 = c4317dy.f11772h4;
            switch (i) {
                case 1:
                    this.f11773k4 = f5;
                    this.f11774kk = f6;
                    this.f11770du += f7;
                    this.f11777x1 = f8;
                    this.f11776to = f9;
                    this.f11772h4 += f10;
                    this.f11775m9 = i2 | 1;
                    this.f11771dy = -1;
                    return;
                case 2:
                case 3:
                    float f11 = this.f11773k4;
                    this.f11773k4 = f5 * f11;
                    this.f11774kk = f6 * f11;
                    this.f11770du = (f7 * f11) + this.f11770du;
                    float f12 = this.f11776to;
                    this.f11777x1 = f8 * f12;
                    this.f11776to = f9 * f12;
                    this.f11772h4 = (f10 * f12) + this.f11772h4;
                    break;
                case 4:
                case 5:
                    float f13 = this.f11774kk;
                    this.f11773k4 = f8 * f13;
                    this.f11774kk = f9 * f13;
                    this.f11770du = (f10 * f13) + this.f11770du;
                    float f14 = this.f11777x1;
                    this.f11777x1 = f5 * f14;
                    this.f11776to = f6 * f14;
                    this.f11772h4 = (f7 * f14) + this.f11772h4;
                    break;
                case 6:
                case 7:
                    if (i == 6) {
                        this.f11775m9 = i | i2;
                    }
                    float f15 = this.f11773k4;
                    float f16 = this.f11774kk;
                    this.f11773k4 = (f8 * f16) + (f5 * f15);
                    this.f11774kk = (f9 * f16) + (f6 * f15);
                    this.f11770du = (f16 * f10) + (f15 * f7) + this.f11770du;
                    float f17 = this.f11777x1;
                    float f18 = this.f11776to;
                    this.f11777x1 = (f8 * f18) + (f5 * f17);
                    this.f11776to = (f9 * f18) + (f6 * f17);
                    this.f11772h4 = (f10 * f18) + (f7 * f17) + this.f11772h4;
                    this.f11771dy = -1;
                    return;
                default:
                    m17326x6();
                    break;
            }
            m17324rv();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m17341k4(C4317dy c4317dy, int i) {
        float f;
        if (i == 0) {
            m17340k4(c4317dy);
        }
        int i2 = this.f11775m9;
        int i3 = c4317dy.f11775m9;
        if (i3 != 0) {
            if (i3 == 1) {
                switch (i2) {
                    case 0:
                    case 2:
                    case 4:
                    case 6:
                        this.f11770du = c4317dy.f11770du;
                        this.f11772h4 = c4317dy.f11772h4;
                        this.f11775m9 = i2 | 1;
                        this.f11771dy |= 1;
                        break;
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                        this.f11770du += c4317dy.f11770du;
                        this.f11772h4 += c4317dy.f11772h4;
                        break;
                }
            }
            if (i3 == 2) {
                if (i2 == 1 || i2 == 0) {
                    this.f11775m9 = i2 | 2;
                }
                float f2 = c4317dy.f11773k4;
                float f3 = c4317dy.f11776to;
                if ((i2 & 4) != 0) {
                    this.f11774kk *= f2;
                    this.f11777x1 *= f3;
                    if ((i2 & 2) != 0) {
                        this.f11773k4 *= f2;
                        this.f11776to *= f3;
                    }
                }
                if ((i2 & 1) != 0) {
                    this.f11770du *= f2;
                    this.f11772h4 *= f3;
                }
                this.f11771dy = -1;
                return;
            }
            if (i3 == 4) {
                if (i2 == 5 || i2 == 4) {
                    i2 |= 2;
                    this.f11775m9 = i2 ^ 4;
                }
                if (i2 == 1 || i2 == 0 || i2 == 3 || i2 == 2) {
                    this.f11775m9 = i2 ^ 4;
                }
                float f4 = c4317dy.f11774kk;
                float f5 = c4317dy.f11777x1;
                float f6 = this.f11773k4;
                this.f11773k4 = this.f11777x1 * f4;
                this.f11777x1 = f6 * f5;
                float f7 = this.f11774kk;
                this.f11774kk = this.f11776to * f4;
                this.f11776to = f7 * f5;
                float f8 = this.f11770du;
                this.f11770du = this.f11772h4 * f4;
                this.f11772h4 = f8 * f5;
                this.f11771dy = -1;
                return;
            }
            float f9 = c4317dy.f11773k4;
            float f10 = c4317dy.f11774kk;
            float f11 = c4317dy.f11770du;
            float f12 = c4317dy.f11777x1;
            float f13 = c4317dy.f11776to;
            float f14 = c4317dy.f11772h4;
            if ((i2 & 1) != 0) {
                float f15 = this.f11770du;
                float f16 = this.f11772h4;
                f11 = (f16 * f10) + (f15 * f9) + f11;
                f14 = (f16 * f13) + (f15 * f12) + f14;
            }
            switch (i2) {
                case 0:
                case 1:
                    this.f11770du = f11;
                    this.f11772h4 = f14;
                    this.f11773k4 = f9;
                    this.f11777x1 = f12;
                    this.f11774kk = f10;
                    this.f11776to = f13;
                    this.f11775m9 = i2 | i3;
                    this.f11771dy = -1;
                    break;
                case 2:
                case 3:
                    this.f11770du = f11;
                    this.f11772h4 = f14;
                    float f17 = this.f11773k4;
                    this.f11773k4 = f9 * f17;
                    this.f11777x1 = f17 * f12;
                    float f18 = this.f11776to;
                    this.f11774kk = f10 * f18;
                    f = f18 * f13;
                    this.f11776to = f;
                    m17324rv();
                    break;
                case 4:
                case 5:
                    this.f11770du = f11;
                    this.f11772h4 = f14;
                    float f19 = this.f11777x1;
                    this.f11773k4 = f10 * f19;
                    this.f11777x1 = f19 * f13;
                    float f20 = this.f11774kk;
                    this.f11774kk = f9 * f20;
                    f = f20 * f12;
                    this.f11776to = f;
                    m17324rv();
                    break;
                case 6:
                case 7:
                    this.f11770du = f11;
                    this.f11772h4 = f14;
                    float f21 = this.f11773k4;
                    float f22 = this.f11777x1;
                    this.f11773k4 = (f22 * f10) + (f21 * f9);
                    this.f11777x1 = (f22 * f13) + (f21 * f12);
                    float f23 = this.f11774kk;
                    float f24 = this.f11776to;
                    this.f11774kk = (f10 * f24) + (f9 * f23);
                    this.f11776to = (f24 * f13) + (f23 * f12);
                    m17324rv();
                    break;
                default:
                    m17326x6();
                    m17324rv();
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17342k4(C12025x6[] c12025x6Arr) {
        m17343k4(c12025x6Arr, 0, c12025x6Arr.length);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m17343k4(C12025x6[] c12025x6Arr, int i, int i2) {
        int i3 = this.f11775m9;
        int length = i2 + i;
        if (length > c12025x6Arr.length) {
            length = c12025x6Arr.length;
        }
        while (i < length) {
            float fM56897x1 = c12025x6Arr[i].m56897x1();
            float fM56895kk = c12025x6Arr[i].m56895kk();
            switch (i3) {
                case 0:
                    break;
                case 1:
                    c12025x6Arr[i] = new C12025x6(fM56897x1 + this.f11770du, fM56895kk + this.f11772h4);
                    break;
                case 2:
                    c12025x6Arr[i] = new C12025x6(fM56897x1 * this.f11773k4, fM56895kk * this.f11776to);
                    break;
                case 3:
                    c12025x6Arr[i] = new C12025x6((fM56897x1 * this.f11773k4) + this.f11770du, (fM56895kk * this.f11776to) + this.f11772h4);
                    break;
                case 4:
                    c12025x6Arr[i] = new C12025x6(fM56895kk * this.f11774kk, fM56897x1 * this.f11777x1);
                    break;
                case 5:
                    c12025x6Arr[i] = new C12025x6((fM56895kk * this.f11774kk) + this.f11770du, (fM56897x1 * this.f11777x1) + this.f11772h4);
                    break;
                case 6:
                    c12025x6Arr[i] = new C12025x6((this.f11774kk * fM56895kk) + (this.f11773k4 * fM56897x1), (fM56895kk * this.f11776to) + (fM56897x1 * this.f11777x1));
                    break;
                case 7:
                    c12025x6Arr[i] = new C12025x6((this.f11774kk * fM56895kk) + (this.f11773k4 * fM56897x1) + this.f11770du, (fM56895kk * this.f11776to) + (fM56897x1 * this.f11777x1) + this.f11772h4);
                    break;
                default:
                    m17326x6();
                    break;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m17344k4() {
        return this.f11773k4 == 1.0f && this.f11777x1 == 0.0f && this.f11774kk == 0.0f && this.f11776to == 1.0f && this.f11770du == 0.0f && this.f11772h4 == 0.0f;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m17322k4(C4317dy c4317dy, C4317dy c4317dy2) {
        if (C14067j2.m66729x1(c4317dy, c4317dy2)) {
            return true;
        }
        return !C14067j2.m66729x1(null, c4317dy) && !C14067j2.m66729x1(null, c4317dy2) && c4317dy.f11773k4 == c4317dy2.f11773k4 && c4317dy.f11777x1 == c4317dy2.f11777x1 && c4317dy.f11774kk == c4317dy2.f11774kk && c4317dy.f11776to == c4317dy2.f11776to && c4317dy.f11770du == c4317dy2.f11770du && c4317dy.f11772h4 == c4317dy2.f11772h4;
    }
}
