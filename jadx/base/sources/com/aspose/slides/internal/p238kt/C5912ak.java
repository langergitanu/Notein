package com.aspose.slides.internal.p238kt;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.IList;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.kt.ak */
/* JADX INFO: loaded from: classes.dex */
public final class C5912ak implements IList {

    /* JADX INFO: renamed from: k4 */
    private ArrayList f16730k4 = new ArrayList();

    @Override // com.aspose.slides.Collections.IList
    public final int addItem(Object obj) {
        if (C7019kk.m27469x1(obj, C5974wy.class)) {
            return this.f16730k4.addItem(obj);
        }
        throw new ArgumentException("Type of input object is invalid.", "value");
    }

    @Override // com.aspose.slides.Collections.IList, java.util.List, java.util.Collection
    public final void clear() {
        this.f16730k4.clear();
    }

    @Override // com.aspose.slides.Collections.IList, java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (C7019kk.m27469x1(obj, C5974wy.class)) {
            return this.f16730k4.contains(obj);
        }
        throw new ArgumentException("Type of input object is invalid.", "value");
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f16730k4.copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final Object getSyncRoot() {
        return this.f16730k4.getSyncRoot();
    }

    @Override // com.aspose.slides.Collections.IList
    public final Object get_Item(int i) {
        return this.f16730k4.get_Item(i);
    }

    @Override // com.aspose.slides.Collections.IList, java.util.List
    public final int indexOf(Object obj) {
        if (C7019kk.m27469x1(obj, C5974wy.class)) {
            return this.f16730k4.indexOf(obj);
        }
        throw new ArgumentException("Type of input object is invalid.", "value");
    }

    @Override // com.aspose.slides.Collections.IList
    public final void insertItem(int i, Object obj) {
        if (!C7019kk.m27469x1(obj, C5974wy.class)) {
            throw new ArgumentException("Type of input object is invalid.", "value");
        }
        this.f16730k4.insertItem(i, obj);
    }

    @Override // com.aspose.slides.Collections.IList
    public final boolean isFixedSize() {
        return this.f16730k4.isFixedSize();
    }

    @Override // com.aspose.slides.Collections.IList
    public final boolean isReadOnly() {
        return this.f16730k4.isReadOnly();
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final boolean isSynchronized() {
        return this.f16730k4.isSynchronized();
    }

    @Override // java.lang.Iterable
    public final IEnumerator iterator() {
        return this.f16730k4.iterator();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m23880k4(C5974wy c5974wy) {
        return this.f16730k4.addItem(c5974wy);
    }

    @Override // com.aspose.slides.Collections.IList
    public final void removeAt(int i) {
        this.f16730k4.removeAt(i);
    }

    @Override // com.aspose.slides.Collections.IList
    public final void removeItem(Object obj) {
        if (!C7019kk.m27469x1(obj, C5974wy.class)) {
            throw new ArgumentException("Type of input object is invalid.", "value");
        }
        this.f16730k4.removeItem(obj);
    }

    @Override // com.aspose.slides.Collections.IList
    public final void set_Item(int i, Object obj) {
        if (!C7019kk.m27469x1(obj, C5974wy.class)) {
            throw new ArgumentException("Type of input object is invalid.", "value");
        }
        this.f16730k4.set_Item(i, obj);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public final int size() {
        return this.f16730k4.size();
    }

    /* JADX INFO: renamed from: k4 */
    public final C5974wy m23881k4(int i) {
        return (C5974wy) this.f16730k4.get_Item(i);
    }
}
