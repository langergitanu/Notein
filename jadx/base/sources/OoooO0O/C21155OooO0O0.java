package OoooO0O;

import java.util.Map;

/* JADX INFO: renamed from: OoooO0O.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C21155OooO0O0<K, V> implements Map.Entry<K, V>, oO0O00.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final V f61376OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final K f61377OooOo0o;

    public C21155OooO0O0(K k, V v) {
        this.f61377OooOo0o = k;
        this.f61376OooOo = v;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && kotlin.jvm.internal.OooOOO0.OooO0O0(entry.getKey(), this.f61377OooOo0o) && kotlin.jvm.internal.OooOOO0.OooO0O0(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.f61377OooOo0o;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.f61376OooOo;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        K k = this.f61377OooOo0o;
        int iHashCode = k != null ? k.hashCode() : 0;
        V value = getValue();
        return (value != null ? value.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f61377OooOo0o);
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
