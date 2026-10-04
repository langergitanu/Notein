package com.aspose.slides;

import Oooo0.C20856OooooOo;
import Oooo0oO.C21034OooOOOo;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.StyleIdentifier;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.pi */
/* JADX INFO: loaded from: classes3.dex */
class C14285pi extends AbstractC7020m9<C14285pi> {

    /* JADX INFO: renamed from: com.aspose.slides.pi$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: du */
        private double f48067du;

        /* JADX INFO: renamed from: k4 */
        private C0886d8 f48068k4;

        /* JADX INFO: renamed from: kk */
        private float f48069kk;

        /* JADX INFO: renamed from: to */
        private float f48070to;

        /* JADX INFO: renamed from: x1 */
        private float f48071x1;

        public k4(C0886d8 c0886d8, float f, float f2, float f3, double d) {
            this.f48068k4 = c0886d8;
            this.f48071x1 = f;
            this.f48069kk = f2;
            this.f48070to = f3;
            this.f48067du = d;
        }

        /* JADX INFO: renamed from: du */
        public final double m69094du() {
            return this.f48067du;
        }

        /* JADX INFO: renamed from: k4 */
        public final C0886d8 m69095k4() {
            return this.f48068k4;
        }

        /* JADX INFO: renamed from: kk */
        public final float m69096kk() {
            return this.f48069kk;
        }

        /* JADX INFO: renamed from: to */
        public final float m69097to() {
            return this.f48070to;
        }

        /* JADX INFO: renamed from: x1 */
        public final float m69098x1() {
            return this.f48071x1;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.pi$x1 */
    public static class x1 {

        /* JADX INFO: renamed from: k4 */
        private C0886d8 f48072k4;

        /* JADX INFO: renamed from: x1 */
        private C12025x6[] f48073x1;

        public x1(C0886d8 c0886d8, C12025x6[] c12025x6Arr) {
            this.f48072k4 = c0886d8;
            this.f48073x1 = c12025x6Arr;
        }

        /* JADX INFO: renamed from: k4 */
        public final C0886d8 m69099k4() {
            return this.f48072k4;
        }

        /* JADX INFO: renamed from: x1 */
        public final C12025x6[] m69100x1() {
            return this.f48073x1;
        }
    }

    /* JADX INFO: renamed from: du */
    private static void m69057du(float f, double d, C14365qy c14365qy) {
        int i;
        int i2;
        int iOooO00o;
        List<C13847mr> list;
        List<Integer> list2;
        int i3;
        C14787xi c14787xi;
        List<C0886d8> list3;
        int i4;
        int i5;
        int i6;
        List<C0886d8> list4;
        C14787xi c14787xi2;
        boolean z;
        int i7;
        List list5;
        int i8;
        float f2;
        List<Integer> list6;
        C14787xi c14787xi3;
        List<C13847mr> listM69865up = c14365qy.m69865up();
        C14787xi c14787xiM69854ne = c14365qy.m69854ne();
        C14787xi c14787xiM69863u4 = c14365qy.m69863u4();
        float fM69822ar = c14365qy.m69822ar() / 100.0f;
        float fOooO0O0 = (OooOO0O.OooO0O0(c14365qy.m69834fa(), 0) & 65535) / 100.0f;
        List list7 = new List();
        int baseUnitScale = c14787xiM69854ne.m73384dy().getBaseUnitScale();
        int iM73373ak = c14787xiM69854ne.m73373ak();
        int i9 = 1;
        boolean z2 = c14787xiM69854ne.m73375b3() || c14365qy.m69834fa().hasDataTable();
        float fM64121to = c14365qy.m69833e0().m64121to() / iM73373ak;
        float f3 = (fM69822ar * fM64121to) / (fOooO0O0 + 1.0f);
        List list8 = new List();
        List<Integer> listM72791k4 = C14743wm.m72791k4(c14365qy.m69871x1(), false);
        int size = listM72791k4.size();
        int i10 = 180;
        int i11 = 270;
        if ((c14365qy.m69877xk() < 0 || c14365qy.m69877xk() >= 90) && (c14365qy.m69877xk() < 180 || c14365qy.m69877xk() >= 270)) {
            List<Integer> list9 = listM72791k4;
            C14787xi c14787xi4 = c14787xiM69863u4;
            boolean z3 = z2;
            int iM69877xk = c14365qy.m69877xk();
            int i12 = StyleIdentifier.LIST_TABLE_4_ACCENT_5;
            if (iM69877xk < 90 || c14365qy.m69877xk() >= 180) {
                i = 270;
                if (c14365qy.m69877xk() < 270 || c14365qy.m69877xk() >= 360) {
                    return;
                }
            } else {
                i = 270;
            }
            int i13 = 0;
            while (i13 < listM69865up.size()) {
                if (c14365qy.m69877xk() < i || c14365qy.m69877xk() >= i12) {
                    i2 = 1;
                    iOooO00o = i13;
                } else {
                    i2 = 1;
                    iOooO00o = C20856OooooOo.OooO00o(1, i13, listM69865up);
                }
                if (c14365qy.m69868wl().m73384dy().isPlotOrderReversed()) {
                    iOooO00o = C20856OooooOo.OooO00o(i2, iOooO00o, listM69865up);
                }
                C13847mr c13847mr = listM69865up.get_Item(iOooO00o);
                int iM64963x1 = c13847mr.m64963x1();
                List<C0886d8> listM64944dy = c13847mr.m64944dy();
                int i14 = 0;
                while (i14 < size) {
                    int i15 = (c14365qy.m69877xk() < 270 || c14365qy.m69877xk() >= i12) ? i14 : (size - 1) - i14;
                    int i16 = iM64963x1;
                    float fM64124x1 = c14365qy.m69833e0().m64124x1() + (fM64121to * C0841c4.m4455k4(baseUnitScale, C0841c4.m4457k4(baseUnitScale, list9.get_Item(i15).intValue(), false), C7019kk.m27462to(Double.valueOf(c14787xiM69854ne.m73410ne()), 14), C7019kk.m27462to(Double.valueOf(c14787xiM69854ne.m73389ix()), 14), false));
                    if (z3) {
                        fM64124x1 += fM64121to / 2.0f;
                    }
                    if (c14787xiM69854ne.m73384dy().isPlotOrderReversed()) {
                        i15 = (size - 1) - i15;
                    }
                    int i17 = i15;
                    C0886d8 c0886d8 = listM64944dy.get_Item(i17);
                    if (c0886d8 == null || c0886d8.m4983dy()) {
                        list = listM69865up;
                        list2 = list9;
                        i3 = i16;
                        c14787xi = c14787xi4;
                        list3 = listM64944dy;
                        i4 = i14;
                    } else {
                        list2 = list9;
                        C14787xi c14787xi5 = c14787xi4;
                        List<C0886d8> list10 = listM64944dy;
                        float f4 = fM64124x1;
                        float fM73399kk = (((float) (d - c14787xi5.m73399kk(c0886d8.m4989k4()))) / ((float) (c14787xi5.m73389ix() - c14787xi5.m73410ne()))) * c14365qy.m69833e0().m64100du();
                        if (c14787xi5.m73384dy().isPlotOrderReversed()) {
                            fM73399kk = -fM73399kk;
                        }
                        c14787xi = c14787xi5;
                        i4 = i14;
                        list3 = list10;
                        i3 = i16;
                        list = listM69865up;
                        x1 x1Var = new x1(c0886d8, m69082k4(f, fM73399kk, f4, f3, i16 + 1, listM69865up.size(), c14365qy));
                        list8.addItem(x1Var);
                        list7.addItem(new C14319px(i3, i17, x1Var.m69100x1()[(c14365qy.m69877xk() < 90 || c14365qy.m69877xk() >= 270) ? (char) 0 : (char) 1].Clone()));
                    }
                    i14 = i4 + 1;
                    iM64963x1 = i3;
                    list9 = list2;
                    listM64944dy = list3;
                    c14787xi4 = c14787xi;
                    listM69865up = list;
                    i12 = StyleIdentifier.LIST_TABLE_4_ACCENT_5;
                }
                m69079k4(c14365qy, (List<x1>) list8);
                list8.clear();
                m69072k4((List<C14319px>) list7, c14365qy);
                list7.clear();
                i13++;
                i = 270;
                i12 = StyleIdentifier.LIST_TABLE_4_ACCENT_5;
            }
            return;
        }
        int i18 = 0;
        while (i18 < listM69865up.size()) {
            int iOooO00o2 = C20856OooooOo.OooO00o(i9, i18, listM69865up);
            if (c14365qy.m69877xk() < i10 || c14365qy.m69877xk() >= i11) {
                i5 = 1;
            } else {
                i5 = 1;
                iOooO00o2 = C20856OooooOo.OooO00o(1, iOooO00o2, listM69865up);
            }
            if (c14365qy.m69868wl().m73384dy().isPlotOrderReversed()) {
                iOooO00o2 = C20856OooooOo.OooO00o(i5, iOooO00o2, listM69865up);
            }
            C13847mr c13847mr2 = listM69865up.get_Item(iOooO00o2);
            int iM64963x12 = c13847mr2.m64963x1();
            List<C0886d8> listM64944dy2 = c13847mr2.m64944dy();
            int i19 = 0;
            while (i19 < size) {
                List list11 = list8;
                int i20 = (c14365qy.m69877xk() < i10 || c14365qy.m69877xk() >= 270) ? i19 : (size - 1) - i19;
                List<Integer> list12 = listM72791k4;
                int i21 = size;
                float fM64124x12 = c14365qy.m69833e0().m64124x1() + (C0841c4.m4455k4(baseUnitScale, C0841c4.m4457k4(baseUnitScale, listM72791k4.get_Item(r0).intValue(), false), C7019kk.m27462to(Double.valueOf(c14787xiM69854ne.m73410ne()), 14), C7019kk.m27462to(Double.valueOf(c14787xiM69854ne.m73389ix()), 14), false) * fM64121to);
                if (z2) {
                    fM64124x12 += fM64121to / 2.0f;
                }
                float f5 = fM64124x12;
                int i22 = c14787xiM69854ne.m73384dy().isPlotOrderReversed() ? (i21 - 1) - i20 : i20;
                C0886d8 c0886d82 = listM64944dy2.get_Item(i22);
                if (c0886d82 == null || c0886d82.m4983dy()) {
                    i6 = i18;
                    list4 = listM64944dy2;
                    c14787xi2 = c14787xiM69854ne;
                    z = z2;
                    i7 = i21;
                    list5 = list11;
                    i8 = i19;
                    f2 = fM64121to;
                    list6 = list12;
                    c14787xi3 = c14787xiM69863u4;
                    list5.addItem(null);
                } else {
                    int i23 = i22;
                    float fM73399kk2 = (((float) (d - c14787xiM69863u4.m73399kk(c0886d82.m4989k4()))) / ((float) (c14787xiM69863u4.m73389ix() - c14787xiM69863u4.m73410ne()))) * c14365qy.m69833e0().m64100du();
                    if (c14787xiM69863u4.m73384dy().isPlotOrderReversed()) {
                        fM73399kk2 = -fM73399kk2;
                    }
                    i6 = i18;
                    list4 = listM64944dy2;
                    c14787xi2 = c14787xiM69854ne;
                    z = z2;
                    i7 = i21;
                    list5 = list11;
                    i8 = i19;
                    f2 = fM64121to;
                    list6 = list12;
                    c14787xi3 = c14787xiM69863u4;
                    x1 x1Var2 = new x1(c0886d82, m69082k4(f, fM73399kk2, f5, f3, iM64963x12 + 1, listM69865up.size(), c14365qy));
                    list5.addItem(x1Var2);
                    list7.addItem(new C14319px(iM64963x12, i23, x1Var2.m69100x1()[(c14365qy.m69877xk() < 90 || c14365qy.m69877xk() >= 270) ? (char) 0 : (char) 1].Clone()));
                }
                listM72791k4 = list6;
                size = i7;
                z2 = z;
                fM64121to = f2;
                c14787xiM69863u4 = c14787xi3;
                i18 = i6;
                listM64944dy2 = list4;
                i10 = 180;
                i19 = i8 + 1;
                list8 = list5;
                c14787xiM69854ne = c14787xi2;
            }
            C14787xi c14787xi6 = c14787xiM69854ne;
            List list13 = list8;
            m69079k4(c14365qy, (List<x1>) list13);
            list13.clear();
            m69072k4((List<C14319px>) list7, c14365qy);
            list7.clear();
            i18++;
            z2 = z2;
            c14787xiM69854ne = c14787xi6;
            i10 = 180;
            i11 = 270;
            i9 = 1;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static double m69058k4(C0886d8 c0886d8, C14365qy c14365qy) {
        double d;
        double d2;
        double dM73412rv = c14365qy.m69863u4().m73412rv();
        List<C13847mr> listM69865up = c14365qy.m69865up();
        double d3 = 0.0d;
        double d4 = 0.0d;
        for (int i = 0; i < c0886d8.m5012up().m64944dy().size(); i++) {
            for (int i2 = 0; i2 < listM69865up.size(); i2++) {
                C0886d8 c0886d82 = listM69865up.get_Item(i2).m64944dy().get_Item(i);
                if (c0886d82 != null) {
                    double dM4989k4 = c0886d82.m4989k4();
                    if (dM4989k4 > dM73412rv) {
                        double d5 = dM4989k4 - dM73412rv;
                        if (d4 < d5) {
                            d4 = d5;
                        }
                    }
                    if (dM4989k4 < dM73412rv) {
                        double d6 = dM73412rv - dM4989k4;
                        if (d3 < d6) {
                            d3 = d6;
                        }
                    }
                }
            }
        }
        double dM73399kk = c14365qy.m69863u4().m73399kk(c0886d8.m4989k4());
        if (c0886d8.m4989k4() < dM73412rv) {
            d = dM73399kk;
            if (d3 == 0.0d) {
                return 1.0d;
            }
            d2 = d3;
        } else {
            if (d4 == 0.0d) {
                return 1.0d;
            }
            d3 = d4;
            d = dM73412rv;
            dM73412rv = dM73399kk;
            d2 = d4;
        }
        return C22206OooOOo0.OooO00o(dM73412rv, d, d2, d3);
    }

    /* JADX INFO: renamed from: kk */
    public static void m69083kk(float f, double d, int i, C14365qy c14365qy) {
        int i2;
        int i3;
        int i4;
        int iOooO00o;
        int i5;
        List<C0886d8> list;
        int i6;
        int i7;
        int i8;
        int i9;
        List<C0886d8> list2;
        C14787xi c14787xi;
        int i10;
        List list3;
        double dM73391k4 = d;
        int i11 = i;
        List<C13847mr> listM69865up = c14365qy.m69865up();
        C14787xi c14787xiM69854ne = c14365qy.m69854ne();
        C14787xi c14787xiM69863u4 = c14365qy.m69863u4();
        int i12 = 1;
        if (c14365qy.m69854ne().m73384dy().getCategoryAxisType() == 1) {
            m69057du(f, dM73391k4, c14365qy);
            return;
        }
        float fM69822ar = c14365qy.m69822ar() / 100.0f;
        float fOooO0O0 = (OooOO0O.OooO0O0(c14365qy.m69834fa(), 0) & 65535) / 100.0f;
        List list4 = new List();
        double dM73432yj = c14787xiM69863u4.m73432yj();
        double dM73405ks = c14787xiM69863u4.m73405ks();
        if (c14787xiM69863u4.m73384dy().isLogarithmic()) {
            dM73391k4 = c14787xiM69863u4.m73391k4(dM73391k4);
        }
        boolean z = c14787xiM69854ne.m73375b3() || c14365qy.m69834fa().hasDataTable();
        if (z) {
            i2 = i11;
        } else {
            i2 = i11 - 1;
            if (i2 == 0) {
                i2 = 1;
            }
        }
        float fM64121to = c14365qy.m69833e0().m64121to() / i2;
        float f2 = (fM69822ar * fM64121to) / (fOooO0O0 + 1.0f);
        List list5 = new List();
        int i13 = 180;
        int i14 = 270;
        if ((c14365qy.m69877xk() >= 0 && c14365qy.m69877xk() < 90) || (c14365qy.m69877xk() >= 180 && c14365qy.m69877xk() < 270)) {
            int i15 = 0;
            while (i15 < listM69865up.size()) {
                int iOooO00o2 = C20856OooooOo.OooO00o(i12, i15, listM69865up);
                if (c14365qy.m69877xk() < i13 || c14365qy.m69877xk() >= i14) {
                    i8 = 1;
                } else {
                    i8 = 1;
                    iOooO00o2 = C20856OooooOo.OooO00o(1, iOooO00o2, listM69865up);
                }
                if (c14365qy.m69868wl().m73384dy().isPlotOrderReversed()) {
                    iOooO00o2 = C20856OooooOo.OooO00o(i8, iOooO00o2, listM69865up);
                }
                C13847mr c13847mr = listM69865up.get_Item(iOooO00o2);
                int iM64963x1 = c13847mr.m64963x1();
                List<C0886d8> listM64944dy = c13847mr.m64944dy();
                int i16 = 0;
                while (true) {
                    double d2 = dM73391k4;
                    if (i16 < i11) {
                        int i17 = (c14365qy.m69877xk() < i13 || c14365qy.m69877xk() >= 270) ? i16 : (i11 - 1) - i16;
                        float fM64124x1 = c14365qy.m69833e0().m64124x1() + (i17 * fM64121to);
                        if (z) {
                            fM64124x1 = (fM64121to / 2.0f) + fM64124x1;
                        }
                        if (c14787xiM69854ne.m73384dy().isPlotOrderReversed()) {
                            i17 = (i11 - 1) - i17;
                        }
                        C0886d8 c0886d8 = listM64944dy.get_Item(i17);
                        if (c0886d8 == null || c0886d8.m4983dy()) {
                            i9 = i15;
                            list2 = listM64944dy;
                            c14787xi = c14787xiM69854ne;
                            i10 = i16;
                            list3 = list5;
                            list3.addItem(null);
                        } else {
                            List<C0886d8> list6 = listM64944dy;
                            List list7 = list5;
                            float fM73399kk = (((float) (d2 - c14787xiM69863u4.m73399kk(c0886d8.m4989k4()))) / ((float) (dM73432yj - dM73405ks))) * c14365qy.m69833e0().m64100du();
                            if (c14787xiM69863u4.m73384dy().isPlotOrderReversed()) {
                                fM73399kk = -fM73399kk;
                            }
                            c14787xi = c14787xiM69854ne;
                            list3 = list7;
                            list2 = list6;
                            i9 = i15;
                            float f3 = fM64124x1;
                            i10 = i16;
                            x1 x1Var = new x1(c0886d8, m69082k4(f, fM73399kk, f3, f2, iM64963x1 + 1, listM69865up.size(), c14365qy));
                            list3.addItem(x1Var);
                            list4.addItem(new C14319px(iM64963x1, i17, x1Var.m69100x1()[(c14365qy.m69877xk() < 90 || c14365qy.m69877xk() >= 270) ? (char) 0 : (char) 1].Clone()));
                        }
                        i16 = i10 + 1;
                        list5 = list3;
                        dM73391k4 = d2;
                        i15 = i9;
                        listM64944dy = list2;
                        c14787xiM69854ne = c14787xi;
                        i13 = 180;
                    }
                }
                C14787xi c14787xi2 = c14787xiM69854ne;
                List list8 = list5;
                m69079k4(c14365qy, (List<x1>) list8);
                list8.clear();
                m69072k4((List<C14319px>) list4, c14365qy);
                list4.clear();
                i15++;
                c14787xiM69854ne = c14787xi2;
                i13 = 180;
                i12 = 1;
                i14 = 270;
            }
            return;
        }
        double d3 = dM73391k4;
        int iM69877xk = c14365qy.m69877xk();
        int i18 = StyleIdentifier.LIST_TABLE_4_ACCENT_5;
        if (iM69877xk < 90 || c14365qy.m69877xk() >= 180) {
            i3 = 270;
            if (c14365qy.m69877xk() < 270 || c14365qy.m69877xk() >= 360) {
                return;
            }
        } else {
            i3 = 270;
        }
        int i19 = 0;
        while (i19 < listM69865up.size()) {
            if (c14365qy.m69877xk() < i3 || c14365qy.m69877xk() >= i18) {
                i4 = 1;
                iOooO00o = i19;
            } else {
                i4 = 1;
                iOooO00o = C20856OooooOo.OooO00o(1, i19, listM69865up);
            }
            if (c14365qy.m69868wl().m73384dy().isPlotOrderReversed()) {
                iOooO00o = C20856OooooOo.OooO00o(i4, iOooO00o, listM69865up);
            }
            C13847mr c13847mr2 = listM69865up.get_Item(iOooO00o);
            int iM64963x12 = c13847mr2.m64963x1();
            List<C0886d8> listM64944dy2 = c13847mr2.m64944dy();
            int i20 = 0;
            while (i20 < i11) {
                int i21 = (c14365qy.m69877xk() < 270 || c14365qy.m69877xk() >= i18) ? i20 : (i11 - 1) - i20;
                float fM64124x12 = c14365qy.m69833e0().m64124x1() + (i21 * fM64121to);
                if (z) {
                    fM64124x12 += fM64121to / 2.0f;
                }
                if (c14787xiM69854ne.m73384dy().isPlotOrderReversed()) {
                    i21 = (i11 - 1) - i21;
                }
                C0886d8 c0886d82 = listM64944dy2.get_Item(i21);
                if (c0886d82 == null || c0886d82.m4983dy()) {
                    i5 = i19;
                    list = listM64944dy2;
                    i6 = iM64963x12;
                    i7 = i20;
                } else {
                    i6 = iM64963x12;
                    float fM73399kk2 = (((float) (d3 - c14787xiM69863u4.m73399kk(c0886d82.m4989k4()))) / ((float) (c14787xiM69863u4.m73389ix() - c14787xiM69863u4.m73410ne()))) * c14365qy.m69833e0().m64100du();
                    if (c14787xiM69863u4.m73384dy().isPlotOrderReversed()) {
                        fM73399kk2 = -fM73399kk2;
                    }
                    int i22 = i21;
                    i5 = i19;
                    i7 = i20;
                    list = listM64944dy2;
                    x1 x1Var2 = new x1(c0886d82, m69082k4(f, fM73399kk2, fM64124x12, f2, i6 + 1, listM69865up.size(), c14365qy));
                    list5.addItem(x1Var2);
                    list4.addItem(new C14319px(i6, i22, x1Var2.m69100x1()[(c14365qy.m69877xk() < 90 || c14365qy.m69877xk() >= 270) ? (char) 0 : (char) 1].Clone()));
                }
                i20 = i7 + 1;
                iM64963x12 = i6;
                i19 = i5;
                listM64944dy2 = list;
                i18 = StyleIdentifier.LIST_TABLE_4_ACCENT_5;
                i11 = i;
            }
            m69079k4(c14365qy, (List<x1>) list5);
            list5.clear();
            m69072k4((List<C14319px>) list4, c14365qy);
            list4.clear();
            i19++;
            i11 = i;
            i3 = 270;
            i18 = StyleIdentifier.LIST_TABLE_4_ACCENT_5;
        }
    }

    /* JADX INFO: renamed from: to */
    private static void m69085to(float f, double d, C14365qy c14365qy) {
        int i;
        int i2;
        int i3;
        int iOooO00o;
        List<C13847mr> list;
        int i4;
        List list2;
        int i5;
        int i6;
        boolean z;
        int i7;
        C14787xi c14787xi;
        int i8;
        int i9;
        float f2;
        C14787xi c14787xi2;
        C14787xi c14787xi3;
        int i10;
        int i11;
        List list3;
        List<Integer> list4;
        int i12;
        int i13;
        List<C0886d8> list5;
        double d2 = d;
        List<C13847mr> listM69865up = c14365qy.m69865up();
        C14787xi c14787xiM69854ne = c14365qy.m69854ne();
        C14787xi c14787xiM69863u4 = c14365qy.m69863u4();
        C14787xi c14787xiM69868wl = c14365qy.m69868wl();
        float gapWidth = (65535 & c14365qy.m69834fa().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth()) / 100.0f;
        List list6 = new List();
        int iM27462to = C7019kk.m27462to(Double.valueOf(c14787xiM69854ne.m73389ix()), 14);
        int iM27462to2 = C7019kk.m27462to(Double.valueOf(c14787xiM69854ne.m73410ne()), 14);
        int baseUnitScale = c14787xiM69854ne.m73384dy().getBaseUnitScale();
        float fM64121to = c14365qy.m69833e0().m64121to() / (C0841c4.m4455k4(baseUnitScale, iM27462to, iM27462to2, iM27462to, false) + 1);
        float f3 = fM64121to / (gapWidth + 1.0f);
        float f4 = f3 * gapWidth;
        float fM69822ar = ((c14365qy.m69822ar() / 100.0f) * fM64121to) / (((OooOO0O.OooO0O0(c14365qy.m69834fa(), 0) & 65535) / 100.0f) + 1.0f);
        List<Integer> listM72791k4 = C14743wm.m72791k4(c14365qy.m69871x1(), false);
        int size = listM72791k4.size();
        int i14 = baseUnitScale;
        int i15 = 270;
        if (c14365qy.m69877xk() < 0 || c14365qy.m69877xk() >= 90) {
            i = 180;
            if (c14365qy.m69877xk() < 180 || c14365qy.m69877xk() >= 270) {
                float f5 = f3;
                int i16 = i14;
                C14365qy c14365qy2 = c14365qy;
                List list7 = list6;
                int iM69877xk = c14365qy2.m69877xk();
                int i17 = StyleIdentifier.LIST_TABLE_4_ACCENT_5;
                if (iM69877xk < 90 || c14365qy2.m69877xk() >= 180) {
                    i2 = 270;
                    if (c14365qy2.m69877xk() < 270 || c14365qy2.m69877xk() >= 360) {
                        return;
                    }
                } else {
                    i2 = 270;
                }
                int i18 = 0;
                while (i18 < size) {
                    int i19 = (c14365qy2.m69877xk() < i2 || c14365qy2.m69877xk() >= i17) ? i18 : (size - 1) - i18;
                    boolean z2 = false;
                    float fM64124x1 = c14365qy2.m69833e0().m64124x1() + (C0841c4.m4455k4(i16, C0841c4.m4457k4(i16, listM72791k4.get_Item(i19).intValue(), false), C7019kk.m27462to(Double.valueOf(c14787xiM69854ne.m73410ne()), 14), C7019kk.m27462to(Double.valueOf(c14787xiM69854ne.m73389ix()), 14), false) * fM64121to) + (f4 / 2.0f);
                    int i20 = 0;
                    while (i20 < listM69865up.size()) {
                        if (c14365qy2.m69877xk() < 270 || c14365qy2.m69877xk() >= 360) {
                            i3 = 1;
                            iOooO00o = i20;
                        } else {
                            i3 = 1;
                            iOooO00o = C20856OooooOo.OooO00o(1, i20, listM69865up);
                        }
                        if (c14787xiM69868wl.m73384dy().isPlotOrderReversed()) {
                            iOooO00o = C20856OooooOo.OooO00o(i3, iOooO00o, listM69865up);
                        }
                        C13847mr c13847mr = listM69865up.get_Item(iOooO00o);
                        int i21 = i20;
                        int iM64963x1 = c13847mr.m64963x1();
                        List<C0886d8> listM64944dy = c13847mr.m64944dy();
                        if (c14787xiM69854ne.m73384dy().isPlotOrderReversed()) {
                            list = listM69865up;
                            i4 = (size - 1) - i19;
                        } else {
                            list = listM69865up;
                            i4 = i19;
                        }
                        C0886d8 c0886d8 = listM64944dy.get_Item(i4);
                        if (c0886d8 == null || c0886d8.m4983dy()) {
                            list2 = list7;
                            i5 = i18;
                            i6 = i19;
                            z = z2;
                            i7 = i16;
                            c14787xi = c14787xiM69863u4;
                        } else {
                            i7 = i16;
                            c14787xi = c14787xiM69863u4;
                            List list8 = list7;
                            float fM63750k4 = (((float) kc0.m63750k4(d, c14787xiM69863u4.m73399kk(c0886d8.m4989k4()))) / ((float) (c14787xi.m73389ix() - c14787xi.m73410ne()))) * c14365qy2.m69833e0().m64100du();
                            if (c14787xi.m73384dy().isPlotOrderReversed()) {
                                fM63750k4 = -fM63750k4;
                            }
                            float f6 = fM69822ar;
                            float f7 = f5;
                            float f8 = fM64124x1;
                            float f9 = fM63750k4;
                            int i22 = iM64963x1 + 1;
                            list2 = list8;
                            z = false;
                            i6 = i19;
                            i5 = i18;
                            m69075k4(c0886d8, f, f9, f8, f7, f6, i22, list.size(), c14365qy2);
                            fM64124x1 = f8;
                            f5 = f7;
                            fM69822ar = f6;
                            boolean z3 = kc0.m63750k4((double) f9, 0.0d) < 0.0d;
                            c14365qy2 = c14365qy;
                            C12025x6 c12025x6Clone = m69061k4(f, f9, fM64124x1, f5, fM69822ar, i22, list.size(), z3, c14365qy2).Clone();
                            list2.clear();
                            list2.addItem(new C14319px(iM64963x1, i4, c12025x6Clone.Clone(), z3));
                            m69072k4((List<C14319px>) list2, c14365qy2);
                        }
                        i20 = i21 + 1;
                        list7 = list2;
                        listM69865up = list;
                        z2 = z;
                        c14787xiM69863u4 = c14787xi;
                        i16 = i7;
                        i18 = i5;
                        i19 = i6;
                    }
                    i18++;
                    i17 = 360;
                    c14787xiM69863u4 = c14787xiM69863u4;
                    i16 = i16;
                    i2 = 270;
                }
                return;
            }
        } else {
            i = 180;
        }
        int i23 = 0;
        while (i23 < listM69865up.size()) {
            int iOooO00o2 = C20856OooooOo.OooO00o(1, i23, listM69865up);
            if (c14365qy.m69877xk() < i || c14365qy.m69877xk() >= i15) {
                i8 = 1;
            } else {
                i8 = 1;
                iOooO00o2 = C20856OooooOo.OooO00o(1, iOooO00o2, listM69865up);
            }
            if (c14787xiM69868wl.m73384dy().isPlotOrderReversed()) {
                iOooO00o2 = C20856OooooOo.OooO00o(i8, iOooO00o2, listM69865up);
            }
            C13847mr c13847mr2 = listM69865up.get_Item(iOooO00o2);
            int iM64963x12 = c13847mr2.m64963x1();
            List<C0886d8> listM64944dy2 = c13847mr2.m64944dy();
            int i24 = 0;
            while (i24 < size) {
                List list9 = list6;
                int i25 = i14;
                int i26 = (c14365qy.m69877xk() < 180 || c14365qy.m69877xk() >= 270) ? i24 : (size - 1) - i24;
                List<Integer> list10 = listM72791k4;
                int i27 = size;
                int i28 = i23;
                float fM64124x12 = c14365qy.m69833e0().m64124x1() + (C0841c4.m4455k4(i25, C0841c4.m4457k4(i25, listM72791k4.get_Item(r3).intValue(), false), C7019kk.m27462to(Double.valueOf(c14787xiM69854ne.m73410ne()), 14), C7019kk.m27462to(Double.valueOf(c14787xiM69854ne.m73389ix()), 14), false) * fM64121to) + (f4 / 2.0f);
                int i29 = c14787xiM69854ne.m73384dy().isPlotOrderReversed() ? (i27 - 1) - i26 : i26;
                C0886d8 c0886d82 = listM64944dy2.get_Item(i29);
                if (c0886d82 == null || c0886d82.m4983dy()) {
                    i9 = iM64963x12;
                    f2 = f3;
                    c14787xi2 = c14787xiM69854ne;
                    c14787xi3 = c14787xiM69868wl;
                    i10 = i24;
                    i11 = i28;
                    list3 = list9;
                    list4 = list10;
                    i12 = i27;
                    i13 = i25;
                    list5 = listM64944dy2;
                } else {
                    int i30 = i29;
                    float fM63750k42 = (((float) kc0.m63750k4(d2, c14787xiM69863u4.m73399kk(c0886d82.m4989k4()))) / ((float) (c14787xiM69863u4.m73389ix() - c14787xiM69863u4.m73410ne()))) * c14365qy.m69833e0().m64100du();
                    if (c14787xiM69863u4.m73384dy().isPlotOrderReversed()) {
                        fM63750k42 = -fM63750k42;
                    }
                    float f10 = fM63750k42;
                    List<C0886d8> list11 = listM64944dy2;
                    int i31 = iM64963x12 + 1;
                    int i32 = iM64963x12;
                    c14787xi2 = c14787xiM69854ne;
                    i10 = i24;
                    i11 = i28;
                    i13 = i25;
                    i12 = i27;
                    float f11 = fM69822ar;
                    float f12 = f3;
                    c14787xi3 = c14787xiM69868wl;
                    list4 = list10;
                    list5 = list11;
                    m69075k4(c0886d82, f, f10, fM64124x12, f12, f11, i31, listM69865up.size(), c14365qy);
                    f2 = f12;
                    fM69822ar = f11;
                    boolean z4 = kc0.m63750k4((double) f10, 0.0d) < 0.0d;
                    C12025x6 c12025x6Clone2 = m69061k4(f, f10, fM64124x12, f2, fM69822ar, i31, listM69865up.size(), z4, c14365qy).Clone();
                    list9.clear();
                    i9 = i32;
                    C14319px c14319px = new C14319px(i9, i30, c12025x6Clone2.Clone(), z4);
                    list3 = list9;
                    list3.addItem(c14319px);
                    m69072k4((List<C14319px>) list3, c14365qy);
                }
                d2 = d;
                iM64963x12 = i9;
                f3 = f2;
                size = i12;
                i23 = i11;
                listM64944dy2 = list5;
                i24 = i10 + 1;
                list6 = list3;
                listM72791k4 = list4;
                c14787xiM69868wl = c14787xi3;
                i14 = i13;
                c14787xiM69854ne = c14787xi2;
            }
            C14787xi c14787xi4 = c14787xiM69854ne;
            int i33 = i14;
            d2 = d;
            f3 = f3;
            i = 180;
            i15 = 270;
            i23++;
            list6 = list6;
            listM72791k4 = listM72791k4;
            c14787xiM69868wl = c14787xiM69868wl;
            i14 = i33;
            c14787xiM69854ne = c14787xi4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x011d  */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m69086x1(double d, int i, C14365qy c14365qy) {
        float fM64114kk;
        double dM73410ne;
        List list;
        int i2;
        int i3;
        int i4;
        List<C13847mr> list2;
        int i5;
        C14787xi c14787xi;
        float f;
        int i6;
        int i7;
        float f2;
        List list3;
        float f3;
        float f4;
        int i8 = i;
        C14365qy c14365qy2 = c14365qy;
        int i9 = 0;
        int i10 = 1;
        List<C13847mr> listM69865up = c14365qy2.m69865up();
        C14787xi c14787xiM69854ne = c14365qy2.m69854ne();
        C14787xi c14787xiM69863u4 = c14365qy2.m69863u4();
        if (c14365qy2.m69863u4().m73384dy().isPlotOrderReversed()) {
            fM64114kk = c14365qy2.m69833e0().m64114kk();
            dM73410ne = c14787xiM69863u4.m73389ix();
        } else {
            fM64114kk = c14365qy2.m69833e0().m64114kk();
            dM73410ne = c14787xiM69863u4.m73410ne();
        }
        float fM67475k4 = fM64114kk - (((float) C14116yg.m67475k4(dM73410ne / ((double) ((float) (c14787xiM69863u4.m73389ix() - c14787xiM69863u4.m73410ne()))))) * c14365qy2.m69833e0().m64100du());
        if (c14365qy2.m69854ne().m73384dy().getCategoryAxisType() == 1) {
            m69084kk(fM67475k4, d, c14365qy2);
            return;
        }
        List list4 = new List();
        float fM64121to = c14365qy2.m69833e0().m64121to() / i8;
        float fM64110k4 = c14365qy2.m69833e0().m64110k4(false, i8, 1);
        float fM64102dy = c14365qy2.m69833e0().m64102dy();
        float gapWidth = ((c14365qy2.m69834fa().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth() & 65535) * fM64110k4) / 100.0f;
        int i11 = 0;
        while (i11 < i8) {
            int i12 = c14365qy2.m69877xk() > 180 ? (i8 - 1) - i11 : i11;
            float fM64124x1 = (gapWidth / 2.0f) + (i12 * fM64121to) + c14365qy2.m69833e0().m64124x1();
            List list5 = new List();
            int i13 = i9;
            while (i13 < listM69865up.size()) {
                C13847mr c13847mr = listM69865up.get_Item(i13);
                int iM64963x1 = c13847mr.m64963x1();
                List<C0886d8> listM64944dy = c13847mr.m64944dy();
                if (c14787xiM69854ne.m73384dy().isPlotOrderReversed()) {
                    list = list5;
                    i2 = (i8 - 1) - i12;
                } else {
                    list = list5;
                    i2 = i12;
                }
                C0886d8 c0886d8 = listM64944dy.get_Item(i2);
                if (c0886d8 == null || c0886d8.m4983dy()) {
                    i3 = i11;
                    i4 = i12;
                    list2 = listM69865up;
                    i5 = i13;
                    c14787xi = c14787xiM69863u4;
                    f = fM64110k4;
                    i6 = i9;
                    i7 = i10;
                    f2 = fM64102dy;
                    list3 = list;
                    f3 = fM64124x1;
                } else {
                    double dM63751k4 = kc0.m63751k4(listM69865up, i2);
                    if (dM63751k4 != 0.0d) {
                        double dM4989k4 = c0886d8.m4989k4();
                        int i14 = i11;
                        double[] dArr = new double[i10];
                        dArr[i9] = dM4989k4;
                        int i15 = i12;
                        double[] dArr2 = new double[i10];
                        dArr2[i9] = dM4989k4;
                        i6 = i9;
                        i7 = i10;
                        list3 = list;
                        i4 = i15;
                        i3 = i14;
                        boolean zM63758k4 = kc0.m63758k4(dArr, dArr2, listM69865up, i13, i2, dM63751k4, c14787xiM69863u4);
                        list2 = listM69865up;
                        c14787xi = c14787xiM69863u4;
                        i5 = i13;
                        int i16 = i2;
                        double d2 = dArr[i6];
                        double d3 = dArr2[i6];
                        if (zM63758k4) {
                            float f5 = (float) dM63751k4;
                            float fM73389ix = (((((float) d2) * 100.0f) / f5) / ((float) (c14787xi.m73389ix() - c14787xi.m73410ne()))) * c14365qy.m69833e0().m64100du();
                            float fM73389ix2 = ((((((float) d3) * 100.0f) / f5) / ((float) (c14787xi.m73389ix() - c14787xi.m73410ne()))) * c14365qy.m69833e0().m64100du()) - fM73389ix;
                            if (c14787xi.m73384dy().isPlotOrderReversed()) {
                                f4 = fM73389ix2 + fM67475k4;
                            } else {
                                f4 = fM67475k4 - fM73389ix2;
                                fM73389ix = -fM73389ix;
                            }
                            float f6 = f4;
                            f3 = fM64124x1;
                            m69066k4(d2, new k4(c0886d8, fM64124x1, f6, fM73389ix, d3), (List<k4>) list3, c14787xi);
                            f = fM64110k4;
                            f2 = fM64102dy;
                            list4.addItem(new C14319px(iM64963x1, i16, m69062k4(c14365qy, f3, f, f2, f6, fM73389ix).Clone().Clone()));
                        } else {
                            f = fM64110k4;
                            f2 = fM64102dy;
                        }
                    }
                    f3 = fM64124x1;
                }
                i13 = i5 + 1;
                i8 = i;
                fM64124x1 = f3;
                fM64110k4 = f;
                fM64102dy = f2;
                c14787xiM69863u4 = c14787xi;
                list5 = list3;
                i11 = i3;
                i12 = i4;
                i9 = i6;
                i10 = i7;
                listM69865up = list2;
            }
            int i17 = i11;
            List<C13847mr> list6 = listM69865up;
            C14787xi c14787xi2 = c14787xiM69863u4;
            float f7 = fM64110k4;
            int i18 = i9;
            int i19 = i10;
            float f8 = fM64102dy;
            List list7 = list5;
            double d4 = 1.0d;
            int i20 = i18;
            while (i20 < list7.size()) {
                k4 k4Var = (k4) list7.get_Item(i20);
                double[] dArr3 = new double[i19];
                dArr3[i18] = d4;
                m69073k4(k4Var.m69095k4(), k4Var.m69098x1(), f7, f8, k4Var.m69096kk(), k4Var.m69097to(), k4Var.m69094du(), dArr3, c14365qy);
                i20++;
                c14787xi2 = c14787xi2;
                d4 = dArr3[i18];
            }
            c14365qy2 = c14365qy;
            list7.clear();
            m69072k4((List<C14319px>) list4, c14365qy2);
            list4.clear();
            i11 = i17 + 1;
            c14787xiM69863u4 = c14787xi2;
            fM64110k4 = f7;
            fM64102dy = f8;
            i9 = i18;
            i10 = i19;
            listM69865up = list6;
            i8 = i;
        }
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
        if (obj instanceof C14285pi) {
            return m69091x1((C14285pi) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private static float m69059k4(float f, boolean z, float f2, float f3) {
        return z ? f - ((1.0f - f3) * f2) : OooOO0.OooO0OO.OooO0O0(1.0f, f3, f2, f);
    }

    /* JADX INFO: renamed from: x1 */
    public static void m69087x1(float f, double d, int i, C14365qy c14365qy) {
        int i2;
        int i3;
        int i4;
        int iOooO00o;
        float f2;
        int i5;
        int i6;
        int i7;
        int i8;
        List<C13847mr> list;
        C14787xi c14787xi;
        long j;
        int i9;
        int i10;
        int i11;
        List list2;
        List<C0886d8> list3;
        int i12;
        int i13;
        float f3;
        double d2 = d;
        int i14 = i;
        C14365qy c14365qy2 = c14365qy;
        List<C13847mr> listM69865up = c14365qy2.m69865up();
        C14787xi c14787xiM69854ne = c14365qy2.m69854ne();
        C14787xi c14787xiM69863u4 = c14365qy2.m69863u4();
        if (c14365qy2.m69854ne().m73384dy().getCategoryAxisType() == 1) {
            m69085to(f, d2, c14365qy2);
            return;
        }
        float gapWidth = (65535 & c14365qy2.m69834fa().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth()) / 100.0f;
        List list4 = new List();
        float fM64121to = c14365qy2.m69833e0().m64121to() / i14;
        float f4 = fM64121to / (gapWidth + 1.0f);
        float f5 = f4 * gapWidth;
        float fM69822ar = ((c14365qy2.m69822ar() / 100.0f) * fM64121to) / (((OooOO0O.OooO0O0(c14365qy2.m69834fa(), 0) & 65535) / 100.0f) + 1.0f);
        int i15 = 270;
        if (c14365qy2.m69877xk() < 0 || c14365qy2.m69877xk() >= 90) {
            i2 = 180;
            if (c14365qy2.m69877xk() < 180 || c14365qy2.m69877xk() >= 270) {
                float f6 = f4;
                long j2 = 0;
                int iM69877xk = c14365qy2.m69877xk();
                int i16 = StyleIdentifier.LIST_TABLE_4_ACCENT_5;
                if (iM69877xk < 90 || c14365qy2.m69877xk() >= 180) {
                    i3 = 270;
                    if (c14365qy2.m69877xk() < 270 || c14365qy2.m69877xk() >= 360) {
                        return;
                    }
                } else {
                    i3 = 270;
                }
                int i17 = 0;
                while (i17 < i14) {
                    int i18 = (c14365qy2.m69877xk() < i3 || c14365qy2.m69877xk() >= i16) ? i17 : (i14 - 1) - i17;
                    int i19 = 0;
                    while (i19 < listM69865up.size()) {
                        if (c14365qy2.m69877xk() < 270 || c14365qy2.m69877xk() >= i16) {
                            i4 = 1;
                            iOooO00o = i19;
                        } else {
                            i4 = 1;
                            iOooO00o = C20856OooooOo.OooO00o(1, i19, listM69865up);
                        }
                        if (c14365qy2.m69868wl().m73384dy().isPlotOrderReversed()) {
                            iOooO00o = C20856OooooOo.OooO00o(i4, iOooO00o, listM69865up);
                        }
                        C13847mr c13847mr = listM69865up.get_Item(iOooO00o);
                        int iM64963x1 = c13847mr.m64963x1();
                        float fM64124x1 = c14365qy2.m69833e0().m64124x1() + (f5 / 2.0f) + (i18 * fM64121to);
                        List<C0886d8> listM64944dy = c13847mr.m64944dy();
                        if (c14787xiM69854ne.m73384dy().isPlotOrderReversed()) {
                            f2 = fM64124x1;
                            i5 = (i14 - 1) - i18;
                        } else {
                            f2 = fM64124x1;
                            i5 = i18;
                        }
                        C0886d8 c0886d8 = listM64944dy.get_Item(i5);
                        if (c0886d8 == null || c0886d8.m4983dy()) {
                            i6 = i17;
                            i7 = i18;
                            i8 = i19;
                            list = listM69865up;
                            c14787xi = c14787xiM69854ne;
                            j = 0;
                            i9 = StyleIdentifier.LIST_TABLE_4_ACCENT_5;
                        } else {
                            list = listM69865up;
                            c14787xi = c14787xiM69854ne;
                            int i20 = i17;
                            float fM63750k4 = (((float) kc0.m63750k4(d, c14787xiM69863u4.m73399kk(c0886d8.m4989k4()))) / ((float) (c14787xiM69863u4.m73389ix() - c14787xiM69863u4.m73410ne()))) * c14365qy2.m69833e0().m64100du();
                            if (c14787xiM69863u4.m73384dy().isPlotOrderReversed()) {
                                fM63750k4 = -fM63750k4;
                            }
                            int i21 = i18;
                            float f7 = fM63750k4;
                            int i22 = iM64963x1 + 1;
                            i6 = i20;
                            int size = list.size();
                            i7 = i21;
                            i8 = i19;
                            float f8 = f2;
                            i9 = StyleIdentifier.LIST_TABLE_4_ACCENT_5;
                            m69075k4(c0886d8, f, f7, f8, f6, fM69822ar, i22, size, c14365qy2);
                            j = 0;
                            boolean z = kc0.m63750k4((double) f7, 0.0d) < 0.0d;
                            float f9 = f6;
                            float f10 = fM69822ar;
                            c14365qy2 = c14365qy;
                            C12025x6 c12025x6M69061k4 = m69061k4(f, f7, f8, f9, f10, i22, list.size(), z, c14365qy2);
                            fM69822ar = f10;
                            f6 = f9;
                            C12025x6 c12025x6Clone = c12025x6M69061k4.Clone();
                            list4.clear();
                            list4.addItem(new C14319px(iM64963x1, i5, c12025x6Clone.Clone(), z));
                            m69072k4((List<C14319px>) list4, c14365qy2);
                        }
                        i19 = i8 + 1;
                        i17 = i6;
                        j2 = j;
                        i16 = i9;
                        i18 = i7;
                        listM69865up = list;
                        c14787xiM69854ne = c14787xi;
                        i14 = i;
                    }
                    i17++;
                    i14 = i;
                    i3 = 270;
                    listM69865up = listM69865up;
                    c14787xiM69854ne = c14787xiM69854ne;
                }
                return;
            }
        } else {
            i2 = 180;
        }
        int i23 = 0;
        while (i23 < listM69865up.size()) {
            int iOooO00o2 = C20856OooooOo.OooO00o(1, i23, listM69865up);
            if (c14365qy2.m69877xk() < i2 || c14365qy2.m69877xk() >= i15) {
                i10 = 1;
            } else {
                i10 = 1;
                iOooO00o2 = C20856OooooOo.OooO00o(1, iOooO00o2, listM69865up);
            }
            if (c14365qy2.m69868wl().m73384dy().isPlotOrderReversed()) {
                iOooO00o2 = C20856OooooOo.OooO00o(i10, iOooO00o2, listM69865up);
            }
            C13847mr c13847mr2 = listM69865up.get_Item(iOooO00o2);
            int iM64963x12 = c13847mr2.m64963x1();
            List<C0886d8> listM64944dy2 = c13847mr2.m64944dy();
            int i24 = 0;
            while (i24 < i14) {
                int i25 = (c14365qy2.m69877xk() < 180 || c14365qy2.m69877xk() >= 270) ? i24 : (i14 - 1) - i24;
                float fM64124x12 = c14365qy2.m69833e0().m64124x1() + (f5 / 2.0f) + (i25 * fM64121to);
                if (c14787xiM69854ne.m73384dy().isPlotOrderReversed()) {
                    i25 = (i14 - 1) - i25;
                }
                C0886d8 c0886d82 = listM64944dy2.get_Item(i25);
                if (c0886d82 == null || c0886d82.m4983dy()) {
                    i11 = i23;
                    list2 = list4;
                    list3 = listM64944dy2;
                    i12 = iM64963x12;
                    i13 = i24;
                    f3 = f4;
                } else {
                    int i26 = i25;
                    i11 = i23;
                    float fM63750k42 = (((float) kc0.m63750k4(d2, c14787xiM69863u4.m73399kk(c0886d82.m4989k4()))) / ((float) (c14787xiM69863u4.m73389ix() - c14787xiM69863u4.m73410ne()))) * c14365qy2.m69833e0().m64100du();
                    if (c14787xiM69863u4.m73384dy().isPlotOrderReversed()) {
                        fM63750k42 = -fM63750k42;
                    }
                    float f11 = fM63750k42;
                    int i27 = i24;
                    int i28 = iM64963x12 + 1;
                    int i29 = iM64963x12;
                    float f12 = f4;
                    i13 = i27;
                    list3 = listM64944dy2;
                    list2 = list4;
                    m69075k4(c0886d82, f, f11, fM64124x12, f12, fM69822ar, i28, listM69865up.size(), c14365qy2);
                    boolean z2 = kc0.m63750k4((double) f11, 0.0d) < 0.0d;
                    float f13 = fM69822ar;
                    c14365qy2 = c14365qy;
                    C12025x6 c12025x6M69061k42 = m69061k4(f, f11, fM64124x12, f12, f13, i28, listM69865up.size(), z2, c14365qy2);
                    fM69822ar = f13;
                    f3 = f12;
                    C12025x6 c12025x6Clone2 = c12025x6M69061k42.Clone();
                    list2.clear();
                    i12 = i29;
                    list2.addItem(new C14319px(i12, i26, c12025x6Clone2.Clone(), z2));
                    m69072k4((List<C14319px>) list2, c14365qy2);
                }
                i24 = i13 + 1;
                d2 = d;
                f4 = f3;
                listM64944dy2 = list3;
                i23 = i11;
                iM64963x12 = i12;
                list4 = list2;
            }
            i23++;
            d2 = d;
            i2 = 180;
            i15 = 270;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static float m69060k4(int i, boolean z, float f, float f2) {
        return z ? i <= 180 ? f - f2 : f + f2 : i <= 180 ? f + f2 : f - f2;
    }

    /* JADX INFO: renamed from: k4 */
    private static C12025x6 m69061k4(float f, float f2, float f3, float f4, float f5, int i, int i2, boolean z, C14365qy c14365qy) {
        float f6;
        C12025x6 c12025x6M69064k4;
        float f7 = 0.0f;
        switch (c14365qy.m69877xk() / 45) {
            case 0:
            case 7:
            case 8:
                f6 = f4 / 2.0f;
                break;
            case 1:
            case 2:
                f7 = f5 / 2.0f;
                f6 = f4;
                break;
            case 3:
            case 4:
                f6 = f4 / 2.0f;
                f7 = f5;
                break;
            case 5:
            case 6:
                f7 = f5 / 2.0f;
                f6 = 0.0f;
                break;
            default:
                f6 = 0.0f;
                break;
        }
        float fM64106h4 = c14365qy.m69833e0().m64106h4();
        float f8 = f3 + f6;
        float f9 = z ? f2 - 8.0f : f2 + 8.0f;
        C12025x6 c12025x6 = new C12025x6();
        float fOooO0O0 = ((OooOO0O.OooO0O0(c14365qy.m69834fa(), 0) & 65535) * f5) / 100.0f;
        float f10 = i2;
        float fM64117m9 = c14365qy.m69833e0().m64117m9() / f10;
        float f11 = f10 / 2.0f;
        float f12 = c14365qy.m69868wl().m73384dy().isPlotOrderReversed() ? (i2 + 1) - i : i;
        if (f12 > f11 || c14365qy.m69868wl().m73384dy().isPlotOrderReversed()) {
            float f13 = (((((f12 - f11) * fM64117m9) - (fOooO0O0 / 2.0f)) - f5) + f7) * 2.0f;
            c12025x6M69064k4 = f8 <= fM64106h4 ? m69064k4(c14365qy, f + f9, (fM64106h4 - f8) * 2.0f, f13, 3) : m69064k4(c14365qy, f + f9, (f8 - fM64106h4) * 2.0f, f13, 2);
        } else {
            float f14 = ((((fOooO0O0 / 2.0f) + ((f11 - f12) * fM64117m9)) + f5) - f7) * 2.0f;
            c12025x6M69064k4 = f8 <= fM64106h4 ? m69064k4(c14365qy, f + f9, (fM64106h4 - f8) * 2.0f, f14, 0) : m69064k4(c14365qy, f + f9, (f8 - fM64106h4) * 2.0f, f14, 1);
        }
        c12025x6M69064k4.CloneTo(c12025x6);
        return c12025x6;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12025x6 m69062k4(C14365qy c14365qy, float f, float f2, float f3, float f4, float f5) {
        char c;
        switch (c14365qy.m69877xk() / 45) {
            case 0:
            case 7:
            case 8:
                f2 /= 2.0f;
                c = 0;
                break;
            case 1:
            case 2:
                f3 = 0.0f;
                c = 0;
                break;
            case 3:
                f2 /= 2.0f;
                c = 1;
                break;
            case 4:
                f2 /= 2.0f;
                c = 2;
                break;
            case 5:
            case 6:
                f2 = 0.0f;
                f3 = 0.0f;
                c = 0;
                break;
            default:
                f2 = 0.0f;
                c = 0;
                break;
        }
        float fM64106h4 = c14365qy.m69833e0().m64106h4();
        float f6 = f + f2;
        if (f6 <= fM64106h4) {
            return m69064k4(c14365qy, (f5 / 2.0f) + f4, (fM64106h4 - f6) * 2.0f, f3, c != 0 ? 3 : 0);
        }
        return m69064k4(c14365qy, (f5 / 2.0f) + f4, (f6 - fM64106h4) * 2.0f, f3, c != 0 ? 2 : 1);
    }

    /* JADX INFO: renamed from: k4 */
    private static C12025x6 m69063k4(C14365qy c14365qy, float f, float f2, float f3, float f4, boolean z) {
        float f5 = f2 / 2.0f;
        float f6 = z ? f4 - 8.0f : f4 + 8.0f;
        float fM64106h4 = c14365qy.m69833e0().m64106h4();
        float f7 = f + f5;
        if (f7 <= fM64106h4) {
            return m69064k4(c14365qy, f3 + f6, (fM64106h4 - f7) * 2.0f, 0.0f, 0);
        }
        return m69064k4(c14365qy, f3 + f6, (f7 - fM64106h4) * 2.0f, 0.0f, 1);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12025x6 m69064k4(C14365qy c14365qy, float f, float f2, float f3, int i) {
        float f4;
        float f5;
        C12025x6 c12025x6;
        C12025x6 c12025x62;
        C12025x6 c12025x63 = new C12025x6((c14365qy.m69833e0().m64121to() / 2.0f) + c14365qy.m69833e0().m64124x1(), f);
        int iM69877xk = c14365qy.m69877xk() % 90;
        if (iM69877xk >= 45) {
            iM69877xk = 90 - iM69877xk;
        }
        int iM69877xk2 = c14365qy.m69877xk() / 45;
        if (iM69877xk2 == 0 || iM69877xk2 == 3 || iM69877xk2 == 4 || iM69877xk2 == 7 || iM69877xk2 == 8) {
            f4 = f2;
            f5 = f3;
        } else {
            f5 = f2;
            f4 = f3;
        }
        float fM67495m9 = ((float) C14116yg.m67495m9((((double) iM69877xk) * 3.141592653589793d) / 180.0d)) * f5;
        float fM67495m92 = f5 * ((float) C14116yg.m67495m9((((double) c14365qy.m69829dq()) * 3.141592653589793d) / 180.0d));
        C12025x6[] c12025x6Arr = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, 4);
        switch (iM69877xk2) {
            case 0:
            case 8:
                C22227OoooO.OooO0O0(f4, fM67495m9, 2.0f, c12025x63.m56897x1(), c12025x6Arr[0]);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[0], c12025x6Arr[1], f4);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[1], c12025x6Arr[2], fM67495m9);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[0], c12025x6Arr[3], fM67495m9);
                c12025x6Arr[0].m56898x1((fM67495m92 / 2.0f) + c12025x63.m56895kk());
                c12025x6Arr[1].m56898x1(c12025x6Arr[0].m56895kk());
                OooOOO.OooO0OO(c12025x6Arr[1], c12025x6Arr[2], fM67495m92);
                c12025x6 = c12025x6Arr[3];
                c12025x62 = c12025x6Arr[2];
                break;
            case 1:
                C22227OoooO.OooO0O0(f4, fM67495m9, 2.0f, c12025x63.m56897x1(), c12025x6Arr[0]);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[0], c12025x6Arr[1], fM67495m9);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[1], c12025x6Arr[2], f4);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[0], c12025x6Arr[3], f4);
                C22207OooOOoo.OooO0O0(c12025x6Arr[0], fM67495m92, 2.0f, c12025x63.m56895kk());
                C22231OoooOO0.OooO00o(c12025x6Arr[0], c12025x6Arr[1], fM67495m92);
                c12025x6Arr[2].m56898x1(c12025x6Arr[1].m56895kk());
                c12025x6 = c12025x6Arr[3];
                c12025x62 = c12025x6Arr[0];
                break;
            case 2:
                C22227OoooO.OooO0O0(f4, fM67495m9, 2.0f, c12025x63.m56897x1(), c12025x6Arr[1]);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[1], c12025x6Arr[0], fM67495m9);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[1], c12025x6Arr[2], f4);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[0], c12025x6Arr[3], f4);
                C22207OooOOoo.OooO0O0(c12025x6Arr[0], fM67495m92, 2.0f, c12025x63.m56895kk());
                C22231OoooOO0.OooO00o(c12025x6Arr[0], c12025x6Arr[1], fM67495m92);
                c12025x6Arr[2].m56898x1(c12025x6Arr[1].m56895kk());
                c12025x6 = c12025x6Arr[3];
                c12025x62 = c12025x6Arr[0];
                break;
            case 3:
                C22227OoooO.OooO0O0(f4, fM67495m9, 2.0f, c12025x63.m56897x1(), c12025x6Arr[1]);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[1], c12025x6Arr[0], f4);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[1], c12025x6Arr[2], fM67495m9);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[2], c12025x6Arr[3], f4);
                C22207OooOOoo.OooO0O0(c12025x6Arr[0], fM67495m92, 2.0f, c12025x63.m56895kk());
                c12025x6Arr[1].m56898x1(c12025x6Arr[0].m56895kk());
                C22231OoooOO0.OooO00o(c12025x6Arr[1], c12025x6Arr[2], fM67495m92);
                c12025x6 = c12025x6Arr[3];
                c12025x62 = c12025x6Arr[2];
                break;
            case 4:
                c12025x6Arr[0].m56891k4(((f4 + fM67495m9) / 2.0f) + c12025x63.m56897x1());
                C21034OooOOOo.OooO0OO(c12025x6Arr[0], c12025x6Arr[1], f4);
                C21034OooOOOo.OooO0OO(c12025x6Arr[1], c12025x6Arr[2], fM67495m9);
                com.aspose.slides.internal.p472w8.OooO00o.OooO0O0(c12025x6Arr[2], c12025x6Arr[3], f4);
                C22207OooOOoo.OooO0O0(c12025x6Arr[0], fM67495m92, 2.0f, c12025x63.m56895kk());
                c12025x6Arr[1].m56898x1(c12025x6Arr[0].m56895kk());
                C22231OoooOO0.OooO00o(c12025x6Arr[1], c12025x6Arr[2], fM67495m92);
                c12025x6 = c12025x6Arr[3];
                c12025x62 = c12025x6Arr[2];
                break;
            case 5:
                c12025x6Arr[0].m56891k4(((f4 + fM67495m9) / 2.0f) + c12025x63.m56897x1());
                C21034OooOOOo.OooO0OO(c12025x6Arr[0], c12025x6Arr[1], fM67495m9);
                C21034OooOOOo.OooO0OO(c12025x6Arr[1], c12025x6Arr[2], f4);
                C21034OooOOOo.OooO0OO(c12025x6Arr[0], c12025x6Arr[3], f4);
                c12025x6Arr[0].m56898x1((fM67495m92 / 2.0f) + c12025x63.m56895kk());
                OooOOO.OooO0OO(c12025x6Arr[0], c12025x6Arr[1], fM67495m92);
                c12025x6Arr[2].m56898x1(c12025x6Arr[1].m56895kk());
                c12025x6 = c12025x6Arr[3];
                c12025x62 = c12025x6Arr[0];
                break;
            case 6:
                c12025x6Arr[1].m56891k4(((f4 + fM67495m9) / 2.0f) + c12025x63.m56897x1());
                C21034OooOOOo.OooO0OO(c12025x6Arr[1], c12025x6Arr[0], fM67495m9);
                C21034OooOOOo.OooO0OO(c12025x6Arr[1], c12025x6Arr[2], f4);
                C21034OooOOOo.OooO0OO(c12025x6Arr[0], c12025x6Arr[3], f4);
                c12025x6Arr[0].m56898x1((fM67495m92 / 2.0f) + c12025x63.m56895kk());
                OooOOO.OooO0OO(c12025x6Arr[0], c12025x6Arr[1], fM67495m92);
                c12025x6Arr[2].m56898x1(c12025x6Arr[1].m56895kk());
                c12025x6 = c12025x6Arr[3];
                c12025x62 = c12025x6Arr[0];
                break;
            case 7:
                c12025x6Arr[1].m56891k4(((f4 + fM67495m9) / 2.0f) + c12025x63.m56897x1());
                C21034OooOOOo.OooO0OO(c12025x6Arr[1], c12025x6Arr[0], f4);
                C21034OooOOOo.OooO0OO(c12025x6Arr[1], c12025x6Arr[2], fM67495m9);
                C21034OooOOOo.OooO0OO(c12025x6Arr[2], c12025x6Arr[3], f4);
                c12025x6Arr[0].m56898x1((fM67495m92 / 2.0f) + c12025x63.m56895kk());
                c12025x6Arr[1].m56898x1(c12025x6Arr[0].m56895kk());
                OooOOO.OooO0OO(c12025x6Arr[1], c12025x6Arr[2], fM67495m92);
                c12025x6 = c12025x6Arr[3];
                c12025x62 = c12025x6Arr[2];
                break;
            default:
                return c12025x6Arr[i];
        }
        c12025x6.m56898x1(c12025x62.m56895kk());
        return c12025x6Arr[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r42v0 */
    /* JADX WARN: Type inference failed for: r42v1 */
    /* JADX WARN: Type inference failed for: r42v2 */
    /* JADX WARN: Type inference failed for: r42v3 */
    /* JADX WARN: Type inference failed for: r42v4 */
    /* JADX INFO: renamed from: kk */
    private static void m69084kk(float f, double d, C14365qy c14365qy) {
        List list;
        int i;
        int i2;
        int i3;
        List<C13847mr> list2;
        int i4;
        int i5;
        ?? r42;
        int i6;
        float f2;
        List<Integer> list3;
        List list4;
        float f3;
        List<C13847mr> listM69865up = c14365qy.m69865up();
        C14787xi c14787xiM69854ne = c14365qy.m69854ne();
        C14787xi c14787xiM69863u4 = c14365qy.m69863u4();
        List list5 = new List();
        int i7 = 14;
        int iM27462to = C7019kk.m27462to(Double.valueOf(c14787xiM69854ne.m73389ix()), 14);
        int iM27462to2 = C7019kk.m27462to(Double.valueOf(c14787xiM69854ne.m73410ne()), 14);
        boolean z = false;
        int i8 = 1;
        int iM4455k4 = C0841c4.m4455k4(c14787xiM69854ne.m73384dy().getBaseUnitScale(), iM27462to, iM27462to2, iM27462to, false) + 1;
        float fM64121to = c14365qy.m69833e0().m64121to() / iM4455k4;
        float fM64110k4 = c14365qy.m69833e0().m64110k4(false, iM4455k4, 1);
        float fM64102dy = c14365qy.m69833e0().m64102dy();
        float gapWidth = ((c14365qy.m69834fa().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth() & 65535) * fM64110k4) / 100.0f;
        List<Integer> listM72791k4 = C14743wm.m72791k4(c14365qy.m69871x1(), false);
        int size = listM72791k4.size();
        int i9 = 0;
        while (i9 < size) {
            int i10 = c14365qy.m69877xk() > 180 ? (size - 1) - i9 : i9;
            float fM64124x1 = (gapWidth / 2.0f) + c14365qy.m69833e0().m64124x1() + (C0841c4.m4455k4(r11, C0841c4.m4457k4(r11, listM72791k4.get_Item(i10).intValue(), z), C7019kk.m27462to(Double.valueOf(c14787xiM69854ne.m73410ne()), i7), C7019kk.m27462to(Double.valueOf(c14787xiM69854ne.m73389ix()), i7), z) * fM64121to);
            List list6 = new List();
            int i11 = i10;
            int i12 = z ? 1 : 0;
            ?? r12 = z;
            while (i12 < listM69865up.size()) {
                C13847mr c13847mr = listM69865up.get_Item(i12);
                int iM64963x1 = c13847mr.m64963x1();
                List<C0886d8> listM64944dy = c13847mr.m64944dy();
                if (c14787xiM69854ne.m73384dy().isPlotOrderReversed()) {
                    list = list6;
                    i = (size - 1) - i11;
                } else {
                    list = list6;
                    i = i11;
                }
                C0886d8 c0886d8 = listM64944dy.get_Item(i);
                if (c0886d8 == null || c0886d8.m4983dy()) {
                    i2 = size;
                    i3 = i9;
                    list2 = listM69865up;
                    i4 = i12;
                    i5 = i11;
                    r42 = r12;
                    i6 = i8;
                    f2 = fM64121to;
                    list3 = listM72791k4;
                    list4 = list;
                } else {
                    int i13 = i11;
                    double dM63751k4 = kc0.m63751k4(listM69865up, i);
                    if (dM63751k4 == 0.0d) {
                        i2 = size;
                        i3 = i9;
                        list2 = listM69865up;
                        i4 = i12;
                        r42 = r12;
                        i6 = i8;
                        f2 = fM64121to;
                        list3 = listM72791k4;
                        list4 = list;
                        i5 = i13;
                    } else {
                        double dM4989k4 = c0886d8.m4989k4();
                        int i14 = size;
                        double[] dArr = new double[i8];
                        dArr[r12] = dM4989k4;
                        int i15 = i9;
                        double[] dArr2 = new double[i8];
                        dArr2[r12] = dM4989k4;
                        r42 = r12;
                        list4 = list;
                        i5 = i13;
                        i2 = i14;
                        i3 = i15;
                        boolean zM63758k4 = kc0.m63758k4(dArr, dArr2, listM69865up, i12, i, dM63751k4, c14787xiM69863u4);
                        i6 = i8;
                        f2 = fM64121to;
                        double d2 = dArr[r42 == true ? 1 : 0];
                        double d3 = dArr2[r42 == true ? 1 : 0];
                        list2 = listM69865up;
                        if (zM63758k4) {
                            float f4 = (float) dM63751k4;
                            i4 = i12;
                            float fM73389ix = (((((float) d2) * 100.0f) / f4) / ((float) (c14787xiM69863u4.m73389ix() - c14787xiM69863u4.m73410ne()))) * c14365qy.m69833e0().m64100du();
                            float fM73389ix2 = ((((((float) d3) * 100.0f) / f4) / ((float) (c14787xiM69863u4.m73389ix() - c14787xiM69863u4.m73410ne()))) * c14365qy.m69833e0().m64100du()) - fM73389ix;
                            if (c14787xiM69863u4.m73384dy().isPlotOrderReversed()) {
                                f3 = fM73389ix2 + f;
                            } else {
                                f3 = f - fM73389ix2;
                                fM73389ix = -fM73389ix;
                            }
                            float f5 = fM73389ix;
                            float f6 = f3;
                            m69066k4(d2, new k4(c0886d8, fM64124x1, f6, f5, d3), (List<k4>) list4, c14787xiM69863u4);
                            list3 = listM72791k4;
                            list5.addItem(new C14319px(iM64963x1, i, m69062k4(c14365qy, fM64124x1, fM64110k4, fM64102dy, f6, f5).Clone().Clone()));
                        } else {
                            i4 = i12;
                            list3 = listM72791k4;
                        }
                    }
                }
                i12 = i4 + 1;
                listM72791k4 = list3;
                list6 = list4;
                i11 = i5;
                size = i2;
                i9 = i3;
                i8 = i6;
                fM64121to = f2;
                listM69865up = list2;
                r12 = r42;
            }
            int i16 = size;
            int i17 = i9;
            List<C13847mr> list7 = listM69865up;
            ?? r422 = r12;
            int i18 = i8;
            float f7 = fM64121to;
            List<Integer> list8 = listM72791k4;
            List list9 = list6;
            double d4 = 1.0d;
            for (int i19 = r422 == true ? 1 : 0; i19 < list9.size(); i19 += i18) {
                k4 k4Var = (k4) list9.get_Item(i19);
                double[] dArr3 = new double[i18];
                dArr3[r422 == true ? 1 : 0] = d4;
                m69073k4(k4Var.m69095k4(), k4Var.m69098x1(), fM64110k4, fM64102dy, k4Var.m69096kk(), k4Var.m69097to(), k4Var.m69094du(), dArr3, c14365qy);
                d4 = dArr3[r422 == true ? 1 : 0];
            }
            list9.clear();
            m69072k4((List<C14319px>) list5, c14365qy);
            list5.clear();
            i9 = i17 + 1;
            z = r422 == true ? 1 : 0;
            listM72791k4 = list8;
            i8 = i18;
            size = i16;
            fM64121to = f7;
            listM69865up = list7;
            i7 = 14;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r42v0 */
    /* JADX WARN: Type inference failed for: r42v1 */
    /* JADX WARN: Type inference failed for: r42v11 */
    /* JADX WARN: Type inference failed for: r42v2 */
    /* JADX WARN: Type inference failed for: r42v3 */
    /* JADX WARN: Type inference failed for: r42v4 */
    /* JADX INFO: renamed from: x1 */
    private static void m69088x1(float f, double d, C14365qy c14365qy) {
        int i;
        List<Integer> list;
        int i2;
        int i3;
        List list2;
        int i4;
        C14787xi c14787xi;
        ?? r42;
        List<C13847mr> list3;
        float f2;
        List<C13847mr> listM69865up = c14365qy.m69865up();
        C14787xi c14787xiM69854ne = c14365qy.m69854ne();
        C14787xi c14787xiM69863u4 = c14365qy.m69863u4();
        List list4 = new List();
        int i5 = 14;
        int iM27462to = C7019kk.m27462to(Double.valueOf(c14787xiM69854ne.m73389ix()), 14);
        int iM27462to2 = C7019kk.m27462to(Double.valueOf(c14787xiM69854ne.m73410ne()), 14);
        boolean z = false;
        int iM4455k4 = C0841c4.m4455k4(c14787xiM69854ne.m73384dy().getBaseUnitScale(), iM27462to, iM27462to2, iM27462to, false) + 1;
        float fM64121to = c14365qy.m69833e0().m64121to() / iM4455k4;
        float fM64110k4 = c14365qy.m69833e0().m64110k4(false, iM4455k4, 1);
        float fM64102dy = c14365qy.m69833e0().m64102dy();
        float gapWidth = ((c14365qy.m69834fa().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth() & 65535) * fM64110k4) / 100.0f;
        List<Integer> listM72791k4 = C14743wm.m72791k4(c14365qy.m69871x1(), false);
        int size = listM72791k4.size();
        int i6 = 0;
        while (i6 < size) {
            int i7 = c14365qy.m69877xk() > 180 ? (size - 1) - i6 : i6;
            float fM64124x1 = (gapWidth / 2.0f) + c14365qy.m69833e0().m64124x1() + (C0841c4.m4455k4(r13, C0841c4.m4457k4(r13, listM72791k4.get_Item(i7).intValue(), z), C7019kk.m27462to(Double.valueOf(c14787xiM69854ne.m73410ne()), i5), C7019kk.m27462to(Double.valueOf(c14787xiM69854ne.m73389ix()), i5), z) * fM64121to);
            List list5 = new List();
            int i8 = i6;
            int i9 = z ? 1 : 0;
            ?? r14 = z;
            while (i9 < listM69865up.size()) {
                C13847mr c13847mr = listM69865up.get_Item(i9);
                int iM64963x1 = c13847mr.m64963x1();
                List<C0886d8> listM64944dy = c13847mr.m64944dy();
                if (c14787xiM69854ne.m73384dy().isPlotOrderReversed()) {
                    i = i7;
                    i7 = (size - 1) - i7;
                } else {
                    i = i7;
                }
                C0886d8 c0886d8 = listM64944dy.get_Item(i7);
                if (c0886d8 == null || c0886d8.m4983dy()) {
                    list = listM72791k4;
                    i2 = size;
                    i3 = i9;
                    list2 = list5;
                    i4 = i8;
                    c14787xi = c14787xiM69854ne;
                    r42 = r14;
                } else {
                    List<Integer> list6 = listM72791k4;
                    double[] dArr = new double[1];
                    dArr[r14] = c0886d8.m4989k4();
                    int i10 = size;
                    double[] dArr2 = new double[1];
                    dArr2[r14] = 0.0d;
                    r42 = r14;
                    i2 = i10;
                    i4 = i8;
                    list2 = list5;
                    list = list6;
                    boolean zM63757k4 = kc0.m63757k4(dArr, dArr2, listM69865up, i9, i7, c14787xiM69863u4.m73389ix(), c14787xiM69863u4.m73410ne());
                    i3 = i9 == true ? 1 : 0;
                    int i11 = i7;
                    double d2 = dArr[r42 == true ? 1 : 0];
                    double d3 = dArr2[r42 == true ? 1 : 0];
                    if (zM63757k4) {
                        c14787xi = c14787xiM69854ne;
                        float fM73389ix = (((float) d2) / ((float) (c14787xiM69863u4.m73389ix() - c14787xiM69863u4.m73410ne()))) * c14365qy.m69833e0().m64100du();
                        list3 = listM69865up;
                        float fM73389ix2 = ((((float) d3) / ((float) (c14787xiM69863u4.m73389ix() - c14787xiM69863u4.m73410ne()))) * c14365qy.m69833e0().m64100du()) - fM73389ix;
                        if (c14787xiM69863u4.m73384dy().isPlotOrderReversed()) {
                            f2 = fM73389ix2 + f;
                        } else {
                            f2 = f - fM73389ix2;
                            fM73389ix = -fM73389ix;
                        }
                        float f3 = fM73389ix;
                        float f4 = f2;
                        m69066k4(d2, new k4(c0886d8, fM64124x1, f4, f3, d3), (List<k4>) list2, c14787xiM69863u4);
                        list4.addItem(new C14319px(iM64963x1, i11, m69062k4(c14365qy, fM64124x1, fM64110k4, fM64102dy, f4, f3).Clone().Clone()));
                        i9 = i3 + 1;
                        r14 = r42;
                        listM69865up = list3;
                        list5 = list2;
                        i7 = i;
                        listM72791k4 = list;
                        size = i2;
                        i8 = i4;
                        c14787xiM69854ne = c14787xi;
                    } else {
                        c14787xi = c14787xiM69854ne;
                        r42 = r42;
                    }
                }
                list3 = listM69865up;
                i9 = i3 + 1;
                r14 = r42;
                listM69865up = list3;
                list5 = list2;
                i7 = i;
                listM72791k4 = list;
                size = i2;
                i8 = i4;
                c14787xiM69854ne = c14787xi;
            }
            List<Integer> list7 = listM72791k4;
            int i12 = size;
            List list8 = list5;
            int i13 = i8;
            C14787xi c14787xi2 = c14787xiM69854ne;
            ?? r422 = r14;
            List<C13847mr> list9 = listM69865up;
            double d4 = 1.0d;
            for (int i14 = r422 == true ? 1 : 0; i14 < list8.size(); i14++) {
                k4 k4Var = (k4) list8.get_Item(i14);
                double[] dArr3 = new double[1];
                dArr3[r422 == true ? 1 : 0] = d4;
                m69073k4(k4Var.m69095k4(), k4Var.m69098x1(), fM64110k4, fM64102dy, k4Var.m69096kk(), k4Var.m69097to(), k4Var.m69094du(), dArr3, c14365qy);
                d4 = dArr3[r422 == true ? 1 : 0];
            }
            list8.clear();
            m69072k4((List<C14319px>) list4, c14365qy);
            list4.clear();
            z = r422 == true ? 1 : 0;
            i6 = i13 + 1;
            listM69865up = list9;
            listM72791k4 = list7;
            size = i12;
            c14787xiM69854ne = c14787xi2;
            i5 = 14;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static void m69089x1(C0886d8 c0886d8, float f, float f2, float f3, float f4, float f5, int i, int i2, float f6, C14365qy c14365qy) {
        int i3;
        float f7;
        float f8;
        boolean z;
        Integer numValueOf;
        C12025x6 c12025x6M69064k4;
        C12025x6 c12025x6M69064k42;
        float f9 = f5;
        float fM64106h4 = c14365qy.m69833e0().m64106h4();
        Dictionary dictionary = new Dictionary();
        Dictionary dictionary2 = new Dictionary();
        float f10 = 2.0f;
        float f11 = f4 / 2.0f;
        float f12 = f3 + f11;
        int i4 = 0;
        float fOooO0O0 = ((OooOO0O.OooO0O0(c14365qy.m69834fa(), 0) & 65535) * f9) / 100.0f;
        float f13 = i2;
        float fM64117m9 = c14365qy.m69833e0().m64117m9() / f13;
        float f14 = f13 / 2.0f;
        int i5 = 1;
        float f15 = c14365qy.m69868wl().m73384dy().isPlotOrderReversed() ? (i2 + 1) - i : i;
        boolean z2 = f15 <= f14 && !c14365qy.m69868wl().m73384dy().isPlotOrderReversed();
        float f16 = ((((f15 - f14) * fM64117m9) - (fOooO0O0 / 2.0f)) - (f9 / 2.0f)) * 2.0f;
        if (z2) {
            f16 = -f16;
            i3 = 0;
        } else {
            i3 = 3;
            i5 = 2;
        }
        int i6 = i5;
        while (i4 <= 180) {
            float f17 = f10;
            float f18 = f11;
            double d = (((double) i4) * 3.141592653589793d) / 180.0d;
            boolean z3 = z2;
            float fM67495m9 = (float) (((double) f9) * C14116yg.m67495m9(d));
            double d2 = f12;
            float fM67470dy = (float) ((C14116yg.m67470dy(d) * ((double) f18)) + d2);
            if (fM67470dy <= fM64106h4) {
                float f19 = (fM64106h4 - fM67470dy) * f17;
                int i7 = 360 - i4;
                f7 = f18;
                if (dictionary.containsKey(Integer.valueOf(i7))) {
                    f8 = fM64106h4;
                    z = z3;
                } else {
                    f8 = fM64106h4;
                    z = z3;
                    dictionary.addItem(Integer.valueOf(i7), m69064k4(c14365qy, f, f19, m69060k4(i7, z, f16, fM67495m9), i3).Clone());
                }
                if (!dictionary.containsKey(Integer.valueOf(i4))) {
                    numValueOf = Integer.valueOf(i4);
                    c12025x6M69064k4 = m69064k4(c14365qy, f, f19, m69060k4(i4, z, f16, fM67495m9), i3);
                    dictionary.addItem(numValueOf, c12025x6M69064k4.Clone());
                }
            } else {
                f7 = f18;
                f8 = fM64106h4;
                z = z3;
                float f20 = (fM67470dy - f8) * f17;
                int i8 = 360 - i4;
                if (!dictionary.containsKey(Integer.valueOf(i8))) {
                    dictionary.addItem(Integer.valueOf(i8), m69064k4(c14365qy, f, f20, m69060k4(i8, z, f16, fM67495m9), i6).Clone());
                }
                if (!dictionary.containsKey(Integer.valueOf(i4))) {
                    numValueOf = Integer.valueOf(i4);
                    c12025x6M69064k4 = m69064k4(c14365qy, f, f20, m69060k4(i4, z, f16, fM67495m9), i6);
                    dictionary.addItem(numValueOf, c12025x6M69064k4.Clone());
                }
            }
            float fM67470dy2 = (float) ((C14116yg.m67470dy(d) * ((double) (f7 * f6))) + d2);
            float fM67495m92 = (float) (C14116yg.m67495m9(d) * ((double) (f5 * f6)));
            if (fM67470dy2 <= f8) {
                float f21 = (f8 - fM67470dy2) * f17;
                int i9 = 360 - i4;
                if (!dictionary2.containsKey(Integer.valueOf(i9))) {
                    C12025x6 c12025x6Clone = m69064k4(c14365qy, f, f21, m69060k4(i9, z, f16, fM67495m92), i3).Clone();
                    c12025x6Clone.m56898x1(c12025x6Clone.m56895kk() + f2);
                    dictionary2.addItem(Integer.valueOf(i9), c12025x6Clone.Clone());
                }
                if (!dictionary2.containsKey(Integer.valueOf(i4))) {
                    c12025x6M69064k42 = m69064k4(c14365qy, f, f21, m69060k4(i4, z, f16, fM67495m92), i3);
                    C12025x6 c12025x6Clone2 = c12025x6M69064k42.Clone();
                    c12025x6Clone2.m56898x1(c12025x6Clone2.m56895kk() + f2);
                    dictionary2.addItem(Integer.valueOf(i4), c12025x6Clone2.Clone());
                }
            } else {
                float f22 = (fM67470dy2 - f8) * f17;
                int i10 = 360 - i4;
                if (!dictionary2.containsKey(Integer.valueOf(i10))) {
                    C12025x6 c12025x6Clone3 = m69064k4(c14365qy, f, f22, m69060k4(i10, z, f16, fM67495m92), i6).Clone();
                    c12025x6Clone3.m56898x1(c12025x6Clone3.m56895kk() + f2);
                    dictionary2.addItem(Integer.valueOf(i10), c12025x6Clone3.Clone());
                }
                if (!dictionary2.containsKey(Integer.valueOf(i4))) {
                    c12025x6M69064k42 = m69064k4(c14365qy, f, f22, m69060k4(i4, z, f16, fM67495m92), i6);
                    C12025x6 c12025x6Clone22 = c12025x6M69064k42.Clone();
                    c12025x6Clone22.m56898x1(c12025x6Clone22.m56895kk() + f2);
                    dictionary2.addItem(Integer.valueOf(i4), c12025x6Clone22.Clone());
                }
            }
            i4++;
            f11 = f7;
            f9 = f5;
            f10 = f17;
            z2 = z;
            fM64106h4 = f8;
        }
        m69077k4(c0886d8, (Dictionary<Integer, C12025x6>) dictionary, (Dictionary<Integer, C12025x6>) dictionary2, f2);
    }

    /* JADX INFO: renamed from: x1 */
    private static void m69090x1(C0886d8 c0886d8, C14365qy c14365qy, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8;
        float f9;
        int i;
        float f10;
        Integer numValueOf;
        float f11;
        int i2;
        float f12;
        float f13;
        int i3;
        float fM64106h4 = c14365qy.m69833e0().m64106h4();
        Dictionary dictionary = new Dictionary();
        Dictionary dictionary2 = new Dictionary();
        float f14 = 2.0f;
        float f15 = (f2 / 2.0f) + f;
        int i4 = 0;
        while (i4 <= 180) {
            double d = (((double) i4) * 3.141592653589793d) / 180.0d;
            float fM67495m9 = (float) (((double) f3) * C14116yg.m67495m9(d));
            double d2 = f15;
            float f16 = f14;
            int i5 = i4;
            float fM67470dy = (float) ((C14116yg.m67470dy(d) * ((double) ((f2 * f7) / f16))) + d2);
            if (fM67470dy <= fM64106h4) {
                f10 = (fM64106h4 - fM67470dy) * f16;
                i = i5;
                int i6 = 360 - i;
                f8 = fM64106h4;
                if (dictionary.containsKey(Integer.valueOf(i6))) {
                    f9 = f15;
                } else {
                    f9 = f15;
                    dictionary.addItem(Integer.valueOf(i6), m69064k4(c14365qy, f4, f10, fM67495m9 * f7, 0).Clone());
                }
                if (!dictionary.containsKey(Integer.valueOf(i))) {
                    numValueOf = Integer.valueOf(i);
                    f11 = fM67495m9 * f7;
                    i2 = 3;
                    dictionary.addItem(numValueOf, m69064k4(c14365qy, f4, f10, f11, i2).Clone());
                }
            } else {
                f8 = fM64106h4;
                f9 = f15;
                i = i5;
                f10 = (fM67470dy - f8) * f16;
                int i7 = 360 - i;
                if (!dictionary.containsKey(Integer.valueOf(i7))) {
                    dictionary.addItem(Integer.valueOf(i7), m69064k4(c14365qy, f4, f10, fM67495m9 * f7, 1).Clone());
                }
                if (!dictionary.containsKey(Integer.valueOf(i))) {
                    numValueOf = Integer.valueOf(i);
                    f11 = fM67495m9 * f7;
                    i2 = 2;
                    dictionary.addItem(numValueOf, m69064k4(c14365qy, f4, f10, f11, i2).Clone());
                }
            }
            float fM67470dy2 = (float) ((C14116yg.m67470dy(d) * ((double) ((f2 * f6) / f16))) + d2);
            if (fM67470dy2 <= f8) {
                f12 = (f8 - fM67470dy2) * f16;
                int i8 = 360 - i;
                if (!dictionary2.containsKey(Integer.valueOf(i8))) {
                    C12025x6 c12025x6Clone = m69064k4(c14365qy, f4, f12, fM67495m9 * f6, 0).Clone();
                    c12025x6Clone.m56898x1(c12025x6Clone.m56895kk() + f5);
                    dictionary2.addItem(Integer.valueOf(i8), c12025x6Clone.Clone());
                }
                if (!dictionary2.containsKey(Integer.valueOf(i))) {
                    f13 = fM67495m9 * f6;
                    i3 = 3;
                    C12025x6 c12025x6Clone2 = m69064k4(c14365qy, f4, f12, f13, i3).Clone();
                    c12025x6Clone2.m56898x1(c12025x6Clone2.m56895kk() + f5);
                    dictionary2.addItem(Integer.valueOf(i), c12025x6Clone2.Clone());
                }
            } else {
                f12 = (fM67470dy2 - f8) * f16;
                int i9 = 360 - i;
                if (!dictionary2.containsKey(Integer.valueOf(i9))) {
                    C12025x6 c12025x6Clone3 = m69064k4(c14365qy, f4, f12, fM67495m9 * f6, 1).Clone();
                    c12025x6Clone3.m56898x1(c12025x6Clone3.m56895kk() + f5);
                    dictionary2.addItem(Integer.valueOf(i9), c12025x6Clone3.Clone());
                }
                if (!dictionary2.containsKey(Integer.valueOf(i))) {
                    f13 = fM67495m9 * f6;
                    i3 = 2;
                    C12025x6 c12025x6Clone22 = m69064k4(c14365qy, f4, f12, f13, i3).Clone();
                    c12025x6Clone22.m56898x1(c12025x6Clone22.m56895kk() + f5);
                    dictionary2.addItem(Integer.valueOf(i), c12025x6Clone22.Clone());
                }
            }
            i4 = i + 1;
            f14 = f16;
            fM64106h4 = f8;
            f15 = f9;
        }
        m69077k4(c0886d8, (Dictionary<Integer, C12025x6>) dictionary, (Dictionary<Integer, C12025x6>) dictionary2, f5);
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m69091x1(C14285pi c14285pi) {
        return true;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C14285pi Clone() {
        C14285pi c14285pi = new C14285pi();
        CloneTo(c14285pi);
        return c14285pi;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m69065k4(double d, int i, C14365qy c14365qy) {
        double d2;
        double dM73389ix;
        float fM64114kk;
        double dM73410ne;
        int i2;
        int i3;
        int i4;
        float f;
        List<C13847mr> list;
        int i5;
        int i6;
        List list2;
        List list3;
        float f2;
        float f3;
        int i7;
        float f4;
        float f5;
        C14365qy c14365qy2 = c14365qy;
        int i8 = 0;
        List<C13847mr> listM69865up = c14365qy2.m69865up();
        C14787xi c14787xiM69854ne = c14365qy2.m69854ne();
        C14787xi c14787xiM69863u4 = c14365qy2.m69863u4();
        int iM72789k4 = C14743wm.m72789k4(listM69865up);
        int i9 = 1;
        if (iM72789k4 == 1) {
            dM73389ix = c14787xiM69863u4.m73410ne();
        } else {
            if (iM72789k4 != 2) {
                d2 = 0.0d;
                if (c14787xiM69863u4.m73384dy().isPlotOrderReversed()) {
                    fM64114kk = c14365qy2.m69833e0().m64114kk();
                    dM73410ne = c14787xiM69863u4.m73410ne();
                } else {
                    fM64114kk = c14365qy2.m69833e0().m64114kk();
                    dM73410ne = c14787xiM69863u4.m73389ix();
                }
                float fM67475k4 = fM64114kk - (((float) C14116yg.m67475k4((dM73410ne - d2) / ((double) ((float) (c14787xiM69863u4.m73389ix() - c14787xiM69863u4.m73410ne()))))) * c14365qy2.m69833e0().m64100du());
                if (c14365qy2.m69854ne().m73384dy().getCategoryAxisType() != 1) {
                    m69088x1(fM67475k4, d, c14365qy2);
                    return;
                }
                List list4 = new List();
                float fM64121to = c14365qy2.m69833e0().m64121to() / i;
                float fM64110k4 = c14365qy2.m69833e0().m64110k4(false, i, 1);
                float fM64102dy = c14365qy2.m69833e0().m64102dy();
                float gapWidth = ((c14365qy2.m69834fa().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth() & 65535) * fM64110k4) / 100.0f;
                int i10 = 0;
                while (i10 < i) {
                    int i11 = c14365qy2.m69877xk() > 180 ? (i - 1) - i10 : i10;
                    float fM64124x1 = (gapWidth / 2.0f) + (i11 * fM64121to) + c14365qy2.m69833e0().m64124x1();
                    List list5 = new List();
                    List list6 = list4;
                    int i12 = i8;
                    while (i12 < listM69865up.size()) {
                        C13847mr c13847mr = listM69865up.get_Item(i12);
                        int i13 = i8;
                        int iM64963x1 = c13847mr.m64963x1();
                        List<C0886d8> listM64944dy = c13847mr.m64944dy();
                        if (c14787xiM69854ne.m73384dy().isPlotOrderReversed()) {
                            i2 = i10;
                            i3 = (i - 1) - i11;
                        } else {
                            i2 = i10;
                            i3 = i11;
                        }
                        C0886d8 c0886d8 = listM64944dy.get_Item(i3);
                        if (c0886d8 == null || c0886d8.m4983dy()) {
                            i4 = i9;
                            f = fM67475k4;
                            list = listM69865up;
                            i5 = i12;
                            i6 = i11;
                            list2 = list5;
                            list3 = list6;
                            f2 = fM64110k4;
                            f3 = fM64102dy;
                            i7 = i2;
                            f4 = fM64124x1;
                        } else {
                            double[] dArr = new double[i9];
                            dArr[i13] = c0886d8.m4989k4();
                            float f6 = fM67475k4;
                            double[] dArr2 = new double[i9];
                            dArr2[i13] = 0.0d;
                            List list7 = list5;
                            List list8 = list6;
                            i7 = i2;
                            i6 = i11;
                            i4 = i9;
                            f = f6;
                            boolean zM63757k4 = kc0.m63757k4(dArr, dArr2, listM69865up, i12, i3, c14787xiM69863u4.m73389ix(), c14787xiM69863u4.m73410ne());
                            list = listM69865up;
                            int i14 = i12;
                            int i15 = i3;
                            double d3 = dArr[i13];
                            double d4 = dArr2[i13];
                            if (zM63757k4) {
                                if (iM72789k4 == i4 && i14 == 0) {
                                    d3 -= d2;
                                } else if (iM72789k4 == 2 && i14 == 0) {
                                    d3 -= d2;
                                }
                                i5 = i14;
                                float fM73389ix = (((float) d3) / ((float) (c14787xiM69863u4.m73389ix() - c14787xiM69863u4.m73410ne()))) * c14365qy2.m69833e0().m64100du();
                                float fM73389ix2 = ((((float) (d4 - d2)) / ((float) (c14787xiM69863u4.m73389ix() - c14787xiM69863u4.m73410ne()))) * c14365qy2.m69833e0().m64100du()) - fM73389ix;
                                if (c14787xiM69863u4.m73384dy().isPlotOrderReversed()) {
                                    f5 = fM73389ix2 + f;
                                } else {
                                    f5 = f - fM73389ix2;
                                    fM73389ix = -fM73389ix;
                                }
                                float f7 = fM73389ix;
                                float f8 = f5;
                                f4 = fM64124x1;
                                list2 = list7;
                                m69066k4(d3, new k4(c0886d8, fM64124x1, f8, f7, d4), (List<k4>) list2, c14787xiM69863u4);
                                f2 = fM64110k4;
                                f3 = fM64102dy;
                                C14319px c14319px = new C14319px(iM64963x1, i15, m69062k4(c14365qy2, f4, f2, f3, f8, f7).Clone().Clone());
                                list3 = list8;
                                list3.addItem(c14319px);
                            } else {
                                i5 = i14;
                                f2 = fM64110k4;
                                f3 = fM64102dy;
                                f4 = fM64124x1;
                                list3 = list8;
                                list2 = list7;
                            }
                        }
                        i12 = i5 + 1;
                        c14365qy2 = c14365qy;
                        fM64124x1 = f4;
                        fM64110k4 = f2;
                        fM64102dy = f3;
                        list5 = list2;
                        list6 = list3;
                        i9 = i4;
                        i8 = i13;
                        fM67475k4 = f;
                        i10 = i7;
                        i11 = i6;
                        listM69865up = list;
                    }
                    int i16 = i9;
                    float f9 = fM67475k4;
                    List<C13847mr> list9 = listM69865up;
                    int i17 = i10;
                    List list10 = list5;
                    int i18 = i8;
                    float f10 = fM64110k4;
                    float f11 = fM64102dy;
                    List list11 = list6;
                    double d5 = 1.0d;
                    int i19 = i18;
                    while (i19 < list10.size()) {
                        k4 k4Var = (k4) list10.get_Item(i19);
                        double[] dArr3 = new double[i16];
                        dArr3[i18] = d5;
                        m69073k4(k4Var.m69095k4(), k4Var.m69098x1(), f10, f11, k4Var.m69096kk(), k4Var.m69097to(), k4Var.m69094du(), dArr3, c14365qy);
                        i19++;
                        d5 = dArr3[i18];
                        list10 = list10;
                    }
                    c14365qy2 = c14365qy;
                    list10.clear();
                    m69072k4((List<C14319px>) list11, c14365qy2);
                    list11.clear();
                    i10 = i17 + 1;
                    fM64110k4 = f10;
                    fM64102dy = f11;
                    list4 = list11;
                    i9 = i16;
                    i8 = i18;
                    fM67475k4 = f9;
                    listM69865up = list9;
                }
                return;
            }
            dM73389ix = c14787xiM69863u4.m73389ix();
        }
        d2 = dM73389ix;
        if (c14787xiM69863u4.m73384dy().isPlotOrderReversed()) {
        }
        float fM67475k42 = fM64114kk - (((float) C14116yg.m67475k4((dM73410ne - d2) / ((double) ((float) (c14787xiM69863u4.m73389ix() - c14787xiM69863u4.m73410ne()))))) * c14365qy2.m69833e0().m64100du());
        if (c14365qy2.m69854ne().m73384dy().getCategoryAxisType() != 1) {
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m69066k4(double d, k4 k4Var, List<k4> list, C14787xi c14787xi) {
        C14365qy c14365qyM73423wy = c14787xi.m73423wy();
        int iM27462to = C7019kk.m27462to(Float.valueOf(k4Var.m69096kk() + k4Var.m69097to() + 0.5f), 13);
        if (list.size() == 0) {
            list.addItem(k4Var);
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            k4 k4Var2 = list.get_Item(i);
            int iM27462to2 = C7019kk.m27462to(Float.valueOf(k4Var2.m69096kk() + k4Var2.m69097to() + 0.5f), 13);
            if (c14365qyM73423wy.m69829dq() >= 0) {
                if (iM27462to > iM27462to2) {
                    list.insertItem(i, k4Var);
                    return;
                }
                if (iM27462to == iM27462to2) {
                    if (c14787xi.m73384dy().isPlotOrderReversed()) {
                        if (d > 0.0d) {
                            list.insertItem(i, k4Var);
                            return;
                        }
                    } else if (d < 0.0d) {
                        list.insertItem(i, k4Var);
                        return;
                    }
                    list.insertItem(i + 1, k4Var);
                    return;
                }
                if (i == list.size() - 1) {
                    list.addItem(k4Var);
                    return;
                }
            } else {
                if (iM27462to < iM27462to2) {
                    list.insertItem(i, k4Var);
                    return;
                }
                if (iM27462to == iM27462to2) {
                    if (c14787xi.m73384dy().isPlotOrderReversed()) {
                        if (d < 0.0d) {
                            list.insertItem(i, k4Var);
                            return;
                        }
                    } else if (d > 0.0d) {
                        list.insertItem(i, k4Var);
                        return;
                    }
                    list.insertItem(i + 1, k4Var);
                    return;
                }
                if (i == list.size() - 1) {
                    list.addItem(k4Var);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static void m69067k4(float f, double d, int i, C14365qy c14365qy) {
        int i2;
        int i3;
        C0886d8 c0886d8;
        List list;
        int i4;
        int i5;
        C14787xi c14787xi;
        float f2;
        float f3;
        double d2 = d;
        int i6 = i;
        C14365qy c14365qy2 = c14365qy;
        int i7 = 0;
        List<C13847mr> listM69865up = c14365qy2.m69865up();
        int size = listM69865up.size();
        C14787xi c14787xiM69854ne = c14365qy2.m69854ne();
        C14787xi c14787xiM69863u4 = c14365qy2.m69863u4();
        float f4 = f;
        if (c14365qy2.m69854ne().m73384dy().getCategoryAxisType() == 1) {
            m69068k4(f4, d2, c14365qy2);
            return;
        }
        List list2 = new List();
        float fM64121to = c14365qy2.m69833e0().m64121to() / i6;
        float fM64110k4 = c14365qy2.m69833e0().m64110k4(false, i6, size);
        float fM64102dy = c14365qy2.m69833e0().m64102dy();
        float gapWidth = ((c14365qy2.m69834fa().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth() & 65535) * fM64110k4) / 100.0f;
        int i8 = 0;
        while (i8 < i6) {
            int i9 = 180;
            int i10 = c14365qy2.m69877xk() > 180 ? (i6 - 1) - i8 : i8;
            double d3 = 1.0d;
            int i11 = i7;
            while (i7 < listM69865up.size()) {
                int iOooO00o = c14365qy2.m69877xk() > i9 ? C20856OooooOo.OooO00o(1, i7, listM69865up) : i7;
                C13847mr c13847mr = listM69865up.get_Item(iOooO00o);
                int i12 = i8;
                int iM64963x1 = c13847mr.m64963x1();
                float fM64124x1 = c14365qy2.m69833e0().m64124x1() + (gapWidth / 2.0f) + (i10 * fM64121to) + (iOooO00o * fM64110k4);
                List<C0886d8> listM64944dy = c13847mr.m64944dy();
                if (c14787xiM69854ne.m73384dy().isPlotOrderReversed()) {
                    i2 = iM64963x1;
                    i3 = (i6 - 1) - i10;
                } else {
                    i2 = iM64963x1;
                    i3 = i10;
                }
                if (i3 > c13847mr.m64944dy().size() - 1 || (c0886d8 = listM64944dy.get_Item(i3)) == null || c0886d8.m4983dy()) {
                    c14787xi = c14787xiM69863u4;
                    list = list2;
                    f2 = fM64102dy;
                    i5 = i10;
                    i4 = 180;
                    f3 = fM64110k4;
                } else {
                    float f5 = fM64110k4;
                    float fM63750k4 = (((float) kc0.m63750k4(d2, c14787xiM69863u4.m73399kk(c0886d8.m4989k4()))) / ((float) (c14787xiM69863u4.m73389ix() - c14787xiM69863u4.m73410ne()))) * c14365qy2.m69833e0().m64100du();
                    if (c14787xiM69863u4.m73384dy().isPlotOrderReversed()) {
                        fM63750k4 = -fM63750k4;
                    }
                    list = list2;
                    double[] dArr = new double[1];
                    dArr[i11] = d3;
                    int i13 = i3;
                    int i14 = i2;
                    i4 = 180;
                    i5 = i10;
                    c14787xi = c14787xiM69863u4;
                    float f6 = fM64102dy;
                    float f7 = fM63750k4;
                    m69073k4(c0886d8, fM64124x1, f5, f6, f4, f7, Double.NaN, dArr, c14365qy2);
                    f2 = f6;
                    double d4 = dArr[i11];
                    f3 = f5;
                    boolean z = kc0.m63750k4((double) f7, 0.0d) <= 0.0d ? 1 : i11;
                    c14365qy2 = c14365qy;
                    list.addItem(new C14319px(i14, i13, m69063k4(c14365qy, fM64124x1, f3, f, f7, z).Clone().Clone(), z));
                    d3 = d4;
                }
                i7++;
                f4 = f;
                i6 = i;
                fM64110k4 = f3;
                fM64102dy = f2;
                c14787xiM69863u4 = c14787xi;
                i8 = i12;
                i9 = i4;
                i10 = i5;
                list2 = list;
                d2 = d;
            }
            f4 = f;
            i6 = i;
            i7 = i11;
            i8++;
            list2 = list2;
            d2 = d;
        }
        m69072k4((List<C14319px>) list2, c14365qy2);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m69068k4(float f, double d, C14365qy c14365qy) {
        float f2;
        int i;
        C14787xi c14787xi;
        C14787xi c14787xi2;
        List<Integer> list;
        int i2;
        int i3;
        int i4;
        float f3;
        List<C13847mr> listM69865up = c14365qy.m69865up();
        int size = listM69865up.size();
        C14787xi c14787xiM69854ne = c14365qy.m69854ne();
        C14787xi c14787xiM69863u4 = c14365qy.m69863u4();
        List list2 = new List();
        int i5 = 14;
        int iM27462to = C7019kk.m27462to(Double.valueOf(c14787xiM69854ne.m73389ix()), 14);
        int iM27462to2 = C7019kk.m27462to(Double.valueOf(c14787xiM69854ne.m73410ne()), 14);
        boolean z = false;
        int iM4455k4 = C0841c4.m4455k4(c14787xiM69854ne.m73384dy().getBaseUnitScale(), iM27462to, iM27462to2, iM27462to, false);
        int i6 = 1;
        int i7 = iM4455k4 + 1;
        float fM64121to = c14365qy.m69833e0().m64121to() / i7;
        float fM64110k4 = c14365qy.m69833e0().m64110k4(false, i7, size);
        float fM64102dy = c14365qy.m69833e0().m64102dy();
        float gapWidth = ((c14365qy.m69834fa().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth() & 65535) * fM64110k4) / 100.0f;
        List<Integer> listM72791k4 = C14743wm.m72791k4(c14365qy.m69871x1(), false);
        int size2 = listM72791k4.size();
        int i8 = 0;
        while (i8 < size2) {
            int i9 = i6;
            int i10 = c14365qy.m69877xk() > 180 ? (size2 - 1) - i8 : i8;
            float f4 = gapWidth;
            float fM64124x1 = (f4 / 2.0f) + c14365qy.m69833e0().m64124x1() + (C0841c4.m4455k4(r8, C0841c4.m4457k4(r8, listM72791k4.get_Item(i10).intValue(), z), C7019kk.m27462to(Double.valueOf(c14787xiM69854ne.m73410ne()), i5), C7019kk.m27462to(Double.valueOf(c14787xiM69854ne.m73389ix()), i5), false) * fM64121to);
            double d2 = 1.0d;
            int i11 = 0;
            while (i11 < listM69865up.size()) {
                int iOooO00o = c14365qy.m69877xk() > 180 ? C20856OooooOo.OooO00o(i9, i11, listM69865up) : i11;
                C13847mr c13847mr = listM69865up.get_Item(iOooO00o);
                int iM64963x1 = c13847mr.m64963x1();
                float f5 = (iOooO00o * fM64110k4) + fM64124x1;
                List<C13847mr> list3 = listM69865up;
                List<C0886d8> listM64944dy = c13847mr.m64944dy();
                if (c14787xiM69854ne.m73384dy().isPlotOrderReversed()) {
                    f2 = f5;
                    i = (size2 - 1) - i10;
                } else {
                    f2 = f5;
                    i = i10;
                }
                C0886d8 c0886d8 = listM64944dy.get_Item(i);
                if (c0886d8 == null || c0886d8.m4983dy()) {
                    c14787xi = c14787xiM69854ne;
                    c14787xi2 = c14787xiM69863u4;
                    list = listM72791k4;
                    i2 = i11;
                    i3 = i8;
                    i4 = i10;
                    f3 = fM64102dy;
                } else {
                    list = listM72791k4;
                    i2 = i11;
                    c14787xi = c14787xiM69854ne;
                    c14787xi2 = c14787xiM69863u4;
                    float fM63750k4 = (((float) kc0.m63750k4(d, c14787xiM69863u4.m73399kk(c0886d8.m4989k4()))) / ((float) (c14787xi2.m73389ix() - c14787xi2.m73410ne()))) * c14365qy.m69833e0().m64100du();
                    if (c14787xi2.m73384dy().isPlotOrderReversed()) {
                        fM63750k4 = -fM63750k4;
                    }
                    double[] dArr = {d2};
                    int i12 = i10;
                    float f6 = f2;
                    i3 = i8;
                    float f7 = fM63750k4;
                    m69073k4(c0886d8, f6, fM64110k4, fM64102dy, f, f7, Double.NaN, dArr, c14365qy);
                    double d3 = dArr[0];
                    f3 = fM64102dy;
                    i4 = i12;
                    boolean z2 = kc0.m63750k4((double) fM63750k4, 0.0d) < 0.0d;
                    list2.addItem(new C14319px(iM64963x1, i, m69063k4(c14365qy, f6, fM64110k4, f, f7, z2).Clone().Clone(), z2));
                    d2 = d3;
                }
                i9 = 1;
                i11 = i2 + 1;
                i8 = i3;
                fM64102dy = f3;
                i10 = i4;
                listM69865up = list3;
                listM72791k4 = list;
                c14787xiM69854ne = c14787xi;
                c14787xiM69863u4 = c14787xi2;
            }
            i8++;
            i6 = i9;
            z = false;
            gapWidth = f4;
            listM69865up = listM69865up;
            i5 = 14;
        }
        m69072k4((List<C14319px>) list2, c14365qy);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m69069k4(Dictionary<Integer, C12025x6> dictionary, C12025x6[] c12025x6Arr, C12025x6[] c12025x6Arr2, int[] iArr, int[] iArr2) {
        C12025x6.f40591k4.CloneTo(c12025x6Arr[0]);
        C12025x6.f40591k4.CloneTo(c12025x6Arr2[0]);
        iArr[0] = 0;
        iArr2[0] = 0;
        Dictionary.Enumerator<Integer, C12025x6> it = dictionary.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                if (C12025x6.m56883k4(c12025x6Arr[0], C12025x6.f40591k4) || ((C12025x6) next.getValue()).m56897x1() > c12025x6Arr[0].m56897x1()) {
                    ((C12025x6) next.getValue()).CloneTo(c12025x6Arr[0]);
                    iArr[0] = ((Integer) next.getKey()).intValue();
                }
                if (C12025x6.m56883k4(c12025x6Arr2[0], C12025x6.f40591k4) || ((C12025x6) next.getValue()).m56897x1() < c12025x6Arr2[0].m56897x1()) {
                    ((C12025x6) next.getValue()).CloneTo(c12025x6Arr2[0]);
                    iArr2[0] = ((Integer) next.getKey()).intValue();
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69070k4(List<C13847mr> list, int i, double[] dArr, double[] dArr2) {
        dArr[0] = 0.0d;
        dArr2[0] = 0.0d;
        for (int i2 = 0; i2 < list.size(); i2++) {
            double dM4989k4 = list.get_Item(i2).m64944dy().get_Item(i).m4989k4();
            if (dM4989k4 > 0.0d) {
                dArr[0] = dArr[0] + dM4989k4;
            }
            if (dM4989k4 < 0.0d) {
                dArr2[0] = dArr2[0] + dM4989k4;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69071k4(List<C13847mr> list, int i, double[] dArr, double[] dArr2, C14365qy c14365qy) {
        dArr[0] = 0.0d;
        dArr2[0] = 0.0d;
        int iM69819to = C14365qy.m69819to(list);
        for (int i2 = 0; i2 < iM69819to; i2++) {
            double[] dArr3 = {0.0d};
            double[] dArr4 = {0.0d};
            m69070k4(list, i2, dArr3, dArr4);
            double d = dArr3[0];
            double d2 = dArr4[0];
            if (d > dArr[0]) {
                dArr[0] = d;
            }
            if (d2 < dArr2[0]) {
                dArr2[0] = d2;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69072k4(List<C14319px> list, C14365qy c14365qy) {
        List<C13847mr> listM69865up = c14365qy.m69865up();
        int i = 0;
        while (i < list.size()) {
            C14319px c14319px = list.get_Item(i);
            int iM69322k4 = c14319px.m69322k4();
            int iM69325x1 = c14319px.m69325x1();
            C12025x6 c12025x6Clone = c14319px.m69323kk().Clone();
            boolean zM69320du = c14319px.m69320du();
            boolean zM69324to = c14319px.m69324to();
            C0852cf c0852cfM5003ks = c14365qy.m69865up().get_Item(iM69322k4).m64944dy().get_Item(iM69325x1).m5003ks();
            C14365qy c14365qy2 = c14365qy;
            C12015qq c12015qqClone = C13729ki.m63877k4(listM69865up, iM69322k4, iM69325x1, C7019kk.m27462to(Float.valueOf(c14365qy.m69833e0().m64121to()), 13), c14365qy2, c14365qy.m69854ne()).Clone();
            float fM56897x1 = c12025x6Clone.m56897x1() - (c12015qqClone.m56699x1() / 2.0f);
            float fM56895kk = c12025x6Clone.m56895kk() - (c12015qqClone.m56697kk() / 2.0f);
            if (zM69320du) {
                fM56895kk = c12025x6Clone.m56895kk();
                if (zM69324to) {
                    fM56895kk -= c12015qqClone.m56697kk();
                }
            }
            C13729ki.m63881k4(fM56897x1, fM56895kk, c0852cfM5003ks, c12015qqClone.Clone(), c14365qy2);
            C13729ki.m63883k4(listM69865up, iM69322k4, iM69325x1, c0852cfM5003ks.f4320kk.f5456k4.Clone(), c14365qy2, c14365qy2.m69854ne());
            i++;
            c14365qy = c14365qy2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x02aa A[PHI: r3 r12
      0x02aa: PHI (r3v18 double) = (r3v15 double), (r3v24 double) binds: [B:159:0x031b, B:136:0x02a7] A[DONT_GENERATE, DONT_INLINE]
      0x02aa: PHI (r12v4 double) = (r12v2 double), (r12v5 double) binds: [B:159:0x031b, B:136:0x02a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02c7 A[PHI: r4 r16
      0x02c7: PHI (r4v7 double) = (r4v6 double), (r4v11 double) binds: [B:165:0x032a, B:144:0x02c4] A[DONT_GENERATE, DONT_INLINE]
      0x02c7: PHI (r16v4 double) = (r16v1 double), (r16v6 double) binds: [B:165:0x032a, B:144:0x02c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m69073k4(C0886d8 c0886d8, float f, float f2, float f3, float f4, float f5, double d, double[] dArr, C14365qy c14365qy) {
        double dM69058k4;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double dM69058k42;
        double d8;
        C13847mr c13847mrM5012up = c0886d8.m5012up();
        int bar3DShape = c13847mrM5012up.m64945h4().getBar3DShape();
        if (bar3DShape == 0) {
            float f6 = (float) 1.0d;
            m69078k4(c0886d8, c14365qy, f, f2, f3, f4, f5, f6, f6);
            return;
        }
        double d9 = 0.0d;
        if (bar3DShape == 1) {
            if (ChartTypeCharacterizer.m758dy(c13847mrM5012up.m64945h4().getType()) || ChartTypeCharacterizer.m761jd(c13847mrM5012up.m64945h4().getType())) {
                double[] dArr2 = {0.0d};
                double[] dArr3 = {0.0d};
                m69070k4(c13847mrM5012up.m64941c5().m69865up(), c0886d8.m5007rv(), dArr2, dArr3);
                double d10 = dArr2[0];
                double d11 = dArr3[0];
                if (c0886d8.m4989k4() == 0.0d) {
                    dOooO00o = dArr[0];
                    d9 = dOooO00o;
                } else if (c0886d8.m4989k4() > 0.0d) {
                    double d12 = d10 == 0.0d ? 1.0d : (d10 - d) / d10;
                    dOooO00o = d10 != 0.0d ? C22206OooOOo0.OooO00o(d, c0886d8.m4989k4(), d10, d10) : 1.0d;
                    d9 = d12;
                } else {
                    double d13 = d11 == 0.0d ? 1.0d : (d11 - d) / d11;
                    dOooO00o = d11 != 0.0d ? C22206OooOOo0.OooO00o(d, c0886d8.m4989k4(), d11, d11) : 1.0d;
                    d9 = d13;
                }
            }
            m69090x1(c0886d8, c14365qy, f, f2, f3, f4, f5, (float) d9, (float) dOooO00o);
            return;
        }
        if (bar3DShape == 2) {
            if (ChartTypeCharacterizer.m758dy(c13847mrM5012up.m64945h4().getType())) {
                double[] dArr4 = {0.0d};
                double[] dArr5 = {0.0d};
                m69071k4(c13847mrM5012up.m64941c5().m69865up(), c0886d8.m5007rv(), dArr4, dArr5, c14365qy);
                d2 = dArr4[0];
                d3 = dArr5[0];
                if (c0886d8.m4989k4() == 0.0d) {
                    dM69058k4 = dArr[0];
                    dOooO00o = dM69058k4;
                } else if (c0886d8.m4989k4() > 0.0d) {
                    d5 = d2 == 0.0d ? 1.0d : (d2 - d) / d2;
                    if (d2 != 0.0d) {
                        dOooO00o = C22206OooOOo0.OooO00o(d, c0886d8.m4989k4(), d2, d2);
                    }
                    dM69058k4 = d5;
                } else {
                    d4 = d3 == 0.0d ? 1.0d : (d3 - d) / d3;
                    if (d3 != 0.0d) {
                        dOooO00o = C22206OooOOo0.OooO00o(d, c0886d8.m4989k4(), d3, d3);
                    }
                    dM69058k4 = d4;
                }
            } else if (ChartTypeCharacterizer.m761jd(c13847mrM5012up.m64945h4().getType())) {
                double[] dArr6 = {0.0d};
                double[] dArr7 = {0.0d};
                m69070k4(c13847mrM5012up.m64941c5().m69865up(), c0886d8.m5007rv(), dArr6, dArr7);
                d2 = dArr6[0];
                d3 = dArr7[0];
                if (c0886d8.m4989k4() == 0.0d) {
                    dM69058k4 = dArr[0];
                    dOooO00o = dM69058k4;
                } else if (c0886d8.m4989k4() > 0.0d) {
                    d5 = d2 == 0.0d ? 1.0d : (d2 - d) / d2;
                    if (d2 != 0.0d) {
                    }
                    dM69058k4 = d5;
                } else {
                    d4 = d3 == 0.0d ? 1.0d : (d3 - d) / d3;
                    if (d3 != 0.0d) {
                    }
                    dM69058k4 = d4;
                }
            } else {
                dM69058k4 = (float) m69058k4(c0886d8, c14365qy);
            }
            m69090x1(c0886d8, c14365qy, f, f2, f3, f4, f5, (float) dM69058k4, (float) dOooO00o);
            return;
        }
        if (bar3DShape == 3) {
            float f7 = (float) 1.0d;
            m69090x1(c0886d8, c14365qy, f, f2, f3, f4, f5, f7, f7);
            return;
        }
        if (bar3DShape != 4) {
            if (bar3DShape != 5) {
                return;
            }
            if (ChartTypeCharacterizer.m758dy(c13847mrM5012up.m64945h4().getType())) {
                double[] dArr8 = {0.0d};
                double[] dArr9 = {0.0d};
                m69071k4(c13847mrM5012up.m64941c5().m69865up(), c0886d8.m5007rv(), dArr8, dArr9, c14365qy);
                double d14 = dArr8[0];
                double d15 = dArr9[0];
                if (c0886d8.m4989k4() == 0.0d) {
                    dM69058k42 = dArr[0];
                    dOooO00o = dM69058k42;
                } else {
                    if (c0886d8.m4989k4() > 0.0d) {
                        d8 = d14 == 0.0d ? 1.0d : (d14 - d) / d14;
                        if (d14 != 0.0d) {
                            dOooO00o = C22206OooOOo0.OooO00o(d, c0886d8.m4989k4(), d14, d14);
                        }
                    } else {
                        d8 = d15 == 0.0d ? 1.0d : (d15 - d) / d15;
                        if (d15 != 0.0d) {
                            dOooO00o = C22206OooOOo0.OooO00o(d, c0886d8.m4989k4(), d15, d15);
                        }
                    }
                    dM69058k42 = d8;
                }
            } else if (ChartTypeCharacterizer.m761jd(c13847mrM5012up.m64945h4().getType())) {
                double[] dArr10 = {0.0d};
                double[] dArr11 = {0.0d};
                m69070k4(c13847mrM5012up.m64941c5().m69865up(), c0886d8.m5007rv(), dArr10, dArr11);
                double d16 = dArr10[0];
                double d17 = dArr11[0];
                if (c0886d8.m4989k4() == 0.0d) {
                    dM69058k42 = dArr[0];
                    dOooO00o = dM69058k42;
                } else if (c0886d8.m4989k4() > 0.0d) {
                    d8 = d16 == 0.0d ? 1.0d : (d16 - d) / d16;
                    if (d16 != 0.0d) {
                        dOooO00o = C22206OooOOo0.OooO00o(d, c0886d8.m4989k4(), d16, d16);
                    }
                    dM69058k42 = d8;
                } else {
                    double d18 = d17 == 0.0d ? 1.0d : (d17 - d) / d17;
                    dOooO00o = d17 != 0.0d ? C22206OooOOo0.OooO00o(d, c0886d8.m4989k4(), d17, d17) : 1.0d;
                    dM69058k42 = d18;
                }
            } else {
                dM69058k42 = (float) m69058k4(c0886d8, c14365qy);
            }
            m69078k4(c0886d8, c14365qy, f, f2, f3, f4, f5, (float) dM69058k42, (float) dOooO00o);
            return;
        }
        if (ChartTypeCharacterizer.m758dy(c13847mrM5012up.m64945h4().getType())) {
            C13847mr c13847mr = c14365qy.m69865up().get_Item(0);
            int iM72789k4 = C14743wm.m72789k4(c14365qy.m69865up());
            double dM73410ne = iM72789k4 == 1 ? c14365qy.m69863u4().m73410ne() : iM72789k4 == 2 ? c14365qy.m69863u4().m73389ix() : 0.0d;
            double[] dArr12 = {0.0d};
            double[] dArr13 = {0.0d};
            m69070k4(c13847mrM5012up.m64941c5().m69865up(), c0886d8.m5007rv(), dArr12, dArr13);
            double d19 = dArr12[0];
            double d20 = dArr13[0];
            if (c0886d8.m4989k4() == 0.0d) {
                d7 = dArr[0];
                dOooO00o = d7;
                d9 = dOooO00o;
            } else {
                if (c0886d8.m4989k4() > 0.0d) {
                    double dM4989k4 = c0886d8.m4989k4();
                    if (c13847mrM5012up == c13847mr) {
                        dM4989k4 -= dM73410ne;
                    }
                    d6 = d19 == 0.0d ? 1.0d : (d19 - d) / (d19 - dM73410ne);
                    if (d19 != 0.0d) {
                        dOooO00o = (d19 - (d - dM4989k4)) / (d19 - dM73410ne);
                    }
                } else {
                    double dM4989k42 = c0886d8.m4989k4();
                    if (c13847mrM5012up == c13847mr) {
                        dM4989k42 -= dM73410ne;
                    }
                    d6 = d20 == 0.0d ? 1.0d : (d20 - d) / (d20 - dM73410ne);
                    if (d20 != 0.0d) {
                        dOooO00o = (d20 - (d - dM4989k42)) / (d20 - dM73410ne);
                    }
                }
                d9 = d6;
            }
        } else if (ChartTypeCharacterizer.m761jd(c13847mrM5012up.m64945h4().getType())) {
            double[] dArr14 = {0.0d};
            double[] dArr15 = {0.0d};
            m69070k4(c13847mrM5012up.m64941c5().m69865up(), c0886d8.m5007rv(), dArr14, dArr15);
            double d21 = dArr14[0];
            double d22 = dArr15[0];
            if (c0886d8.m4989k4() == 0.0d) {
                d7 = dArr[0];
                dOooO00o = d7;
                d9 = dOooO00o;
            } else if (c0886d8.m4989k4() > 0.0d) {
                double d23 = d21 == 0.0d ? 1.0d : (d21 - d) / d21;
                dOooO00o = d21 != 0.0d ? C22206OooOOo0.OooO00o(d, c0886d8.m4989k4(), d21, d21) : 1.0d;
                d9 = d23;
            } else {
                d6 = d22 == 0.0d ? 1.0d : (d22 - d) / d22;
                if (d22 != 0.0d) {
                    dOooO00o = C22206OooOOo0.OooO00o(d, c0886d8.m4989k4(), d22, d22);
                }
                d9 = d6;
            }
        }
        m69078k4(c0886d8, c14365qy, f, f2, f3, f4, f5, (float) d9, (float) dOooO00o);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m69074k4(C0886d8 c0886d8, float f, float f2, float f3, float f4, float f5, int i, int i2, float f6, C14365qy c14365qy) {
        float f7;
        float f8;
        int i3;
        float f9;
        int i4;
        C12025x6 c12025x6M69064k4;
        C12025x6 c12025x6;
        float f10;
        C12025x6 c12025x62;
        int i5 = 0;
        float fOooO0O0 = ((OooOO0O.OooO0O0(c14365qy.m69834fa(), 0) & 65535) * f5) / 100.0f;
        C12025x6[] c12025x6Arr = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, 8);
        float fM64106h4 = c14365qy.m69833e0().m64106h4();
        float f11 = (((1.0f - f6) * f4) / 2.0f) + f3;
        float f12 = i2;
        float fM64117m9 = c14365qy.m69833e0().m64117m9() / f12;
        float f13 = f12 / 2.0f;
        float f14 = c14365qy.m69868wl().m73384dy().isPlotOrderReversed() ? (i2 + 1) - i : i;
        boolean z = f14 <= f13 && !c14365qy.m69868wl().m73384dy().isPlotOrderReversed();
        float f15 = ((((f14 - f13) * fM64117m9) - (fOooO0O0 / 2.0f)) - f5) * 2.0f;
        if (z) {
            f7 = -f15;
            f8 = 1.0f;
            i3 = 1;
        } else {
            f7 = f15;
            f8 = 1.0f;
            i5 = 3;
            i3 = 2;
        }
        C12025x6 c12025x6Clone = C12025x6.f40591k4.Clone();
        int i6 = 3;
        float f16 = f7;
        int i7 = 0;
        float f17 = f11;
        float f18 = f3;
        for (int i8 = 2; i7 < i8; i8 = 2) {
            if (f18 <= fM64106h4) {
                float f19 = (fM64106h4 - f18) * 2.0f;
                f9 = f18;
                i4 = i7;
                m69064k4(c14365qy, f, f19, f16, i5).CloneTo(c12025x6Arr[i4]);
                float f20 = f5 * 2.0f;
                c12025x6M69064k4 = m69064k4(c14365qy, f, f19, z ? f16 - f20 : f16 + f20, i5);
                c12025x6 = c12025x6Arr[i4 + i6];
            } else {
                f9 = f18;
                i4 = i7;
                float f21 = (f9 - fM64106h4) * 2.0f;
                m69064k4(c14365qy, f, f21, f16, i3).CloneTo(c12025x6Arr[i4]);
                float f22 = f5 * 2.0f;
                c12025x6M69064k4 = m69064k4(c14365qy, f, f21, z ? f16 - f22 : f16 + f22, i3);
                c12025x6 = c12025x6Arr[i4 + i6];
            }
            c12025x6M69064k4.CloneTo(c12025x6);
            float f23 = z ? -f15 : f15;
            if (f17 <= fM64106h4) {
                float f24 = (fM64106h4 - f17) * 2.0f;
                m69064k4(c14365qy, f, f24, m69059k4(f23, z, f5, f6), i5).CloneTo(c12025x6Clone);
                int i9 = i4 + 4;
                c12025x6Arr[i9].m56891k4(c12025x6Clone.m56897x1());
                C22231OoooOO0.OooO00o(c12025x6Clone, c12025x6Arr[i9], f2);
                if (f6 == f8) {
                    float f25 = f5 * 2.0f;
                    f23 = z ? f23 - f25 : f23 + f25;
                }
                m69064k4(c14365qy, f, f24, m69059k4(f23, z, f5, f6), i5).CloneTo(c12025x6Clone);
                int i10 = i4 + i6 + 4;
                c12025x6Arr[i10].m56891k4(c12025x6Clone.m56897x1());
                c12025x62 = c12025x6Arr[i10];
            } else {
                float f26 = (f17 - fM64106h4) * 2.0f;
                m69064k4(c14365qy, f, f26, m69059k4(f23, z, f5, f6), i3).CloneTo(c12025x6Clone);
                int i11 = i4 + 4;
                float f27 = f23;
                c12025x6Arr[i11].m56891k4(c12025x6Clone.m56897x1());
                C22231OoooOO0.OooO00o(c12025x6Clone, c12025x6Arr[i11], f2);
                if (f6 == f8) {
                    float f28 = f5 * 2.0f;
                    f10 = z ? f27 - f28 : f28 + f27;
                } else {
                    f10 = f27;
                }
                m69064k4(c14365qy, f, f26, m69059k4(f10, z, f5, f6), i3).CloneTo(c12025x6Clone);
                int i12 = i4 + i6 + 4;
                c12025x6Arr[i12].m56891k4(c12025x6Clone.m56897x1());
                c12025x62 = c12025x6Arr[i12];
            }
            C22231OoooOO0.OooO00o(c12025x6Clone, c12025x62, f2);
            f18 = f9 + f4;
            f17 += f4 * f6;
            f16 = z ? -f15 : f15;
            i7 = i4 + 1;
            i6 = 1;
        }
        m69080k4(c14365qy, c0886d8, c12025x6Arr, f2);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m69075k4(C0886d8 c0886d8, float f, float f2, float f3, float f4, float f5, int i, int i2, C14365qy c14365qy) {
        int bar3DShape = c0886d8.m5012up().m64945h4().getBar3DShape();
        if (bar3DShape == 0) {
            m69074k4(c0886d8, f, f2, f3, f4, f5, i, i2, 1.0f, c14365qy);
            return;
        }
        if (bar3DShape == 1) {
            m69089x1(c0886d8, f, f2, f3, f4, f5, i, i2, 0.0f, c14365qy);
        } else if (bar3DShape == 3) {
            m69089x1(c0886d8, f, f2, f3, f4, f5, i, i2, 1.0f, c14365qy);
        } else {
            if (bar3DShape != 4) {
                return;
            }
            m69074k4(c0886d8, f, f2, f3, f4, f5, i, i2, 0.0f, c14365qy);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69076k4(C0886d8 c0886d8, int i, int i2, Dictionary<Integer, C12025x6> dictionary) {
        if (i2 > i) {
            i += StyleIdentifier.LIST_TABLE_4_ACCENT_5;
        }
        C12025x6[] c12025x6Arr = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), C14116yg.m67482k4((i - i2) + 1)));
        int i3 = 0;
        while (i2 <= i) {
            dictionary.get_Item(Integer.valueOf(i2 % StyleIdentifier.LIST_TABLE_4_ACCENT_5)).CloneTo(c12025x6Arr[i3]);
            i3++;
            i2++;
        }
        C11896dy c11896dy = new C11896dy();
        c11896dy.m55582x1(c12025x6Arr);
        c0886d8.m4992k4(c11896dy);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0333 A[LOOP:1: B:37:0x032f->B:39:0x0333, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m69077k4(C0886d8 c0886d8, Dictionary<Integer, C12025x6> dictionary, Dictionary<Integer, C12025x6> dictionary2, float f) {
        C11896dy c11896dy;
        int i;
        GradientStopCollection gradientStopCollection;
        int i2;
        int i3;
        GradientStopCollection gradientStopCollection2;
        C12003du c12003duM56398k4;
        GradientStopCollection gradientStopCollection3;
        C12003du c12003duClone;
        float f2;
        float f3;
        float f4;
        C14365qy c14365qyM64941c5 = c0886d8.m5012up().m64941c5();
        int iM69877xk = c14365qyM64941c5.m69877xk();
        C12025x6 c12025x6 = new C12025x6();
        C12025x6 c12025x62 = new C12025x6();
        C12025x6[] c12025x6Arr = {c12025x6};
        C12025x6[] c12025x6Arr2 = {c12025x62};
        int[] iArr = {0};
        int[] iArr2 = {0};
        m69069k4(dictionary, c12025x6Arr, c12025x6Arr2, iArr, iArr2);
        c12025x6Arr[0].CloneTo(c12025x6);
        c12025x6Arr2[0].CloneTo(c12025x62);
        int i4 = iArr[0];
        int i5 = iArr2[0];
        C12025x6 c12025x63 = new C12025x6();
        C12025x6 c12025x64 = new C12025x6();
        C12025x6[] c12025x6Arr3 = {c12025x63};
        C12025x6[] c12025x6Arr4 = {c12025x64};
        m69069k4(dictionary2, c12025x6Arr3, c12025x6Arr4, new int[]{0}, new int[]{0});
        c12025x6Arr3[0].CloneTo(c12025x63);
        c12025x6Arr4[0].CloneTo(c12025x64);
        C12025x6[] c12025x6Arr5 = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), StyleIdentifier.LIST_TABLE_4_ACCENT_5));
        float f5 = iM69877xk;
        float f6 = f5 + 180.0f;
        int i6 = 0;
        while (f6 <= f5 + 360.0f) {
            int iM27462to = C7019kk.m27462to(Float.valueOf(f6 % 360.0f), 13);
            C12025x6 c12025x6Clone = dictionary.get_Item(Integer.valueOf(iM27462to)).Clone();
            dictionary2.get_Item(Integer.valueOf(iM27462to)).Clone().CloneTo(c12025x6Arr5[i6]);
            c12025x6Clone.CloneTo(c12025x6Arr5[(c12025x6Arr5.length - 1) - i6]);
            i6++;
            f6 += 1.0f;
            c14365qyM64941c5 = c14365qyM64941c5;
        }
        C14365qy c14365qy = c14365qyM64941c5;
        C11896dy c11896dy2 = new C11896dy();
        c11896dy2.m55570to(c12025x6Arr5);
        c0886d8.m5000kk(c11896dy2);
        C11896dy c11896dy3 = new C11896dy();
        c11896dy3.m55570to(c12025x6Arr5);
        FillFormat fillFormat = new FillFormat(c0886d8.m4988jd());
        fillFormat.setFillType((byte) 2);
        fillFormat.getGradientFormat().setGradientShape((byte) 0);
        fillFormat.getGradientFormat().setLinearGradientAngle(0.0f);
        C12003du c12003duClone2 = c0886d8.m4988jd().m581du().Clone();
        if (iM69877xk < 0 || iM69877xk >= 30) {
            c11896dy = c11896dy3;
            if (iM69877xk < 30 || iM69877xk >= 160) {
                if (iM69877xk >= 160 && iM69877xk < 200) {
                    gradientStopCollection2 = (GradientStopCollection) fillFormat.getGradientFormat().getGradientStops();
                    c12003duM56398k4 = C12003du.m56398k4(143, 0, 0, 0);
                } else if (iM69877xk >= 200 && iM69877xk < 240) {
                    ((GradientStopCollection) fillFormat.getGradientFormat().getGradientStops()).m1625k4(0.0f, C12003du.m56398k4(170, 0, 0, 0).Clone());
                    ((GradientStopCollection) fillFormat.getGradientFormat().getGradientStops()).m1625k4(0.64f, C12003du.m56398k4(130, c12003duClone2.m56507jd() & 255, c12003duClone2.m56502ck() & 255, c12003duClone2.m56505fa() & 255).Clone());
                    gradientStopCollection3 = (GradientStopCollection) fillFormat.getGradientFormat().getGradientStops();
                    c12003duClone = C12003du.m56398k4(0, 255, 255, 255).Clone();
                    f2 = 1.0f;
                } else {
                    if (iM69877xk <= 240 || iM69877xk >= 320) {
                        if (iM69877xk < 320 || iM69877xk >= 340) {
                            i = 0;
                            gradientStopCollection = (GradientStopCollection) fillFormat.getGradientFormat().getGradientStops();
                            i2 = 143;
                        } else {
                            gradientStopCollection = (GradientStopCollection) fillFormat.getGradientFormat().getGradientStops();
                            i2 = 170;
                            i = 0;
                        }
                        gradientStopCollection.m1625k4(0.0f, C12003du.m56398k4(i2, i, i, i).Clone());
                        ((GradientStopCollection) fillFormat.getGradientFormat().getGradientStops()).m1625k4(0.64f, C12003du.m56398k4(130, c12003duClone2.m56507jd() & 255, c12003duClone2.m56502ck() & 255, c12003duClone2.m56505fa() & 255).Clone());
                        i3 = 0;
                        ((GradientStopCollection) fillFormat.getGradientFormat().getGradientStops()).m1625k4(1.0f, C12003du.m56398k4(0, 255, 255, 255).Clone());
                        im9.m7703k4(C12003du.f40505to.Clone(), c0886d8.m5012up().m64941c5(), c11896dy, fillFormat, 1.0f, (IEffectFormat) null);
                        C11896dy c11896dy4 = new C11896dy();
                        C11896dy c11896dy5 = new C11896dy();
                        C12025x6[] c12025x6Arr6 = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), dictionary.size()));
                        C12025x6[] c12025x6Arr7 = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), dictionary.size()));
                        while (i3 <= 360) {
                            dictionary.get_Item(Integer.valueOf(i3)).CloneTo(c12025x6Arr6[i3]);
                            dictionary2.get_Item(Integer.valueOf(i3)).CloneTo(c12025x6Arr7[i3]);
                            i3++;
                        }
                        c11896dy4.m55582x1(c12025x6Arr6);
                        c11896dy5.m55582x1(c12025x6Arr7);
                        f3 = 0.0f;
                        if (c14365qy.m69829dq() > 0) {
                            f4 = 0.7f;
                            if (f < 0.0f) {
                                c0886d8.m4993k4(c11896dy5, 0.7f);
                                c0886d8.m4992k4(c11896dy5);
                                m69076k4(c0886d8, i4, i5, dictionary);
                            } else if (f > 0.0f) {
                                c0886d8.m4993k4(c11896dy4, f4);
                                c0886d8.m4992k4(c11896dy4);
                                m69076k4(c0886d8, i4, i5, dictionary2);
                            } else {
                                c0886d8.m4993k4(c11896dy4, 0.7f);
                                c0886d8.m4992k4(c11896dy4);
                            }
                        } else {
                            if (c14365qy.m69829dq() < 0) {
                                f4 = 0.33333334f;
                                if (f >= 0.0f) {
                                    if (f > 0.0f) {
                                        c0886d8.m4993k4(c11896dy5, 0.33333334f);
                                        c0886d8.m4992k4(c11896dy5);
                                        m69076k4(c0886d8, i4, i5, dictionary);
                                    } else {
                                        c0886d8.m4993k4(c11896dy4, 0.33333334f);
                                        c0886d8.m4992k4(c11896dy4);
                                    }
                                }
                                c0886d8.m4993k4(c11896dy4, f4);
                                c0886d8.m4992k4(c11896dy4);
                                m69076k4(c0886d8, i4, i5, dictionary2);
                            } else {
                                C11896dy c11896dy6 = new C11896dy();
                                c11896dy6.m55574x1(c12025x62.m56897x1(), c12025x62.m56895kk(), c12025x6.m56897x1(), c12025x6.m56895kk());
                                c11896dy6.m55574x1(c12025x64.m56897x1(), c12025x64.m56895kk(), c12025x63.m56897x1(), c12025x63.m56895kk());
                                c0886d8.m4992k4(c11896dy6);
                            }
                            f3 = 0.0f;
                        }
                        if (f != f3) {
                            C11896dy c11896dy7 = new C11896dy();
                            c11896dy7.m55585yj();
                            c11896dy7.m55574x1(c12025x62.m56897x1(), c12025x62.m56895kk(), c12025x64.m56897x1(), c12025x64.m56895kk());
                            c11896dy7.m55585yj();
                            c11896dy7.m55574x1(c12025x6.m56897x1(), c12025x6.m56895kk(), c12025x63.m56897x1(), c12025x63.m56895kk());
                            c0886d8.m4992k4(c11896dy7);
                            return;
                        }
                        return;
                    }
                    gradientStopCollection2 = (GradientStopCollection) fillFormat.getGradientFormat().getGradientStops();
                    c12003duM56398k4 = C12003du.m56398k4(200, 0, 0, 0);
                }
                gradientStopCollection2.m1625k4(0.0f, c12003duM56398k4.Clone());
                ((GradientStopCollection) fillFormat.getGradientFormat().getGradientStops()).m1625k4(0.64f, C12003du.m56398k4(130, c12003duClone2.m56507jd() & 255, c12003duClone2.m56502ck() & 255, c12003duClone2.m56505fa() & 255).Clone());
                gradientStopCollection3 = (GradientStopCollection) fillFormat.getGradientFormat().getGradientStops();
                c12003duClone = C12003du.m56398k4(0, 255, 255, 255).Clone();
                f2 = 1.0f;
            } else {
                ((GradientStopCollection) fillFormat.getGradientFormat().getGradientStops()).m1625k4(1.0f, C12003du.m56398k4(143, 0, 0, 0).Clone());
                ((GradientStopCollection) fillFormat.getGradientFormat().getGradientStops()).m1625k4(0.36f, C12003du.m56398k4(130, c12003duClone2.m56507jd() & 255, c12003duClone2.m56502ck() & 255, c12003duClone2.m56505fa() & 255).Clone());
                ((GradientStopCollection) fillFormat.getGradientFormat().getGradientStops()).m1625k4(0.0f, C12003du.m56398k4(0, 255, 255, 255).Clone());
                i3 = 0;
                im9.m7703k4(C12003du.f40505to.Clone(), c0886d8.m5012up().m64941c5(), c11896dy, fillFormat, 1.0f, (IEffectFormat) null);
                C11896dy c11896dy42 = new C11896dy();
                C11896dy c11896dy52 = new C11896dy();
                C12025x6[] c12025x6Arr62 = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), dictionary.size()));
                C12025x6[] c12025x6Arr72 = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), dictionary.size()));
                while (i3 <= 360) {
                }
                c11896dy42.m55582x1(c12025x6Arr62);
                c11896dy52.m55582x1(c12025x6Arr72);
                f3 = 0.0f;
                if (c14365qy.m69829dq() > 0) {
                }
                if (f != f3) {
                }
            }
        } else {
            ((GradientStopCollection) fillFormat.getGradientFormat().getGradientStops()).m1625k4(0.0f, C12003du.m56398k4(143, 0, 0, 0).Clone());
            c11896dy = c11896dy3;
            ((GradientStopCollection) fillFormat.getGradientFormat().getGradientStops()).m1625k4(0.64f, C12003du.m56398k4(130, c12003duClone2.m56507jd() & 255, c12003duClone2.m56502ck() & 255, c12003duClone2.m56505fa() & 255).Clone());
            gradientStopCollection3 = (GradientStopCollection) fillFormat.getGradientFormat().getGradientStops();
            c12003duClone = C12003du.m56398k4(0, 255, 255, 255).Clone();
            f2 = 1.0f;
        }
        gradientStopCollection3.m1625k4(f2, c12003duClone);
        i3 = 0;
        im9.m7703k4(C12003du.f40505to.Clone(), c0886d8.m5012up().m64941c5(), c11896dy, fillFormat, 1.0f, (IEffectFormat) null);
        C11896dy c11896dy422 = new C11896dy();
        C11896dy c11896dy522 = new C11896dy();
        C12025x6[] c12025x6Arr622 = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), dictionary.size()));
        C12025x6[] c12025x6Arr722 = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), dictionary.size()));
        while (i3 <= 360) {
        }
        c11896dy422.m55582x1(c12025x6Arr622);
        c11896dy522.m55582x1(c12025x6Arr722);
        f3 = 0.0f;
        if (c14365qy.m69829dq() > 0) {
        }
        if (f != f3) {
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m69078k4(C0886d8 c0886d8, C14365qy c14365qy, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8;
        C12025x6 c12025x6M69064k4;
        C12025x6 c12025x6;
        int i;
        C12025x6[] c12025x6Arr = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, 8);
        float fM64106h4 = c14365qy.m69833e0().m64106h4();
        C12025x6 c12025x6Clone = C12025x6.f40591k4.Clone();
        float f9 = 2.0f;
        float f10 = (((1.0f - f6) * f2) / 2.0f) + f;
        float f11 = (((1.0f - f7) * f2) / 2.0f) + f;
        int i2 = 3;
        int i3 = 0;
        int i4 = 3;
        int i5 = 0;
        while (i5 < 2) {
            if (f11 <= fM64106h4) {
                float f12 = (fM64106h4 - f11) * f9;
                f8 = f9;
                float f13 = f3 * f7;
                m69064k4(c14365qy, f4, f12, f13, i3).CloneTo(c12025x6Arr[i5]);
                c12025x6M69064k4 = m69064k4(c14365qy, f4, f12, f13, i2);
                c12025x6 = c12025x6Arr[i5 + i4];
            } else {
                f8 = f9;
                float f14 = (f11 - fM64106h4) * f8;
                float f15 = f3 * f7;
                m69064k4(c14365qy, f4, f14, f15, 1).CloneTo(c12025x6Arr[i5]);
                c12025x6M69064k4 = m69064k4(c14365qy, f4, f14, f15, 2);
                c12025x6 = c12025x6Arr[i5 + i4];
            }
            c12025x6M69064k4.CloneTo(c12025x6);
            if (f10 <= fM64106h4) {
                float f16 = (fM64106h4 - f10) * f8;
                float f17 = f3 * f6;
                m69064k4(c14365qy, f4, f16, f17, 0).CloneTo(c12025x6Clone);
                int i6 = i5 + 4;
                c12025x6Arr[i6].m56891k4(c12025x6Clone.m56897x1());
                C22231OoooOO0.OooO00o(c12025x6Clone, c12025x6Arr[i6], f5);
                m69064k4(c14365qy, f4, f16, f17, i2).CloneTo(c12025x6Clone);
                int i7 = i4 + i5 + 4;
                c12025x6Arr[i7].m56891k4(c12025x6Clone.m56897x1());
                C22231OoooOO0.OooO00o(c12025x6Clone, c12025x6Arr[i7], f5);
                i = 1;
            } else {
                float f18 = (f10 - fM64106h4) * f8;
                float f19 = f3 * f6;
                i = 1;
                m69064k4(c14365qy, f4, f18, f19, 1).CloneTo(c12025x6Clone);
                int i8 = i5 + 4;
                c12025x6Arr[i8].m56891k4(c12025x6Clone.m56897x1());
                C22231OoooOO0.OooO00o(c12025x6Clone, c12025x6Arr[i8], f5);
                m69064k4(c14365qy, f4, f18, f19, 2).CloneTo(c12025x6Clone);
                int i9 = i4 + i5 + 4;
                c12025x6Arr[i9].m56891k4(c12025x6Clone.m56897x1());
                C22231OoooOO0.OooO00o(c12025x6Clone, c12025x6Arr[i9], f5);
            }
            f11 += f2 * f7;
            f10 += f2 * f6;
            i5++;
            i4 = i;
            f9 = f8;
            i2 = 3;
            i3 = 0;
        }
        m69080k4(c14365qy, c0886d8, c12025x6Arr, f5);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C14285pi c14285pi) {
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0030 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0043 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m69079k4(C14365qy c14365qy, List<x1> list) {
        C12025x6[] c12025x6ArrM69100x1;
        if (list.size() <= 1) {
            return;
        }
        int i = 0;
        while (i < list.size()) {
            if (list.get_Item(i) != null) {
                c12025x6ArrM69100x1 = list.get_Item(i).m69100x1();
                break;
            }
            i++;
        }
        c12025x6ArrM69100x1 = null;
        if (i >= list.size()) {
            return;
        }
        if (list.get_Item(i) != null) {
            x1 x1Var = list.get_Item(i);
            C0886d8 c0886d8M69099k4 = x1Var.m69099k4();
            C12025x6[] c12025x6ArrM69100x12 = x1Var.m69100x1();
            m69081k4(c14365qy, c0886d8M69099k4, c12025x6ArrM69100x1, c12025x6ArrM69100x12);
            c12025x6ArrM69100x1 = c12025x6ArrM69100x12;
        } else {
            c12025x6ArrM69100x1 = null;
        }
        i++;
        if (i >= list.size()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0309  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m69080k4(C14365qy c14365qy, C0886d8 c0886d8, C12025x6[] c12025x6Arr, float f) {
        char c;
        char c2;
        char c3;
        float f2;
        C11896dy c11896dy;
        C11896dy c11896dy2;
        C11896dy c11896dy3;
        new C11896dy().m55570to(c12025x6Arr);
        c0886d8.m4997k4(c12025x6Arr[0].Clone(), c12025x6Arr[1].Clone());
        c0886d8.m4997k4(c12025x6Arr[1].Clone(), c12025x6Arr[2].Clone());
        c0886d8.m4997k4(c12025x6Arr[2].Clone(), c12025x6Arr[3].Clone());
        c0886d8.m4997k4(c12025x6Arr[0].Clone(), c12025x6Arr[3].Clone());
        if (f != 0.0f) {
            c0886d8.m4997k4(c12025x6Arr[4].Clone(), c12025x6Arr[5].Clone());
            c0886d8.m4997k4(c12025x6Arr[5].Clone(), c12025x6Arr[6].Clone());
            c0886d8.m4997k4(c12025x6Arr[6].Clone(), c12025x6Arr[7].Clone());
            c0886d8.m4997k4(c12025x6Arr[4].Clone(), c12025x6Arr[7].Clone());
            c0886d8.m4997k4(c12025x6Arr[0].Clone(), c12025x6Arr[4].Clone());
            c0886d8.m4997k4(c12025x6Arr[1].Clone(), c12025x6Arr[5].Clone());
            c0886d8.m4997k4(c12025x6Arr[2].Clone(), c12025x6Arr[6].Clone());
            c0886d8.m4997k4(c12025x6Arr[3].Clone(), c12025x6Arr[7].Clone());
        }
        if (f != 0.0f) {
            if (c14365qy.m69877xk() > 45) {
                c = 0;
                if (c14365qy.m69877xk() != 360) {
                    f2 = 0.0f;
                    if (c14365qy.m69877xk() <= 45 || c14365qy.m69877xk() > 90) {
                        c3 = 1;
                        c2 = 2;
                        if (c14365qy.m69877xk() > 90 && c14365qy.m69877xk() <= 135) {
                            c11896dy3 = new C11896dy();
                            c11896dy3.m55570to(new C12025x6[]{c12025x6Arr[1], c12025x6Arr[2], c12025x6Arr[6], c12025x6Arr[5]});
                            c0886d8.m5000kk(c11896dy3);
                            c11896dy2 = new C11896dy();
                            c11896dy2.m55570to(new C12025x6[]{c12025x6Arr[2], c12025x6Arr[3], c12025x6Arr[7], c12025x6Arr[6]});
                        } else if (c14365qy.m69877xk() > 135 && c14365qy.m69877xk() <= 180) {
                            c11896dy3 = new C11896dy();
                            c11896dy3.m55570to(new C12025x6[]{c12025x6Arr[2], c12025x6Arr[3], c12025x6Arr[7], c12025x6Arr[6]});
                            c0886d8.m5000kk(c11896dy3);
                            c11896dy2 = new C11896dy();
                            c11896dy2.m55570to(new C12025x6[]{c12025x6Arr[1], c12025x6Arr[2], c12025x6Arr[6], c12025x6Arr[5]});
                        } else if (c14365qy.m69877xk() > 180 && c14365qy.m69877xk() <= 225) {
                            c11896dy3 = new C11896dy();
                            c11896dy3.m55570to(new C12025x6[]{c12025x6Arr[2], c12025x6Arr[3], c12025x6Arr[7], c12025x6Arr[6]});
                            c0886d8.m5000kk(c11896dy3);
                            c11896dy2 = new C11896dy();
                            c11896dy2.m55570to(new C12025x6[]{c12025x6Arr[3], c12025x6Arr[0], c12025x6Arr[4], c12025x6Arr[7]});
                        } else if (c14365qy.m69877xk() > 225 && c14365qy.m69877xk() <= 270) {
                            c11896dy3 = new C11896dy();
                            c11896dy3.m55570to(new C12025x6[]{c12025x6Arr[3], c12025x6Arr[0], c12025x6Arr[4], c12025x6Arr[7]});
                            c0886d8.m5000kk(c11896dy3);
                            c11896dy2 = new C11896dy();
                            c11896dy2.m55570to(new C12025x6[]{c12025x6Arr[2], c12025x6Arr[3], c12025x6Arr[7], c12025x6Arr[6]});
                        } else {
                            if (c14365qy.m69877xk() <= 270 || c14365qy.m69877xk() > 315) {
                                if (c14365qy.m69877xk() > 315 && c14365qy.m69877xk() < 360) {
                                    c11896dy3 = new C11896dy();
                                    c11896dy3.m55570to(new C12025x6[]{c12025x6Arr[0], c12025x6Arr[1], c12025x6Arr[5], c12025x6Arr[4]});
                                    c0886d8.m5000kk(c11896dy3);
                                    c11896dy2 = new C11896dy();
                                    c11896dy2.m55570to(new C12025x6[]{c12025x6Arr[3], c12025x6Arr[0], c12025x6Arr[4], c12025x6Arr[7]});
                                }
                                if (c14365qy.m69829dq() > 0) {
                                    if (f <= f2) {
                                        c11896dy = new C11896dy();
                                        c11896dy.m55570to(new C12025x6[]{c12025x6Arr[4], c12025x6Arr[5], c12025x6Arr[6], c12025x6Arr[7]});
                                    } else {
                                        c11896dy = new C11896dy();
                                        c11896dy.m55570to(new C12025x6[]{c12025x6Arr[c], c12025x6Arr[c3], c12025x6Arr[c2], c12025x6Arr[3]});
                                    }
                                    c0886d8.m4993k4(c11896dy, 0.6666667f);
                                } else {
                                    if (c14365qy.m69829dq() >= 0) {
                                        return;
                                    }
                                    if (f <= f2) {
                                        c11896dy = new C11896dy();
                                        c11896dy.m55570to(new C12025x6[]{c12025x6Arr[c], c12025x6Arr[c3], c12025x6Arr[c2], c12025x6Arr[3]});
                                    } else {
                                        c11896dy = new C11896dy();
                                        c11896dy.m55570to(new C12025x6[]{c12025x6Arr[4], c12025x6Arr[5], c12025x6Arr[6], c12025x6Arr[7]});
                                    }
                                    c0886d8.m4993k4(c11896dy, 0.33333334f);
                                }
                                c0886d8.m4992k4(c11896dy);
                                return;
                            }
                            c11896dy3 = new C11896dy();
                            c11896dy3.m55570to(new C12025x6[]{c12025x6Arr[3], c12025x6Arr[0], c12025x6Arr[4], c12025x6Arr[7]});
                            c0886d8.m5000kk(c11896dy3);
                            c11896dy2 = new C11896dy();
                            c11896dy2.m55570to(new C12025x6[]{c12025x6Arr[0], c12025x6Arr[1], c12025x6Arr[5], c12025x6Arr[4]});
                        }
                    } else {
                        c11896dy3 = new C11896dy();
                        c3 = 1;
                        c11896dy3.m55570to(new C12025x6[]{c12025x6Arr[1], c12025x6Arr[2], c12025x6Arr[6], c12025x6Arr[5]});
                        c0886d8.m5000kk(c11896dy3);
                        c11896dy2 = new C11896dy();
                        c2 = 2;
                        c11896dy2.m55570to(new C12025x6[]{c12025x6Arr[0], c12025x6Arr[1], c12025x6Arr[5], c12025x6Arr[4]});
                    }
                }
                c0886d8.m4993k4(c11896dy2, 0.5f);
                c0886d8.m4992k4(c11896dy3);
                c0886d8.m4992k4(c11896dy2);
                if (c14365qy.m69829dq() > 0) {
                }
                c0886d8.m4992k4(c11896dy);
                return;
            }
            c = 0;
            f2 = 0.0f;
            c3 = 1;
            c2 = 2;
            c11896dy3 = new C11896dy();
            c11896dy3.m55570to(new C12025x6[]{c12025x6Arr[c], c12025x6Arr[1], c12025x6Arr[5], c12025x6Arr[4]});
            c0886d8.m5000kk(c11896dy3);
            c11896dy2 = new C11896dy();
            c11896dy2.m55570to(new C12025x6[]{c12025x6Arr[1], c12025x6Arr[2], c12025x6Arr[6], c12025x6Arr[5]});
            c0886d8.m4993k4(c11896dy2, 0.5f);
            c0886d8.m4992k4(c11896dy3);
            c0886d8.m4992k4(c11896dy2);
            if (c14365qy.m69829dq() > 0) {
            }
            c0886d8.m4992k4(c11896dy);
            return;
        }
        C11896dy c11896dy4 = new C11896dy();
        c11896dy4.m55570to(new C12025x6[]{c12025x6Arr[0], c12025x6Arr[1], c12025x6Arr[2], c12025x6Arr[3]});
        if (c14365qy.m69829dq() > 0) {
            c0886d8.m4993k4(c11896dy4, 0.6666667f);
        } else {
            c0886d8.m4993k4(c11896dy4, 0.33333334f);
        }
        c0886d8.m4992k4(c11896dy4);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0115  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m69081k4(C14365qy c14365qy, C0886d8 c0886d8, C12025x6[] c12025x6Arr, C12025x6[] c12025x6Arr2) {
        if (c12025x6Arr == null || c12025x6Arr2 == null || c0886d8 == null) {
            return;
        }
        C11896dy c11896dy = new C11896dy();
        c11896dy.m55570to(new C12025x6[]{c12025x6Arr[0], c12025x6Arr2[0], c12025x6Arr2[1], c12025x6Arr[1]});
        c11896dy.m55528h4();
        float f = 0.6666667f;
        if (c14365qy.m69877xk() == 0 || c14365qy.m69877xk() == 360 || c14365qy.m69877xk() == 180) {
            f = c12025x6Arr2[1].m56895kk() > c12025x6Arr2[0].m56895kk() ? 1.0f : 1.0f;
        } else if (c14365qy.m69877xk() == 90 || c14365qy.m69877xk() == 270) {
            if (c12025x6Arr2[0].m56895kk() > c12025x6Arr[0].m56895kk()) {
            }
        } else if (c12025x6Arr[1].m56897x1() != c12025x6Arr2[1].m56897x1() && c12025x6Arr[1].m56895kk() != c12025x6Arr2[1].m56895kk()) {
            float fM56895kk = ((0.0f - c12025x6Arr[1].m56895kk()) - (0.0f - c12025x6Arr2[1].m56895kk())) / (c12025x6Arr[1].m56897x1() - c12025x6Arr2[1].m56897x1());
            float fM56895kk2 = (0.0f - c12025x6Arr2[1].m56895kk()) - (c12025x6Arr2[1].m56897x1() * fM56895kk);
            float fM56895kk3 = 0.0f - c12025x6Arr2[0].m56895kk();
            float fM56897x1 = (c12025x6Arr2[0].m56897x1() * fM56895kk) + fM56895kk2;
            if ((c14365qy.m69877xk() <= 0 || c14365qy.m69877xk() >= 90) && (c14365qy.m69877xk() <= 270 || c14365qy.m69877xk() >= 360) ? c14365qy.m69877xk() <= 90 || c14365qy.m69877xk() >= 270 || fM56895kk3 >= fM56897x1 : fM56895kk3 <= fM56897x1) {
            }
        }
        c0886d8.m4993k4(c11896dy, f);
        c0886d8.m4997k4(c12025x6Arr[0].Clone(), c12025x6Arr2[0].Clone());
        c0886d8.m4997k4(c12025x6Arr2[0].Clone(), c12025x6Arr2[1].Clone());
        c0886d8.m4997k4(c12025x6Arr2[1].Clone(), c12025x6Arr[1].Clone());
        c0886d8.m4997k4(c12025x6Arr[1].Clone(), c12025x6Arr[0].Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public static C12025x6[] m69082k4(float f, float f2, float f3, float f4, int i, int i2, C14365qy c14365qy) {
        C12025x6 c12025x6M69064k4;
        C12025x6 c12025x6;
        float fOooO0O0 = ((OooOO0O.OooO0O0(c14365qy.m69834fa(), 0) & 65535) * f4) / 100.0f;
        C12025x6[] c12025x6Arr = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, 2);
        float fM64106h4 = c14365qy.m69833e0().m64106h4();
        float f5 = i2;
        float fM64117m9 = c14365qy.m69833e0().m64117m9() / f5;
        float f6 = f5 / 2.0f;
        float f7 = c14365qy.m69868wl().m73384dy().isPlotOrderReversed() ? (i2 + 1) - i : i;
        if (f7 > f6 || c14365qy.m69868wl().m73384dy().isPlotOrderReversed()) {
            float f8 = ((((f7 - f6) * fM64117m9) - (fOooO0O0 / 2.0f)) - f4) * 2.0f;
            if (f3 <= fM64106h4) {
                float f9 = (fM64106h4 - f3) * 2.0f;
                float f10 = f + f2;
                m69064k4(c14365qy, f10, f9, f8, 3).CloneTo(c12025x6Arr[0]);
                c12025x6M69064k4 = m69064k4(c14365qy, f10, f9, (f4 * 2.0f) + f8, 3);
                c12025x6 = c12025x6Arr[1];
            } else {
                float f11 = (f3 - fM64106h4) * 2.0f;
                float f12 = f + f2;
                m69064k4(c14365qy, f12, f11, f8, 2).CloneTo(c12025x6Arr[0]);
                c12025x6M69064k4 = m69064k4(c14365qy, f12, f11, (f4 * 2.0f) + f8, 2);
                c12025x6 = c12025x6Arr[1];
            }
        } else {
            float f13 = ((fOooO0O0 / 2.0f) + ((f6 - f7) * fM64117m9) + f4) * 2.0f;
            if (f3 <= fM64106h4) {
                float f14 = (fM64106h4 - f3) * 2.0f;
                float f15 = f + f2;
                m69064k4(c14365qy, f15, f14, f13, 0).CloneTo(c12025x6Arr[0]);
                c12025x6M69064k4 = m69064k4(c14365qy, f15, f14, f13 - (f4 * 2.0f), 0);
                c12025x6 = c12025x6Arr[1];
            } else {
                float f16 = (f3 - fM64106h4) * 2.0f;
                float f17 = f + f2;
                m69064k4(c14365qy, f17, f16, f13, 1).CloneTo(c12025x6Arr[0]);
                c12025x6M69064k4 = m69064k4(c14365qy, f17, f16, f13 - (f4 * 2.0f), 1);
                c12025x6 = c12025x6Arr[1];
            }
        }
        c12025x6M69064k4.CloneTo(c12025x6);
        return c12025x6Arr;
    }
}
