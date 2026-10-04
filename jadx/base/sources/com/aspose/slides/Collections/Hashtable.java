package com.aspose.slides.Collections;

import com.aspose.slides.Collections.Generic.IGenericEqualityComparer;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.exceptions.SerializationException;
import com.aspose.slides.internal.p205ji.C5449c5;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p342pq.C9478du;
import com.aspose.slides.internal.p342pq.C9480kk;
import com.aspose.slides.internal.p342pq.C9481to;
import com.aspose.slides.internal.p432tz.C11245k4;
import com.aspose.slides.internal.p432tz.C11249x1;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14059g8;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class Hashtable implements ICollection, IDictionary, IEnumerable, InterfaceC14059g8, Map {

    /* JADX INFO: renamed from: up */
    private static final C7017h4 f1781up = new C7017h4("LoadFactor", "HashSize", "KeyComparer", "Comparer", "HashCodeProvider", "Keys", "Values");

    /* JADX INFO: renamed from: c5 */
    private C9480kk f1782c5;

    /* JADX INFO: renamed from: ck */
    private ICollection f1783ck;

    /* JADX INFO: renamed from: du */
    private volatile boolean f1784du;

    /* JADX INFO: renamed from: dy */
    private int f1785dy;

    /* JADX INFO: renamed from: fa */
    private volatile int f1786fa;

    /* JADX INFO: renamed from: h4 */
    private ICollection f1787h4;

    /* JADX INFO: renamed from: jd */
    private int f1788jd;

    /* JADX INFO: renamed from: k4 */
    private IGenericEqualityComparer f1789k4;

    /* JADX INFO: renamed from: kk */
    private Bucket[] f1790kk;

    /* JADX INFO: renamed from: m9 */
    private float f1791m9;

    /* JADX INFO: renamed from: to */
    private int f1792to;

    /* JADX INFO: renamed from: x1 */
    private final Object f1793x1;

    public static class Bucket extends AbstractC7020m9<Bucket> {

        /* JADX INFO: renamed from: to */
        static final /* synthetic */ boolean f1794to = true;

        /* JADX INFO: renamed from: k4 */
        public Object f1795k4;

        /* JADX INFO: renamed from: kk */
        public int f1796kk;

        /* JADX INFO: renamed from: x1 */
        public Object f1797x1;

        /* JADX INFO: renamed from: x1 */
        private boolean m994x1(Bucket bucket) {
            return C14067j2.m66728k4(bucket.f1795k4, this.f1795k4) && C14067j2.m66728k4(bucket.f1797x1, this.f1797x1) && bucket.f1796kk == this.f1796kk;
        }

        public Object clone() {
            return Clone();
        }

        public boolean equals(Object obj) {
            if (!f1794to && obj == null) {
                throw new AssertionError();
            }
            if (C14067j2.m66729x1(null, obj)) {
                return false;
            }
            if (C14067j2.m66729x1(this, obj)) {
                return true;
            }
            if (obj instanceof Bucket) {
                return m994x1((Bucket) obj);
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.f1795k4;
            int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
            Object obj2 = this.f1797x1;
            return ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f1796kk;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public Bucket Clone() {
            Bucket bucket = new Bucket();
            CloneTo(bucket);
            return bucket;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public void CloneTo(Bucket bucket) {
            bucket.f1795k4 = this.f1795k4;
            bucket.f1797x1 = this.f1797x1;
            bucket.f1796kk = this.f1796kk;
        }
    }

    public static class CompatibleComparer implements IGenericEqualityComparer {

        /* JADX INFO: renamed from: k4 */
        private Comparator f1798k4;

        /* JADX INFO: renamed from: x1 */
        private IHashCodeProvider f1799x1;

        public CompatibleComparer(Comparator comparator, IHashCodeProvider iHashCodeProvider) {
            this.f1798k4 = comparator;
            this.f1799x1 = iHashCodeProvider;
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericEqualityComparer
        public boolean equals(Object obj, Object obj2) {
            return equalsT(obj, obj2);
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericEqualityComparer
        public boolean equalsT(Object obj, Object obj2) {
            return m997k4(obj, obj2) == 0;
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericEqualityComparer
        public int hashCode(Object obj) {
            return hashCodeT(obj);
        }

        @Override // com.aspose.slides.Collections.Generic.IGenericEqualityComparer
        public int hashCodeT(Object obj) {
            if (obj == null) {
                throw new ArgumentNullException("obj");
            }
            IHashCodeProvider iHashCodeProvider = this.f1799x1;
            return iHashCodeProvider != null ? iHashCodeProvider.hashCode(obj) : obj.hashCode();
        }

        /* JADX INFO: renamed from: k4 */
        public int m997k4(Object obj, Object obj2) {
            if (obj == obj2) {
                return 0;
            }
            if (obj == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            Comparator comparator = this.f1798k4;
            if (comparator != null) {
                return comparator.compare(obj, obj2);
            }
            Comparable comparable = (Comparable) C7019kk.m27452k4(obj, Comparable.class);
            if (comparable != null) {
                return comparable.compareTo(obj2);
            }
            throw new ArgumentException("At least one object must implement java.lang.Comparable");
        }

        /* JADX INFO: renamed from: x1 */
        public IHashCodeProvider m999x1() {
            return this.f1799x1;
        }

        /* JADX INFO: renamed from: k4 */
        public Comparator m998k4() {
            return this.f1798k4;
        }
    }

    public static class HashtableDebugView {
    }

    public static class HashtableEnumerator implements IDictionaryEnumerator, IEnumerator {

        /* JADX INFO: renamed from: du */
        private int f1800du;

        /* JADX INFO: renamed from: h4 */
        private Hashtable f1801h4;

        /* JADX INFO: renamed from: k4 */
        private int f1802k4;

        /* JADX INFO: renamed from: kk */
        private Object f1803kk;

        /* JADX INFO: renamed from: m9 */
        private int f1804m9;

        /* JADX INFO: renamed from: to */
        private Object f1805to;

        /* JADX INFO: renamed from: x1 */
        private boolean f1806x1 = false;

        public HashtableEnumerator(Hashtable hashtable, int i) {
            this.f1801h4 = hashtable;
            this.f1802k4 = hashtable.f1790kk.length;
            this.f1804m9 = hashtable.f1786fa;
            this.f1800du = i;
        }

        @Override // com.aspose.slides.Collections.IDictionaryEnumerator
        public DictionaryEntry getEntry() {
            if (this.f1806x1) {
                return new DictionaryEntry(this.f1803kk, this.f1805to);
            }
            throw new InvalidOperationException("Enumeration has either not started or has already finished");
        }

        @Override // com.aspose.slides.Collections.IDictionaryEnumerator
        public Object getKey() {
            if (this.f1806x1) {
                return this.f1803kk;
            }
            throw new InvalidOperationException("Enumeration has not started. Call HasNext");
        }

        @Override // com.aspose.slides.Collections.IDictionaryEnumerator
        public Object getValue() {
            if (this.f1806x1) {
                return this.f1805to;
            }
            throw new InvalidOperationException("Enumeration has either not started or has already finished");
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public boolean hasNext() {
            boolean z;
            if (this.f1804m9 != this.f1801h4.f1786fa) {
                throw new InvalidOperationException("Collection was modified; enumeration operation may not execute");
            }
            while (true) {
                int i = this.f1802k4;
                if (i <= 0) {
                    z = false;
                    break;
                }
                this.f1802k4 = i - 1;
                Object obj = this.f1801h4.f1790kk[this.f1802k4].f1795k4;
                if (obj != null && obj != this.f1801h4.f1790kk) {
                    this.f1803kk = obj;
                    this.f1805to = this.f1801h4.f1790kk[this.f1802k4].f1797x1;
                    z = true;
                    break;
                }
            }
            this.f1806x1 = z;
            return z;
        }

        @Override // com.aspose.slides.Collections.IEnumerator, java.util.Iterator
        public Object next() {
            if (!this.f1806x1) {
                throw new InvalidOperationException("Enumeration has either not started or has already finished");
            }
            int i = this.f1800du;
            return i == 1 ? this.f1803kk : i == 2 ? this.f1805to : new DictionaryEntry(this.f1803kk, this.f1805to);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new NotSupportedException();
        }

        @Override // com.aspose.slides.Collections.IEnumerator
        public void reset() {
            if (this.f1804m9 != this.f1801h4.f1786fa) {
                throw new InvalidOperationException("Collection was modified; enumeration operation may not execute");
            }
            this.f1806x1 = false;
            this.f1802k4 = this.f1801h4.f1790kk.length;
            this.f1803kk = null;
            this.f1805to = null;
        }
    }

    public static class KeyCollection implements ICollection, IEnumerable {

        /* JADX INFO: renamed from: k4 */
        private Hashtable f1807k4;

        public KeyCollection(Hashtable hashtable) {
            this.f1807k4 = hashtable;
        }

        @Override // com.aspose.slides.Collections.ICollection
        public void copyTo(AbstractC14092to abstractC14092to, int i) {
            if (abstractC14092to == null) {
                throw new ArgumentNullException("array", "Array cannot be null");
            }
            if (abstractC14092to.m67277to() != 1) {
                throw new ArgumentException("Only single dimensional arrays are supported for the requested action");
            }
            if (i < 0) {
                throw new ArgumentOutOfRangeException("arrayIndex", "Non-negative number required");
            }
            if (abstractC14092to.m67265du() - i < this.f1807k4.size()) {
                throw new ArgumentException("Destination array is not long enough to copy all the items in the collection. Check array index and length");
            }
            this.f1807k4.m991k4(abstractC14092to, i);
        }

        @Override // com.aspose.slides.Collections.ICollection
        public Object getSyncRoot() {
            return this.f1807k4.getSyncRoot();
        }

        @Override // com.aspose.slides.Collections.ICollection
        public boolean isSynchronized() {
            return this.f1807k4.isSynchronized();
        }

        @Override // java.lang.Iterable
        public IEnumerator iterator() {
            return new HashtableEnumerator(this.f1807k4, 1);
        }

        @Override // com.aspose.slides.Collections.ICollection
        public int size() {
            return this.f1807k4.size();
        }
    }

    public static class KeyValuePairs {

        /* JADX INFO: renamed from: k4 */
        private Object f1808k4;

        /* JADX INFO: renamed from: x1 */
        private Object f1809x1;

        public KeyValuePairs(Object obj, Object obj2) {
            this.f1809x1 = obj2;
            this.f1808k4 = obj;
        }

        /* JADX INFO: renamed from: k4 */
        public Object m1000k4() {
            return this.f1808k4;
        }

        /* JADX INFO: renamed from: x1 */
        public Object m1001x1() {
            return this.f1809x1;
        }
    }

    public class ReadOnlyItemCollection implements Set {

        /* JADX INFO: renamed from: x1 */
        private AbstractC14092to f1811x1;

        public ReadOnlyItemCollection(AbstractC14092to abstractC14092to) {
            this.f1811x1 = abstractC14092to;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new NotSupportedException("Collection is read only");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new NotSupportedException("Collection is read only");
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            throw new NotSupportedException("Collection is read only");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return this.f1811x1.contains(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return this.f1811x1.size() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return this.f1811x1.iterator();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new NotSupportedException("Collection is read only");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            throw new NotSupportedException("Collection is read only");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            throw new NotSupportedException("Collection is read only");
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return this.f1811x1.size();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            Object[] objArr = new Object[size()];
            this.f1811x1.copyTo(AbstractC14092to.m67208k4((Object) objArr), 0);
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            if (objArr.length <= size()) {
                objArr = new Object[size()];
            }
            this.f1811x1.copyTo(AbstractC14092to.m67208k4((Object) objArr), 0);
            return objArr;
        }
    }

    public static class SyncHashtable extends Hashtable {

        /* JADX INFO: renamed from: k4 */
        protected Hashtable f1812k4;

        public SyncHashtable(Hashtable hashtable) {
            super(false);
            this.f1812k4 = hashtable;
        }

        @Override // com.aspose.slides.Collections.Hashtable, com.aspose.slides.Collections.IDictionary
        public void addItem(Object obj, Object obj2) {
            synchronized (this.f1812k4.getSyncRoot()) {
                this.f1812k4.addItem(obj, obj2);
            }
        }

        @Override // com.aspose.slides.Collections.Hashtable, com.aspose.slides.Collections.IDictionary
        public void clear() {
            synchronized (this.f1812k4.getSyncRoot()) {
                this.f1812k4.clear();
            }
        }

        @Override // com.aspose.slides.Collections.Hashtable, com.aspose.slides.Collections.IDictionary
        public boolean contains(Object obj) {
            return this.f1812k4.contains(obj);
        }

        @Override // com.aspose.slides.Collections.Hashtable, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f1812k4.containsKey(obj);
        }

        @Override // com.aspose.slides.Collections.Hashtable, java.util.Map
        public boolean containsValue(Object obj) {
            boolean zContainsValue;
            synchronized (this.f1812k4.getSyncRoot()) {
                zContainsValue = this.f1812k4.containsValue(obj);
            }
            return zContainsValue;
        }

        @Override // com.aspose.slides.Collections.Hashtable, com.aspose.slides.Collections.ICollection
        public void copyTo(AbstractC14092to abstractC14092to, int i) {
            synchronized (this.f1812k4.getSyncRoot()) {
                this.f1812k4.copyTo(abstractC14092to, i);
            }
        }

        @Override // com.aspose.slides.Collections.Hashtable, com.aspose.slides.p559ms.System.InterfaceC14059g8
        public Object deepClone() {
            Hashtable hashtableSync;
            synchronized (this.f1812k4.getSyncRoot()) {
                hashtableSync = Hashtable.sync((Hashtable) this.f1812k4.deepClone());
            }
            return hashtableSync;
        }

        @Override // com.aspose.slides.Collections.Hashtable, com.aspose.slides.Collections.IDictionary
        public ICollection getKeys() {
            ICollection keys;
            synchronized (this.f1812k4.getSyncRoot()) {
                keys = this.f1812k4.getKeys();
            }
            return keys;
        }

        @Override // com.aspose.slides.Collections.Hashtable
        public void getObjectData(C9480kk c9480kk, C9478du c9478du) {
            if (c9480kk == null) {
                throw new ArgumentNullException("info");
            }
            c9480kk.m46670k4("ParentTable", this.f1812k4, C7019kk.m27443k4((Class<?>) Hashtable.class));
        }

        @Override // com.aspose.slides.Collections.Hashtable, com.aspose.slides.Collections.ICollection
        public Object getSyncRoot() {
            return this.f1812k4.getSyncRoot();
        }

        @Override // com.aspose.slides.Collections.Hashtable, com.aspose.slides.Collections.IDictionary
        public ICollection getValues() {
            ICollection values;
            synchronized (this.f1812k4.getSyncRoot()) {
                values = this.f1812k4.getValues();
            }
            return values;
        }

        @Override // com.aspose.slides.Collections.Hashtable, com.aspose.slides.Collections.IDictionary
        public Object get_Item(Object obj) {
            return this.f1812k4.get_Item(obj);
        }

        @Override // com.aspose.slides.Collections.Hashtable, com.aspose.slides.Collections.IDictionary
        public boolean isFixedSize() {
            return this.f1812k4.isFixedSize();
        }

        @Override // com.aspose.slides.Collections.Hashtable, com.aspose.slides.Collections.IDictionary
        public boolean isReadOnly() {
            return this.f1812k4.isReadOnly();
        }

        @Override // com.aspose.slides.Collections.Hashtable, com.aspose.slides.Collections.ICollection
        public boolean isSynchronized() {
            return true;
        }

        @Override // com.aspose.slides.Collections.Hashtable, java.lang.Iterable
        public IDictionaryEnumerator iterator() {
            return this.f1812k4.iterator();
        }

        @Override // com.aspose.slides.Collections.Hashtable
        /* JADX INFO: renamed from: k4 */
        public KeyValuePairs[] mo992k4() {
            return this.f1812k4.mo992k4();
        }

        @Override // com.aspose.slides.Collections.Hashtable
        public void onDeserialization(Object obj) {
        }

        @Override // com.aspose.slides.Collections.Hashtable, com.aspose.slides.Collections.IDictionary
        public void removeItem(Object obj) {
            synchronized (this.f1812k4.getSyncRoot()) {
                this.f1812k4.removeItem(obj);
            }
        }

        @Override // com.aspose.slides.Collections.Hashtable, com.aspose.slides.Collections.IDictionary
        public void set_Item(Object obj, Object obj2) {
            synchronized (this.f1812k4.getSyncRoot()) {
                this.f1812k4.set_Item(obj, obj2);
            }
        }

        @Override // com.aspose.slides.Collections.Hashtable, com.aspose.slides.Collections.ICollection
        public int size() {
            return this.f1812k4.size();
        }
    }

    public static class ValueCollection implements ICollection, IEnumerable {

        /* JADX INFO: renamed from: k4 */
        private Hashtable f1813k4;

        public ValueCollection(Hashtable hashtable) {
            this.f1813k4 = hashtable;
        }

        @Override // com.aspose.slides.Collections.ICollection
        public void copyTo(AbstractC14092to abstractC14092to, int i) {
            if (abstractC14092to == null) {
                throw new ArgumentNullException("array", "Array cannot be null");
            }
            if (abstractC14092to.m67277to() != 1) {
                throw new ArgumentException("Only single dimensional arrays are supported for the requested action");
            }
            if (i < 0) {
                throw new ArgumentOutOfRangeException("arrayIndex", "Non-negative number required");
            }
            if (abstractC14092to.m67265du() - i < this.f1813k4.size()) {
                throw new ArgumentException("Destination array is not long enough to copy all the items in the collection. Check array index and length");
            }
            this.f1813k4.m993x1(abstractC14092to, i);
        }

        @Override // com.aspose.slides.Collections.ICollection
        public Object getSyncRoot() {
            return this.f1813k4.getSyncRoot();
        }

        @Override // com.aspose.slides.Collections.ICollection
        public boolean isSynchronized() {
            return this.f1813k4.isSynchronized();
        }

        @Override // java.lang.Iterable
        public IEnumerator iterator() {
            return new HashtableEnumerator(this.f1813k4, 2);
        }

        @Override // com.aspose.slides.Collections.ICollection
        public int size() {
            return this.f1813k4.size();
        }
    }

    public Hashtable() {
        this(0, 1.0f);
    }

    public static Hashtable fromJava(Map map) {
        if (map == null) {
            return null;
        }
        return new C11249x1(map);
    }

    /* JADX INFO: renamed from: k4 */
    private long m980k4(Object obj, int i, long[] jArr, long[] jArr2) {
        long hash = getHash(obj) & Integer.MAX_VALUE;
        jArr[0] = hash;
        jArr2[0] = ((((4294967295L & hash) >> 5) + 1) % ((long) (i - 1))) + 1;
        return hash;
    }

    /* JADX INFO: renamed from: kk */
    private void m985kk() {
        m981k4(this.f1790kk.length);
    }

    public static Hashtable sync(Hashtable hashtable) {
        if (hashtable != null) {
            return new SyncHashtable(hashtable);
        }
        throw new ArgumentNullException("table");
    }

    /* JADX INFO: renamed from: to */
    private void m987to() {
        this.f1786fa++;
    }

    public static Map toJava(Hashtable hashtable) {
        return hashtable;
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public void addItem(Object obj, Object obj2) {
        m982k4(obj, obj2, true);
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public void clear() {
        if (this.f1792to == 0) {
            return;
        }
        this.f1784du = true;
        int i = 0;
        while (true) {
            Bucket[] bucketArr = this.f1790kk;
            if (i >= bucketArr.length) {
                this.f1792to = 0;
                this.f1788jd = 0;
                m987to();
                this.f1784du = false;
                return;
            }
            Bucket bucket = bucketArr[i];
            bucket.f1796kk = 0;
            bucket.f1795k4 = null;
            bucket.f1797x1 = null;
            i++;
        }
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public boolean contains(Object obj) {
        return containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        boolean z;
        boolean z2 = false;
        boolean z3 = true;
        Bucket bucket = new Bucket();
        if (obj == null) {
            throw new ArgumentNullException("key", "Key cannot be null");
        }
        Bucket[] bucketArr = this.f1790kk;
        long[] jArr = {0};
        long[] jArr2 = {0};
        long jM980k4 = m980k4(obj, bucketArr.length, jArr, jArr2);
        long j = jArr[0];
        long j2 = jArr2[0];
        int length = (int) ((j & 4294967295L) % ((long) this.f1790kk.length));
        int i = 0;
        while (true) {
            bucketArr[length].CloneTo(bucket);
            Object obj2 = bucket.f1795k4;
            if (obj2 == null) {
                return z2;
            }
            z = z2;
            boolean z4 = z3;
            if ((bucket.f1796kk & Integer.MAX_VALUE) == (jM980k4 & 4294967295L) && keyEquals(obj2, obj)) {
                return z4;
            }
            long j3 = ((long) length) + (j2 & 4294967295L);
            Bucket[] bucketArr2 = this.f1790kk;
            int length2 = (int) (j3 % ((long) bucketArr2.length));
            if (bucket.f1796kk >= 0 || (i = i + 1) >= bucketArr2.length) {
                break;
            }
            length = length2;
            z2 = z;
            z3 = z4;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        if (obj == null) {
            int length = this.f1790kk.length;
            while (true) {
                length--;
                if (length < 0) {
                    return false;
                }
                Bucket[] bucketArr = this.f1790kk;
                Bucket bucket = bucketArr[length];
                Object obj2 = bucket.f1795k4;
                if (obj2 != 0 && obj2 != bucketArr && bucket.f1797x1 == null) {
                    return true;
                }
            }
        } else {
            int length2 = this.f1790kk.length;
            while (true) {
                length2--;
                if (length2 < 0) {
                    return false;
                }
                Object obj3 = this.f1790kk[length2].f1797x1;
                if (obj3 != null && obj3.equals(obj)) {
                    return true;
                }
            }
        }
    }

    @Override // com.aspose.slides.Collections.ICollection
    public void copyTo(AbstractC14092to abstractC14092to, int i) {
        if (abstractC14092to == null) {
            throw new ArgumentNullException("array", "Array cannot be null");
        }
        if (abstractC14092to.m67277to() != 1) {
            throw new ArgumentException("Only single dimensional arrays are supported for the requested action");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("arrayIndex", "Non-negative number required");
        }
        if (abstractC14092to.m67265du() - i < this.f1792to) {
            throw new ArgumentException("Destination array is not long enough to copy all the items in the collection. Check array index and length");
        }
        m986kk(abstractC14092to, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    public Object deepClone() {
        Bucket[] bucketArr = this.f1790kk;
        Hashtable hashtable = new Hashtable(this.f1792to, this.f1789k4);
        hashtable.f1786fa = this.f1786fa;
        hashtable.f1791m9 = this.f1791m9;
        hashtable.f1792to = 0;
        int length = this.f1790kk.length;
        while (length > 0) {
            length--;
            Bucket bucket = bucketArr[length];
            Object obj = bucket.f1795k4;
            if (obj != 0 && obj != bucketArr) {
                hashtable.set_Item(obj, bucket.f1797x1);
            }
        }
        return hashtable;
    }

    @Override // java.util.Map
    public Set entrySet() {
        KeyValuePairs[] keyValuePairsArrMo992k4 = mo992k4();
        int length = keyValuePairsArrMo992k4.length;
        Map.Entry[] entryArr = new Map.Entry[length];
        for (int i = 0; i < length; i++) {
            entryArr[i] = new AbstractMap.SimpleEntry(keyValuePairsArrMo992k4[i].m1000k4(), keyValuePairsArrMo992k4[i].m1001x1());
        }
        return new ReadOnlyItemCollection(AbstractC14092to.m67208k4((Object) entryArr));
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return get_Item(obj);
    }

    public IGenericEqualityComparer getEqualityComparer() {
        return this.f1789k4;
    }

    public int getHash(Object obj) {
        IGenericEqualityComparer iGenericEqualityComparer = this.f1789k4;
        return iGenericEqualityComparer != null ? iGenericEqualityComparer.hashCode(obj) : obj.hashCode();
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public ICollection getKeys() {
        if (this.f1787h4 == null) {
            this.f1787h4 = new KeyCollection(this);
        }
        return this.f1787h4;
    }

    public void getObjectData(C9480kk c9480kk, C9478du c9478du) {
        AbstractC14068j5 abstractC14068j5M27443k4;
        if (c9480kk == null) {
            throw new ArgumentNullException("info");
        }
        c9480kk.m46667k4("LoadFactor", this.f1791m9);
        c9480kk.m46668k4("Version", this.f1786fa);
        Object objM999x1 = this.f1789k4;
        String str = "HashCodeProvider";
        if (objM999x1 == null) {
            c9480kk.m46670k4("Comparer", null, C7019kk.m27443k4((Class<?>) Comparator.class));
            c9480kk.m46670k4("HashCodeProvider", null, C7019kk.m27443k4((Class<?>) IHashCodeProvider.class));
        } else {
            if (objM999x1 instanceof CompatibleComparer) {
                CompatibleComparer compatibleComparer = (CompatibleComparer) C7019kk.m27452k4(objM999x1, CompatibleComparer.class);
                c9480kk.m46670k4("Comparer", compatibleComparer.m998k4(), C7019kk.m27443k4((Class<?>) Comparator.class));
                objM999x1 = compatibleComparer.m999x1();
                abstractC14068j5M27443k4 = C7019kk.m27443k4((Class<?>) IHashCodeProvider.class);
            } else {
                abstractC14068j5M27443k4 = C7019kk.m27443k4((Class<?>) IGenericEqualityComparer.class);
                str = "KeyComparer";
            }
            c9480kk.m46670k4(str, objM999x1, abstractC14068j5M27443k4);
        }
        c9480kk.m46668k4("HashSize", this.f1790kk.length);
        int i = this.f1792to;
        Object[] objArr = new Object[i];
        Object[] objArr2 = new Object[i];
        m991k4(AbstractC14092to.m67208k4((Object) objArr), 0);
        m993x1(AbstractC14092to.m67208k4((Object) objArr2), 0);
        c9480kk.m46670k4("Keys", objArr, C7019kk.m27443k4((Class<?>) Object[].class));
        c9480kk.m46670k4("Values", objArr2, C7019kk.m27443k4((Class<?>) Object[].class));
    }

    @Override // com.aspose.slides.Collections.ICollection
    public Object getSyncRoot() {
        return this.f1793x1;
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public ICollection getValues() {
        if (this.f1783ck == null) {
            this.f1783ck = new ValueCollection(this);
        }
        return this.f1783ck;
    }

    public int getVersion() {
        return this.f1786fa;
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public Object get_Item(Object obj) {
        int i = 0;
        Bucket bucket = new Bucket();
        if (obj == null) {
            throw new ArgumentNullException("key", "Key cannot be null");
        }
        Bucket[] bucketArr = this.f1790kk;
        long[] jArr = {0};
        long[] jArr2 = {0};
        long jM980k4 = m980k4(obj, bucketArr.length, jArr, jArr2);
        long j = jArr[0];
        long j2 = jArr2[0];
        long j3 = 4294967295L;
        int length = (int) ((j & 4294967295L) % ((long) this.f1790kk.length));
        int i2 = 0;
        while (true) {
            int i3 = i;
            while (true) {
                int i4 = this.f1786fa;
                bucketArr[length].CloneTo(bucket);
                i3++;
                if (i3 % 8 == 0) {
                    C5449c5.m22527x1(1);
                }
                if (!this.f1784du && i4 == this.f1786fa) {
                    break;
                }
                j3 = 4294967295L;
            }
            Object obj2 = bucket.f1795k4;
            if (obj2 == null) {
                return null;
            }
            if ((bucket.f1796kk & Integer.MAX_VALUE) == (jM980k4 & j3) && keyEquals(obj2, obj)) {
                return bucket.f1797x1;
            }
            Bucket[] bucketArr2 = this.f1790kk;
            length = (int) ((((long) length) + (j2 & j3)) % ((long) bucketArr2.length));
            if (bucket.f1796kk >= 0 || (i2 = i2 + 1) >= bucketArr2.length) {
                return null;
            }
            i = 0;
            j3 = 4294967295L;
        }
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f1792to == 0;
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
        return new HashtableEnumerator(this, 3);
    }

    public boolean keyEquals(Object obj, Object obj2) {
        if (C14067j2.m66729x1(this.f1790kk, obj)) {
            return false;
        }
        IGenericEqualityComparer iGenericEqualityComparer = this.f1789k4;
        return iGenericEqualityComparer != null ? iGenericEqualityComparer.equals(obj, obj2) : obj != null && obj.equals(obj2);
    }

    @Override // java.util.Map
    public Set keySet() {
        AbstractC14092to abstractC14092toM67208k4 = AbstractC14092to.m67208k4((Object) new Object[size()]);
        getKeys().copyTo(abstractC14092toM67208k4, 0);
        return new ReadOnlyItemCollection(abstractC14092toM67208k4);
    }

    public void onDeserialization(Object obj) {
        if (this.f1790kk == null) {
            C9480kk c9480kk = this.f1782c5;
            if (c9480kk == null) {
                throw new SerializationException("OnDeserialization method was called while the object was not being deserialized.");
            }
            C9481to c9481toM46665k4 = c9480kk.m46665k4();
            int iM46664k4 = 0;
            Comparator comparator = null;
            IHashCodeProvider iHashCodeProvider = null;
            Object[] objArr = null;
            Object[] objArr2 = null;
            while (c9481toM46665k4.hasNext()) {
                switch (f1781up.m27428k4(c9481toM46665k4.m46673x1())) {
                    case 0:
                        this.f1791m9 = this.f1782c5.m46671x1("LoadFactor");
                        break;
                    case 1:
                        iM46664k4 = this.f1782c5.m46664k4("HashSize");
                        break;
                    case 2:
                        this.f1789k4 = (IGenericEqualityComparer) this.f1782c5.m46666k4("KeyComparer", C7019kk.m27443k4((Class<?>) IGenericEqualityComparer.class));
                        break;
                    case 3:
                        comparator = (Comparator) this.f1782c5.m46666k4("Comparer", C7019kk.m27443k4((Class<?>) Comparator.class));
                        break;
                    case 4:
                        iHashCodeProvider = (IHashCodeProvider) this.f1782c5.m46666k4("HashCodeProvider", C7019kk.m27443k4((Class<?>) IHashCodeProvider.class));
                        break;
                    case 5:
                        objArr = (Object[]) this.f1782c5.m46666k4("Keys", C7019kk.m27443k4((Class<?>) Object[].class));
                        break;
                    case 6:
                        objArr2 = (Object[]) this.f1782c5.m46666k4("Values", C7019kk.m27443k4((Class<?>) Object[].class));
                        break;
                }
            }
            this.f1785dy = (int) (this.f1791m9 * iM46664k4);
            if (this.f1789k4 == null && (comparator != null || iHashCodeProvider != null)) {
                this.f1789k4 = new CompatibleComparer(comparator, iHashCodeProvider);
            }
            this.f1790kk = m990x1(iM46664k4);
            if (objArr == null) {
                throw new SerializationException("The Keys for this dictionary are missing");
            }
            if (objArr2 == null) {
                throw new SerializationException("The Values for this dictionary are missing");
            }
            if (objArr.length != objArr2.length) {
                throw new SerializationException("The keys and values arrays have different sizes");
            }
            for (int i = 0; i < objArr.length; i++) {
                Object obj2 = objArr[i];
                if (obj2 == null) {
                    throw new SerializationException("One of the serialized keys is null");
                }
                m982k4(obj2, objArr2[i], true);
            }
            this.f1786fa = this.f1782c5.m46664k4("Version");
            this.f1782c5 = null;
        }
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        Object obj3 = get_Item(obj);
        set_Item(obj, obj2);
        return obj3;
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        for (Object obj : map.keySet()) {
            put(obj, map.get(obj));
        }
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        Object obj2 = get_Item(obj);
        removeItem(obj);
        return obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // com.aspose.slides.Collections.IDictionary
    public void removeItem(Object obj) {
        boolean z = false;
        ?? r3 = 1;
        Bucket bucket = new Bucket();
        if (obj == null) {
            throw new ArgumentNullException("key", "Key cannot be null");
        }
        long[] jArr = {0};
        long[] jArr2 = {0};
        long jM980k4 = m980k4(obj, this.f1790kk.length, jArr, jArr2);
        long j = jArr[0];
        long j2 = jArr2[0];
        int length = (int) ((j & 4294967295L) % ((long) this.f1790kk.length));
        int i = 0;
        while (true) {
            this.f1790kk[length].CloneTo(bucket);
            if ((bucket.f1796kk & Integer.MAX_VALUE) == (jM980k4 & 4294967295L) && keyEquals(bucket.f1795k4, obj)) {
                this.f1784du = r3;
                Bucket[] bucketArr = this.f1790kk;
                Bucket bucket2 = bucketArr[length];
                int i2 = (int) (((long) bucket2.f1796kk) & (-2147483648L));
                bucket2.f1796kk = i2;
                if (i2 != 0) {
                    bucket2.f1795k4 = bucketArr;
                } else {
                    bucket2.f1795k4 = null;
                }
                bucket2.f1797x1 = null;
                this.f1792to -= r3;
                m987to();
                this.f1784du = z;
                return;
            }
            long j3 = ((long) length) + (j2 & 4294967295L);
            Bucket[] bucketArr2 = this.f1790kk;
            ?? r17 = r3;
            int length2 = (int) (j3 % ((long) bucketArr2.length));
            if (bucket.f1796kk >= 0 || (i = i + 1) >= bucketArr2.length) {
                return;
            }
            length = length2;
            r3 = r17 == true ? 1 : 0;
            z = false;
        }
    }

    @Override // com.aspose.slides.Collections.IDictionary
    public void set_Item(Object obj, Object obj2) {
        m982k4(obj, obj2, false);
    }

    @Override // com.aspose.slides.Collections.ICollection
    public int size() {
        return this.f1792to;
    }

    @Override // java.util.Map
    public Collection values() {
        AbstractC14092to abstractC14092toM67208k4 = AbstractC14092to.m67208k4((Object) new Object[size()]);
        getValues().copyTo(abstractC14092toM67208k4, 0);
        return new ReadOnlyItemCollection(abstractC14092toM67208k4);
    }

    public Hashtable(int i) {
        this(i, 1.0f);
    }

    /* JADX INFO: renamed from: k4 */
    private void m981k4(int i) {
        this.f1788jd = 0;
        Bucket[] bucketArrM990x1 = m990x1(i);
        int i2 = 0;
        while (true) {
            Bucket[] bucketArr = this.f1790kk;
            if (i2 >= bucketArr.length) {
                this.f1784du = true;
                this.f1790kk = bucketArrM990x1;
                this.f1785dy = (int) (this.f1791m9 * i);
                m987to();
                this.f1784du = false;
                return;
            }
            Bucket bucketClone = bucketArr[i2].Clone();
            Object obj = bucketClone.f1795k4;
            if (obj != null && obj != this.f1790kk) {
                m983k4(bucketArrM990x1, obj, bucketClone.f1797x1, bucketClone.f1796kk & Integer.MAX_VALUE);
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: kk */
    private void m986kk(AbstractC14092to abstractC14092to, int i) {
        Bucket[] bucketArr = this.f1790kk;
        int length = bucketArr.length;
        while (true) {
            length--;
            if (length < 0) {
                return;
            }
            Bucket bucket = bucketArr[length];
            Object obj = bucket.f1795k4;
            if (obj != null && obj != this.f1790kk) {
                abstractC14092to.m67276kk(new DictionaryEntry(obj, bucket.f1797x1).Clone(), i);
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m989x1() {
        m981k4(C11245k4.m54232k4(this.f1790kk.length * 2));
    }

    public Hashtable(int i, float f) {
        this.f1793x1 = new Object();
        if (i < 0) {
            throw new ArgumentOutOfRangeException("capacity", "Non-negative number required");
        }
        if (f < 0.1f || f > 1.0f || Float.isNaN(f)) {
            throw new ArgumentOutOfRangeException("loadFactor", C14113y2.m67402k4("Load factor needs to be between {0} and {1}", Double.valueOf(0.1d), Double.valueOf(1.0d)));
        }
        float f2 = f * 0.72f;
        this.f1791m9 = f2;
        double d = i / f2;
        if (d > 2.147483647E9d) {
            throw new ArgumentException("Hashtable's capacity overflowed and went negative. Check load factor, capacity and the current size of the table");
        }
        int iM54232k4 = d > 11.0d ? C11245k4.m54232k4((int) d) : 11;
        this.f1790kk = m990x1(iM54232k4);
        this.f1785dy = (int) (this.f1791m9 * iM54232k4);
        this.f1784du = false;
    }

    /* JADX INFO: renamed from: k4 */
    public void m991k4(AbstractC14092to abstractC14092to, int i) {
        Bucket[] bucketArr = this.f1790kk;
        int length = bucketArr.length;
        while (true) {
            length--;
            if (length < 0) {
                return;
            }
            Object obj = bucketArr[length].f1795k4;
            if (obj != null && obj != this.f1790kk) {
                abstractC14092to.m67276kk(obj, i);
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public void m993x1(AbstractC14092to abstractC14092to, int i) {
        Bucket[] bucketArr = this.f1790kk;
        int length = bucketArr.length;
        while (true) {
            length--;
            if (length < 0) {
                return;
            }
            Bucket bucket = bucketArr[length];
            Object obj = bucket.f1795k4;
            if (obj != null && obj != this.f1790kk) {
                abstractC14092to.m67276kk(bucket.f1797x1, i);
                i++;
            }
        }
    }

    public Hashtable(int i, float f, IGenericEqualityComparer iGenericEqualityComparer) {
        this(i, f);
        this.f1789k4 = iGenericEqualityComparer;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        r22 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x010c, code lost:
    
        if (r11 == r8) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010e, code lost:
    
        r5 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x010f, code lost:
    
        r26.f1784du = true;
        r5 = r26.f1790kk[r5];
        r5.f1797x1 = r28;
        r5.f1795k4 = r27;
        r1 = r5.f1796kk;
        r2 = (int) (r22 & r18);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m982k4(Object obj, Object obj2, boolean z) {
        long j;
        int i;
        Bucket bucket;
        int i2;
        int i3;
        long j2;
        long j3;
        Bucket bucket2;
        int i4;
        if (obj == null) {
            throw new ArgumentNullException("key", "Key cannot be null");
        }
        int i5 = this.f1792to;
        int i6 = this.f1785dy;
        if (i5 >= i6) {
            m989x1();
        } else if (this.f1788jd > i6 && i5 > 100) {
            m985kk();
        }
        long[] jArr = {0};
        long[] jArr2 = {0};
        long jM980k4 = m980k4(obj, this.f1790kk.length, jArr, jArr2);
        long j4 = jArr[0];
        long j5 = jArr2[0];
        long j6 = 4294967295L;
        int length = (int) ((j4 & 4294967295L) % ((long) this.f1790kk.length));
        int i7 = -1;
        int i8 = 0;
        int i9 = -1;
        while (true) {
            if (i9 == i7) {
                Bucket[] bucketArr = this.f1790kk;
                j = j6;
                Bucket bucket3 = bucketArr[length];
                if (bucket3.f1795k4 == bucketArr && bucket3.f1796kk < 0) {
                    i9 = length;
                }
            } else {
                j = j6;
            }
            Bucket[] bucketArr2 = this.f1790kk;
            Bucket bucket4 = bucketArr2[length];
            Object obj3 = bucket4.f1795k4;
            if (obj3 == null) {
                i = i7;
                break;
            }
            if (obj3 == bucketArr2) {
                j2 = j5;
                if ((((long) bucket4.f1796kk) & 2147483648L) == 0) {
                    i = -1;
                    break;
                }
            } else {
                j2 = j5;
            }
            long j7 = jM980k4 & j;
            if ((bucket4.f1796kk & Integer.MAX_VALUE) != j7 || !keyEquals(obj3, obj)) {
                if (i9 != -1 || (i4 = (bucket2 = this.f1790kk[length]).f1796kk) < 0) {
                    j3 = jM980k4;
                } else {
                    j3 = jM980k4;
                    bucket2.f1796kk = (int) (((long) i4) | (-2147483648L));
                    this.f1788jd++;
                }
                Bucket[] bucketArr3 = this.f1790kk;
                length = (int) ((((long) length) + (j2 & j)) % ((long) bucketArr3.length));
                i8++;
                if (i8 < bucketArr3.length) {
                    j6 = j;
                    j5 = j2;
                    jM980k4 = j3;
                    i7 = -1;
                } else {
                    if (i9 == -1) {
                        throw new InvalidOperationException("Hashtable insert failed. Load factor too high.");
                    }
                    this.f1784du = true;
                    bucket = this.f1790kk[i9];
                    bucket.f1797x1 = obj2;
                    bucket.f1795k4 = obj;
                    i2 = bucket.f1796kk;
                    i3 = (int) j7;
                }
            } else if (!z) {
                this.f1784du = true;
                this.f1790kk[length].f1797x1 = obj2;
            } else {
                throw new ArgumentException(C14113y2.m67402k4("Item has already been added. Key in dictionary: '{0}'  Key being added: '{1}'", this.f1790kk[length].f1795k4, obj));
            }
        }
        bucket.f1796kk = i2 | i3;
        this.f1792to++;
        m987to();
        this.f1784du = false;
    }

    /* JADX INFO: renamed from: x1 */
    private Bucket[] m990x1(int i) {
        Bucket[] bucketArr = new Bucket[i];
        for (int i2 = 0; i2 < i; i2++) {
            bucketArr[i2] = new Bucket();
        }
        return bucketArr;
    }

    @Deprecated
    public Hashtable(int i, float f, IHashCodeProvider iHashCodeProvider, Comparator comparator) {
        this(i, f);
        this.f1789k4 = (iHashCodeProvider == null && comparator == null) ? null : new CompatibleComparer(comparator, iHashCodeProvider);
    }

    /* JADX INFO: renamed from: k4 */
    private void m983k4(Bucket[] bucketArr, Object obj, Object obj2, int i) {
        Bucket bucket;
        long j = ((long) i) & 4294967295L;
        long length = (((j >> 5) + 1) % ((long) (bucketArr.length - 1))) + 1;
        while (true) {
            int length2 = (int) (j % ((long) bucketArr.length));
            bucket = bucketArr[length2];
            Object obj3 = bucket.f1795k4;
            if (obj3 == null || obj3 == this.f1790kk) {
                break;
            }
            int i2 = bucket.f1796kk;
            if (i2 >= 0) {
                bucket.f1796kk = (int) (((long) i2) | (-2147483648L));
                this.f1788jd++;
            }
            j = ((long) length2) + (length & 4294967295L);
        }
        bucket.f1797x1 = obj2;
        bucket.f1795k4 = obj;
        bucket.f1796kk |= i;
    }

    public Hashtable(int i, IGenericEqualityComparer iGenericEqualityComparer) {
        this(i, 1.0f, iGenericEqualityComparer);
    }

    @Deprecated
    public Hashtable(int i, IHashCodeProvider iHashCodeProvider, Comparator comparator) {
        this(i, 1.0f, iHashCodeProvider, comparator);
    }

    /* JADX INFO: renamed from: k4 */
    public KeyValuePairs[] mo992k4() {
        KeyValuePairs[] keyValuePairsArr = new KeyValuePairs[this.f1792to];
        Bucket[] bucketArr = this.f1790kk;
        int length = bucketArr.length;
        int i = 0;
        while (true) {
            length--;
            if (length < 0) {
                return keyValuePairsArr;
            }
            Bucket bucket = bucketArr[length];
            Object obj = bucket.f1795k4;
            if (obj != null && obj != this.f1790kk) {
                keyValuePairsArr[i] = new KeyValuePairs(obj, bucket.f1797x1);
                i++;
            }
        }
    }

    public Hashtable(IGenericEqualityComparer iGenericEqualityComparer) {
        this(0, 1.0f, iGenericEqualityComparer);
    }

    public Hashtable(IDictionary iDictionary) {
        this(iDictionary, 1.0f);
    }

    public Hashtable(IDictionary iDictionary, float f) {
        this(iDictionary, f, (IGenericEqualityComparer) null);
    }

    public Hashtable(IDictionary iDictionary, float f, IGenericEqualityComparer iGenericEqualityComparer) {
        this(iDictionary != null ? iDictionary.size() : 0, f, iGenericEqualityComparer);
        if (iDictionary == null) {
            throw new ArgumentNullException("d", "Dictionary cannot be null");
        }
        IDictionaryEnumerator it = iDictionary.iterator();
        while (it.hasNext()) {
            addItem(it.getKey(), it.getValue());
        }
    }

    @Deprecated
    public Hashtable(IDictionary iDictionary, float f, IHashCodeProvider iHashCodeProvider, Comparator comparator) {
        this(iDictionary != null ? iDictionary.size() : 0, f, iHashCodeProvider, comparator);
        if (iDictionary == null) {
            throw new ArgumentNullException("d", "Dictionary cannot be null");
        }
        IDictionaryEnumerator it = iDictionary.iterator();
        while (it.hasNext()) {
            addItem(it.getKey(), it.getValue());
        }
    }

    public Hashtable(IDictionary iDictionary, IGenericEqualityComparer iGenericEqualityComparer) {
        this(iDictionary, 1.0f, iGenericEqualityComparer);
    }

    @Deprecated
    public Hashtable(IDictionary iDictionary, IHashCodeProvider iHashCodeProvider, Comparator comparator) {
        this(iDictionary, 1.0f, iHashCodeProvider, comparator);
    }

    @Deprecated
    public Hashtable(IHashCodeProvider iHashCodeProvider, Comparator comparator) {
        this(0, 1.0f, iHashCodeProvider, comparator);
    }

    public Hashtable(C9480kk c9480kk, C9478du c9478du) {
        this.f1793x1 = new Object();
        this.f1782c5 = c9480kk;
    }

    public Hashtable(boolean z) {
        this.f1793x1 = new Object();
    }
}
