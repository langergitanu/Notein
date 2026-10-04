package com.aspose.slides.internal.p432tz;

import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.tz.to */
/* JADX INFO: loaded from: classes4.dex */
class C11248to implements ICollection {

    /* JADX INFO: renamed from: k4 */
    final /* synthetic */ C11249x1 f38802k4;

    /* JADX INFO: renamed from: x1 */
    private Iterator f38803x1;

    public C11248to(C11249x1 c11249x1) {
        this.f38802k4 = c11249x1;
        this.f38803x1 = c11249x1.f38804k4.keySet().iterator();
    }

    @Override // com.aspose.slides.Collections.ICollection
    public void copyTo(AbstractC14092to abstractC14092to, int i) {
        Iterator it = this.f38802k4.f38804k4.keySet().iterator();
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
        return new C11243du(this);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public int size() {
        return this.f38802k4.size();
    }
}
