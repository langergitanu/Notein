package com.aspose.slides.internal.p172hu;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;

/* JADX INFO: renamed from: com.aspose.slides.internal.hu.x1 */
/* JADX INFO: loaded from: classes.dex */
public class C4688x1<TIn, TOut> implements IGenericEnumerator<TOut> {

    /* JADX INFO: renamed from: k4 */
    public final IGenericEnumerator<TIn> f13089k4;

    /* JADX INFO: renamed from: x1 */
    private final AbstractC4687to<TIn, TOut> f13090x1;

    public C4688x1(IGenericEnumerator<TIn> iGenericEnumerator, AbstractC4687to<TIn, TOut> abstractC4687to) {
        if (iGenericEnumerator == null) {
            throw new ArgumentNullException("enumerator");
        }
        this.f13089k4 = iGenericEnumerator;
        this.f13090x1 = abstractC4687to;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        this.f13089k4.dispose();
    }

    @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public final boolean hasNext() {
        return this.f13089k4.hasNext();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericEnumerator, com.aspose.slides.Collections.IEnumerator, java.util.Iterator
    public final TOut next() {
        AbstractC4687to<TIn, TOut> abstractC4687to = this.f13090x1;
        return abstractC4687to != null ? (TOut) abstractC4687to.invoke(this.f13089k4.next()) : this.f13089k4.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // com.aspose.slides.Collections.IEnumerator
    public final void reset() {
        this.f13089k4.reset();
    }
}
