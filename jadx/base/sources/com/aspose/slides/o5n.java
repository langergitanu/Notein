package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: loaded from: classes3.dex */
class o5n implements IGenericEnumerable<wsu> {

    /* JADX INFO: renamed from: k4 */
    private List<wsu> f47673k4 = new List<>();

    @Override // java.lang.Iterable
    public IGenericEnumerator<wsu> iterator() {
        return this.f47673k4.iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public int m68339k4() {
        return this.f47673k4.size();
    }

    /* JADX INFO: renamed from: x1 */
    public final int m68341x1(wsu wsuVar) {
        return this.f47673k4.indexOf(wsuVar);
    }

    /* JADX INFO: renamed from: k4 */
    public void m68340k4(wsu wsuVar) {
        this.f47673k4.addItem(wsuVar);
    }

    /* JADX INFO: renamed from: x1 */
    public void m68342x1() {
        this.f47673k4.clear();
    }
}
