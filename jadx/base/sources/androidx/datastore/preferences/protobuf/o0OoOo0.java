package androidx.datastore.preferences.protobuf;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class o0OoOo0<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final /* synthetic */ int f64590OooOoo0 = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Map<K, V> f64591OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public List<o0OoOo0<K, V>.OooO00o> f64592OooOo0o = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public volatile o0OoOo0<K, V>.OooO0OO f64593OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f64594OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Map<K, V> f64595OooOoOO;

    public class OooO00o implements Map.Entry<K, V>, Comparable<o0OoOo0<K, V>.OooO00o> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public V f64596OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final K f64597OooOo0o;

        public OooO00o() {
            throw null;
        }

        public OooO00o(K k, V v) {
            this.f64597OooOo0o = k;
            this.f64596OooOo = v;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.f64597OooOo0o.compareTo(((OooO00o) obj).f64597OooOo0o);
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (obj != this) {
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    K k = this.f64597OooOo0o;
                    if (k == null ? key == null : k.equals(key)) {
                        V v = this.f64596OooOo;
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
            return this.f64597OooOo0o;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f64596OooOo;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.f64597OooOo0o;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.f64596OooOo;
            return (v != null ? v.hashCode() : 0) ^ iHashCode;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            int i = o0OoOo0.f64590OooOoo0;
            o0OoOo0.this.OooO0O0();
            V v2 = this.f64596OooOo;
            this.f64596OooOo = v;
            return v2;
        }

        public final String toString() {
            return this.f64597OooOo0o + "=" + this.f64596OooOo;
        }
    }

    public class OooO0O0 implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public boolean f64599OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f64600OooOo0o = -1;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public Iterator<Map.Entry<K, V>> f64602OooOoO0;

        public OooO0O0() {
        }

        public final Iterator<Map.Entry<K, V>> OooO00o() {
            if (this.f64602OooOoO0 == null) {
                this.f64602OooOoO0 = o0OoOo0.this.f64591OooOo.entrySet().iterator();
            }
            return this.f64602OooOoO0;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.f64600OooOo0o + 1;
            o0OoOo0 o0oooo02 = o0OoOo0.this;
            return i < o0oooo02.f64592OooOo0o.size() || (!o0oooo02.f64591OooOo.isEmpty() && OooO00o().hasNext());
        }

        @Override // java.util.Iterator
        public final Object next() {
            this.f64599OooOo = true;
            int i = this.f64600OooOo0o + 1;
            this.f64600OooOo0o = i;
            o0OoOo0 o0oooo02 = o0OoOo0.this;
            return i < o0oooo02.f64592OooOo0o.size() ? o0oooo02.f64592OooOo0o.get(this.f64600OooOo0o) : OooO00o().next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f64599OooOo) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f64599OooOo = false;
            int i = o0OoOo0.f64590OooOoo0;
            o0OoOo0 o0oooo02 = o0OoOo0.this;
            o0oooo02.OooO0O0();
            if (this.f64600OooOo0o >= o0oooo02.f64592OooOo0o.size()) {
                OooO00o().remove();
                return;
            }
            int i2 = this.f64600OooOo0o;
            this.f64600OooOo0o = i2 - 1;
            o0oooo02.OooO(i2);
        }
    }

    public class OooO0OO extends AbstractSet<Map.Entry<K, V>> {
        public OooO0OO() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            o0OoOo0.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            o0OoOo0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = o0OoOo0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new OooO0O0();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            o0OoOo0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return o0OoOo0.this.size();
        }
    }

    public o0OoOo0() {
        Map<K, V> map = Collections.EMPTY_MAP;
        this.f64591OooOo = map;
        this.f64595OooOoOO = map;
    }

    public final V OooO(int i) {
        OooO0O0();
        V v = this.f64592OooOo0o.remove(i).f64596OooOo;
        if (!this.f64591OooOo.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = OooO0o().entrySet().iterator();
            List<o0OoOo0<K, V>.OooO00o> list = this.f64592OooOo0o;
            Map.Entry<K, V> next = it.next();
            list.add(new OooO00o(next.getKey(), next.getValue()));
            it.remove();
        }
        return v;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int OooO00o(K k) {
        int i;
        int i2;
        int size = this.f64592OooOo0o.size();
        int i3 = size - 1;
        if (i3 < 0) {
            i = 0;
            while (i <= i3) {
                int i4 = (i + i3) / 2;
                int iCompareTo = k.compareTo(this.f64592OooOo0o.get(i4).f64597OooOo0o);
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
            int iCompareTo2 = k.compareTo(this.f64592OooOo0o.get(i3).f64597OooOo0o);
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
        if (this.f64594OooOoO0) {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry<K, V> OooO0Oo(int i) {
        return this.f64592OooOo0o.get(i);
    }

    public final SortedMap<K, V> OooO0o() {
        OooO0O0();
        if (this.f64591OooOo.isEmpty() && !(this.f64591OooOo instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f64591OooOo = treeMap;
            this.f64595OooOoOO = treeMap.descendingMap();
        }
        return (SortedMap) this.f64591OooOo;
    }

    public final Set OooO0o0() {
        return this.f64591OooOo.isEmpty() ? Collections.EMPTY_SET : this.f64591OooOo.entrySet();
    }

    public void OooO0oO() {
        if (this.f64594OooOoO0) {
            return;
        }
        this.f64591OooOo = this.f64591OooOo.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f64591OooOo);
        this.f64595OooOoOO = this.f64595OooOoOO.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f64595OooOoOO);
        this.f64594OooOoO0 = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: OooO0oo, reason: merged with bridge method [inline-methods] */
    public final V put(K k, V v) {
        OooO0O0();
        int iOooO00o = OooO00o(k);
        if (iOooO00o >= 0) {
            return this.f64592OooOo0o.get(iOooO00o).setValue(v);
        }
        OooO0O0();
        if (this.f64592OooOo0o.isEmpty() && !(this.f64592OooOo0o instanceof ArrayList)) {
            this.f64592OooOo0o = new ArrayList(16);
        }
        int i = -(iOooO00o + 1);
        if (i >= 16) {
            return OooO0o().put(k, v);
        }
        if (this.f64592OooOo0o.size() == 16) {
            o0OoOo0<K, V>.OooO00o oooO00oRemove = this.f64592OooOo0o.remove(15);
            OooO0o().put(oooO00oRemove.f64597OooOo0o, oooO00oRemove.f64596OooOo);
        }
        this.f64592OooOo0o.add(i, new OooO00o(k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        OooO0O0();
        if (!this.f64592OooOo0o.isEmpty()) {
            this.f64592OooOo0o.clear();
        }
        if (this.f64591OooOo.isEmpty()) {
            return;
        }
        this.f64591OooOo.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return OooO00o(comparable) >= 0 || this.f64591OooOo.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f64593OooOoO == null) {
            this.f64593OooOoO = new OooO0OO();
        }
        return this.f64593OooOoO;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0OoOo0)) {
            return super.equals(obj);
        }
        o0OoOo0 o0oooo02 = (o0OoOo0) obj;
        int size = size();
        if (size == o0oooo02.size()) {
            int size2 = this.f64592OooOo0o.size();
            if (size2 != o0oooo02.f64592OooOo0o.size()) {
                return ((AbstractSet) entrySet()).equals(o0oooo02.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (OooO0Oo(i).equals(o0oooo02.OooO0Oo(i))) {
                }
            }
            if (size2 != size) {
                return this.f64591OooOo.equals(o0oooo02.f64591OooOo);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iOooO00o = OooO00o(comparable);
        return iOooO00o >= 0 ? this.f64592OooOo0o.get(iOooO00o).f64596OooOo : this.f64591OooOo.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f64592OooOo0o.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += this.f64592OooOo0o.get(i).hashCode();
        }
        return this.f64591OooOo.size() > 0 ? this.f64591OooOo.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        OooO0O0();
        Comparable comparable = (Comparable) obj;
        int iOooO00o = OooO00o(comparable);
        if (iOooO00o >= 0) {
            return OooO(iOooO00o);
        }
        if (this.f64591OooOo.isEmpty()) {
            return null;
        }
        return this.f64591OooOo.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f64591OooOo.size() + this.f64592OooOo0o.size();
    }
}
