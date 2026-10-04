package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.StyleIdentifier;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.b5 */
/* JADX INFO: loaded from: classes3.dex */
class C0798b5 {

    /* JADX INFO: renamed from: com.aspose.slides.b5$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: du */
        private double f4123du;

        /* JADX INFO: renamed from: k4 */
        private C0886d8 f4124k4;

        /* JADX INFO: renamed from: kk */
        private float f4125kk;

        /* JADX INFO: renamed from: to */
        private float f4126to;

        /* JADX INFO: renamed from: x1 */
        private float f4127x1;

        public k4(C0886d8 c0886d8, float f, float f2, float f3, double d) {
            this.f4124k4 = c0886d8;
            this.f4127x1 = f;
            this.f4125kk = f2;
            this.f4126to = f3;
            this.f4123du = d;
        }

        /* JADX INFO: renamed from: du */
        public final double m4018du() {
            return this.f4123du;
        }

        /* JADX INFO: renamed from: k4 */
        public final C0886d8 m4019k4() {
            return this.f4124k4;
        }

        /* JADX INFO: renamed from: kk */
        public final float m4020kk() {
            return this.f4125kk;
        }

        /* JADX INFO: renamed from: to */
        public final float m4021to() {
            return this.f4126to;
        }

        /* JADX INFO: renamed from: x1 */
        public final float m4022x1() {
            return this.f4127x1;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static C12025x6 m4004k4(C14365qy c14365qy, float f, float f2, float f3, float f4, float f5) {
        C12025x6 c12025x6M69064k4;
        C12025x6 c12025x6 = new C12025x6();
        float f6 = f5 + f4;
        float fM64106h4 = c14365qy.m69833e0().m64106h4();
        if (f6 <= fM64106h4) {
            c12025x6M69064k4 = C14285pi.m69064k4(c14365qy, f, (fM64106h4 - f6) * 2.0f, f3, f4 > f6 ? 0 : 3);
        } else {
            c12025x6M69064k4 = C14285pi.m69064k4(c14365qy, f, (f6 - fM64106h4) * 2.0f, f3, f4 > f6 ? 1 : 2);
        }
        c12025x6M69064k4.CloneTo(c12025x6);
        return new C12025x6(c12025x6.m56897x1(), C14285pi.m69064k4(c14365qy, f, 1.0f, f3, 0).Clone().m56895kk() - ((f2 + (f3 * ((float) C14116yg.m67495m9((((double) c14365qy.m69829dq()) * 3.141592653589793d) / 180.0d)))) / 2.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0116  */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r41v0 */
    /* JADX WARN: Type inference failed for: r41v1 */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r41v3 */
    /* JADX INFO: renamed from: kk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m4013kk(float f, double d, C14365qy c14365qy) {
        List list;
        int i;
        int i2;
        int i3;
        List<C13847mr> list2;
        int i4;
        ?? r41;
        int i5;
        float f2;
        List<Integer> list3;
        List list4;
        float f3;
        List<C13847mr> listM69865up = c14365qy.m69865up();
        C14787xi c14787xiM69854ne = c14365qy.m69854ne();
        C14787xi c14787xiM69863u4 = c14365qy.m69863u4();
        List list5 = new List();
        int i6 = 14;
        int iM27462to = C7019kk.m27462to(Double.valueOf(c14787xiM69854ne.m73389ix()), 14);
        int iM27462to2 = C7019kk.m27462to(Double.valueOf(c14787xiM69854ne.m73410ne()), 14);
        boolean z = false;
        int i7 = 1;
        int iM4455k4 = C0841c4.m4455k4(c14787xiM69854ne.m73384dy().getBaseUnitScale(), iM27462to, iM27462to2, iM27462to, false) + 1;
        float fM64100du = c14365qy.m69833e0().m64100du() / iM4455k4;
        float fM64110k4 = c14365qy.m69833e0().m64110k4(true, iM4455k4, 1);
        float fM64102dy = c14365qy.m69833e0().m64102dy();
        float fM27437dy = (C7019kk.m27437dy(Integer.valueOf(c14365qy.m69834fa().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth()), 8) * fM64110k4) / 100.0f;
        List<Integer> listM72791k4 = C14743wm.m72791k4(c14365qy.m69871x1(), false);
        int size = listM72791k4.size();
        int i8 = 0;
        while (i8 < size) {
            List list6 = new List();
            float fM64114kk = c14365qy.m69833e0().m64114kk() - ((fM27437dy / 2.0f) + (C0841c4.m4455k4(r11, C0841c4.m4457k4(r11, listM72791k4.get_Item(i8).intValue(), z), C7019kk.m27462to(Double.valueOf(c14787xiM69854ne.m73410ne()), i6), C7019kk.m27462to(Double.valueOf(c14787xiM69854ne.m73389ix()), i6), z) * fM64100du));
            List list7 = list6;
            int i9 = z ? 1 : 0;
            ?? r12 = z;
            while (i9 < listM69865up.size()) {
                C13847mr c13847mr = listM69865up.get_Item(i9);
                int iM64963x1 = c13847mr.m64963x1();
                List<C0886d8> listM64944dy = c13847mr.m64944dy();
                if (c14787xiM69854ne.m73384dy().isPlotOrderReversed()) {
                    list = list7;
                    i = (size - 1) - i8;
                } else {
                    list = list7;
                    i = i8;
                }
                C0886d8 c0886d8 = listM64944dy.get_Item(i);
                if (c0886d8 == null || c0886d8.m4983dy()) {
                    i2 = size;
                    i3 = i8;
                    list2 = listM69865up;
                    i4 = i9;
                    r41 = r12;
                    i5 = i7;
                    f2 = fM64100du;
                    list3 = listM72791k4;
                    list4 = list;
                } else {
                    double dM63751k4 = kc0.m63751k4(listM69865up, i);
                    if (dM63751k4 != 0.0d) {
                        double dM4989k4 = c0886d8.m4989k4();
                        int i10 = size;
                        double[] dArr = new double[i7];
                        dArr[r12] = dM4989k4;
                        int i11 = i8;
                        double[] dArr2 = new double[i7];
                        dArr2[r12] = dM4989k4;
                        r41 = r12;
                        list4 = list;
                        i2 = i10;
                        i3 = i11;
                        boolean zM63758k4 = kc0.m63758k4(dArr, dArr2, listM69865up, i9, i, dM63751k4, c14787xiM69863u4);
                        i5 = i7;
                        f2 = fM64100du;
                        double d2 = dArr[r41 == true ? 1 : 0];
                        double d3 = dArr2[r41 == true ? 1 : 0];
                        list2 = listM69865up;
                        if (zM63758k4) {
                            float f4 = (float) dM63751k4;
                            i4 = i9;
                            float fM73389ix = (((((float) d2) * 100.0f) / f4) / ((float) (c14787xiM69863u4.m73389ix() - c14787xiM69863u4.m73410ne()))) * c14365qy.m69833e0().m64121to();
                            float fM73389ix2 = ((((((float) d3) * 100.0f) / f4) / ((float) (c14787xiM69863u4.m73389ix() - c14787xiM69863u4.m73410ne()))) * c14365qy.m69833e0().m64121to()) - fM73389ix;
                            if (c14787xiM69863u4.m73384dy().isPlotOrderReversed()) {
                                f3 = f - fM73389ix2;
                                fM73389ix = -fM73389ix;
                            } else {
                                f3 = fM73389ix2 + f;
                            }
                            float f5 = f3;
                            float f6 = fM73389ix;
                            m4006k4(d2, new k4(c0886d8, fM64114kk, f5, f6, d3), (List<k4>) list4, c14787xiM69863u4);
                            list3 = listM72791k4;
                            list5.addItem(new C14821xx(iM64963x1, i, m4014x1(c14365qy, fM64114kk, fM64110k4, fM64102dy, f5, f6).Clone().Clone(), 0.0f));
                        } else {
                            i4 = i9;
                            list3 = listM72791k4;
                        }
                    }
                }
                i9 = i4 + 1;
                r12 = r41;
                listM72791k4 = list3;
                list7 = list4;
                size = i2;
                i8 = i3;
                i7 = i5;
                fM64100du = f2;
                listM69865up = list2;
            }
            int i12 = size;
            int i13 = i8;
            List<C13847mr> list8 = listM69865up;
            List list9 = list7;
            ?? r412 = r12;
            int i14 = i7;
            float f7 = fM64100du;
            List<Integer> list10 = listM72791k4;
            for (int i15 = r412 == true ? 1 : 0; i15 < list9.size(); i15++) {
                k4 k4Var = (k4) list9.get_Item(i15);
                m4011k4(k4Var.m4019k4(), k4Var.m4022x1(), fM64110k4, fM64102dy, k4Var.m4020kk(), k4Var.m4021to(), k4Var.m4018du(), c14365qy);
            }
            list9.clear();
            i8 = i13 + 1;
            z = r412 == true ? 1 : 0;
            listM72791k4 = list10;
            size = i12;
            i7 = i14;
            fM64100du = f7;
            listM69865up = list8;
            i6 = 14;
        }
        m4010k4(list5, c14365qy);
    }

    /* JADX INFO: renamed from: x1 */
    private static C12025x6 m4014x1(C14365qy c14365qy, float f, float f2, float f3, float f4, float f5) {
        float f6 = (f5 / 2.0f) + f4;
        float fM64106h4 = c14365qy.m69833e0().m64106h4();
        if (f6 <= fM64106h4) {
            return C14285pi.m69064k4(c14365qy, f - (f2 / 2.0f), (fM64106h4 - f6) * 2.0f, f3, 0);
        }
        return C14285pi.m69064k4(c14365qy, f - (f2 / 2.0f), (f6 - fM64106h4) * 2.0f, f3, 1);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m4005k4(double d, int i, C14365qy c14365qy) {
        int i2;
        List list;
        int i3;
        int i4;
        float fM64124x1;
        int i5 = i;
        C14365qy c14365qy2 = c14365qy;
        int i6 = 0;
        int i7 = 1;
        List<C13847mr> listM69865up = c14365qy2.m69865up();
        C14787xi c14787xiM69854ne = c14365qy2.m69854ne();
        C14787xi c14787xiM69863u4 = c14365qy2.m69863u4();
        float fM67475k4 = c14787xiM69863u4.m73384dy().isPlotOrderReversed() ? (((float) C14116yg.m67475k4(c14787xiM69863u4.m73389ix() / ((double) ((float) (c14787xiM69863u4.m73389ix() - c14787xiM69863u4.m73410ne()))))) * c14365qy2.m69833e0().m64121to()) + c14365qy2.m69833e0().m64124x1() : (c14365qy2.m69833e0().m64124x1() + c14365qy2.m69833e0().m64121to()) - ((((float) c14787xiM69863u4.m73389ix()) / ((float) (c14787xiM69863u4.m73389ix() - c14787xiM69863u4.m73410ne()))) * c14365qy2.m69833e0().m64121to());
        if (c14365qy2.m69854ne().m73384dy().getCategoryAxisType() == 1) {
            m4016x1(fM67475k4, d, c14365qy2);
            return;
        }
        List list2 = new List();
        float fM64100du = c14365qy2.m69833e0().m64100du() / i5;
        float fM64110k4 = c14365qy2.m69833e0().m64110k4(true, i5, 1);
        float fM64102dy = c14365qy2.m69833e0().m64102dy();
        float fM27437dy = (C7019kk.m27437dy(Integer.valueOf(c14365qy2.m69834fa().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth()), 8) * fM64110k4) / 100.0f;
        int i8 = 0;
        while (i8 < i5) {
            List list3 = new List();
            int i9 = i6;
            while (i9 < listM69865up.size()) {
                C13847mr c13847mr = listM69865up.get_Item(i9);
                int iM64963x1 = c13847mr.m64963x1();
                float fM64114kk = c14365qy2.m69833e0().m64114kk() - ((fM27437dy / 2.0f) + (i8 * fM64100du));
                List<C0886d8> listM64944dy = c13847mr.m64944dy();
                int i10 = c14787xiM69854ne.m73384dy().isPlotOrderReversed() ? (i5 - 1) - i8 : i8;
                C0886d8 c0886d8 = listM64944dy.get_Item(i10);
                if (c0886d8 == null || c0886d8.m4983dy()) {
                    i2 = i8;
                    list = list3;
                    i3 = i6;
                    i4 = i7;
                } else {
                    double[] dArr = new double[i7];
                    dArr[i6] = c0886d8.m4989k4();
                    int i11 = i10;
                    double[] dArr2 = new double[i7];
                    dArr2[i6] = 0.0d;
                    boolean zM63757k4 = kc0.m63757k4(dArr, dArr2, listM69865up, i9, i11, c14787xiM69863u4.m73389ix(), c14787xiM69863u4.m73410ne());
                    i3 = i6;
                    i4 = i7;
                    double d2 = dArr[i3];
                    double d3 = dArr2[i3];
                    if (zM63757k4) {
                        i2 = i8;
                        float f = fM64110k4;
                        float fM73389ix = (((float) d2) / ((float) (c14787xiM69863u4.m73389ix() - c14787xiM69863u4.m73410ne()))) * c14365qy.m69833e0().m64121to();
                        float fM73389ix2 = ((((float) d3) / ((float) (c14787xiM69863u4.m73389ix() - c14787xiM69863u4.m73410ne()))) * c14365qy.m69833e0().m64121to()) - fM73389ix;
                        if (c14787xiM69863u4.m73384dy().isPlotOrderReversed()) {
                            fM64124x1 = fM67475k4 - fM73389ix2;
                            fM73389ix = -fM73389ix;
                        } else {
                            fM64124x1 = fM73389ix2 + fM67475k4;
                            if (fM64124x1 < c14365qy.m69833e0().m64124x1()) {
                                fM73389ix -= c14365qy.m69833e0().m64124x1() - fM64124x1;
                                fM64124x1 = c14365qy.m69833e0().m64124x1();
                            }
                        }
                        float f2 = fM64124x1;
                        float f3 = fM73389ix;
                        m4006k4(d2, new k4(c0886d8, fM64114kk, f2, f3, d3), (List<k4>) list3, c14787xiM69863u4);
                        fM64110k4 = f;
                        list = list3;
                        list2.addItem(new C14821xx(iM64963x1, i11, m4014x1(c14365qy, fM64114kk, fM64110k4, fM64102dy, f2, f3).Clone().Clone(), 0.0f));
                    } else {
                        i2 = i8;
                        list = list3;
                    }
                }
                i9++;
                c14365qy2 = c14365qy;
                list3 = list;
                i6 = i3;
                i7 = i4;
                i8 = i2;
                i5 = i;
            }
            int i12 = i8;
            List list4 = list3;
            int i13 = i6;
            int i14 = i7;
            while (i6 < list4.size()) {
                k4 k4Var = (k4) list4.get_Item(i6);
                m4011k4(k4Var.m4019k4(), k4Var.m4022x1(), fM64110k4, fM64102dy, k4Var.m4020kk(), k4Var.m4021to(), k4Var.m4018du(), c14365qy);
                i6++;
                c14787xiM69863u4 = c14787xiM69863u4;
                fM67475k4 = fM67475k4;
                list2 = list2;
            }
            c14365qy2 = c14365qy;
            list4.clear();
            i8 = i12 + 1;
            i5 = i;
            i6 = i13;
            i7 = i14;
        }
        m4010k4(list2, c14365qy2);
    }

    /* JADX INFO: renamed from: x1 */
    public static void m4015x1(double d, int i, C14365qy c14365qy) {
        float fM64124x1;
        double dM73410ne;
        List<C13847mr> list;
        int i2;
        C14787xi c14787xi;
        int i3;
        int i4;
        C14787xi c14787xi2;
        float f;
        float f2;
        int i5;
        List list2;
        float f3;
        float f4;
        int i6 = i;
        C14365qy c14365qy2 = c14365qy;
        int i7 = 0;
        int i8 = 1;
        List<C13847mr> listM69865up = c14365qy2.m69865up();
        C14787xi c14787xiM69854ne = c14365qy2.m69854ne();
        C14787xi c14787xiM69863u4 = c14365qy2.m69863u4();
        if (c14787xiM69863u4.m73384dy().isPlotOrderReversed()) {
            fM64124x1 = c14365qy2.m69833e0().m64124x1();
            dM73410ne = c14787xiM69863u4.m73389ix();
        } else {
            fM64124x1 = c14365qy2.m69833e0().m64124x1();
            dM73410ne = c14787xiM69863u4.m73410ne();
        }
        float fM67475k4 = (((float) C14116yg.m67475k4(dM73410ne / ((double) ((float) (c14787xiM69863u4.m73389ix() - c14787xiM69863u4.m73410ne()))))) * c14365qy2.m69833e0().m64121to()) + fM64124x1;
        if (c14365qy2.m69854ne().m73384dy().getCategoryAxisType() == 1) {
            m4013kk(fM67475k4, d, c14365qy2);
            return;
        }
        List list3 = new List();
        float fM64100du = c14365qy2.m69833e0().m64100du() / i6;
        float fM64110k4 = c14365qy2.m69833e0().m64110k4(true, i6, 1);
        float fM64102dy = c14365qy2.m69833e0().m64102dy();
        float fM27437dy = (C7019kk.m27437dy(Integer.valueOf(c14365qy2.m69834fa().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth()), 8) * fM64110k4) / 100.0f;
        int i9 = 0;
        while (i9 < i6) {
            List list4 = new List();
            int i10 = i7;
            while (i10 < listM69865up.size()) {
                C13847mr c13847mr = listM69865up.get_Item(i10);
                int iM64963x1 = c13847mr.m64963x1();
                float fM64114kk = c14365qy2.m69833e0().m64114kk() - ((fM27437dy / 2.0f) + (i9 * fM64100du));
                List<C0886d8> listM64944dy = c13847mr.m64944dy();
                int i11 = c14787xiM69854ne.m73384dy().isPlotOrderReversed() ? (i6 - 1) - i9 : i9;
                C0886d8 c0886d8 = listM64944dy.get_Item(i11);
                if (c0886d8 == null || c0886d8.m4983dy()) {
                    list = listM69865up;
                    i2 = i10;
                    c14787xi = c14787xiM69863u4;
                    i3 = i7;
                    i4 = i8;
                    c14787xi2 = c14787xiM69854ne;
                    f = fM67475k4;
                    f2 = fM64102dy;
                    i5 = i9;
                } else {
                    i3 = i7;
                    int i12 = i11;
                    double dM63751k4 = kc0.m63751k4(listM69865up, i12);
                    if (dM63751k4 == 0.0d) {
                        i5 = i9;
                        list = listM69865up;
                        i2 = i10;
                        c14787xi = c14787xiM69863u4;
                        i4 = i8;
                        c14787xi2 = c14787xiM69854ne;
                        f = fM67475k4;
                        f2 = fM64102dy;
                    } else {
                        double dM4989k4 = c0886d8.m4989k4();
                        int i13 = i9;
                        double[] dArr = new double[i8];
                        dArr[i3] = dM4989k4;
                        List list5 = list4;
                        double[] dArr2 = new double[i8];
                        dArr2[i3] = dM4989k4;
                        i4 = i8;
                        i5 = i13;
                        list2 = list5;
                        boolean zM63758k4 = kc0.m63758k4(dArr, dArr2, listM69865up, i10, i12, dM63751k4, c14787xiM69863u4);
                        list = listM69865up;
                        c14787xi = c14787xiM69863u4;
                        i2 = i10;
                        double d2 = dArr[i3];
                        c14787xi2 = c14787xiM69854ne;
                        f = fM67475k4;
                        double d3 = dArr2[i3];
                        if (zM63758k4) {
                            float f5 = (float) dM63751k4;
                            float fM73389ix = (((((float) d2) * 100.0f) / f5) / ((float) (c14787xi.m73389ix() - c14787xi.m73410ne()))) * c14365qy.m69833e0().m64121to();
                            float fM73389ix2 = ((((((float) d3) * 100.0f) / f5) / ((float) (c14787xi.m73389ix() - c14787xi.m73410ne()))) * c14365qy.m69833e0().m64121to()) - fM73389ix;
                            if (c14787xi.m73384dy().isPlotOrderReversed()) {
                                f4 = f - fM73389ix2;
                                fM73389ix = -fM73389ix;
                            } else {
                                f4 = fM73389ix2 + f;
                            }
                            float f6 = f4;
                            float f7 = fM73389ix;
                            m4006k4(d2, new k4(c0886d8, fM64114kk, f6, f7, d3), (List<k4>) list2, c14787xi);
                            f3 = fM64110k4;
                            f2 = fM64102dy;
                            list3.addItem(new C14821xx(iM64963x1, i12, m4014x1(c14365qy, fM64114kk, f3, f2, f6, f7).Clone().Clone(), 0.0f));
                        } else {
                            f3 = fM64110k4;
                            f2 = fM64102dy;
                        }
                        i10 = i2 + 1;
                        i6 = i;
                        c14365qy2 = c14365qy;
                        fM64110k4 = f3;
                        fM64102dy = f2;
                        c14787xiM69863u4 = c14787xi;
                        i9 = i5;
                        list4 = list2;
                        i7 = i3;
                        i8 = i4;
                        listM69865up = list;
                        c14787xiM69854ne = c14787xi2;
                        fM67475k4 = f;
                    }
                }
                list2 = list4;
                f3 = fM64110k4;
                i10 = i2 + 1;
                i6 = i;
                c14365qy2 = c14365qy;
                fM64110k4 = f3;
                fM64102dy = f2;
                c14787xiM69863u4 = c14787xi;
                i9 = i5;
                list4 = list2;
                i7 = i3;
                i8 = i4;
                listM69865up = list;
                c14787xiM69854ne = c14787xi2;
                fM67475k4 = f;
            }
            List<C13847mr> list6 = listM69865up;
            C14787xi c14787xi3 = c14787xiM69863u4;
            int i14 = i7;
            int i15 = i8;
            C14787xi c14787xi4 = c14787xiM69854ne;
            float f8 = fM67475k4;
            float f9 = fM64102dy;
            int i16 = i9;
            List list7 = list4;
            float f10 = fM64110k4;
            int i17 = i14;
            while (i17 < list7.size()) {
                k4 k4Var = (k4) list7.get_Item(i17);
                m4011k4(k4Var.m4019k4(), k4Var.m4022x1(), f10, f9, k4Var.m4020kk(), k4Var.m4021to(), k4Var.m4018du(), c14365qy);
                i17++;
                c14787xi3 = c14787xi3;
            }
            c14365qy2 = c14365qy;
            list7.clear();
            i9 = i16 + 1;
            i6 = i;
            fM64110k4 = f10;
            fM64102dy = f9;
            c14787xiM69863u4 = c14787xi3;
            i7 = i14;
            i8 = i15;
            listM69865up = list6;
            c14787xiM69854ne = c14787xi4;
            fM67475k4 = f8;
        }
        m4010k4(list3, c14365qy2);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m4006k4(double d, k4 k4Var, List<k4> list, C14787xi c14787xi) {
        float fM4020kk = k4Var.m4020kk() + k4Var.m4021to();
        if (list.size() == 0) {
            list.addItem(k4Var);
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            k4 k4Var2 = list.get_Item(i);
            float fM4020kk2 = k4Var2.m4020kk() + k4Var2.m4021to();
            if (fM4020kk < fM4020kk2) {
                list.insertItem(i, k4Var);
                return;
            }
            if (fM4020kk == fM4020kk2) {
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
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r41v0 */
    /* JADX WARN: Type inference failed for: r41v1 */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r41v3 */
    /* JADX WARN: Type inference failed for: r41v4 */
    /* JADX WARN: Type inference failed for: r41v9 */
    /* JADX INFO: renamed from: x1 */
    private static void m4016x1(float f, double d, C14365qy c14365qy) {
        List<Integer> list;
        int i;
        int i2;
        List list2;
        int i3;
        C14787xi c14787xi;
        ?? r41;
        List<C13847mr> list3;
        float f2;
        List<C13847mr> listM69865up = c14365qy.m69865up();
        C14787xi c14787xiM69854ne = c14365qy.m69854ne();
        C14787xi c14787xiM69863u4 = c14365qy.m69863u4();
        List list4 = new List();
        int i4 = 14;
        int iM27462to = C7019kk.m27462to(Double.valueOf(c14787xiM69854ne.m73389ix()), 14);
        int iM27462to2 = C7019kk.m27462to(Double.valueOf(c14787xiM69854ne.m73410ne()), 14);
        boolean z = false;
        int iM4455k4 = C0841c4.m4455k4(c14787xiM69854ne.m73384dy().getBaseUnitScale(), iM27462to, iM27462to2, iM27462to, false) + 1;
        float fM64100du = c14365qy.m69833e0().m64100du() / iM4455k4;
        float fM64110k4 = c14365qy.m69833e0().m64110k4(true, iM4455k4, 1);
        float fM64102dy = c14365qy.m69833e0().m64102dy();
        float fM27437dy = (C7019kk.m27437dy(Integer.valueOf(c14365qy.m69834fa().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth()), 8) * fM64110k4) / 100.0f;
        List<Integer> listM72791k4 = C14743wm.m72791k4(c14365qy.m69871x1(), false);
        int size = listM72791k4.size();
        int i5 = 0;
        while (i5 < size) {
            List list5 = new List();
            float fM64114kk = c14365qy.m69833e0().m64114kk() - ((fM27437dy / 2.0f) + (C0841c4.m4455k4(r13, C0841c4.m4457k4(r13, listM72791k4.get_Item(i5).intValue(), z), C7019kk.m27462to(Double.valueOf(c14787xiM69854ne.m73410ne()), i4), C7019kk.m27462to(Double.valueOf(c14787xiM69854ne.m73389ix()), i4), z) * fM64100du));
            int i6 = i5;
            int i7 = z ? 1 : 0;
            ?? r14 = z;
            while (i7 < listM69865up.size()) {
                C13847mr c13847mr = listM69865up.get_Item(i7);
                int iM64963x1 = c13847mr.m64963x1();
                List<C0886d8> listM64944dy = c13847mr.m64944dy();
                int i8 = c14787xiM69854ne.m73384dy().isPlotOrderReversed() ? (size - 1) - i6 : i6;
                C0886d8 c0886d8 = listM64944dy.get_Item(i8);
                if (c0886d8 == null || c0886d8.m4983dy()) {
                    list = listM72791k4;
                    i = size;
                    i2 = i7;
                    list2 = list5;
                    i3 = i6;
                    c14787xi = c14787xiM69854ne;
                    r41 = r14;
                } else {
                    List<Integer> list6 = listM72791k4;
                    double[] dArr = new double[1];
                    dArr[r14] = c0886d8.m4989k4();
                    int i9 = size;
                    double[] dArr2 = new double[1];
                    dArr2[r14] = 0.0d;
                    List list7 = list5;
                    int i10 = i8;
                    r41 = r14;
                    i = i9;
                    list = list6;
                    i3 = i6;
                    list2 = list7;
                    boolean zM63757k4 = kc0.m63757k4(dArr, dArr2, listM69865up, i7, i10, c14787xiM69863u4.m73389ix(), c14787xiM69863u4.m73410ne());
                    i2 = i7 == true ? 1 : 0;
                    double d2 = dArr[r41 == true ? 1 : 0];
                    double d3 = dArr2[r41 == true ? 1 : 0];
                    if (zM63757k4) {
                        c14787xi = c14787xiM69854ne;
                        float fM73389ix = (((float) d2) / ((float) (c14787xiM69863u4.m73389ix() - c14787xiM69863u4.m73410ne()))) * c14365qy.m69833e0().m64121to();
                        list3 = listM69865up;
                        float fM73389ix2 = ((((float) d3) / ((float) (c14787xiM69863u4.m73389ix() - c14787xiM69863u4.m73410ne()))) * c14365qy.m69833e0().m64121to()) - fM73389ix;
                        if (c14787xiM69863u4.m73384dy().isPlotOrderReversed()) {
                            f2 = f - fM73389ix2;
                            fM73389ix = -fM73389ix;
                        } else {
                            f2 = fM73389ix2 + f;
                        }
                        float f3 = f2;
                        float f4 = fM73389ix;
                        m4006k4(d2, new k4(c0886d8, fM64114kk, f3, f4, d3), (List<k4>) list2, c14787xiM69863u4);
                        list4.addItem(new C14821xx(iM64963x1, i10, m4014x1(c14365qy, fM64114kk, fM64110k4, fM64102dy, f3, f4).Clone().Clone(), 0.0f));
                        i7 = i2 + 1;
                        r14 = r41;
                        listM69865up = list3;
                        list5 = list2;
                        listM72791k4 = list;
                        size = i;
                        i6 = i3;
                        c14787xiM69854ne = c14787xi;
                    } else {
                        c14787xi = c14787xiM69854ne;
                        r41 = r41;
                    }
                }
                list3 = listM69865up;
                i7 = i2 + 1;
                r14 = r41;
                listM69865up = list3;
                list5 = list2;
                listM72791k4 = list;
                size = i;
                i6 = i3;
                c14787xiM69854ne = c14787xi;
            }
            List<Integer> list8 = listM72791k4;
            int i11 = size;
            List list9 = list5;
            int i12 = i6;
            C14787xi c14787xi2 = c14787xiM69854ne;
            ?? r412 = r14;
            List<C13847mr> list10 = listM69865up;
            for (int i13 = r412 == true ? 1 : 0; i13 < list9.size(); i13++) {
                k4 k4Var = (k4) list9.get_Item(i13);
                m4011k4(k4Var.m4019k4(), k4Var.m4022x1(), fM64110k4, fM64102dy, k4Var.m4020kk(), k4Var.m4021to(), k4Var.m4018du(), c14365qy);
            }
            list9.clear();
            i5 = i12 + 1;
            z = r412 == true ? 1 : 0;
            listM69865up = list10;
            listM72791k4 = list8;
            size = i11;
            c14787xiM69854ne = c14787xi2;
            i4 = 14;
        }
        m4010k4(list4, c14365qy);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m4007k4(float f, double d, int i, C14365qy c14365qy) {
        int i2;
        int i3;
        int i4;
        int i5 = i;
        List<C13847mr> listM69865up = c14365qy.m69865up();
        int size = listM69865up.size();
        C14787xi c14787xiM69854ne = c14365qy.m69854ne();
        C14787xi c14787xiM69863u4 = c14365qy.m69863u4();
        float f2 = f;
        if (c14365qy.m69854ne().m73384dy().getCategoryAxisType() == 1) {
            m4008k4(f2, d, c14365qy);
            return;
        }
        List list = new List();
        float fM64100du = c14365qy.m69833e0().m64100du() / i5;
        float fM64110k4 = c14365qy.m69833e0().m64110k4(true, i5, size);
        float fM64102dy = c14365qy.m69833e0().m64102dy();
        int i6 = 0;
        float fM27437dy = (C7019kk.m27437dy(Integer.valueOf(c14365qy.m69834fa().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth()), 8) * fM64110k4) / 100.0f;
        int i7 = 0;
        while (i7 < i5) {
            if (c14787xiM69854ne.m73384dy().isPlotOrderReversed()) {
                listM69865up.reverse();
            }
            int i8 = i6;
            while (i8 < listM69865up.size()) {
                C13847mr c13847mr = listM69865up.get_Item(i8);
                int iM64963x1 = c13847mr.m64963x1();
                float fM64114kk = c14365qy.m69833e0().m64114kk() - (((fM27437dy / 2.0f) + (i7 * fM64100du)) + (i8 * fM64110k4));
                List<C0886d8> listM64944dy = c13847mr.m64944dy();
                int i9 = c14787xiM69854ne.m73384dy().isPlotOrderReversed() ? (i5 - 1) - i7 : i7;
                C0886d8 c0886d8 = listM64944dy.get_Item(i9);
                if (c0886d8 == null || c0886d8.m4983dy()) {
                    i2 = i7;
                    i3 = i8;
                    i4 = 0;
                } else {
                    int i10 = i7;
                    float fM73399kk = (((float) (c14787xiM69863u4.m73399kk(c0886d8.m4989k4()) - d)) / ((float) (c14787xiM69863u4.m73389ix() - c14787xiM69863u4.m73410ne()))) * c14365qy.m69833e0().m64121to();
                    if (c14787xiM69863u4.m73384dy().isPlotOrderReversed()) {
                        fM73399kk = -fM73399kk;
                    }
                    i2 = i10;
                    int i11 = i8;
                    float f3 = fM73399kk;
                    i3 = i11;
                    i4 = 0;
                    m4011k4(c0886d8, fM64114kk, fM64110k4, fM64102dy, f2, f3, Double.NaN, c14365qy);
                    list.addItem(new C14821xx(iM64963x1, i9, m4004k4(c14365qy, fM64114kk, fM64110k4, fM64102dy, f2, f3).Clone().Clone(), 0.0f));
                }
                i8 = i3 + 1;
                f2 = f;
                i5 = i;
                i6 = i4;
                i7 = i2;
            }
            i7++;
            f2 = f;
            i5 = i;
        }
        m4010k4(list, c14365qy);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00b7 A[PHI: r6 r10 r12
      0x00b7: PHI (r6v13 float) = (r6v9 float), (r6v15 float) binds: [B:31:0x012a, B:17:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x00b7: PHI (r10v41 int) = (r10v19 int), (r10v43 int) binds: [B:31:0x012a, B:17:0x00b5] A[DONT_GENERATE, DONT_INLINE]
      0x00b7: PHI (r12v34 int) = (r12v6 int), (r12v2 int) binds: [B:31:0x012a, B:17:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b4 A[PHI: r5 r10 r12
      0x01b4: PHI (r5v66 float) = (r5v64 float), (r5v70 float) binds: [B:60:0x0226, B:46:0x01b2] A[DONT_GENERATE, DONT_INLINE]
      0x01b4: PHI (r10v31 int) = (r10v27 int), (r10v37 int) binds: [B:60:0x0226, B:46:0x01b2] A[DONT_GENERATE, DONT_INLINE]
      0x01b4: PHI (r12v22 int) = (r12v16 int), (r12v28 int) binds: [B:60:0x0226, B:46:0x01b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m4017x1(C0886d8 c0886d8, C14365qy c14365qy, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8;
        int i;
        int iM27462to;
        float f9;
        float f10;
        float f11;
        float fOooO00o;
        float f12;
        int i2;
        int i3;
        float f13;
        int i4;
        int i5;
        int i6;
        float fM64106h4 = c14365qy.m69833e0().m64106h4();
        Dictionary dictionary = new Dictionary();
        Dictionary dictionary2 = new Dictionary();
        float f14 = 2.0f;
        float f15 = f - (f2 / 2.0f);
        int i7 = 0;
        while (i7 <= 90) {
            double d = (((double) i7) * 3.141592653589793d) / 180.0d;
            float fM67470dy = (float) (((double) (f3 * f7)) * C14116yg.m67470dy(d));
            double d2 = f15;
            float f16 = f14;
            float f17 = f15;
            double d3 = (f2 * f7) / f14;
            float fM67495m9 = (float) (d2 - (C14116yg.m67495m9(d) * d3));
            float fM67495m92 = (float) ((C14116yg.m67495m9(d) * d3) + d2);
            int i8 = 3;
            if (f4 <= fM64106h4) {
                f12 = (fM64106h4 - f4) * f16;
                int i9 = 180 - i7;
                if (!dictionary.containsKey(Integer.valueOf(i9))) {
                    dictionary.addItem(Integer.valueOf(i9), C14285pi.m69064k4(c14365qy, fM67495m9, f12, fM67470dy, 0).Clone());
                }
                int i10 = i7 + 180;
                if (!dictionary.containsKey(Integer.valueOf(i10))) {
                    dictionary.addItem(Integer.valueOf(i10), C14285pi.m69064k4(c14365qy, fM67495m92, f12, fM67470dy, 0).Clone());
                }
                if (!dictionary.containsKey(Integer.valueOf(i7))) {
                    dictionary.addItem(Integer.valueOf(i7), C14285pi.m69064k4(c14365qy, fM67495m9, f12, fM67470dy, 3).Clone());
                }
                i3 = 360 - i7;
                if (!dictionary.containsKey(Integer.valueOf(i3))) {
                    dictionary.addItem(Integer.valueOf(i3), C14285pi.m69064k4(c14365qy, fM67495m92, f12, fM67470dy, i8).Clone());
                }
            } else {
                f12 = (f4 - fM64106h4) * f16;
                int i11 = 180 - i7;
                if (dictionary.containsKey(Integer.valueOf(i11))) {
                    i2 = 1;
                } else {
                    i2 = 1;
                    dictionary.addItem(Integer.valueOf(i11), C14285pi.m69064k4(c14365qy, fM67495m9, f12, fM67470dy, 1).Clone());
                }
                int i12 = i7 + 180;
                if (!dictionary.containsKey(Integer.valueOf(i12))) {
                    dictionary.addItem(Integer.valueOf(i12), C14285pi.m69064k4(c14365qy, fM67495m92, f12, fM67470dy, i2).Clone());
                }
                if (dictionary.containsKey(Integer.valueOf(i7))) {
                    i8 = 2;
                } else {
                    i8 = 2;
                    dictionary.addItem(Integer.valueOf(i7), C14285pi.m69064k4(c14365qy, fM67495m9, f12, fM67470dy, 2).Clone());
                }
                i3 = 360 - i7;
                if (!dictionary.containsKey(Integer.valueOf(i3))) {
                }
            }
            float f18 = f4 + f5;
            float fM67470dy2 = (float) (C14116yg.m67470dy(d) * ((double) (f3 * f6)));
            double d4 = (f2 * f6) / f16;
            float fM67495m93 = (float) (d2 - (C14116yg.m67495m9(d) * d4));
            float fM67495m94 = (float) ((C14116yg.m67495m9(d) * d4) + d2);
            if (f18 <= fM64106h4) {
                f13 = (fM64106h4 - f18) * f16;
                int i13 = 180 - i7;
                if (!dictionary2.containsKey(Integer.valueOf(i13))) {
                    dictionary2.addItem(Integer.valueOf(i13), C14285pi.m69064k4(c14365qy, fM67495m93, f13, fM67470dy2, 0).Clone());
                }
                int i14 = i7 + 180;
                if (!dictionary2.containsKey(Integer.valueOf(i14))) {
                    dictionary2.addItem(Integer.valueOf(i14), C14285pi.m69064k4(c14365qy, fM67495m94, f13, fM67470dy2, 0).Clone());
                }
                if (dictionary2.containsKey(Integer.valueOf(i7))) {
                    i5 = 3;
                } else {
                    i5 = 3;
                    dictionary2.addItem(Integer.valueOf(i7), C14285pi.m69064k4(c14365qy, fM67495m93, f13, fM67470dy2, 3).Clone());
                }
                i6 = 360 - i7;
                if (!dictionary2.containsKey(Integer.valueOf(i6))) {
                    dictionary2.addItem(Integer.valueOf(i6), C14285pi.m69064k4(c14365qy, fM67495m94, f13, fM67470dy2, i5).Clone());
                }
            } else {
                f13 = (f18 - fM64106h4) * f16;
                int i15 = 180 - i7;
                if (dictionary2.containsKey(Integer.valueOf(i15))) {
                    i4 = 1;
                } else {
                    i4 = 1;
                    dictionary2.addItem(Integer.valueOf(i15), C14285pi.m69064k4(c14365qy, fM67495m93, f13, fM67470dy2, 1).Clone());
                }
                int i16 = i7 + 180;
                if (!dictionary2.containsKey(Integer.valueOf(i16))) {
                    dictionary2.addItem(Integer.valueOf(i16), C14285pi.m69064k4(c14365qy, fM67495m94, f13, fM67470dy2, i4).Clone());
                }
                if (dictionary2.containsKey(Integer.valueOf(i7))) {
                    i5 = 2;
                } else {
                    i5 = 2;
                    dictionary2.addItem(Integer.valueOf(i7), C14285pi.m69064k4(c14365qy, fM67495m93, f13, fM67470dy2, 2).Clone());
                }
                i6 = 360 - i7;
                if (!dictionary2.containsKey(Integer.valueOf(i6))) {
                }
            }
            i7++;
            f15 = f17;
            f14 = f16;
        }
        C12025x6 c12025x6 = new C12025x6();
        C12025x6 c12025x62 = new C12025x6();
        C12025x6[] c12025x6Arr = {c12025x6};
        C12025x6[] c12025x6Arr2 = {c12025x62};
        int[] iArr = {0};
        int[] iArr2 = {0};
        m4009k4(dictionary, c12025x6Arr, c12025x6Arr2, iArr, iArr2);
        c12025x6Arr[0].CloneTo(c12025x6);
        c12025x6Arr2[0].CloneTo(c12025x62);
        int i17 = iArr[0];
        int i18 = iArr2[0];
        C12025x6 c12025x63 = new C12025x6();
        C12025x6 c12025x64 = new C12025x6();
        C12025x6[] c12025x6Arr3 = {c12025x63};
        C12025x6[] c12025x6Arr4 = {c12025x64};
        m4009k4(dictionary2, c12025x6Arr3, c12025x6Arr4, new int[]{0}, new int[]{0});
        c12025x6Arr3[0].CloneTo(c12025x63);
        c12025x6Arr4[0].CloneTo(c12025x64);
        if (f5 != 0.0f) {
            int iM69829dq = c14365qy.m69829dq();
            float f19 = 90;
            float f20 = iM69829dq;
            float f21 = f19 - f20;
            f8 = 0.0f;
            while (f21 <= 270 - f20) {
                int iM27462to2 = C7019kk.m27462to(Float.valueOf(f21 % 360.0f), 13);
                C12025x6 c12025x6Clone = ((C12025x6) dictionary.get_Item(Integer.valueOf(iM27462to2))).Clone();
                C12025x6 c12025x6Clone2 = ((C12025x6) dictionary2.get_Item(Integer.valueOf(iM27462to2))).Clone();
                float f22 = f19;
                float f23 = 90 - iM69829dq;
                if (f21 == f23) {
                    c12025x62.CloneTo(c12025x6Clone);
                    c12025x64.CloneTo(c12025x6Clone2);
                }
                float f24 = f21 - f22;
                C12025x6 c12025x65 = c12025x62;
                float f25 = ((f24 != 30.0f || iM69829dq > 30) && f24 != 75.0f && (f24 != 120.0f || iM69829dq <= 30)) ? 11.75f : 23.5f;
                if (f21 == f23) {
                    float f26 = f20 % 11.75f;
                    if (f26 != 0.0f) {
                        f25 = f26;
                    }
                }
                float f27 = f21 + f25;
                int i19 = 270 - iM69829dq;
                int i20 = (f27 > i19 ? 1 : (f27 == i19 ? 0 : -1));
                if (i20 > 0) {
                    iM27462to = i19 % StyleIdentifier.LIST_TABLE_4_ACCENT_5;
                    i = i20;
                } else {
                    i = i20;
                    iM27462to = C7019kk.m27462to(Float.valueOf(f27 % 360.0f), 13);
                }
                C12025x6 c12025x6Clone3 = ((C12025x6) dictionary.get_Item(Integer.valueOf(iM27462to))).Clone();
                C12025x6 c12025x6Clone4 = ((C12025x6) dictionary2.get_Item(Integer.valueOf(iM27462to))).Clone();
                if (i >= 0) {
                    c12025x6.CloneTo(c12025x6Clone3);
                    c12025x63.CloneTo(c12025x6Clone4);
                }
                C12025x6 c12025x66 = c12025x6;
                C11896dy c11896dy = new C11896dy();
                C12025x6 c12025x67 = c12025x63;
                C12025x6 c12025x68 = c12025x64;
                C12025x6[] c12025x6Arr5 = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), C7019kk.m27462to(Float.valueOf(f25), 13) + 1));
                int iM27462to3 = C7019kk.m27462to(Float.valueOf(f21), 13);
                int i21 = 0;
                for (int i22 = 13; iM27462to3 <= C7019kk.m27462to(Float.valueOf(f25), i22) + C7019kk.m27462to(Float.valueOf(f21), i22); i22 = 13) {
                    ((C12025x6) dictionary.get_Item(Integer.valueOf(iM27462to3 % StyleIdentifier.LIST_TABLE_4_ACCENT_5))).CloneTo(c12025x6Arr5[i21]);
                    i21++;
                    iM27462to3++;
                }
                c11896dy.m55547k4(C22204OooOOOo.OooO00o(c12025x6Clone3, c11896dy, c12025x6Clone.Clone()), c12025x6Clone4.Clone());
                C12025x6[] c12025x6Arr6 = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), C7019kk.m27462to(Float.valueOf(f25), 13) + 1));
                int iM27462to4 = C7019kk.m27462to(Float.valueOf(f25), 13) + C7019kk.m27462to(Float.valueOf(f21), 13);
                int i23 = 0;
                for (int i24 = 13; iM27462to4 >= C7019kk.m27462to(Float.valueOf(f21), i24); i24 = 13) {
                    ((C12025x6) dictionary2.get_Item(Integer.valueOf(iM27462to4 % StyleIdentifier.LIST_TABLE_4_ACCENT_5))).CloneTo(c12025x6Arr6[i23]);
                    i23++;
                    iM27462to4--;
                }
                c11896dy.m55547k4(C22204OooOOOo.OooO00o(c12025x6Clone2, c11896dy, c12025x6Clone4.Clone()), c12025x6Clone.Clone());
                if (iM69829dq < 0 || iM69829dq > 30) {
                    if (f24 <= 120.0f) {
                        f11 = 0.6666666f;
                        fOooO00o = OooOOOO.OooO00o(f24, 180.0f, 0.5f, f11);
                    } else {
                        f9 = (f24 / 180.0f) * 0.5f;
                        f10 = 1.3333334f;
                        fOooO00o = f10 - f9;
                    }
                } else if (f24 <= 30.0f) {
                    f11 = 0.9166667f;
                    fOooO00o = OooOOOO.OooO00o(f24, 180.0f, 0.5f, f11);
                } else {
                    f9 = (f24 / 180.0f) * 0.5f;
                    f10 = 1.0833334f;
                    fOooO00o = f10 - f9;
                }
                if (fOooO00o == 1.0f) {
                    fOooO00o -= 0.011111111f;
                }
                c0886d8.m4993k4(c11896dy, fOooO00o);
                f21 = (f25 - 11.75f) + f21 + 11.75f;
                c12025x6 = c12025x66;
                c12025x62 = c12025x65;
                f19 = f22;
                c12025x63 = c12025x67;
                c12025x64 = c12025x68;
            }
        } else {
            f8 = 0.0f;
        }
        C12025x6 c12025x69 = c12025x6;
        C12025x6 c12025x610 = c12025x62;
        C12025x6 c12025x611 = c12025x63;
        C12025x6 c12025x612 = c12025x64;
        C12025x6[] c12025x6Arr7 = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), dictionary.size()));
        C12025x6[] c12025x6Arr8 = (C12025x6[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12025x6.class), dictionary2.size()));
        for (int i25 = 0; i25 <= 360; i25++) {
            ((C12025x6) dictionary.get_Item(Integer.valueOf(i25))).CloneTo(c12025x6Arr7[i25]);
            ((C12025x6) dictionary2.get_Item(Integer.valueOf(i25))).CloneTo(c12025x6Arr8[i25]);
        }
        C11896dy c11896dy2 = new C11896dy();
        c11896dy2.m55582x1(c12025x6Arr7);
        C11896dy c11896dy3 = new C11896dy();
        c11896dy3.m55582x1(c12025x6Arr8);
        if (c14365qy.m69877xk() == 0) {
            c0886d8.m4997k4(new C12025x6(c12025x610.m56897x1(), c12025x610.m56895kk()), new C12025x6(c12025x69.m56897x1(), c12025x69.m56895kk()));
            c0886d8.m4997k4(new C12025x6(c12025x612.m56897x1(), c12025x612.m56895kk()), new C12025x6(c12025x611.m56897x1(), c12025x611.m56895kk()));
        } else if (f5 > 0.0f) {
            c0886d8.m4993k4(c11896dy3, 0.7f);
            c0886d8.m4992k4(c11896dy3);
            C14285pi.m69076k4(c0886d8, i17, i18, (Dictionary<Integer, C12025x6>) dictionary);
        } else if (f5 < f8) {
            c0886d8.m4993k4(c11896dy2, f8);
            c0886d8.m4992k4(c11896dy2);
            C14285pi.m69076k4(c0886d8, i17, i18, (Dictionary<Integer, C12025x6>) dictionary2);
        } else {
            c0886d8.m4993k4(c11896dy2, 0.7f);
            c0886d8.m4992k4(c11896dy2);
        }
        if (f5 != 0.0f) {
            c0886d8.m4997k4(new C12025x6(c12025x610.m56897x1(), c12025x610.m56895kk()), new C12025x6(c12025x612.m56897x1(), c12025x612.m56895kk()));
            c0886d8.m4997k4(new C12025x6(c12025x69.m56897x1(), c12025x69.m56895kk()), new C12025x6(c12025x611.m56897x1(), c12025x611.m56895kk()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [int] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5, types: [int] */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX INFO: renamed from: k4 */
    private static void m4008k4(float f, double d, C14365qy c14365qy) {
        List<C13847mr> list;
        float f2;
        ?? r16;
        List<C13847mr> listM69865up = c14365qy.m69865up();
        C13743kq c13743kqM69833e0 = c14365qy.m69833e0();
        int size = listM69865up.size();
        C14787xi c14787xiM69854ne = c14365qy.m69854ne();
        C14787xi c14787xiM69863u4 = c14365qy.m69863u4();
        List list2 = new List();
        int i = 14;
        int iM27462to = C7019kk.m27462to(Double.valueOf(c14787xiM69854ne.m73389ix()), 14);
        int iM27462to2 = C7019kk.m27462to(Double.valueOf(c14787xiM69854ne.m73410ne()), 14);
        boolean z = false;
        int iM4455k4 = C0841c4.m4455k4(c14787xiM69854ne.m73384dy().getBaseUnitScale(), iM27462to, iM27462to2, iM27462to, false) + 1;
        float fM64100du = c13743kqM69833e0.m64100du() / iM4455k4;
        float fM64110k4 = c14365qy.m69833e0().m64110k4(true, iM4455k4, size);
        float fM64102dy = c14365qy.m69833e0().m64102dy();
        float fM27437dy = (C7019kk.m27437dy(Integer.valueOf(c14365qy.m69834fa().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth()), 8) * fM64110k4) / 100.0f;
        int size2 = C14743wm.m72791k4(c14365qy.m69871x1(), false).size();
        int i2 = 0;
        while (i2 < size2) {
            float f3 = fM64100du;
            float fM64114kk = (c14365qy.m69833e0().m64114kk() - ((fM27437dy / 2.0f) + (C0841c4.m4455k4(r9, C0841c4.m4457k4(r9, r6.get_Item(i2).intValue(), z), C7019kk.m27462to(Double.valueOf(c14787xiM69854ne.m73410ne()), i), C7019kk.m27462to(Double.valueOf(c14787xiM69854ne.m73389ix()), i), z) * f3))) + fM64110k4;
            ?? r12 = z;
            while (r12 < listM69865up.size()) {
                C13847mr c13847mr = listM69865up.get_Item(r12);
                int iM64963x1 = c13847mr.m64963x1();
                float f4 = fM64114kk - fM64110k4;
                List<C0886d8> listM64944dy = c13847mr.m64944dy();
                int i3 = c14787xiM69854ne.m73384dy().isPlotOrderReversed() ? (size2 - 1) - i2 : i2;
                C0886d8 c0886d8 = listM64944dy.get_Item(i3);
                if (c0886d8 == null || c0886d8.m4983dy()) {
                    list = listM69865up;
                    f2 = f4;
                    r16 = r12;
                } else {
                    list = listM69865up;
                    float fM73399kk = (((float) (c14787xiM69863u4.m73399kk(c0886d8.m4989k4()) - d)) / ((float) (c14787xiM69863u4.m73389ix() - c14787xiM69863u4.m73410ne()))) * c14365qy.m69833e0().m64121to();
                    if (c14787xiM69863u4.m73384dy().isPlotOrderReversed()) {
                        fM73399kk = -fM73399kk;
                    }
                    float f5 = fM73399kk;
                    f2 = f4;
                    m4011k4(c0886d8, f2, fM64110k4, fM64102dy, f, f5, Double.NaN, c14365qy);
                    C12025x6 c12025x6Clone = m4004k4(c14365qy, f2, fM64110k4, fM64102dy, f, f5).Clone().Clone();
                    r16 = r12 == true ? 1 : 0;
                    list2.addItem(new C14821xx(iM64963x1, i3, c12025x6Clone, 0.0f));
                }
                fM64114kk = f2;
                listM69865up = list;
                r12 = r16 + 1;
            }
            i2++;
            fM64100du = f3;
            i = 14;
            z = false;
        }
        m4010k4(list2, c14365qy);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m4009k4(Dictionary<Integer, C12025x6> dictionary, C12025x6[] c12025x6Arr, C12025x6[] c12025x6Arr2, int[] iArr, int[] iArr2) {
        C12025x6.f40591k4.CloneTo(c12025x6Arr[0]);
        C12025x6.f40591k4.CloneTo(c12025x6Arr2[0]);
        iArr[0] = 0;
        iArr2[0] = 0;
        Dictionary.Enumerator<Integer, C12025x6> it = dictionary.iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                if (C12025x6.m56883k4(c12025x6Arr[0], C12025x6.f40591k4) || ((C12025x6) next.getValue()).m56895kk() > c12025x6Arr[0].m56895kk()) {
                    ((C12025x6) next.getValue()).CloneTo(c12025x6Arr[0]);
                    iArr[0] = ((Integer) next.getKey()).intValue();
                }
                if (C12025x6.m56883k4(c12025x6Arr2[0], C12025x6.f40591k4) || ((C12025x6) next.getValue()).m56895kk() < c12025x6Arr2[0].m56895kk()) {
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
    private static void m4010k4(List<C14821xx> list, C14365qy c14365qy) {
        List<C13847mr> listM69865up = c14365qy.m69865up();
        int i = 0;
        while (i < list.size()) {
            C14821xx c14821xx = list.get_Item(i);
            int iM73613k4 = c14821xx.m73613k4();
            int iM73616x1 = c14821xx.m73616x1();
            C12025x6 c12025x6Clone = c14821xx.m73614kk().Clone();
            C14365qy c14365qy2 = c14365qy;
            C12015qq c12015qqClone = C13729ki.m63877k4(listM69865up, iM73613k4, iM73616x1, C7019kk.m27462to(Float.valueOf(c14365qy.m69833e0().m64121to()), 13), c14365qy2, c14365qy.m69854ne()).Clone();
            C13729ki.m63882k4(listM69865up, iM73613k4, iM73616x1, new C12007ix(c12025x6Clone.m56897x1(), c12025x6Clone.m56895kk(), c12015qqClone.m56699x1(), c12015qqClone.m56697kk()).Clone(), c14365qy2, c14365qy2.m69854ne());
            i++;
            c14365qy = c14365qy2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:91:0x01e5 A[PHI: r3 r12
      0x01e5: PHI (r3v18 double) = (r3v13 double), (r3v22 double) binds: [B:108:0x024a, B:89:0x01e1] A[DONT_GENERATE, DONT_INLINE]
      0x01e5: PHI (r12v4 double) = (r12v2 double), (r12v5 double) binds: [B:108:0x024a, B:89:0x01e1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0201 A[PHI: r2 r16
      0x0201: PHI (r2v10 double) = (r2v8 double), (r2v13 double) binds: [B:114:0x0259, B:96:0x01fe] A[DONT_GENERATE, DONT_INLINE]
      0x0201: PHI (r16v4 double) = (r16v1 double), (r16v6 double) binds: [B:114:0x0259, B:96:0x01fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m4011k4(C0886d8 c0886d8, float f, float f2, float f3, float f4, float f5, double d, C14365qy c14365qy) {
        double dM69058k4;
        double d2;
        double d3;
        double d4;
        double dM69058k42;
        C13847mr c13847mrM5012up = c0886d8.m5012up();
        int bar3DShape = c13847mrM5012up.m64945h4().getBar3DShape();
        if (bar3DShape == 0) {
            float f6 = (float) 1.0d;
            m4012k4(c0886d8, c14365qy, f, f2, f3, f4, f5, f6, f6);
            return;
        }
        double d5 = 0.0d;
        if (bar3DShape == 1) {
            if (ChartTypeCharacterizer.m758dy(c13847mrM5012up.m64945h4().getType()) || ChartTypeCharacterizer.m761jd(c13847mrM5012up.m64945h4().getType())) {
                double[] dArr = {0.0d};
                double[] dArr2 = {0.0d};
                C14285pi.m69070k4(c13847mrM5012up.m64941c5().m69865up(), c0886d8.m5007rv(), dArr, dArr2);
                double d6 = dArr[0];
                double d7 = dArr2[0];
                if (c0886d8.m4989k4() > 0.0d) {
                    double d8 = d6 == 0.0d ? 1.0d : (d6 - d) / d6;
                    dOooO00o = d6 != 0.0d ? C22206OooOOo0.OooO00o(d, c0886d8.m4989k4(), d6, d6) : 1.0d;
                    d5 = d8;
                } else {
                    double d9 = d7 == 0.0d ? 1.0d : (d7 - d) / d7;
                    dOooO00o = d7 != 0.0d ? C22206OooOOo0.OooO00o(d, c0886d8.m4989k4(), d7, d7) : 1.0d;
                    d5 = d9;
                }
            }
            m4017x1(c0886d8, c14365qy, f, f2, f3, f4, f5, (float) d5, (float) dOooO00o);
            return;
        }
        if (bar3DShape == 2) {
            if (ChartTypeCharacterizer.m758dy(c13847mrM5012up.m64945h4().getType())) {
                double[] dArr3 = {0.0d};
                double[] dArr4 = {0.0d};
                C14285pi.m69071k4(c13847mrM5012up.m64941c5().m69865up(), c0886d8.m5007rv(), dArr3, dArr4, c14365qy);
                d2 = dArr3[0];
                d3 = dArr4[0];
                if (c0886d8.m4989k4() > 0.0d) {
                    dM69058k4 = d2 == 0.0d ? 1.0d : (d2 - d) / d2;
                    if (d2 != 0.0d) {
                        dOooO00o = C22206OooOOo0.OooO00o(d, c0886d8.m4989k4(), d2, d2);
                    }
                } else {
                    d4 = d3 == 0.0d ? 1.0d : (d3 - d) / d3;
                    if (d3 != 0.0d) {
                        dOooO00o = C22206OooOOo0.OooO00o(d, c0886d8.m4989k4(), d3, d3);
                    }
                    dM69058k4 = d4;
                }
            } else if (ChartTypeCharacterizer.m761jd(c13847mrM5012up.m64945h4().getType())) {
                double[] dArr5 = {0.0d};
                double[] dArr6 = {0.0d};
                C14285pi.m69070k4(c13847mrM5012up.m64941c5().m69865up(), c0886d8.m5007rv(), dArr5, dArr6);
                d2 = dArr5[0];
                d3 = dArr6[0];
                if (c0886d8.m4989k4() > 0.0d) {
                    dM69058k4 = d2 == 0.0d ? 1.0d : (d2 - d) / d2;
                    if (d2 != 0.0d) {
                    }
                } else {
                    d4 = d3 == 0.0d ? 1.0d : (d3 - d) / d3;
                    if (d3 != 0.0d) {
                    }
                    dM69058k4 = d4;
                }
            } else {
                dM69058k4 = (float) C14285pi.m69058k4(c0886d8, c14365qy);
            }
            m4017x1(c0886d8, c14365qy, f, f2, f3, f4, f5, (float) dM69058k4, (float) dOooO00o);
            return;
        }
        if (bar3DShape == 3) {
            float f7 = (float) 1.0d;
            m4017x1(c0886d8, c14365qy, f, f2, f3, f4, f5, f7, f7);
            return;
        }
        if (bar3DShape == 4) {
            if (ChartTypeCharacterizer.m758dy(c13847mrM5012up.m64945h4().getType()) || ChartTypeCharacterizer.m761jd(c13847mrM5012up.m64945h4().getType())) {
                double[] dArr7 = {0.0d};
                double[] dArr8 = {0.0d};
                C14285pi.m69070k4(c13847mrM5012up.m64941c5().m69865up(), c0886d8.m5007rv(), dArr7, dArr8);
                double d10 = dArr7[0];
                double d11 = dArr8[0];
                if (c0886d8.m4989k4() > 0.0d) {
                    double d12 = d10 == 0.0d ? 1.0d : (d10 - d) / d10;
                    dOooO00o = d10 != 0.0d ? C22206OooOOo0.OooO00o(d, c0886d8.m4989k4(), d10, d10) : 1.0d;
                    d5 = d12;
                } else {
                    double d13 = d11 == 0.0d ? 1.0d : (d11 - d) / d11;
                    dOooO00o = d11 != 0.0d ? C22206OooOOo0.OooO00o(d, c0886d8.m4989k4(), d11, d11) : 1.0d;
                    d5 = d13;
                }
            }
            m4012k4(c0886d8, c14365qy, f, f2, f3, f4, f5, (float) d5, (float) dOooO00o);
            return;
        }
        if (bar3DShape != 5) {
            return;
        }
        if (ChartTypeCharacterizer.m758dy(c13847mrM5012up.m64945h4().getType())) {
            double[] dArr9 = {0.0d};
            double[] dArr10 = {0.0d};
            C14285pi.m69071k4(c13847mrM5012up.m64941c5().m69865up(), c0886d8.m5007rv(), dArr9, dArr10, c14365qy);
            double d14 = dArr9[0];
            double d15 = dArr10[0];
            if (c0886d8.m4989k4() > 0.0d) {
                dM69058k42 = d14 == 0.0d ? 1.0d : (d14 - d) / d14;
                if (d14 != 0.0d) {
                    dOooO00o = C22206OooOOo0.OooO00o(d, c0886d8.m4989k4(), d14, d14);
                }
            } else {
                dM69058k42 = d15 == 0.0d ? 1.0d : (d15 - d) / d15;
                if (d15 != 0.0d) {
                    dOooO00o = C22206OooOOo0.OooO00o(d, c0886d8.m4989k4(), d15, d15);
                }
            }
        } else if (ChartTypeCharacterizer.m761jd(c13847mrM5012up.m64945h4().getType())) {
            double[] dArr11 = {0.0d};
            double[] dArr12 = {0.0d};
            C14285pi.m69070k4(c13847mrM5012up.m64941c5().m69865up(), c0886d8.m5007rv(), dArr11, dArr12);
            double d16 = dArr11[0];
            double d17 = dArr12[0];
            if (c0886d8.m4989k4() > 0.0d) {
                dM69058k42 = d16 == 0.0d ? 1.0d : (d16 - d) / d16;
                if (d16 != 0.0d) {
                    dOooO00o = C22206OooOOo0.OooO00o(d, c0886d8.m4989k4(), d16, d16);
                }
            } else {
                double d18 = d17 == 0.0d ? 1.0d : (d17 - d) / d17;
                dOooO00o = d17 != 0.0d ? C22206OooOOo0.OooO00o(d, c0886d8.m4989k4(), d17, d17) : 1.0d;
                dM69058k42 = d18;
            }
        } else {
            dM69058k42 = (float) C14285pi.m69058k4(c0886d8, c14365qy);
        }
        m4012k4(c0886d8, c14365qy, f, f2, f3, f4, f5, (float) dM69058k42, (float) dOooO00o);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m4012k4(C0886d8 c0886d8, C14365qy c14365qy, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8;
        float f9;
        int i;
        int i2;
        C12025x6[] c12025x6Arr = (C12025x6[]) C22200OooO0o0.OooO00o(C12025x6.class, 8);
        float fM64106h4 = c14365qy.m69833e0().m64106h4();
        C12025x6.f40591k4.Clone();
        float f10 = 1.0f;
        float f11 = 2.0f;
        int i3 = 3;
        int i4 = 0;
        float f12 = f - (((1.0f - f7) * f2) / 2.0f);
        int i5 = 3;
        int i6 = 0;
        float f13 = f2 * f7;
        float f14 = f3 * f7;
        float f15 = f4;
        while (i6 < 2) {
            if (f15 <= fM64106h4) {
                float f16 = (fM64106h4 - f15) * f11;
                f8 = f10;
                f9 = f11;
                C14285pi.m69064k4(c14365qy, f12, f16, f14, i4).CloneTo(c12025x6Arr[i6]);
                int i7 = i6 + 4;
                i = i4;
                c12025x6Arr[i7].m56891k4(c12025x6Arr[i6].m56897x1());
                OooOOO.OooO0OO(c12025x6Arr[i6], c12025x6Arr[i7], f13);
                int i8 = i5 + i6;
                C14285pi.m69064k4(c14365qy, f12, f16, f14, i3).CloneTo(c12025x6Arr[i8]);
                int i9 = i8 + 4;
                c12025x6Arr[i9].m56891k4(c12025x6Arr[i8].m56897x1());
                OooOOO.OooO0OO(c12025x6Arr[i8], c12025x6Arr[i9], f13);
                i2 = i3;
            } else {
                f8 = f10;
                f9 = f11;
                i = i4;
                float f17 = (f15 - fM64106h4) * f9;
                C14285pi.m69064k4(c14365qy, f12, f17, f14, 1).CloneTo(c12025x6Arr[i6]);
                int i10 = i6 + 4;
                i2 = i3;
                c12025x6Arr[i10].m56891k4(c12025x6Arr[i6].m56897x1());
                OooOOO.OooO0OO(c12025x6Arr[i6], c12025x6Arr[i10], f13);
                int i11 = i5 + i6;
                C14285pi.m69064k4(c14365qy, f12, f17, f14, 2).CloneTo(c12025x6Arr[i11]);
                int i12 = i11 + 4;
                c12025x6Arr[i12].m56891k4(c12025x6Arr[i11].m56897x1());
                OooOOO.OooO0OO(c12025x6Arr[i11], c12025x6Arr[i12], f13);
            }
            f15 += f5;
            f12 = f - (((f8 - f6) * f2) / f9);
            f14 = f3 * f6;
            f13 = f2 * f6;
            i6++;
            f11 = f9;
            i5 = 1;
            f10 = f8;
            i4 = i;
            i3 = i2;
        }
        int i13 = i3;
        int i14 = i4;
        if (f5 != 0.0f) {
            C11896dy c11896dy = new C11896dy();
            c11896dy.m55570to(new C12025x6[]{c12025x6Arr[i14], c12025x6Arr[1], c12025x6Arr[5], c12025x6Arr[4]});
            c0886d8.m5000kk(c11896dy);
            C11896dy c11896dy2 = new C11896dy();
            c11896dy2.m55570to(new C12025x6[]{c12025x6Arr[4], c12025x6Arr[5], c12025x6Arr[6], c12025x6Arr[7]});
            c0886d8.m4993k4(c11896dy2, 0.6666667f);
            c0886d8.m4992k4(c11896dy);
            c0886d8.m4992k4(c11896dy2);
        }
        if (f5 > 0.0f) {
            C11896dy c11896dy3 = new C11896dy();
            c11896dy3.m55570to(new C12025x6[]{c12025x6Arr[1], c12025x6Arr[2], c12025x6Arr[6], c12025x6Arr[5]});
            c0886d8.m4993k4(c11896dy3, 0.5f);
            c0886d8.m4992k4(c11896dy3);
            return;
        }
        if (f5 < 0.0f) {
            C11896dy c11896dy4 = new C11896dy();
            c11896dy4.m55570to(new C12025x6[]{c12025x6Arr[i14], c12025x6Arr[i13], c12025x6Arr[7], c12025x6Arr[4]});
            c0886d8.m4993k4(c11896dy4, 0.0f);
            c0886d8.m4992k4(c11896dy4);
            return;
        }
        C11896dy c11896dy5 = new C11896dy();
        c11896dy5.m55570to(new C12025x6[]{c12025x6Arr[i14], c12025x6Arr[i13], c12025x6Arr[7], c12025x6Arr[4]});
        c0886d8.m4993k4(c11896dy5, 0.5f);
        c0886d8.m4992k4(c11896dy5);
    }
}
