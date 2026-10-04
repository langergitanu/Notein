package oO0OOOO0;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOO0O extends C32957OooOO0o {

    public static class OooO00o<K> implements Map.Entry<K, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public Map.Entry<K, OooOO0O> f119096OooOo0o;

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.f119096OooOo0o.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            OooOO0O value = this.f119096OooOo0o.getValue();
            if (value == null) {
                return null;
            }
            return value.OooO00o();
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof InterfaceC32958OooOOOo)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            OooOO0O value = this.f119096OooOo0o.getValue();
            InterfaceC32958OooOOOo interfaceC32958OooOOOo = value.f119098OooO00o;
            value.f119098OooO00o = (InterfaceC32958OooOOOo) obj;
            return interfaceC32958OooOOOo;
        }
    }

    public static class OooO0O0<K> implements Iterator<Map.Entry<K, Object>> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public Iterator<Map.Entry<K, Object>> f119097OooOo0o;

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f119097OooOo0o.hasNext();
        }

        @Override // java.util.Iterator
        public final Object next() {
            Map.Entry<K, Object> next = this.f119097OooOo0o.next();
            if (!(next.getValue() instanceof OooOO0O)) {
                return next;
            }
            OooO00o oooO00o = new OooO00o();
            oooO00o.f119096OooOo0o = next;
            return oooO00o;
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f119097OooOo0o.remove();
        }
    }

    public final InterfaceC32958OooOOOo OooO00o() {
        if (this.f119098OooO00o == null) {
            synchronized (this) {
                if (this.f119098OooO00o == null) {
                    try {
                        this.f119098OooO00o = null;
                    } catch (IOException unused) {
                    }
                }
            }
        }
        return this.f119098OooO00o;
    }

    public final boolean equals(Object obj) {
        return OooO00o().equals(obj);
    }

    public final int hashCode() {
        return OooO00o().hashCode();
    }

    public final String toString() {
        return OooO00o().toString();
    }
}
