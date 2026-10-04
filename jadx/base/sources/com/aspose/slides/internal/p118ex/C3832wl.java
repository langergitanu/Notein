package com.aspose.slides.internal.p118ex;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.IEnumerator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ex.wl */
/* JADX INFO: loaded from: classes.dex */
public final class C3832wl implements IEnumerator {

    /* JADX INFO: renamed from: k4 */
    private IEnumerator f10446k4;

    public C3832wl(ArrayList arrayList) {
        this.f10446k4 = arrayList.iterator();
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public boolean hasNext() {
        return this.f10446k4.hasNext();
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C3828u4 next() {
        return (C3828u4) this.f10446k4.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.slides.Collections.IEnumerator
    public void reset() {
        this.f10446k4.reset();
    }
}
