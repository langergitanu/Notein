package com.aspose.slides;

import Oooo0.C20856OooooOo;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.r7 */
/* JADX INFO: loaded from: classes3.dex */
class C14377r7 {

    /* JADX INFO: renamed from: k4 */
    private final C14365qy f48540k4;

    public C14377r7(C14365qy c14365qy) {
        this.f48540k4 = c14365qy;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0143  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m70029k4() {
        int i;
        double d;
        int i2;
        List<C0886d8> list;
        float f;
        List<C13847mr> list2;
        float f2;
        int i3;
        float f3;
        int i4;
        int i5;
        List list3;
        int i6 = 1;
        if (this.f48540k4.m69854ne().m73384dy().getCategoryAxisType() == 1) {
            throw new NotImplementedException("Not Implemented rendering date or time for 3-D Clustered Bar");
        }
        boolean zIsChartTypeBar = ChartTypeCharacterizer.isChartTypeBar(this.f48540k4.m69834fa().getType());
        int iM69819to = C14365qy.m69819to(this.f48540k4.m69865up());
        float fM72786k4 = C14743wm.m72786k4(C7019kk.m27462to(Float.valueOf(this.f48540k4.m69833e0().m64124x1()), 13), C7019kk.m27462to(Float.valueOf(this.f48540k4.m69833e0().m64121to()), 13), zIsChartTypeBar, this.f48540k4.m69863u4());
        double dM73430x6 = this.f48540k4.m69863u4().m73430x6();
        List<C13847mr> listM69865up = this.f48540k4.m69865up();
        C14787xi c14787xiM69854ne = this.f48540k4.m69854ne();
        C14787xi c14787xiM69863u4 = this.f48540k4.m69863u4();
        IRotation3D rotation3D = this.f48540k4.m69834fa().getRotation3D();
        int i7 = 0;
        float fOooO0O0 = (OooOO0O.OooO0O0(this.f48540k4.m69834fa(), 0) & 65535) / 100.0f;
        float gapWidth = (65535 & this.f48540k4.m69834fa().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth()) / 100.0f;
        float fM64100du = this.f48540k4.m69833e0().m64100du() / iM69819to;
        float f4 = fM64100du / (gapWidth + 1.0f);
        float f5 = f4 * gapWidth;
        float depthPercents = (((rotation3D.getDepthPercents() & 65535) / 100.0f) * fM64100du) / (fOooO0O0 + 1.0f);
        List list4 = new List();
        while (i7 < listM69865up.size()) {
            C13847mr c13847mr = listM69865up.get_Item((listM69865up.size() - i6) - i7);
            int iM64963x1 = c13847mr.m64963x1();
            List<C0886d8> listM64944dy = c13847mr.m64944dy();
            float f6 = depthPercents * fOooO0O0;
            float f7 = depthPercents + f6;
            int i8 = i7 + 1;
            C14787xi c14787xi = c14787xiM69854ne;
            float f8 = f6 / 2.0f;
            float fOooO00o = (i8 * f7) - f8;
            if (rotation3D.getRightAngleAxes()) {
                i = 1;
            } else {
                float f9 = -f7;
                i = 1;
                fOooO00o = (f9 * C20856OooooOo.OooO00o(1, i7, listM69865up)) - f8;
            }
            int i9 = 0;
            while (i9 < iM69819to) {
                float fM64114kk = this.f48540k4.m69833e0().m64114kk() - ((f5 / 2.0f) + (i9 * fM64100du));
                int i10 = c14787xi.m73384dy().isPlotOrderReversed() ? (iM69819to - 1) - i9 : i9;
                int i11 = i8;
                if (i10 < listM64944dy.size()) {
                    C0886d8 c0886d8 = i10 < listM64944dy.size() ? listM64944dy.get_Item(i10) : null;
                    if (c0886d8 == null || c0886d8.m4983dy()) {
                        f = fM72786k4;
                        i2 = iM69819to;
                        list = listM64944dy;
                        d = dM73430x6;
                        list2 = listM69865up;
                        f3 = depthPercents;
                        list3 = list4;
                        f2 = f4;
                        i3 = i9;
                        i4 = iM64963x1;
                        i5 = 1;
                    } else {
                        d = dM73430x6;
                        List<C0886d8> list5 = listM64944dy;
                        float fM73399kk = (((float) (c14787xiM69863u4.m73399kk(c0886d8.m4989k4()) - d)) / ((float) (c14787xiM69863u4.m73389ix() - c14787xiM69863u4.m73410ne()))) * this.f48540k4.m69833e0().m64121to();
                        if (c14787xiM69863u4.m73384dy().isPlotOrderReversed()) {
                            fM73399kk = -fM73399kk;
                        }
                        C11896dy c11896dy = new C11896dy();
                        i2 = iM69819to;
                        if (fM73399kk >= 0.0f) {
                            try {
                                list = list5;
                                c11896dy.m55578x1(new C12007ix(fM72786k4, fM64114kk - f4, fM73399kk, f4));
                                f = fM72786k4;
                                list2 = listM69865up;
                            } catch (Throwable th) {
                                c11896dy.dispose();
                                throw th;
                            }
                        } else {
                            list = list5;
                            f = fM72786k4;
                            list2 = listM69865up;
                            c11896dy.m55578x1(new C12007ix(fM72786k4 + fM73399kk, fM64114kk - f4, -fM73399kk, f4));
                        }
                        c0886d8.m4994k4(c11896dy, depthPercents, fOooO00o, new ilw(1.0f, 0.0f));
                        c11896dy.dispose();
                        int iM27462to = C7019kk.m27462to(Float.valueOf(this.f48540k4.m69833e0().m64121to()), 13);
                        float f10 = f4;
                        C14365qy c14365qy = this.f48540k4;
                        int i12 = i10;
                        f2 = f10;
                        List list6 = list4;
                        i3 = i9;
                        f3 = depthPercents;
                        i4 = iM64963x1;
                        i5 = 1;
                        C12015qq c12015qqClone = C13729ki.m63877k4(list2, i4, i12, iM27462to, c14365qy, c14365qy.m69854ne()).Clone();
                        list6.addItem(new C14821xx(i4, i12, new C12025x6((c12015qqClone.m56697kk() / 2.0f) + f + fM73399kk, (fM64114kk - (f2 / 2.0f)) - (c12015qqClone.m56697kk() / 2.0f)).Clone(), fOooO00o));
                        list3 = list6;
                    }
                }
                i9 = i3 + 1;
                f4 = f2;
                list4 = list3;
                iM64963x1 = i4;
                i = i5;
                i8 = i11;
                iM69819to = i2;
                listM64944dy = list;
                fM72786k4 = f;
                listM69865up = list2;
                depthPercents = f3;
                dM73430x6 = d;
            }
            int i13 = i8;
            i6 = i;
            c14787xiM69854ne = c14787xi;
            i7 = i13;
        }
        m70028k4(list4, this.f48540k4);
    }

    /* JADX INFO: renamed from: kk */
    public final void m70030kk() {
        int i;
        int i2;
        float f;
        C14377r7 c14377r7;
        int i3;
        float f2;
        double d;
        float f3;
        int i4;
        List list;
        float f4;
        List<C13847mr> list2;
        int i5;
        double d2;
        float f5;
        float f6;
        float f7;
        if (this.f48540k4.m69854ne().m73384dy().getCategoryAxisType() == 1) {
            throw new NotImplementedException("Not Implemented rendering date or time for 3-D Stacked Bar");
        }
        int iM69819to = C14365qy.m69819to(this.f48540k4.m69865up());
        List<C13847mr> listM69865up = this.f48540k4.m69865up();
        C14787xi c14787xiM69854ne = this.f48540k4.m69854ne();
        C14787xi c14787xiM69863u4 = this.f48540k4.m69863u4();
        float fM64124x1 = this.f48540k4.m69833e0().m64124x1();
        float fM64114kk = this.f48540k4.m69833e0().m64114kk();
        float fM64100du = this.f48540k4.m69833e0().m64100du();
        float fM64121to = this.f48540k4.m69833e0().m64121to();
        double dM73389ix = c14787xiM69863u4.m73389ix();
        double dM73410ne = c14787xiM69863u4.m73410ne();
        float fM67475k4 = c14787xiM69863u4.m73384dy().isPlotOrderReversed() ? (float) ((C14116yg.m67475k4(dM73389ix / (dM73389ix - dM73410ne)) * ((double) fM64121to)) + ((double) fM64124x1)) : (float) (((double) (fM64124x1 + fM64121to)) - ((dM73389ix / (dM73389ix - dM73410ne)) * ((double) fM64121to)));
        List list3 = new List();
        float f8 = fM64100du / iM69819to;
        C14377r7 c14377r72 = this;
        float fM64110k4 = c14377r72.f48540k4.m69833e0().m64110k4(true, iM69819to, 1);
        IRotation3D rotation3D = c14377r72.f48540k4.m69834fa().getRotation3D();
        float rotationY = rotation3D.getRotationY() & 65535;
        float depthPercents = ((rotation3D.getDepthPercents() & 65535) / 100.0f) * c14377r72.f48540k4.m69833e0().m64102dy();
        int i6 = 1;
        float gapWidth = ((c14377r72.f48540k4.m69834fa().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth() & 65535) * fM64110k4) / 100.0f;
        float fOooO0O0 = ((OooOO0O.OooO0O0(c14377r72.f48540k4.m69834fa(), 0) & 65535) / 100.0f) * depthPercents;
        float f9 = (fOooO0O0 / 2.0f) + depthPercents;
        if (!rotation3D.getRightAngleAxes()) {
            f9 = (-fOooO0O0) / 2.0f;
        }
        float f10 = f9;
        int i7 = 0;
        while (i7 < iM69819to) {
            float f11 = fM64110k4;
            List<C14835y6> list4 = new List<>();
            int i8 = i7 + 1;
            float f12 = fM67475k4;
            float f13 = fM64114kk - ((i8 * f8) - (gapWidth / 2.0f));
            float f14 = depthPercents;
            int i9 = 0;
            while (i9 < listM69865up.size()) {
                C13847mr c13847mr = listM69865up.get_Item(i9);
                int iM64963x1 = c13847mr.m64963x1();
                List<C0886d8> listM64944dy = c13847mr.m64944dy();
                if (c14787xiM69854ne.m73384dy().isPlotOrderReversed()) {
                    i = i8;
                    i2 = (iM69819to - 1) - i7;
                } else {
                    i = i8;
                    i2 = i7;
                }
                List list5 = list3;
                C0886d8 c0886d8 = i2 < listM64944dy.size() ? listM64944dy.get_Item(i2) : null;
                if (c0886d8 == null || c0886d8.m4983dy()) {
                    f = fM64124x1;
                    c14377r7 = c14377r72;
                    i3 = i7;
                    f2 = rotationY;
                    d = dM73410ne;
                    f3 = f11;
                    i4 = i;
                    list = list5;
                    f4 = fM64121to;
                    list2 = listM69865up;
                    i5 = i9;
                    d2 = dM73389ix;
                    f5 = f14;
                } else {
                    float f15 = rotationY;
                    int i10 = i6;
                    list2 = listM69865up;
                    double[] dArr = new double[i10];
                    dArr[0] = c0886d8.m4989k4();
                    int i11 = i7;
                    double[] dArr2 = new double[i10];
                    dArr2[0] = 0.0d;
                    float f16 = f14;
                    i4 = i;
                    i3 = i11;
                    f2 = f15;
                    boolean zM63757k4 = kc0.m63757k4(dArr, dArr2, list2, i9, i2, dM73389ix, dM73410ne);
                    C0886d8 c0886d82 = c0886d8;
                    d = dM73410ne;
                    i5 = i9;
                    d2 = dM73389ix;
                    double d3 = dArr[0];
                    double d4 = dArr2[0];
                    if (zM63757k4) {
                        float f17 = (float) d3;
                        float f18 = (float) (d2 - d);
                        float f19 = (f17 / f18) * fM64121to;
                        float f20 = (float) d4;
                        float f21 = ((f20 / f18) * fM64121to) - f19;
                        if (c14787xiM69863u4.m73384dy().isPlotOrderReversed()) {
                            f6 = f12 - f21;
                            f19 = -f19;
                        } else {
                            f6 = f21 + f12;
                            if (f6 < fM64124x1) {
                                f19 -= fM64124x1 - f6;
                                f7 = fM64124x1;
                            }
                            float f22 = f19;
                            C14835y6 c14835y6 = new C14835y6(c0886d82, f13, f7, f22, f20);
                            f = fM64124x1;
                            c14377r7 = c14377r72;
                            float f23 = f11;
                            f4 = fM64121to;
                            c14377r7.m70027k4(d3, c14835y6, list4, c14787xiM69863u4);
                            int iM27462to = C7019kk.m27462to(Float.valueOf(f4), 13);
                            int i12 = i2;
                            C14365qy c14365qy = c14377r7.f48540k4;
                            f3 = f23;
                            f5 = f16;
                            list = list5;
                            C12015qq c12015qqM63877k4 = C13729ki.m63877k4(list2, iM64963x1, i12, iM27462to, c14365qy, c14365qy.m69854ne());
                            list2 = list2;
                            C12015qq c12015qqClone = c12015qqM63877k4.Clone();
                            list.addItem(new C14821xx(iM64963x1, i12, new C12025x6(((f22 - c12015qqClone.m56697kk()) / 2.0f) + f7, ((f3 - c12015qqClone.m56699x1()) / 2.0f) + f13).Clone(), f10));
                        }
                        f7 = f6;
                        float f222 = f19;
                        C14835y6 c14835y62 = new C14835y6(c0886d82, f13, f7, f222, f20);
                        f = fM64124x1;
                        c14377r7 = c14377r72;
                        float f232 = f11;
                        f4 = fM64121to;
                        c14377r7.m70027k4(d3, c14835y62, list4, c14787xiM69863u4);
                        int iM27462to2 = C7019kk.m27462to(Float.valueOf(f4), 13);
                        int i122 = i2;
                        C14365qy c14365qy2 = c14377r7.f48540k4;
                        f3 = f232;
                        f5 = f16;
                        list = list5;
                        C12015qq c12015qqM63877k42 = C13729ki.m63877k4(list2, iM64963x1, i122, iM27462to2, c14365qy2, c14365qy2.m69854ne());
                        list2 = list2;
                        C12015qq c12015qqClone2 = c12015qqM63877k42.Clone();
                        list.addItem(new C14821xx(iM64963x1, i122, new C12025x6(((f222 - c12015qqClone2.m56697kk()) / 2.0f) + f7, ((f3 - c12015qqClone2.m56699x1()) / 2.0f) + f13).Clone(), f10));
                    } else {
                        f = fM64124x1;
                        c14377r7 = c14377r72;
                        f3 = f11;
                        list = list5;
                        f4 = fM64121to;
                        f5 = f16;
                        i9 = i5 + 1;
                        f14 = f5;
                        listM69865up = list2;
                        dM73389ix = d2;
                        fM64121to = f4;
                        rotationY = f2;
                        i7 = i3;
                        i8 = i4;
                        dM73410ne = d;
                        i6 = 1;
                        f11 = f3;
                        c14377r72 = c14377r7;
                        list3 = list;
                        fM64124x1 = f;
                    }
                }
                i9 = i5 + 1;
                f14 = f5;
                listM69865up = list2;
                dM73389ix = d2;
                fM64121to = f4;
                rotationY = f2;
                i7 = i3;
                i8 = i4;
                dM73410ne = d;
                i6 = 1;
                f11 = f3;
                c14377r72 = c14377r7;
                list3 = list;
                fM64124x1 = f;
            }
            float f24 = fM64124x1;
            float f25 = rotationY;
            int i13 = i8;
            double d5 = dM73410ne;
            List list6 = list3;
            C14377r7 c14377r73 = c14377r72;
            List<C13847mr> list7 = listM69865up;
            double d6 = dM73389ix;
            float f26 = f11;
            float f27 = fM64121to;
            float f28 = f14;
            int i14 = 0;
            while (i14 < list4.size()) {
                C14835y6 c14835y63 = f25 <= 180.0f ? list4.get_Item(i14) : list4.get_Item((list4.size() - 1) - i14);
                C11896dy c11896dy = new C11896dy();
                try {
                    float f29 = f24;
                    List<C14835y6> list8 = list4;
                    c11896dy.m55578x1(new C12007ix(c14835y63.m73751kk(), c14835y63.m73753x1(), c14835y63.m73752to(), f26));
                    int i15 = iM69819to;
                    int i16 = i14;
                    sim simVar = new sim(c14835y63.m73750k4(), c14377r73.f48540k4, c14835y63.m73749du());
                    c14835y63.m73750k4().m4994k4(c11896dy, f28, f10, new ilw((float) simVar.m70650k4(), (float) simVar.m70651x1()));
                    c11896dy.dispose();
                    i14 = i16 + 1;
                    f24 = f29;
                    list4 = list8;
                    iM69819to = i15;
                } catch (Throwable th) {
                    c11896dy.dispose();
                    throw th;
                }
            }
            float f30 = f24;
            i6 = 1;
            list4.clear();
            fM64110k4 = f26;
            depthPercents = f28;
            listM69865up = list7;
            dM73389ix = d6;
            fM64121to = f27;
            fM67475k4 = f12;
            rotationY = f25;
            i7 = i13;
            c14377r72 = c14377r73;
            list3 = list6;
            fM64124x1 = f30;
            dM73410ne = d5;
        }
        m70028k4(list3, c14377r72.f48540k4);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0151  */
    /* JADX INFO: renamed from: to */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m70031to() {
        int i;
        C14787xi c14787xi;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        int i6;
        List list;
        float f2;
        float f3;
        List<C13847mr> list2;
        float f4;
        C14377r7 c14377r7 = this;
        int i7 = 0;
        int i8 = 1;
        if (c14377r7.f48540k4.m69854ne().m73384dy().getCategoryAxisType() == 1) {
            throw new NotImplementedException("Not Implemented rendering date or time for 3-D 100% Stacked Bar");
        }
        int iM69819to = C14365qy.m69819to(c14377r7.f48540k4.m69865up());
        List<C13847mr> listM69865up = c14377r7.f48540k4.m69865up();
        C14787xi c14787xiM69854ne = c14377r7.f48540k4.m69854ne();
        C14787xi c14787xiM69863u4 = c14377r7.f48540k4.m69863u4();
        float fM64124x1 = c14377r7.f48540k4.m69833e0().m64124x1();
        float fM64114kk = c14377r7.f48540k4.m69833e0().m64114kk();
        float fM64100du = c14377r7.f48540k4.m69833e0().m64100du();
        float fM64121to = c14377r7.f48540k4.m69833e0().m64121to();
        double dM73389ix = c14787xiM69863u4.m73389ix();
        double dM73410ne = c14787xiM69863u4.m73410ne();
        float fM67475k4 = (((float) C14116yg.m67475k4(c14787xiM69863u4.m73384dy().isPlotOrderReversed() ? dM73389ix / (dM73389ix - dM73410ne) : dM73410ne / (dM73389ix - dM73410ne))) * fM64121to) + fM64124x1;
        List list3 = new List();
        float f5 = fM64100du / iM69819to;
        float fM64110k4 = c14377r7.f48540k4.m69833e0().m64110k4(true, iM69819to, 1);
        IRotation3D rotation3D = c14377r7.f48540k4.m69834fa().getRotation3D();
        float rotationY = rotation3D.getRotationY() & 65535;
        float depthPercents = ((rotation3D.getDepthPercents() & 65535) / 100.0f) * c14377r7.f48540k4.m69833e0().m64102dy();
        float gapWidth = ((c14377r7.f48540k4.m69834fa().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth() & 65535) * fM64110k4) / 100.0f;
        float fOooO0O0 = ((65535 & OooOO0O.OooO0O0(c14377r7.f48540k4.m69834fa(), 0)) / 100.0f) * depthPercents;
        float f6 = (fOooO0O0 / 2.0f) + depthPercents;
        if (!rotation3D.getRightAngleAxes()) {
            f6 = (-fOooO0O0) / 2.0f;
        }
        float f7 = f6;
        int i9 = 0;
        while (i9 < iM69819to) {
            float f8 = rotationY;
            List<C14835y6> list4 = new List<>();
            int i10 = i9 + 1;
            float f9 = fM64114kk - ((i10 * f5) - (gapWidth / 2.0f));
            int i11 = i7;
            while (i11 < listM69865up.size()) {
                C13847mr c13847mr = listM69865up.get_Item(i11);
                int iM64963x1 = c13847mr.m64963x1();
                List<C0886d8> listM64944dy = c13847mr.m64944dy();
                int i12 = c14787xiM69854ne.m73384dy().isPlotOrderReversed() ? (iM69819to - 1) - i9 : i9;
                C0886d8 c0886d8 = i12 < listM64944dy.size() ? listM64944dy.get_Item(i12) : null;
                if (c0886d8 == null || c0886d8.m4983dy()) {
                    C14787xi c14787xi2 = c14787xiM69863u4;
                    i = i9;
                    c14787xi = c14787xi2;
                    i2 = i7;
                    i3 = i8;
                    i4 = iM69819to;
                    i5 = i10;
                    f = depthPercents;
                    i6 = i11;
                    list = list3;
                    f2 = fM64110k4;
                    f3 = f7;
                    list2 = listM69865up;
                } else {
                    int i13 = i12;
                    double dM63751k4 = kc0.m63751k4(listM69865up, i13);
                    if (dM63751k4 != 0.0d) {
                        double dM4989k4 = c0886d8.m4989k4();
                        float f10 = depthPercents;
                        list2 = listM69865up;
                        double[] dArr = new double[i8];
                        dArr[i7] = dM4989k4;
                        int i14 = i10;
                        double[] dArr2 = new double[i8];
                        dArr2[i7] = dM4989k4;
                        i2 = i7;
                        f = f10;
                        i5 = i14;
                        boolean zM63758k4 = kc0.m63758k4(dArr, dArr2, list2, i11, i13, dM63751k4, c14787xiM69863u4);
                        i3 = i8;
                        i4 = iM69819to;
                        i6 = i11;
                        double d = dArr[i2];
                        List list5 = list3;
                        double d2 = dArr2[i2];
                        if (zM63758k4) {
                            float f11 = (float) dM63751k4;
                            float f12 = fM64110k4;
                            float f13 = f7;
                            float f14 = (float) (dM73389ix - dM73410ne);
                            float f15 = (((((float) d) * 100.0f) / f11) / f14) * fM64121to;
                            float f16 = (float) d2;
                            float f17 = ((((f16 * 100.0f) / f11) / f14) * fM64121to) - f15;
                            if (c14787xiM69863u4.m73384dy().isPlotOrderReversed()) {
                                f4 = fM67475k4 - f17;
                                f15 = -f15;
                            } else {
                                f4 = f17 + fM67475k4;
                            }
                            float f18 = f4;
                            float f19 = f15;
                            C14835y6 c14835y6 = new C14835y6(c0886d8, f9, f18, f19, f16);
                            C14787xi c14787xi3 = c14787xiM69863u4;
                            i = i9;
                            c14787xi = c14787xi3;
                            c14377r7 = this;
                            f2 = f12;
                            list = list5;
                            c14377r7.m70027k4(d, c14835y6, list4, c14787xi);
                            int iM27462to = C7019kk.m27462to(Float.valueOf(c14377r7.f48540k4.m69833e0().m64121to()), 13);
                            C14365qy c14365qy = c14377r7.f48540k4;
                            f3 = f13;
                            C12015qq c12015qqM63877k4 = C13729ki.m63877k4(list2, iM64963x1, i13, iM27462to, c14365qy, c14365qy.m69854ne());
                            list2 = list2;
                            C12015qq c12015qqClone = c12015qqM63877k4.Clone();
                            list.addItem(new C14821xx(iM64963x1, i13, new C12025x6(((f19 - c12015qqClone.m56697kk()) / 2.0f) + f18, ((f2 - c12015qqClone.m56699x1()) / 2.0f) + f9).Clone(), f3));
                        } else {
                            C14787xi c14787xi4 = c14787xiM69863u4;
                            i = i9;
                            c14787xi = c14787xi4;
                            c14377r7 = this;
                            f2 = fM64110k4;
                            f3 = f7;
                            list = list5;
                        }
                    }
                }
                i11 = i6 + 1;
                int i15 = i;
                c14787xiM69863u4 = c14787xi;
                i9 = i15;
                f7 = f3;
                list3 = list;
                fM64110k4 = f2;
                listM69865up = list2;
                i10 = i5;
                i8 = i3;
                iM69819to = i4;
                depthPercents = f;
                i7 = i2;
            }
            int i16 = i7;
            int i17 = i8;
            int i18 = iM69819to;
            int i19 = i10;
            float f20 = depthPercents;
            C14787xi c14787xi5 = c14787xiM69863u4;
            List list6 = list3;
            float f21 = fM64110k4;
            float f22 = f7;
            List<C13847mr> list7 = listM69865up;
            for (int i20 = i16; i20 < list4.size(); i20++) {
                C14835y6 c14835y62 = f8 <= 180.0f ? list4.get_Item(i20) : list4.get_Item((list4.size() - 1) - i20);
                C11896dy c11896dy = new C11896dy();
                try {
                    c11896dy.m55578x1(new C12007ix(c14835y62.m73751kk(), c14835y62.m73753x1(), c14835y62.m73752to(), f21));
                    sim simVar = new sim(c14835y62.m73750k4(), c14377r7.f48540k4, c14835y62.m73749du());
                    c14835y62.m73750k4().m4994k4(c11896dy, f20, f22, new ilw((float) simVar.m70650k4(), (float) simVar.m70651x1()));
                    c11896dy.dispose();
                } catch (Throwable th) {
                    c11896dy.dispose();
                    throw th;
                }
            }
            list4.clear();
            f7 = f22;
            c14787xiM69863u4 = c14787xi5;
            list3 = list6;
            fM64110k4 = f21;
            listM69865up = list7;
            rotationY = f8;
            i9 = i19;
            i8 = i17;
            iM69819to = i18;
            depthPercents = f20;
            i7 = i16;
        }
        m70028k4(list3, c14377r7.f48540k4);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m70032x1() {
        float f;
        float f2;
        int i;
        List list;
        int i2;
        int i3;
        if (this.f48540k4.m69854ne().m73384dy().getCategoryAxisType() == 1) {
            throw new NotImplementedException("Not Implemented rendering date or time for 3-D Clustered Bar");
        }
        boolean zIsChartTypeBar = ChartTypeCharacterizer.isChartTypeBar(this.f48540k4.m69834fa().getType());
        int iM69819to = C14365qy.m69819to(this.f48540k4.m69865up());
        float fM72786k4 = C14743wm.m72786k4(C7019kk.m27462to(Float.valueOf(this.f48540k4.m69833e0().m64124x1()), 13), C7019kk.m27462to(Float.valueOf(this.f48540k4.m69833e0().m64121to()), 13), zIsChartTypeBar, this.f48540k4.m69863u4());
        double dM73430x6 = this.f48540k4.m69863u4().m73430x6();
        List<C13847mr> listM69865up = this.f48540k4.m69865up();
        int size = listM69865up.size();
        C14787xi c14787xiM69854ne = this.f48540k4.m69854ne();
        C14787xi c14787xiM69863u4 = this.f48540k4.m69863u4();
        List list2 = new List();
        float fM64100du = this.f48540k4.m69833e0().m64100du() / iM69819to;
        float fM64110k4 = this.f48540k4.m69833e0().m64110k4(true, iM69819to, size);
        IRotation3D rotation3D = this.f48540k4.m69834fa().getRotation3D();
        float fM64102dy = this.f48540k4.m69833e0().m64102dy() * ((rotation3D.getDepthPercents() & 65535) / 100.0f);
        int i4 = 0;
        float gapWidth = ((this.f48540k4.m69834fa().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth() & 65535) * fM64110k4) / 100.0f;
        float fOooO0O0 = ((OooOO0O.OooO0O0(this.f48540k4.m69834fa(), 0) & 65535) / 100.0f) * fM64102dy;
        float f3 = (fOooO0O0 / 2.0f) + fM64102dy;
        if (!rotation3D.getRightAngleAxes()) {
            f3 = (-fOooO0O0) / 2.0f;
        }
        float f4 = f3;
        int i5 = 0;
        while (i5 < iM69819to) {
            if (c14787xiM69854ne.m73384dy().isPlotOrderReversed()) {
                listM69865up.reverse();
            }
            int i6 = i4;
            while (i6 < listM69865up.size()) {
                C13847mr c13847mr = listM69865up.get_Item(i6);
                List list3 = list2;
                int iM64963x1 = c13847mr.m64963x1();
                int i7 = i6 + 1;
                int i8 = iM69819to;
                float fM64114kk = this.f48540k4.m69833e0().m64114kk() - (((gapWidth / 2.0f) + (i5 * fM64100du)) + (i7 * fM64110k4));
                List<C0886d8> listM64944dy = c13847mr.m64944dy();
                int i9 = c14787xiM69854ne.m73384dy().isPlotOrderReversed() ? (i8 - 1) - i5 : i5;
                double d = dM73430x6;
                C0886d8 c0886d8 = i9 <= listM64944dy.size() ? listM64944dy.get_Item(i9) : null;
                if (c0886d8 == null || c0886d8.m4983dy()) {
                    f = fM72786k4;
                    f2 = fM64102dy;
                    i = i7;
                    list = list3;
                    i2 = i5;
                } else {
                    float fM73399kk = (((float) (c14787xiM69863u4.m73399kk(c0886d8.m4989k4()) - d)) / ((float) (c14787xiM69863u4.m73389ix() - c14787xiM69863u4.m73410ne()))) * this.f48540k4.m69833e0().m64121to();
                    if (c14787xiM69863u4.m73384dy().isPlotOrderReversed()) {
                        fM73399kk = -fM73399kk;
                    }
                    C11896dy c11896dy = new C11896dy();
                    List<C13847mr> list4 = listM69865up;
                    if (fM73399kk >= 0.0f) {
                        try {
                            c11896dy.m55578x1(new C12007ix(fM72786k4, fM64114kk, fM73399kk, fM64110k4));
                            f = fM72786k4;
                            i3 = iM64963x1;
                        } catch (Throwable th) {
                            c11896dy.dispose();
                            throw th;
                        }
                    } else {
                        f = fM72786k4;
                        i3 = iM64963x1;
                        c11896dy.m55578x1(new C12007ix(f + fM73399kk, fM64114kk, -fM73399kk, fM64110k4));
                    }
                    c0886d8.m4994k4(c11896dy, fM64102dy, f4, new ilw(1.0f, 0.0f));
                    c11896dy.dispose();
                    int iM27462to = C7019kk.m27462to(Float.valueOf(this.f48540k4.m69833e0().m64121to()), 13);
                    C14365qy c14365qy = this.f48540k4;
                    float f5 = fM64102dy;
                    int i10 = i9;
                    i = i7;
                    i2 = i5;
                    f2 = f5;
                    listM69865up = list4;
                    int i11 = i3;
                    C12015qq c12015qqClone = C13729ki.m63877k4(listM69865up, i11, i10, iM27462to, c14365qy, c14365qy.m69854ne()).Clone();
                    list3.addItem(new C14821xx(i11, i10, new C12025x6((c12015qqClone.m56697kk() / 2.0f) + f + fM73399kk, ((fM64110k4 - c12015qqClone.m56697kk()) / 2.0f) + fM64114kk).Clone(), f4));
                    list = list3;
                }
                i6 = i;
                list2 = list;
                fM64102dy = f2;
                i5 = i2;
                iM69819to = i8;
                dM73430x6 = d;
                fM72786k4 = f;
            }
            i5++;
            iM69819to = iM69819to;
            i4 = 0;
        }
        m70028k4(list2, this.f48540k4);
    }

    /* JADX INFO: renamed from: k4 */
    private void m70027k4(double d, C14835y6 c14835y6, List<C14835y6> list, C14787xi c14787xi) {
        float fM73751kk = c14835y6.m73751kk() + c14835y6.m73752to();
        if (list.size() == 0) {
            list.addItem(c14835y6);
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            C14835y6 c14835y62 = list.get_Item(i);
            float fM73751kk2 = c14835y62.m73751kk() + c14835y62.m73752to();
            if (fM73751kk < fM73751kk2) {
                list.insertItem(i, c14835y6);
                return;
            }
            if (fM73751kk == fM73751kk2) {
                if (c14787xi.m73384dy().isPlotOrderReversed()) {
                    if (d > 0.0d) {
                        list.insertItem(i, c14835y6);
                        return;
                    }
                } else if (d < 0.0d) {
                    list.insertItem(i, c14835y6);
                    return;
                }
                list.insertItem(i + 1, c14835y6);
                return;
            }
            if (i == list.size() - 1) {
                list.addItem(c14835y6);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m70028k4(List<C14821xx> list, C14365qy c14365qy) {
        List<C13847mr> listM69865up = c14365qy.m69865up();
        int i = 0;
        while (i < list.size()) {
            C14821xx c14821xx = list.get_Item(i);
            int iM73613k4 = c14821xx.m73613k4();
            int iM73616x1 = c14821xx.m73616x1();
            C12025x6 c12025x6Clone = c14821xx.m73614kk().Clone();
            C14365qy c14365qy2 = c14365qy;
            C12015qq c12015qqClone = C13729ki.m63877k4(listM69865up, iM73613k4, iM73616x1, C7019kk.m27462to(Float.valueOf(c14365qy.m69833e0().m64121to()), 13), c14365qy2, c14365qy.m69854ne()).Clone();
            C13754l0.m64237k4(listM69865up, iM73613k4, iM73616x1, new C12007ix(c12025x6Clone.m56897x1(), c12025x6Clone.m56895kk(), c12015qqClone.m56699x1(), c12015qqClone.m56697kk()).Clone(), c14365qy2, c14365qy2.m69854ne(), c14821xx.m73615to());
            i++;
            c14365qy = c14365qy2;
        }
    }
}
