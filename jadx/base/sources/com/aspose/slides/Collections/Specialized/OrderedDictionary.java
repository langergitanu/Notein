package com.aspose.slides.Collections.Specialized;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.DictionaryEntry;
import com.aspose.slides.Collections.Generic.IGenericEqualityComparer;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IDictionary;
import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p342pq.C9478du;
import com.aspose.slides.internal.p342pq.C9480kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: loaded from: classes3.dex */
public class OrderedDictionary implements ICollection, IDictionary, IEnumerable, IOrderedDictionary {

    /* JADX INFO: renamed from: du */
    private C9480kk f1902du;

    /* JADX INFO: renamed from: h4 */
    private IGenericEqualityComparer f1903h4;

    /* JADX INFO: renamed from: k4 */
    private ArrayList f1904k4;

    /* JADX INFO: renamed from: kk */
    private boolean f1905kk;

    /* JADX INFO: renamed from: to */
    private int f1906to;

    /* JADX INFO: renamed from: x1 */
    private Hashtable f1907x1;

    public static class OrderedCollection implements ICollection {

        /* JADX INFO: renamed from: k4 */
        private ArrayList f1908k4;

        /* JADX INFO: renamed from: x1 */
        private boolean f1909x1;

        public static class OrderedCollectionEnumerator implements IEnumerator {

            /* JADX INFO: renamed from: k4 */
            private boolean f1910k4;

            /* JADX INFO: renamed from: x1 */
            private IEnumerator f1911x1;

            public OrderedCollectionEnumerator(IEnumerator iEnumerator, boolean z) {
                this.f1911x1 = iEnumerator;
                this.f1910k4 = z;
            }

            @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
            public boolean hasNext() {
                return this.f1911x1.hasNext();
            }

            @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
            public Object next() {
                DictionaryEntry dictionaryEntryClone = ((DictionaryEntry) C7019kk.m27464to(this.f1911x1.next(), DictionaryEntry.class)).Clone();
                return this.f1910k4 ? dictionaryEntryClone.getKey() : dictionaryEntryClone.getValue();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }

            @Override // com.aspose.slides.Collections.IEnumerator
            public void reset() {
                this.f1911x1.reset();
            }
        }

        public OrderedCollection(ArrayList arrayList, boolean z) {
            this.f1908k4 = arrayList;
            this.f1909x1 = z;
        }

        @Override // com.aspose.slides.Collections.ICollection
        public void copyTo(AbstractC14092to abstractC14092to, int i) {
            for (int i2 = 0; i2 < this.f1908k4.size(); i2++) {
                DictionaryEntry dictionaryEntryClone = ((DictionaryEntry) C7019kk.m27464to(this.f1908k4.get_Item(i2), DictionaryEntry.class)).Clone();
                abstractC14092to.m67276kk(this.f1909x1 ? dictionaryEntryClone.getKey() : dictionaryEntryClone.getValue(), i + i2);
            }
        }

        @Override // com.aspose.slides.Collections.ICollection
        public Object getSyncRoot() {
            return this.f1908k4.getSyncRoot();
        }

        @Override // com.aspose.slides.Collections.ICollection
        public boolean isSynchronized() {
            return false;
        }

        @Override // java.lang.Iterable
        public IEnumerator iterator() {
            return new OrderedCollectionEnumerator(this.f1908k4.iterator(), this.f1909x1);
        }

        @Override // com.aspose.slides.Collections.ICollection
        public int size() {
            return this.f1908k4.size();
        }
    }

    public static class OrderedEntryCollectionEnumerator implements IDictionaryEnumerator, IEnumerator {

        /* JADX INFO: renamed from: k4 */
        private IEnumerator f1912k4;

        public OrderedEntryCollectionEnumerator(IEnumerator iEnumerator) {
            this.f1912k4 = iEnumerator;
        }

        @Override // com.aspose.slides.Collections.IDictionaryEnumerator
        public DictionaryEntry getEntry() {
            return (DictionaryEntry) C7019kk.m27464to(this.f1912k4.next(), DictionaryEntry.class);
        }

        @Override // com.aspose.slides.Collections.IDictionaryEnumerator
        public Object getKey() {
            return getEntry().getKey();
        }

        @Override // com.aspose.slides.Collections.IDictionaryEnumerator
        public Object getValue() {
            return getEntry().getValue();
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public boolean hasNext() {
            return this.f1912k4.hasNext();
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public Object next() {
            return this.f1912k4.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // com.aspose.slides.Collections.IEnumerator
        public void reset() {
            this.f1912k4.reset();
        }
    }

    public OrderedDictionary() {
        this.f1904k4 = new ArrayList();
        this.f1907x1 = new Hashtable();
    }

    /* JADX INFO: renamed from: k4 */
    private int m1049k4(Object obj) {
        for (int i = 0; i < this.f1904k4.size(); i++) {
            DictionaryEntry dictionaryEntryClone = ((DictionaryEntry) C7019kk.m27464to(this.f1904k4.get_Item(i), DictionaryEntry.class)).Clone();
            IGenericEqualityComparer iGenericEqualityComparer = this.f1903h4;
            Object key = dictionaryEntryClone.getKey();
            if (iGenericEqualityComparer != null) {
                if (iGenericEqualityComparer.equals(key, obj)) {
                    return i;
                }
            } else {
                if (key.equals(obj)) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public void addItem(Object obj, Object obj2) {
        m1050k4();
        this.f1907x1.addItem(obj, obj2);
        this.f1904k4.addItem(C7019kk.m27451k4(new DictionaryEntry(obj, obj2)));
    }

    public OrderedDictionary asReadOnly() {
        OrderedDictionary orderedDictionary = new OrderedDictionary();
        orderedDictionary.f1904k4 = this.f1904k4;
        orderedDictionary.f1907x1 = this.f1907x1;
        orderedDictionary.f1903h4 = this.f1903h4;
        orderedDictionary.f1905kk = true;
        return orderedDictionary;
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public void clear() {
        m1050k4();
        this.f1907x1.clear();
        this.f1904k4.clear();
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public boolean contains(Object obj) {
        return this.f1907x1.contains(obj);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public void copyTo(AbstractC14092to abstractC14092to, int i) {
        this.f1904k4.copyTo(abstractC14092to, i);
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public ICollection getKeys() {
        return new OrderedCollection(this.f1904k4, true);
    }

    public void getObjectData(C9480kk c9480kk, C9478du c9478du) {
        throw new NotSupportedException();
    }

    @Override // com.aspose.slides.Collections.ICollection
    public Object getSyncRoot() {
        return this.f1904k4.getSyncRoot();
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public ICollection getValues() {
        return new OrderedCollection(this.f1904k4, false);
    }

    @Override // com.aspose.slides.Collections.Specialized.IOrderedDictionary
    public Object get_Item(int i) {
        return ((DictionaryEntry) C7019kk.m27464to(this.f1904k4.get_Item(i), DictionaryEntry.class)).getValue();
    }

    @Override // com.aspose.slides.Collections.Specialized.IOrderedDictionary
    public void insert(int i, Object obj, Object obj2) {
        m1050k4();
        this.f1907x1.addItem(obj, obj2);
        this.f1904k4.insertItem(i, C7019kk.m27451k4(new DictionaryEntry(obj, obj2)));
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public boolean isFixedSize() {
        return false;
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public boolean isReadOnly() {
        return this.f1905kk;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public boolean isSynchronized() {
        return this.f1904k4.isSynchronized();
    }

    @Override // java.lang.Iterable
    public IDictionaryEnumerator iterator() {
        return new OrderedEntryCollectionEnumerator(this.f1904k4.iterator());
    }

    public void onDeserialization(Object obj) {
        throw new NotSupportedException();
    }

    @Override // com.aspose.slides.Collections.Specialized.IOrderedDictionary
    public void removeAt(int i) {
        m1050k4();
        DictionaryEntry dictionaryEntryClone = ((DictionaryEntry) C7019kk.m27464to(this.f1904k4.get_Item(i), DictionaryEntry.class)).Clone();
        this.f1904k4.removeAt(i);
        this.f1907x1.removeItem(dictionaryEntryClone.getKey());
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public void removeItem(Object obj) {
        m1050k4();
        if (this.f1907x1.contains(obj)) {
            this.f1907x1.removeItem(obj);
            this.f1904k4.removeAt(m1049k4(obj));
        }
    }

    @Override // com.aspose.slides.Collections.Specialized.IOrderedDictionary
    public void set_Item(int i, Object obj) {
        m1050k4();
        DictionaryEntry dictionaryEntryClone = ((DictionaryEntry) C7019kk.m27464to(this.f1904k4.get_Item(i), DictionaryEntry.class)).Clone();
        dictionaryEntryClone.setValue(obj);
        this.f1904k4.set_Item(i, C7019kk.m27451k4(dictionaryEntryClone));
        this.f1907x1.set_Item(dictionaryEntryClone.getKey(), obj);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public int size() {
        return this.f1904k4.size();
    }

    public OrderedDictionary(int i) {
        i = i < 0 ? 0 : i;
        this.f1906to = i;
        this.f1904k4 = new ArrayList(i);
        this.f1907x1 = new Hashtable(this.f1906to);
    }

    /* JADX INFO: renamed from: k4 */
    private void m1050k4() {
        if (this.f1905kk) {
            throw new NotSupportedException("Collection is read only");
        }
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public Object get_Item(Object obj) {
        return this.f1907x1.get_Item(obj);
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public void set_Item(Object obj, Object obj2) {
        m1050k4();
        if (this.f1907x1.contains(obj)) {
            this.f1904k4.set_Item(m1049k4(obj), C7019kk.m27451k4(new DictionaryEntry(obj, obj2)));
        } else {
            this.f1904k4.addItem(C7019kk.m27451k4(new DictionaryEntry(obj, obj2)));
        }
        this.f1907x1.set_Item(obj, obj2);
    }

    public OrderedDictionary(int i, IGenericEqualityComparer iGenericEqualityComparer) {
        i = i < 0 ? 0 : i;
        this.f1906to = i;
        this.f1904k4 = new ArrayList(i);
        this.f1907x1 = new Hashtable(this.f1906to, iGenericEqualityComparer);
        this.f1903h4 = iGenericEqualityComparer;
    }

    public OrderedDictionary(IGenericEqualityComparer iGenericEqualityComparer) {
        this.f1904k4 = new ArrayList();
        this.f1907x1 = new Hashtable(iGenericEqualityComparer);
        this.f1903h4 = iGenericEqualityComparer;
    }

    public OrderedDictionary(C9480kk c9480kk, C9478du c9478du) {
        this.f1902du = c9480kk;
    }
}
