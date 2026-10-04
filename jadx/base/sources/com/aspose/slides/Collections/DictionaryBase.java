package com.aspose.slides.Collections;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DictionaryBase implements ICollection, IDictionary, IEnumerable {

    /* JADX INFO: renamed from: k4 */
    private Hashtable f1585k4 = new Hashtable();

    /* JADX INFO: renamed from: k4 */
    private void m794k4(AbstractC14092to abstractC14092to, int i) {
        Iterator<T> it = this.f1585k4.iterator();
        while (it.hasNext()) {
            abstractC14092to.m67276kk(((DictionaryEntry) it.next()).Clone(), i);
            i++;
        }
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public void addItem(Object obj, Object obj2) {
        onValidate(obj, obj2);
        onInsert(obj, obj2);
        this.f1585k4.addItem(obj, obj2);
        try {
            onInsertComplete(obj, obj2);
        } catch (RuntimeException e) {
            this.f1585k4.removeItem(obj);
            throw e;
        }
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public void clear() {
        onClear();
        this.f1585k4.clear();
        onClearComplete();
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public boolean contains(Object obj) {
        return this.f1585k4.contains(obj);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public void copyTo(AbstractC14092to abstractC14092to, int i) {
        if (abstractC14092to == null) {
            throw new ArgumentNullException("array");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("index must be possitive");
        }
        if (abstractC14092to.m67277to() > 1) {
            throw new ArgumentException("array is multidimensional");
        }
        int iM67265du = abstractC14092to.m67265du();
        if (i > iM67265du) {
            throw new ArgumentException("index is larger than array size");
        }
        if (size() + i > iM67265du) {
            throw new ArgumentException("Copy will overlflow array");
        }
        m794k4(abstractC14092to, i);
    }

    public IDictionary getDictionary() {
        return this;
    }

    public Hashtable getInnerHashtable() {
        return this.f1585k4;
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public ICollection getKeys() {
        return this.f1585k4.getKeys();
    }

    @Override // com.aspose.slides.Collections.ICollection
    public Object getSyncRoot() {
        return this.f1585k4.getSyncRoot();
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public ICollection getValues() {
        return this.f1585k4.getValues();
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public Object get_Item(Object obj) {
        Object obj2 = this.f1585k4.get_Item(obj);
        onGet(obj, obj2);
        return obj2;
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public boolean isFixedSize() {
        return false;
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public boolean isReadOnly() {
        return false;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public boolean isSynchronized() {
        return this.f1585k4.isSynchronized();
    }

    @Override // java.lang.Iterable
    public IDictionaryEnumerator iterator() {
        return this.f1585k4.iterator();
    }

    public void onClear() {
    }

    public void onClearComplete() {
    }

    public Object onGet(Object obj, Object obj2) {
        return obj2;
    }

    public void onInsert(Object obj, Object obj2) {
    }

    public void onInsertComplete(Object obj, Object obj2) {
    }

    public void onRemove(Object obj, Object obj2) {
    }

    public void onRemoveComplete(Object obj, Object obj2) {
    }

    public void onSet(Object obj, Object obj2, Object obj3) {
    }

    public void onSetComplete(Object obj, Object obj2, Object obj3) {
    }

    public void onValidate(Object obj, Object obj2) {
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public void removeItem(Object obj) {
        if (this.f1585k4.contains(obj)) {
            Object obj2 = this.f1585k4.get_Item(obj);
            onValidate(obj, obj2);
            onRemove(obj, obj2);
            this.f1585k4.removeItem(obj);
            try {
                onRemoveComplete(obj, obj2);
            } catch (RuntimeException e) {
                this.f1585k4.set_Item(obj, obj2);
                throw e;
            }
        }
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public void set_Item(Object obj, Object obj2) {
        onValidate(obj, obj2);
        Object obj3 = this.f1585k4.get_Item(obj);
        onSet(obj, obj3, obj2);
        this.f1585k4.set_Item(obj, obj2);
        try {
            onSetComplete(obj, obj3, obj2);
        } catch (RuntimeException e) {
            this.f1585k4.set_Item(obj, obj3);
            throw e;
        }
    }

    @Override // com.aspose.slides.Collections.ICollection
    public int size() {
        return this.f1585k4.size();
    }
}
