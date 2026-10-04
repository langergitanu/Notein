package oOo000Oo;

import OoooO0O.C21157OooO0Oo;
import OoooO0O.C21163OooOOOo;
import OoooO0O.C21164OooOOo;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o0OoO0oo.C28918o00o0O;

/* JADX INFO: renamed from: oOo000Oo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC34423OooO0o0<K, V> implements Map<K, V>, oO0O00.OooO00o {
    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set<Map.Entry<K, V>> setEntrySet = entrySet();
        if (setEntrySet.isEmpty()) {
            return false;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((Map.Entry) it.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return new OoooO0O.OooOOO((C21157OooO0Oo) this);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (((C21157OooO0Oo) this).f61381OooOo != map.size()) {
            return false;
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            return true;
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (entry != null) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                V v = get(key);
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(value, v) && (v != null || containsKey(key))) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((C21157OooO0Oo) this).f61381OooOo == 0;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return new C21163OooOOOo((C21157OooO0Oo) this);
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return ((C21157OooO0Oo) this).f61381OooOo;
    }

    public final String toString() {
        return OooOo.o000oOoO(entrySet(), ", ", "{", "}", new C28918o00o0O(this, 1), 24);
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return new C21164OooOOo((C21157OooO0Oo) this);
    }
}
