package com.aspose.slides;

import Oooo0.C20856OooooOo;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12025x6;

/* JADX INFO: renamed from: com.aspose.slides.sa */
/* JADX INFO: loaded from: classes3.dex */
class C14441sa {

    /* JADX INFO: renamed from: k4 */
    private final C14365qy f48788k4;

    public C14441sa(C14365qy c14365qy) {
        this.f48788k4 = c14365qy;
    }

    /* JADX INFO: renamed from: k4 */
    private double m70495k4(List<C13847mr> list, C14787xi c14787xi) {
        double d = -1.7976931348623157E308d;
        for (int i = 0; i < list.size(); i++) {
            List<C0886d8> listM64944dy = list.get_Item(i).m64944dy();
            for (int i2 = 0; i2 < listM64944dy.size(); i2++) {
                C0886d8 c0886d8 = listM64944dy.get_Item(i2);
                if (c0886d8 != null) {
                    double dM73399kk = c14787xi.m73399kk(c0886d8.m4989k4());
                    if (dM73399kk > d) {
                        d = dM73399kk;
                    }
                }
            }
        }
        return d;
    }

    /* JADX INFO: renamed from: k4 */
    private float m70496k4(int i, int i2, int i3, boolean z) {
        if (i == 0 || !z) {
            return 1.0f;
        }
        return 0.92f - ((i3 * 0.1f) / i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x01ba  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m70497k4() {
        boolean z;
        int i;
        int i2;
        float f;
        float f2;
        List<C13847mr> list;
        C14787xi c14787xi;
        double d;
        float f3;
        List<C0886d8> list2;
        int i3;
        ilw ilwVar;
        float f4;
        C14787xi c14787xiM69854ne = this.f48788k4.m69854ne();
        if (c14787xiM69854ne.m73384dy().getCategoryAxisType() == 1) {
            throw new NotImplementedException("Not implemented rendering of CategoryAxisType.Date for 3-D Column Chart");
        }
        boolean zIsChartTypeBar = ChartTypeCharacterizer.isChartTypeBar(this.f48788k4.m69834fa().getType());
        int iM69819to = C14365qy.m69819to(this.f48788k4.m69865up());
        double dM73430x6 = this.f48788k4.m69863u4().m73430x6();
        float fM72786k4 = C14743wm.m72786k4(C7019kk.m27462to(Float.valueOf(this.f48788k4.m69833e0().m64114kk() - this.f48788k4.m69833e0().m64100du()), 13), C7019kk.m27462to(Float.valueOf(this.f48788k4.m69833e0().m64100du()), 13), zIsChartTypeBar, this.f48788k4.m69863u4());
        IRotation3D rotation3D = this.f48788k4.m69834fa().getRotation3D();
        List<C13847mr> listM69865up = this.f48788k4.m69865up();
        C14787xi c14787xiM69863u4 = this.f48788k4.m69863u4();
        float gapDepth = (listM69865up.get_Item(0).m64945h4().getParentSeriesGroup().getGapDepth() & 65535) / 100.0f;
        float gapWidth = (listM69865up.get_Item(0).m64945h4().getParentSeriesGroup().getGapWidth() & 65535) / 100.0f;
        float fM64121to = this.f48788k4.m69833e0().m64121to() / iM69819to;
        float f5 = fM64121to / (gapWidth + 1.0f);
        float f6 = gapWidth * f5;
        float depthPercents = (((rotation3D.getDepthPercents() & 65535) / 100.0f) * fM64121to) / (gapDepth + 1.0f);
        float rotationY = rotation3D.getRotationY() & 65535;
        double dM70495k4 = m70495k4(listM69865up, c14787xiM69863u4);
        List list3 = new List();
        int i4 = 0;
        while (i4 < listM69865up.size()) {
            float f7 = fM72786k4;
            int iOooO00o = C20856OooooOo.OooO00o(1, i4, listM69865up);
            if (this.f48788k4.m69868wl().m73384dy().isPlotOrderReversed()) {
                iOooO00o = C20856OooooOo.OooO00o(1, iOooO00o, listM69865up);
            }
            C13847mr c13847mr = listM69865up.get_Item(iOooO00o);
            int iM64963x1 = c13847mr.m64963x1();
            boolean z2 = c13847mr.m64945h4().getBar3DShape() == 5 || c13847mr.m64945h4().getBar3DShape() == 2;
            IRotation3D iRotation3D = rotation3D;
            float fM70496k4 = m70496k4(c13847mr.m64945h4().getBar3DShape(), listM69865up.size() - 1, i4, iRotation3D.getRightAngleAxes());
            List<C0886d8> listM64944dy = c13847mr.m64944dy();
            float f8 = depthPercents * gapDepth;
            float f9 = depthPercents + f8;
            float f10 = f6;
            int i5 = i4 + 1;
            float f11 = fM64121to;
            float f12 = f8 / 2.0f;
            float fOooO00o = (i5 * f9) - f12;
            if (iRotation3D.getRightAngleAxes()) {
                z = true;
            } else {
                z = true;
                fOooO00o = ((-f9) * C20856OooooOo.OooO00o(1, i4, listM69865up)) - f12;
            }
            int i6 = 0;
            while (i6 < iM69819to) {
                if (rotationY >= 180.0f) {
                    i = (iM69819to - 1) - i6;
                    i2 = i6;
                } else {
                    i = i6;
                    i2 = i;
                }
                float fM64124x1 = this.f48788k4.m69833e0().m64124x1() + (f10 / 2.0f) + (i * f11);
                if (c14787xiM69854ne.m73384dy().isPlotOrderReversed()) {
                    i = (iM69819to - 1) - i;
                }
                if (i < listM64944dy.size()) {
                    C0886d8 c0886d8 = i < listM64944dy.size() ? listM64944dy.get_Item(i) : null;
                    if (c0886d8 == null || c0886d8.m4983dy()) {
                        f3 = fM70496k4;
                        list2 = listM64944dy;
                        i3 = iM69819to;
                        d = dM73430x6;
                        list = listM69865up;
                        c14787xi = c14787xiM69863u4;
                        f4 = fOooO00o;
                        f = rotationY;
                        f2 = gapDepth;
                    } else {
                        f = rotationY;
                        f2 = gapDepth;
                        list = listM69865up;
                        c14787xi = c14787xiM69863u4;
                        double d2 = fM70496k4;
                        double dM73399kk = c14787xiM69863u4.m73399kk(c0886d8.m4989k4()) * d2;
                        int i7 = iM69819to;
                        d = dM73430x6;
                        float fM63750k4 = (((float) kc0.m63750k4(dM73430x6, dM73399kk)) / ((float) (c14787xi.m73389ix() - c14787xi.m73410ne()))) * this.f48788k4.m69833e0().m64100du();
                        if (c14787xi.m73384dy().isPlotOrderReversed()) {
                            fM63750k4 = -fM63750k4;
                        }
                        float fM64114kk = this.f48788k4.m69833e0().m64114kk() + fM63750k4;
                        C11896dy c11896dy = new C11896dy();
                        try {
                            f3 = fM70496k4;
                            list2 = listM64944dy;
                            int i8 = i;
                            i3 = i7;
                            c11896dy.m55579x1(new C12014ne(C7019kk.m27462to(Float.valueOf(fM64124x1), 13), C7019kk.m27462to(Float.valueOf(fM64114kk), 13), C7019kk.m27462to(Float.valueOf(f5), 13), -C7019kk.m27462to(Float.valueOf(fM63750k4), 13)));
                            if (!z2 || dM70495k4 == 0.0d) {
                                ilwVar = new ilw(1.0f, 0.0f);
                            } else {
                                double d3 = d2 * dM70495k4;
                                ilwVar = new ilw(1.0f, (float) ((d3 - dM73399kk) / d3));
                            }
                            c0886d8.m4994k4(c11896dy, depthPercents, fOooO00o, ilwVar);
                            c11896dy.dispose();
                            f4 = fOooO00o;
                            list3.addItem(new C14319px(iM64963x1, i8, new C12025x6((f5 / 2.0f) + fM64124x1, f7 + fM63750k4).Clone(), kc0.m63750k4((double) fM63750k4, 0.0d) < 0.0d ? z : false, f4));
                        } catch (Throwable th) {
                            c11896dy.dispose();
                            throw th;
                        }
                    }
                }
                i6 = i2 + 1;
                fOooO00o = f4;
                gapDepth = f2;
                rotationY = f;
                listM69865up = list;
                c14787xiM69863u4 = c14787xi;
                fM70496k4 = f3;
                listM64944dy = list2;
                dM73430x6 = d;
                iM69819to = i3;
            }
            i4 = i5;
            fM72786k4 = f7;
            rotation3D = iRotation3D;
            f6 = f10;
            fM64121to = f11;
        }
        C13754l0.m64239k4(list3, this.f48788k4);
    }
}
