package com.aspose.slides.internal.p165he;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;

/* JADX INFO: renamed from: com.aspose.slides.internal.he.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C4522x1<T> implements IGenericEnumerator<T> {

    /* JADX INFO: renamed from: k4 */
    private IGenericList<T> f12600k4;

    /* JADX INFO: renamed from: x1 */
    private int f12601x1;

    public C4522x1(IGenericList<T> iGenericList) {
        this.f12600k4 = iGenericList;
        this.f12601x1 = iGenericList.size();
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        this.f12600k4 = null;
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public final boolean hasNext() {
        int i = this.f12601x1;
        if (i <= 0) {
            return false;
        }
        this.f12601x1 = i - 1;
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m18624k4() {
        return this.f12601x1;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public final T next() {
        return this.f12600k4.get_Item(this.f12601x1);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.slides.Collections.IEnumerator
    public final void reset() {
        this.f12601x1 = this.f12600k4.size();
    }
}
