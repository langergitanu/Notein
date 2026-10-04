package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21808OooOoo extends C21810OooOooO {

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.OooOoo$OooO00o */
    public static class OooO00o<K> implements Map.Entry<K, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public Map.Entry<K, C21808OooOoo> f64487OooOo0o;

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f64487OooOo0o.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            C21808OooOoo value = this.f64487OooOo0o.getValue();
            if (value == null) {
                return null;
            }
            return value.OooO00o(null);
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof InterfaceC21822OoooO0)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            C21808OooOoo value = this.f64487OooOo0o.getValue();
            InterfaceC21822OoooO0 interfaceC21822OoooO0 = value.f64501OooO00o;
            value.f64502OooO0O0 = null;
            value.f64501OooO00o = (InterfaceC21822OoooO0) obj;
            return interfaceC21822OoooO0;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.OooOoo$OooO0O0 */
    public static class OooO0O0<K> implements Iterator<Map.Entry<K, Object>> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public Iterator<Map.Entry<K, Object>> f64488OooOo0o;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f64488OooOo0o.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry<K, Object> next = this.f64488OooOo0o.next();
            if (!(next.getValue() instanceof C21808OooOoo)) {
                return next;
            }
            OooO00o oooO00o = new OooO00o();
            oooO00o.f64487OooOo0o = next;
            return oooO00o;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f64488OooOo0o.remove();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.C21810OooOooO
    public final boolean equals(Object obj) {
        return OooO00o(null).equals(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.C21810OooOooO
    public final int hashCode() {
        return OooO00o(null).hashCode();
    }

    public final String toString() {
        return OooO00o(null).toString();
    }
}
