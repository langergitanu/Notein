package com.aspose.slides.Collections.Specialized;

import com.aspose.slides.Collections.DictionaryEntry;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IDictionary;
import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class ListDictionary implements ICollection, IDictionary, IEnumerable {

    /* JADX INFO: renamed from: k4 */
    private int f1871k4;

    /* JADX INFO: renamed from: kk */
    private DictionaryNode f1872kk;

    /* JADX INFO: renamed from: to */
    private Comparator f1873to;

    /* JADX INFO: renamed from: x1 */
    private int f1874x1;

    public static class DictionaryNode {

        /* JADX INFO: renamed from: k4 */
        public Object f1875k4;

        /* JADX INFO: renamed from: kk */
        public DictionaryNode f1876kk;

        /* JADX INFO: renamed from: x1 */
        public Object f1877x1;

        public DictionaryNode(Object obj, Object obj2, DictionaryNode dictionaryNode) {
            this.f1875k4 = obj;
            this.f1877x1 = obj2;
            this.f1876kk = dictionaryNode;
        }
    }

    public static class DictionaryNodeCollection implements ICollection {

        /* JADX INFO: renamed from: k4 */
        private ListDictionary f1878k4;

        /* JADX INFO: renamed from: x1 */
        private boolean f1879x1;

        public static class DictionaryNodeCollectionEnumerator implements IEnumerator {

            /* JADX INFO: renamed from: k4 */
            private IDictionaryEnumerator f1880k4;

            /* JADX INFO: renamed from: x1 */
            private boolean f1881x1;

            public DictionaryNodeCollectionEnumerator(IDictionaryEnumerator iDictionaryEnumerator, boolean z) {
                this.f1880k4 = iDictionaryEnumerator;
                this.f1881x1 = z;
            }

            @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
            public boolean hasNext() {
                return this.f1880k4.hasNext();
            }

            @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
            public Object next() {
                return this.f1881x1 ? this.f1880k4.getKey() : this.f1880k4.getValue();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new NotSupportedException();
            }

            @Override // com.aspose.slides.Collections.IEnumerator
            public void reset() {
                this.f1880k4.reset();
            }
        }

        public DictionaryNodeCollection(ListDictionary listDictionary, boolean z) {
            this.f1878k4 = listDictionary;
            this.f1879x1 = z;
        }

        @Override // com.aspose.slides.Collections.ICollection
        public void copyTo(AbstractC14092to abstractC14092to, int i) {
            if (abstractC14092to == null) {
                throw new ArgumentNullException("array", "Array cannot be null.");
            }
            if (i < 0) {
                throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX, "index is less than 0");
            }
            if (i > abstractC14092to.m67265du()) {
                throw new IndexOutOfRangeException("index is too large");
            }
            if (size() > abstractC14092to.m67265du() - i) {
                throw new ArgumentException("Not enough room in the array");
            }
            IEnumerator it = iterator();
            while (it.hasNext()) {
                abstractC14092to.m67276kk(it.next(), i);
                i++;
            }
        }

        @Override // com.aspose.slides.Collections.ICollection
        public Object getSyncRoot() {
            return this.f1878k4.getSyncRoot();
        }

        @Override // com.aspose.slides.Collections.ICollection
        public boolean isSynchronized() {
            return false;
        }

        @Override // java.lang.Iterable
        public IEnumerator iterator() {
            return new DictionaryNodeCollectionEnumerator(this.f1878k4.iterator(), this.f1879x1);
        }

        @Override // com.aspose.slides.Collections.ICollection
        public int size() {
            return this.f1878k4.size();
        }
    }

    public static class DictionaryNodeEnumerator implements IDictionaryEnumerator, IEnumerator {

        /* JADX INFO: renamed from: k4 */
        private ListDictionary f1882k4;

        /* JADX INFO: renamed from: kk */
        private DictionaryNode f1883kk;

        /* JADX INFO: renamed from: to */
        private int f1884to;

        /* JADX INFO: renamed from: x1 */
        private boolean f1885x1;

        public DictionaryNodeEnumerator(ListDictionary listDictionary) {
            this.f1882k4 = listDictionary;
            this.f1884to = listDictionary.f1874x1;
            reset();
        }

        /* JADX INFO: renamed from: k4 */
        private void m1037k4() {
            if (this.f1884to != this.f1882k4.f1874x1) {
                throw new InvalidOperationException("The ListDictionary's contents changed after this enumerator was instantiated.");
            }
        }

        /* JADX INFO: renamed from: x1 */
        private DictionaryNode m1038x1() {
            m1037k4();
            DictionaryNode dictionaryNode = this.f1883kk;
            if (dictionaryNode != null) {
                return dictionaryNode;
            }
            throw new InvalidOperationException("Enumerator is positioned before the collection's first element or after the last element.");
        }

        @Override // com.aspose.slides.Collections.IDictionaryEnumerator
        public DictionaryEntry getEntry() {
            return new DictionaryEntry(m1038x1().f1875k4, this.f1883kk.f1877x1);
        }

        @Override // com.aspose.slides.Collections.IDictionaryEnumerator
        public Object getKey() {
            return m1038x1().f1875k4;
        }

        @Override // com.aspose.slides.Collections.IDictionaryEnumerator
        public Object getValue() {
            return m1038x1().f1877x1;
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public boolean hasNext() {
            m1037k4();
            DictionaryNode dictionaryNode = this.f1883kk;
            if (dictionaryNode == null && !this.f1885x1) {
                return false;
            }
            DictionaryNode dictionaryNode2 = this.f1885x1 ? this.f1882k4.f1872kk : dictionaryNode.f1876kk;
            this.f1883kk = dictionaryNode2;
            this.f1885x1 = false;
            return dictionaryNode2 != null;
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public Object next() {
            return getEntry();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new NotSupportedException();
        }

        @Override // com.aspose.slides.Collections.IEnumerator
        public void reset() {
            m1037k4();
            this.f1885x1 = true;
            this.f1883kk = null;
        }
    }

    public ListDictionary() {
        this.f1871k4 = 0;
        this.f1874x1 = 0;
        this.f1873to = null;
        this.f1872kk = null;
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public void addItem(Object obj, Object obj2) {
        DictionaryNode[] dictionaryNodeArr = {null};
        DictionaryNode dictionaryNodeM1034k4 = m1034k4(obj, dictionaryNodeArr);
        DictionaryNode dictionaryNode = dictionaryNodeArr[0];
        if (dictionaryNodeM1034k4 != null) {
            throw new ArgumentException("key", "Duplicate key in add.");
        }
        m1035k4(obj, obj2, dictionaryNode);
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public void clear() {
        this.f1872kk = null;
        this.f1871k4 = 0;
        this.f1874x1++;
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public boolean contains(Object obj) {
        return m1033k4(obj) != null;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public void copyTo(AbstractC14092to abstractC14092to, int i) {
        if (abstractC14092to == null) {
            throw new ArgumentNullException("array", "Array cannot be null.");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX, "index is less than 0");
        }
        if (i > abstractC14092to.m67265du()) {
            throw new IndexOutOfRangeException("index is too large");
        }
        if (size() > abstractC14092to.m67265du() - i) {
            throw new ArgumentException("Not enough room in the array");
        }
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            abstractC14092to.m67276kk(((DictionaryEntry) it.next()).Clone(), i);
            i++;
        }
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public ICollection getKeys() {
        return new DictionaryNodeCollection(this, true);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public Object getSyncRoot() {
        return this;
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public ICollection getValues() {
        return new DictionaryNodeCollection(this, false);
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public Object get_Item(Object obj) {
        DictionaryNode dictionaryNodeM1033k4 = m1033k4(obj);
        if (dictionaryNodeM1033k4 == null) {
            return null;
        }
        return dictionaryNodeM1033k4.f1877x1;
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
        return false;
    }

    @Override // java.lang.Iterable
    public IDictionaryEnumerator iterator() {
        return new DictionaryNodeEnumerator(this);
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public void removeItem(Object obj) {
        DictionaryNode[] dictionaryNodeArr = {null};
        DictionaryNode dictionaryNodeM1034k4 = m1034k4(obj, dictionaryNodeArr);
        DictionaryNode dictionaryNode = dictionaryNodeArr[0];
        if (dictionaryNodeM1034k4 == null) {
            return;
        }
        if (dictionaryNode == null) {
            this.f1872kk = dictionaryNodeM1034k4.f1876kk;
        } else {
            dictionaryNode.f1876kk = dictionaryNodeM1034k4.f1876kk;
        }
        dictionaryNodeM1034k4.f1877x1 = null;
        this.f1871k4--;
        this.f1874x1++;
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public void set_Item(Object obj, Object obj2) {
        DictionaryNode[] dictionaryNodeArr = {null};
        DictionaryNode dictionaryNodeM1034k4 = m1034k4(obj, dictionaryNodeArr);
        DictionaryNode dictionaryNode = dictionaryNodeArr[0];
        if (dictionaryNodeM1034k4 != null) {
            dictionaryNodeM1034k4.f1877x1 = obj2;
        } else {
            m1035k4(obj, obj2, dictionaryNode);
        }
    }

    @Override // com.aspose.slides.Collections.ICollection
    public int size() {
        return this.f1871k4;
    }

    public ListDictionary(Comparator comparator) {
        this();
        this.f1873to = comparator;
    }

    /* JADX INFO: renamed from: k4 */
    private DictionaryNode m1033k4(Object obj) {
        if (obj == null) {
            throw new ArgumentNullException("key", "Attempted lookup for a null key.");
        }
        DictionaryNode dictionaryNode = this.f1872kk;
        if (this.f1873to == null) {
            while (dictionaryNode != null && !obj.equals(dictionaryNode.f1875k4)) {
                dictionaryNode = dictionaryNode.f1876kk;
            }
            return dictionaryNode;
        }
        while (dictionaryNode != null && this.f1873to.compare(obj, dictionaryNode.f1875k4) != 0) {
            dictionaryNode = dictionaryNode.f1876kk;
        }
        return dictionaryNode;
    }

    /* JADX INFO: renamed from: k4 */
    private DictionaryNode m1034k4(Object obj, DictionaryNode[] dictionaryNodeArr) {
        if (obj == null) {
            throw new ArgumentNullException("key", "Attempted lookup for a null key.");
        }
        DictionaryNode dictionaryNode = this.f1872kk;
        dictionaryNodeArr[0] = null;
        if (this.f1873to == null) {
            while (dictionaryNode != null && !obj.equals(dictionaryNode.f1875k4)) {
                dictionaryNodeArr[0] = dictionaryNode;
                dictionaryNode = dictionaryNode.f1876kk;
            }
            return dictionaryNode;
        }
        while (dictionaryNode != null && this.f1873to.compare(obj, dictionaryNode.f1875k4) != 0) {
            dictionaryNodeArr[0] = dictionaryNode;
            dictionaryNode = dictionaryNode.f1876kk;
        }
        return dictionaryNode;
    }

    /* JADX INFO: renamed from: k4 */
    private void m1035k4(Object obj, Object obj2, DictionaryNode dictionaryNode) {
        if (dictionaryNode == null) {
            this.f1872kk = new DictionaryNode(obj, obj2, this.f1872kk);
        } else {
            dictionaryNode.f1876kk = new DictionaryNode(obj, obj2, dictionaryNode.f1876kk);
        }
        this.f1871k4++;
        this.f1874x1++;
    }
}
