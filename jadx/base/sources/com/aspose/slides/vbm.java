package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
class vbm extends AbstractC7020m9<vbm> {
    /* JADX INFO: renamed from: x1 */
    private boolean m72169x1(vbm vbmVar) {
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
        if (obj instanceof vbm) {
            return m72169x1((vbm) obj);
        }
        return false;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public vbm Clone() {
        vbm vbmVar = new vbm();
        CloneTo(vbmVar);
        return vbmVar;
    }

    /* JADX INFO: renamed from: k4 */
    private static String m72165k4(C13847mr c13847mr, int i, double d, C14365qy c14365qy) {
        C0886d8 c0886d8 = c13847mr.m64944dy().get_Item(i);
        List<C1210hn> listM69871x1 = c14365qy.m69871x1();
        C14787xi c14787xiM69854ne = c14365qy.m69854ne();
        C0852cf c0852cfM5003ks = c0886d8.m5003ks();
        IDataLabelFormat dataLabelFormat = c0852cfM5003ks.m4570x1().getDataLabelFormat();
        boolean zIsNumberFormatLinkedToSource = dataLabelFormat.isNumberFormatLinkedToSource();
        String numberFormat = dataLabelFormat.getShowPercentage() ? "" : dataLabelFormat.getNumberFormat();
        String numberFormat2 = ("".equals(dataLabelFormat.getNumberFormat()) || "General".equals(dataLabelFormat.getNumberFormat())) ? "0%" : dataLabelFormat.getNumberFormat();
        String strM64957kk = c13847mr.m64957kk();
        String strM63880k4 = i < c14787xiM69854ne.f50098m9.size() ? C13729ki.m63880k4(c14787xiM69854ne.f50098m9.get_Item(i), numberFormat, false) : "";
        if (zIsNumberFormatLinkedToSource) {
            strM63880k4 = (i < 0 || i >= c14787xiM69854ne.f50098m9.size()) ? "" : C13729ki.m63880k4(c14787xiM69854ne.f50098m9.get_Item(i), (i < 0 || i >= listM69871x1.size()) ? "" : listM69871x1.get_Item(i).m7228h4(), i >= 0 && i < listM69871x1.size() && listM69871x1.get_Item(i).m7227du());
        }
        String strM63880k42 = C13729ki.m63880k4((Object) Double.valueOf(c0886d8.m4989k4()), numberFormat, false);
        if (zIsNumberFormatLinkedToSource) {
            strM63880k42 = C13729ki.m63880k4((Object) Double.valueOf(c0886d8.m4989k4()), c0886d8.m5008to(), false);
        }
        String strM63880k43 = C13729ki.m63880k4((Object) Double.valueOf(d), numberFormat2, false);
        String strM63879k4 = C13729ki.m63879k4(c0852cfM5003ks.m4570x1());
        String strM67400k4 = dataLabelFormat.getShowSeriesName() ? C14113y2.m67400k4("", strM64957kk) : "";
        if (dataLabelFormat.getShowCategoryName()) {
            if (!"".equals(strM67400k4)) {
                strM67400k4 = C14113y2.m67400k4(strM67400k4, strM63879k4);
            }
            strM67400k4 = C14113y2.m67400k4(strM67400k4, strM63880k4);
        }
        if (dataLabelFormat.getShowValue()) {
            if (!"".equals(strM67400k4)) {
                strM67400k4 = C14113y2.m67400k4(strM67400k4, strM63879k4);
            }
            strM67400k4 = C14113y2.m67400k4(strM67400k4, strM63880k42);
        }
        if (!dataLabelFormat.getShowPercentage()) {
            return strM67400k4;
        }
        if (!"".equals(strM67400k4)) {
            strM67400k4 = C14113y2.m67400k4(strM67400k4, strM63879k4);
        }
        return C14113y2.m67400k4(strM67400k4, strM63880k43);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72166k4(C14365qy c14365qy) {
        C13847mr c13847mr = c14365qy.m69865up().get_Item(0);
        List<C0886d8> listM64944dy = c13847mr.m64944dy();
        C12003du[] c12003duArr = (C12003du[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12003du.class), listM64944dy.size()));
        double[] dArr = new double[listM64944dy.size()];
        for (int i = 0; i < listM64944dy.size(); i++) {
            dArr[i] = listM64944dy.get_Item(i).m4989k4();
        }
        String[] strArr = new String[listM64944dy.size()];
        double dM67475k4 = 0.0d;
        for (int i2 = 0; i2 < listM64944dy.size(); i2++) {
            dM67475k4 += C14116yg.m67475k4(listM64944dy.get_Item(i2).m4989k4());
        }
        if (dM67475k4 == 0.0d) {
            return;
        }
        for (int i3 = 0; i3 < listM64944dy.size(); i3++) {
            strArr[i3] = m72165k4(c13847mr, i3, dM67475k4 != 0.0d ? listM64944dy.get_Item(i3).m4989k4() / dM67475k4 : 0.0d, c14365qy);
        }
        C12014ne c12014neClone = c14365qy.f48440k4.f5456k4.Clone();
        C12014ne[] c12014neArr = {c12014neClone};
        m72168k4(c12014neArr, c14365qy);
        c12014neArr[0].CloneTo(c12014neClone);
        gp2 gp2Var = new gp2(c12014neClone.m56669jd(), c12014neClone.m56664ck(), c12014neClone.m56663c5(), c12014neClone.m56683x1(), dArr, c12003duArr, c14365qy.m69824bv(), strArr, listM64944dy);
        gp2Var.m6869k4(c13847mr);
        gp2Var.m6864k4();
        gp2Var.m6870k4(c14365qy);
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(vbm vbmVar) {
    }

    /* JADX INFO: renamed from: k4 */
    public static void m72167k4(C12014ne[] c12014neArr, C13847mr c13847mr) {
        Chart chartM69834fa = c13847mr.m64941c5().m69834fa();
        if (c12014neArr[0].m56663c5() <= 0 || c12014neArr[0].m56683x1() <= 0) {
            return;
        }
        if ((chartM69834fa.getType() == 27 || chartM69834fa.getType() == 30) && ((ChartPlotArea) C7019kk.m27452k4((Object) chartM69834fa.getPlotArea(), ChartPlotArea.class)).isLocationAutocalculated()) {
            C12014ne c12014ne = c12014neArr[0];
            c12014ne.m56676kk(c12014ne.m56669jd() + 4);
            C12014ne c12014ne2 = c12014neArr[0];
            c12014ne2.m56682to(c12014ne2.m56664ck() + 4);
            c12014neArr[0].m56684x1(r0.m56663c5() - 8);
            c12014neArr[0].m56671k4(r0.m56683x1() - 8);
            if (c13847mr.m64945h4().getLabels().isVisible()) {
                if (c13847mr.m64945h4().getLabels().getDefaultDataLabelFormat().getPosition() == 6 || c13847mr.m64945h4().getLabels().getDefaultDataLabelFormat().getPosition() == 1) {
                    int iM63753k4 = kc0.m63753k4((c13847mr.m64941c5().m69867v4() / 100.0f) * 6.0f);
                    int iM63753k42 = kc0.m63753k4((c13847mr.m64941c5().m69852lr() / 100.0f) * 6.0f);
                    C12014ne c12014ne3 = c12014neArr[0];
                    c12014ne3.m56676kk(c12014ne3.m56669jd() + iM63753k4);
                    C12014ne c12014ne4 = c12014neArr[0];
                    c12014ne4.m56682to(c12014ne4.m56664ck() + iM63753k42);
                    C12014ne c12014ne5 = c12014neArr[0];
                    c12014ne5.m56684x1(c12014ne5.m56663c5() - (iM63753k4 * 2));
                    C12014ne c12014ne6 = c12014neArr[0];
                    c12014ne6.m56671k4(c12014ne6.m56683x1() - (iM63753k42 * 2));
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m72168k4(C12014ne[] c12014neArr, C14365qy c14365qy) {
        int iM63753k4 = kc0.m63753k4((c12014neArr[0].m56663c5() / 400.0f) * 3.0f);
        int iM63753k42 = kc0.m63753k4((c12014neArr[0].m56683x1() / 400.0f) * 3.0f);
        C12014ne c12014ne = c12014neArr[0];
        c12014ne.m56676kk(c12014ne.m56669jd() + iM63753k4);
        C12014ne c12014ne2 = c12014neArr[0];
        c12014ne2.m56682to(c12014ne2.m56664ck() + iM63753k42);
        C12014ne c12014ne3 = c12014neArr[0];
        c12014ne3.m56684x1(c12014ne3.m56663c5() - (iM63753k4 * 2));
        C12014ne c12014ne4 = c12014neArr[0];
        c12014ne4.m56671k4(c12014ne4.m56683x1() - (iM63753k42 * 2));
        double dM67470dy = 0.1428571492433548d / C14116yg.m67470dy(0.17453292519943295d);
        double dM69829dq = (((double) (c14365qy.m69829dq() != 0 ? c14365qy.m69829dq() : 20)) * 3.141592653589793d) / 180.0d;
        double dM67470dy2 = ((C14116yg.m67470dy(dM69829dq) * ((((double) c14365qy.m69864um()) * dM67470dy) / 100.0d)) + C14116yg.m67495m9(dM69829dq)) * ((double) c12014neArr[0].m56663c5());
        double dM56683x1 = ((double) c12014neArr[0].m56683x1()) / ((C14116yg.m67470dy(dM69829dq) * ((((double) c14365qy.m69864um()) * dM67470dy) / 100.0d)) + C14116yg.m67495m9(dM69829dq));
        if (dM67470dy2 <= c12014neArr[0].m56683x1()) {
            c12014neArr[0].m56682to(kc0.m63759kk(((double) ((c12014neArr[0].m56683x1() / 2.0f) + r5.m56664ck())) - (dM67470dy2 / 2.0d)));
            c12014neArr[0].m56671k4(kc0.m63759kk(dM67470dy2));
        } else {
            c12014neArr[0].m56676kk(kc0.m63759kk(((double) ((c12014neArr[0].m56663c5() / 2.0f) + r7.m56669jd())) - (dM56683x1 / 2.0d)));
            c12014neArr[0].m56684x1(kc0.m63759kk(dM56683x1));
        }
        c14365qy.m69839k4((float) ((C14116yg.m67470dy(dM69829dq) * (((((double) c12014neArr[0].m56663c5()) * dM67470dy) * ((double) c14365qy.m69864um())) / 100.0d)) / ((double) c12014neArr[0].m56683x1())));
    }
}
