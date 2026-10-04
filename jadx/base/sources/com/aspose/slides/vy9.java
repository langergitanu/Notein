package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC8619qq;
import com.aspose.slides.internal.p332p7.AbstractC9120wl;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7935ij;
import com.aspose.slides.internal.p332p7.C8583q7;
import com.aspose.slides.internal.p332p7.C9099w9;

/* JADX INFO: loaded from: classes3.dex */
class vy9 extends AbstractC13703jv {
    /* JADX INFO: renamed from: k4 */
    private void m72585k4(IChartDataPointCollection iChartDataPointCollection, C8583q7 c8583q7, int i) {
        C9099w9 c9099w9M39374x1;
        String strM2835k4;
        int i2 = 0;
        for (int i3 = 0; i3 < iChartDataPointCollection.size(); i3++) {
            ISingleCellChartValue iSingleCellChartValueM63555k4 = AbstractC13703jv.m63555k4(iChartDataPointCollection.get_Item(i3), i);
            if (C7019kk.m27469x1(iSingleCellChartValueM63555k4, DoubleChartValue.class)) {
                DoubleChartValue doubleChartValue = (DoubleChartValue) iSingleCellChartValueM63555k4;
                if (!DoubleChartValue.m1354k4(doubleChartValue, false, false)) {
                    c9099w9M39374x1 = c8583q7.m39374x1();
                    c9099w9M39374x1.m43590k4(4294967295L & ((long) i3));
                    strM2835k4 = DoubleChartValue.m1352k4((IDoubleChartValue) doubleChartValue);
                    c9099w9M39374x1.m43591k4(strM2835k4);
                    i2++;
                }
            } else {
                StringOrDoubleChartValue stringOrDoubleChartValue = (StringOrDoubleChartValue) iSingleCellChartValueM63555k4;
                if (!StringOrDoubleChartValue.m2837k4((ISingleCellChartValue) stringOrDoubleChartValue, false)) {
                    c9099w9M39374x1 = c8583q7.m39374x1();
                    c9099w9M39374x1.m43590k4(4294967295L & ((long) i3));
                    strM2835k4 = StringOrDoubleChartValue.m2835k4((IStringOrDoubleChartValue) stringOrDoubleChartValue);
                    c9099w9M39374x1.m43591k4(strM2835k4);
                    i2++;
                }
            }
        }
        c8583q7.m39371k4().m38333k4(((long) i2) & 4294967295L);
    }

    @Override // com.aspose.slides.AbstractC13703jv
    /* JADX INFO: renamed from: k4 */
    public void mo6078k4(IChartSeries iChartSeries, AbstractC8619qq abstractC8619qq, int i) {
        if (!C7019kk.m27469x1(abstractC8619qq, C7935ij.class)) {
            throw new Exception();
        }
        m72585k4(iChartSeries.getDataPoints(), (C8583q7) ((C7935ij) abstractC8619qq).m34168k4("strLit").m29542x1(), i);
    }

    @Override // com.aspose.slides.AbstractC13703jv
    /* JADX INFO: renamed from: k4 */
    public void mo6079k4(IChartSeries iChartSeries, AbstractC8619qq abstractC8619qq, int i, gnb gnbVar, boolean z) {
        m63557x1(iChartSeries, abstractC8619qq, i);
        for (C9099w9 c9099w9 : ((C8583q7) ((C7935ij) abstractC8619qq).m34166du().m29542x1()).m39373to()) {
            ((IStringOrDoubleChartValue) AbstractC13703jv.m63555k4(iChartSeries.getDataPoints().getOrCreateDataPointByIdx(c9099w9.m43589k4()), i)).setAsLiteralString(c9099w9.m43592x1());
        }
    }

    @Override // com.aspose.slides.AbstractC13703jv
    /* JADX INFO: renamed from: k4 */
    public void mo6080k4(IChartSeries iChartSeries, AbstractC9120wl abstractC9120wl) {
        if (iChartSeries.getName().getAsLiteralString() == null) {
            return;
        }
        abstractC9120wl.mo30759dy().m42727k4(new C7394ca("v", iChartSeries.getName().getAsLiteralString()));
    }
}
