package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: loaded from: classes3.dex */
class zt8 implements IGenericEnumerable<xry> {

    /* JADX INFO: renamed from: k4 */
    private List<xry> f50732k4 = new List<>();

    /* JADX INFO: renamed from: x1 */
    private ChartDataWorkbook f50733x1;

    public zt8(ChartDataWorkbook chartDataWorkbook) {
        this.f50733x1 = chartDataWorkbook;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<xry> iterator() {
        return this.f50732k4.iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m74812k4() {
        return this.f50732k4.size();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m74813k4(xry xryVar) {
        this.f50732k4.addItem(xryVar);
        return this.f50732k4.indexOf(xryVar);
    }

    /* JADX INFO: renamed from: k4 */
    public final xry m74814k4(int i) {
        return this.f50732k4.get_Item(i);
    }
}
