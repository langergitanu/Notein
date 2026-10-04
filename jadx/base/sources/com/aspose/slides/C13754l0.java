package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.l0 */
/* JADX INFO: loaded from: classes3.dex */
class C13754l0 {
    /* JADX INFO: renamed from: k4 */
    public static C12025x6 m64235k4(float f, float f2, float f3, float f4, boolean z) {
        return new C12025x6(f + (f2 / 2.0f), f3 + (z ? f4 - 4.0f : f4 + 4.0f));
    }

    /* JADX INFO: renamed from: k4 */
    private static void m64236k4(float f, float f2, C0852cf c0852cf, C12015qq c12015qq, C14365qy c14365qy) {
        if (c0852cf.m4560fa()) {
            c0852cf.f4320kk.f5456k4 = new C12014ne(kc0.m63759kk(f), kc0.m63759kk(f2), kc0.m63753k4(c12015qq.m56699x1()), kc0.m63753k4(c12015qq.m56697kk()));
            float fM56669jd = c0852cf.f4320kk.f5456k4.m56669jd() + c0852cf.f4320kk.f5456k4.m56663c5();
            float width = c14365qy.m69834fa().getWidth() + c14365qy.m69834fa().getX();
            if (fM56669jd > width) {
                c0852cf.f4320kk.f5456k4.m56684x1(C7019kk.m27462to(Float.valueOf(r7.m56663c5() - (fM56669jd - width)), 13));
                return;
            }
            return;
        }
        if (f < 0.0f) {
            f = c14365qy.m69878yd();
        }
        if (f2 < 0.0f) {
            f2 = c14365qy.m69823b3();
        }
        if (c12015qq.m56699x1() + f > c14365qy.m69878yd() + c14365qy.m69867v4()) {
            f = (c14365qy.m69867v4() - c12015qq.m56699x1()) + c14365qy.m69878yd();
        }
        if (c12015qq.m56697kk() + f2 > c14365qy.m69823b3() + c14365qy.m69852lr()) {
            f2 = (c14365qy.m69852lr() - c12015qq.m56697kk()) + c14365qy.m69823b3();
        }
        float x = c0852cf.m4570x1().getX();
        float y = c0852cf.m4570x1().getY();
        if (ChartTypeCharacterizer.isChartTypeBar(c0852cf.m4563k4().m69834fa().getType())) {
            if (c0852cf.m4563k4().m69854ne().m73384dy() != null && c0852cf.m4563k4().m69854ne().m73384dy().isPlotOrderReversed()) {
                y *= -1.0f;
            }
            if (c0852cf.m4563k4().m69863u4().m73384dy() != null && c0852cf.m4563k4().m69863u4().m73384dy().isPlotOrderReversed()) {
                x *= -1.0f;
            }
        }
        if (ChartTypeCharacterizer.isChartTypeColumn(c0852cf.m4563k4().m69834fa().getType())) {
            if (c0852cf.m4563k4().m69854ne().m73384dy() != null && c0852cf.m4563k4().m69854ne().m73384dy().isPlotOrderReversed()) {
                x *= -1.0f;
            }
            if (c0852cf.m4563k4().m69863u4().m73384dy() != null && c0852cf.m4563k4().m69863u4().m73384dy().isPlotOrderReversed()) {
                y *= -1.0f;
            }
        }
        c0852cf.f4320kk.f5456k4 = new C12014ne(C22221Oooo0O0.OooO0O0(c14365qy.m69867v4(), x, kc0.m63759kk(f), 13), C7019kk.m27462to(Float.valueOf(c14365qy.m69852lr() * y), 13) + kc0.m63759kk(f2), kc0.m63753k4(c12015qq.m56699x1()), kc0.m63753k4(c12015qq.m56697kk()));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x024d  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m64237k4(List<C13847mr> list, int i, int i2, C12007ix c12007ix, C14365qy c14365qy, C14787xi c14787xi, float f) {
        C12007ix c12007ix2;
        boolean z;
        List<C1210hn> listM69848kk;
        String strM63880k4;
        boolean zM63884k4;
        boolean z2;
        C14787xi c14787xiM4489x1;
        boolean zM63884k42;
        C12003du c12003duClone;
        boolean z3;
        IDataLabelFormat dataLabelFormat;
        C12015qq c12015qq;
        int i3;
        int iM27462to;
        int iM27462to2;
        C12003du c12003du;
        C13847mr c13847mr = list.get_Item(i);
        C0886d8 c0886d8 = c13847mr.m64944dy().get_Item(i2);
        C0852cf c0852cfM5003ks = c0886d8.m5003ks();
        if (c0852cfM5003ks.m4570x1().isVisible() || !C14113y2.m67411k4(c0852cfM5003ks.m4564kk().getText())) {
            if (!C14064he.m66715kk(c0852cfM5003ks.m4570x1().getY()) || (c12007ix.m56551ck() >= 0.0f && c12007ix.m56558k4() <= c14365qy.m69823b3() + c14365qy.m69852lr())) {
                if (ChartTypeCharacterizer.is3DChart(c14365qy.m69834fa().getType())) {
                    m64236k4(c12007ix.m56557jd(), c12007ix.m56551ck(), c0852cfM5003ks, c12007ix.m56570m9().Clone(), c14365qy);
                    C12014ne c12014neClone = c0852cfM5003ks.f4320kk.f5456k4.Clone();
                    c12007ix2 = new C12007ix(c12014neClone.m56669jd(), c12014neClone.m56664ck(), c12014neClone.m56663c5(), c12014neClone.m56683x1());
                } else {
                    c12007ix2 = c12007ix;
                }
                if (c14787xi.m73419up() == 0) {
                    IChartCategoryCollection categories = c14365qy.m69834fa().getChartData().getCategories();
                    z = categories != null && categories.size() > 0;
                    listM69848kk = c14365qy.m69871x1();
                } else {
                    IChartCategoryCollection secondaryCategories = c14365qy.m69834fa().getChartData().getSecondaryCategories();
                    z = secondaryCategories != null && secondaryCategories.size() > 0;
                    listM69848kk = c14365qy.m69848kk();
                }
                String numberFormat = c0852cfM5003ks.m4570x1().getDataLabelFormat().getNumberFormat();
                boolean z4 = c0852cfM5003ks.m4570x1().getDataLabelFormat().isNumberFormatLinkedToSource() || "General".equals(c0852cfM5003ks.m4570x1().getDataLabelFormat().getNumberFormat());
                String strM64957kk = c13847mr.m64957kk();
                if (!ChartTypeCharacterizer.isSeriesUsesXValueCoordinate(c13847mr.m64945h4().getType())) {
                    if (z) {
                        String strM7228h4 = i2 < listM69848kk.size() ? listM69848kk.get_Item(i2).m7228h4() : "";
                        z2 = i2 < listM69848kk.size() && listM69848kk.get_Item(i2).m7227du();
                        if (z4) {
                            numberFormat = strM7228h4;
                        } else {
                            z2 = false;
                        }
                        if (numberFormat == null) {
                            numberFormat = c14787xi.m73384dy().getNumberFormat();
                        }
                        if (i2 < listM69848kk.size()) {
                            Object objM7238x1 = listM69848kk.get_Item(i2).m7238x1();
                            String strM63880k42 = C14743wm.m72790k4(objM7238x1, false) == -1 ? C14113y2.f47374k4 : C13729ki.m63880k4(listM69848kk.get_Item(i2).m7238x1(), numberFormat, z2);
                            boolean zM63884k43 = z4 ? C13729ki.m63884k4(objM7238x1, numberFormat) : false;
                            strM63880k4 = strM63880k42;
                            zM63884k4 = zM63884k43;
                        } else {
                            strM63880k4 = C14113y2.f47374k4;
                            zM63884k4 = false;
                        }
                    } else {
                        strM63880k4 = i2 >= c14787xi.f50098m9.size() ? C14113y2.f47374k4 : C13729ki.m63880k4(c14787xi.f50098m9.get_Item(i2), numberFormat, false);
                        if (i2 >= c14787xi.f50098m9.size() || !z4) {
                            zM63884k4 = false;
                            z2 = false;
                        } else {
                            zM63884k4 = C13729ki.m63884k4(c14787xi.f50098m9.get_Item(i2), numberFormat);
                        }
                    }
                    c14787xiM4489x1 = C0841c4.m4489x1(c14787xi);
                    double dM4989k4 = c0886d8.m4989k4();
                    if (c14787xiM4489x1.m73384dy().isLogarithmic()) {
                        dM4989k4 = c14787xiM4489x1.m73424x1(dM4989k4);
                    }
                    if (!c14787xiM4489x1.m73384dy().isLogarithmic()) {
                        dM4989k4 *= C0841c4.m4452k4(c14787xiM4489x1);
                    }
                    String strM63880k43 = C13729ki.m63880k4(Double.valueOf(dM4989k4), numberFormat, z2);
                    if (z4) {
                        zM63884k42 = false;
                    } else {
                        strM63880k43 = C13729ki.m63880k4((Object) Double.valueOf(dM4989k4), c0852cfM5003ks.m4570x1().m1294dy().getLabels().getDefaultDataLabelFormat().isNumberFormatLinkedToSource() ? c0886d8.m4981du() : c0886d8.m5008to(), false);
                        zM63884k42 = C13729ki.m63884k4(Double.valueOf(dM4989k4), c0886d8.m5008to());
                    }
                    String strM63880k44 = C13729ki.m63880k4(Double.valueOf(c0886d8.m4999kk()), numberFormat, z2);
                    if (z4) {
                        strM63880k44 = C13729ki.m63880k4((Object) strM63880k44, c0886d8.m5004m9(), false);
                    }
                    String separator = C14113y2.m67411k4(c0852cfM5003ks.m4570x1().getDataLabelFormat().getSeparator()) ? c0852cfM5003ks.m4570x1().getDataLabelFormat().getSeparator() : ",";
                    C12013m9 c12013m9M4556c5 = c0852cfM5003ks.m4556c5();
                    c12003duClone = c0852cfM5003ks.m4562jd().Clone();
                    int iM27462to3 = C7019kk.m27462to(Float.valueOf(c0852cfM5003ks.m4566m9()), 13);
                    C12015qq c12015qqClone = gfh.m6611k4(c14365qy).Clone();
                    z3 = zM63884k4;
                    int iM27462to4 = C7019kk.m27462to(Float.valueOf(c12007ix2.m56557jd()), 13);
                    int iM27462to5 = C7019kk.m27462to(Float.valueOf(c12007ix2.m56551ck()), 13);
                    C12007ix c12007ix3 = c12007ix2;
                    int iM27462to6 = C7019kk.m27462to(Float.valueOf(c12007ix2.m56550c5()), 13);
                    int iM27462to7 = C7019kk.m27462to(Float.valueOf(c12007ix3.m56575x1()), 13);
                    dataLabelFormat = c0852cfM5003ks.m4570x1().getDataLabelFormat();
                    int i4 = !dataLabelFormat.getShowLegendKey() ? iM27462to4 - 3 : iM27462to4;
                    boolean z5 = zM63884k42;
                    int i5 = iM27462to5 - 3;
                    if (dataLabelFormat.getShowLegendKey()) {
                        c12015qq = c12015qqClone;
                        i3 = iM27462to6;
                    } else {
                        c12015qq = c12015qqClone;
                        i3 = iM27462to6 + 6;
                    }
                    c0852cfM5003ks.f4320kk.f5456k4 = new C12014ne(i4, i5, i3, iM27462to7 + 6);
                    c0852cfM5003ks.f4320kk.m7072k4();
                    if (dataLabelFormat.getShowLegendKey()) {
                        iM27462to = iM27462to4;
                        iM27462to2 = iM27462to6;
                    } else {
                        gfh.m6618k4(new C12007ix(c12007ix3.m56557jd(), c12007ix3.m56551ck(), c12015qq.m56699x1(), c12015qq.m56697kk()).Clone(), c13847mr, c0886d8);
                        iM27462to = C7019kk.m27462to(Float.valueOf(c12015qq.m56699x1()), 13) + iM27462to4;
                        iM27462to2 = iM27462to6 - C7019kk.m27462to(Float.valueOf(c12015qq.m56699x1()), 13);
                    }
                    String text = C14113y2.f47374k4;
                    if (C14113y2.m67411k4(c0852cfM5003ks.m4564kk().getText())) {
                        text = c0852cfM5003ks.m4564kk().getText();
                    } else {
                        if (dataLabelFormat.getShowSeriesName()) {
                            text = C14113y2.m67400k4(text, strM64957kk);
                        }
                        if (dataLabelFormat.getShowCategoryName()) {
                            if (!C14113y2.m67411k4(text)) {
                                text = C14113y2.m67400k4(text, separator);
                            }
                            text = C14113y2.m67400k4(text, strM63880k4);
                        }
                        if (dataLabelFormat.getShowValue()) {
                            if (!C14113y2.m67411k4(text)) {
                                text = C14113y2.m67400k4(text, separator);
                            }
                            text = C14113y2.m67400k4(text, strM63880k43);
                        }
                        if (dataLabelFormat.getShowBubbleSize() && ChartTypeCharacterizer.isChartTypeBubble(c13847mr.m64945h4().getType())) {
                            if (!C14113y2.m67411k4(text)) {
                                text = C14113y2.m67400k4(text, separator);
                            }
                            text = C14113y2.m67400k4(text, strM63880k44);
                        }
                    }
                    String str = text;
                    C12014ne c12014ne = new C12014ne(iM27462to, iM27462to5, iM27462to2, iM27462to7);
                    if (!z3 || z5) {
                        c12003du = c12003duClone;
                        C12003du.m56486y6().CloneTo(c12003du);
                    } else {
                        c12003du = c12003duClone;
                    }
                    C1236i2.m7386k4(new C0934eb(str, C12007ix.m56544k4(c12014ne).Clone(), 2, 1, c12013m9M4556c5, c12003du.Clone()), new C0763au(c0852cfM5003ks.m4572yj(), c0852cfM5003ks.m4565ks(), iM27462to3), c14365qy, f);
                }
                Double dValueOf = Double.valueOf(c0886d8.m5015x1());
                strM63880k4 = C13729ki.m63880k4((Object) dValueOf, numberFormat, false);
                if (z4) {
                    strM63880k4 = C13729ki.m63880k4((Object) dValueOf, c0886d8.m4985h4(), false);
                    zM63884k4 = C13729ki.m63884k4(dValueOf, c0886d8.m4985h4());
                } else {
                    zM63884k4 = false;
                }
                z2 = false;
                c14787xiM4489x1 = C0841c4.m4489x1(c14787xi);
                double dM4989k42 = c0886d8.m4989k4();
                if (c14787xiM4489x1.m73384dy().isLogarithmic()) {
                }
                if (!c14787xiM4489x1.m73384dy().isLogarithmic()) {
                }
                String strM63880k432 = C13729ki.m63880k4(Double.valueOf(dM4989k42), numberFormat, z2);
                if (z4) {
                }
                String strM63880k442 = C13729ki.m63880k4(Double.valueOf(c0886d8.m4999kk()), numberFormat, z2);
                if (z4) {
                }
                if (C14113y2.m67411k4(c0852cfM5003ks.m4570x1().getDataLabelFormat().getSeparator())) {
                }
                C12013m9 c12013m9M4556c52 = c0852cfM5003ks.m4556c5();
                c12003duClone = c0852cfM5003ks.m4562jd().Clone();
                int iM27462to32 = C7019kk.m27462to(Float.valueOf(c0852cfM5003ks.m4566m9()), 13);
                C12015qq c12015qqClone2 = gfh.m6611k4(c14365qy).Clone();
                z3 = zM63884k4;
                int iM27462to42 = C7019kk.m27462to(Float.valueOf(c12007ix2.m56557jd()), 13);
                int iM27462to52 = C7019kk.m27462to(Float.valueOf(c12007ix2.m56551ck()), 13);
                C12007ix c12007ix32 = c12007ix2;
                int iM27462to62 = C7019kk.m27462to(Float.valueOf(c12007ix2.m56550c5()), 13);
                int iM27462to72 = C7019kk.m27462to(Float.valueOf(c12007ix32.m56575x1()), 13);
                dataLabelFormat = c0852cfM5003ks.m4570x1().getDataLabelFormat();
                if (!dataLabelFormat.getShowLegendKey()) {
                }
                boolean z52 = zM63884k42;
                int i52 = iM27462to52 - 3;
                if (dataLabelFormat.getShowLegendKey()) {
                }
                c0852cfM5003ks.f4320kk.f5456k4 = new C12014ne(i4, i52, i3, iM27462to72 + 6);
                c0852cfM5003ks.f4320kk.m7072k4();
                if (dataLabelFormat.getShowLegendKey()) {
                }
                String text2 = C14113y2.f47374k4;
                if (C14113y2.m67411k4(c0852cfM5003ks.m4564kk().getText())) {
                }
                String str2 = text2;
                C12014ne c12014ne2 = new C12014ne(iM27462to, iM27462to52, iM27462to2, iM27462to72);
                if (z3) {
                    c12003du = c12003duClone;
                    C12003du.m56486y6().CloneTo(c12003du);
                }
                C1236i2.m7386k4(new C0934eb(str2, C12007ix.m56544k4(c12014ne2).Clone(), 2, 1, c12013m9M4556c52, c12003du.Clone()), new C0763au(c0852cfM5003ks.m4572yj(), c0852cfM5003ks.m4565ks(), iM27462to32), c14365qy, f);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m64238k4(List<C13847mr> list, int i, int i2, C12014ne c12014ne, C14365qy c14365qy, C14787xi c14787xi, float f) {
        m64237k4(list, i, i2, new C12007ix(c12014ne.m56669jd(), c12014ne.m56664ck(), c12014ne.m56663c5(), c12014ne.m56683x1()).Clone(), c14365qy, c14787xi, f);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m64239k4(List<C14319px> list, C14365qy c14365qy) {
        List<C13847mr> listM69865up = c14365qy.m69865up();
        int i = 0;
        while (i < list.size()) {
            C14319px c14319px = list.get_Item(i);
            int iM69322k4 = c14319px.m69322k4();
            int iM69325x1 = c14319px.m69325x1();
            C12025x6 c12025x6Clone = c14319px.m69323kk().Clone();
            boolean zM69320du = c14319px.m69320du();
            boolean zM69324to = c14319px.m69324to();
            C0852cf c0852cfM5003ks = c14365qy.m69865up().get_Item(iM69322k4).m64944dy().get_Item(iM69325x1).m5003ks();
            C14365qy c14365qy2 = c14365qy;
            C12015qq c12015qqClone = C13729ki.m63877k4(listM69865up, iM69322k4, iM69325x1, C7019kk.m27462to(Float.valueOf(c14365qy.m69833e0().m64121to()), 13), c14365qy2, c14365qy.m69854ne()).Clone();
            float fM56897x1 = c12025x6Clone.m56897x1() - (c12015qqClone.m56699x1() / 2.0f);
            float fM56895kk = c12025x6Clone.m56895kk() - (c12015qqClone.m56697kk() / 2.0f);
            if (zM69320du) {
                fM56895kk = c12025x6Clone.m56895kk();
                if (zM69324to) {
                    fM56895kk -= c12015qqClone.m56697kk();
                }
            }
            C13729ki.m63881k4(fM56897x1, fM56895kk, c0852cfM5003ks, c12015qqClone.Clone(), c14365qy2);
            m64238k4(listM69865up, iM69322k4, iM69325x1, c0852cfM5003ks.f4320kk.f5456k4.Clone(), c14365qy2, c14365qy2.m69854ne(), c14319px.m69321h4());
            i++;
            c14365qy = c14365qy2;
        }
    }
}
