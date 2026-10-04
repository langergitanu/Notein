package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes3.dex */
class jhr extends AbstractC0765aw {
    public jhr(C0886d8 c0886d8) {
        super(c0886d8);
    }

    /* JADX INFO: renamed from: fa */
    private String m63320fa() {
        eh0 eh0Var = (eh0) C7019kk.m27452k4((Object) ((bfq) m73228yd()).m4201wl(), eh0.class);
        if (m3756ck().m5007rv() < 0) {
            return "Other";
        }
        if (eh0Var != null && eh0Var.m5534rv()) {
            return "Other";
        }
        ChartSeries chartSeriesM64945h4 = m3756ck().m5012up().m64945h4();
        C14365qy c14365qyM64941c5 = m3756ck().m5012up().m64941c5();
        List<C1210hn> listM69848kk = chartSeriesM64945h4.getPlotOnSecondAxis() ? c14365qyM64941c5.m69848kk() : c14365qyM64941c5.m69871x1();
        if (m3756ck().m5007rv() >= listM69848kk.size()) {
            return C14057f9.m66591x1(m3756ck().m5007rv() + 1);
        }
        C1210hn c1210hn = listM69848kk.get_Item(m3756ck().m5007rv());
        return xhm.m73361k4(c1210hn.m7238x1(), c1210hn.m7228h4());
    }

    /* JADX INFO: renamed from: rv */
    private String m63321rv() {
        IDataLabelFormat dataLabelFormat = m3756ck().m5003ks().m4570x1().getDataLabelFormat();
        String numberFormat = !dataLabelFormat.isNumberFormatLinkedToSource() ? dataLabelFormat.getNumberFormat() : "";
        if (C14113y2.m67411k4(numberFormat) || C14337qc.f48301x1.containsItem(numberFormat)) {
            numberFormat = "0%";
        }
        return xhm.m73361k4(Double.valueOf(((bfq) m73228yd()).m4201wl().m4552c5()), numberFormat);
    }

    /* JADX INFO: renamed from: up */
    private String m63322up() {
        IDataLabelFormat dataLabelFormat = m3756ck().m5003ks().m4570x1().getDataLabelFormat();
        boolean zIsNumberFormatLinkedToSource = dataLabelFormat.isNumberFormatLinkedToSource();
        if (dataLabelFormat.getShowPercentage()) {
            zIsNumberFormatLinkedToSource = true;
        }
        double dM4989k4 = m3756ck().m4989k4();
        if (!zIsNumberFormatLinkedToSource) {
            return xhm.m73361k4(Double.valueOf(m3756ck().m4989k4()), dataLabelFormat.getShowPercentage() ? "" : dataLabelFormat.getNumberFormat());
        }
        String strM5008to = m3756ck().m5008to();
        if ("".equals(strM5008to) || C14337qc.f48301x1.containsItem(strM5008to)) {
            strM5008to = m3756ck().m4981du();
        }
        return xhm.m73361k4(Double.valueOf(dM4989k4), strM5008to);
    }

    @Override // com.aspose.slides.AbstractC13836mg
    /* JADX INFO: renamed from: kk */
    public String mo3563kk() {
        List list = new List();
        DataLabel dataLabelM4570x1 = m3756ck().m5003ks().m4570x1();
        IDataLabelFormat dataLabelFormat = dataLabelM4570x1.getDataLabelFormat();
        String str = (dataLabelFormat.getShowSeriesName() || !dataLabelFormat.getShowCategoryName() || dataLabelFormat.getShowValue() || !dataLabelFormat.getShowPercentage()) ? ", " : IOUtils.LINE_SEPARATOR_UNIX;
        if (dataLabelFormat.getShowLabelValueFromCell()) {
            list.addItem(((ChartData) dataLabelM4570x1.getChart().getChartData()).m553x1().mo5710kk() == 2 ? dataLabelM4570x1.getValueFromCell().getValue().toString() : dataLabelM4570x1.m1296k4());
        }
        if (dataLabelFormat.getShowSeriesName()) {
            list.addItem(m3757m9());
        }
        if (dataLabelFormat.getShowCategoryName()) {
            list.addItem(m63320fa());
        }
        if (dataLabelFormat.getShowValue()) {
            list.addItem(m63322up());
        }
        if (dataLabelFormat.getShowPercentage()) {
            list.addItem(m63321rv());
        }
        return C14113y2.m67403k4(m64880x1(str), (String[]) list.toArray(new String[0]));
    }
}
