package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14077m4;
import com.aspose.slides.p559ms.System.C14084qq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.ki */
/* JADX INFO: loaded from: classes3.dex */
class C13729ki extends AbstractC7020m9<C13729ki> {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: k4 */
    public static int m63875k4(int i) {
        if (i != 0 && i != 3 && i != 38 && i != 41 && i != 44 && i != 79 && i != 6 && i != 7 && i != 10 && i != 11 && i != 14 && i != 15 && i != 33 && i != 34) {
            if (i != 68 && i != 69) {
                switch (i) {
                    case 18:
                        break;
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                        break;
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                        return 1;
                    default:
                        switch (i) {
                            case 53:
                            case 54:
                            case 55:
                            case 56:
                            case 57:
                            case 58:
                                break;
                            default:
                                return 2;
                        }
                        break;
                }
            }
            return 7;
        }
        return 6;
    }

    /* JADX INFO: renamed from: x1 */
    public static String m63886x1(DataLabel dataLabel) {
        return "".equals(dataLabel.getDataLabelFormat().getSeparator()) ? (!dataLabel.getDataLabelFormat().getShowCategoryName() || !dataLabel.getDataLabelFormat().getShowPercentage() || dataLabel.getDataLabelFormat().getShowSeriesName() || dataLabel.getDataLabelFormat().getShowValue()) ? ", " : IOUtils.LINE_SEPARATOR_UNIX : dataLabel.getDataLabelFormat().getSeparator();
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
        if (obj instanceof C13729ki) {
            return m63887x1((C13729ki) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12003du m63876k4(Object obj, String str, C12003du c12003du) {
        if (!C14113y2.m67411k4(str) && ((C7019kk.m27469x1(obj, Double.class) || C7019kk.m27469x1(obj, Integer.class)) && C14113y2.m67364dy(C14113y2.m67368h4(str), "[red]") > 0)) {
            if ((C7019kk.m27469x1(obj, Double.class) ? ((Double) obj).doubleValue() : ((Integer) obj).intValue()) < 0.0d) {
                return C12003du.m56486y6();
            }
        }
        return c12003du;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m63887x1(C13729ki c13729ki) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0205  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C12015qq m63877k4(List<C13847mr> list, int i, int i2, int i3, C14365qy c14365qy, C14787xi c14787xi) {
        boolean z;
        List<C1210hn> listM69848kk;
        String strM63880k4;
        boolean z2;
        C14787xi c14787xiM4489x1;
        IDataLabelFormat dataLabelFormat;
        String text;
        C13847mr c13847mr = list.get_Item(i);
        C0886d8 c0886d8 = c13847mr.m64944dy().get_Item(i2);
        C0852cf c0852cfM5003ks = c0886d8.m5003ks();
        if (!c0852cfM5003ks.m4570x1().isVisible() && "".equals(c0852cfM5003ks.m4564kk().getText())) {
            return new C12015qq(0.0f, 0.0f);
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
        boolean z3 = c0852cfM5003ks.m4570x1().getDataLabelFormat().isNumberFormatLinkedToSource() || "General".equals(c0852cfM5003ks.m4570x1().getDataLabelFormat().getNumberFormat());
        String strM64957kk = c13847mr.m64957kk();
        if (ChartTypeCharacterizer.isSeriesUsesXValueCoordinate(c13847mr.m64945h4().getType())) {
            Double dValueOf = Double.valueOf(c0886d8.m5015x1());
            strM63880k4 = m63880k4((Object) dValueOf, numberFormat, false);
            if (z3) {
                strM63880k4 = m63880k4((Object) dValueOf, c0886d8.m4985h4(), false);
            }
        } else {
            if (z) {
                String strM7228h4 = i2 < listM69848kk.size() ? listM69848kk.get_Item(i2).m7228h4() : "";
                z2 = i2 < listM69848kk.size() && listM69848kk.get_Item(i2).m7227du();
                if (z3) {
                    numberFormat = strM7228h4;
                } else {
                    z2 = false;
                }
                if (numberFormat == null) {
                    numberFormat = c14787xi.m73384dy().getNumberFormat();
                }
                if (i2 < listM69848kk.size()) {
                    strM63880k4 = C14743wm.m72790k4(listM69848kk.get_Item(i2).m7238x1(), false) == -1 ? "" : m63880k4(listM69848kk.get_Item(i2).m7238x1(), numberFormat, z2);
                } else {
                    strM63880k4 = "";
                }
                c14787xiM4489x1 = C0841c4.m4489x1(c14787xi);
                double dM4989k4 = c0886d8.m4989k4();
                if (c14787xiM4489x1.m73384dy().isLogarithmic()) {
                    dM4989k4 = c14787xiM4489x1.m73424x1(dM4989k4);
                }
                if (!c14787xiM4489x1.m73384dy().isLogarithmic()) {
                    dM4989k4 *= C0841c4.m4452k4(c14787xiM4489x1);
                }
                String strM63880k42 = m63880k4(Double.valueOf(dM4989k4), numberFormat, z2);
                if (z3) {
                    strM63880k42 = m63880k4((Object) Double.valueOf(dM4989k4), c0852cfM5003ks.m4570x1().m1294dy().getLabels().getDefaultDataLabelFormat().isNumberFormatLinkedToSource() ? c0886d8.m4981du() : c0886d8.m5008to(), false);
                }
                String strM63880k43 = m63880k4(Double.valueOf(c0886d8.m4999kk()), numberFormat, z2);
                if (z3) {
                    strM63880k43 = m63880k4((Object) Double.valueOf(c0886d8.m4999kk()), c0886d8.m5004m9(), false);
                }
                String strM63879k4 = m63879k4(c0852cfM5003ks.m4570x1());
                C12013m9 c12013m9M4558du = c0852cfM5003ks.m4558du();
                int iM27462to = C7019kk.m27462to(Float.valueOf(c0852cfM5003ks.m4566m9()), 13);
                C12015qq c12015qq = new C12015qq(0.0f, 0.0f);
                dataLabelFormat = c0852cfM5003ks.m4570x1().getDataLabelFormat();
                if (dataLabelFormat.getShowLegendKey()) {
                    gfh.m6611k4(c14365qy).CloneTo(c12015qq);
                }
                if (C14113y2.m67411k4(c0852cfM5003ks.m4564kk().getText())) {
                    text = c0852cfM5003ks.m4564kk().getText();
                } else {
                    text = dataLabelFormat.getShowSeriesName() ? C14113y2.m67400k4("", strM64957kk) : "";
                    if (dataLabelFormat.getShowCategoryName()) {
                        if (!"".equals(text)) {
                            text = C14113y2.m67400k4(text, strM63879k4);
                        }
                        text = C14113y2.m67400k4(text, strM63880k4);
                    }
                    if (dataLabelFormat.getShowValue()) {
                        if (!"".equals(text)) {
                            text = C14113y2.m67400k4(text, strM63879k4);
                        }
                        text = C14113y2.m67400k4(text, strM63880k42);
                    }
                    if (dataLabelFormat.getShowBubbleSize() && ChartTypeCharacterizer.isChartTypeBubble(c13847mr.m64945h4().getType())) {
                        if (!"".equals(text)) {
                            text = C14113y2.m67400k4(text, strM63879k4);
                        }
                        text = C14113y2.m67400k4(text, strM63880k43);
                    }
                }
                C12023wl c12023wlClone = C0840c3.m4439k4(text, iM27462to, c12013m9M4558du, new C12015qq(i3, c14365qy.m69852lr() * 0.5f).Clone(), 1, 1).Clone();
                if (!"".equals(text)) {
                    return new C12015qq(0.0f, 0.0f);
                }
                if (dataLabelFormat.getShowLegendKey()) {
                    return new C12015qq(c12015qq.m56699x1() + c12023wlClone.m56865x1(), c12023wlClone.m56862kk());
                }
                return new C12015qq(c12023wlClone.m56865x1(), c12023wlClone.m56862kk());
            }
            strM63880k4 = i2 >= c14787xi.f50098m9.size() ? "" : m63880k4(c14787xi.f50098m9.get_Item(i2), numberFormat, false);
        }
        z2 = false;
        c14787xiM4489x1 = C0841c4.m4489x1(c14787xi);
        double dM4989k42 = c0886d8.m4989k4();
        if (c14787xiM4489x1.m73384dy().isLogarithmic()) {
        }
        if (!c14787xiM4489x1.m73384dy().isLogarithmic()) {
        }
        String strM63880k422 = m63880k4(Double.valueOf(dM4989k42), numberFormat, z2);
        if (z3) {
        }
        String strM63880k432 = m63880k4(Double.valueOf(c0886d8.m4999kk()), numberFormat, z2);
        if (z3) {
        }
        String strM63879k42 = m63879k4(c0852cfM5003ks.m4570x1());
        C12013m9 c12013m9M4558du2 = c0852cfM5003ks.m4558du();
        int iM27462to2 = C7019kk.m27462to(Float.valueOf(c0852cfM5003ks.m4566m9()), 13);
        C12015qq c12015qq2 = new C12015qq(0.0f, 0.0f);
        dataLabelFormat = c0852cfM5003ks.m4570x1().getDataLabelFormat();
        if (dataLabelFormat.getShowLegendKey()) {
        }
        if (C14113y2.m67411k4(c0852cfM5003ks.m4564kk().getText())) {
        }
        C12023wl c12023wlClone2 = C0840c3.m4439k4(text, iM27462to2, c12013m9M4558du2, new C12015qq(i3, c14365qy.m69852lr() * 0.5f).Clone(), 1, 1).Clone();
        if (!"".equals(text)) {
        }
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C13729ki Clone() {
        C13729ki c13729ki = new C13729ki();
        CloneTo(c13729ki);
        return c13729ki;
    }

    /* JADX INFO: renamed from: k4 */
    private static C14084qq m63878k4(double d) {
        C14084qq c14084qq = new C14084qq(1899, 12, 30, 0, 0, 1);
        if (d < 0.0d) {
            return c14084qq;
        }
        if (d > 2958465.99d) {
            return new C14084qq(9999, 12, 31, 23, 59, 59);
        }
        if (d < 60.0d) {
            d += 1.0d;
        }
        return C14084qq.m67088k4(c14084qq, C14077m4.m66799k4(d)).Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public static String m63879k4(DataLabel dataLabel) {
        return dataLabel.getDataLabelFormat().getSeparator();
    }

    /* JADX INFO: renamed from: k4 */
    public static String m63880k4(Object obj, String str, boolean z) {
        C14084qq c14084qqClone;
        if (obj == null) {
            return "";
        }
        if (str == null) {
            return obj instanceof Double ? C14044b3.m66425h4(((Double) obj).doubleValue()) : obj.toString();
        }
        try {
            if (!m63885k4(str) || (!C7019kk.m27469x1(obj, Double.class) && !C7019kk.m27469x1(obj, Integer.class))) {
                return C14337qc.m69515k4(obj, str, false);
            }
            C14084qq c14084qq = new C14084qq();
            if (C7019kk.m27469x1(obj, Double.class)) {
                m63878k4(((Double) C7019kk.m27464to(obj, Double.TYPE)).doubleValue()).CloneTo(c14084qq);
                c14084qqClone = c14084qq.Clone();
            } else {
                m63878k4(((Integer) obj).intValue()).CloneTo(c14084qq);
                c14084qqClone = c14084qq.Clone();
            }
            return C14337qc.m69515k4(c14084qqClone, str, z);
        } catch (RuntimeException e) {
            C3085sv.m13082k4(e);
            return obj instanceof Double ? C14044b3.m66425h4(((Double) obj).doubleValue()) : obj.toString();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63881k4(float f, float f2, C0852cf c0852cf, C12015qq c12015qq, C14365qy c14365qy) {
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

    /* JADX WARN: Removed duplicated region for block: B:101:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0259  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m63882k4(List<C13847mr> list, int i, int i2, C12007ix c12007ix, C14365qy c14365qy, C14787xi c14787xi) {
        C12007ix c12007ix2;
        boolean z;
        List<C1210hn> listM69848kk;
        String strM63880k4;
        boolean zM63884k4;
        boolean z2;
        C14787xi c14787xiM4489x1;
        boolean z3;
        boolean z4;
        boolean zM63884k42;
        C12003du c12003duClone;
        IDataLabelFormat dataLabelFormat;
        C12013m9 c12013m9;
        int i3;
        int iM27462to;
        int iM27462to2;
        String text;
        C12003du c12003du;
        C13847mr c13847mr = list.get_Item(i);
        C0886d8 c0886d8 = c13847mr.m64944dy().get_Item(i2);
        C0852cf c0852cfM5003ks = c0886d8.m5003ks();
        if (c0852cfM5003ks.m4570x1().isVisible() || !"".equals(c0852cfM5003ks.m4564kk().getText())) {
            if (!C14064he.m66715kk(c0852cfM5003ks.m4570x1().getY()) || (c12007ix.m56551ck() >= 0.0f && c12007ix.m56558k4() <= c14365qy.m69823b3() + c14365qy.m69852lr())) {
                if (ChartTypeCharacterizer.is3DChart(c14365qy.m69834fa().getType())) {
                    m63881k4(c12007ix.m56557jd(), c12007ix.m56551ck(), c0852cfM5003ks, c12007ix.m56570m9().Clone(), c14365qy);
                    C12014ne c12014neClone = c0852cfM5003ks.f4320kk.f5456k4.Clone();
                    c12007ix2 = new C12007ix(c12014neClone.m56669jd(), c12014neClone.m56664ck(), c12014neClone.m56663c5(), c12014neClone.m56683x1());
                } else {
                    c12007ix2 = c12007ix;
                }
                C12007ix[] c12007ixArr = {c12007ix2};
                c14365qy.m69846k4(c12007ixArr);
                c12007ixArr[0].CloneTo(c12007ix2);
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
                boolean z5 = c0852cfM5003ks.m4570x1().getDataLabelFormat().isNumberFormatLinkedToSource() || "General".equals(c0852cfM5003ks.m4570x1().getDataLabelFormat().getNumberFormat());
                String strM64957kk = c13847mr.m64957kk();
                if (!ChartTypeCharacterizer.isSeriesUsesXValueCoordinate(c13847mr.m64945h4().getType())) {
                    if (z) {
                        String strM7228h4 = i2 < listM69848kk.size() ? listM69848kk.get_Item(i2).m7228h4() : "";
                        z2 = i2 < listM69848kk.size() && listM69848kk.get_Item(i2).m7227du();
                        if (z5) {
                            numberFormat = strM7228h4;
                        } else {
                            z2 = false;
                        }
                        if (numberFormat == null) {
                            numberFormat = c14787xi.m73384dy().getNumberFormat();
                        }
                        if (i2 < listM69848kk.size()) {
                            Object objM7238x1 = listM69848kk.get_Item(i2).m7238x1();
                            String strM63880k42 = C14743wm.m72790k4(objM7238x1, false) == -1 ? "" : m63880k4(listM69848kk.get_Item(i2).m7238x1(), numberFormat, z2);
                            boolean zM63884k43 = z5 ? m63884k4(objM7238x1, numberFormat) : false;
                            strM63880k4 = strM63880k42;
                            zM63884k4 = zM63884k43;
                        } else {
                            strM63880k4 = "";
                            zM63884k4 = false;
                        }
                    } else {
                        strM63880k4 = i2 >= c14787xi.f50098m9.size() ? "" : m63880k4(c14787xi.f50098m9.get_Item(i2), numberFormat, false);
                        if (i2 >= c14787xi.f50098m9.size() || !z5) {
                            zM63884k4 = false;
                            z2 = false;
                        } else {
                            zM63884k4 = m63884k4(c14787xi.f50098m9.get_Item(i2), numberFormat);
                        }
                    }
                    c14787xiM4489x1 = C0841c4.m4489x1(c14787xi);
                    boolean z6 = z2;
                    double dM4989k4 = c0886d8.m4989k4();
                    if (c14787xiM4489x1.m73384dy().isLogarithmic()) {
                        dM4989k4 = c14787xiM4489x1.m73424x1(dM4989k4);
                    }
                    if (!c14787xiM4489x1.m73384dy().isLogarithmic()) {
                        dM4989k4 *= C0841c4.m4452k4(c14787xiM4489x1);
                    }
                    String strM63880k43 = m63880k4(Double.valueOf(dM4989k4), numberFormat, z6);
                    if (z5) {
                        z3 = zM63884k4;
                        z4 = false;
                        zM63884k42 = false;
                    } else {
                        z3 = zM63884k4;
                        z4 = false;
                        strM63880k43 = m63880k4((Object) Double.valueOf(dM4989k4), c0852cfM5003ks.m4570x1().m1294dy().getLabels().getDefaultDataLabelFormat().isNumberFormatLinkedToSource() ? c0886d8.m4981du() : c0886d8.m5008to(), false);
                        zM63884k42 = m63884k4(Double.valueOf(dM4989k4), c0886d8.m5008to());
                    }
                    String strM63880k44 = m63880k4(Double.valueOf(c0886d8.m4999kk()), numberFormat, z6);
                    if (z5) {
                        strM63880k44 = m63880k4(strM63880k44, c0886d8.m5004m9(), z4);
                    }
                    String separator = !"".equals(c0852cfM5003ks.m4570x1().getDataLabelFormat().getSeparator()) ? ", " : c0852cfM5003ks.m4570x1().getDataLabelFormat().getSeparator();
                    C12013m9 c12013m9M4556c5 = c0852cfM5003ks.m4556c5();
                    c12003duClone = c0852cfM5003ks.m4562jd().Clone();
                    int iM27462to3 = C7019kk.m27462to(Float.valueOf(c0852cfM5003ks.m4566m9()), 13);
                    C12015qq c12015qqClone = gfh.m6611k4(c14365qy).Clone();
                    int iM27462to4 = C7019kk.m27462to(Float.valueOf(c12007ix2.m56557jd()), 13);
                    int iM27462to5 = C7019kk.m27462to(Float.valueOf(c12007ix2.m56551ck()), 13);
                    C12007ix c12007ix3 = c12007ix2;
                    int iM27462to6 = C7019kk.m27462to(Float.valueOf(c12007ix2.m56550c5()), 13);
                    int iM27462to7 = C7019kk.m27462to(Float.valueOf(c12007ix3.m56575x1()), 13);
                    dataLabelFormat = c0852cfM5003ks.m4570x1().getDataLabelFormat();
                    int i4 = !dataLabelFormat.getShowLegendKey() ? iM27462to4 - 3 : iM27462to4;
                    boolean z7 = zM63884k42;
                    int i5 = iM27462to5 - 3;
                    if (dataLabelFormat.getShowLegendKey()) {
                        c12013m9 = c12013m9M4556c5;
                        i3 = iM27462to6;
                    } else {
                        c12013m9 = c12013m9M4556c5;
                        i3 = iM27462to6 + 6;
                    }
                    c0852cfM5003ks.f4320kk.f5456k4 = new C12014ne(i4, i5, i3, iM27462to7 + 6);
                    c0852cfM5003ks.f4320kk.m7072k4();
                    if (dataLabelFormat.getShowLegendKey()) {
                        iM27462to = iM27462to4;
                        iM27462to2 = iM27462to6;
                    } else {
                        gfh.m6618k4(new C12007ix(c12007ix3.m56557jd(), c12007ix3.m56551ck(), c12015qqClone.m56699x1(), c12015qqClone.m56697kk()).Clone(), c13847mr, c0886d8);
                        iM27462to = C7019kk.m27462to(Float.valueOf(c12015qqClone.m56699x1()), 13) + iM27462to4;
                        iM27462to2 = iM27462to6 - C7019kk.m27462to(Float.valueOf(c12015qqClone.m56699x1()), 13);
                    }
                    if (C14113y2.m67411k4(c0852cfM5003ks.m4564kk().getText())) {
                        text = c0852cfM5003ks.m4564kk().getText();
                    } else {
                        text = dataLabelFormat.getShowSeriesName() ? C14113y2.m67400k4("", strM64957kk) : "";
                        if (dataLabelFormat.getShowCategoryName()) {
                            if (!"".equals(text)) {
                                text = C14113y2.m67400k4(text, separator);
                            }
                            text = C14113y2.m67400k4(text, strM63880k4);
                        }
                        if (dataLabelFormat.getShowValue()) {
                            if (!"".equals(text)) {
                                text = C14113y2.m67400k4(text, separator);
                            }
                            text = C14113y2.m67400k4(text, strM63880k43);
                        }
                        if (dataLabelFormat.getShowBubbleSize() && ChartTypeCharacterizer.isChartTypeBubble(c13847mr.m64945h4().getType())) {
                            if (!"".equals(text)) {
                                text = C14113y2.m67400k4(text, separator);
                            }
                            text = C14113y2.m67400k4(text, strM63880k44);
                        }
                    }
                    String str = text;
                    C12014ne c12014ne = new C12014ne(iM27462to, iM27462to5, iM27462to2, iM27462to7);
                    if (!z3 || z7) {
                        c12003du = c12003duClone;
                        C12003du.m56486y6().CloneTo(c12003du);
                    } else {
                        c12003du = c12003duClone;
                    }
                    C0840c3.m4444k4(C12007ix.m56544k4(c12014ne).Clone(), str, iM27462to3, c12013m9, c12003du.Clone(), 1, 2, c14365qy);
                }
                Double dValueOf = Double.valueOf(c0886d8.m5015x1());
                strM63880k4 = m63880k4((Object) dValueOf, numberFormat, false);
                if (z5) {
                    strM63880k4 = m63880k4((Object) dValueOf, c0886d8.m4985h4(), false);
                    zM63884k4 = m63884k4(dValueOf, c0886d8.m4985h4());
                } else {
                    zM63884k4 = false;
                }
                z2 = false;
                c14787xiM4489x1 = C0841c4.m4489x1(c14787xi);
                boolean z62 = z2;
                double dM4989k42 = c0886d8.m4989k4();
                if (c14787xiM4489x1.m73384dy().isLogarithmic()) {
                }
                if (!c14787xiM4489x1.m73384dy().isLogarithmic()) {
                }
                String strM63880k432 = m63880k4(Double.valueOf(dM4989k42), numberFormat, z62);
                if (z5) {
                }
                String strM63880k442 = m63880k4(Double.valueOf(c0886d8.m4999kk()), numberFormat, z62);
                if (z5) {
                }
                if (!"".equals(c0852cfM5003ks.m4570x1().getDataLabelFormat().getSeparator())) {
                }
                C12013m9 c12013m9M4556c52 = c0852cfM5003ks.m4556c5();
                c12003duClone = c0852cfM5003ks.m4562jd().Clone();
                int iM27462to32 = C7019kk.m27462to(Float.valueOf(c0852cfM5003ks.m4566m9()), 13);
                C12015qq c12015qqClone2 = gfh.m6611k4(c14365qy).Clone();
                int iM27462to42 = C7019kk.m27462to(Float.valueOf(c12007ix2.m56557jd()), 13);
                int iM27462to52 = C7019kk.m27462to(Float.valueOf(c12007ix2.m56551ck()), 13);
                C12007ix c12007ix32 = c12007ix2;
                int iM27462to62 = C7019kk.m27462to(Float.valueOf(c12007ix2.m56550c5()), 13);
                int iM27462to72 = C7019kk.m27462to(Float.valueOf(c12007ix32.m56575x1()), 13);
                dataLabelFormat = c0852cfM5003ks.m4570x1().getDataLabelFormat();
                if (!dataLabelFormat.getShowLegendKey()) {
                }
                boolean z72 = zM63884k42;
                int i52 = iM27462to52 - 3;
                if (dataLabelFormat.getShowLegendKey()) {
                }
                c0852cfM5003ks.f4320kk.f5456k4 = new C12014ne(i4, i52, i3, iM27462to72 + 6);
                c0852cfM5003ks.f4320kk.m7072k4();
                if (dataLabelFormat.getShowLegendKey()) {
                }
                if (C14113y2.m67411k4(c0852cfM5003ks.m4564kk().getText())) {
                }
                String str2 = text;
                C12014ne c12014ne2 = new C12014ne(iM27462to, iM27462to52, iM27462to2, iM27462to72);
                if (z3) {
                    c12003du = c12003duClone;
                    C12003du.m56486y6().CloneTo(c12003du);
                }
                C0840c3.m4444k4(C12007ix.m56544k4(c12014ne2).Clone(), str2, iM27462to32, c12013m9, c12003du.Clone(), 1, 2, c14365qy);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63883k4(List<C13847mr> list, int i, int i2, C12014ne c12014ne, C14365qy c14365qy, C14787xi c14787xi) {
        m63882k4(list, i, i2, new C12007ix(c12014ne.m56669jd(), c12014ne.m56664ck(), c12014ne.m56663c5(), c12014ne.m56683x1()).Clone(), c14365qy, c14787xi);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C13729ki c13729ki) {
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m63884k4(Object obj, String str) {
        if (C14113y2.m67411k4(str)) {
            return false;
        }
        if ((C7019kk.m27469x1(obj, Double.class) || C7019kk.m27469x1(obj, Integer.class)) && C14113y2.m67364dy(C14113y2.m67368h4(str), "[red]") > 0) {
            if ((C7019kk.m27469x1(obj, Double.class) ? ((Double) obj).doubleValue() : ((Integer) obj).intValue()) < 0.0d) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m63885k4(String str) {
        String[] strArr = {"MMM", "DD", "YYYY", "YY", "M/", "/M", "/D", "D/", "/Y", "Y/", "-M", "M-", "-D", "D-", "-Y", "Y-", "MM/DD", "DD/MM", "M/D", "D/M", "MM-DD", "DD-MM", "M-D", "D-M", "H:MM", "MM:SS", "Дк", "ФВ", "ИХ", "К±", "·Ц", "Гл", "MM"};
        for (int i = 0; i < 33; i++) {
            if (C14113y2.m67364dy(str, strArr[i]) != -1 || C14113y2.m67364dy(C14113y2.m67358c5(str), strArr[i]) != -1) {
                return true;
            }
        }
        return false;
    }
}
