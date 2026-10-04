package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class hgt extends AbstractC7020m9<hgt> {
    /* JADX INFO: renamed from: x1 */
    private boolean m7144x1(hgt hgtVar) {
        return true;
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
        if (obj instanceof hgt) {
            return m7144x1((hgt) obj);
        }
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public hgt Clone() {
        hgt hgtVar = new hgt();
        CloneTo(hgtVar);
        return hgtVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ef  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C12015qq m7142k4(List<C13847mr> list, int i, int i2, double d, float f, float f2, double d2, C14365qy c14365qy) {
        List<C1210hn> listM69848kk;
        C14787xi c14787xiM69837ix;
        Double dValueOf;
        String text;
        C13847mr c13847mr = list.get_Item(i);
        C0886d8 c0886d8M64942ck = c13847mr.m64944dy().get_Item(i2);
        if (c0886d8M64942ck == null) {
            c0886d8M64942ck = c13847mr.m64942ck();
        }
        if (c13847mr.m64945h4().getPlotOnSecondAxis()) {
            listM69848kk = c14365qy.m69848kk();
            c14787xiM69837ix = c14365qy.m69837ix();
        } else {
            listM69848kk = c14365qy.m69871x1();
            c14787xiM69837ix = c14365qy.m69854ne();
        }
        DataLabel dataLabelM4570x1 = c0886d8M64942ck.m5003ks().m4570x1();
        String strM64957kk = c13847mr.m64957kk();
        boolean zIsNumberFormatLinkedToSource = dataLabelM4570x1.getDataLabelFormat().isNumberFormatLinkedToSource();
        if (dataLabelM4570x1.getDataLabelFormat().getShowPercentage()) {
            zIsNumberFormatLinkedToSource = true;
        }
        String numberFormat = dataLabelM4570x1.getDataLabelFormat().getShowPercentage() ? "" : dataLabelM4570x1.getDataLabelFormat().getNumberFormat();
        String strM63880k4 = "Other";
        if (zIsNumberFormatLinkedToSource) {
            String strM7228h4 = (i2 < 0 || i2 >= listM69848kk.size()) ? "" : listM69848kk.get_Item(i2).m7228h4();
            boolean z = i2 >= 0 && i2 < listM69848kk.size() && listM69848kk.get_Item(i2).m7227du();
            if (i2 >= 0 && i2 < c14787xiM69837ix.f50098m9.size()) {
                strM63880k4 = C13729ki.m63880k4(c14787xiM69837ix.f50098m9.get_Item(i2), strM7228h4, z);
            }
        } else if (i2 != -1) {
            strM63880k4 = C13729ki.m63880k4(c14787xiM69837ix.f50098m9.get_Item(i2), numberFormat, dataLabelM4570x1.getDataLabelFormat().getShowCategoryName());
        }
        boolean zIsNumberFormatLinkedToSource2 = dataLabelM4570x1.getDataLabelFormat().getShowPercentage() ? true : dataLabelM4570x1.getDataLabelFormat().isNumberFormatLinkedToSource();
        String numberFormat2 = dataLabelM4570x1.getDataLabelFormat().getShowPercentage() ? "" : dataLabelM4570x1.getDataLabelFormat().getNumberFormat();
        if (zIsNumberFormatLinkedToSource2) {
            if (i2 == -1) {
                dValueOf = Double.valueOf(d2);
            } else {
                dValueOf = Double.valueOf(c0886d8M64942ck.m4989k4());
                numberFormat2 = c0886d8M64942ck.m5008to();
            }
        } else if (i2 != -1) {
            dValueOf = Double.valueOf(c0886d8M64942ck.m4989k4());
        }
        String strM63880k42 = C13729ki.m63880k4((Object) dValueOf, numberFormat2, false);
        String numberFormat3 = "0%";
        if (!dataLabelM4570x1.getDataLabelFormat().isNumberFormatLinkedToSource() && !"".equals(dataLabelM4570x1.getDataLabelFormat().getNumberFormat()) && !"General".equals(dataLabelM4570x1.getDataLabelFormat().getNumberFormat())) {
            numberFormat3 = dataLabelM4570x1.getDataLabelFormat().getNumberFormat();
        }
        String strM63880k43 = C13729ki.m63880k4((Object) Double.valueOf(d), numberFormat3, false);
        String strM63886x1 = C13729ki.m63886x1(dataLabelM4570x1);
        C7019kk.m27462to(Float.valueOf(c0886d8M64942ck.m5003ks().m4566m9()), 13);
        C12015qq c12015qqClone = gfh.m6625kk(c13847mr, c14365qy).Clone();
        if (C14113y2.m67411k4(c0886d8M64942ck.m5003ks().m4564kk().getText())) {
            text = dataLabelM4570x1.getDataLabelFormat().getShowSeriesName() ? C14113y2.m67400k4("", strM64957kk) : "";
            if (dataLabelM4570x1.getDataLabelFormat().getShowCategoryName()) {
                if (!"".equals(text)) {
                    text = C14113y2.m67400k4(text, strM63886x1);
                }
                text = C14113y2.m67400k4(text, strM63880k4);
            }
            if (dataLabelM4570x1.getDataLabelFormat().getShowValue()) {
                if (!"".equals(text)) {
                    text = C14113y2.m67400k4(text, strM63886x1);
                }
                text = C14113y2.m67400k4(text, strM63880k42);
            }
            if (dataLabelM4570x1.getDataLabelFormat().getShowPercentage()) {
                if (!"".equals(text)) {
                    text = C14113y2.m67400k4(text, strM63886x1);
                }
                text = C14113y2.m67400k4(text, strM63880k43);
            }
        } else {
            text = c0886d8M64942ck.m5003ks().m4564kk().getText();
        }
        C12023wl c12023wlClone = C0840c3.m4438k4(text, 0.0f, c0886d8M64942ck.m5003ks().m4556c5(), 1, c14365qy, new C12015qq(f, f2).Clone()).Clone();
        new C12015qq();
        if ("".equals(text)) {
            return new C12015qq(0.0f, 0.0f);
        }
        C12015qq c12015qq = dataLabelM4570x1.getDataLabelFormat().getShowLegendKey() ? new C12015qq(c12015qqClone.m56699x1() + c12023wlClone.m56865x1(), c12023wlClone.m56862kk()) : new C12015qq(c12023wlClone.m56865x1(), c12023wlClone.m56862kk());
        if (dataLabelM4570x1.getDataLabelFormat().getShowLegendKey()) {
            c12015qq.m56695k4(c12015qq.m56699x1() + 6.0f);
        }
        c12015qq.m56695k4(c12015qq.m56699x1() + 1.0f);
        c12015qq.m56700x1(c12015qq.m56697kk() + 4.0f);
        return c12015qq;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x026a  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m7143k4(int i, int i2, double d, C12007ix c12007ix, double d2, C14365qy c14365qy) {
        List<C1210hn> listM69848kk;
        C14787xi c14787xiM69837ix;
        boolean zM63884k4;
        boolean zIsNumberFormatLinkedToSource;
        boolean z;
        Double dValueOf;
        String strM63880k4;
        boolean zM63884k42;
        Double dValueOf2;
        C0886d8 c0886d8;
        int i3;
        Float fValueOf;
        String text;
        String str;
        C12003du c12003du;
        boolean z2;
        Double dValueOf3;
        C12007ix[] c12007ixArr = {c12007ix};
        c14365qy.m69846k4(c12007ixArr);
        c12007ixArr[0].CloneTo(c12007ix);
        C13847mr c13847mr = c14365qy.m69865up().get_Item(i);
        C0886d8 c0886d8M64942ck = c13847mr.m64944dy().get_Item(i2);
        if (c0886d8M64942ck == null) {
            c0886d8M64942ck = c13847mr.m64942ck();
        }
        if (c13847mr.m64945h4().getPlotOnSecondAxis()) {
            listM69848kk = c14365qy.m69848kk();
            c14787xiM69837ix = c14365qy.m69837ix();
        } else {
            listM69848kk = c14365qy.m69871x1();
            c14787xiM69837ix = c14365qy.m69854ne();
        }
        DataLabel dataLabelM4570x1 = c0886d8M64942ck.m5003ks().m4570x1();
        IDataLabelFormat dataLabelFormat = dataLabelM4570x1.getDataLabelFormat();
        if (!dataLabelFormat.getShowBubbleSize() && !dataLabelFormat.getShowCategoryName() && !dataLabelFormat.getShowLegendKey() && !dataLabelFormat.getShowSeriesName() && !dataLabelFormat.getShowValue() && dataLabelFormat.getShowPercentage() && d == 0.0d) {
            return;
        }
        String strM64957kk = c13847mr.m64957kk();
        boolean zIsNumberFormatLinkedToSource2 = dataLabelFormat.isNumberFormatLinkedToSource();
        if (dataLabelFormat.getShowPercentage()) {
            zIsNumberFormatLinkedToSource2 = true;
        }
        String numberFormat = dataLabelFormat.getShowPercentage() ? "" : dataLabelFormat.getNumberFormat();
        String strM63880k42 = "Other";
        if (zIsNumberFormatLinkedToSource2) {
            String strM7228h4 = (i2 < 0 || i2 >= listM69848kk.size()) ? "" : listM69848kk.get_Item(i2).m7228h4();
            boolean z3 = i2 >= 0 && i2 < listM69848kk.size() && listM69848kk.get_Item(i2).m7227du();
            if (i2 >= 0 && i2 < c14787xiM69837ix.f50098m9.size()) {
                strM63880k42 = C13729ki.m63880k4(c14787xiM69837ix.f50098m9.get_Item(i2), strM7228h4, z3);
            }
            if (i2 >= 0 && i2 < c14787xiM69837ix.f50098m9.size()) {
                zM63884k4 = C13729ki.m63884k4(c14787xiM69837ix.f50098m9.get_Item(i2), strM7228h4);
            }
            String str2 = strM63880k42;
            zIsNumberFormatLinkedToSource = dataLabelFormat.isNumberFormatLinkedToSource();
            if (dataLabelFormat.getShowPercentage()) {
                zIsNumberFormatLinkedToSource = true;
            }
            String numberFormat2 = !dataLabelFormat.getShowPercentage() ? "" : dataLabelFormat.getNumberFormat();
            if (!zIsNumberFormatLinkedToSource) {
                if (i2 == -1) {
                    dValueOf3 = Double.valueOf(d2);
                    z2 = false;
                } else {
                    z2 = false;
                    dValueOf3 = Double.valueOf(c0886d8M64942ck.m4989k4());
                    numberFormat2 = c0886d8M64942ck.m5008to();
                }
                String strM63880k43 = C13729ki.m63880k4(dValueOf3, numberFormat2, z2);
                if (i2 != -1) {
                    zM63884k42 = C13729ki.m63884k4(Double.valueOf(c0886d8M64942ck.m4989k4()), c0886d8M64942ck.m5008to());
                    strM63880k4 = strM63880k43;
                } else {
                    strM63880k4 = strM63880k43;
                    zM63884k42 = false;
                }
            } else {
                if (i2 == -1) {
                    dValueOf = Double.valueOf(d2);
                    z = false;
                } else {
                    z = false;
                    dValueOf = Double.valueOf(c0886d8M64942ck.m4989k4());
                }
                strM63880k4 = C13729ki.m63880k4(dValueOf, numberFormat2, z);
                zM63884k42 = z;
            }
            String numberFormat3 = "0%";
            boolean z4 = zM63884k42;
            if (dataLabelFormat.isNumberFormatLinkedToSource()) {
                if (!"".equals(dataLabelFormat.getNumberFormat()) && !"General".equals(dataLabelFormat.getNumberFormat())) {
                    numberFormat3 = dataLabelFormat.getNumberFormat();
                }
                dValueOf2 = Double.valueOf(d);
            } else {
                dValueOf2 = Double.valueOf(C14116yg.m67477k4(d, 2));
            }
            String strM63880k44 = C13729ki.m63880k4((Object) dValueOf2, numberFormat3, false);
            String strM63886x1 = C13729ki.m63886x1(dataLabelM4570x1);
            C12013m9 c12013m9M4556c5 = c0886d8M64942ck.m5003ks().m4556c5();
            C12003du c12003duClone = c0886d8M64942ck.m5003ks().m4562jd().Clone();
            int iM27462to = C7019kk.m27462to(Float.valueOf(c0886d8M64942ck.m5003ks().m4566m9()), 13);
            C12015qq c12015qqClone = gfh.m6625kk(c13847mr, c14365qy).Clone();
            c0886d8 = c0886d8M64942ck;
            boolean z5 = zM63884k4;
            c0886d8M64942ck.m5003ks().f4320kk.f5456k4 = new C12014ne(C7019kk.m27462to(Float.valueOf(c12007ix.m56557jd()), 13), C7019kk.m27462to(Float.valueOf(c12007ix.m56551ck()), 13), C7019kk.m27462to(Float.valueOf(c12007ix.m56550c5()), 13), C7019kk.m27462to(Float.valueOf(c12007ix.m56575x1()), 13));
            c0886d8.m5003ks().f4320kk.m7072k4();
            if (dataLabelFormat.getShowLegendKey()) {
                i3 = 13;
                fValueOf = Float.valueOf(c12007ix.m56557jd());
            } else {
                fValueOf = Float.valueOf(c12007ix.m56557jd() + 3.0f);
                i3 = 13;
            }
            int iM27462to2 = C7019kk.m27462to(fValueOf, i3);
            int iM27462to3 = C7019kk.m27462to(Float.valueOf(c12007ix.m56551ck()), i3) + 3;
            int iM27462to4 = C7019kk.m27462to(Float.valueOf(!dataLabelFormat.getShowLegendKey() ? c12007ix.m56550c5() - 6.0f : c12007ix.m56550c5()), i3);
            int iM27462to5 = C7019kk.m27462to(Float.valueOf(c12007ix.m56575x1()), i3) - 6;
            if (!dataLabelFormat.getShowLegendKey()) {
                gfh.m6617k4(new C12007ix(c12007ix.m56557jd(), c12007ix.m56551ck() + 3.0f, c12015qqClone.m56699x1(), c12015qqClone.m56697kk()).Clone(), c13847mr, i2, c14365qy);
                iM27462to2 = C7019kk.m27462to(Float.valueOf(c12015qqClone.m56699x1()), 13) + iM27462to2;
                iM27462to4 -= C7019kk.m27462to(Float.valueOf(c12015qqClone.m56699x1()), 13);
            }
            if (C14113y2.m67411k4(c0886d8.m5003ks().m4564kk().getText())) {
                text = c0886d8.m5003ks().m4564kk().getText();
            } else {
                text = dataLabelFormat.getShowSeriesName() ? C14113y2.m67400k4("", strM64957kk) : "";
                if (dataLabelFormat.getShowCategoryName()) {
                    if (!"".equals(text)) {
                        text = C14113y2.m67400k4(text, strM63886x1);
                    }
                    text = C14113y2.m67400k4(text, str2);
                }
                if (dataLabelFormat.getShowValue()) {
                    if (!"".equals(text)) {
                        text = C14113y2.m67400k4(text, strM63886x1);
                    }
                    text = C14113y2.m67400k4(text, strM63880k4);
                }
                if (dataLabelFormat.getShowPercentage()) {
                    if (!"".equals(text)) {
                        text = C14113y2.m67400k4(text, strM63886x1);
                    }
                    text = C14113y2.m67400k4(text, strM63880k44);
                }
            }
            str = text;
            if ("".equals(str)) {
                C12014ne c12014ne = new C12014ne(iM27462to2, iM27462to3, iM27462to4, iM27462to5);
                if (z5 || z4) {
                    c12003du = c12003duClone;
                    C12003du.m56486y6().CloneTo(c12003du);
                } else {
                    c12003du = c12003duClone;
                }
                C0840c3.m4444k4(C12007ix.m56544k4(c12014ne).Clone(), str, iM27462to, c12013m9M4556c5, c12003du.Clone(), 1, 2, c14365qy);
                return;
            }
            return;
        }
        if (i2 != -1) {
            strM63880k42 = C13729ki.m63880k4(c14787xiM69837ix.f50098m9.get_Item(i2), numberFormat, dataLabelFormat.getShowCategoryName());
        }
        zM63884k4 = false;
        String str22 = strM63880k42;
        zIsNumberFormatLinkedToSource = dataLabelFormat.isNumberFormatLinkedToSource();
        if (dataLabelFormat.getShowPercentage()) {
        }
        if (!dataLabelFormat.getShowPercentage()) {
        }
        if (!zIsNumberFormatLinkedToSource) {
        }
        String numberFormat32 = "0%";
        boolean z42 = zM63884k42;
        if (dataLabelFormat.isNumberFormatLinkedToSource()) {
        }
        String strM63880k442 = C13729ki.m63880k4((Object) dValueOf2, numberFormat32, false);
        String strM63886x12 = C13729ki.m63886x1(dataLabelM4570x1);
        C12013m9 c12013m9M4556c52 = c0886d8M64942ck.m5003ks().m4556c5();
        C12003du c12003duClone2 = c0886d8M64942ck.m5003ks().m4562jd().Clone();
        int iM27462to6 = C7019kk.m27462to(Float.valueOf(c0886d8M64942ck.m5003ks().m4566m9()), 13);
        C12015qq c12015qqClone2 = gfh.m6625kk(c13847mr, c14365qy).Clone();
        c0886d8 = c0886d8M64942ck;
        boolean z52 = zM63884k4;
        c0886d8M64942ck.m5003ks().f4320kk.f5456k4 = new C12014ne(C7019kk.m27462to(Float.valueOf(c12007ix.m56557jd()), 13), C7019kk.m27462to(Float.valueOf(c12007ix.m56551ck()), 13), C7019kk.m27462to(Float.valueOf(c12007ix.m56550c5()), 13), C7019kk.m27462to(Float.valueOf(c12007ix.m56575x1()), 13));
        c0886d8.m5003ks().f4320kk.m7072k4();
        if (dataLabelFormat.getShowLegendKey()) {
        }
        int iM27462to22 = C7019kk.m27462to(fValueOf, i3);
        int iM27462to32 = C7019kk.m27462to(Float.valueOf(c12007ix.m56551ck()), i3) + 3;
        int iM27462to42 = C7019kk.m27462to(Float.valueOf(!dataLabelFormat.getShowLegendKey() ? c12007ix.m56550c5() - 6.0f : c12007ix.m56550c5()), i3);
        int iM27462to52 = C7019kk.m27462to(Float.valueOf(c12007ix.m56575x1()), i3) - 6;
        if (!dataLabelFormat.getShowLegendKey()) {
        }
        if (C14113y2.m67411k4(c0886d8.m5003ks().m4564kk().getText())) {
        }
        str = text;
        if ("".equals(str)) {
        }
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(hgt hgtVar) {
    }
}
