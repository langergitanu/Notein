package com.aspose.words.internal;

import com.aspose.words.ref.Ref;
import com.aspose.words.ref.RefInt;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
public class zzZQH<K, V> implements Iterable<Map.Entry<K, V>> {
    static final /* synthetic */ boolean zzVr = true;
    private final int zz3l;
    private zzZQH<K, V>.zzX zz3m;
    private zzZQH<K, V>.zzZ zz3n;
    private int zz3o;
    private V[] zz3p;
    private K[] zz3q;
    private Comparator<? super K> zz3s;

    public class zzY implements Iterator<Map.Entry<K, V>> {
        private int index;

        public /* synthetic */ zzY(zzZQH zzzqh, byte b) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: zzl8, reason: merged with bridge method [inline-methods] */
        public zzZQI<K, V> next() {
            int i = this.index + 1;
            this.index = i;
            if (i < zzZQH.this.getCount()) {
                return new zzZQI<>(zzZQH.this.zzV4(this.index), zzZQH.this.zzVY(this.index));
            }
            throw new NoSuchElementException("Iteration has no more elements.");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.index + 1 < zzZQH.this.getCount();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }

        private zzY() {
            this.index = -1;
        }
    }

    public zzZQH() {
        this.zz3s = null;
        this.zz3l = 16;
        this.zz3q = (K[]) new Object[16];
        this.zz3p = (V[]) new Object[16];
    }

    private static int binarySearch(Object[] objArr, int i, int i2, Object obj) {
        boolean z = zzVr;
        if (!z && objArr == null) {
            throw new AssertionError();
        }
        if (!z && i2 < 0) {
            throw new AssertionError();
        }
        if (!z && objArr.length < i2) {
            throw new AssertionError();
        }
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >> 1;
            int iCompareTo = ((Comparable) objArr[i5]).compareTo(obj);
            if (iCompareTo < 0) {
                i4 = i5 + 1;
            } else {
                if (iCompareTo <= 0) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    private void ensureCapacity(int i) {
        K[] kArr = this.zz3q;
        int length = kArr.length == 0 ? 16 : kArr.length << 1;
        if (length >= i) {
            i = length;
        }
        zzH(i);
    }

    private int indexOfValue(V v) {
        return zzZKV.zzZ(this.zz3p, v, this.zz3o);
    }

    private void zzH(int i) {
        K[] kArr = this.zz3q;
        if (i != kArr.length) {
            int i2 = this.zz3o;
            if (i < i2) {
                throw new IndexOutOfBoundsException("value");
            }
            if (i <= 0) {
                this.zz3q = (K[]) new Object[16];
                this.zz3p = (V[]) new Object[16];
                return;
            }
            K[] kArr2 = (K[]) new Object[i];
            V[] vArr = (V[]) new Object[i];
            if (i2 > 0) {
                System.arraycopy(kArr, 0, kArr2, 0, i2);
                System.arraycopy(this.zz3p, 0, vArr, 0, this.zz3o);
            }
            this.zz3q = kArr2;
            this.zz3p = vArr;
        }
    }

    private Collection<V> zzla() {
        if (this.zz3m == null) {
            this.zz3m = new zzX(this);
        }
        return this.zz3m;
    }

    private Iterable<K> zzlb() {
        if (this.zz3n == null) {
            this.zz3n = new zzZ(this);
        }
        return this.zz3n;
    }

    public final void clear() {
        this.zz3o = 0;
        this.zz3q = (K[]) new Object[16];
        this.zz3p = (V[]) new Object[16];
    }

    public final boolean contains(K k) {
        return indexOfKey(k) >= 0;
    }

    public final boolean containsKey(K k) {
        return indexOfKey(k) >= 0;
    }

    public final boolean containsValue(V v) {
        return indexOfValue(v) >= 0;
    }

    public final V get(K k) {
        int iIndexOfKey = indexOfKey(k);
        if (iIndexOfKey < 0 || iIndexOfKey >= this.zz3o) {
            return null;
        }
        return this.zz3p[iIndexOfKey];
    }

    public final int getCount() {
        return this.zz3o;
    }

    public final List<K> getKeys() {
        return new zzZQJ((Collection) zzlb(), this.zz3s);
    }

    public final int indexOfKey(K k) {
        if (k == null) {
            throw new NullPointerException("key");
        }
        int iZzZ = zzZ(this.zz3q, this.zz3o, k, this.zz3s);
        if (iZzZ >= 0) {
            return iZzZ;
        }
        return -1;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new zzY(this, (byte) 0);
    }

    public final void remove(K k) {
        int iIndexOfKey = indexOfKey(k);
        if (iIndexOfKey >= 0) {
            removeAt(iIndexOfKey);
        }
    }

    public final void removeAt(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.zz3o)) {
            throw new IndexOutOfBoundsException(FirebaseAnalytics.Param.INDEX);
        }
        int i3 = i2 - 1;
        this.zz3o = i3;
        if (i < i3) {
            K[] kArr = this.zz3q;
            int i4 = i + 1;
            System.arraycopy(kArr, i4, kArr, i, i3 - i);
            V[] vArr = this.zz3p;
            System.arraycopy(vArr, i4, vArr, i, this.zz3o - i);
        }
        K[] kArr2 = this.zz3q;
        int i5 = this.zz3o;
        kArr2[i5] = null;
        this.zz3p[i5] = null;
    }

    public final void set(K k, V v) {
        if (k == null) {
            throw new NullPointerException("key");
        }
        int iZzZ = zzZ(this.zz3q, this.zz3o, k, this.zz3s);
        if (iZzZ >= 0) {
            this.zz3p[iZzZ] = v;
        } else {
            zzZ(~iZzZ, k, v);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(IOUtils.LINE_SEPARATOR_WINDOWS);
        for (Map.Entry<K, V> entry : this) {
            sb.append(entry.getKey());
            sb.append(" => ");
            sb.append(entry.getValue());
            sb.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        }
        return sb.toString();
    }

    public final void zzB(K k, V v) {
        if (k == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        int iZzZ = zzZ(this.zz3q, this.zz3o, k, this.zz3s);
        if (iZzZ >= 0) {
            throw new IllegalArgumentException("duplicate");
        }
        zzZ(~iZzZ, k, v);
    }

    public void zzT(int i, V v) {
        if (i < 0 || i >= this.zz3o) {
            throw new IndexOutOfBoundsException(FirebaseAnalytics.Param.INDEX);
        }
        this.zz3p[i] = v;
    }

    public K zzV4(int i) {
        if (i < 0 || i >= this.zz3o) {
            throw new IndexOutOfBoundsException(FirebaseAnalytics.Param.INDEX);
        }
        return this.zz3q[i];
    }

    public V zzVY(int i) {
        if (i < 0 || i >= this.zz3o) {
            throw new IndexOutOfBoundsException(FirebaseAnalytics.Param.INDEX);
        }
        return this.zz3p[i];
    }

    public final ArrayList<V> zzl9() {
        return new ArrayList<>(zzla());
    }

    public class zzX implements Collection<V> {
        private zzZQH<K, V> zz3k;

        public class zzZ implements Iterator<V> {
            private int index;

            public /* synthetic */ zzZ(zzX zzx, byte b) {
                this();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.index + 1 < zzX.this.size();
            }

            @Override // java.util.Iterator
            public final V next() {
                int i = this.index + 1;
                this.index = i;
                if (i < zzX.this.size()) {
                    return (V) zzX.this.zz3k.zzVY(this.index);
                }
                throw new NoSuchElementException("Iteration has no more elements.");
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }

            private zzZ() {
                this.index = -1;
            }
        }

        public zzX(zzZQH<K, V> zzzqh) {
            this.zz3k = zzzqh;
        }

        @Override // java.util.Collection
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return this.zz3k.containsValue(obj);
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return size() <= 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new zzZ(this, (byte) 0);
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final int size() {
            return ((zzZQH) this.zz3k).zz3o;
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            Object[] objArr = new Object[size()];
            System.arraycopy(((zzZQH) this.zz3k).zz3p, 0, objArr, 0, this.zz3k.getCount());
            return objArr;
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            System.arraycopy(((zzZQH) this.zz3k).zz3p, 0, tArr, 0, this.zz3k.getCount());
            return tArr;
        }
    }

    public class zzZ implements Collection<K> {
        private zzZQH<K, V> zz3k;

        /* JADX INFO: renamed from: com.aspose.words.internal.zzZQH$zzZ$zzZ, reason: collision with other inner class name */
        public class C19094zzZ implements Iterator<K> {
            private int index;

            public /* synthetic */ C19094zzZ(zzZ zzz, byte b) {
                this();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.index + 1 < zzZ.this.size();
            }

            @Override // java.util.Iterator
            public final K next() {
                int i = this.index + 1;
                this.index = i;
                if (i < zzZ.this.size()) {
                    return (K) zzZ.this.zz3k.zzV4(this.index);
                }
                throw new NoSuchElementException("Iteration has no more elements.");
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }

            private C19094zzZ() {
                this.index = -1;
            }
        }

        public zzZ(zzZQH<K, V> zzzqh) {
            this.zz3k = zzzqh;
        }

        @Override // java.util.Collection
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return this.zz3k.contains(obj);
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return size() <= 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new C19094zzZ(this, (byte) 0);
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final int size() {
            return ((zzZQH) this.zz3k).zz3o;
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            Object[] objArr = new Object[size()];
            System.arraycopy(((zzZQH) this.zz3k).zz3q, 0, objArr, 0, this.zz3k.getCount());
            return objArr;
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            System.arraycopy(((zzZQH) this.zz3k).zz3q, 0, tArr, 0, this.zz3k.getCount());
            return tArr;
        }
    }

    public final boolean zzY(K k, Ref<V> ref) {
        if (k == null || !containsKey(k)) {
            return false;
        }
        ref.set(get(k));
        return true;
    }

    public final boolean zzZ(K k, RefInt refInt) {
        if (k == null || !containsKey(k)) {
            return false;
        }
        refInt.set(((Integer) get(k)).intValue());
        return true;
    }

    private void zzZ(int i, K k, V v) {
        int i2 = this.zz3o;
        if (i2 == this.zz3q.length) {
            ensureCapacity(i2 + 1);
        }
        int i3 = this.zz3o;
        if (i < i3) {
            K[] kArr = this.zz3q;
            int i4 = i + 1;
            System.arraycopy(kArr, i, kArr, i4, i3 - i);
            V[] vArr = this.zz3p;
            System.arraycopy(vArr, i, vArr, i4, this.zz3o - i);
        }
        this.zz3q[i] = k;
        this.zz3p[i] = v;
        this.zz3o++;
    }

    public zzZQH(int i) {
        this.zz3s = null;
        this.zz3l = 16;
        if (i >= 0) {
            this.zz3q = (K[]) new Object[i];
            this.zz3p = (V[]) new Object[i];
            return;
        }
        throw new IndexOutOfBoundsException("initialCapacity");
    }

    public zzZQH(Comparator comparator) {
        this();
        if (comparator != null) {
            this.zz3s = comparator;
        }
    }

    private static <T> int zzZ(T[] tArr, int i, T t, Comparator<? super T> comparator) {
        boolean z = zzVr;
        if (!z && tArr == null) {
            throw new AssertionError();
        }
        if (!z && i < 0) {
            throw new AssertionError();
        }
        if (!z && tArr.length < i) {
            throw new AssertionError();
        }
        int i2 = 0;
        if (comparator == null) {
            return binarySearch(tArr, 0, i, t);
        }
        int i3 = i - 1;
        while (i2 <= i3) {
            int i4 = (i2 + i3) >> 1;
            int iCompare = comparator.compare(tArr[i4], t);
            if (iCompare < 0) {
                i2 = i4 + 1;
            } else {
                if (iCompare <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return ~i2;
    }
}
