package com.aspose.slides.internal.p508xq;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p505xn.C12571u4;

/* JADX INFO: renamed from: com.aspose.slides.internal.xq.m9 */
/* JADX INFO: loaded from: classes5.dex */
public class C12600m9 implements IGenericEnumerable<C12596h4> {

    /* JADX INFO: renamed from: k4 */
    private final C12571u4<C12596h4> f42147k4 = new C12571u4<>(false);

    @Override // java.lang.Iterable
    public final IGenericEnumerator<C12596h4> iterator() {
        return this.f42147k4.getValues().iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public final C12596h4 m58813k4(String str) {
        C12596h4[] c12596h4Arr = {null};
        this.f42147k4.tryGetValue(str, c12596h4Arr);
        return c12596h4Arr[0];
    }

    /* JADX INFO: renamed from: k4 */
    public final void m58814k4(C12596h4 c12596h4) {
        this.f42147k4.addItem(c12596h4.m58800k4(), c12596h4);
    }
}
