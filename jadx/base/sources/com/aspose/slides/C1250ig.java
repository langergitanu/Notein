package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;

/* JADX INFO: renamed from: com.aspose.slides.ig */
/* JADX INFO: loaded from: classes3.dex */
class C1250ig implements IGenericEnumerable<jua> {

    /* JADX INFO: renamed from: k4 */
    public final String f5711k4;

    public C1250ig(String str) {
        this.f5711k4 = str;
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<jua> iterator() {
        return new flm(this.f5711k4);
    }
}
