package o0ooOoo;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;

/* JADX INFO: renamed from: o0ooOoo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31670OooO0O0<K, V> implements Map<K, V> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final HashMap f113208OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C31436OooO0Oo f113209OooOo0o;

    public C31670OooO0O0(HashMap map, C31436OooO0Oo c31436OooO0Oo) {
        this.f113208OooOo = map;
        this.f113209OooOo0o = c31436OooO0Oo;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f113209OooOo0o.clear();
        this.f113208OooOo.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f113208OooOo.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f113208OooOo.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return Collections.unmodifiableSet(this.f113208OooOo.entrySet());
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj instanceof C31670OooO0O0) {
            return ((C31670OooO0O0) obj).f113209OooOo0o.equals(this.f113209OooOo0o);
        }
        return false;
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        return (V) this.f113208OooOo.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f113209OooOo0o.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        return this.f113208OooOo.keySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public final V put(K k, V v) {
        this.f113209OooOo0o.o000OoOO(C31441OooOO0.OooOooo((String) k), ((InterfaceC31671OooO0OO) v).OooOOo0());
        return (V) this.f113208OooOo.put(k, v);
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        this.f113209OooOo0o.o000OOoO(C31441OooOO0.OooOooo((String) obj));
        return (V) this.f113208OooOo.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f113209OooOo0o.f112222OooOoO0.size();
    }

    public final String toString() {
        return this.f113208OooOo.toString();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return this.f113208OooOo.values();
    }
}
