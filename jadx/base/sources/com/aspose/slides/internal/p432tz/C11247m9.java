package com.aspose.slides.internal.p432tz;

import com.aspose.slides.Collections.IEnumerator;

/* JADX INFO: renamed from: com.aspose.slides.internal.tz.m9 */
/* JADX INFO: loaded from: classes4.dex */
class C11247m9 implements IEnumerator {

    /* JADX INFO: renamed from: k4 */
    final /* synthetic */ C11244h4 f38801k4;

    public C11247m9(C11244h4 c11244h4) {
        this.f38801k4 = c11244h4;
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public boolean hasNext() {
        return this.f38801k4.f38795x1.hasNext();
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public Object next() {
        return this.f38801k4.f38795x1.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f38801k4.f38795x1.remove();
    }

    @Override // com.aspose.slides.Collections.IEnumerator
    public void reset() {
        C11244h4 c11244h4 = this.f38801k4;
        c11244h4.f38795x1 = c11244h4.f38794k4.f38804k4.values().iterator();
    }
}
