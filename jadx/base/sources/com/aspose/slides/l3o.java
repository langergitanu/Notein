package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7676fm;
import com.aspose.slides.internal.p332p7.C8317n8;
import com.aspose.slides.internal.p332p7.C8324nc;
import com.aspose.slides.internal.p332p7.C8506pb;

/* JADX INFO: loaded from: classes3.dex */
class l3o extends AbstractC14443sc {
    @Override // com.aspose.slides.AbstractC14443sc
    /* JADX INFO: renamed from: k4 */
    public void mo4281k4(ChartSeries chartSeries, C8317n8 c8317n8) {
        if (c8317n8.m37326x1() != null) {
            chartSeries.setShowConnectorLines(c8317n8.m37326x1().m31845k4() == 1);
        }
        if (c8317n8.m37316h4() != null) {
            for (int i = 0; i < c8317n8.m37316h4().m38768k4().length; i++) {
                long j = c8317n8.m37316h4().m38768k4()[i];
                if ((4294967295L & j) < chartSeries.getDataPoints().size()) {
                    ((ChartDataPoint) C7019kk.m27452k4((Object) chartSeries.getDataPoints().get_Item((int) j), ChartDataPoint.class)).setSetAsTotal(true);
                }
            }
        }
    }

    @Override // com.aspose.slides.AbstractC14443sc
    /* JADX INFO: renamed from: k4 */
    public void mo4282k4(ChartSeries chartSeries, C8324nc c8324nc) {
        C8317n8 c8317n8 = new C8317n8();
        if (!chartSeries.getShowConnectorLines()) {
            C7676fm c7676fm = new C7676fm();
            c7676fm.m31846k4((byte) 0);
            c8317n8.m37319k4(c7676fm);
        }
        C8506pb c8506pb = new C8506pb();
        for (int i = 0; i < chartSeries.getDataPoints().size(); i++) {
            if (((ChartDataPoint) C7019kk.m27452k4((Object) chartSeries.getDataPoints().get_Item(i), ChartDataPoint.class)).getSetAsTotal()) {
                c8506pb.m38767k4(((long) i) & 4294967295L);
            }
        }
        if (c8506pb.m38768k4().length > 0) {
            c8317n8.m37322k4(c8506pb);
        }
        c8324nc.m37389k4(c8317n8);
    }
}
