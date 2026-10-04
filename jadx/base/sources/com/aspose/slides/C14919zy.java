package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;

/* JADX INFO: renamed from: com.aspose.slides.zy */
/* JADX INFO: loaded from: classes3.dex */
final class C14919zy implements IGenericEnumerable<C14815xr> {

    /* JADX INFO: renamed from: k4 */
    private final List<C14815xr> f50767k4;

    public C14919zy() {
        this.f50767k4 = new List<>();
    }

    @Override // java.lang.Iterable
    public final IGenericEnumerator<C14815xr> iterator() {
        return this.f50767k4.iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m74881k4() {
        return this.f50767k4.size();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m74885x1() {
        this.f50767k4.clear();
    }

    public C14919zy(C14919zy c14919zy) {
        this.f50767k4 = new List<>(c14919zy.f50767k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m74882k4(String str) {
        for (int iM74881k4 = m74881k4() - 1; iM74881k4 >= 0; iM74881k4--) {
            C14815xr c14815xrM74883k4 = m74883k4(iM74881k4);
            if (c14815xrM74883k4.m73569k4(str)) {
                return c14815xrM74883k4.m73568k4();
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m74886x1(String str, int i) {
        try {
            this.f50767k4.addItem(new C14815xr(str, true, i));
        } catch (ArgumentException e) {
            throw new PptException("Can't create Regex-based FontHandlingRule", e);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C14815xr m74883k4(int i) {
        return this.f50767k4.get_Item(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74884k4(String str, int i) {
        this.f50767k4.addItem(new C14815xr(str, false, i));
    }
}
