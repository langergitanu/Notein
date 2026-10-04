package com.aspose.slides.internal.p071cz;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.bp */
/* JADX INFO: loaded from: classes3.dex */
public class C2671bp implements IGenericEnumerable<C2830n5> {

    /* JADX INFO: renamed from: k4 */
    private final List<C2830n5> f8512k4 = new List<>();

    @Override // java.lang.Iterable
    public IGenericEnumerator<C2830n5> iterator() {
        return this.f8512k4.iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public int m12134k4() {
        return this.f8512k4.size();
    }

    /* JADX INFO: renamed from: x1 */
    public void m12137x1() {
        this.f8512k4.clear();
    }

    /* JADX INFO: renamed from: k4 */
    public C2830n5 m12135k4(int i) {
        return this.f8512k4.get_Item(i);
    }

    /* JADX INFO: renamed from: k4 */
    public void m12136k4(C2830n5 c2830n5) {
        if (c2830n5 == null) {
            throw new ArgumentNullException("value");
        }
        this.f8512k4.addItem(c2830n5);
    }
}
