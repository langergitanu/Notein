package com.aspose.slides.internal.p432tz;

import com.aspose.slides.Collections.IEnumerator;

/* JADX INFO: renamed from: com.aspose.slides.internal.tz.du */
/* JADX INFO: loaded from: classes4.dex */
class C11243du implements IEnumerator {

    /* JADX INFO: renamed from: k4 */
    final /* synthetic */ C11248to f38793k4;

    public C11243du(C11248to c11248to) {
        this.f38793k4 = c11248to;
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public boolean hasNext() {
        return this.f38793k4.f38803x1.hasNext();
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public Object next() {
        return this.f38793k4.f38803x1.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f38793k4.f38803x1.remove();
    }

    @Override // com.aspose.slides.Collections.IEnumerator
    public void reset() {
        C11248to c11248to = this.f38793k4;
        c11248to.f38803x1 = c11248to.f38802k4.f38804k4.keySet().iterator();
    }
}
