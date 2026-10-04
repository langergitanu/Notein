package com.aspose.slides.internal.p118ex;

import com.aspose.slides.Collections.IEnumerator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ex.c5 */
/* JADX INFO: loaded from: classes.dex */
public final class C3812c5 implements IEnumerator {

    /* JADX INFO: renamed from: k4 */
    private IEnumerator f10369k4;

    public C3812c5(C3815dy c3815dy) {
        this.f10369k4 = c3815dy.m15294k4().iterator();
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public boolean hasNext() {
        return this.f10369k4.hasNext();
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C3823m9 next() {
        return (C3823m9) this.f10369k4.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.slides.Collections.IEnumerator
    public void reset() {
        this.f10369k4.reset();
    }
}
