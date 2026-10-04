package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;

/* JADX INFO: renamed from: com.aspose.slides.yv */
/* JADX INFO: loaded from: classes3.dex */
class C14862yv implements IGenericEnumerator<IDataLabel> {

    /* JADX INFO: renamed from: k4 */
    private int f50409k4 = -1;

    /* JADX INFO: renamed from: x1 */
    private IChartDataPointCollection f50410x1;

    public C14862yv(IChartDataPointCollection iChartDataPointCollection) {
        this.f50410x1 = iChartDataPointCollection;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public final boolean hasNext() {
        return this.f50409k4 + 1 < this.f50410x1.size();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final IDataLabel next() {
        try {
            int i = this.f50409k4 + 1;
            this.f50409k4 = i;
            return this.f50410x1.get_Item(i).getLabel();
        } catch (IndexOutOfRangeException unused) {
            throw new InvalidOperationException();
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.slides.Collections.IEnumerator
    public final void reset() {
        this.f50409k4 = -1;
    }
}
