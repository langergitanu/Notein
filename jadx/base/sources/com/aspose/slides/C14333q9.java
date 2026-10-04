package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.IDisposable;
import com.microsoft.identity.common.java.eststelemetry.PublicApiId;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.q9 */
/* JADX INFO: loaded from: classes3.dex */
class C14333q9 {
    /* JADX INFO: renamed from: k4 */
    private static int m69461k4(C12014ne c12014ne, C14365qy c14365qy) {
        C14328q5 c14328q5M69838jd = c14365qy.m69838jd();
        C12013m9 c12013m9M69409to = c14328q5M69838jd.m69409to();
        List<C1210hn> listM69871x1 = c14365qy.m69871x1();
        List<C1210hn>[] listArrM69861to = c14365qy.m69861to();
        float fM56663c5 = c14365qy.m69854ne().m73384dy() != null ? c12014ne.m56663c5() / c14365qy.m69854ne().f50098m9.size() : listM69871x1.size();
        C12015qq c12015qqClone = C12015qq.f40552k4.Clone();
        List.Enumerator<C1210hn> it = listM69871x1.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            try {
                C1210hn next = it.next();
                String strM63880k4 = C13729ki.m63880k4(next.m7238x1(), next.m7228h4(), next.m7227du());
                if (!C14113y2.m67411k4(strM63880k4)) {
                    C12015qq c12015qqClone2 = m69462k4(C14117yj.m67537ne(strM63880k4.charAt(0)), c14328q5M69838jd).Clone();
                    int iM27462to = C7019kk.m27462to(Float.valueOf((c12015qqClone2.m56699x1() * c14365qy.m69854ne().m73378ck()) / 300.0f), 13);
                    if (iM27462to > i2) {
                        c12015qqClone2.CloneTo(c12015qqClone);
                        i2 = iM27462to;
                    }
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        C12015qq c12015qq = new C12015qq(fM56663c5 - (c12015qqClone.m56699x1() * 2.0f), c12014ne.m56683x1() / 2.0f);
        C12023wl c12023wl = new C12023wl(0, 0);
        if (listM69871x1.size() > 0) {
            for (int i3 = 0; i3 < listM69871x1.size(); i3++) {
                C1210hn c1210hn = listM69871x1.get_Item(i3);
                C12023wl c12023wlClone = C0840c3.m4440k4(C13729ki.m63880k4(c1210hn.m7238x1(), c1210hn.m7228h4(), c1210hn.m7227du()), 0, c12013m9M69409to, c12015qq.Clone(), 1, 1, true).Clone();
                if (c12023wlClone.m56865x1() > c12023wl.m56865x1()) {
                    c12023wl.m56860k4(c12023wlClone.m56865x1());
                }
                if (c12023wlClone.m56862kk() > c12023wl.m56862kk()) {
                    c12023wl.m56866x1(c12023wlClone.m56862kk());
                }
            }
        } else {
            C0840c3.m4439k4(PublicApiId.SINGLE_ACCOUNT_PCA_SIGN_IN, 0, c12013m9M69409to, c12015qq.Clone(), 1, 1).CloneTo(c12023wl);
        }
        int iM56862kk = c12023wl.m56862kk() + i2;
        c14328q5M69838jd.m69411x1(iM56862kk);
        if (listArrM69861to != null && listArrM69861to.length > 0 && listM69871x1.size() > 0) {
            iM56862kk += i2 * listArrM69861to.length;
            int iM56862kk2 = 0;
            for (List<C1210hn> list : listArrM69861to) {
                iM56862kk2 += m69463k4(list, 0, c14328q5M69838jd, c12015qq.Clone()).Clone().m56862kk();
            }
            i = iM56862kk2;
        }
        return iM56862kk + i;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12015qq m69462k4(String str, C14328q5 c14328q5) {
        C12009k4 c12009k4 = new C12009k4(1, 1);
        try {
            AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
            try {
                C12015qq c12015qqClone = abstractC12008jdM56582k4.mo17487k4(str, c14328q5.m69409to()).Clone();
                C12015qq c12015qq = new C12015qq((float) C14116yg.m67501x1(c12015qqClone.m56699x1()), (float) C14116yg.m67501x1(c12015qqClone.m56697kk()));
                abstractC12008jdM56582k4.dispose();
                return c12015qq;
            } catch (Throwable th) {
                if (abstractC12008jdM56582k4 != null) {
                    abstractC12008jdM56582k4.dispose();
                }
                throw th;
            }
        } finally {
            c12009k4.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C12023wl m69463k4(List<C1210hn> list, int i, C14328q5 c14328q5, C12015qq c12015qq) {
        int i2 = 0;
        int iM56865x1 = 0;
        int iM56862kk = 0;
        while (i2 < list.size()) {
            C1210hn c1210hn = list.get_Item(i2);
            int i3 = i;
            C12023wl c12023wlClone = C0840c3.m4439k4(C13729ki.m63880k4(c1210hn.m7238x1(), c1210hn.m7228h4(), c1210hn.m7227du()), i3, c14328q5.m69409to(), c12015qq.Clone(), 1, 1).Clone();
            if (c12023wlClone.m56865x1() > iM56865x1) {
                iM56865x1 = c12023wlClone.m56865x1();
            }
            if (c12023wlClone.m56862kk() > iM56862kk) {
                iM56862kk = c12023wlClone.m56862kk();
            }
            i2++;
            i = i3;
        }
        return new C12023wl(iM56865x1, iM56862kk);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69464k4(C14365qy c14365qy) {
        C12023wl c12023wlClone;
        if (kc0.m63756k4(c14365qy.f48440k4.f5456k4.Clone()) || !c14365qy.m69834fa().hasDataTable()) {
            return;
        }
        C14328q5 c14328q5M69838jd = c14365qy.m69838jd();
        C12023wl c12023wlClone2 = C14580tx.m71375k4(c14365qy).Clone();
        int iM69461k4 = m69461k4(c14365qy.f48440k4.f5456k4.Clone(), c14365qy);
        int iM56862kk = c12023wlClone2.m56862kk() + iM69461k4;
        if (iM56862kk * 2 > c14365qy.m69834fa().getHeight()) {
            c14328q5M69838jd.m69403k4(iM69461k4);
            c14328q5M69838jd.f48246k4.m56671k4(C7019kk.m27462to(Float.valueOf(iM56862kk * 0.9f), 13));
            c12023wlClone = new C12023wl(c12023wlClone2.m56865x1(), com.aspose.slides.Collections.Generic.OooO00o.OooO00o(c12023wlClone2.m56862kk(), 0.9d, 14));
        } else {
            c14328q5M69838jd.m69403k4(iM69461k4);
            c14328q5M69838jd.f48246k4.m56671k4(C7019kk.m27462to(Float.valueOf(iM56862kk * 0.9f), 13));
            c12023wlClone = c12023wlClone2.Clone();
        }
        c14328q5M69838jd.m69406k4(c12023wlClone);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m69465k4(C14365qy c14365qy, C12014ne[] c12014neArr) {
        C12014ne c12014ne;
        int iM56683x1;
        C12014ne c12014ne2;
        byte rotationX = c14365qy.m69834fa().getRotation3D().getRotationX();
        boolean zIsChartTypeBar = ChartTypeCharacterizer.isChartTypeBar(c14365qy.m69834fa().getType());
        boolean zIsLocationAutocalculated = ((ChartPlotArea) C7019kk.m27452k4((Object) c14365qy.m69834fa().getPlotArea(), ChartPlotArea.class)).isLocationAutocalculated();
        if (kc0.m63756k4(c12014neArr[0].Clone()) || !c14365qy.m69834fa().hasDataTable()) {
            return;
        }
        C14328q5 c14328q5M69838jd = c14365qy.m69838jd();
        C12023wl c12023wlClone = c14328q5M69838jd.m69401h4().Clone();
        int iM56862kk = c12023wlClone.m56862kk() + c14328q5M69838jd.m69400dy();
        if (rotationX <= 0 || zIsChartTypeBar) {
            if (zIsLocationAutocalculated || c14365qy.m69834fa().getPlotArea().getLayoutTargetType() != 0) {
                c12014ne = c12014neArr[0];
                iM56683x1 = c12014ne.m56683x1() - iM56862kk;
            } else {
                c12014ne = c12014neArr[0];
                iM56683x1 = c12014ne.m56683x1() + iM56862kk;
            }
            c12014ne.m56671k4(iM56683x1);
            c12014ne2 = c12014neArr[0];
        } else {
            if (zIsLocationAutocalculated || c14365qy.m69834fa().getPlotArea().getLayoutTargetType() != 0) {
                C12014ne c12014ne3 = c12014neArr[0];
                c12014ne3.m56671k4(c12014ne3.m56683x1() - (iM56862kk + 2));
                C12014ne c12014ne4 = c12014neArr[0];
                c12014ne4.m56676kk(c12023wlClone.m56865x1() + c12014ne4.m56669jd());
                C12014ne c12014ne5 = c12014neArr[0];
                c12014ne5.m56684x1(c12014ne5.m56663c5() - c12023wlClone.m56865x1());
            } else {
                C12014ne c12014ne6 = c12014neArr[0];
                c12014ne6.m56671k4(iM56862kk + 2 + c12014ne6.m56683x1());
                C12014ne c12014ne7 = c12014neArr[0];
                c12014ne7.m56676kk(c12014ne7.m56669jd() - c12023wlClone.m56865x1());
                C12014ne c12014ne8 = c12014neArr[0];
                c12014ne8.m56684x1(c12023wlClone.m56865x1() + c12014ne8.m56663c5());
            }
            if (!zIsLocationAutocalculated && c14365qy.m69834fa().getPlotArea().getLayoutTargetType() != 1) {
                return;
            } else {
                c12014ne2 = c12014neArr[0];
            }
        }
        C14343qe.m69546k4(c14365qy, zIsChartTypeBar, c12014ne2.Clone());
    }
}
