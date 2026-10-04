package oO0OOOO0;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: oO0OOOO0.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C32963OooOo0<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final /* synthetic */ int f119127OooOoo0 = 0;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f119129OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f119130OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public volatile C32963OooOo0<K, V>.C32964OooO0Oo f119132OooOoOO;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public List<C32963OooOo0<K, V>.OooO0O0> f119128OooOo = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Map<K, V> f119131OooOoO0 = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: oO0OOOO0.OooOo0$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C20289OooO00o f119133OooO00o = new C20289OooO00o();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final OooO0O0 f119134OooO0O0 = new OooO0O0();

        /* JADX INFO: renamed from: oO0OOOO0.OooOo0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C20289OooO00o implements Iterator<Object> {
            @Override // java.util.Iterator
            public final boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public final Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* JADX INFO: renamed from: oO0OOOO0.OooOo0$OooO00o$OooO0O0 */
        public static class OooO0O0 implements Iterable<Object> {
            @Override // java.lang.Iterable
            public final Iterator<Object> iterator() {
                return OooO00o.f119133OooO00o;
            }
        }
    }

    /* JADX INFO: renamed from: oO0OOOO0.OooOo0$OooO0O0 */
    public class OooO0O0 implements Comparable<C32963OooOo0<K, V>.OooO0O0>, Map.Entry<K, V> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public V f119135OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final K f119136OooOo0o;

        public OooO0O0() {
            throw null;
        }

        public OooO0O0(K k, V v) {
            this.f119136OooOo0o = k;
            this.f119135OooOo = v;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f119136OooOo0o.compareTo(((OooO0O0) obj).f119136OooOo0o);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj != this) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    K k = this.f119136OooOo0o;
                    if (k == null ? key == null : k.equals(key)) {
                        V v = this.f119135OooOo;
                        Object value = entry.getValue();
                        if (v == null ? value == null : v.equals(value)) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public final Object getKey() {
            return this.f119136OooOo0o;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f119135OooOo;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.f119136OooOo0o;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.f119135OooOo;
            return (v != null ? v.hashCode() : 0) ^ iHashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            int i = C32963OooOo0.f119127OooOoo0;
            C32963OooOo0.this.OooO0O0();
            V v2 = this.f119135OooOo;
            this.f119135OooOo = v;
            return v2;
        }

        public final String toString() {
            String strValueOf = String.valueOf(this.f119136OooOo0o);
            String strValueOf2 = String.valueOf(this.f119135OooOo);
            return com.aspose.slides.OooOOO.OooO0O0(new StringBuilder(strValueOf2.length() + strValueOf.length() + 1), strValueOf, "=", strValueOf2);
        }
    }

    /* JADX INFO: renamed from: oO0OOOO0.OooOo0$OooO0OO */
    public class OooO0OO implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public boolean f119138OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f119139OooOo0o = -1;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f119141OooOoO0;

        public OooO0OO() {
        }

        public final Iterator<Map.Entry<K, V>> OooO00o() {
            if (this.f119141OooOoO0 == null) {
                this.f119141OooOoO0 = C32963OooOo0.this.f119131OooOoO0.entrySet().iterator();
            }
            return this.f119141OooOoO0;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f119139OooOo0o + 1 < C32963OooOo0.this.f119128OooOo.size() || OooO00o().hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.f119138OooOo = true;
            int i = this.f119139OooOo0o + 1;
            this.f119139OooOo0o = i;
            C32963OooOo0 c32963OooOo0 = C32963OooOo0.this;
            return i < c32963OooOo0.f119128OooOo.size() ? c32963OooOo0.f119128OooOo.get(this.f119139OooOo0o) : OooO00o().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f119138OooOo) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f119138OooOo = false;
            int i = C32963OooOo0.f119127OooOoo0;
            C32963OooOo0 c32963OooOo0 = C32963OooOo0.this;
            c32963OooOo0.OooO0O0();
            if (this.f119139OooOo0o >= c32963OooOo0.f119128OooOo.size()) {
                OooO00o().remove();
                return;
            }
            int i2 = this.f119139OooOo0o;
            this.f119139OooOo0o = i2 - 1;
            c32963OooOo0.OooO0oO(i2);
        }
    }

    /* JADX INFO: renamed from: oO0OOOO0.OooOo0$OooO0Oo, reason: case insensitive filesystem */
    public class C32964OooO0Oo extends AbstractSet<Map.Entry<K, V>> {
        public C32964OooO0Oo() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            C32963OooOo0.this.OooO0o((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            C32963OooOo0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C32963OooOo0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new OooO0OO();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C32963OooOo0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return C32963OooOo0.this.size();
        }
    }

    public C32963OooOo0(int i) {
        this.f119129OooOo0o = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int OooO00o(K k) {
        int i;
        int i2;
        int size = this.f119128OooOo.size();
        int i3 = size - 1;
        if (i3 < 0) {
            i = 0;
            while (i <= i3) {
                int i4 = (i + i3) / 2;
                int iCompareTo = k.compareTo(this.f119128OooOo.get(i4).f119136OooOo0o);
                if (iCompareTo < 0) {
                    i3 = i4 - 1;
                } else {
                    if (iCompareTo <= 0) {
                        return i4;
                    }
                    i = i4 + 1;
                }
            }
            i2 = i + 1;
        } else {
            int iCompareTo2 = k.compareTo(this.f119128OooOo.get(i3).f119136OooOo0o);
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i3;
                }
                i = 0;
                while (i <= i3) {
                }
                i2 = i + 1;
            }
        }
        return -i2;
    }

    public final void OooO0O0() {
        if (this.f119130OooOoO) {
            throw new UnsupportedOperationException();
        }
    }

    public final Iterable<Map.Entry<K, V>> OooO0Oo() {
        return this.f119131OooOoO0.isEmpty() ? OooO00o.f119134OooO0O0 : this.f119131OooOoO0.entrySet();
    }

    public final V OooO0o(K k, V v) {
        OooO0O0();
        int iOooO00o = OooO00o(k);
        if (iOooO00o >= 0) {
            return this.f119128OooOo.get(iOooO00o).setValue(v);
        }
        OooO0O0();
        boolean zIsEmpty = this.f119128OooOo.isEmpty();
        int i = this.f119129OooOo0o;
        if (zIsEmpty && !(this.f119128OooOo instanceof ArrayList)) {
            this.f119128OooOo = new ArrayList(i);
        }
        int i2 = -(iOooO00o + 1);
        if (i2 >= i) {
            return OooO0o0().put(k, v);
        }
        if (this.f119128OooOo.size() == i) {
            C32963OooOo0<K, V>.OooO0O0 oooO0O0Remove = this.f119128OooOo.remove(i - 1);
            OooO0o0().put(oooO0O0Remove.f119136OooOo0o, oooO0O0Remove.f119135OooOo);
        }
        this.f119128OooOo.add(i2, new OooO0O0(k, v));
        return null;
    }

    public final SortedMap<K, V> OooO0o0() {
        OooO0O0();
        if (this.f119131OooOoO0.isEmpty() && !(this.f119131OooOoO0 instanceof TreeMap)) {
            this.f119131OooOoO0 = new TreeMap();
        }
        return (SortedMap) this.f119131OooOoO0;
    }

    public final V OooO0oO(int i) {
        OooO0O0();
        V v = this.f119128OooOo.remove(i).f119135OooOo;
        if (!this.f119131OooOoO0.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = OooO0o0().entrySet().iterator();
            List<C32963OooOo0<K, V>.OooO0O0> list = this.f119128OooOo;
            Map.Entry<K, V> next = it.next();
            list.add(new OooO0O0(next.getKey(), next.getValue()));
            it.remove();
        }
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        OooO0O0();
        if (!this.f119128OooOo.isEmpty()) {
            this.f119128OooOo.clear();
        }
        if (this.f119131OooOoO0.isEmpty()) {
            return;
        }
        this.f119131OooOoO0.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return OooO00o(comparable) >= 0 || this.f119131OooOoO0.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f119132OooOoOO == null) {
            this.f119132OooOoOO = new C32964OooO0Oo();
        }
        return this.f119132OooOoOO;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iOooO00o = OooO00o(comparable);
        return iOooO00o >= 0 ? this.f119128OooOo.get(iOooO00o).f119135OooOo : this.f119131OooOoO0.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        OooO0O0();
        Comparable comparable = (Comparable) obj;
        int iOooO00o = OooO00o(comparable);
        if (iOooO00o >= 0) {
            return OooO0oO(iOooO00o);
        }
        if (this.f119131OooOoO0.isEmpty()) {
            return null;
        }
        return this.f119131OooOoO0.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f119131OooOoO0.size() + this.f119128OooOo.size();
    }
}
