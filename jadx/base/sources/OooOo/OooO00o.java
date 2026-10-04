package OooOo;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class OooO00o<K, V> extends C20493Oooo00o<K, V> implements Map<K, V> {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public OooO00o<K, V>.C18962OooO00o f58449OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public OooO00o<K, V>.OooO0OO f58450OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public OooO00o<K, V>.C20472OooO0o0 f58451OooOoo0;

    /* JADX INFO: renamed from: OooOo.OooO00o$OooO00o, reason: collision with other inner class name */
    public final class C18962OooO00o extends AbstractSet<Map.Entry<K, V>> {
        public C18962OooO00o() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new C20471OooO0Oo();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return OooO00o.this.f58550OooOoO0;
        }
    }

    public final class OooO0O0 extends AbstractC20474OooO0o0<K> {
        public OooO0O0() {
            super(OooO00o.this.f58550OooOoO0);
        }

        @Override // OooOo.AbstractC20474OooO0o0
        public final K OooO00o(int i) {
            return OooO00o.this.OooO0oO(i);
        }

        @Override // OooOo.AbstractC20474OooO0o0
        public final void OooO0O0(int i) {
            OooO00o.this.OooO(i);
        }
    }

    /* JADX INFO: renamed from: OooOo.OooO00o$OooO0Oo, reason: case insensitive filesystem */
    public final class C20471OooO0Oo implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f58455OooOo = -1;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f58456OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public boolean f58458OooOoO0;

        public C20471OooO0Oo() {
            this.f58456OooOo0o = OooO00o.this.f58550OooOoO0 - 1;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!this.f58458OooOoO0) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.f58455OooOo;
            OooO00o oooO00o = OooO00o.this;
            return kotlin.jvm.internal.OooOOO0.OooO0O0(key, oooO00o.OooO0oO(i)) && kotlin.jvm.internal.OooOOO0.OooO0O0(entry.getValue(), oooO00o.OooOO0O(this.f58455OooOo));
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            if (this.f58458OooOoO0) {
                return OooO00o.this.OooO0oO(this.f58455OooOo);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            if (this.f58458OooOoO0) {
                return OooO00o.this.OooOO0O(this.f58455OooOo);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f58455OooOo < this.f58456OooOo0o;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            if (!this.f58458OooOoO0) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            int i = this.f58455OooOo;
            OooO00o oooO00o = OooO00o.this;
            K kOooO0oO = oooO00o.OooO0oO(i);
            V vOooOO0O = oooO00o.OooOO0O(this.f58455OooOo);
            return (kOooO0oO == null ? 0 : kOooO0oO.hashCode()) ^ (vOooOO0O != null ? vOooOO0O.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f58455OooOo++;
            this.f58458OooOoO0 = true;
            return this;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f58458OooOoO0) {
                throw new IllegalStateException();
            }
            OooO00o.this.OooO(this.f58455OooOo);
            this.f58455OooOo--;
            this.f58456OooOo0o--;
            this.f58458OooOoO0 = false;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            if (this.f58458OooOoO0) {
                return OooO00o.this.OooOO0(this.f58455OooOo, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    public final class OooO0o extends AbstractC20474OooO0o0<V> {
        public OooO0o() {
            super(OooO00o.this.f58550OooOoO0);
        }

        @Override // OooOo.AbstractC20474OooO0o0
        public final V OooO00o(int i) {
            return OooO00o.this.OooOO0O(i);
        }

        @Override // OooOo.AbstractC20474OooO0o0
        public final void OooO0O0(int i) {
            OooO00o.this.OooO(i);
        }
    }

    public OooO00o(OooO00o oooO00o) {
        super(0);
        if (oooO00o != null) {
            OooO0oo(oooO00o);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OooOO0o(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean OooOOO(Collection<?> collection) {
        int i = this.f58550OooOoO0;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(OooO0oO(i2))) {
                OooO(i2);
            }
        }
        return i != this.f58550OooOoO0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OooOOO0(Collection<?> collection) {
        int i = this.f58550OooOoO0;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.f58550OooOoO0;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        OooO00o<K, V>.C18962OooO00o c18962OooO00o = this.f58449OooOoO;
        if (c18962OooO00o != null) {
            return c18962OooO00o;
        }
        OooO00o<K, V>.C18962OooO00o c18962OooO00o2 = new C18962OooO00o();
        this.f58449OooOoO = c18962OooO00o2;
        return c18962OooO00o2;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        OooO00o<K, V>.OooO0OO oooO0OO = this.f58450OooOoOO;
        if (oooO0OO != null) {
            return oooO0OO;
        }
        OooO00o<K, V>.OooO0OO oooO0OO2 = new OooO0OO();
        this.f58450OooOoOO = oooO0OO2;
        return oooO0OO2;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        OooO0O0(map.size() + this.f58550OooOoO0);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        OooO00o<K, V>.C20472OooO0o0 c20472OooO0o0 = this.f58451OooOoo0;
        if (c20472OooO0o0 != null) {
            return c20472OooO0o0;
        }
        OooO00o<K, V>.C20472OooO0o0 c20472OooO0o02 = new C20472OooO0o0();
        this.f58451OooOoo0 = c20472OooO0o02;
        return c20472OooO0o02;
    }

    public final class OooO0OO implements Set<K> {
        public OooO0OO() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            OooO00o.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return OooO00o.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            return OooO00o.this.OooOO0o(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Set)) {
                return false;
            }
            Set set = (Set) obj;
            OooO00o oooO00o = OooO00o.this;
            try {
                if (oooO00o.f58550OooOoO0 == set.size()) {
                    return oooO00o.OooOO0o(set);
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            OooO00o oooO00o = OooO00o.this;
            int iHashCode = 0;
            for (int i = oooO00o.f58550OooOoO0 - 1; i >= 0; i--) {
                K kOooO0oO = oooO00o.OooO0oO(i);
                iHashCode += kOooO0oO == null ? 0 : kOooO0oO.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return OooO00o.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new OooO0O0();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            OooO00o oooO00o = OooO00o.this;
            int iOooO0o0 = oooO00o.OooO0o0(obj);
            if (iOooO0o0 < 0) {
                return false;
            }
            oooO00o.OooO(iOooO0o0);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            return OooO00o.this.OooOOO0(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            return OooO00o.this.OooOOO(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return OooO00o.this.f58550OooOoO0;
        }

        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            OooO00o oooO00o = OooO00o.this;
            int i = oooO00o.f58550OooOoO0;
            Object[] objArr = new Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = oooO00o.OooO0oO(i2);
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            OooO00o oooO00o = OooO00o.this;
            int i = oooO00o.f58550OooOoO0;
            if (tArr.length < i) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
            }
            for (int i2 = 0; i2 < i; i2++) {
                tArr[i2] = oooO00o.OooO0oO(i2);
            }
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        }
    }

    /* JADX INFO: renamed from: OooOo.OooO00o$OooO0o0, reason: case insensitive filesystem */
    public final class C20472OooO0o0 implements Collection<V> {
        public C20472OooO0o0() {
        }

        @Override // java.util.Collection
        public final boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            OooO00o.this.clear();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return OooO00o.this.OooO00o(obj) >= 0;
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return OooO00o.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new OooO0o();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            OooO00o oooO00o = OooO00o.this;
            int iOooO00o = oooO00o.OooO00o(obj);
            if (iOooO00o < 0) {
                return false;
            }
            oooO00o.OooO(iOooO00o);
            return true;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            OooO00o oooO00o = OooO00o.this;
            int i = oooO00o.f58550OooOoO0;
            int i2 = 0;
            boolean z = false;
            while (i2 < i) {
                if (collection.contains(oooO00o.OooOO0O(i2))) {
                    oooO00o.OooO(i2);
                    i2--;
                    i--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            OooO00o oooO00o = OooO00o.this;
            int i = oooO00o.f58550OooOoO0;
            int i2 = 0;
            boolean z = false;
            while (i2 < i) {
                if (!collection.contains(oooO00o.OooOO0O(i2))) {
                    oooO00o.OooO(i2);
                    i2--;
                    i--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final int size() {
            return OooO00o.this.f58550OooOoO0;
        }

        @Override // java.util.Collection
        public final Object[] toArray() {
            OooO00o oooO00o = OooO00o.this;
            int i = oooO00o.f58550OooOoO0;
            Object[] objArr = new Object[i];
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = oooO00o.OooOO0O(i2);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            OooO00o oooO00o = OooO00o.this;
            int i = oooO00o.f58550OooOoO0;
            if (tArr.length < i) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i));
            }
            for (int i2 = 0; i2 < i; i2++) {
                tArr[i2] = oooO00o.OooOO0O(i2);
            }
            if (tArr.length > i) {
                tArr[i] = null;
            }
            return tArr;
        }
    }

    public OooO00o() {
    }
}
