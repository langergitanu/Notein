package com.aspose.slides.Collections.Specialized;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.Collections.CaseInsensitiveComparer;
import com.aspose.slides.Collections.CaseInsensitiveHashCodeProvider;
import com.aspose.slides.Collections.Generic.IGenericEqualityComparer;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.Collections.IHashCodeProvider;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.AbstractC14070jw;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NameObjectCollectionBase implements ICollection, IEnumerable {

    /* JADX INFO: renamed from: c5 */
    private IGenericEqualityComparer f1886c5;

    /* JADX INFO: renamed from: du */
    private Comparator f1887du;

    /* JADX INFO: renamed from: dy */
    private KeysCollection f1888dy;

    /* JADX INFO: renamed from: h4 */
    private int f1889h4;

    /* JADX INFO: renamed from: k4 */
    private Hashtable f1890k4;

    /* JADX INFO: renamed from: kk */
    private ArrayList f1891kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f1892m9;

    /* JADX INFO: renamed from: to */
    private IHashCodeProvider f1893to;

    /* JADX INFO: renamed from: x1 */
    private _Item f1894x1;

    public static class KeysCollection implements ICollection, IEnumerable {

        /* JADX INFO: renamed from: k4 */
        private NameObjectCollectionBase f1895k4;

        public KeysCollection(NameObjectCollectionBase nameObjectCollectionBase) {
            this.f1895k4 = nameObjectCollectionBase;
        }

        @Override // com.aspose.slides.Collections.ICollection
        public void copyTo(AbstractC14092to abstractC14092to, int i) {
            ArrayList arrayList = this.f1895k4.f1891kk;
            if (abstractC14092to == null) {
                NameObjectCollectionBase nameObjectCollectionBase = this.f1895k4;
                if (nameObjectCollectionBase != null && nameObjectCollectionBase.size() > 0) {
                    throw new ArgumentNullException("array");
                }
                return;
            }
            if (i < 0) {
                throw new ArgumentOutOfRangeException("arrayIndex");
            }
            if (abstractC14092to.m67265du() > 0 && i >= abstractC14092to.m67265du()) {
                throw new ArgumentException("arrayIndex is equal to or greater than array.Length");
            }
            if (arrayList.size() + i > abstractC14092to.m67265du()) {
                throw new ArgumentException("Not enough room from arrayIndex to end of array for this KeysCollection");
            }
            if (abstractC14092to.m67277to() > 1) {
                throw new ArgumentException("array is multidimensional");
            }
            Object[] objArr = (Object[]) AbstractC14092to.m67212k4(abstractC14092to);
            int i2 = 0;
            while (i2 < arrayList.size()) {
                objArr[i] = ((_Item) arrayList.get_Item(i2)).f1896k4;
                i2++;
                i++;
            }
        }

        public String get(int i) {
            return this.f1895k4.baseGetKey(i);
        }

        @Override // com.aspose.slides.Collections.ICollection
        public Object getSyncRoot() {
            return this.f1895k4;
        }

        public String get_Item(int i) {
            return get(i);
        }

        @Override // com.aspose.slides.Collections.ICollection
        public boolean isSynchronized() {
            return false;
        }

        @Override // java.lang.Iterable
        public IEnumerator iterator() {
            return new _KeysEnumerator(this.f1895k4);
        }

        @Override // com.aspose.slides.Collections.ICollection
        public int size() {
            return this.f1895k4.size();
        }
    }

    public static class _Item {

        /* JADX INFO: renamed from: k4 */
        public String f1896k4;

        /* JADX INFO: renamed from: x1 */
        public Object f1897x1;

        public _Item(String str, Object obj) {
            this.f1896k4 = str;
            this.f1897x1 = obj;
        }
    }

    public static class _KeysEnumerator implements IEnumerator {

        /* JADX INFO: renamed from: k4 */
        private NameObjectCollectionBase f1898k4;

        /* JADX INFO: renamed from: x1 */
        private int f1899x1;

        public _KeysEnumerator(NameObjectCollectionBase nameObjectCollectionBase) {
            this.f1898k4 = nameObjectCollectionBase;
            reset();
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public boolean hasNext() {
            int i = this.f1899x1 + 1;
            this.f1899x1 = i;
            return i < this.f1898k4.size();
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public Object next() {
            if (this.f1899x1 < this.f1898k4.size() || this.f1899x1 < 0) {
                return this.f1898k4.baseGetKey(this.f1899x1);
            }
            throw new InvalidOperationException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new NotSupportedException();
        }

        @Override // com.aspose.slides.Collections.IEnumerator
        public void reset() {
            this.f1899x1 = -1;
        }
    }

    public NameObjectCollectionBase() {
        this.f1892m9 = false;
        this.f1893to = CaseInsensitiveHashCodeProvider.getDefaultInvariant();
        this.f1887du = CaseInsensitiveComparer.getDefaultInvariant();
        this.f1889h4 = 0;
        m1041to();
    }

    /* JADX INFO: renamed from: to */
    private void m1041to() {
        Hashtable hashtable = this.f1890k4;
        if (hashtable != null) {
            hashtable.clear();
            this.f1890k4 = null;
        }
        ArrayList arrayList = this.f1891kk;
        if (arrayList != null) {
            arrayList.clear();
            this.f1891kk = null;
        }
        this.f1890k4 = this.f1886c5 != null ? new Hashtable(this.f1889h4, this.f1886c5) : new Hashtable(this.f1889h4, this.f1893to, this.f1887du);
        this.f1891kk = new ArrayList();
        this.f1894x1 = null;
    }

    public void baseAdd(String str, Object obj) {
        if (isReadOnly()) {
            throw new NotSupportedException("Collection is read-only");
        }
        _Item _item = new _Item(str, obj);
        if (str == null) {
            if (this.f1894x1 == null) {
                this.f1894x1 = _item;
            }
        } else if (this.f1890k4.get_Item(str) == null) {
            this.f1890k4.addItem(str, _item);
        }
        this.f1891kk.addItem(_item);
    }

    public void baseClear() {
        if (isReadOnly()) {
            throw new NotSupportedException("Collection is read-only");
        }
        m1041to();
    }

    public Object baseGet(int i) {
        return ((_Item) this.f1891kk.get_Item(i)).f1897x1;
    }

    public String[] baseGetAllKeys() {
        int size = this.f1891kk.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = baseGetKey(i);
        }
        return strArr;
    }

    public Object[] baseGetAllValues() {
        int size = this.f1891kk.size();
        Object[] objArr = new Object[size];
        for (int i = 0; i < size; i++) {
            objArr[i] = baseGet(i);
        }
        return objArr;
    }

    public String baseGetKey(int i) {
        return ((_Item) this.f1891kk.get_Item(i)).f1896k4;
    }

    public boolean baseHasKeys() {
        return this.f1890k4.size() > 0;
    }

    public void baseRemove(String str) {
        if (isReadOnly()) {
            throw new NotSupportedException("Collection is read-only");
        }
        if (str != null) {
            this.f1890k4.removeItem(str);
        } else {
            this.f1894x1 = null;
        }
        int size = this.f1891kk.size();
        int i = 0;
        while (i < size) {
            if (m1043k4(baseGetKey(i), str)) {
                this.f1891kk.removeAt(i);
                size--;
            } else {
                i++;
            }
        }
    }

    public void baseRemoveAt(int i) {
        if (isReadOnly()) {
            throw new NotSupportedException("Collection is read-only");
        }
        String strBaseGetKey = baseGetKey(i);
        if (strBaseGetKey != null) {
            this.f1890k4.removeItem(strBaseGetKey);
        } else {
            this.f1894x1 = null;
        }
        this.f1891kk.removeAt(i);
    }

    public void baseSet(int i, Object obj) {
        if (isReadOnly()) {
            throw new NotSupportedException("Collection is read-only");
        }
        ((_Item) this.f1891kk.get_Item(i)).f1897x1 = obj;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public void copyTo(AbstractC14092to abstractC14092to, int i) {
        getKeys().copyTo(abstractC14092to, i);
    }

    public KeysCollection getKeys() {
        if (this.f1888dy == null) {
            this.f1888dy = new KeysCollection(this);
        }
        return this.f1888dy;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public Object getSyncRoot() {
        return this;
    }

    public void isReadOnly(boolean z) {
        this.f1892m9 = z;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public boolean isSynchronized() {
        return false;
    }

    @Override // java.lang.Iterable
    public IEnumerator iterator() {
        return new _KeysEnumerator(this);
    }

    /* JADX INFO: renamed from: kk */
    public IHashCodeProvider m1044kk() {
        return this.f1893to;
    }

    @Override // com.aspose.slides.Collections.ICollection
    public int size() {
        return this.f1891kk.size();
    }

    /* JADX INFO: renamed from: x1 */
    public Comparator m1045x1() {
        return this.f1887du;
    }

    public NameObjectCollectionBase(int i) {
        this.f1892m9 = false;
        this.f1893to = CaseInsensitiveHashCodeProvider.getDefaultInvariant();
        this.f1887du = CaseInsensitiveComparer.getDefaultInvariant();
        this.f1889h4 = i;
        m1041to();
    }

    public Object baseGet(String str) {
        _Item _itemM1040k4 = m1040k4(str);
        if (_itemM1040k4 == null) {
            return null;
        }
        return _itemM1040k4.f1897x1;
    }

    public Object[] baseGetAllValues(AbstractC14068j5 abstractC14068j5) {
        if (abstractC14068j5 == null) {
            throw new ArgumentNullException("'type' argument can't be null");
        }
        int size = this.f1891kk.size();
        Object[] objArr = (Object[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(abstractC14068j5, size));
        for (int i = 0; i < size; i++) {
            objArr[i] = baseGet(i);
        }
        return objArr;
    }

    public void baseSet(String str, Object obj) {
        if (isReadOnly()) {
            throw new NotSupportedException("Collection is read-only");
        }
        _Item _itemM1040k4 = m1040k4(str);
        if (_itemM1040k4 != null) {
            _itemM1040k4.f1897x1 = obj;
        } else {
            baseAdd(str, obj);
        }
    }

    public boolean isReadOnly() {
        return this.f1892m9;
    }

    /* JADX INFO: renamed from: k4 */
    public IGenericEqualityComparer m1042k4() {
        return this.f1886c5;
    }

    public NameObjectCollectionBase(int i, IGenericEqualityComparer iGenericEqualityComparer) {
        this.f1892m9 = false;
        this.f1886c5 = iGenericEqualityComparer == null ? AbstractC14070jw.m66790x1() : iGenericEqualityComparer;
        this.f1889h4 = i;
        m1041to();
    }

    /* JADX INFO: renamed from: k4 */
    private _Item m1040k4(String str) {
        return str != null ? (_Item) this.f1890k4.get_Item(str) : this.f1894x1;
    }

    @Deprecated
    public NameObjectCollectionBase(int i, IHashCodeProvider iHashCodeProvider, Comparator comparator) {
        this.f1892m9 = false;
        this.f1893to = iHashCodeProvider;
        this.f1887du = comparator;
        this.f1889h4 = i;
        m1041to();
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m1043k4(String str, String str2) {
        Comparator comparator = this.f1887du;
        return comparator != null ? comparator.compare(str, str2) == 0 : this.f1886c5.equals(str, str2);
    }

    public NameObjectCollectionBase(IGenericEqualityComparer iGenericEqualityComparer) {
        this(iGenericEqualityComparer == null ? AbstractC14070jw.m66790x1() : iGenericEqualityComparer, (Comparator) null, (IHashCodeProvider) null);
    }

    public NameObjectCollectionBase(IGenericEqualityComparer iGenericEqualityComparer, Comparator comparator, IHashCodeProvider iHashCodeProvider) {
        this.f1886c5 = iGenericEqualityComparer;
        this.f1887du = comparator;
        this.f1893to = iHashCodeProvider;
        this.f1892m9 = false;
        this.f1889h4 = 0;
        m1041to();
    }

    @Deprecated
    public NameObjectCollectionBase(IHashCodeProvider iHashCodeProvider, Comparator comparator) {
        this.f1887du = comparator;
        this.f1893to = iHashCodeProvider;
        this.f1892m9 = false;
        this.f1889h4 = 0;
        m1041to();
    }
}
