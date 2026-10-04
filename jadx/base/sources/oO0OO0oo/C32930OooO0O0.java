package oO0OO0oo;

import com.google.common.collect.ImmutableMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: oO0OO0oo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32930OooO0O0<V> implements Map<Class<?>, V> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final ImmutableMap f118809OooOo0o;

    public C32930OooO0O0(ImmutableMap immutableMap) {
        this.f118809OooOo0o = immutableMap;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof Class)) {
            throw new IllegalArgumentException("Key must be a class");
        }
        return this.f118809OooOo0o.containsKey(((Class) obj).getName());
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f118809OooOo0o.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<Class<?>, V>> entrySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of entrySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        if (!(obj instanceof Class)) {
            throw new IllegalArgumentException("Key must be a class");
        }
        return this.f118809OooOo0o.get(((Class) obj).getName());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f118809OooOo0o.isEmpty();
    }

    @Override // java.util.Map
    public final Set<Class<?>> keySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of keySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public final Object put(Class<?> cls, Object obj) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends Class<?>, ? extends V> map) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f118809OooOo0o.size();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        return this.f118809OooOo0o.values();
    }
}
