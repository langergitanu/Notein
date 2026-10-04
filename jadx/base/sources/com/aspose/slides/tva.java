package com.aspose.slides;

import Oooo0.C20856OooooOo;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p475wh.C12026yj;
import com.aspose.slides.internal.p505xn.C12556ck;

/* JADX INFO: loaded from: classes3.dex */
class tva {

    /* JADX INFO: renamed from: k4 */
    private C14365qy f49197k4;

    public tva(C14365qy c14365qy) {
        this.f49197k4 = c14365qy;
    }

    /* JADX INFO: renamed from: k4 */
    private static float m71330k4(C14365qy c14365qy, float f, int i, boolean z) {
        float fM64124x1 = (i * f) + c14365qy.m69833e0().m64124x1();
        return z ? (f / 2.0f) + fM64124x1 : fM64124x1;
    }

    /* JADX INFO: renamed from: k4 */
    private static float m71331k4(C14787xi c14787xi, double d, C0886d8 c0886d8, float f, double d2, double d3) {
        float fM73399kk = (((float) (d - c14787xi.m73399kk(c0886d8.m4989k4()))) / ((float) (d2 - d3))) * f;
        return c14787xi.m73384dy().isPlotOrderReversed() ? -fM73399kk : fM73399kk;
    }

    /* JADX INFO: renamed from: k4 */
    private static C12025x6 m71332k4(float f, float f2, float f3, boolean z) {
        return new C12025x6(f + 8.0f, f2 + (z ? f3 - (-8.0f) : f3 - 8.0f));
    }

    /* JADX INFO: renamed from: k4 */
    private static C14319px m71333k4(float f, float f2, float f3, int i, int i2, float f4) {
        boolean z = kc0.m63750k4((double) f3, 0.0d) <= 0.0d;
        return new C14319px(i2, i, m71332k4(f, f2, f3, z).Clone().Clone(), z, f4);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71334k4() {
        int i;
        C14787xi c14787xi;
        List<C13847mr> list;
        float f;
        double d;
        List list2;
        int i2;
        double d2;
        double d3;
        C14787xi c14787xi2;
        boolean zIsChartTypeBar = ChartTypeCharacterizer.isChartTypeBar(this.f49197k4.m69834fa().getType());
        int iM69819to = C14365qy.m69819to(this.f49197k4.m69865up());
        double dM73430x6 = this.f49197k4.m69863u4().m73430x6();
        float fM72786k4 = C14743wm.m72786k4(C7019kk.m27462to(Float.valueOf(this.f49197k4.m69833e0().m64114kk() - this.f49197k4.m69833e0().m64100du()), 13), C7019kk.m27462to(Float.valueOf(this.f49197k4.m69833e0().m64100du()), 13), zIsChartTypeBar, this.f49197k4.m69863u4());
        C14787xi c14787xiM69854ne = this.f49197k4.m69854ne();
        C14787xi c14787xiM69863u4 = this.f49197k4.m69863u4();
        int i3 = 1;
        boolean z = c14787xiM69854ne.m73375b3() || this.f49197k4.m69834fa().hasDataTable();
        if (z) {
            i = iM69819to;
        } else {
            i = iM69819to - 1;
            if (i == 0) {
                i = 1;
            }
        }
        IRotation3D rotation3D = this.f49197k4.m69834fa().getRotation3D();
        float fM64121to = this.f49197k4.m69833e0().m64121to() / i;
        float depthPercents = ((rotation3D.getDepthPercents() & 65535) / 100.0f) * this.f49197k4.m69833e0().m64102dy();
        float fOooO0O0 = ((OooOO0O.OooO0O0(this.f49197k4.m69834fa(), 0) & 65535) / 100.0f) * depthPercents;
        double dM73432yj = c14787xiM69863u4.m73432yj();
        double dM73405ks = c14787xiM69863u4.m73405ks();
        if (c14787xiM69863u4.m73384dy().isLogarithmic()) {
            dM73430x6 = c14787xiM69863u4.m73391k4(dM73430x6);
        }
        double d4 = dM73430x6;
        List<C13847mr> listM69865up = this.f49197k4.m69865up();
        float size = depthPercents / listM69865up.size();
        float size2 = fOooO0O0 / listM69865up.size();
        List list3 = new List();
        int i4 = 0;
        while (i4 < listM69865up.size()) {
            int iOooO00o = C20856OooooOo.OooO00o(i3, i4, listM69865up);
            if (this.f49197k4.m69868wl().m73384dy().isPlotOrderReversed()) {
                iOooO00o = i4;
            }
            C13847mr c13847mr = listM69865up.get_Item(iOooO00o);
            int i5 = 0;
            while (true) {
                c14787xi = c14787xiM69854ne;
                int i6 = iM69819to - 1;
                if (i5 < i6) {
                    int i7 = c14787xi.m73384dy().isPlotOrderReversed() ? i6 - i5 : i5;
                    int i8 = iM69819to;
                    C0886d8 c0886d8 = c13847mr.m64944dy().get_Item(i7);
                    int i9 = i7;
                    int i10 = i9 + 1;
                    C0886d8 c0886d82 = c13847mr.m64944dy().get_Item(i10);
                    if (c0886d8 == null || c0886d8.m4983dy() || c0886d82 == null) {
                        list = listM69865up;
                        f = fM64121to;
                        d = d4;
                        list2 = list3;
                        i2 = i4;
                        d2 = dM73405ks;
                        d3 = dM73432yj;
                        c14787xi2 = c14787xiM69863u4;
                    } else {
                        list2 = list3;
                        i2 = i4;
                        float fM71331k4 = m71331k4(c14787xiM69863u4, d4, c0886d8, this.f49197k4.m69833e0().m64100du(), dM73432yj, dM73405ks);
                        float fM71330k4 = m71330k4(this.f49197k4, fM64121to, i5, z);
                        list = listM69865up;
                        float fM71331k42 = m71331k4(c14787xiM69863u4, d4, c0886d82, this.f49197k4.m69833e0().m64100du(), dM73432yj, dM73405ks);
                        d = d4;
                        d2 = dM73405ks;
                        d3 = dM73432yj;
                        c14787xi2 = c14787xiM69863u4;
                        float fM71330k42 = m71330k4(this.f49197k4, fM64121to, i5 + 1, z);
                        C11896dy c11896dy = new C11896dy();
                        c11896dy.m55574x1(fM71330k4, fM72786k4 + fM71331k4 + 2.0f, fM71330k42, fM72786k4 + fM71331k42 + 2.0f);
                        C12026yj c12026yj = new C12026yj(C12003du.f40505to.Clone(), 1.0f);
                        try {
                            C12556ck.m58562k4(c11896dy, c12026yj);
                            c12026yj.dispose();
                            float f2 = (rotation3D.getRightAngleAxes() ? (size + size2) * (i2 + 1) : ((size + size2) * (i2 + 1)) - (depthPercents + fOooO0O0)) - (size2 / 2.0f);
                            c0886d8.m4994k4(c11896dy, size, f2, null);
                            float f3 = f2 - (size / 2.0f);
                            f = fM64121to;
                            list2.addItem(m71333k4(fM71330k4, fM72786k4, fM71331k4, i9, c13847mr.m64963x1(), f3));
                            if (i8 - 2 == i9) {
                                list2.addItem(m71333k4(fM71330k42, fM72786k4, fM71331k42, i10, c13847mr.m64963x1(), f3));
                            }
                        } catch (Throwable th) {
                            c12026yj.dispose();
                            throw th;
                        }
                    }
                    i5++;
                    list3 = list2;
                    fM64121to = f;
                    c14787xiM69863u4 = c14787xi2;
                    dM73432yj = d3;
                    c14787xiM69854ne = c14787xi;
                    iM69819to = i8;
                    i4 = i2;
                    listM69865up = list;
                    dM73405ks = d2;
                    d4 = d;
                }
            }
            C13754l0.m64239k4(list3, this.f49197k4);
            i4++;
            dM73432yj = dM73432yj;
            c14787xiM69854ne = c14787xi;
            iM69819to = iM69819to;
            listM69865up = listM69865up;
            dM73405ks = dM73405ks;
            i3 = 1;
        }
    }
}
