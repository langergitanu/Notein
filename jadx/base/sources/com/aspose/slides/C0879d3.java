package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.d3 */
/* JADX INFO: loaded from: classes3.dex */
class C0879d3 extends AbstractC13836mg {

    /* JADX INFO: renamed from: x1 */
    private ChartDataPointLevel f4517x1;

    public C0879d3(ChartDataPointLevel chartDataPointLevel, C14365qy c14365qy) {
        super(new C0852cf((DataLabel) chartDataPointLevel.getLabel(), c14365qy));
        this.f4517x1 = chartDataPointLevel;
    }

    /* JADX INFO: renamed from: ck */
    private String m4899ck() {
        return this.f4517x1.m647h4();
    }

    @Override // com.aspose.slides.AbstractC13836mg
    /* JADX INFO: renamed from: kk */
    public String mo3563kk() {
        List list = new List();
        IDataLabelFormat dataLabelFormat = ((DataLabel) this.f4517x1.getLabel()).getDataLabelFormat();
        String strM55050ix = C11697x1.m55255x1().m55263fa().m55050ix();
        if (dataLabelFormat.getShowSeriesName()) {
            list.addItem(m4900m9());
        }
        if (dataLabelFormat.getShowCategoryName()) {
            list.addItem(m4899ck());
        }
        return C14113y2.m67403k4(C14113y2.m67408k4(m64880x1(strM55050ix), " "), (String[]) list.toArray(new String[0]));
    }

    /* JADX INFO: renamed from: m9 */
    public final String m4900m9() {
        ChartSeries chartSeriesM640x1 = this.f4517x1.m652m9().m596to().m640x1();
        return ((ChartData) chartSeriesM640x1.getChart().getChartData()).m553x1().mo5710kk() != 2 ? chartSeriesM640x1.m725jd() : chartSeriesM640x1.getName().toString();
    }
}
