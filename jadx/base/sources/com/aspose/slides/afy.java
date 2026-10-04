package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class afy extends AbstractC0765aw {
    public afy(C0886d8 c0886d8) {
        super(c0886d8);
    }

    /* JADX INFO: renamed from: fa */
    private String m3560fa() {
        m3756ck().m5003ks().m4570x1();
        return xhm.m73361k4(Double.valueOf(m3756ck().m4999kk()), m3756ck().m5004m9());
    }

    /* JADX INFO: renamed from: rv */
    private String m3561rv() {
        IDataLabelFormat dataLabelFormat = m3756ck().m5003ks().m4570x1().getDataLabelFormat();
        boolean z = dataLabelFormat.isNumberFormatLinkedToSource() || dataLabelFormat.getShowPercentage();
        C14787xi c14787xiM73026k4 = ((fml) C7019kk.m27452k4((Object) m73228yd().m73228yd(), fml.class)).m6216ks().f45394x1.m73026k4();
        double dM4989k4 = m3756ck().m4989k4();
        if (!"General".equals(m3756ck().m5008to())) {
            return xhm.m73361k4(Double.valueOf(dM4989k4), m3756ck().m5008to());
        }
        if (z) {
            return xhm.m73361k4(Double.valueOf(dM4989k4), m3756ck().m4981du());
        }
        String numberFormat = dataLabelFormat.getNumberFormat();
        return C14337qc.f48301x1.containsItem(numberFormat) ? C0841c4.m4468k4(Double.valueOf(dM4989k4), c14787xiM73026k4) : xhm.m73361k4(Double.valueOf(dM4989k4), numberFormat);
    }

    /* JADX INFO: renamed from: up */
    private String m3562up() {
        IDataLabelFormat dataLabelFormat = m3756ck().m5003ks().m4570x1().getDataLabelFormat();
        boolean z = dataLabelFormat.isNumberFormatLinkedToSource() || dataLabelFormat.getShowPercentage();
        C14787xi c14787xiM73026k4 = ((fml) C7019kk.m27452k4((Object) m73228yd().m73228yd(), fml.class)).m6216ks().f45392kk.m73026k4();
        double dM5015x1 = m3756ck().m5015x1();
        if (!"General".equals(m3756ck().m4985h4())) {
            return xhm.m73361k4(Double.valueOf(dM5015x1), m3756ck().m4985h4());
        }
        if (z) {
            return xhm.m73361k4(Double.valueOf(dM5015x1), m3756ck().m4981du());
        }
        String numberFormat = dataLabelFormat.getNumberFormat();
        return C14337qc.f48301x1.containsItem(numberFormat) ? C0841c4.m4468k4(Double.valueOf(dM5015x1), c14787xiM73026k4) : xhm.m73361k4(Double.valueOf(dM5015x1), numberFormat);
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
            list.addItem(m3562up());
        }
        if (dataLabelFormat.getShowValue()) {
            list.addItem(m3561rv());
        }
        if (ChartTypeCharacterizer.isChartTypeBubble(m3756ck().m5012up().m64945h4().getType()) && dataLabelFormat.getShowBubbleSize()) {
            list.addItem(m3560fa());
        }
        return C14113y2.m67403k4(C14113y2.m67408k4(m64880x1(strM55050ix), " "), (String[]) list.toArray(new String[0]));
    }
}
