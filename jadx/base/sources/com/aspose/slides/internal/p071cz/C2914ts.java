package com.aspose.slides.internal.p071cz;

import OooO0O0.C20395OooO0o0;
import androidx.core.graphics.OooO00o;
import com.aspose.slides.C22200OooO0o0;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.ts */
/* JADX INFO: loaded from: classes3.dex */
class C2914ts {

    /* JADX INFO: renamed from: k4 */
    private double f8756k4 = 0.08726646259971647d;

    /* JADX INFO: renamed from: x1 */
    private double f8760x1 = 2.8797932657906435d;

    /* JADX INFO: renamed from: kk */
    private double f8757kk = 0.1d;

    /* JADX INFO: renamed from: to */
    private double f8759to = 1.0E-30d;

    /* JADX INFO: renamed from: du */
    private boolean f8754du = true;

    /* JADX INFO: renamed from: h4 */
    private long f8755h4 = 32;

    /* JADX INFO: renamed from: m9 */
    private double f8758m9 = C14116yg.m67469du(4762.5d, 2.0d);

    /* JADX INFO: renamed from: k4 */
    private C12025x6 m12537k4(C12025x6 c12025x6, C12025x6 c12025x62, C12025x6 c12025x63, float f) {
        char c;
        C12025x6[] c12025x6Arr = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, 2);
        if (C14116yg.m67480k4(c12025x6.m56897x1() - c12025x62.m56897x1()) >= 1.0E-10d) {
            double dM56895kk = (c12025x6.m56895kk() - c12025x62.m56895kk()) / (c12025x6.m56897x1() - c12025x62.m56897x1());
            double dM56895kk2 = ((double) c12025x6.m56895kk()) - (((double) c12025x6.m56897x1()) * dM56895kk);
            double d = dM56895kk * 2.0d;
            double d2 = d * dM56895kk2;
            c = 1;
            double dM67469du = C14116yg.m67469du((d2 - ((double) (c12025x63.m56897x1() * 2.0f))) - (((double) (c12025x63.m56895kk() * 2.0f)) * dM56895kk), 2.0d) - ((((((dM56895kk2 * dM56895kk2) - ((double) (f * f))) + ((double) (c12025x63.m56897x1() * c12025x63.m56897x1()))) + ((double) (c12025x63.m56895kk() * c12025x63.m56895kk()))) - (((double) (c12025x63.m56895kk() * 2.0f)) * dM56895kk2)) * C20395OooO0o0.OooO00o(dM56895kk, 4.0d, dM56895kk, 4.0d));
            if (dM67469du < 0.0d) {
                return c12025x63;
            }
            double dM67496rv = C14116yg.m67496rv(dM67469du);
            double d3 = (d * dM56895kk) + 2.0d;
            double d4 = ((-((d2 - ((double) (c12025x63.m56897x1() * 2.0f))) - (((double) (c12025x63.m56895kk() * 2.0f)) * dM56895kk))) + dM67496rv) / d3;
            double d5 = (dM56895kk * d4) + dM56895kk2;
            if (C14116yg.m67475k4(dM67496rv) < 1.0E-10d) {
                return new C12025x6(C7019kk.m27437dy(Double.valueOf(d4), 14), C7019kk.m27437dy(Double.valueOf(d5), 14));
            }
            c12025x6Arr[0] = new C12025x6(C7019kk.m27437dy(Double.valueOf(d4), 14), C7019kk.m27437dy(Double.valueOf(d5), 14));
            double d6 = ((-((d2 - ((double) (c12025x63.m56897x1() * 2.0f))) - (((double) (c12025x63.m56895kk() * 2.0f)) * dM56895kk))) - dM67496rv) / d3;
            c12025x6Arr[1] = new C12025x6(C7019kk.m27437dy(Double.valueOf(d6), 14), C7019kk.m27437dy(Double.valueOf((dM56895kk * d6) + dM56895kk2), 14));
        } else {
            if (C14116yg.m67480k4(c12025x6.m56897x1() - c12025x63.m56897x1()) > f) {
                return c12025x63;
            }
            double dM67496rv2 = C14116yg.m67496rv((f * f) - ((c12025x6.m56897x1() - c12025x63.m56897x1()) * (c12025x6.m56897x1() - c12025x63.m56897x1())));
            c12025x6Arr[0] = new C12025x6(c12025x6.m56897x1(), C7019kk.m27437dy(Double.valueOf(((double) c12025x63.m56895kk()) - dM67496rv2), 14));
            c12025x6Arr[1] = new C12025x6(c12025x6.m56897x1(), C7019kk.m27437dy(Double.valueOf(((double) c12025x63.m56895kk()) + dM67496rv2), 14));
            c = 1;
        }
        return C14116yg.m67469du((double) (c12025x6Arr[0].m56895kk() - c12025x62.m56895kk()), 2.0d) + (C14116yg.m67469du((double) (c12025x6Arr[0].m56897x1() - c12025x62.m56897x1()), 2.0d) + (C14116yg.m67469du((double) (c12025x6Arr[0].m56895kk() - c12025x6.m56895kk()), 2.0d) + C14116yg.m67469du((double) (c12025x6Arr[0].m56897x1() - c12025x6.m56897x1()), 2.0d))) < C14116yg.m67469du((double) (c12025x6Arr[c].m56895kk() - c12025x62.m56895kk()), 2.0d) + (C14116yg.m67469du((double) (c12025x6Arr[c].m56897x1() - c12025x62.m56897x1()), 2.0d) + (C14116yg.m67469du((double) (c12025x6Arr[c].m56895kk() - c12025x6.m56895kk()), 2.0d) + C14116yg.m67469du((double) (c12025x6Arr[c].m56897x1() - c12025x6.m56897x1()), 2.0d))) ? c12025x6Arr[0] : c12025x6Arr[c];
    }

    /* JADX INFO: renamed from: k4 */
    private void m12538k4(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, long j, List<C12025x6>[] listArr) {
        double d9;
        if (j > this.f8755h4) {
            return;
        }
        double d10 = (d + d3) / 2.0d;
        double d11 = (d2 + d4) / 2.0d;
        double d12 = (d3 + d5) / 2.0d;
        double d13 = (d4 + d6) / 2.0d;
        double d14 = (d5 + d7) / 2.0d;
        double d15 = (d6 + d8) / 2.0d;
        double d16 = (d10 + d12) / 2.0d;
        double d17 = (d11 + d13) / 2.0d;
        double d18 = (d12 + d14) / 2.0d;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d16 + d18) / 2.0d;
        double d21 = (d17 + d19) / 2.0d;
        if (j > 0) {
            double d22 = d7 - d;
            double d23 = d8 - d2;
            double dM67475k4 = C14116yg.m67475k4(((d3 - d7) * d23) - ((d4 - d8) * d22));
            double dM67475k42 = C14116yg.m67475k4(((d5 - d7) * d23) - ((d6 - d8) * d22));
            double d24 = this.f8759to;
            d9 = d20;
            if (dM67475k4 > d24 && dM67475k42 > d24) {
                double d25 = dM67475k4 + dM67475k42;
                if (d25 * d25 <= OooO00o.OooO00o(d23, d23, d22 * d22, this.f8758m9)) {
                    if (this.f8756k4 < this.f8757kk) {
                        listArr[0].addItem(new C12025x6(C7019kk.m27437dy(Double.valueOf(d9), 14), C7019kk.m27437dy(Double.valueOf(d21), 14)));
                        return;
                    }
                    double dM67498to = C14116yg.m67498to(d6 - d4, d5 - d3);
                    double dM67475k43 = C14116yg.m67475k4(dM67498to - C14116yg.m67498to(d4 - d2, d3 - d));
                    double dM67475k44 = C14116yg.m67475k4(C14116yg.m67498to(d8 - d6, d7 - d5) - dM67498to);
                    if (dM67475k43 >= 3.141592653589793d) {
                        dM67475k43 = 6.283185307179586d - dM67475k43;
                    }
                    if (dM67475k44 >= 3.141592653589793d) {
                        dM67475k44 = 6.283185307179586d - dM67475k44;
                    }
                    double d26 = dM67475k43;
                    if (dM67475k43 + dM67475k44 < this.f8756k4) {
                        listArr[0].addItem(new C12025x6(C7019kk.m27437dy(Double.valueOf(d9), 14), C7019kk.m27437dy(Double.valueOf(d21), 14)));
                        return;
                    }
                    if (C14116yg.m67475k4(this.f8760x1) > 1.0E-10d) {
                        double d27 = this.f8760x1;
                        if (d26 > d27) {
                            listArr[0].addItem(new C12025x6(C7019kk.m27437dy(Double.valueOf(d3), 14), C7019kk.m27437dy(Double.valueOf(d4), 14)));
                            return;
                        } else if (dM67475k44 > d27) {
                            listArr[0].addItem(new C12025x6(C7019kk.m27437dy(Double.valueOf(d5), 14), C7019kk.m27437dy(Double.valueOf(d6), 14)));
                            return;
                        }
                    }
                }
            } else if (dM67475k4 > d24) {
                if (dM67475k4 * dM67475k4 <= OooO00o.OooO00o(d23, d23, d22 * d22, this.f8758m9)) {
                    if (this.f8756k4 < this.f8757kk) {
                        listArr[0].addItem(new C12025x6(C7019kk.m27437dy(Double.valueOf(d9), 14), C7019kk.m27437dy(Double.valueOf(d21), 14)));
                        return;
                    }
                    double dM67475k45 = C14116yg.m67475k4(C14116yg.m67498to(d6 - d4, d5 - d3) - C14116yg.m67498to(d4 - d2, d3 - d));
                    if (dM67475k45 >= 3.141592653589793d) {
                        dM67475k45 = 6.283185307179586d - dM67475k45;
                    }
                    if (dM67475k45 < this.f8756k4) {
                        listArr[0].addItem(new C12025x6(C7019kk.m27437dy(Double.valueOf(d3), 14), C7019kk.m27437dy(Double.valueOf(d4), 14)));
                        listArr[0].addItem(new C12025x6(C7019kk.m27437dy(Double.valueOf(d5), 14), C7019kk.m27437dy(Double.valueOf(d6), 14)));
                        return;
                    } else if (C14116yg.m67475k4(this.f8760x1) > 1.0E-10d && dM67475k45 > this.f8760x1) {
                        listArr[0].addItem(new C12025x6(C7019kk.m27437dy(Double.valueOf(d3), 14), C7019kk.m27437dy(Double.valueOf(d4), 14)));
                        return;
                    }
                }
            } else if (dM67475k42 > d24) {
                if (dM67475k42 * dM67475k42 <= OooO00o.OooO00o(d23, d23, d22 * d22, this.f8758m9)) {
                    if (this.f8756k4 < this.f8757kk) {
                        listArr[0].addItem(new C12025x6(C7019kk.m27437dy(Double.valueOf(d9), 14), C7019kk.m27437dy(Double.valueOf(d21), 14)));
                        return;
                    }
                    double dM67475k46 = C14116yg.m67475k4(C14116yg.m67498to(d8 - d6, d7 - d5) - C14116yg.m67498to(d6 - d4, d5 - d3));
                    if (dM67475k46 >= 3.141592653589793d) {
                        dM67475k46 = 6.283185307179586d - dM67475k46;
                    }
                    if (dM67475k46 < this.f8756k4) {
                        listArr[0].addItem(new C12025x6(C7019kk.m27437dy(Double.valueOf(d3), 14), C7019kk.m27437dy(Double.valueOf(d4), 14)));
                        listArr[0].addItem(new C12025x6(C7019kk.m27437dy(Double.valueOf(d5), 14), C7019kk.m27437dy(Double.valueOf(d6), 14)));
                        return;
                    } else if (C14116yg.m67475k4(this.f8760x1) > 1.0E-10d && dM67475k46 > this.f8760x1) {
                        listArr[0].addItem(new C12025x6(C7019kk.m27437dy(Double.valueOf(d5), 14), C7019kk.m27437dy(Double.valueOf(d6), 14)));
                        return;
                    }
                }
            } else {
                double d28 = d9 - ((d + d7) / 2.0d);
                double d29 = d21 - ((d2 + d8) / 2.0d);
                if ((d29 * d29) + (d28 * d28) <= this.f8758m9) {
                    listArr[0].addItem(new C12025x6(C7019kk.m27437dy(Double.valueOf(d9), 14), C7019kk.m27437dy(Double.valueOf(d21), 14)));
                    return;
                }
            }
        } else {
            d9 = d20;
        }
        long j2 = j + 1;
        double d30 = d9;
        m12538k4(d, d2, d10, d11, d16, d17, d30, d21, j2, listArr);
        m12538k4(d30, d21, d18, d19, d14, d15, d7, d8, j2, listArr);
    }

    /* JADX INFO: renamed from: k4 */
    public void m12540k4(C12025x6 c12025x6, C12025x6 c12025x62, C12025x6 c12025x63, C12025x6 c12025x64, List<C12025x6>[] listArr) {
        List<C12025x6> list = new List<>();
        list.addItem(new C12025x6(c12025x6.m56897x1(), c12025x6.m56895kk()));
        List<C12025x6>[] listArr2 = {list};
        m12538k4(c12025x6.m56897x1(), c12025x6.m56895kk(), c12025x62.m56897x1(), c12025x62.m56895kk(), c12025x63.m56897x1(), c12025x63.m56895kk(), c12025x64.m56897x1(), c12025x64.m56895kk(), 0L, listArr2);
        List<C12025x6> list2 = listArr2[0];
        list2.addItem(new C12025x6(c12025x64.m56897x1(), c12025x64.m56895kk()));
        if (this.f8754du) {
            double dM67496rv = C14116yg.m67496rv(C14116yg.m67469du(c12025x6.m56895kk() - c12025x62.m56895kk(), 2.0d) + C14116yg.m67469du(c12025x6.m56897x1() - c12025x62.m56897x1(), 2.0d));
            double dM67496rv2 = C14116yg.m67496rv(C14116yg.m67469du(c12025x64.m56895kk() - c12025x63.m56895kk(), 2.0d) + C14116yg.m67469du(c12025x64.m56897x1() - c12025x63.m56897x1(), 2.0d));
            listArr2[0] = list2;
            m12539k4(listArr2, C7019kk.m27437dy(Double.valueOf((dM67496rv / dM67496rv2) * 54400.0d), 14), false);
            listArr2[0] = listArr2[0];
            m12539k4(listArr2, C7019kk.m27437dy(Double.valueOf((dM67496rv2 / dM67496rv) * 54400.0d), 14), true);
            list2 = listArr2[0];
        }
        listArr[0].addRange(list2);
    }

    /* JADX INFO: renamed from: k4 */
    public void m12541k4(boolean z) {
        this.f8754du = z;
    }

    /* JADX INFO: renamed from: k4 */
    private void m12539k4(List<C12025x6>[] listArr, float f, boolean z) {
        int i;
        char c = 0;
        int size = listArr[0].size();
        char c2 = 2;
        if (size >= 2 && f > 0.0f) {
            double d = f * f;
            C12025x6 c12025x6 = new C12025x6();
            C12025x6 c12025x62 = new C12025x6();
            C12025x6 c12025x63 = new C12025x6();
            int i2 = 1;
            if (z) {
                int i3 = size - 1;
                listArr[0].get_Item(i3).CloneTo(c12025x63);
                while (i3 > 0) {
                    int i4 = i3 - 1;
                    char c3 = c2;
                    listArr[0].get_Item(i4).CloneTo(c12025x62);
                    int i5 = i2;
                    double dM67469du = C14116yg.m67469du(c12025x62.m56895kk() - c12025x63.m56895kk(), 2.0d) + C14116yg.m67469du(c12025x62.m56897x1() - c12025x63.m56897x1(), 2.0d);
                    if (dM67469du > d) {
                        m12537k4(c12025x62.Clone(), listArr[0].get_Item(i3).Clone(), c12025x63.Clone(), f).CloneTo(c12025x6);
                        if (i3 + 1 < listArr[0].size()) {
                            listArr[0].removeRange(i3, (r1.size() - 2) - i4);
                        }
                        listArr[0].insertItem(r1.size() - 1, c12025x6.Clone());
                        return;
                    }
                    if (C14116yg.m67475k4(C14116yg.m67475k4(dM67469du) - C14116yg.m67475k4(d)) < 1.0E-10d) {
                        if (i3 + 1 < listArr[0].size()) {
                            listArr[0].removeRange(i3, (r1.size() - 2) - i4);
                            return;
                        }
                        return;
                    }
                    i3 = i4;
                    c2 = c3;
                    i2 = i5;
                }
                i = i2;
            } else {
                int i6 = 1;
                listArr[0].get_Item(0).CloneTo(c12025x63);
                int i7 = 0;
                while (i7 < size - 1) {
                    int i8 = i7 + 1;
                    listArr[c].get_Item(i8).CloneTo(c12025x62);
                    char c4 = c;
                    int i9 = size;
                    double dM67469du2 = C14116yg.m67469du(c12025x62.m56895kk() - c12025x63.m56895kk(), 2.0d) + C14116yg.m67469du(c12025x62.m56897x1() - c12025x63.m56897x1(), 2.0d);
                    if (dM67469du2 > d) {
                        m12537k4(c12025x62.Clone(), listArr[c4].get_Item(i7).Clone(), c12025x63.Clone(), f).CloneTo(c12025x6);
                        int i10 = i6;
                        if (i8 > i10) {
                            listArr[c4].removeRange(i10, i7);
                        }
                        listArr[c4].insertItem(i10, c12025x6.Clone());
                        return;
                    }
                    int i11 = i6;
                    if (C14116yg.m67475k4(C14116yg.m67475k4(dM67469du2) - C14116yg.m67475k4(d)) < 1.0E-10d) {
                        if (i8 > i11) {
                            listArr[c4].removeRange(i11, i7);
                            return;
                        }
                        return;
                    } else {
                        i7 = i8;
                        i6 = i11;
                        size = i9;
                        c = c4;
                    }
                }
                i = i6;
            }
            listArr[c].removeRange(i, r1.size() - 2);
        }
    }
}
