package com.aspose.slides.Collections;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CollectionBase implements ICollection, IEnumerable, IList {

    /* JADX INFO: renamed from: k4 */
    private ArrayList f1582k4;

    public CollectionBase() {
    }

    @Override // com.aspose.slides.Collections.IList
    public int addItem(Object obj) {
        onValidate(obj);
        int size = getInnerList().size();
        onInsert(size, obj);
        getInnerList().addItem(obj);
        try {
            onInsertComplete(size, obj);
            return size;
        } catch (RuntimeException e) {
            getInnerList().removeAt(size);
            throw e;
        }
    }

    @Override // com.aspose.slides.Collections.IList, java.util.List, java.util.Collection
    public void clear() {
        onClear();
        getInnerList().clear();
        onClearComplete();
    }

    @Override // com.aspose.slides.Collections.IList, java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return getInnerList().contains(obj);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public void copyTo(AbstractC14092to abstractC14092to, int i) {
        getInnerList().copyTo(abstractC14092to, i);
    }

    public int getCapacity() {
        if (this.f1582k4 == null) {
            this.f1582k4 = new ArrayList();
        }
        return this.f1582k4.getCapacity();
    }

    public ArrayList getInnerList() {
        if (this.f1582k4 == null) {
            this.f1582k4 = new ArrayList();
        }
        return this.f1582k4;
    }

    public IList getList() {
        return this;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public Object getSyncRoot() {
        return getInnerList().getSyncRoot();
    }

    @Override // com.aspose.slides.Collections.IList
    public Object get_Item(int i) {
        return getInnerList().get_Item(i);
    }

    @Override // com.aspose.slides.Collections.IList, java.util.List
    public int indexOf(Object obj) {
        return getInnerList().indexOf(obj);
    }

    @Override // com.aspose.slides.Collections.IList
    public void insertItem(int i, Object obj) {
        onValidate(obj);
        onInsert(i, obj);
        getInnerList().insertItem(i, obj);
        try {
            onInsertComplete(i, obj);
        } catch (RuntimeException e) {
            getInnerList().removeAt(i);
            throw e;
        }
    }

    @Override // com.aspose.slides.Collections.IList
    public boolean isFixedSize() {
        return getInnerList().isFixedSize();
    }

    @Override // com.aspose.slides.Collections.IList
    public boolean isReadOnly() {
        return getInnerList().isReadOnly();
    }

    @Override // com.aspose.slides.Collections.ICollection
    public boolean isSynchronized() {
        return getInnerList().isSynchronized();
    }

    @Override // java.lang.Iterable
    public IEnumerator iterator() {
        return getInnerList().iterator();
    }

    public void onClear() {
    }

    public void onClearComplete() {
    }

    public void onInsert(int i, Object obj) {
    }

    public void onInsertComplete(int i, Object obj) {
    }

    public void onRemove(int i, Object obj) {
    }

    public void onRemoveComplete(int i, Object obj) {
    }

    public void onSet(int i, Object obj, Object obj2) {
    }

    public void onSetComplete(int i, Object obj, Object obj2) {
    }

    public void onValidate(Object obj) {
        if (obj == null) {
            throw new ArgumentNullException("CollectionBase.OnValidate: Invalid parameter value passed to method: null");
        }
    }

    @Override // com.aspose.slides.Collections.IList
    public void removeAt(int i) {
        Object obj = getInnerList().get_Item(i);
        onValidate(obj);
        onRemove(i, obj);
        getInnerList().removeAt(i);
        onRemoveComplete(i, obj);
    }

    @Override // com.aspose.slides.Collections.IList
    public void removeItem(Object obj) {
        onValidate(obj);
        int iIndexOf = getInnerList().indexOf(obj);
        if (iIndexOf == -1) {
            throw new ArgumentException("The element cannot be found.", "value");
        }
        onRemove(iIndexOf, obj);
        getInnerList().removeItem(obj);
        onRemoveComplete(iIndexOf, obj);
    }

    public void setCapacity(int i) {
        if (this.f1582k4 == null) {
            this.f1582k4 = new ArrayList();
        }
        this.f1582k4.setCapacity(i);
    }

    @Override // com.aspose.slides.Collections.IList
    public void set_Item(int i, Object obj) {
        if (i < 0 || i >= getInnerList().size()) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX);
        }
        onValidate(obj);
        Object obj2 = getInnerList().get_Item(i);
        onSet(i, obj2, obj);
        getInnerList().set_Item(i, obj);
        try {
            onSetComplete(i, obj2, obj);
        } catch (RuntimeException e) {
            getInnerList().set_Item(i, obj2);
            throw e;
        }
    }

    @Override // com.aspose.slides.Collections.ICollection
    public int size() {
        return getInnerList().size();
    }

    public CollectionBase(int i) {
        this.f1582k4 = new ArrayList(i);
    }
}
