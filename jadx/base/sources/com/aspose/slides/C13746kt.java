package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;

/* JADX INFO: renamed from: com.aspose.slides.kt */
/* JADX INFO: loaded from: classes3.dex */
class C13746kt implements IGenericEnumerator<IChartDataCell> {

    /* JADX INFO: renamed from: k4 */
    private int f45857k4 = -1;

    /* JADX INFO: renamed from: x1 */
    private List<ChartDataCell> f45858x1;

    public C13746kt(List<ChartDataCell> list) {
        this.f45858x1 = list;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.f45857k4 + 1;
        this.f45857k4 = i;
        return i < this.f45858x1.size();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final IChartDataCell next() {
        try {
            return this.f45858x1.get_Item(this.f45857k4);
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
        this.f45857k4 = -1;
    }
}
