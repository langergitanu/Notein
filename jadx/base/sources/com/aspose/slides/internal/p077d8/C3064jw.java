package com.aspose.slides.internal.p077d8;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p077d8.C3057he;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.jw */
/* JADX INFO: loaded from: classes3.dex */
public class C3064jw<T> implements IGenericEnumerator<T> {

    /* JADX INFO: renamed from: du */
    private boolean f9095du = true;

    /* JADX INFO: renamed from: h4 */
    private boolean f9096h4 = false;

    /* JADX INFO: renamed from: k4 */
    private final IGenericEnumerator<T> f9097k4;

    /* JADX INFO: renamed from: kk */
    private final Object f9098kk;

    /* JADX INFO: renamed from: to */
    private T f9099to;

    /* JADX INFO: renamed from: x1 */
    private final C3057he.k4 f9100x1;

    public C3064jw(IGenericEnumerator<T> iGenericEnumerator, C3057he.k4 k4Var, Object obj) {
        this.f9097k4 = iGenericEnumerator;
        this.f9100x1 = k4Var;
        this.f9098kk = obj;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public final boolean hasNext() {
        if (!this.f9095du) {
            return this.f9096h4;
        }
        while (this.f9097k4.hasNext()) {
            T next = this.f9097k4.next();
            this.f9099to = next;
            this.f9095du = false;
            if (this.f9100x1.mo490k4(next, this.f9098kk)) {
                this.f9096h4 = true;
                return true;
            }
        }
        this.f9096h4 = false;
        return false;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public final T next() {
        if (this.f9095du) {
            hasNext();
        }
        this.f9095du = true;
        return this.f9099to;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.slides.Collections.IEnumerator
    public final void reset() {
        this.f9097k4.reset();
        this.f9099to = null;
    }
}
