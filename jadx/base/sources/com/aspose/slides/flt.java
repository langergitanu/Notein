package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;

/* JADX INFO: loaded from: classes3.dex */
class flt extends AbstractC13836mg {

    /* JADX INFO: renamed from: kk */
    private ChartDataPointLevel f5061kk;

    /* JADX INFO: renamed from: x1 */
    private float f5062x1;

    public flt(ChartDataPointLevel chartDataPointLevel, C14365qy c14365qy) {
        super(new C0852cf((DataLabel) chartDataPointLevel.getLabel(), c14365qy));
        this.f5062x1 = Float.NaN;
        this.f5061kk = chartDataPointLevel;
    }

    /* JADX INFO: renamed from: ck */
    private String m6193ck() {
        ChartSeries chartSeriesM640x1 = this.f5061kk.m652m9().m596to().m640x1();
        return ((ChartData) chartSeriesM640x1.getChart().getChartData()).m553x1().mo5710kk() != 2 ? chartSeriesM640x1.m725jd() : chartSeriesM640x1.getName().toString();
    }

    /* JADX INFO: renamed from: fa */
    private String m6194fa() {
        return this.f5061kk.m647h4();
    }

    /* JADX INFO: renamed from: up */
    private String m6195up() {
        IDataLabelFormat dataLabelFormat = ((DataLabel) this.f5061kk.getLabel()).getDataLabelFormat();
        double dDoubleValue = ((ChartData) this.f5061kk.m652m9().m596to().m640x1().getChart().getChartData()).m553x1().mo5710kk() != 2 ? ((Double) C7019kk.m27464to(this.f5061kk.m652m9().m601x6().m71989k4(), Double.TYPE)).doubleValue() : this.f5061kk.m652m9().getSizeValue().toDouble();
        String numberFormat = dataLabelFormat.getNumberFormat();
        if (C14113y2.m67411k4(numberFormat) || C14337qc.f48301x1.containsItem(numberFormat)) {
            numberFormat = this.f5061kk.m652m9().m596to().m640x1().m721du();
        }
        return xhm.m73361k4(Double.valueOf(dDoubleValue), numberFormat);
    }

    @Override // com.aspose.slides.AbstractC13836mg, com.aspose.slides.xhm
    /* JADX INFO: renamed from: h4 */
    public float mo4318h4() {
        return m6198m9();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6196k4(double d) {
        float f = -((float) d);
        m6197k4(d < 180.0d ? f + 90.0f : f - 90.0f);
    }

    @Override // com.aspose.slides.AbstractC13836mg
    /* JADX INFO: renamed from: kk */
    public String mo3563kk() {
        List list = new List();
        IDataLabelFormat dataLabelFormat = ((DataLabel) this.f5061kk.getLabel()).getDataLabelFormat();
        String strM55050ix = C11697x1.m55255x1().m55263fa().m55050ix();
        if (dataLabelFormat.getShowSeriesName()) {
            list.addItem(m6193ck());
        }
        if (dataLabelFormat.getShowCategoryName()) {
            list.addItem(m6194fa());
        }
        if (dataLabelFormat.getShowValue() && this.f5061kk.m652m9().getDataPointLevels().get_Item(0) == this.f5061kk) {
            list.addItem(m6195up());
        }
        return C14113y2.m67403k4(C14113y2.m67408k4(m64880x1(strM55050ix), " "), (String[]) list.toArray(new String[0]));
    }

    /* JADX INFO: renamed from: m9 */
    public final float m6198m9() {
        return this.f5062x1;
    }

    @Override // com.aspose.slides.AbstractC13836mg, com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: to */
    public void mo3230to(C14713vw c14713vw) {
        oju ojuVarClone = (C14113y2.m67411k4(m64877dy()) ? oju.f47834kk : m73363k4(m64877dy(), c14713vw.m72555k4(), c14713vw.m72556x1())).Clone();
        String strM64877dy = m64877dy();
        while (ojuVarClone.f47837x1 > c14713vw.m72556x1() && strM64877dy.length() > 1) {
            if (C14113y2.m67369h4(strM64877dy, ControlChar.SPACE_CHAR, '-').length > 1) {
                strM64877dy = C14113y2.m67443x1(strM64877dy, 0, C14113y2.m67418kk(strM64877dy, ControlChar.SPACE_CHAR) > C14113y2.m67418kk(strM64877dy, '-') ? C14113y2.m67418kk(strM64877dy, ControlChar.SPACE_CHAR) : C14113y2.m67418kk(strM64877dy, '-'));
            } else {
                strM64877dy = OooO0OO.OooO00o(1, 0, strM64877dy, strM64877dy);
            }
            m73363k4(C14113y2.m67408k4(strM64877dy, "..."), c14713vw.m72555k4(), c14713vw.m72556x1()).CloneTo(ojuVarClone);
        }
        m73214k4(ojuVarClone.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m6197k4(float f) {
        this.f5062x1 = f;
    }
}
