package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.yk */
/* JADX INFO: loaded from: classes3.dex */
class C14850yk extends AbstractC0765aw {
    public C14850yk(C0886d8 c0886d8) {
        super(c0886d8);
    }

    /* JADX INFO: renamed from: fa */
    private String m73918fa() {
        ChartSeries chartSeriesM64945h4 = m3756ck().m5012up().m64945h4();
        C14365qy c14365qyM64941c5 = m3756ck().m5012up().m64941c5();
        List<C1210hn> listM69848kk = chartSeriesM64945h4.getPlotOnSecondAxis() ? c14365qyM64941c5.m69848kk() : c14365qyM64941c5.m69871x1();
        if (m3756ck().m5007rv() >= listM69848kk.size()) {
            return C14113y2.f47374k4;
        }
        C1210hn c1210hn = listM69848kk.get_Item(m3756ck().m5007rv());
        String numberFormat = m3756ck().m5003ks().m4570x1().getDataLabelFormat().getNumberFormat();
        if (C14337qc.f48301x1.containsItem(numberFormat) || C14113y2.m67411k4(numberFormat)) {
            return C0841c4.m4468k4(c1210hn.m7238x1(), chartSeriesM64945h4.getPlotOnSecondAxis() ? c14365qyM64941c5.m69837ix() : c14365qyM64941c5.m69854ne());
        }
        return xhm.m73361k4(c1210hn.m7238x1(), numberFormat);
    }

    /* JADX INFO: renamed from: up */
    private String m73919up() {
        IDataLabelFormat dataLabelFormat = m3756ck().m5003ks().m4570x1().getDataLabelFormat();
        boolean z = dataLabelFormat.isNumberFormatLinkedToSource() || dataLabelFormat.getShowPercentage();
        fml fmlVar = (fml) C7019kk.m27452k4((Object) m73228yd().m73228yd(), fml.class);
        boolean zIsChartTypeBar = ChartTypeCharacterizer.isChartTypeBar(fmlVar.m6220yj().m64945h4().getType());
        ixg ixgVarM6216ks = fmlVar.m6216ks();
        C14787xi c14787xiM73026k4 = (zIsChartTypeBar ? ixgVarM6216ks.f45392kk : ixgVarM6216ks.f45394x1).m73026k4();
        double dM3755k4 = AbstractC0765aw.m3755k4(m3756ck().m4989k4() * c14787xiM73026k4.m73379dq());
        if (!z) {
            String numberFormat = dataLabelFormat.getNumberFormat();
            return C14337qc.f48301x1.containsItem(numberFormat) ? C0841c4.m4468k4(Double.valueOf(dM3755k4), c14787xiM73026k4) : xhm.m73361k4(Double.valueOf(dM3755k4), numberFormat);
        }
        String strM5008to = m3756ck().m5008to();
        if ("".equals(strM5008to) || C14337qc.f48301x1.containsItem(strM5008to)) {
            strM5008to = m3756ck().m4981du();
        }
        return xhm.m73361k4(Double.valueOf(dM3755k4), strM5008to);
    }

    @Override // com.aspose.slides.AbstractC13836mg
    /* JADX INFO: renamed from: kk */
    public String mo3563kk() {
        List list = new List();
        DataLabel dataLabelM4570x1 = m3756ck().m5003ks().m4570x1();
        IDataLabelFormat dataLabelFormat = dataLabelM4570x1.getDataLabelFormat();
        String strM55050ix = C11697x1.m55255x1().m55263fa().m55050ix();
        if (dataLabelFormat.getShowLabelValueFromCell()) {
            list.addItem(((ChartData) dataLabelM4570x1.getChart().getChartData()).m553x1().mo5710kk() == 2 ? dataLabelM4570x1.getValueFromCell().getValue().toString() : dataLabelM4570x1.m1296k4());
        }
        if (dataLabelFormat.getShowSeriesName()) {
            list.addItem(m3757m9());
        }
        if (dataLabelFormat.getShowCategoryName()) {
            list.addItem(m73918fa());
        }
        if (dataLabelFormat.getShowValue()) {
            list.addItem(m73919up());
        }
        return C14113y2.m67403k4(C14113y2.m67408k4(m64880x1(strM55050ix), " "), (String[]) list.toArray(new String[0]));
    }
}
