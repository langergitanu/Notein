package com.aspose.slides.internal.p077d8;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.p559ms.System.AbstractC14085qw;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.he */
/* JADX INFO: loaded from: classes3.dex */
public class C3057he<T> implements IGenericEnumerator<T> {

    /* JADX INFO: renamed from: k4 */
    private final IGenericEnumerator<T> f9083k4;

    /* JADX INFO: renamed from: kk */
    private final Object f9084kk;

    /* JADX INFO: renamed from: x1 */
    private final k4 f9085x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.d8.he$k4 */
    public static abstract class k4 extends AbstractC14085qw {
        /* JADX INFO: renamed from: k4 */
        public abstract boolean mo490k4(Object obj, Object obj2);
    }

    public C3057he(IGenericEnumerator<T> iGenericEnumerator, k4 k4Var, Object obj) {
        this.f9083k4 = iGenericEnumerator;
        this.f9085x1 = k4Var;
        this.f9084kk = obj;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public final boolean hasNext() {
        while (this.f9083k4.hasNext()) {
            if (this.f9085x1.mo490k4(this.f9083k4.next(), this.f9084kk)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public final T next() {
        return this.f9083k4.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.slides.Collections.IEnumerator
    public final void reset() {
        this.f9083k4.reset();
    }
}
