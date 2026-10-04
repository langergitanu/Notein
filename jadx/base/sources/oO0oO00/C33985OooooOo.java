package oO0oO00;

import java.util.Map;
import oO0o.C33532OooO0oO;
import oO0o.InterfaceC33531OooO0o0;
import oO0o.OooOOO0;
import oO0o0ooO.InterfaceC33911OooO0OO;

/* JADX INFO: renamed from: oO0oO00.OooooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33985OooooOo<K, V> extends o000oOoO<K, V, Map.Entry<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C33532OooO0oO f122211OooO0OO;

    /* JADX INFO: renamed from: oO0oO00.OooooOo$OooO00o */
    public static final class OooO00o<K, V> implements Map.Entry<K, V>, oO0O00.OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final V f122212OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final K f122213OooOo0o;

        public OooO00o(K k, V v) {
            this.f122213OooOo0o = k;
            this.f122212OooOo = v;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f122213OooOo0o, oooO00o.f122213OooOo0o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f122212OooOo, oooO00o.f122212OooOo);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f122213OooOo0o;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.f122212OooOo;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.f122213OooOo0o;
            int iHashCode = (k == null ? 0 : k.hashCode()) * 31;
            V v = this.f122212OooOo;
            return iHashCode + (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final String toString() {
            return "MapEntry(key=" + this.f122213OooOo0o + ", value=" + this.f122212OooOo + ')';
        }
    }

    public C33985OooooOo(InterfaceC33911OooO0OO<K> interfaceC33911OooO0OO, InterfaceC33911OooO0OO<V> interfaceC33911OooO0OO2) {
        super(interfaceC33911OooO0OO, interfaceC33911OooO0OO2);
        this.f122211OooO0OO = oO0o.OooOO0O.OooO0OO("kotlin.collections.Map.Entry", OooOOO0.OooO0OO.f121134OooO00o, new InterfaceC33531OooO0o0[0], new C33984OooooOO(0, interfaceC33911OooO0OO, interfaceC33911OooO0OO2));
    }

    @Override // oO0oO00.o000oOoO
    public final Object OooO00o(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(entry, "<this>");
        return entry.getKey();
    }

    @Override // oO0oO00.o000oOoO
    public final Object OooO0O0(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        kotlin.jvm.internal.OooOOO0.OooO0oO(entry, "<this>");
        return entry.getValue();
    }

    @Override // oO0oO00.o000oOoO
    public final Object OooO0OO(Object obj, Object obj2) {
        return new OooO00o(obj, obj2);
    }

    @Override // oO0o0ooO.InterfaceC33911OooO0OO, oO0o0ooO.InterfaceC33910OooO0O0
    public final InterfaceC33531OooO0o0 getDescriptor() {
        return this.f122211OooO0OO;
    }
}
