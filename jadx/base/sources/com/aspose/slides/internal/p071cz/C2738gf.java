package com.aspose.slides.internal.p071cz;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.gf */
/* JADX INFO: loaded from: classes3.dex */
final class C2738gf implements IGenericEnumerable<C2977y9> {

    /* JADX INFO: renamed from: k4 */
    private final List<C2977y9> f8599k4 = new List<>();

    @Override // java.lang.Iterable
    public IGenericEnumerator<C2977y9> iterator() {
        return this.f8599k4.iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public int m12284k4() {
        return this.f8599k4.size();
    }

    /* JADX INFO: renamed from: x1 */
    public C2977y9[] m12286x1() {
        return this.f8599k4.toArray(new C2977y9[0]);
    }

    /* JADX INFO: renamed from: k4 */
    public void m12285k4(C2977y9 c2977y9) {
        this.f8599k4.addItem(c2977y9);
    }
}
