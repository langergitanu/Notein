package com.aspose.slides;

import com.aspose.slides.internal.p332p7.C7676fm;
import com.aspose.slides.internal.p332p7.C8045jy;
import com.aspose.slides.internal.p332p7.C8317n8;
import com.aspose.slides.internal.p332p7.C8324nc;

/* JADX INFO: renamed from: com.aspose.slides.xc */
/* JADX INFO: loaded from: classes3.dex */
class C14781xc extends AbstractC14443sc {
    @Override // com.aspose.slides.AbstractC14443sc
    /* JADX INFO: renamed from: k4 */
    public void mo4281k4(ChartSeries chartSeries, C8317n8 c8317n8) {
        if (c8317n8.m37326x1() != null) {
            chartSeries.setShowInnerPoints(c8317n8.m37326x1().m31849to() == 1);
            chartSeries.setShowOutlierPoints(c8317n8.m37326x1().m31843du() == 1);
            chartSeries.setShowMeanLine(c8317n8.m37326x1().m31851x1() == 1);
            chartSeries.setShowMeanMarkers(c8317n8.m37326x1().m31847kk() == 1);
        }
        if (c8317n8.m37315du() != null) {
            if (c8317n8.m37315du().m35056k4() == 1) {
                chartSeries.setQuartileMethod(1);
            } else {
                chartSeries.setQuartileMethod(0);
            }
        }
    }

    @Override // com.aspose.slides.AbstractC14443sc
    /* JADX INFO: renamed from: k4 */
    public void mo4282k4(ChartSeries chartSeries, C8324nc c8324nc) {
        C8317n8 c8317n8 = new C8317n8();
        C7676fm c7676fm = new C7676fm();
        c7676fm.m31852x1(chartSeries.getShowMeanLine() ? (byte) 1 : (byte) 0);
        c7676fm.m31850to(chartSeries.getShowInnerPoints() ? (byte) 1 : (byte) 0);
        c7676fm.m31844du(chartSeries.getShowOutlierPoints() ? (byte) 1 : (byte) 0);
        c7676fm.m31848kk(chartSeries.getShowMeanMarkers() ? (byte) 1 : (byte) 0);
        c8317n8.m37319k4(c7676fm);
        C8045jy c8045jy = new C8045jy();
        if (chartSeries.getQuartileMethod() == 1) {
            c8045jy.m35057k4(1);
        } else {
            c8045jy.m35057k4(2);
        }
        c8317n8.m37321k4(c8045jy);
        c8324nc.m37389k4(c8317n8);
    }
}
