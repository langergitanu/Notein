package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.fe */
/* JADX INFO: loaded from: classes3.dex */
class C1097fe {
    /* JADX INFO: renamed from: du */
    private void m6131du(C14365qy c14365qy, C12014ne[] c12014neArr) {
        if (kc0.m63756k4(c12014neArr[0].Clone())) {
            return;
        }
        C12014ne c12014ne = c12014neArr[0];
        c12014ne.m56676kk(c12014ne.m56669jd() + 2);
        C12014ne c12014ne2 = c12014neArr[0];
        c12014ne2.m56682to(c12014ne2.m56664ck() + 2);
        c12014neArr[0].m56684x1(r1.m56663c5() - 4);
        c12014neArr[0].m56671k4(r1.m56683x1() - 4);
        C14343qe.m69546k4(c14365qy, ChartTypeCharacterizer.isChartTypeBar(c14365qy.m69834fa().getType()), c12014neArr[0].Clone());
    }

    /* JADX INFO: renamed from: k4 */
    private C12015qq m6132k4(String str, C12013m9 c12013m9, C12003du c12003du, float f, int i, int i2, C14365qy c14365qy) {
        float fM63360x1;
        AutoShape autoShapeM7383k4 = C1236i2.m7383k4(str, c12013m9, c12003du.Clone(), i, i2, c14365qy);
        jq6.m63494x1(autoShapeM7383k4.m288x1().f3523to);
        C12007ix c12007ixClone = C14873z5.m74318k4(jq6.m63492k4(autoShapeM7383k4.m288x1().f3523to)).Clone();
        TextFrameFormat textFrameFormat = (TextFrameFormat) autoShapeM7383k4.m288x1().getTextFrameFormat();
        float f2 = (float) (textFrameFormat.m2963to().f50160x1 + textFrameFormat.m2963to().f50159to);
        float f3 = (float) (textFrameFormat.m2963to().f50158kk + textFrameFormat.m2963to().f50157du);
        if (!C14064he.m66715kk(f2)) {
            c12007ixClone.m56576x1(c12007ixClone.m56550c5() + f2);
        }
        if (!C14064he.m66715kk(f3)) {
            c12007ixClone.m56560k4(c12007ixClone.m56575x1() + f3);
        }
        jjy jjyVar = new jjy(c12007ixClone.Clone());
        if (f != 0.0f) {
            jjyVar.m63353k4(f);
        }
        if (textFrameFormat.getTextVerticalType() == 4 || textFrameFormat.getTextVerticalType() == 3 || textFrameFormat.getTextVerticalType() == 5 || textFrameFormat.getTextVerticalType() == 6) {
            autoShapeM7383k4.setWidth((float) C14116yg.m67501x1(jjyVar.m63358kk()));
            fM63360x1 = jjyVar.m63360x1();
        } else {
            autoShapeM7383k4.setWidth((float) C14116yg.m67501x1(jjyVar.m63360x1()));
            fM63360x1 = jjyVar.m63358kk();
        }
        autoShapeM7383k4.setHeight((float) C14116yg.m67501x1(fM63360x1));
        jq6.m63494x1(autoShapeM7383k4.m288x1().f3523to);
        return new C12015qq(jjyVar.m63360x1(), jjyVar.m63358kk());
    }

    /* JADX INFO: renamed from: kk */
    private void m6140kk(C14365qy c14365qy) {
        C12014ne c12014ne;
        float fM56895kk;
        boolean zIsChartTypeBar = ChartTypeCharacterizer.isChartTypeBar(c14365qy.m69834fa().getType());
        if (c14365qy.m69834fa().hasDataTable()) {
            C14328q5 c14328q5M69838jd = c14365qy.m69838jd();
            C12023wl c12023wlClone = c14328q5M69838jd.m69401h4().Clone();
            int iM56862kk = c12023wlClone.m56862kk() + c14328q5M69838jd.m69400dy();
            c14328q5M69838jd.f48246k4.m56671k4(iM56862kk);
            if (zIsChartTypeBar || !c14365qy.m69834fa().getRotation3D().getRightAngleAxes()) {
                C12014ne c12014neClone = c14365qy.f48440k4.f5456k4.Clone();
                c14328q5M69838jd.f48246k4.m56676kk(c12023wlClone.m56865x1() + c12014neClone.m56669jd());
                c14328q5M69838jd.f48246k4.m56682to(c12014neClone.m56670k4() - iM56862kk);
                c14328q5M69838jd.f48246k4.m56684x1(c12014neClone.m56663c5() - c12023wlClone.m56865x1());
                return;
            }
            float rotationX = c14365qy.m69834fa().getRotation3D().getRotationX();
            float fM64121to = c14365qy.m69833e0().m64121to();
            float fM64106h4 = c14365qy.m69833e0().m64106h4();
            float fM64114kk = c14365qy.m69833e0().m64114kk();
            float f = fM64121to / 2.0f;
            C12025x6 c12025x6 = new C12025x6(fM64106h4 - f, fM64114kk);
            C12025x6 c12025x62 = new C12025x6(fM64106h4 + f, fM64114kk);
            if (rotationX > 0.0f) {
                if (c12025x6.m56897x1() < c12025x62.m56897x1()) {
                    c14328q5M69838jd.f48246k4.m56676kk(C7019kk.m27462to(Float.valueOf(c12025x6.m56897x1()), 13));
                    c12014ne = c14328q5M69838jd.f48246k4;
                    fM56895kk = c12025x6.m56895kk();
                } else {
                    c14328q5M69838jd.f48246k4.m56676kk(C7019kk.m27462to(Float.valueOf(c12025x62.m56897x1()), 13));
                    c12014ne = c14328q5M69838jd.f48246k4;
                    fM56895kk = c12025x62.m56895kk();
                }
                c12014ne.m56682to(C7019kk.m27462to(Float.valueOf(fM56895kk), 13));
                c14328q5M69838jd.f48246k4.m56684x1(C7019kk.m27462to(Float.valueOf(C14116yg.m67480k4(c12025x62.m56897x1() - c12025x6.m56897x1())), 13));
            }
        }
    }

    /* JADX INFO: renamed from: to */
    private void m6142to(C14365qy c14365qy) {
        if (C14164n2.m67856kk(c14365qy.m69834fa())) {
            C14787xi c14787xiM69868wl = c14365qy.m69868wl();
            List<Object> list = c14787xiM69868wl.f50098m9;
            List<C13847mr> listM69865up = c14365qy.m69865up();
            for (int i = 0; i < listM69865up.size(); i++) {
                list.addItem(listM69865up.get_Item(i).m64957kk());
            }
            c14787xiM69868wl.m73414to(0.0d);
            c14787xiM69868wl.m73381du(listM69865up.size());
            c14787xiM69868wl.m73409m9(c14787xiM69868wl.m73406lr());
            c14787xiM69868wl.m73387h4(c14787xiM69868wl.m73418um() / 2.0d);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m6144x1(C14365qy c14365qy) {
        if (c14365qy.m69863u4().m73384dy() == null) {
            return;
        }
        C14787xi c14787xiM69863u4 = c14365qy.m69863u4();
        double dM73412rv = c14787xiM69863u4.m73412rv();
        double dM73432yj = c14787xiM69863u4.m73432yj();
        double dM73405ks = c14787xiM69863u4.m73405ks();
        if (c14787xiM69863u4.m73384dy().getCrossType() == 1) {
            dM73412rv = dM73432yj;
        }
        if (dM73412rv <= dM73432yj) {
            dM73432yj = dM73412rv;
        }
        if (dM73432yj >= dM73405ks) {
            dM73405ks = dM73432yj;
        }
        c14787xiM69863u4.m73392k4(c14787xiM69863u4.m73384dy().isLogarithmic() ? (float) c14787xiM69863u4.m73424x1(dM73405ks) : (float) dM73405ks);
    }

    /* JADX INFO: renamed from: kk */
    private void m6141kk(C14365qy c14365qy, C12014ne[] c12014neArr) {
        if (c14365qy.m69834fa().hasLegend()) {
            if (c14365qy.m69834fa().getType() == 30 || c14365qy.m69834fa().getType() == 27 || c14365qy.m69826c5().m74376fa()) {
                gfh.m6612k4(c14365qy.m69865up().get_Item(0), c12014neArr, c14365qy);
            } else {
                gfh.m6613k4(c12014neArr, c14365qy);
            }
        }
    }

    /* JADX INFO: renamed from: to */
    private void m6143to(C14365qy c14365qy, C12014ne[] c12014neArr) {
        C14787xi c14787xiM69854ne = c14365qy.m69854ne();
        C14787xi c14787xiM69863u4 = c14365qy.m69863u4();
        boolean zIsChartTypeBar = ChartTypeCharacterizer.isChartTypeBar(c14365qy.m69834fa().getType());
        if (c14787xiM69854ne.m73384dy() != null && c14787xiM69854ne.m73384dy().hasTitle() && c14787xiM69854ne.m73384dy().isVisible()) {
            m6139k4(c14787xiM69854ne, c12014neArr, zIsChartTypeBar, c14365qy);
        }
        if (c14787xiM69863u4.m73384dy() != null && c14787xiM69863u4.m73384dy().hasTitle() && c14787xiM69863u4.m73384dy().isVisible()) {
            if (C14064he.m66715kk(c14787xiM69863u4.m73408m9().m68743to())) {
                c14787xiM69863u4.m73408m9().m68738k4(90.0f);
            }
            m6139k4(c14787xiM69863u4, c12014neArr, zIsChartTypeBar, c14365qy);
        }
        if (c14365qy.m69868wl().m73384dy() != null && c14365qy.m69868wl().m73384dy().hasTitle() && c14365qy.m69868wl().m73384dy().isVisible()) {
            C12023wl c12023wlClone = c14365qy.m69868wl().m73408m9().m68736k4(new C12015qq(c12014neArr[0].m56663c5() * 0.8f, c12014neArr[0].m56683x1() * 0.8f).Clone()).Clone();
            C12014ne c12014ne = c12014neArr[0];
            c12014ne.m56684x1(c12014ne.m56663c5() - c12023wlClone.m56865x1());
            C14343qe.m69546k4(c14365qy, zIsChartTypeBar, c12014neArr[0].Clone());
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m6145x1(C14365qy c14365qy, C12014ne[] c12014neArr) {
        ChartPlotArea chartPlotArea = (ChartPlotArea) c14365qy.m69834fa().getPlotArea();
        if (chartPlotArea.isLocationAutocalculated()) {
            return;
        }
        int iM27462to = C7019kk.m27462to(Float.valueOf(c14365qy.m69867v4()), 13);
        int iM27462to2 = C7019kk.m27462to(Float.valueOf(c14365qy.m69852lr()), 13);
        float f = iM27462to;
        c12014neArr[0].m56676kk(C7019kk.m27462to(Float.valueOf(((chartPlotArea.getX() * f) / 2.0f) + c14365qy.m69878yd()), 13));
        float f2 = iM27462to2;
        c12014neArr[0].m56682to(C7019kk.m27462to(Float.valueOf(((chartPlotArea.getY() * f2) / 2.0f) + c14365qy.m69823b3()), 13));
        c12014neArr[0].m56684x1(C7019kk.m27462to(Float.valueOf((chartPlotArea.getWidth() + (chartPlotArea.getX() / 2.0f)) * f), 13));
        c12014neArr[0].m56671k4(C7019kk.m27462to(Float.valueOf((chartPlotArea.getHeight() + chartPlotArea.getY()) * f2), 13));
        if (c12014neArr[0].m56664ck() < c14365qy.m69823b3()) {
            C12014ne c12014ne = c12014neArr[0];
            c12014ne.m56671k4(c12014neArr[0].m56664ck() + c12014ne.m56683x1());
            c12014neArr[0].m56682to(C7019kk.m27462to(Float.valueOf(c14365qy.m69823b3()), 13));
        }
        if (c12014neArr[0].m56669jd() < c14365qy.m69878yd()) {
            C12014ne c12014ne2 = c12014neArr[0];
            c12014ne2.m56684x1(c12014neArr[0].m56669jd() + c12014ne2.m56663c5());
            c12014neArr[0].m56676kk(C7019kk.m27462to(Float.valueOf(c14365qy.m69878yd()), 13));
        }
        if (c12014neArr[0].m56669jd() + c12014neArr[0].m56663c5() > c14365qy.m69878yd() + f) {
            c12014neArr[0].m56676kk((C7019kk.m27462to(Float.valueOf(c14365qy.m69878yd()), 13) + iM27462to) - c12014neArr[0].m56663c5());
        }
        if (c12014neArr[0].m56664ck() + c12014neArr[0].m56683x1() > c14365qy.m69823b3() + f2) {
            c12014neArr[0].m56682to((C7019kk.m27462to(Float.valueOf(c14365qy.m69823b3()), 13) + iM27462to2) - c12014neArr[0].m56683x1());
        }
        if (c12014neArr[0].m56668h4() > c14365qy.m69878yd() + c14365qy.m69867v4()) {
            c12014neArr[0].m56684x1((C7019kk.m27462to(Float.valueOf(c14365qy.m69867v4()), 13) + C7019kk.m27462to(Float.valueOf(c14365qy.m69878yd()), 13)) - c12014neArr[0].m56669jd());
        }
        if (c12014neArr[0].m56670k4() > c14365qy.m69823b3() + c14365qy.m69852lr()) {
            c12014neArr[0].m56671k4((C7019kk.m27462to(Float.valueOf(c14365qy.m69852lr()), 13) + C7019kk.m27462to(Float.valueOf(c14365qy.m69823b3()), 13)) - c12014neArr[0].m56664ck());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6146k4(C14365qy c14365qy) {
        C12023wl c12023wl;
        float fM64100du;
        boolean z = true;
        if (c14365qy.m69865up().size() == 0 || C14365qy.m69819to(c14365qy.m69865up()) == 0) {
            return;
        }
        List<C13847mr> listM69865up = c14365qy.m69865up();
        C14787xi c14787xiM69854ne = c14365qy.m69854ne();
        C14787xi c14787xiM69863u4 = c14365qy.m69863u4();
        ChartPlotArea chartPlotArea = (ChartPlotArea) c14365qy.m69834fa().getPlotArea();
        kc0.m63755k4(c14365qy.m69865up(), c14365qy.m69865up().get_Item(0), c14787xiM69854ne, c14787xiM69863u4);
        boolean zIsChartTypeBar = ChartTypeCharacterizer.isChartTypeBar(c14365qy.m69834fa().getType());
        C13847mr c13847mr = c14365qy.m69865up().get_Item(0);
        C12014ne c12014ne = new C12014ne(C7019kk.m27462to(Float.valueOf(c14365qy.m69878yd()), 13) + 11, C7019kk.m27462to(Float.valueOf(c14365qy.m69823b3()), 13) + 11, C7019kk.m27462to(Float.valueOf(c14365qy.m69867v4()), 13) - 22, C7019kk.m27462to(Float.valueOf(c14365qy.m69852lr()), 13) - 22);
        C12007ix c12007ixClone = C12007ix.m56544k4(c12014ne).Clone();
        C12014ne[] c12014neArr = {c12014ne};
        m6145x1(c14365qy, c12014neArr);
        c12014neArr[0].CloneTo(c12014ne);
        c12014ne.CloneTo(c14365qy.f48440k4.f5456k4);
        c12014neArr[0] = c12014ne;
        C14743wm.m72821x1(c14365qy, c12014neArr);
        c12014neArr[0].CloneTo(c12014ne);
        c12014neArr[0] = c12014ne;
        m6141kk(c14365qy, c12014neArr);
        c12014neArr[0].CloneTo(c12014ne);
        C14343qe.m69546k4(c14365qy, zIsChartTypeBar, c12014ne.Clone());
        c12014neArr[0] = c12014ne;
        m6143to(c14365qy, c12014neArr);
        c12014neArr[0].CloneTo(c12014ne);
        c12014neArr[0] = c12014ne;
        vbm.m72167k4(c12014neArr, c13847mr);
        c12014neArr[0].CloneTo(c12014ne);
        if (chartPlotArea.isLocationAutocalculated()) {
            c12014ne.CloneTo(c14365qy.f48440k4.f5456k4);
        }
        double[] dArr = {0.0d};
        double[] dArr2 = {0.0d};
        C14743wm.m72801k4(listM69865up, dArr, dArr2, c14787xiM69863u4);
        double d = dArr[0];
        double d2 = dArr2[0];
        boolean z2 = c14787xiM69863u4.m73384dy() == null || c14787xiM69863u4.m73422wl();
        if (c14787xiM69863u4.m73384dy() != null && !c14787xiM69863u4.m73411qq()) {
            z = false;
        }
        C14743wm.m72793k4(d2, d, c14787xiM69863u4.f50098m9, c14365qy.m69834fa().getType(), c12014ne.Clone(), zIsChartTypeBar, listM69865up.get_Item(0), c14365qy.m69863u4(), c14365qy.m69863u4().m73425x1());
        C14743wm.m72800k4(c14787xiM69854ne.f50098m9, c12014ne.Clone(), c14365qy.m69834fa().getType(), listM69865up, zIsChartTypeBar, c14787xiM69854ne);
        m6142to(c14365qy);
        c12014neArr[0] = c12014ne;
        m6131du(c14365qy, c12014neArr);
        c12014neArr[0].CloneTo(c12014ne);
        C14333q9.m69464k4(c14365qy);
        c12014neArr[0] = c12014ne;
        C14333q9.m69465k4(c14365qy, c12014neArr);
        c12014neArr[0].CloneTo(c12014ne);
        C12023wl c12023wl2 = new C12023wl();
        C12023wl c12023wl3 = new C12023wl();
        C12023wl c12023wl4 = new C12023wl();
        C12023wl[] c12023wlArr = {c12023wl2};
        C12023wl[] c12023wlArr2 = {c12023wl3};
        C12023wl[] c12023wlArr3 = {c12023wl4};
        boolean z3 = z2;
        int[] iArr = {0};
        boolean z4 = z;
        C0747af.m3530k4(c14365qy, (List<C13847mr>[]) new List[]{listM69865up}, c12014ne.Clone(), c12023wlArr, c12023wlArr2, c12023wlArr3, iArr);
        c12023wlArr[0].CloneTo(c12023wl2);
        c12023wlArr2[0].CloneTo(c12023wl3);
        c12023wlArr3[0].CloneTo(c12023wl4);
        int i = iArr[0];
        c12014neArr[0] = c12014ne;
        m6137k4(c14365qy, c12014neArr, c12023wl2.Clone(), c12023wl3.Clone(), c12023wl4.Clone(), i);
        c12014neArr[0].CloneTo(c12014ne);
        if (c14787xiM69863u4.m73384dy() == null || !c14787xiM69863u4.m73384dy().isVisible()) {
            c12023wl = c12023wl2;
        } else {
            float fM72788k4 = C14743wm.m72788k4(zIsChartTypeBar, c14365qy.m69865up().get_Item(0), c12014ne.Clone(), c14365qy.m69863u4(), c14365qy.m69863u4().m73425x1());
            int type = c14365qy.m69834fa().getType();
            if (type == 73) {
                type = c14365qy.m69834fa().getChartData().getSeries().get_Item(0).getType();
            }
            if (ChartTypeCharacterizer.m761jd(type) || c14365qy.m69834fa().getType() == 4 || c14365qy.m69834fa().getType() == 3) {
                fM72788k4 *= c12014ne.m56683x1() / c12007ixClone.m56575x1();
            }
            if (zIsChartTypeBar) {
                fM64100du = c14365qy.m69833e0().m64121to();
                c12023wl = c12023wl2;
            } else {
                c12023wl = c12023wl2;
                fM64100du = c14365qy.m69833e0().m64100du();
            }
            int iM63753k4 = kc0.m63753k4(fM64100du);
            if (z3 && c14787xiM69863u4.f50098m9.size() > 3 && fM72788k4 > iM63753k4 && iM63753k4 != 0) {
                c14787xiM69863u4.f50098m9.clear();
                c14787xiM69863u4.m73404kk(z3);
                c14787xiM69863u4.m73416to(z4);
                if (z3) {
                    c14787xiM69863u4.m73409m9(0.0d);
                }
                if (z4) {
                    c14787xiM69863u4.m73387h4(0.0d);
                }
                C14743wm.m72793k4(d2, d, c14787xiM69863u4.f50098m9, c14365qy.m69865up().get_Item(0).m64945h4().getType(), c12014ne.Clone(), zIsChartTypeBar, c14365qy.m69865up().get_Item(0), c14787xiM69863u4, c14787xiM69863u4.m73425x1());
            }
        }
        m6135k4(c14365qy, zIsChartTypeBar);
        c12014neArr[0] = c12014ne;
        m6134k4(c14365qy, c12023wl.Clone(), c12023wl3.Clone(), c12023wl4.Clone(), i, c12014neArr);
        c12014neArr[0].CloneTo(c12014ne);
        m6140kk(c14365qy);
        m6133k4(c14365qy, C12007ix.m56544k4(c12014ne).Clone());
        m6144x1(c14365qy);
    }

    /* JADX INFO: renamed from: k4 */
    private void m6133k4(C14365qy c14365qy, C12007ix c12007ix) {
        if (C14164n2.m67859x1(c14365qy.m69834fa())) {
            egt.m5522k4(c14365qy, c12007ix.Clone());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m6134k4(C14365qy c14365qy, C12023wl c12023wl, C12023wl c12023wl2, C12023wl c12023wl3, int i, C12014ne[] c12014neArr) {
        int i2;
        boolean zIsChartTypeBar = ChartTypeCharacterizer.isChartTypeBar(c14365qy.m69834fa().getType());
        C14787xi c14787xiM69854ne = c14365qy.m69854ne();
        C14787xi c14787xiM69863u4 = c14365qy.m69863u4();
        if (c14787xiM69854ne.m73384dy() != null && c14787xiM69854ne.m73384dy().hasTitle() && c14787xiM69854ne.m73384dy().isVisible()) {
            i2 = i;
            m6138k4(c14787xiM69854ne, c12014neArr[0].Clone(), zIsChartTypeBar, c12023wl.Clone(), c14787xiM69854ne.m73380du().Clone(), i2);
        } else {
            i2 = i;
        }
        if (c14787xiM69863u4.m73384dy() != null && c14787xiM69863u4.m73384dy().hasTitle() && c14787xiM69863u4.m73384dy().isVisible()) {
            m6138k4(c14787xiM69863u4, c12014neArr[0].Clone(), zIsChartTypeBar, c12023wl.Clone(), c14787xiM69854ne.m73380du().Clone(), i2);
        }
        if (c14365qy.m69868wl().m73384dy() != null && c14365qy.m69868wl().m73384dy().hasTitle() && c14365qy.m69868wl().m73384dy().isVisible()) {
            C14245oo c14245ooM73408m9 = c14365qy.m69868wl().m73408m9();
            C12023wl c12023wlClone = c14245ooM73408m9.m68736k4(new C12015qq(c12014neArr[0].m56663c5() * 0.8f, c12014neArr[0].m56683x1() * 0.8f).Clone()).Clone().Clone();
            c14245ooM73408m9.f47882k4.f5456k4.m56676kk(c14365qy.f48440k4.f5456k4.Clone().m56668h4());
            c14245ooM73408m9.f47882k4.f5456k4.m56682to(C7019kk.m27462to(Float.valueOf((c14365qy.m69833e0().m64114kk() + c12023wl3.m56862kk()) - (c12023wlClone.m56862kk() / 2.0f)), 13));
            c14245ooM73408m9.f47882k4.f5456k4.m56674k4(c12023wlClone.Clone());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m6135k4(C14365qy c14365qy, boolean z) {
        if (c14365qy.m69868wl().m73384dy() == null || !c14365qy.m69868wl().m73384dy().isVisible() || z) {
            return;
        }
        float fOooO0O0 = (65535 & OooOO0O.OooO0O0(c14365qy.m69834fa(), 0)) / 100.0f;
        float fM64117m9 = (c14365qy.m69833e0().m64117m9() * ((c14365qy.m69834fa().getRotation3D().getDepthPercents() & 65535) / 100.0f)) / (1.0f + fOooO0O0);
        float f = (fOooO0O0 * fM64117m9) + fM64117m9;
        int size = c14365qy.m69868wl().f50098m9.size();
        float f2 = c14365qy.m69868wl().f50110x1 * 2.5f;
        if (size * f2 > f) {
            List list = new List();
            list.addItem(0);
            int i = 1;
            int i2 = size - 1;
            list.addItem(Integer.valueOf(i2));
            for (int i3 = 1; i3 < i2; i3++) {
                list.addItem(Integer.valueOf(i3));
            }
            while (i < list.size()) {
                int i4 = i + 1;
                if (i4 * f2 >= f) {
                    c14365qy.m69868wl().f50098m9.set_Item(((Integer) list.get_Item(i)).intValue(), null);
                }
                i = i4;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m6136k4(C14365qy c14365qy, C12014ne[] c12014neArr) {
        if (!C14164n2.m67856kk(c14365qy.m69834fa()) || c14365qy.m69834fa().getRotation3D().getRightAngleAxes() || c14365qy.m69862ts().m64121to() <= c14365qy.m69862ts().m64100du() * 4.0f) {
            return;
        }
        C14787xi c14787xiM69868wl = c14365qy.m69868wl();
        C12013m9 c12013m9M73425x1 = c14787xiM69868wl.m73425x1() != null ? c14787xiM69868wl.m73425x1() : c14787xiM69868wl.m73400kk();
        C12003du c12003duClone = c14787xiM69868wl.m73413to().Clone();
        float f = c14787xiM69868wl.f50094k4;
        List.Enumerator<Object> it = c14787xiM69868wl.f50098m9.iterator();
        float fM56699x1 = f;
        while (it.hasNext()) {
            try {
                C14365qy c14365qy2 = c14365qy;
                C12015qq c12015qqClone = m6132k4(C0841c4.m4468k4(it.next(), c14787xiM69868wl), c12013m9M73425x1, c12003duClone.Clone(), c14787xiM69868wl.m73386h4(), 1, 2, c14365qy2).Clone();
                if (fM56699x1 < c12015qqClone.m56699x1()) {
                    fM56699x1 = c12015qqClone.m56699x1();
                }
                c14365qy = c14365qy2;
            } finally {
            }
        }
        C14365qy c14365qy3 = c14365qy;
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        float f2 = fM56699x1 / 2.0f;
        C12014ne c12014ne = new C12014ne(C7019kk.m27462to(Float.valueOf(c12014neArr[0].m56669jd() + f2), 13), C7019kk.m27462to(Float.valueOf(c12014neArr[0].m56664ck() + f2), 13), C7019kk.m27462to(Float.valueOf(c12014neArr[0].m56663c5() - fM56699x1), 13), C7019kk.m27462to(Float.valueOf(c12014neArr[0].m56683x1() - f2), 13));
        c12014neArr[0] = c12014ne;
        C14343qe.m69546k4(c14365qy3, false, c12014ne.Clone());
    }

    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0371  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m6137k4(C14365qy c14365qy, C12014ne[] c12014neArr, C12023wl c12023wl, C12023wl c12023wl2, C12023wl c12023wl3, int i) {
        C12014ne c12014ne;
        C12014ne c12014ne2;
        int iM56663c5;
        C12023wl c12023wl4;
        C12014ne c12014ne3;
        float fM56865x1;
        C12014ne c12014ne4;
        int iM56663c52;
        if (kc0.m63756k4(c12014neArr[0].Clone())) {
            return;
        }
        float rotationX = c14365qy.m69834fa().getRotation3D().getRotationX();
        boolean zIsChartTypeBar = ChartTypeCharacterizer.isChartTypeBar(c14365qy.m69834fa().getType());
        boolean zIsLocationAutocalculated = C7019kk.m27469x1(c14365qy.m69834fa().getPlotArea(), ChartPlotArea.class) ? ((ChartPlotArea) c14365qy.m69834fa().getPlotArea()).isLocationAutocalculated() : false;
        if (!zIsLocationAutocalculated) {
            C12014ne c12014ne5 = c12014neArr[0];
            c12014ne5.m56684x1(c12023wl.m56865x1() + c12023wl3.m56865x1() + c12014ne5.m56663c5());
            C12014ne c12014ne6 = c12014neArr[0];
            c12014ne6.m56671k4(c12023wl2.m56862kk() + c12014ne6.m56683x1());
            C12014ne c12014ne7 = c14365qy.f48440k4.f5456k4;
            c12014ne7.m56684x1(c12023wl.m56865x1() + c12023wl3.m56865x1() + c12014ne7.m56663c5());
            C12014ne c12014ne8 = c14365qy.f48440k4.f5456k4;
            c12014ne8.m56671k4(c12023wl2.m56862kk() + c12014ne8.m56683x1());
        }
        C14787xi c14787xiM69854ne = c14365qy.m69854ne();
        C14787xi c14787xiM69863u4 = c14365qy.m69863u4();
        C14787xi c14787xiM69868wl = c14365qy.m69868wl();
        if (c14787xiM69868wl.m73384dy() != null && c14787xiM69868wl.m73384dy().isVisible() && c14787xiM69868wl.m73384dy().getTickLabelPosition() != 3) {
            if (!zIsChartTypeBar || (c14365qy.m69834fa().getType() == 33 && c14365qy.m69834fa().m514m9() == 3)) {
                float fM56668h4 = (c12014neArr[0].m56668h4() - (c14365qy.m69833e0().m64124x1() + c14365qy.m69833e0().m64121to())) - c12023wl3.m56865x1();
                if (fM56668h4 < 0.0f) {
                    c12014neArr[0].m56684x1(C7019kk.m27462to(Float.valueOf(r7.m56663c5() + fM56668h4), 13));
                    C14343qe.m69546k4(c14365qy, zIsChartTypeBar, c12014neArr[0].Clone());
                }
            } else {
                int iM27462to = (C7019kk.m27462to(Float.valueOf(c14365qy.m69852lr()), 13) * c14787xiM69868wl.m73378ck()) / 4000;
                C12025x6 c12025x6 = new C12025x6(c14365qy.m69833e0().m64124x1(), c14365qy.m69833e0().m64114kk());
                int iM56865x1 = c12023wl3.m56865x1() + iM27462to;
                if (C7019kk.m27462to(Float.valueOf(c12025x6.m56897x1() - c12014neArr[0].m56669jd()), 13) < iM56865x1) {
                    if (zIsLocationAutocalculated || c14365qy.m69834fa().getPlotArea().getLayoutTargetType() != 0) {
                        C12014ne c12014ne9 = c12014neArr[0];
                        c12014ne9.m56676kk(c12014ne9.m56669jd() + iM56865x1);
                        c12014ne4 = c12014neArr[0];
                        iM56663c52 = c12014ne4.m56663c5() - iM56865x1;
                    } else {
                        C12014ne c12014ne10 = c12014neArr[0];
                        c12014ne10.m56676kk(c12014ne10.m56669jd() - iM56865x1);
                        c12014ne4 = c12014neArr[0];
                        iM56663c52 = c12014ne4.m56663c5() + iM56865x1;
                    }
                    c12014ne4.m56684x1(iM56663c52);
                }
                if (zIsLocationAutocalculated || c14365qy.m69834fa().getPlotArea().getLayoutTargetType() == 1) {
                    C14343qe.m69546k4(c14365qy, false, c12014neArr[0].Clone());
                }
            }
            m6136k4(c14365qy, c12014neArr);
        }
        if (c14787xiM69863u4.m73384dy() != null && c14787xiM69863u4.m73384dy().isVisible() && c14787xiM69863u4.m73384dy().getTickLabelPosition() != 3 && !c14365qy.m69834fa().hasDataTable()) {
            if (!zIsChartTypeBar) {
                if (c14365qy.m69834fa().getRotation3D().getRightAngleAxes() && C14164n2.m67857to(c14365qy.m69834fa().getType()) && !c14787xiM69863u4.m73384dy().hasTitle()) {
                    fM56865x1 = ((c12014neArr[0].m56669jd() + c14365qy.m69833e0().m64108jd()) + c12023wl.m56865x1()) - c14365qy.m69833e0().m64124x1();
                    if (fM56865x1 <= ((double) c12023wl.m56865x1()) * 0.1d) {
                        fM56865x1 = 0.0f;
                    }
                } else {
                    fM56865x1 = c12023wl.m56865x1();
                }
                if (fM56865x1 > 0.0f) {
                    C12014ne c12014ne11 = c12014neArr[0];
                    int i2 = (int) fM56865x1;
                    c12014ne11.m56676kk(c12014ne11.m56669jd() + i2);
                    C12014ne c12014ne12 = c12014neArr[0];
                    c12014ne12.m56684x1(c12014ne12.m56663c5() - i2);
                    c12014ne3 = c12014neArr[0];
                    C14343qe.m69546k4(c14365qy, zIsChartTypeBar, c12014ne3.Clone());
                }
            } else {
                float fM56670k4 = c12014neArr[0].m56670k4() - ((c14365qy.m69833e0().m64114kk() + c14365qy.m69833e0().m64098ck()) + c12023wl.m56862kk());
                if (fM56670k4 < 0.0f && rotationX >= 0.0f) {
                    C12014ne c12014ne13 = c12014neArr[0];
                    int i3 = (int) fM56670k4;
                    c12014ne13.m56671k4(c12014ne13.m56683x1() + i3);
                    int position = c14787xiM69863u4.m73384dy().getPosition();
                    if (position == 3 || (position == 0 && c14787xiM69854ne.m73384dy().isPlotOrderReversed())) {
                        C12014ne c12014ne14 = c12014neArr[0];
                        c12014ne14.m56682to(c12014ne14.m56664ck() - i3);
                        if (C14164n2.m67856kk(c14365qy.m69834fa())) {
                            C12014ne c12014ne15 = c12014neArr[0];
                            c12014ne15.m56671k4(c12014ne15.m56683x1() - (c12023wl.m56862kk() / 2));
                        }
                    }
                    c12014ne3 = c12014neArr[0];
                    C14343qe.m69546k4(c14365qy, zIsChartTypeBar, c12014ne3.Clone());
                }
            }
        }
        if (c14787xiM69854ne.m73384dy() == null || !c14787xiM69854ne.m73384dy().isVisible() || c14787xiM69854ne.m73384dy().getTickLabelPosition() == 3 || c14365qy.m69834fa().hasDataTable()) {
            return;
        }
        C12023wl c12023wl5 = new C12023wl(0, 0);
        float fM64114kk = c14365qy.m69833e0().m64114kk();
        if (!zIsChartTypeBar) {
            if (C14164n2.m67857to(c14365qy.m69834fa().getType()) && c14365qy.m69834fa().getRotation3D().getRightAngleAxes()) {
                if ((c12023wl2.m56865x1() * c14787xiM69854ne.f50098m9.size()) + ((c14787xiM69854ne.f50098m9.size() - 1) * i) > c14365qy.m69833e0().m64121to()) {
                    c14365qy.m69854ne().m73394k4(45);
                    c12023wl4 = c12023wl2;
                    C0747af.m3527k4(c14787xiM69854ne, c12014neArr[0].Clone(), C14365qy.m69819to(c14365qy.m69865up()), zIsChartTypeBar, c14365qy.m69865up().get_Item(0)).CloneTo(c12023wl4);
                    c14787xiM69854ne.m73396k4(c12023wl4.Clone());
                }
                int iM56862kk = c12023wl4.m56862kk() + i;
                if (rotationX >= 0.0f) {
                }
            } else {
                c12023wl4 = c12023wl2;
                int iM56862kk2 = c12023wl4.m56862kk() + i;
                if (rotationX >= 0.0f) {
                    return;
                }
                float fM56670k42 = ((c12014neArr[0].m56670k4() - c12023wl5.m56862kk()) - fM64114kk) - c14365qy.m69833e0().m64098ck();
                float f = iM56862kk2;
                if (fM56670k42 >= f) {
                    return;
                }
                C12014ne c12014ne16 = c12014neArr[0];
                c12014ne16.m56671k4(c12014ne16.m56683x1() - ((int) (f - fM56670k42)));
                c12014ne = c12014neArr[0];
            }
        } else {
            int iM56865x12 = (c12023wl2.m56865x1() + i) - (C14164n2.m67856kk(c14365qy.m69834fa()) ? c12023wl3.m56865x1() / 2 : 0);
            if (C7019kk.m27462to(Float.valueOf(c12014neArr[0].m56669jd() - (c14365qy.m69833e0().m64124x1() - c14365qy.m69833e0().m64108jd())), 13) < iM56865x12) {
                if (zIsLocationAutocalculated || c14365qy.m69834fa().getPlotArea().getLayoutTargetType() != 0) {
                    C12014ne c12014ne17 = c12014neArr[0];
                    c12014ne17.m56676kk(c12014ne17.m56669jd() + iM56865x12);
                    c12014ne2 = c12014neArr[0];
                    iM56663c5 = c12014ne2.m56663c5() - iM56865x12;
                } else {
                    C12014ne c12014ne18 = c12014neArr[0];
                    c12014ne18.m56676kk(c12014ne18.m56669jd() - iM56865x12);
                    c12014ne2 = c12014neArr[0];
                    iM56663c5 = c12014ne2.m56663c5() + iM56865x12;
                }
                c12014ne2.m56684x1(iM56663c5);
            }
            if (!zIsLocationAutocalculated && c14365qy.m69834fa().getPlotArea().getLayoutTargetType() != 1) {
                return;
            } else {
                c12014ne = c12014neArr[0];
            }
        }
        C14343qe.m69546k4(c14365qy, zIsChartTypeBar, c12014ne.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    private void m6138k4(C14787xi c14787xi, C12014ne c12014ne, boolean z, C12023wl c12023wl, C12023wl c12023wl2, int i) {
        C12014ne c12014ne2;
        float fM64114kk;
        C12023wl c12023wlClone = C12023wl.f40585k4.Clone();
        C14365qy c14365qyM73423wy = c14787xi.m73423wy();
        if (c14787xi.m73419up() == 2) {
            c12023wl.CloneTo(c12023wlClone);
            z = !z;
        } else {
            c12023wl2.CloneTo(c12023wlClone);
            if (c14787xi.m73384dy().getTickLabelPosition() != 3) {
                c12023wlClone.m56860k4(c12023wlClone.m56865x1() + i);
            }
        }
        C1189h8 c1189h8 = c14787xi.m73408m9().f47882k4;
        if (z) {
            c1189h8.f5456k4.m56674k4(c14787xi.m73408m9().m68736k4(new C12015qq(c12014ne.m56663c5() * 0.8f, c12014ne.m56683x1() * 0.8f).Clone()).Clone().Clone());
            c1189h8.f5456k4.m56676kk(C7019kk.m27462to(Float.valueOf(c14365qyM73423wy.m69833e0().m64124x1() - c12023wlClone.m56865x1()), 13));
            c1189h8.f5456k4.m56682to(C7019kk.m27462to(Float.valueOf((c14365qyM73423wy.m69833e0().m64114kk() - (c14365qyM73423wy.m69833e0().m64100du() / 2.0f)) - r7.m56862kk()), 13));
            return;
        }
        c1189h8.f5456k4.m56674k4(c14787xi.m73408m9().m68736k4(new C12015qq(c12014ne.m56663c5() * 0.8f, c12014ne.m56683x1() * 0.7f).Clone()).Clone().Clone());
        if (c14787xi.m73384dy().getPosition() == 3) {
            c12014ne2 = c1189h8.f5456k4;
            fM64114kk = (((c14365qyM73423wy.m69833e0().m64114kk() - c14365qyM73423wy.m69833e0().m64100du()) - c12023wlClone.m56862kk()) - (i * 2.0f)) - 4.0f;
        } else {
            c12014ne2 = c1189h8.f5456k4;
            fM64114kk = c14365qyM73423wy.m69833e0().m64114kk() + c12023wlClone.m56862kk() + i;
        }
        c12014ne2.m56682to(C7019kk.m27462to(Float.valueOf(fM64114kk), 13));
        c1189h8.f5456k4.m56676kk(C7019kk.m27462to(Float.valueOf(c14365qyM73423wy.m69833e0().m64106h4() - (r8.m56865x1() / 2.0f)), 13));
    }

    /* JADX INFO: renamed from: k4 */
    private void m6139k4(C14787xi c14787xi, C12014ne[] c12014neArr, boolean z, C14365qy c14365qy) {
        if (c14787xi.m73419up() == 2) {
            z = !z;
        }
        C14245oo c14245ooM73408m9 = c14787xi.m73408m9();
        if (z) {
            C12023wl c12023wlClone = c14245ooM73408m9.m68736k4(new C12015qq(c12014neArr[0].m56663c5() * 0.8f, c12014neArr[0].m56683x1() * 0.8f).Clone()).Clone();
            C12014ne c12014ne = c12014neArr[0];
            c12014ne.m56676kk(c12023wlClone.m56865x1() + c12014ne.m56669jd());
            C12014ne c12014ne2 = c12014neArr[0];
            c12014ne2.m56684x1(c12014ne2.m56663c5() - c12023wlClone.m56865x1());
        } else {
            C12023wl c12023wlClone2 = c14787xi.m73408m9().m68736k4(new C12015qq(c12014neArr[0].m56663c5() * 0.8f, c12014neArr[0].m56683x1() * 0.7f).Clone()).Clone();
            if (c14787xi.m73384dy().getPosition() == 3) {
                C12014ne c12014ne3 = c12014neArr[0];
                c12014ne3.m56682to(c12023wlClone2.m56862kk() + 2 + c12014ne3.m56664ck());
            }
            C12014ne c12014ne4 = c12014neArr[0];
            c12014ne4.m56671k4(c12014ne4.m56683x1() - (c12023wlClone2.m56862kk() + 2));
        }
        C14343qe.m69546k4(c14365qy, z, c12014neArr[0].Clone());
    }
}
