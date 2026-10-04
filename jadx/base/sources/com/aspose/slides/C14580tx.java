package com.aspose.slides;

import Oooo0.C20856OooooOo;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14067j2;
import com.huawei.hms.network.embedded.C18385v2;
import com.microsoft.identity.common.java.eststelemetry.PublicApiId;

/* JADX INFO: renamed from: com.aspose.slides.tx */
/* JADX INFO: loaded from: classes3.dex */
class C14580tx extends AbstractC7020m9<C14580tx> {
    /* JADX INFO: renamed from: k4 */
    public static int m71373k4(C12014ne c12014ne, C14365qy c14365qy) {
        C14328q5 c14328q5M69838jd = c14365qy.m69838jd();
        int iM56865x1 = (C0840c3.m4442k4("a", c14328q5M69838jd.m69409to()).Clone().m56865x1() * c14365qy.m69854ne().m73378ck()) / 300;
        C12013m9 c12013m9M69409to = c14328q5M69838jd.m69409to();
        List<C1210hn> listM69871x1 = c14365qy.m69871x1();
        List<C1210hn>[] listArrM69861to = c14365qy.m69861to();
        C12015qq c12015qq = new C12015qq(c14365qy.m69854ne().m73384dy() != null ? c12014ne.m56663c5() / c14365qy.m69854ne().f50098m9.size() : listM69871x1.size(), c12014ne.m56683x1() / 2.0f);
        int i = 0;
        C12023wl c12023wl = new C12023wl(0, 0);
        if (listM69871x1.size() > 0) {
            for (int i2 = 0; i2 < listM69871x1.size(); i2++) {
                C1210hn c1210hn = listM69871x1.get_Item(i2);
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
        int iM56862kk = c12023wl.m56862kk() + iM56865x1;
        c14328q5M69838jd.m69411x1(iM56862kk);
        if (listArrM69861to != null && listArrM69861to.length > 0 && listM69871x1.size() > 0) {
            iM56862kk += iM56865x1 * listArrM69861to.length;
            int iM56862kk2 = 0;
            for (List<C1210hn> list : listArrM69861to) {
                iM56862kk2 += m71374k4(list, 0, c14328q5M69838jd, c12015qq.Clone()).Clone().m56862kk();
            }
            i = iM56862kk2;
        }
        return iM56862kk + i;
    }

    /* JADX INFO: renamed from: x1 */
    private static C12015qq m71379x1(C14365qy c14365qy) {
        List<C13847mr> listM69865up = c14365qy.m69865up();
        C12015qq c12015qq = new C12015qq(0.0f, 0.0f);
        C12015qq c12015qq2 = new C12015qq();
        AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) new C12009k4(1, 1));
        for (int i = 0; i < listM69865up.size(); i++) {
            abstractC12008jdM56582k4.mo17487k4(listM69865up.get_Item(i).m64957kk(), c14365qy.m69838jd().m69409to()).CloneTo(c12015qq2);
            if (c12015qq.m56699x1() < c12015qq2.m56699x1()) {
                c12015qq.m56695k4(c12015qq2.m56699x1());
            }
            if (c12015qq.m56697kk() < c12015qq2.m56697kk()) {
                c12015qq.m56700x1(c12015qq2.m56697kk());
            }
        }
        return c12015qq;
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
        if (obj instanceof C14580tx) {
            return m71380x1((C14580tx) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12023wl m71374k4(List<C1210hn> list, int i, C14328q5 c14328q5, C12015qq c12015qq) {
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

    /* JADX INFO: renamed from: x1 */
    private boolean m71380x1(C14580tx c14580tx) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ac  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C12023wl m71375k4(C14365qy c14365qy) {
        int iM27462to;
        int iM27462to2;
        C12015qq c12015qq = new C12015qq();
        DataTable dataTable = (DataTable) c14365qy.m69834fa().getChartDataTable();
        m71379x1(c14365qy).CloneTo(c12015qq);
        if (!dataTable.getShowLegendKey()) {
            iM27462to = C7019kk.m27462to(Float.valueOf(c12015qq.m56699x1()), 13);
            int i = iM27462to + 1;
            if (c12015qq.m56699x1() != 0.0f) {
                iM27462to2 = i;
            }
            if (c12015qq.m56697kk() == 0.0f) {
                c12015qq = AbstractC12008jd.m56582k4((AbstractC12002ck) new C12009k4(1, 1)).mo17487k4(C18385v2.f56336h, c14365qy.m69838jd().m69409to()).Clone();
            }
            int iM27462to3 = C7019kk.m27462to(Double.valueOf(((double) c12015qq.m56697kk()) + 0.5d), 14) + 5;
            if (iM27462to2 > c14365qy.m69867v4()) {
                iM27462to2 = C7019kk.m27462to(Float.valueOf(c14365qy.m69867v4()), 13);
            }
            if (iM27462to2 > c14365qy.m69867v4() - 16.0f) {
                iM27462to2 = C7019kk.m27462to(Float.valueOf(c14365qy.m69867v4()), 13) - 16;
            }
            return new C12023wl(iM27462to2, c14365qy.m69865up().size() * iM27462to3);
        }
        iM27462to = C7019kk.m27462to(Float.valueOf(c12015qq.m56699x1() + gfh.m6611k4(c14365qy).Clone().m56699x1()), 13);
        iM27462to2 = iM27462to + 5;
        if (c12015qq.m56697kk() == 0.0f) {
        }
        int iM27462to32 = C7019kk.m27462to(Double.valueOf(((double) c12015qq.m56697kk()) + 0.5d), 14) + 5;
        if (iM27462to2 > c14365qy.m69867v4()) {
        }
        if (iM27462to2 > c14365qy.m69867v4() - 16.0f) {
        }
        return new C12023wl(iM27462to2, c14365qy.m69865up().size() * iM27462to32);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C14580tx Clone() {
        C14580tx c14580tx = new C14580tx();
        CloneTo(c14580tx);
        return c14580tx;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static void m71376k4(int i, int i2, int i3, boolean z, C14365qy c14365qy) {
        C14365qy c14365qy2;
        DataTable dataTable;
        int i4;
        float f;
        float fM56699x1;
        int i5;
        C12014ne c12014ne;
        float f2;
        List<C1210hn>[] listArr;
        String strM63880k4;
        C14365qy c14365qy3 = c14365qy;
        if (c14365qy3.m69834fa().hasDataTable()) {
            DataTable dataTable2 = (DataTable) c14365qy3.m69834fa().getChartDataTable();
            int iM56865x1 = (C0840c3.m4442k4("a", c14365qy3.m69838jd().m69409to()).Clone().m56865x1() * c14365qy3.m69854ne().m73378ck()) / 300;
            C12023wl c12023wlClone = c14365qy3.m69838jd().m69401h4().Clone();
            int iM56862kk = c12023wlClone.m56862kk() + c14365qy3.m69838jd().m69400dy();
            C12015qq c12015qqClone = gfh.m6611k4(c14365qy3).Clone();
            int i6 = 1;
            List<s8k> listM6608k4 = gfh.m6608k4(true, z, c14365qy3.m69838jd().m69410x1(), c14365qy3);
            C12014ne c12014ne2 = new C12014ne(i, i2, i3, iM56862kk);
            C12014ne c12014ne3 = new C12014ne(i - c12023wlClone.m56865x1(), c14365qy3.m69838jd().m69400dy() + i2, c12023wlClone.m56865x1() + i3, c12023wlClone.m56862kk());
            if (dataTable2.hasBorderOutline()) {
                im9.m7698k4(c14365qy3.m69838jd().m69402k4().Clone(), C12003du.f40505to.Clone(), c14365qy3, C12007ix.m56544k4(c12014ne2).Clone(), (Format) dataTable2.getFormat());
                im9.m7698k4(c14365qy3.m69838jd().m69402k4().Clone(), C12003du.f40505to.Clone(), c14365qy3, C12007ix.m56544k4(c12014ne3).Clone(), (Format) dataTable2.getFormat());
            }
            float fM56862kk = c12023wlClone.m56862kk() / listM6608k4.size();
            if (dataTable2.hasBorderHorizontal()) {
                int i7 = 1;
                while (i7 < listM6608k4.size()) {
                    float fM56666dy = (i7 * fM56862kk) + c12014ne3.m56666dy();
                    im9.m7709k4(new C12025x6(c12014ne3.m56681to(), fM56666dy), new C12025x6(c12014ne3.m56668h4(), fM56666dy), c14365qy3.m69838jd().m69402k4().Clone(), (LineFormat) dataTable2.getFormat().getLine(), c14365qy3);
                    i7++;
                    i6 = i6;
                }
            }
            int i8 = i6;
            int iM69819to = C14365qy.m69819to(c14365qy3.m69865up());
            C12013m9 c12013m9M69407kk = c14365qy3.m69838jd().m69407kk();
            float f3 = i3 / iM69819to;
            List<C1210hn> listM69871x1 = c14365qy3.m69871x1();
            List<C1210hn>[] listArrM69861to = c14365qy3.m69861to();
            int i9 = (listArrM69861to == null || listArrM69861to.length <= 0 || listM69871x1.size() <= 0) ? (!c14365qy3.m69854ne().m73385fa() || listM69871x1.size() <= 0) ? 0 : i8 : i8;
            int i10 = 0;
            while (i10 < iM69819to) {
                if (dataTable2.hasBorderVertical()) {
                    c12014ne = c12014ne3;
                    float f4 = (i10 * f3) + i;
                    float fM56666dy2 = c12014ne2.m56666dy();
                    f2 = fM56862kk;
                    listArr = listArrM69861to;
                    im9.m7709k4(new C12025x6(f4, fM56666dy2), new C12025x6(f4, c14365qy3.m69838jd().m69398c5() + fM56666dy2), c14365qy3.m69838jd().m69402k4().Clone(), (LineFormat) dataTable2.getFormat().getLine(), c14365qy3);
                } else {
                    c12014ne = c12014ne3;
                    f2 = fM56862kk;
                    listArr = listArrM69861to;
                }
                int i11 = c14365qy3.m69854ne().m73384dy().isPlotOrderReversed() ? (iM69819to - i10) - 1 : i10;
                strM63880k4 = "";
                if (i11 <= c14365qy3.m69871x1().size() - 1) {
                    C1210hn c1210hn = listM69871x1.get_Item(i11);
                    if (i9 == 0) {
                        strM63880k4 = C0841c4.m4468k4(c1210hn.m7238x1(), c14365qy3.m69854ne());
                    } else {
                        strM63880k4 = C13729ki.m63880k4(c1210hn.m7238x1(), i11 < listM69871x1.size() ? c1210hn.m7228h4() : "", (i11 >= listM69871x1.size() || !c1210hn.m7227du()) ? 0 : i8);
                    }
                }
                float f5 = iM56865x1;
                float f6 = f2;
                C0840c3.m4444k4(new C12007ix((i10 * f3) + i, i2 + f5, f3, c14365qy3.m69838jd().m69398c5() - f5).Clone(), strM63880k4, 0, c14365qy3.m69838jd().m69407kk(), c14365qy3.m69838jd().m69399du().Clone(), 1, 2, c14365qy);
                i10++;
                c14365qy3 = c14365qy;
                f3 = f3;
                listArrM69861to = listArr;
                c12014ne3 = c12014ne;
                listM6608k4 = listM6608k4;
                listM69871x1 = listM69871x1;
                fM56862kk = f6;
                iM69819to = iM69819to;
            }
            float f7 = f3;
            C12014ne c12014ne4 = c12014ne3;
            float f8 = fM56862kk;
            List<s8k> list = listM6608k4;
            List<C1210hn>[] listArr2 = listArrM69861to;
            if (listArr2 == null || listArr2.length <= 0 || c14365qy.m69871x1().size() <= 0) {
                c14365qy2 = c14365qy;
                dataTable = dataTable2;
                i4 = i8;
                f = f7;
            } else {
                dataTable = dataTable2;
                i4 = i8;
                f = f7;
                m71378k4(listArr2, !c14365qy.m69854ne().m73384dy().isPlotOrderReversed() ? c12014ne2.m56681to() : c12014ne2.m56668h4(), c12014ne4.m56666dy(), iM56865x1, false, f7, 2, i2, c12014ne2.Clone(), false, c14365qy.m69854ne(), c14365qy);
                c14365qy2 = c14365qy;
            }
            int i12 = 0;
            while (i12 < list.size()) {
                List<s8k> list2 = list;
                s8k s8kVar = list2.get_Item(i12);
                C13847mr c13847mrM70488to = s8kVar.m70488to();
                float f9 = f8;
                float fM56666dy3 = (i12 * f9) + c12014ne4.m56666dy();
                if (dataTable.getShowLegendKey()) {
                    gfh.m6619k4(new C12007ix(c12014ne4.m56681to() + 4.0f, fM56666dy3, c12015qqClone.m56699x1(), f9).Clone(), s8kVar, c14365qy2);
                    fM56699x1 = c12015qqClone.m56699x1() + 4.0f;
                } else {
                    fM56699x1 = 0.0f;
                }
                String strM64957kk = c13847mrM70488to.m64957kk();
                C12015qq c12015qqClone2 = C0840c3.m4449x1(strM64957kk, c14365qy2.m69838jd().m69409to()).Clone();
                float f10 = (f9 / 2.0f) + fM56666dy3;
                C12013m9 c12013m9 = c12013m9M69407kk;
                C0840c3.m4444k4(new C12007ix(new C12025x6((i - c12023wlClone.m56865x1()) + fM56699x1, f10 - (c12015qqClone2.m56697kk() / 2.0f)).Clone(), c12015qqClone2.Clone()), strM64957kk, 0, c12013m9, c14365qy2.m69838jd().m69399du().Clone(), 1, 2, c14365qy2);
                int i13 = 0;
                while (i13 < c13847mrM70488to.m64944dy().size()) {
                    if (dataTable.hasBorderVertical() && i13 < c13847mrM70488to.m64944dy().size() - i4) {
                        float f11 = ((i13 + 1) * f) + i;
                        im9.m7709k4(new C12025x6(f11, fM56666dy3), new C12025x6(f11, fM56666dy3 + f9), c14365qy2.m69838jd().m69402k4().Clone(), (LineFormat) dataTable.getFormat().getLine(), c14365qy2);
                    }
                    C0886d8 c0886d8 = c13847mrM70488to.m64944dy().get_Item(c14365qy2.m69854ne().m73384dy().isPlotOrderReversed() ? C20856OooooOo.OooO00o(i13, i4, c13847mrM70488to.m64944dy()) : i13);
                    if (c0886d8.m4983dy()) {
                        i5 = i13;
                    } else {
                        String strM63880k42 = C13729ki.m63880k4((Object) Double.valueOf(c0886d8.m4989k4()), c0886d8.m5008to(), false);
                        C0840c3.m4449x1(strM63880k42, c14365qy2.m69838jd().m69409to()).CloneTo(c12015qqClone2);
                        i5 = i13;
                        C0840c3.m4444k4(new C12007ix(new C12025x6(((f / 2.0f) + ((i13 * f) + i)) - (c12015qqClone2.m56699x1() / 2.0f), f10 - (c12015qqClone2.m56697kk() / 2.0f)).Clone(), c12015qqClone2.Clone()), strM63880k42, 0, c12013m9, c14365qy2.m69838jd().m69399du().Clone(), 1, 2, c14365qy2);
                    }
                    i13 = i5 + 1;
                    c14365qy2 = c14365qy;
                }
                i12++;
                c14365qy2 = c14365qy;
                c12013m9M69407kk = c12013m9;
                list = list2;
                f8 = f9;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m71377k4(List<C1210hn> list, float f, float f2, float f3, boolean z, double d, C14787xi c14787xi, C14365qy c14365qy) {
        for (int i = 0; i < list.size(); i++) {
            float fM4458k4 = (float) (((double) C0841c4.m4458k4(list.get_Item(i))) * d);
            f = !c14787xi.m73384dy().isPlotOrderReversed() ? f + fM4458k4 : f - fM4458k4;
            im9.m7709k4(new C12025x6(f, f2), new C12025x6(f, f3), c14365qy.m69838jd().m69402k4().Clone(), (LineFormat) c14365qy.m69834fa().getChartDataTable().getFormat().getLine(), c14365qy);
        }
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C14580tx c14580tx) {
    }

    /* JADX INFO: renamed from: k4 */
    private static void m71378k4(List<C1210hn>[] listArr, float f, float f2, float f3, boolean z, double d, int i, float f4, C12014ne c12014ne, boolean z2, C14787xi c14787xi, C14365qy c14365qy) {
        C14328q5 c14328q5;
        float f5;
        int i2;
        double d2 = d;
        IDataTable chartDataTable = c14365qy.m69834fa().getChartDataTable();
        C14328q5 c14328q5M69838jd = c14365qy.m69838jd();
        C12015qq c12015qq = new C12015qq((float) d2, c12014ne.m56683x1() / 2.0f);
        float f6 = f2;
        int i3 = 0;
        while (i3 < listArr.length) {
            List<C1210hn> list = listArr[i3];
            C12023wl c12023wlClone = m71374k4(list, 0, c14328q5M69838jd, c12015qq.Clone()).Clone();
            C12015qq c12015qq2 = c12015qq;
            int i4 = 0;
            float f7 = f;
            while (i4 < list.size()) {
                C1210hn c1210hn = list.get_Item(i4);
                String strM63880k4 = C13729ki.m63880k4(c1210hn.m7238x1(), c1210hn.m7228h4(), c1210hn.m7227du());
                float fM4458k4 = (float) (((double) C0841c4.m4458k4(c1210hn)) * d2);
                List<C1210hn> list2 = list;
                int i5 = i4;
                C0840c3.m4444k4(C12007ix.m56544k4(C12014ne.m56661x1(new C12007ix(!c14787xi.m73384dy().isPlotOrderReversed() ? (float) (((((double) fM4458k4) / 2.0d) + ((double) f7)) - (((double) c12023wlClone.m56865x1()) / 2.0d)) : (float) ((((double) f7) - (((double) fM4458k4) / 2.0d)) - (((double) c12023wlClone.m56865x1()) / 2.0d)), z ? f6 : f6 - c12023wlClone.m56862kk(), c12023wlClone.m56865x1(), c12023wlClone.m56862kk()).Clone())).Clone(), strM63880k4, 0, c14328q5M69838jd.m69407kk(), c14328q5M69838jd.m69399du().Clone(), 1, i, c14365qy);
                if (c14365qy.m69834fa().getChartDataTable().hasBorderVertical()) {
                    im9.m7709k4(new C12025x6(f7, f4), new C12025x6(f7, f6), c14365qy.m69838jd().m69402k4().Clone(), (LineFormat) chartDataTable.getFormat().getLine(), c14365qy);
                    float fM56862kk = f3 + c12023wlClone.m56862kk();
                    c14328q5 = c14328q5M69838jd;
                    f5 = f6;
                    i2 = i3;
                    m71377k4(c1210hn.m7236m9(), f7, f4, z ? fM56862kk + f6 : f6 - fM56862kk, z, d2, c14787xi, c14365qy);
                } else {
                    c14328q5 = c14328q5M69838jd;
                    f5 = f6;
                    i2 = i3;
                }
                f7 = !c14787xi.m73384dy().isPlotOrderReversed() ? f7 + fM4458k4 : f7 - fM4458k4;
                d2 = d;
                i4 = i5 + 1;
                c14328q5M69838jd = c14328q5;
                i3 = i2;
                f6 = f5;
                list = list2;
            }
            C14328q5 c14328q52 = c14328q5M69838jd;
            float f8 = f6;
            int i6 = i3;
            if (chartDataTable.hasBorderVertical()) {
                im9.m7709k4(new C12025x6(f7, f4), new C12025x6(f7, f8), c14365qy.m69838jd().m69402k4().Clone(), (LineFormat) chartDataTable.getFormat().getLine(), c14365qy);
            }
            float fM56862kk2 = f3 + c12023wlClone.m56862kk();
            f6 = z ? fM56862kk2 + f8 : f8 - fM56862kk2;
            i3 = i6 + 1;
            d2 = d;
            c14328q5M69838jd = c14328q52;
            c12015qq = c12015qq2;
        }
    }
}
