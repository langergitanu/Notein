package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.InvalidOperationException;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.vt */
/* JADX INFO: loaded from: classes5.dex */
public final class C14002vt implements IEnumerator {

    /* JADX INFO: renamed from: k4 */
    public AbstractC13901ga f47049k4;

    /* JADX INFO: renamed from: kk */
    public boolean f47050kk = true;

    /* JADX INFO: renamed from: x1 */
    public AbstractC13901ga f47051x1;

    public C14002vt(AbstractC13901ga abstractC13901ga) {
        this.f47049k4 = abstractC13901ga;
        this.f47051x1 = abstractC13901ga.getFirstChild();
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public final boolean hasNext() {
        if (this.f47050kk) {
            this.f47051x1 = this.f47049k4.getFirstChild();
            this.f47050kk = false;
        } else {
            AbstractC13901ga abstractC13901ga = this.f47051x1;
            if (abstractC13901ga != null) {
                this.f47051x1 = abstractC13901ga.getNextSibling();
            }
        }
        return this.f47051x1 != null;
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public final Object next() {
        AbstractC13901ga abstractC13901ga;
        if (this.f47050kk || (abstractC13901ga = this.f47051x1) == null) {
            throw new InvalidOperationException(C13968ri.m65818k4("Operation is not valid due to the current state of the object."));
        }
        return abstractC13901ga;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.slides.Collections.IEnumerator
    public final void reset() {
        this.f47050kk = true;
        this.f47051x1 = this.f47049k4.getFirstChild();
    }
}
