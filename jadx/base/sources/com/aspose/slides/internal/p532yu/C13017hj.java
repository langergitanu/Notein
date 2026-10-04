package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.IEnumerator;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.hj */
/* JADX INFO: loaded from: classes5.dex */
public class C13017hj implements IEnumerator<AbstractC13018hl> {

    /* JADX INFO: renamed from: k4 */
    private IEnumerator<AbstractC13018hl> f43712k4;

    public C13017hj(IEnumerator<AbstractC13018hl> iEnumerator) {
        this.f43712k4 = iEnumerator;
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public final boolean hasNext() {
        return this.f43712k4.hasNext();
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final AbstractC13018hl next() {
        return this.f43712k4.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.slides.Collections.IEnumerator
    public final void reset() {
        this.f43712k4.reset();
    }
}
