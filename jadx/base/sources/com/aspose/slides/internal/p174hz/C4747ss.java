package com.aspose.slides.internal.p174hz;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.ss */
/* JADX INFO: loaded from: classes.dex */
public final class C4747ss implements ICollection, IEnumerable {

    /* JADX INFO: renamed from: k4 */
    private ArrayList f13252k4 = new ArrayList();

    /* JADX INFO: renamed from: x1 */
    private boolean f13253x1;

    @Override // com.aspose.slides.Collections.ICollection
    public void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f13252k4.copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public Object getSyncRoot() {
        return this.f13252k4.getSyncRoot();
    }

    @Override // com.aspose.slides.Collections.ICollection
    public boolean isSynchronized() {
        return this.f13252k4.isSynchronized();
    }

    /* JADX INFO: renamed from: k4 */
    public int m19720k4(C4763wp c4763wp) {
        if (this.f13253x1) {
            return 0;
        }
        return this.f13252k4.addItem(c4763wp);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public int size() {
        return this.f13252k4.size();
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C4730kp iterator() {
        return new C4730kp(this);
    }

    /* JADX INFO: renamed from: k4 */
    public C4763wp m19722k4(int i) {
        return (C4763wp) this.f13252k4.get_Item(i);
    }
}
