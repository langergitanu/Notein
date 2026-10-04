package com.aspose.slides.internal.p118ex;

import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ex.yj */
/* JADX INFO: loaded from: classes.dex */
public final class C3835yj implements IEnumerator {

    /* JADX INFO: renamed from: k4 */
    private IEnumerator f10447k4;

    public C3835yj(IEnumerable iEnumerable) {
        this.f10447k4 = iEnumerable.iterator();
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public boolean hasNext() {
        return this.f10447k4.hasNext();
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C3816fa next() {
        return (C3816fa) this.f10447k4.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.slides.Collections.IEnumerator
    public void reset() {
        this.f10447k4.reset();
    }
}
