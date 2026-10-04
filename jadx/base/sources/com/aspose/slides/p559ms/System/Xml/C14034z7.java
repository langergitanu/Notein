package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.Collections.IEnumerator;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.z7 */
/* JADX INFO: loaded from: classes5.dex */
public class C14034z7 implements IEnumerator {

    /* JADX INFO: renamed from: k4 */
    private C14026yg f47152k4;

    /* JADX INFO: renamed from: x1 */
    private int f47154x1 = -1;

    /* JADX INFO: renamed from: kk */
    private boolean f47153kk = false;

    public C14034z7(C14026yg c14026yg) {
        this.f47152k4 = c14026yg;
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.f47154x1;
        this.f47154x1 = i + 1;
        int iM66351x1 = this.f47152k4.m66351x1(i + 2) - 1;
        int i2 = this.f47154x1;
        if (iM66351x1 < i2) {
            return false;
        }
        boolean z = this.f47152k4.m65457kk(i2) != null;
        this.f47153kk = z;
        return z;
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public final Object next() {
        if (this.f47153kk) {
            return this.f47152k4.m65457kk(this.f47154x1);
        }
        return null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.slides.Collections.IEnumerator
    public final void reset() {
        this.f47154x1 = -1;
    }
}
