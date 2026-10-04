package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;

/* JADX INFO: renamed from: com.aspose.slides.j0 */
/* JADX INFO: loaded from: classes3.dex */
class C13668j0 implements IGenericEnumerator<IChartDataCell> {

    /* JADX INFO: renamed from: k4 */
    private int f45405k4 = -1;

    /* JADX INFO: renamed from: x1 */
    private List<ChartDataCell> f45406x1;

    public C13668j0(List<ChartDataCell> list) {
        this.f45406x1 = list;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public final boolean hasNext() {
        return this.f45405k4 + 1 < this.f45406x1.size();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final IChartDataCell next() {
        try {
            int i = this.f45405k4 + 1;
            this.f45405k4 = i;
            return this.f45406x1.get_Item(i);
        } catch (IndexOutOfRangeException e) {
            throw new InvalidOperationException(e.getMessage(), e);
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.slides.Collections.IEnumerator
    public final void reset() {
        this.f45405k4 = -1;
    }
}
