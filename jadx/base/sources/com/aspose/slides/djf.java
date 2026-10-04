package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: loaded from: classes3.dex */
class djf implements IGenericEnumerable<wuq> {

    /* JADX INFO: renamed from: k4 */
    private List<wuq> f4597k4 = new List<>();

    /* JADX INFO: renamed from: x1 */
    private ChartDataWorkbook f4598x1;

    public djf(ChartDataWorkbook chartDataWorkbook) {
        this.f4598x1 = chartDataWorkbook;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: iterator */
    public final IGenericEnumerator<wuq> iterator() {
        return this.f4597k4.m80682iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m5118k4() {
        return this.f4597k4.size();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5119k4(wuq wuqVar) {
        this.f4597k4.addItem(wuqVar);
    }
}
