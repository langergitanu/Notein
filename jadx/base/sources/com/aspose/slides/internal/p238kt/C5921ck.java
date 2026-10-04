package com.aspose.slides.internal.p238kt;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.IList;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.Xml.AbstractC13901ga;
import com.aspose.slides.p559ms.System.Xml.AbstractC13911hq;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.ck */
/* JADX INFO: loaded from: classes.dex */
public class C5921ck extends AbstractC13911hq implements IList {

    /* JADX INFO: renamed from: k4 */
    private ArrayList f16747k4 = new ArrayList();

    @Override // com.aspose.slides.Collections.IList
    public final int addItem(Object obj) {
        if (C7019kk.m27469x1(obj, AbstractC13901ga.class)) {
            return this.f16747k4.addItem(obj);
        }
        throw new ArgumentException("Type of input object is invalid.", "node");
    }

    @Override // com.aspose.slides.Collections.IList, java.util.List, java.util.Collection
    public final void clear() {
        this.f16747k4.clear();
    }

    @Override // com.aspose.slides.Collections.IList, java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f16747k4.contains(obj);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f16747k4.copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this.f16747k4.getSyncRoot();
    }

    @Override // com.aspose.slides.Collections.IList
    public final Object get_Item(int i) {
        return this.f16747k4.get_Item(i);
    }

    @Override // com.aspose.slides.Collections.IList, java.util.List
    public final int indexOf(Object obj) {
        return this.f16747k4.indexOf(obj);
    }

    @Override // com.aspose.slides.Collections.IList
    public final void insertItem(int i, Object obj) {
        if (!C7019kk.m27469x1(obj, AbstractC13901ga.class)) {
            throw new ArgumentException("Type of input object is invalid.", "value");
        }
        this.f16747k4.insertItem(i, obj);
    }

    @Override // com.aspose.slides.Collections.IList
    public final boolean isFixedSize() {
        return this.f16747k4.isFixedSize();
    }

    @Override // com.aspose.slides.Collections.IList
    public final boolean isReadOnly() {
        return this.f16747k4.isReadOnly();
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return this.f16747k4.isSynchronized();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13911hq, java.lang.Iterable
    public IEnumerator iterator() {
        return this.f16747k4.iterator();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13911hq
    /* JADX INFO: renamed from: k4 */
    public int mo23932k4() {
        return this.f16747k4.size();
    }

    @Override // com.aspose.slides.Collections.IList
    public final void removeAt(int i) {
        this.f16747k4.removeAt(i);
    }

    @Override // com.aspose.slides.Collections.IList
    public final void removeItem(Object obj) {
        this.f16747k4.removeItem(obj);
    }

    @Override // com.aspose.slides.Collections.IList
    public final void set_Item(int i, Object obj) {
        if (!C7019kk.m27469x1(obj, AbstractC13901ga.class)) {
            throw new ArgumentException("Type of input object is invalid.", "value");
        }
        this.f16747k4.set_Item(i, obj);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public int size() {
        return this.f16747k4.size();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13911hq
    /* JADX INFO: renamed from: k4 */
    public AbstractC13901ga mo23933k4(int i) {
        return (AbstractC13901ga) this.f16747k4.get_Item(i);
    }
}
