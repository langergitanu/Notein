package com.aspose.slides.internal.p172hu;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;

/* JADX INFO: renamed from: com.aspose.slides.internal.hu.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C4684k4<TIn, TOut> implements IGenericEnumerable<TOut> {

    /* JADX INFO: renamed from: k4 */
    public final IGenericEnumerable<TIn> f13083k4;

    /* JADX INFO: renamed from: x1 */
    private final AbstractC4687to<TIn, TOut> f13084x1;

    public C4684k4(IGenericEnumerable<TIn> iGenericEnumerable) {
        if (iGenericEnumerable == null) {
            throw new ArgumentNullException("enumerable");
        }
        this.f13083k4 = iGenericEnumerable;
        this.f13084x1 = null;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<TOut> iterator() {
        return new C4688x1(this.f13083k4.iterator(), this.f13084x1);
    }

    public C4684k4(IGenericEnumerable<TIn> iGenericEnumerable, AbstractC4687to<TIn, TOut> abstractC4687to) {
        if (iGenericEnumerable == null) {
            throw new ArgumentNullException("enumerable");
        }
        this.f13083k4 = iGenericEnumerable;
        this.f13084x1 = abstractC4687to;
    }
}
