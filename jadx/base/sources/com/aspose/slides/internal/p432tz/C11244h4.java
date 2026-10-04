package com.aspose.slides.internal.p432tz;

import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.tz.h4 */
/* JADX INFO: loaded from: classes4.dex */
class C11244h4 implements ICollection {

    /* JADX INFO: renamed from: k4 */
    final /* synthetic */ C11249x1 f38794k4;

    /* JADX INFO: renamed from: x1 */
    private Iterator f38795x1;

    public C11244h4(C11249x1 c11249x1) {
        this.f38794k4 = c11249x1;
        this.f38795x1 = c11249x1.f38804k4.values().iterator();
    }

    @Override // com.aspose.slides.Collections.ICollection
    public void copyTo(AbstractC14092to abstractC14092to, int i) {
        Iterator it = this.f38794k4.f38804k4.values().iterator();
        while (it.hasNext()) {
            abstractC14092to.m67276kk(it.next(), i);
            i++;
        }
    }

    @Override // com.aspose.slides.Collections.ICollection
    public Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public IEnumerator iterator() {
        return new C11247m9(this);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public int size() {
        return this.f38794k4.size();
    }
}
