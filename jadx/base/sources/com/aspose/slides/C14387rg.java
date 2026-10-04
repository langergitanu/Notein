package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p463vm.C11697x1;

/* JADX INFO: renamed from: com.aspose.slides.rg */
/* JADX INFO: loaded from: classes3.dex */
class C14387rg implements d5a {

    /* JADX INFO: renamed from: k4 */
    private IChartDataWorkbook f48564k4;

    public C14387rg(IChartDataWorkbook iChartDataWorkbook) {
        if (iChartDataWorkbook == null) {
            throw new ArgumentNullException("workbook");
        }
        this.f48564k4 = iChartDataWorkbook;
    }

    @Override // com.aspose.slides.d5a
    /* JADX INFO: renamed from: k4 */
    public final int mo4951k4() {
        return 0;
    }

    @Override // com.aspose.slides.d5a
    /* JADX INFO: renamed from: x1 */
    public final C11697x1 mo4952x1() {
        return ((SpreadsheetOptions) ((Presentation) ((ChartDataWorkbook) this.f48564k4).m667ck().getPresentation()).m2349du().getSpreadsheetOptions()).m2832k4();
    }
}
