package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;

/* JADX INFO: loaded from: classes3.dex */
class nl7<T> extends List<T> {

    /* JADX INFO: renamed from: k4 */
    private ChartData f47567k4;

    public nl7(IChartData iChartData) {
        if (iChartData == null) {
            throw new ArgumentNullException("chartData argument can't be null");
        }
        this.f47567k4 = (ChartData) iChartData;
    }

    @Override // com.aspose.slides.Collections.Generic.List, com.aspose.slides.Collections.Generic.IGenericCollection
    public final void addItem(T t) {
        super.addItem(t);
    }

    @Override // com.aspose.slides.Collections.Generic.List, com.aspose.slides.Collections.Generic.IGenericList
    public final void insertItem(int i, T t) {
        super.insertItem(i, t);
    }

    @Override // com.aspose.slides.Collections.Generic.List, com.aspose.slides.Collections.Generic.IGenericCollection
    public final boolean removeItem(T t) {
        return super.removeItem(t);
    }
}
