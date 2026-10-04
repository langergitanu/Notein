package com.aspose.slides.internal.p229ki;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.dc */
/* JADX INFO: loaded from: classes.dex */
public final class C5689dc<T> extends List<T> {
    public C5689dc() {
    }

    /* JADX INFO: renamed from: k4 */
    public final T m23228k4() {
        int size = super.size() - 1;
        T t = (T) super.get_Item(size);
        super.removeAt(size);
        return t;
    }

    /* JADX INFO: renamed from: kk */
    public final C5689dc<T> m23230kk() {
        return new C5689dc<>(this);
    }

    /* JADX INFO: renamed from: x1 */
    public final T m23231x1() {
        return (T) super.get_Item(super.size() - 1);
    }

    private C5689dc(IGenericEnumerable<T> iGenericEnumerable) {
        super(iGenericEnumerable);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m23229k4(T t) {
        super.addItem(t);
    }
}
