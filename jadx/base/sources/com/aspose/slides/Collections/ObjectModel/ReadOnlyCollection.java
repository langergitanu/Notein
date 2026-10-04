package com.aspose.slides.Collections.ObjectModel;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotSupportedException;

/* JADX INFO: loaded from: classes3.dex */
public class ReadOnlyCollection<T> implements IGenericList<T> {

    /* JADX INFO: renamed from: k4 */
    private IGenericList<T> f1822k4;

    public ReadOnlyCollection(IGenericList<T> iGenericList) {
        if (iGenericList == null) {
            throw new ArgumentNullException("list");
        }
        this.f1822k4 = iGenericList;
    }

    public int add(Object obj) {
        throw new NotSupportedException();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public void addItem(T t) {
        throw new NotSupportedException();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public void clear() {
        throw new NotSupportedException();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public boolean containsItem(T t) {
        return this.f1822k4.containsItem(t);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public void copyToTArray(T[] tArr, int i) {
        this.f1822k4.copyToTArray(tArr, i);
    }

    public IGenericList<T> getItems() {
        return this.f1822k4;
    }

    public Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    public T get_Item(int i) {
        return this.f1822k4.get_Item(i);
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    public int indexOfItem(T t) {
        return this.f1822k4.indexOfItem(t);
    }

    public void insert(int i, Object obj) {
        throw new NotSupportedException();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    public void insertItem(int i, T t) {
        throw new NotSupportedException();
    }

    public boolean isFixedSize() {
        return true;
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public boolean isReadOnly() {
        return true;
    }

    public boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public IGenericEnumerator<T> iterator() {
        return this.f1822k4.iterator();
    }

    public void remove(Object obj) {
        throw new NotSupportedException();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    public void removeAt(int i) {
        throw new NotSupportedException();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public boolean removeItem(T t) {
        throw new NotSupportedException();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericList
    public void set_Item(int i, T t) {
        throw new NotSupportedException();
    }

    @Override // com.aspose.slides.Collections.Generic.IGenericCollection
    public int size() {
        return this.f1822k4.size();
    }
}
