package com.aspose.slides;

import Oooo0.C20856OooooOo;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12007ix;

/* JADX INFO: renamed from: com.aspose.slides.vz */
/* JADX INFO: loaded from: classes3.dex */
class C14718vz {

    /* JADX INFO: renamed from: k4 */
    private final C14365qy f49729k4;

    public C14718vz(C14365qy c14365qy) {
        this.f49729k4 = c14365qy;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m72604k4() {
        boolean z;
        int iOooO00o;
        C0886d8 c0886d8;
        float f;
        float f2;
        double d;
        int i;
        C12007ix c12007ix;
        float f3;
        boolean zIsChartTypeBar = ChartTypeCharacterizer.isChartTypeBar(this.f49729k4.m69834fa().getType());
        int iM69819to = C14365qy.m69819to(this.f49729k4.m69865up());
        double dM73430x6 = this.f49729k4.m69863u4().m73430x6();
        float fM72786k4 = C14743wm.m72786k4(C7019kk.m27462to(Float.valueOf(this.f49729k4.m69833e0().m64114kk() - this.f49729k4.m69833e0().m64100du()), 13), C7019kk.m27462to(Float.valueOf(this.f49729k4.m69833e0().m64100du()), 13), zIsChartTypeBar, this.f49729k4.m69863u4());
        IRotation3D rotation3D = this.f49729k4.m69834fa().getRotation3D();
        float rotationY = rotation3D.getRotationY() & 65535;
        C14787xi c14787xiM69854ne = this.f49729k4.m69854ne();
        C14787xi c14787xiM69863u4 = this.f49729k4.m69863u4();
        List<C13847mr> listM69865up = this.f49729k4.m69865up();
        int size = listM69865up.size();
        float fM64121to = this.f49729k4.m69833e0().m64121to() / iM69819to;
        float fM64110k4 = this.f49729k4.m69833e0().m64110k4(false, iM69819to, size);
        float depthPercents = ((rotation3D.getDepthPercents() & 65535) / 100.0f) * this.f49729k4.m69833e0().m64102dy();
        float gapWidth = ((this.f49729k4.m69834fa().getChartData().getSeries().get_Item(0).getParentSeriesGroup().getGapWidth() & 65535) * fM64110k4) / 100.0f;
        float fOooO0O0 = ((OooOO0O.OooO0O0(this.f49729k4.m69834fa(), 0) & 65535) / 100.0f) * depthPercents;
        List list = new List();
        float f4 = (fOooO0O0 / 2.0f) + depthPercents;
        if (!rotation3D.getRightAngleAxes()) {
            f4 = (-fOooO0O0) / 2.0f;
        }
        float f5 = f4;
        int i2 = 0;
        while (i2 < iM69819to) {
            int i3 = iM69819to;
            float f6 = rotationY;
            int i4 = this.f49729k4.m69877xk() > 180 ? (i3 - 1) - i2 : i2;
            int i5 = i2;
            int i6 = 0;
            while (i6 < listM69865up.size()) {
                if (f6 > 180.0f) {
                    z = true;
                    iOooO00o = C20856OooooOo.OooO00o(1, i6, listM69865up);
                } else {
                    z = true;
                    iOooO00o = i6;
                }
                C13847mr c13847mr = listM69865up.get_Item(iOooO00o);
                int iM64963x1 = c13847mr.m64963x1();
                int i7 = i6;
                C14787xi c14787xi = c14787xiM69854ne;
                float fOooO00o = OooOO0.OooO0O0.OooO00o(iOooO00o, fM64110k4, (gapWidth / 2.0f) + (i4 * fM64121to), this.f49729k4.m69833e0().m64124x1());
                int i8 = c14787xi.m73384dy().isPlotOrderReversed() ? (i3 - 1) - i4 : i4;
                if (i8 > c13847mr.m64944dy().size() - 1 || (c0886d8 = c13847mr.m64944dy().get_Item(i8)) == null || c0886d8.m4983dy()) {
                    i = i4;
                    d = dM73430x6;
                    f3 = f5;
                    f = fM64121to;
                    f2 = gapWidth;
                } else {
                    f = fM64121to;
                    f2 = gapWidth;
                    d = dM73430x6;
                    int i9 = i4;
                    float fM63750k4 = (((float) kc0.m63750k4(dM73430x6, c14787xiM69863u4.m73399kk(c0886d8.m4989k4()))) / ((float) (c14787xiM69863u4.m73389ix() - c14787xiM69863u4.m73410ne()))) * this.f49729k4.m69833e0().m64100du();
                    if (c14787xiM69863u4.m73384dy().isPlotOrderReversed()) {
                        fM63750k4 = -fM63750k4;
                    }
                    float fM64114kk = this.f49729k4.m69833e0().m64114kk() + fM63750k4;
                    C11896dy c11896dy = new C11896dy();
                    i = i9;
                    if (fM63750k4 == 0.0f) {
                        try {
                            c12007ix = new C12007ix(fOooO00o, fM64114kk, fM64110k4, 1.0f);
                        } catch (Throwable th) {
                            c11896dy.dispose();
                            throw th;
                        }
                    } else {
                        c12007ix = new C12007ix(fOooO00o, fM64114kk, fM64110k4, -fM63750k4);
                    }
                    c11896dy.m55578x1(c12007ix);
                    c0886d8.m4994k4(c11896dy, depthPercents, f5, new ilw(1.0f, 0.0f));
                    c11896dy.dispose();
                    f3 = f5;
                    boolean z2 = kc0.m63750k4((double) fM63750k4, 0.0d) <= 0.0d ? z : false;
                    list.addItem(new C14319px(iM64963x1, i8, C13754l0.m64235k4(fOooO00o, fM64110k4, fM72786k4, fM63750k4, z2).Clone().Clone(), z2, f3));
                }
                i6 = i7 + 1;
                f5 = f3;
                c14787xiM69854ne = c14787xi;
                fM64121to = f;
                gapWidth = f2;
                dM73430x6 = d;
                i4 = i;
            }
            i2 = i5 + 1;
            iM69819to = i3;
            rotationY = f6;
        }
        C13754l0.m64239k4(list, this.f49729k4);
    }
}
