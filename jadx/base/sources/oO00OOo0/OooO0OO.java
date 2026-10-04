package oO00OOo0;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.OooOOO0;
import oO0O00.InterfaceC32497OooO0Oo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO<Key, Value> implements Map<Key, Value>, InterfaceC32497OooO0Oo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ConcurrentHashMap<Key, Value> f115797OooOo0o = new ConcurrentHashMap<>(32);

    @Override // java.util.Map
    public final void clear() {
        this.f115797OooOo0o.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f115797OooOo0o.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f115797OooOo0o.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<Key, Value>> entrySet() {
        Set<Map.Entry<Key, Value>> setEntrySet = this.f115797OooOo0o.entrySet();
        OooOOO0.OooO0o(setEntrySet, "delegate.entries");
        return setEntrySet;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj instanceof Map) {
            return OooOOO0.OooO0O0(obj, this.f115797OooOo0o);
        }
        return false;
    }

    @Override // java.util.Map
    public final Value get(Object obj) {
        return this.f115797OooOo0o.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f115797OooOo0o.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f115797OooOo0o.isEmpty();
    }

    @Override // java.util.Map
    public final Set<Key> keySet() {
        Set<Key> setKeySet = this.f115797OooOo0o.keySet();
        OooOOO0.OooO0o(setKeySet, "delegate.keys");
        return setKeySet;
    }

    @Override // java.util.Map
    public final Value put(Key key, Value value) {
        return this.f115797OooOo0o.put(key, value);
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends Key, ? extends Value> from) {
        OooOOO0.OooO0oO(from, "from");
        this.f115797OooOo0o.putAll(from);
    }

    @Override // java.util.Map
    public final Value remove(Object obj) {
        return this.f115797OooOo0o.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.f115797OooOo0o.size();
    }

    public final String toString() {
        return "ConcurrentMapJvm by " + this.f115797OooOo0o;
    }

    @Override // java.util.Map
    public final Collection<Value> values() {
        Collection<Value> collectionValues = this.f115797OooOo0o.values();
        OooOOO0.OooO0o(collectionValues, "delegate.values");
        return collectionValues;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        return this.f115797OooOo0o.remove(obj, obj2);
    }
}
