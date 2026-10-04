package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.Collections.IEnumerator;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.j6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13045j6 implements IEnumerator {

    /* JADX INFO: renamed from: k4 */
    private IDictionaryEnumerator f43882k4;

    public C13045j6(Hashtable hashtable) {
        this.f43882k4 = hashtable.iterator();
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public final boolean hasNext() {
        return this.f43882k4.hasNext();
    }

    /* JADX INFO: renamed from: k4 */
    public final C13204sl m60994k4() {
        return (C13204sl) this.f43882k4.getValue();
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public final Object next() {
        C13204sl c13204sl = (C13204sl) this.f43882k4.getValue();
        if (c13204sl != null) {
            return c13204sl.m61468x1();
        }
        return null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.slides.Collections.IEnumerator
    public final void reset() {
        this.f43882k4.reset();
    }
}
