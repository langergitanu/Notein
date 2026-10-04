package com.aspose.slides.Collections;

import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ReadOnlyCollectionBase implements ICollection, IEnumerable {

    /* JADX INFO: renamed from: k4 */
    private ArrayList f1833k4 = new ArrayList();

    @Override // com.aspose.slides.Collections.ICollection
    public void copyTo(AbstractC14092to abstractC14092to, int i) {
        synchronized (getInnerList()) {
            getInnerList().copyTo(abstractC14092to, i);
        }
    }

    public ArrayList getInnerList() {
        return this.f1833k4;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public Object getSyncRoot() {
        return getInnerList().getSyncRoot();
    }

    @Override // com.aspose.slides.Collections.ICollection
    public boolean isSynchronized() {
        return getInnerList().isSynchronized();
    }

    @Override // java.lang.Iterable
    public IEnumerator iterator() {
        return getInnerList().iterator();
    }

    @Override // com.aspose.slides.Collections.ICollection
    public int size() {
        return getInnerList().size();
    }
}
