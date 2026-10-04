package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11683c5;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14077m4;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: loaded from: classes3.dex */
class kc0 extends AbstractC7020m9<kc0> {
    /* JADX INFO: renamed from: k4 */
    public static double m63750k4(double d, double d2) {
        int iM63760to = m63760to(d);
        int iM63760to2 = m63760to(d2);
        if (iM63760to <= iM63760to2) {
            iM63760to = iM63760to2;
        }
        return C14116yg.m67477k4(d - d2, iM63760to);
    }

    /* JADX INFO: renamed from: kk */
    public static int m63759kk(double d) {
        return C22201OooO0oO.OooO00o(d, 0.5d, 14);
    }

    /* JADX INFO: renamed from: to */
    public static int m63760to(double d) {
        char cM67042x1 = C14080ne.m67042x1(C11683c5.m55034jd().m55062ne());
        String strM66425h4 = C14044b3.m66425h4(d);
        int iM67364dy = C14113y2.m67364dy(strM66425h4, "E");
        int iM67364dy2 = C14113y2.m67364dy(strM66425h4, "e");
        int i = 1;
        if (iM67364dy > 0 || iM67364dy2 > 0) {
            String[] strArrM67414k4 = C14113y2.m67414k4(strM66425h4, iM67364dy > 0 ? 'E' : 'e');
            if (strArrM67414k4[0].charAt(0) == '-') {
                strArrM67414k4[0] = C14113y2.m67422kk(strArrM67414k4[0], 1);
            }
            int iM67429to = C14113y2.m67429to(strArrM67414k4[0], cM67042x1);
            int iM67482k4 = C14116yg.m67482k4(C14080ne.m67015to(strArrM67414k4[1]));
            if (iM67429to > 0) {
                String strM67408k4 = C14113y2.m67408k4(C14113y2.m67443x1(strArrM67414k4[0], 0, iM67429to), C14113y2.m67422kk(strArrM67414k4[0], iM67429to + 1));
                if (strArrM67414k4[1].charAt(0) == '-') {
                    int i2 = iM67482k4 - (iM67429to - 1);
                    if (i2 > 0) {
                        while (i2 > 0) {
                            strM67408k4 = C14113y2.m67408k4("0", strM67408k4);
                            i2--;
                        }
                        strM67408k4 = C14113y2.m67407k4(C14117yj.m67537ne(strM67408k4.charAt(0)), Character.valueOf(cM67042x1), C14113y2.m67422kk(strM67408k4, 1));
                    } else if (i2 < 0) {
                        int i3 = iM67429to + i2;
                        strM67408k4 = C14113y2.m67407k4(C14113y2.m67443x1(strM67408k4, 0, i3), Character.valueOf(cM67042x1), C14113y2.m67422kk(strM67408k4, i3));
                    }
                } else {
                    while (iM67482k4 > 0) {
                        strM67408k4 = C14113y2.m67408k4(strM67408k4, "0");
                        iM67482k4--;
                    }
                }
                strM66425h4 = strM67408k4;
            } else {
                String strM67408k42 = strArrM67414k4[0];
                if (strArrM67414k4[1].charAt(0) == '-') {
                    int length = iM67482k4 - (strM67408k42.length() - 1);
                    if (length > 0) {
                        while (length > 0) {
                            strM67408k42 = C14113y2.m67408k4("0", strM67408k42);
                            length--;
                        }
                        strM67408k42 = C14113y2.m67407k4(C14117yj.m67537ne(strM67408k42.charAt(0)), Character.valueOf(cM67042x1), C14113y2.m67422kk(strM67408k42, 1));
                    } else if (length < 0) {
                        strM67408k42 = C14113y2.m67407k4(C14113y2.m67443x1(strM67408k42, 0, strM67408k42.length() + length), Character.valueOf(cM67042x1), C14113y2.m67422kk(strM67408k42, strM67408k42.length() + length));
                    }
                } else {
                    while (iM67482k4 > 0) {
                        strM67408k42 = C14113y2.m67408k4(strM67408k42, "0");
                        iM67482k4--;
                    }
                }
                strM66425h4 = strM67408k42;
            }
        }
        int iM67434x1 = C14113y2.m67434x1(strM66425h4, cM67042x1, 0);
        if (iM67434x1 > 0) {
            for (int i4 = iM67434x1 + 1; i4 < strM66425h4.length(); i4++) {
                i++;
            }
        }
        if (i > 15) {
            return 15;
        }
        return i;
    }

    /* JADX INFO: renamed from: x1 */
    public static double m63761x1(double d, double d2) {
        int iM63760to = m63760to(d);
        int iM63760to2 = m63760to(d2);
        if (iM63760to <= iM63760to2) {
            iM63760to = iM63760to2;
        }
        if (iM63760to > 15) {
            iM63760to = 15;
        }
        if (iM63760to < 0) {
            iM63760to = 0;
        }
        return C14116yg.m67477k4(d + d2, iM63760to);
    }

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof kc0) {
            return m63764x1((kc0) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public static double m63751k4(List<C13847mr> list, int i) {
        double dM67475k4 = 0.0d;
        for (int i2 = 0; i2 < list.size(); i2++) {
            C0886d8 c0886d8 = list.get_Item(i2).m64944dy().get_Item(i);
            if (c0886d8 != null) {
                dM67475k4 = C14116yg.m67475k4(c0886d8.m4989k4()) + dM67475k4;
            }
        }
        return dM67475k4;
    }

    /* JADX INFO: renamed from: x1 */
    public static int m63762x1(double d) {
        return C7019kk.m27462to(Double.valueOf(C14116yg.m67490kk(d)), 14);
    }

    /* JADX INFO: renamed from: k4 */
    public static double m63752k4(C14084qq c14084qq, boolean z) {
        if (z) {
            double dM66816h4 = C14084qq.m67073c5(c14084qq, new C14084qq(1904, 1, 1)).Clone().m66816h4();
            if (dM66816h4 < 0.0d) {
                return -1.0d;
            }
            return dM66816h4;
        }
        new C14084qq();
        new C14084qq();
        C14077m4 c14077m4Clone = C14084qq.m67073c5(c14084qq, new C14084qq(1900, 3, 1)).Clone();
        C14084qq c14084qq2 = c14077m4Clone.m66816h4() > 0.0d ? new C14084qq(1899, 12, 30) : new C14084qq(1899, 12, 31);
        C14084qq.m67073c5(new C14084qq(9999, 12, 31, 23, 59, 59, 999), c14084qq).CloneTo(c14077m4Clone);
        if (c14077m4Clone.m66816h4() < 0.0d) {
            return -1.0d;
        }
        C14084qq.m67073c5(c14084qq, c14084qq2).CloneTo(c14077m4Clone);
        if (c14077m4Clone.m66816h4() < 0.0d) {
            return -1.0d;
        }
        double dM66816h42 = c14077m4Clone.m66816h4();
        return (c14084qq.m67158yj() == 1900 && c14084qq.m67129dy() == 3 && c14084qq.m67153x1() == 1) ? dM66816h42 + 1.0d : dM66816h42;
    }

    /* JADX INFO: renamed from: x1 */
    public static C12014ne m63763x1(C12014ne c12014ne) {
        return new C12014ne(c12014ne.m56669jd(), c12014ne.m56664ck(), c12014ne.m56663c5(), c12014ne.m56683x1());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int, java.lang.StringBuffer] */
    /* JADX INFO: renamed from: k4 */
    public static int m63753k4(double d) {
        return StringBuffer.append((int) d);
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m63764x1(kc0 kc0Var) {
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public kc0 Clone() {
        kc0 kc0Var = new kc0();
        CloneTo(kc0Var);
        return kc0Var;
    }

    /* JADX INFO: renamed from: k4 */
    public static C14084qq m63754k4(double d, boolean z) {
        if (d > 2958465.99d) {
            return C14084qq.f47293kk;
        }
        if (z) {
            d += 1462.0d;
        }
        if (d < 60.0d) {
            d += 1.0d;
        }
        return C14084qq.m67111m9(d);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63755k4(List<C13847mr> list, C13847mr c13847mr, C14787xi c14787xi, C14787xi c14787xi2) {
        if (c13847mr == null || ChartTypeCharacterizer.m758dy(c13847mr.m64945h4().getType()) || ChartTypeCharacterizer.m761jd(c13847mr.m64945h4().getType())) {
            return;
        }
        if (c14787xi.m73384dy() != null && c14787xi.m73384dy().isLogarithmic() && ChartTypeCharacterizer.isSeriesUsesXValueCoordinate(c13847mr.m64945h4().getType())) {
            for (int i = 0; i < list.size(); i++) {
                for (int i2 = 0; i2 < list.get_Item(i).m64944dy().size(); i2++) {
                    C0886d8 c0886d8 = list.get_Item(i).m64944dy().get_Item(i2);
                    if (c0886d8 != null) {
                        if (c0886d8.m5015x1() > 0.0d) {
                            c0886d8.m5016x1(C14116yg.m67476k4(c0886d8.m5015x1(), c14787xi.m73384dy().getLogBase()));
                        } else {
                            c0886d8.m5018x1(true);
                        }
                    }
                }
            }
        }
        if (c14787xi2.m73384dy() == null || !c14787xi2.m73384dy().isLogarithmic()) {
            return;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            for (int i4 = 0; i4 < list.get_Item(i3).m64944dy().size(); i4++) {
                C0886d8 c0886d82 = list.get_Item(i3).m64944dy().get_Item(i4);
                if (c0886d82 != null) {
                    if (c0886d82.m4989k4() > 0.0d) {
                        c0886d82.m4990k4(C14116yg.m67476k4(c0886d82.m4989k4(), c14787xi2.m73384dy().getLogBase()));
                    } else {
                        c0886d82.m5018x1(true);
                    }
                }
            }
        }
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(kc0 kc0Var) {
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m63756k4(C12014ne c12014ne) {
        return c12014ne.m56663c5() <= 0 || c12014ne.m56683x1() <= 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m63757k4(double[] dArr, double[] dArr2, List<C13847mr> list, int i, int i2, double d, double d2) {
        dArr2[0] = 0.0d;
        double d3 = dArr[0];
        if (d3 >= 0.0d) {
            if ((d3 > 0.0d && d <= 0.0d) || (d3 == 0.0d && d < 0.0d)) {
                dArr[0] = 0.0d;
                dArr2[0] = 0.0d;
                return false;
            }
            for (int i3 = 0; i3 < i; i3++) {
                C0886d8 c0886d8 = list.get_Item(i3).m64944dy().get_Item(i2);
                if (c0886d8 != null) {
                    double dM4989k4 = c0886d8.m4989k4();
                    if (dM4989k4 >= 0.0d) {
                        double d4 = dArr2[0];
                        if (d4 + dM4989k4 > d) {
                            dArr2[0] = d;
                            dArr[0] = 0.0d;
                            return false;
                        }
                        dArr2[0] = d4 + dM4989k4;
                    } else {
                        continue;
                    }
                }
            }
            double d5 = dArr[0];
            double d6 = dArr2[0];
            if (d5 + d6 <= d) {
                dArr2[0] = d6 + d5;
                return true;
            }
            dArr[0] = d - d6;
            dArr2[0] = d;
            return true;
        }
        if ((d3 < 0.0d && d2 >= 0.0d) || (d3 == 0.0d && d2 > 0.0d)) {
            dArr[0] = 0.0d;
            dArr2[0] = 0.0d;
            return false;
        }
        for (int i4 = 0; i4 < i; i4++) {
            C0886d8 c0886d82 = list.get_Item(i4).m64944dy().get_Item(i2);
            if (c0886d82 != null) {
                double dM4989k42 = c0886d82.m4989k4();
                if (dM4989k42 < 0.0d) {
                    double d7 = dArr2[0];
                    if (d7 + dM4989k42 < d2) {
                        dArr2[0] = d2;
                        dArr[0] = 0.0d;
                        return false;
                    }
                    dArr2[0] = d7 + dM4989k42;
                } else {
                    continue;
                }
            }
        }
        double d8 = dArr[0];
        double d9 = dArr2[0];
        if (d8 + d9 >= d2) {
            dArr2[0] = d9 + d8;
            return true;
        }
        dArr[0] = d2 - d9;
        dArr2[0] = d2;
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m63758k4(double[] dArr, double[] dArr2, List<C13847mr> list, int i, int i2, double d, C14787xi c14787xi) {
        return m63757k4(dArr, dArr2, list, i, i2, (c14787xi.m73389ix() * d) / 100.0d, (c14787xi.m73410ne() * d) / 100.0d);
    }
}
