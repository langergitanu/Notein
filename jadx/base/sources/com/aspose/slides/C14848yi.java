package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.yi */
/* JADX INFO: loaded from: classes3.dex */
class C14848yi {

    /* JADX INFO: renamed from: k4 */
    private final C14365qy f50358k4;

    public C14848yi(C14365qy c14365qy) {
        this.f50358k4 = c14365qy;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0112  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m73899k4() {
        double d;
        double dM73389ix;
        int i;
        float f;
        int i2;
        int i3;
        float f2;
        int i4;
        int i5;
        float f3;
        float f4;
        float f5;
        float f6;
        List list;
        int i6;
        double d2;
        float f7;
        C14848yi c14848yi = this;
        int i7 = 0;
        int i8 = 1;
        if (c14848yi.f50358k4.m69854ne().m73384dy().getCategoryAxisType() == 1) {
            throw new NotImplementedException("Not Implemented rendering date or time for 3-D Stacked Column Chart");
        }
        int iM69819to = C14365qy.m69819to(c14848yi.f50358k4.m69865up());
        List<C13847mr> listM69865up = c14848yi.f50358k4.m69865up();
        C14787xi c14787xiM69854ne = c14848yi.f50358k4.m69854ne();
        C14787xi c14787xiM69863u4 = c14848yi.f50358k4.m69863u4();
        int iM72789k4 = C14743wm.m72789k4(listM69865up);
        if (iM72789k4 == 1) {
            dM73389ix = c14787xiM69863u4.m73410ne();
        } else {
            if (iM72789k4 != 2) {
                d = 0.0d;
                float fM64100du = c14848yi.f50358k4.m69833e0().m64100du();
                double dM73389ix2 = c14787xiM69863u4.m73389ix();
                double dM73410ne = c14787xiM69863u4.m73410ne();
                float f8 = (float) (dM73389ix2 - dM73410ne);
                float fM64114kk = !c14787xiM69863u4.m73384dy().isPlotOrderReversed() ? c14848yi.f50358k4.m69833e0().m64114kk() - (((float) C14116yg.m67475k4((dM73389ix2 - d) / ((double) f8))) * fM64100du) : c14848yi.f50358k4.m69833e0().m64114kk() - (((float) C14116yg.m67475k4((dM73410ne - d) / ((double) f8))) * fM64100du);
                List list2 = new List();
                IRotation3D rotation3D = c14848yi.f50358k4.m69834fa().getRotation3D();
                float fM64121to = c14848yi.f50358k4.m69833e0().m64121to() / iM69819to;
                float fM64110k4 = c14848yi.f50358k4.m69833e0().m64110k4(false, iM69819to, 1);
                float fM64102dy = c14848yi.f50358k4.m69833e0().m64102dy() * ((rotation3D.getDepthPercents() & 65535) / 100.0f);
                float gapWidth = ((c14848yi.f50358k4.m69834fa().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth() & 65535) * fM64110k4) / 100.0f;
                float fOooO0O0 = ((OooOO0O.OooO0O0(c14848yi.f50358k4.m69834fa(), 0) & 65535) / 100.0f) * fM64102dy;
                float rotationY = 65535 & rotation3D.getRotationY();
                float rotationX = rotation3D.getRotationX();
                i = 0;
                while (i < iM69819to) {
                    int i9 = rotationY > 180.0f ? (iM69819to - 1) - i : i;
                    int i10 = i7;
                    float fM64124x1 = (gapWidth / 2.0f) + (i9 * fM64121to) + c14848yi.f50358k4.m69833e0().m64124x1();
                    float f9 = fM64102dy;
                    List<C0884d6> list3 = new List<>();
                    float f10 = f8;
                    int i11 = i10;
                    while (i11 < listM69865up.size()) {
                        C13847mr c13847mr = listM69865up.get_Item(i11);
                        int i12 = i8;
                        int iM64963x1 = c13847mr.m64963x1();
                        List<C0886d8> listM64944dy = c13847mr.m64944dy();
                        if (c14787xiM69854ne.m73384dy().isPlotOrderReversed()) {
                            f = rotationX;
                            i2 = (iM69819to - 1) - i9;
                        } else {
                            f = rotationX;
                            i2 = i9;
                        }
                        C0886d8 c0886d8 = listM64944dy.get_Item(i2);
                        if (c0886d8 == null || c0886d8.m4983dy()) {
                            i3 = iM72789k4;
                            f2 = rotationY;
                            i4 = i;
                            i5 = i9;
                            f3 = f10;
                            f4 = f;
                            f5 = f9;
                            f6 = fOooO0O0;
                            list = list2;
                        } else {
                            float f11 = fOooO0O0;
                            double[] dArr = new double[i12];
                            dArr[i10] = c0886d8.m4989k4();
                            float f12 = rotationY;
                            double[] dArr2 = new double[i12];
                            dArr2[i10] = 0.0d;
                            f2 = f12;
                            i4 = i;
                            i5 = i9;
                            f3 = f10;
                            f4 = f;
                            boolean zM63757k4 = kc0.m63757k4(dArr, dArr2, listM69865up, i11, i2, c14787xiM69863u4.m73389ix(), c14787xiM69863u4.m73410ne());
                            double d3 = dArr[i10];
                            double d4 = dArr2[i10];
                            if (zM63757k4) {
                                if (iM72789k4 == i12 && i11 == 0) {
                                    d2 = d3 - d;
                                } else {
                                    if (iM72789k4 == 2 && i11 == 0) {
                                        d3 -= d;
                                    }
                                    d2 = d3;
                                }
                                float f13 = (((float) d2) / f3) * fM64100du;
                                float f14 = ((((float) (d4 - d)) / f3) * fM64100du) - f13;
                                if (c14787xiM69863u4.m73384dy().isPlotOrderReversed()) {
                                    f7 = f14 + fM64114kk;
                                } else {
                                    f7 = fM64114kk - f14;
                                    f13 = -f13;
                                }
                                float f15 = f7;
                                float f16 = f13;
                                c14848yi = this;
                                i3 = iM72789k4;
                                double d5 = d2;
                                f5 = f9;
                                list = list2;
                                c14848yi.m73898k4(d5, new C0884d6(c0886d8, fM64124x1, f15, f16, d4), list3, c14787xiM69863u4);
                                C12025x6 c12025x6 = new C12025x6((fM64110k4 / 2.0f) + fM64124x1, (f16 / 2.0f) + f15);
                                f6 = f11;
                                float f17 = (f6 / 2.0f) + f5;
                                if (!rotation3D.getRightAngleAxes()) {
                                    f17 = (-f6) / 2.0f;
                                }
                                list.addItem(new C14319px(iM64963x1, i2, c12025x6.Clone(), f17));
                            } else {
                                i6 = i12;
                                i3 = iM72789k4;
                                f5 = f9;
                                list = list2;
                                f6 = f11;
                                i11++;
                                iM72789k4 = i3;
                                list2 = list;
                                i8 = i6;
                                f10 = f3;
                                rotationX = f4;
                                i = i4;
                                i9 = i5;
                                fOooO0O0 = f6;
                                f9 = f5;
                                rotationY = f2;
                            }
                        }
                        i6 = 1;
                        i11++;
                        iM72789k4 = i3;
                        list2 = list;
                        i8 = i6;
                        f10 = f3;
                        rotationX = f4;
                        i = i4;
                        i9 = i5;
                        fOooO0O0 = f6;
                        f9 = f5;
                        rotationY = f2;
                    }
                    int i13 = iM72789k4;
                    float f18 = rotationY;
                    float f19 = rotationX;
                    int i14 = i;
                    float f20 = f10;
                    float f21 = f9;
                    float f22 = fOooO0O0;
                    List list4 = list2;
                    int i15 = i10;
                    while (i15 < list3.size()) {
                        C0884d6 c0884d6 = list3.get_Item(i15);
                        if (f19 <= 0.0f) {
                            c0884d6 = list3.get_Item((list3.size() - 1) - i15);
                        }
                        C11896dy c11896dy = new C11896dy();
                        try {
                            int i16 = i13;
                            int i17 = i15;
                            c11896dy.m55579x1(new C12014ne(C7019kk.m27462to(Float.valueOf(fM64124x1), 13), C7019kk.m27462to(Float.valueOf(c0884d6.m4956x1() + c0884d6.m4954kk()), 13), C7019kk.m27462to(Float.valueOf(fM64110k4), 13), -C7019kk.m27462to(Float.valueOf(c0884d6.m4954kk()), 13)));
                            float f23 = (f22 / 2.0f) + f21;
                            if (!rotation3D.getRightAngleAxes()) {
                                f23 = (-f22) / 2.0f;
                            }
                            sim simVar = new sim(c0884d6.m4953k4(), c14848yi.f50358k4, c0884d6.m4955to());
                            c0884d6.m4953k4().m4994k4(c11896dy, f21, f23, new ilw((float) simVar.m70650k4(), (float) simVar.m70651x1()));
                            c11896dy.dispose();
                            i15 = i17 + 1;
                            i13 = i16;
                        } catch (Throwable th) {
                            c11896dy.dispose();
                            throw th;
                        }
                    }
                    list3.clear();
                    C13754l0.m64239k4(list4, c14848yi.f50358k4);
                    list4.clear();
                    i = i14 + 1;
                    list2 = list4;
                    fM64102dy = f21;
                    iM72789k4 = i13;
                    i7 = i10;
                    i8 = 1;
                    f8 = f20;
                    rotationY = f18;
                    rotationX = f19;
                    fOooO0O0 = f22;
                }
            }
            dM73389ix = c14787xiM69863u4.m73389ix();
        }
        d = dM73389ix;
        float fM64100du2 = c14848yi.f50358k4.m69833e0().m64100du();
        double dM73389ix22 = c14787xiM69863u4.m73389ix();
        double dM73410ne2 = c14787xiM69863u4.m73410ne();
        float f82 = (float) (dM73389ix22 - dM73410ne2);
        float fM64114kk2 = !c14787xiM69863u4.m73384dy().isPlotOrderReversed() ? c14848yi.f50358k4.m69833e0().m64114kk() - (((float) C14116yg.m67475k4((dM73389ix22 - d) / ((double) f82))) * fM64100du2) : c14848yi.f50358k4.m69833e0().m64114kk() - (((float) C14116yg.m67475k4((dM73410ne2 - d) / ((double) f82))) * fM64100du2);
        List list22 = new List();
        IRotation3D rotation3D2 = c14848yi.f50358k4.m69834fa().getRotation3D();
        float fM64121to2 = c14848yi.f50358k4.m69833e0().m64121to() / iM69819to;
        float fM64110k42 = c14848yi.f50358k4.m69833e0().m64110k4(false, iM69819to, 1);
        float fM64102dy2 = c14848yi.f50358k4.m69833e0().m64102dy() * ((rotation3D2.getDepthPercents() & 65535) / 100.0f);
        float gapWidth2 = ((c14848yi.f50358k4.m69834fa().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth() & 65535) * fM64110k42) / 100.0f;
        float fOooO0O02 = ((OooOO0O.OooO0O0(c14848yi.f50358k4.m69834fa(), 0) & 65535) / 100.0f) * fM64102dy2;
        float rotationY2 = 65535 & rotation3D2.getRotationY();
        float rotationX2 = rotation3D2.getRotationX();
        i = 0;
        while (i < iM69819to) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x015f  */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m73900x1() {
        int i;
        int i2;
        float f;
        float f2;
        int i3;
        List list;
        int i4;
        int i5;
        float f3;
        float f4;
        float f5;
        C14848yi c14848yi = this;
        int i6 = 0;
        int i7 = 1;
        if (c14848yi.f50358k4.m69854ne().m73384dy().getCategoryAxisType() == 1) {
            throw new NotImplementedException("Not Implemented rendering date or time for 3-D 100% Stacked Column Chart");
        }
        int iM69819to = C14365qy.m69819to(c14848yi.f50358k4.m69865up());
        List<C13847mr> listM69865up = c14848yi.f50358k4.m69865up();
        C14787xi c14787xiM69854ne = c14848yi.f50358k4.m69854ne();
        C14787xi c14787xiM69863u4 = c14848yi.f50358k4.m69863u4();
        float fM64114kk = c14848yi.f50358k4.m69833e0().m64114kk();
        float fM64100du = c14848yi.f50358k4.m69833e0().m64100du();
        float fM73389ix = (float) (c14787xiM69863u4.m73389ix() - c14787xiM69863u4.m73410ne());
        float fM67475k4 = fM64114kk - (((float) C14116yg.m67475k4((c14848yi.f50358k4.m69863u4().m73384dy().isPlotOrderReversed() ? c14787xiM69863u4.m73389ix() : c14787xiM69863u4.m73410ne()) / ((double) fM73389ix))) * fM64100du);
        IRotation3D rotation3D = c14848yi.f50358k4.m69834fa().getRotation3D();
        float fM64121to = c14848yi.f50358k4.m69833e0().m64121to() / iM69819to;
        float fM64110k4 = c14848yi.f50358k4.m69833e0().m64110k4(false, iM69819to, 1);
        float depthPercents = ((rotation3D.getDepthPercents() & 65535) / 100.0f) * c14848yi.f50358k4.m69833e0().m64102dy();
        float gapWidth = ((c14848yi.f50358k4.m69834fa().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth() & 65535) * fM64110k4) / 100.0f;
        float fOooO0O0 = ((OooOO0O.OooO0O0(c14848yi.f50358k4.m69834fa(), 0) & 65535) / 100.0f) * depthPercents;
        float rotationY = 65535 & rotation3D.getRotationY();
        float rotationX = rotation3D.getRotationX();
        float fM64124x1 = c14848yi.f50358k4.m69833e0().m64124x1();
        List list2 = new List();
        int i8 = 0;
        while (i8 < iM69819to) {
            int i9 = rotationY > 180.0f ? (iM69819to - 1) - i8 : i8;
            float f6 = (gapWidth / 2.0f) + (i9 * fM64121to) + fM64124x1;
            float f7 = rotationY;
            List<C0884d6> list3 = new List<>();
            int i10 = i9;
            int i11 = i6;
            while (i11 < listM69865up.size()) {
                C13847mr c13847mr = listM69865up.get_Item(i11);
                int iM64963x1 = c13847mr.m64963x1();
                List<C0886d8> listM64944dy = c13847mr.m64944dy();
                if (c14787xiM69854ne.m73384dy().isPlotOrderReversed()) {
                    i = i10;
                    i10 = (iM69819to - 1) - i10;
                } else {
                    i = i10;
                }
                C0886d8 c0886d8 = listM64944dy.get_Item(i10);
                if (c0886d8 == null || c0886d8.m4983dy()) {
                    i2 = i6;
                    f = fM73389ix;
                    f2 = rotationX;
                    i3 = i7;
                    list = list2;
                    i4 = i8;
                    i5 = i;
                    f3 = fOooO0O0;
                    f4 = depthPercents;
                } else {
                    double dM63751k4 = kc0.m63751k4(listM69865up, i10);
                    if (dM63751k4 != 0.0d) {
                        double dM4989k4 = c0886d8.m4989k4();
                        List list4 = list2;
                        double[] dArr = new double[i7];
                        dArr[i6] = dM4989k4;
                        i4 = i8;
                        double[] dArr2 = new double[i7];
                        dArr2[i6] = dM4989k4;
                        i2 = i6;
                        i3 = i7;
                        i5 = i;
                        list = list4;
                        boolean zM63758k4 = kc0.m63758k4(dArr, dArr2, listM69865up, i11, i10, dM63751k4, c14787xiM69863u4);
                        float f8 = fOooO0O0;
                        double d = dArr[i2];
                        double d2 = dArr2[i2];
                        if (zM63758k4) {
                            f = fM73389ix;
                            float f9 = (float) dM63751k4;
                            float f10 = (((((float) d) * 100.0f) / f9) / f) * fM64100du;
                            float f11 = ((((((float) d2) * 100.0f) / f9) / f) * fM64100du) - f10;
                            if (c14787xiM69863u4.m73384dy().isPlotOrderReversed()) {
                                f5 = f11 + fM67475k4;
                            } else {
                                f5 = fM67475k4 - f11;
                                f10 = -f10;
                            }
                            float f12 = f10;
                            float f13 = f5;
                            C0884d6 c0884d6 = new C0884d6(c0886d8, f6, f13, f12, d2);
                            f4 = depthPercents;
                            f2 = rotationX;
                            f3 = f8;
                            c14848yi = this;
                            c14848yi.m73898k4(d, c0884d6, list3, c14787xiM69863u4);
                            C12025x6 c12025x6 = new C12025x6((fM64110k4 / 2.0f) + f6, (f12 / 2.0f) + f13);
                            float f14 = (f3 / 2.0f) + f4;
                            if (!rotation3D.getRightAngleAxes()) {
                                f14 = (-f3) / 2.0f;
                            }
                            list.addItem(new C14319px(iM64963x1, i10, c12025x6.Clone(), f14));
                        } else {
                            c14848yi = this;
                            f = fM73389ix;
                            f4 = depthPercents;
                            f2 = rotationX;
                            f3 = f8;
                        }
                    }
                }
                i11++;
                depthPercents = f4;
                fOooO0O0 = f3;
                rotationX = f2;
                i8 = i4;
                i10 = i5;
                i7 = i3;
                fM73389ix = f;
                list2 = list;
                i6 = i2;
            }
            int i12 = i6;
            float f15 = fM73389ix;
            float f16 = rotationX;
            int i13 = i7;
            List list5 = list2;
            int i14 = i8;
            float f17 = fOooO0O0;
            float f18 = depthPercents;
            int i15 = i12;
            while (i15 < list3.size()) {
                C0884d6 c0884d62 = list3.get_Item(i15);
                if (f16 <= 0.0f) {
                    c0884d62 = list3.get_Item((list3.size() - 1) - i15);
                }
                C11896dy c11896dy = new C11896dy();
                try {
                    int i16 = i15;
                    c11896dy.m55579x1(new C12014ne(C7019kk.m27462to(Float.valueOf(f6), 13), C7019kk.m27462to(Float.valueOf(c0884d62.m4956x1() + c0884d62.m4954kk()), 13), C7019kk.m27462to(Float.valueOf(fM64110k4), 13), -C7019kk.m27462to(Float.valueOf(c0884d62.m4954kk()), 13)));
                    float f19 = (f17 / 2.0f) + f18;
                    if (!rotation3D.getRightAngleAxes()) {
                        f19 = (-f17) / 2.0f;
                    }
                    float f20 = f17;
                    List<C13847mr> list6 = listM69865up;
                    sim simVar = new sim(c0884d62.m4953k4(), c14848yi.f50358k4, c0884d62.m4955to());
                    c0884d62.m4953k4().m4994k4(c11896dy, f18, f19, new ilw((float) simVar.m70650k4(), (float) simVar.m70651x1()));
                    c11896dy.dispose();
                    i15 = i16 + 1;
                    listM69865up = list6;
                    f17 = f20;
                } catch (Throwable th) {
                    c11896dy.dispose();
                    throw th;
                }
            }
            float f21 = f17;
            list3.clear();
            C13754l0.m64239k4(list5, c14848yi.f50358k4);
            list5.clear();
            i8 = i14 + 1;
            depthPercents = f18;
            rotationX = f16;
            rotationY = f7;
            i7 = i13;
            fOooO0O0 = f21;
            fM73389ix = f15;
            list2 = list5;
            i6 = i12;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m73898k4(double d, C0884d6 c0884d6, List<C0884d6> list, C14787xi c14787xi) {
        if (list.size() == 0) {
            list.addItem(c0884d6);
            return;
        }
        int iM27462to = C7019kk.m27462to(Float.valueOf(c0884d6.m4956x1() + c0884d6.m4954kk() + 0.5f), 13);
        for (int i = 0; i < list.size(); i++) {
            C0884d6 c0884d62 = list.get_Item(i);
            int iM27462to2 = C7019kk.m27462to(Float.valueOf(c0884d62.m4956x1() + c0884d62.m4954kk() + 0.5f), 13);
            if (iM27462to > iM27462to2) {
                list.insertItem(i, c0884d6);
                return;
            }
            if (iM27462to == iM27462to2) {
                if (c14787xi.m73384dy().isPlotOrderReversed()) {
                    if (d > 0.0d) {
                        list.insertItem(i, c0884d6);
                        return;
                    }
                } else if (d < 0.0d) {
                    list.insertItem(i, c0884d6);
                    return;
                }
                list.insertItem(i + 1, c0884d6);
                return;
            }
            if (i == list.size() - 1) {
                list.addItem(c0884d6);
                return;
            }
        }
    }
}
