package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.pd */
/* JADX INFO: loaded from: classes3.dex */
class C14277pd {

    /* JADX INFO: renamed from: k4 */
    private String f48032k4;

    /* JADX INFO: renamed from: x1 */
    private IChartData f48033x1;

    public C14277pd(String str, IChartData iChartData) {
        C6005k4.m24262k4(iChartData != null, "Argument chartData can't be null");
        C6005k4.m24262k4(true ^ C14113y2.m67411k4(str), "Argument formula can't be empty");
        this.f48032k4 = str;
        this.f48033x1 = iChartData;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69027k4(AbstractC14173n9 abstractC14173n9) {
        List<C14857yq> listM686kk = ((ChartDataWorkbook) this.f48033x1.getChartDataWorkbook()).m686kk(this.f48032k4);
        if (listM686kk.size() == 0) {
            throw new ArgumentException("Formula has incorrect format", "formula");
        }
        abstractC14173n9.mo6299k4(listM686kk, this.f48033x1);
        abstractC14173n9.mo67898x1(listM686kk, this.f48033x1);
    }
}
