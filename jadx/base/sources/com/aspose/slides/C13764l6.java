package com.aspose.slides;

import Oooo0.C20856OooooOo;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.l6 */
/* JADX INFO: loaded from: classes3.dex */
class C13764l6 {

    /* JADX INFO: renamed from: k4 */
    private final C14365qy f45950k4;

    public C13764l6(C14365qy c14365qy) {
        this.f45950k4 = c14365qy;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64313k4() {
        byte rotationX = this.f45950k4.m69834fa().getRotation3D().getRotationX();
        if (!this.f45950k4.m69834fa().hasDataTable() || rotationX < 0) {
            return;
        }
        boolean zIsChartTypeBar = ChartTypeCharacterizer.isChartTypeBar(this.f45950k4.m69834fa().getType());
        IRotation3D rotation3D = this.f45950k4.m69834fa().getRotation3D();
        float depthPercents = ((rotation3D.getDepthPercents() & 65535) / 100.0f) * this.f45950k4.m69833e0().m64102dy();
        float fOooO00o = OooOOOO.OooO00o(OooOO0O.OooO0O0(this.f45950k4.m69834fa(), 0) & 65535, 100.0f, depthPercents, depthPercents);
        List<s8k> listM6608k4 = gfh.m6608k4(true, zIsChartTypeBar, this.f45950k4.m69838jd().m69410x1(), this.f45950k4);
        m64311k4(this.f45950k4, zIsChartTypeBar, listM6608k4, fOooO00o);
        m64310k4(this.f45950k4, zIsChartTypeBar, 0.0f, fOooO00o);
        m64312k4(this.f45950k4, zIsChartTypeBar, listM6608k4, 0.0f, fOooO00o);
    }

    /* JADX INFO: renamed from: k4 */
    private void m64309k4(C14365qy c14365qy, C12007ix c12007ix, s8k s8kVar, float f) {
        C11896dy c11896dy;
        if (s8kVar.m70489x1() == 2) {
            C12025x6 c12025x6 = new C12025x6(c12007ix.m56557jd(), C22203OooOO0o.OooO0O0(c12007ix, 2.0f, c12007ix.m56551ck()));
            C12025x6 c12025x62 = new C12025x6(c12007ix.m56556h4(), C22203OooOO0o.OooO0O0(c12007ix, 2.0f, c12007ix.m56551ck()));
            c11896dy = new C11896dy();
            try {
                c11896dy.m55547k4(c12025x6.Clone(), c12025x62.Clone());
                C1236i2.m7387k4(s8kVar.m70487kk().m74309x1().Clone().Clone(), C12003du.f40505to.Clone(), c14365qy, c11896dy, (LineFormat) s8kVar.m70487kk().m74307kk().getFormat().getLine(), (FillFormat) s8kVar.m70487kk().m74307kk().getFormat().getFill(), 1.0f, f);
                return;
            } finally {
            }
        }
        if (s8kVar.m70489x1() == 1) {
            C13847mr c13847mrM70488to = s8kVar.m70488to();
            C13847mr c13847mrM70488to2 = s8kVar.m70488to();
            if (ChartTypeCharacterizer.isChartTypeBubble(c13847mrM70488to.m64945h4().getType())) {
                float fM74375dy = c14365qy.m69826c5().m74375dy();
                C12007ix c12007ix2 = new C12007ix(c12007ix.m56557jd(), ((c12007ix.m56575x1() - fM74375dy) / 2.0f) + c12007ix.m56551ck(), fM74375dy, fM74375dy);
                c11896dy = new C11896dy();
                try {
                    c11896dy.m55542k4(c12007ix2.Clone());
                    c13847mrM70488to.m64949k4(c11896dy, f);
                    c13847mrM70488to.m64965x1(c11896dy, f);
                    return;
                } finally {
                }
            }
            if (ChartTypeCharacterizer.m757du(c13847mrM70488to.m64945h4().getType())) {
                if (c13847mrM70488to.m64945h4().getFormat().getLine().getFillFormat().getFillType() != 0 || c13847mrM70488to.m64945h4().getFormat().getLine().getFillFormat().getFillType() != -1) {
                    c11896dy = new C11896dy();
                    try {
                        c11896dy.m55574x1(c12007ix.m56557jd(), (c12007ix.m56575x1() / 2.0f) + c12007ix.m56551ck(), c12007ix.m56557jd() + c12007ix.m56550c5(), (c12007ix.m56575x1() / 2.0f) + c12007ix.m56551ck());
                        c13847mrM70488to.m64965x1(c11896dy, f);
                    } finally {
                    }
                }
                if (c13847mrM70488to2.m64945h4().getMarker().getSymbol() != 4) {
                    c13847mrM70488to2.m64946jd().m70444k4(C22205OooOOo.OooO00o(c12007ix, 2.0f, c12007ix.m56557jd()), C22203OooOO0o.OooO0O0(c12007ix, 2.0f, c12007ix.m56551ck()), (c13847mrM70488to2.m64945h4().getMarker().getSize() != 0 && ((float) c13847mrM70488to2.m64945h4().getMarker().getSize()) <= c12007ix.m56575x1() * 0.5f) ? c13847mrM70488to2.m64945h4().getMarker().getSize() : c12007ix.m56575x1() * 0.5f);
                    return;
                }
                return;
            }
            if (ChartTypeCharacterizer.isChartTypeStock(c13847mrM70488to.m64945h4().getType())) {
                return;
            }
            float fM56550c5 = c12007ix.m56550c5();
            float fM74375dy2 = c14365qy.m69826c5().m74375dy();
            C12007ix c12007ix3 = new C12007ix(c12007ix.m56557jd() - (fM56550c5 / 2.0f), C22203OooOO0o.OooO0O0(c12007ix, 2.0f, c12007ix.m56551ck()) - (fM74375dy2 / 2.0f), fM56550c5, fM74375dy2);
            c11896dy = new C11896dy();
            try {
                c11896dy.m55578x1(c12007ix3.Clone());
                c13847mrM70488to.m64949k4(c11896dy, f);
                c13847mrM70488to.m64965x1(c11896dy, f);
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m64310k4(C14365qy c14365qy, boolean z, float f, float f2) {
        IRotation3D iRotation3D;
        float f3;
        int i;
        IRotation3D rotation3D = c14365qy.m69834fa().getRotation3D();
        float rotationX = rotation3D.getRotationX();
        C12023wl c12023wlClone = c14365qy.m69838jd().m69401h4().Clone();
        int iM56669jd = c14365qy.m69838jd().f48246k4.m56669jd();
        int iM56664ck = c14365qy.m69838jd().f48246k4.m56664ck();
        int iM56663c5 = c14365qy.m69838jd().f48246k4.m56663c5();
        C12014ne c12014ne = new C12014ne(iM56669jd, iM56664ck, iM56663c5, c12023wlClone.m56862kk() + c14365qy.m69838jd().m69400dy());
        C12014ne c12014ne2 = new C12014ne(iM56669jd - c12023wlClone.m56865x1(), c14365qy.m69838jd().m69400dy() + iM56664ck, c12023wlClone.m56865x1() + iM56663c5, c12023wlClone.m56862kk());
        int iM69819to = C14365qy.m69819to(c14365qy.m69865up());
        List<C1210hn> listM69871x1 = c14365qy.m69871x1();
        List<C1210hn>[] listArrM69861to = c14365qy.m69861to();
        boolean z2 = c14365qy.m69854ne().m73385fa() && listM69871x1.size() > 0;
        if (listArrM69861to != null && listArrM69861to.length > 0 && listM69871x1.size() > 0) {
            z2 = true;
        }
        float f4 = iM56663c5 / iM69819to;
        C12015qq c12015qqClone = C12015qq.f40552k4.Clone();
        int i2 = 0;
        int iM27462to = 0;
        while (i2 < iM69819to) {
            int i3 = c14365qy.m69854ne().m73384dy().isPlotOrderReversed() ? (iM69819to - i2) - 1 : i2;
            String strM63880k4 = C14113y2.f47374k4;
            if (i3 <= c14365qy.m69871x1().size() - 1) {
                C1210hn c1210hn = listM69871x1.get_Item(i3);
                if (z2) {
                    iRotation3D = rotation3D;
                    f3 = rotationX;
                    strM63880k4 = C13729ki.m63880k4(c1210hn.m7238x1(), i3 < listM69871x1.size() ? c1210hn.m7228h4() : C14113y2.f47374k4, i3 < listM69871x1.size() && c1210hn.m7227du());
                } else {
                    strM63880k4 = C0841c4.m4468k4(c1210hn.m7238x1(), c14365qy.m69854ne());
                    iRotation3D = rotation3D;
                    f3 = rotationX;
                }
            } else {
                iRotation3D = rotation3D;
                f3 = rotationX;
            }
            String str = strM63880k4;
            if (!C14113y2.m67411k4(str)) {
                C12015qq c12015qqClone2 = C14333q9.m69462k4(C14117yj.m67537ne(str.charAt(0)), c14365qy.m69838jd()).Clone();
                int iM27462to2 = C7019kk.m27462to(Float.valueOf((c12015qqClone2.m56699x1() * c14365qy.m69854ne().m73378ck()) / 300.0f), 13);
                if (iM27462to2 > iM27462to) {
                    c12015qqClone2.CloneTo(c12015qqClone);
                    iM27462to = iM27462to2;
                }
            }
            C12007ix c12007ix = new C12007ix((i2 * f4) + iM56669jd, iM56664ck + iM27462to, f4, c14365qy.m69838jd().m69398c5());
            if (z || !iRotation3D.getRightAngleAxes()) {
                i = iM69819to;
                C0840c3.m4444k4(c12007ix.Clone(), str, 0, c14365qy.m69838jd().m69407kk(), c14365qy.m69838jd().m69399du().Clone(), 1, 2, c14365qy);
            } else {
                float fM67480k4 = ((180.0f - C14116yg.m67480k4(f3)) * c12015qqClone.m56699x1()) / 180.0f;
                i = iM69819to;
                C1236i2.m7388k4(new C12007ix((fM67480k4 / 2.0f) + c12007ix.m56557jd(), c12007ix.m56551ck(), c12007ix.m56550c5() - fM67480k4, c12007ix.m56575x1()).Clone(), str, 0, c14365qy.m69838jd().m69407kk(), c14365qy.m69838jd().m69399du().Clone(), 1, 2, c14365qy, f2);
            }
            i2++;
            iM69819to = i;
            rotation3D = iRotation3D;
            rotationX = f3;
        }
        if (listArrM69861to == null || listArrM69861to.length <= 0 || c14365qy.m69871x1().size() <= 0) {
            return;
        }
        if (C12015qq.m56693x1(c12015qqClone, C12015qq.f40552k4)) {
            C14333q9.m69462k4("a", c14365qy.m69838jd()).CloneTo(c12015qqClone);
            iM27462to = C7019kk.m27462to(Float.valueOf((c12015qqClone.m56699x1() * c14365qy.m69854ne().m73378ck()) / 300.0f), 13);
        }
        m64314k4(listArrM69861to, new C12025x6(!c14365qy.m69854ne().m73384dy().isPlotOrderReversed() ? c12014ne.m56681to() : c12014ne.m56668h4(), c12014ne2.m56666dy()), iM27462to, f4, 2, c12014ne.Clone(), c14365qy.m69854ne(), c14365qy, f2);
    }

    /* JADX INFO: renamed from: k4 */
    private void m64311k4(C14365qy c14365qy, boolean z, List<s8k> list, float f) {
        C11896dy c11896dy;
        DataTable dataTable = (DataTable) c14365qy.m69834fa().getChartDataTable();
        if (dataTable.hasBorderOutline() || dataTable.hasBorderHorizontal() || dataTable.hasBorderVertical()) {
            IRotation3D rotation3D = c14365qy.m69834fa().getRotation3D();
            C12023wl c12023wlClone = c14365qy.m69838jd().m69401h4().Clone();
            int iM56669jd = c14365qy.m69838jd().f48246k4.m56669jd();
            int iM56664ck = c14365qy.m69838jd().f48246k4.m56664ck();
            int iM56663c5 = c14365qy.m69838jd().f48246k4.m56663c5();
            int iM56862kk = c12023wlClone.m56862kk() + c14365qy.m69838jd().m69400dy();
            C12014ne c12014ne = new C12014ne(iM56669jd, iM56664ck, iM56663c5, iM56862kk);
            C12014ne c12014ne2 = new C12014ne(iM56669jd - c12023wlClone.m56865x1(), iM56664ck + c14365qy.m69838jd().m69400dy(), c12023wlClone.m56865x1() + iM56663c5, c12023wlClone.m56862kk());
            if (dataTable.hasBorderOutline()) {
                c11896dy = new C11896dy();
                try {
                    if (c14365qy.m69861to() != null && c14365qy.m69861to().length > 0 && c14365qy.m69871x1().size() > 0) {
                        c11896dy.m55576x1(c12014ne.m56668h4(), c12014ne.m56666dy(), c12014ne.m56681to(), c12014ne.m56666dy());
                    }
                    c11896dy.m55576x1(c12014ne.m56669jd(), c12014ne.m56664ck(), c12014ne.m56669jd(), c12014ne.m56670k4());
                    c11896dy.m55576x1(c12014ne.m56669jd(), c12014ne.m56670k4(), c12014ne.m56668h4(), c12014ne.m56670k4());
                    c11896dy.m55576x1(c12014ne.m56668h4(), c12014ne.m56670k4(), c12014ne.m56668h4(), c12014ne.m56664ck());
                    c11896dy.m55579x1(c12014ne2.Clone());
                    if (z || !rotation3D.getRightAngleAxes()) {
                        C12003du c12003duClone = c14365qy.m69838jd().m69402k4().Clone();
                        im9.m7698k4(c12003duClone.Clone(), C12003du.f40505to.Clone(), c14365qy, C12007ix.m56544k4(c12014ne).Clone(), (Format) dataTable.getFormat());
                        im9.m7698k4(c12003duClone.Clone(), C12003du.f40505to.Clone(), c14365qy, C12007ix.m56544k4(c12014ne2).Clone(), (Format) dataTable.getFormat());
                    } else {
                        c14365qy.m69838jd().m69405k4(c11896dy, 0.0f, f);
                    }
                } finally {
                    c11896dy.dispose();
                }
            }
            if (dataTable.hasBorderHorizontal()) {
                float fM56862kk = c14365qy.m69838jd().m69401h4().m56862kk() / list.size();
                for (int i = 1; i < list.size(); i++) {
                    c11896dy = new C11896dy();
                    try {
                        float fM56666dy = (i * fM56862kk) + c12014ne2.m56666dy();
                        c11896dy.m55574x1(c12014ne2.m56681to(), fM56666dy, c12014ne2.m56668h4(), fM56666dy);
                        if (z || !rotation3D.getRightAngleAxes()) {
                            im9.m7705k4(c14365qy.m69838jd().m69402k4().Clone().Clone(), c14365qy, c11896dy, (LineFormat) dataTable.getFormat().getLine(), (IEffectFormat) null);
                        } else {
                            c14365qy.m69838jd().m69405k4(c11896dy, 0.0f, f);
                        }
                        c11896dy.dispose();
                    } finally {
                    }
                }
            }
            if (dataTable.hasBorderVertical()) {
                int iM69819to = C14365qy.m69819to(c14365qy.m69865up());
                float f2 = iM56663c5 / iM69819to;
                for (int i2 = 1; i2 < iM69819to; i2++) {
                    c11896dy = new C11896dy();
                    float f3 = (i2 * f2) + iM56669jd;
                    try {
                        float fM56666dy2 = c12014ne.m56666dy();
                        c11896dy.m55574x1(f3, fM56666dy2, f3, iM56862kk + fM56666dy2);
                        if (z || !rotation3D.getRightAngleAxes()) {
                            im9.m7705k4(c14365qy.m69838jd().m69402k4().Clone().Clone(), c14365qy, c11896dy, (LineFormat) dataTable.getFormat().getLine(), (IEffectFormat) null);
                        } else {
                            c14365qy.m69838jd().m69405k4(c11896dy, 0.0f, f);
                        }
                        c11896dy.dispose();
                    } finally {
                        c11896dy.dispose();
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22, types: [int] */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24, types: [int] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2, types: [int] */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX INFO: renamed from: k4 */
    private void m64312k4(C14365qy c14365qy, boolean z, List<s8k> list, float f, float f2) {
        float f3;
        float fM56699x1;
        int i;
        C12015qq c12015qq;
        boolean z2;
        ?? r22;
        C12015qq c12015qq2;
        float f4;
        C14365qy c14365qy2 = c14365qy;
        List<s8k> list2 = list;
        if (list2 == null || list2.size() == 0) {
            return;
        }
        IRotation3D rotation3D = c14365qy2.m69834fa().getRotation3D();
        C12015qq c12015qqClone = gfh.m6611k4(c14365qy2).Clone();
        C12023wl c12023wlClone = c14365qy2.m69838jd().m69401h4().Clone();
        float fM56862kk = c12023wlClone.m56862kk() / list2.size();
        int iM56669jd = c14365qy2.m69838jd().f48246k4.m56669jd();
        int iM56664ck = c14365qy2.m69838jd().f48246k4.m56664ck();
        int iM56663c5 = c14365qy2.m69838jd().f48246k4.m56663c5();
        C12014ne c12014ne = new C12014ne(iM56669jd - c12023wlClone.m56865x1(), iM56664ck + c14365qy2.m69838jd().m69400dy(), c12023wlClone.m56865x1() + iM56663c5, c12023wlClone.m56862kk());
        C12013m9 c12013m9M69407kk = c14365qy2.m69838jd().m69407kk();
        float fM69819to = iM56663c5 / C14365qy.m69819to(c14365qy2.m69865up());
        int i2 = 0;
        while (i2 < list2.size()) {
            s8k s8kVar = list2.get_Item(i2);
            C13847mr c13847mrM70488to = s8kVar.m70488to();
            float fM56666dy = (i2 * fM56862kk) + c12014ne.m56666dy();
            if (c14365qy2.m69834fa().getChartDataTable().getShowLegendKey()) {
                C12007ix c12007ix = new C12007ix(c12014ne.m56681to() + 4.0f, fM56666dy, c12015qqClone.m56699x1(), fM56862kk);
                if (z || !rotation3D.getRightAngleAxes()) {
                    f4 = 4.0f;
                    f3 = f2;
                    gfh.m6619k4(c12007ix.Clone(), s8kVar, c14365qy2);
                } else {
                    f4 = 4.0f;
                    f3 = f2;
                    m64309k4(c14365qy2, c12007ix.Clone(), s8kVar, f3);
                }
                fM56699x1 = c12015qqClone.m56699x1() + f4;
            } else {
                f3 = f2;
                fM56699x1 = 0.0f;
            }
            int i3 = i2;
            String strM64957kk = c13847mrM70488to.m64957kk();
            C12015qq c12015qqClone2 = C0840c3.m4449x1(strM64957kk, c14365qy2.m69838jd().m69409to()).Clone();
            float f5 = (fM56862kk / 2.0f) + fM56666dy;
            C12025x6 c12025x6 = new C12025x6((iM56669jd - c12023wlClone.m56865x1()) + fM56699x1, f5 - (c12015qqClone2.m56697kk() / 2.0f));
            if (z || !rotation3D.getRightAngleAxes()) {
                i = i3;
                c12015qq = c12015qqClone2;
                z2 = false;
                C0840c3.m4444k4(new C12007ix(c12025x6.Clone(), c12015qq.Clone()), strM64957kk, 0, c12013m9M69407kk, c14365qy.m69838jd().m69399du().Clone(), 1, 2, c14365qy);
            } else {
                i = i3;
                c12015qq = c12015qqClone2;
                z2 = false;
                C1236i2.m7388k4(new C12007ix(c12025x6.Clone(), c12015qqClone2.Clone()), strM64957kk, 0, c12013m9M69407kk, c14365qy2.m69838jd().m69399du().Clone(), 2, 2, c14365qy2, f3);
            }
            ?? r0 = z2;
            while (r0 < c13847mrM70488to.m64944dy().size()) {
                C0886d8 c0886d8 = c13847mrM70488to.m64944dy().get_Item(c14365qy.m69854ne().m73384dy().isPlotOrderReversed() ? C20856OooooOo.OooO00o(r0, 1, c13847mrM70488to.m64944dy()) : r0);
                if (c0886d8.m4983dy()) {
                    c12015qq2 = c12015qq;
                    r22 = r0;
                } else {
                    String strM63880k4 = C13729ki.m63880k4(Double.valueOf(c0886d8.m4989k4()), c0886d8.m5008to(), z2);
                    C12015qq c12015qq3 = c12015qq;
                    C0840c3.m4449x1(strM63880k4, c14365qy.m69838jd().m69409to()).CloneTo(c12015qq3);
                    C12025x6 c12025x62 = new C12025x6(((fM69819to / 2.0f) + ((((float) r0) * fM69819to) + iM56669jd)) - (c12015qq3.m56699x1() / 2.0f), f5 - (c12015qq3.m56697kk() / 2.0f));
                    if (z || !rotation3D.getRightAngleAxes()) {
                        r22 = r0;
                        c12015qq2 = c12015qq3;
                        C0840c3.m4444k4(new C12007ix(c12025x62.Clone(), c12015qq2.Clone()), strM63880k4, 0, c12013m9M69407kk, c14365qy.m69838jd().m69399du().Clone(), 1, 2, c14365qy);
                    } else {
                        ?? r5 = r0;
                        C12007ix c12007ix2 = new C12007ix(c12025x62.Clone(), c12015qq3.Clone());
                        C12003du c12003duClone = c14365qy.m69838jd().m69399du().Clone();
                        r22 = r5 == true ? 1 : 0;
                        c12015qq2 = c12015qq3;
                        C1236i2.m7388k4(c12007ix2, strM63880k4, 0, c12013m9M69407kk, c12003duClone, 1, 2, c14365qy, f2);
                    }
                }
                c12015qq = c12015qq2;
                r0 = r22 + 1;
            }
            i2 = i + 1;
            c14365qy2 = c14365qy;
            list2 = list;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m64314k4(List<C1210hn>[] listArr, C12025x6 c12025x6, float f, double d, int i, C12014ne c12014ne, C14787xi c14787xi, C14365qy c14365qy, float f2) {
        List<C1210hn>[] listArr2 = listArr;
        float fM56895kk = c12025x6.m56895kk();
        C14328q5 c14328q5M69838jd = c14365qy.m69838jd();
        float f3 = 2.0f;
        C12015qq c12015qq = new C12015qq((float) d, c12014ne.m56683x1() / 2.0f);
        int i2 = 0;
        while (i2 < listArr2.length) {
            List<C1210hn> list = listArr2[i2];
            C12023wl c12023wlClone = C14333q9.m69463k4(list, 0, c14328q5M69838jd, c12015qq.Clone()).Clone();
            float fM56897x1 = c12025x6.m56897x1();
            int i3 = 0;
            while (i3 < list.size()) {
                C1210hn c1210hn = list.get_Item(i3);
                String strM63880k4 = C13729ki.m63880k4(c1210hn.m7238x1(), c1210hn.m7228h4(), c1210hn.m7227du());
                float fM4458k4 = (float) (((double) C0841c4.m4458k4(c1210hn)) * d);
                int i4 = i3;
                C1236i2.m7388k4(C12007ix.m56544k4(C12014ne.m56661x1(new C12007ix((!c14787xi.m73384dy().isPlotOrderReversed() ? (fM4458k4 / f3) + fM56897x1 : fM56897x1 - (fM4458k4 / f3)) - (c12023wlClone.m56865x1() / f3), fM56895kk - c12023wlClone.m56862kk(), c12023wlClone.m56865x1(), c12023wlClone.m56862kk()).Clone())).Clone(), strM63880k4, 0, c14328q5M69838jd.m69407kk(), c14328q5M69838jd.m69399du().Clone(), 1, i, c14365qy, f2);
                fM56897x1 = !c14787xi.m73384dy().isPlotOrderReversed() ? fM56897x1 + fM4458k4 : fM56897x1 - fM4458k4;
                i3 = i4 + 1;
                f3 = 2.0f;
            }
            fM56895kk -= f + c12023wlClone.m56862kk();
            i2++;
            listArr2 = listArr;
            f3 = 2.0f;
        }
    }
}
