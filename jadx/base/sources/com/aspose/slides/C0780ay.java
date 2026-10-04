package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.ay */
/* JADX INFO: loaded from: classes3.dex */
class C0780ay extends AbstractC0765aw {
    public C0780ay(C0886d8 c0886d8) {
        super(c0886d8);
    }

    /* JADX INFO: renamed from: fa */
    private String m3794fa() {
        ChartSeries chartSeriesM64945h4 = m3756ck().m5012up().m64945h4();
        C14365qy c14365qyM64941c5 = m3756ck().m5012up().m64941c5();
        C1210hn c1210hn = (chartSeriesM64945h4.getPlotOnSecondAxis() ? c14365qyM64941c5.m69848kk() : c14365qyM64941c5.m69871x1()).get_Item(m3756ck().m5007rv());
        String numberFormat = m3756ck().m5003ks().m4570x1().getDataLabelFormat().getNumberFormat();
        if (C14337qc.f48301x1.containsItem(numberFormat) || C14113y2.m67411k4(numberFormat)) {
            return C0841c4.m4468k4(c1210hn.m7238x1(), chartSeriesM64945h4.getPlotOnSecondAxis() ? c14365qyM64941c5.m69837ix() : c14365qyM64941c5.m69854ne());
        }
        return xhm.m73361k4(c1210hn.m7238x1(), numberFormat);
    }

    /* JADX INFO: renamed from: up */
    private String m3795up() {
        String numberFormat;
        IDataLabelFormat dataLabelFormat = m3756ck().m5003ks().m4570x1().getDataLabelFormat();
        boolean z = dataLabelFormat.isNumberFormatLinkedToSource() || dataLabelFormat.getShowPercentage();
        double dM4989k4 = m3756ck().m4989k4();
        if (z) {
            numberFormat = m3756ck().m5008to();
            if ("".equals(numberFormat) || C14337qc.f48301x1.containsItem(numberFormat)) {
                numberFormat = m3756ck().m4981du();
            }
        } else {
            numberFormat = dataLabelFormat.getNumberFormat();
        }
        return xhm.m73361k4(Double.valueOf(dM4989k4), numberFormat);
    }

    @Override // com.aspose.slides.AbstractC13836mg
    /* JADX INFO: renamed from: kk */
    public String mo3563kk() {
        List list = new List();
        IDataLabelFormat dataLabelFormat = m3756ck().m5003ks().m4570x1().getDataLabelFormat();
        String strM55050ix = C11697x1.m55255x1().m55263fa().m55050ix();
        if (dataLabelFormat.getShowSeriesName()) {
            list.addItem(m3757m9());
        }
        if (dataLabelFormat.getShowCategoryName()) {
            list.addItem(m3794fa());
        }
        if (dataLabelFormat.getShowValue()) {
            list.addItem(m3795up());
        }
        return C14113y2.m67403k4(C14113y2.m67408k4(m64880x1(strM55050ix), " "), (String[]) list.toArray(new String[0]));
    }
}
