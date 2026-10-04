package oO0OOo0o;

import com.google.common.base.Objects;
import java.util.IdentityHashMap;
import java.util.Map;

/* JADX INFO: renamed from: oO0OOo0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33058OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C33058OooO00o f119518OooO0O0 = new C33058OooO00o(new IdentityHashMap());

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final IdentityHashMap<OooO0O0<?>, Object> f119519OooO00o;

    /* JADX INFO: renamed from: oO0OOo0o.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20297OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public C33058OooO00o f119520OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public IdentityHashMap<OooO0O0<?>, Object> f119521OooO0O0;

        public C20297OooO00o(C33058OooO00o c33058OooO00o) {
            this.f119520OooO00o = c33058OooO00o;
        }

        public final C33058OooO00o OooO00o() {
            if (this.f119521OooO0O0 != null) {
                for (Map.Entry<OooO0O0<?>, Object> entry : this.f119520OooO00o.f119519OooO00o.entrySet()) {
                    if (!this.f119521OooO0O0.containsKey(entry.getKey())) {
                        this.f119521OooO0O0.put(entry.getKey(), entry.getValue());
                    }
                }
                this.f119520OooO00o = new C33058OooO00o(this.f119521OooO0O0);
                this.f119521OooO0O0 = null;
            }
            return this.f119520OooO00o;
        }

        public final void OooO0O0(OooO0O0 oooO0O0, Object obj) {
            if (this.f119521OooO0O0 == null) {
                this.f119521OooO0O0 = new IdentityHashMap<>(1);
            }
            this.f119521OooO0O0.put(oooO0O0, obj);
        }
    }

    /* JADX INFO: renamed from: oO0OOo0o.OooO00o$OooO0O0 */
    public static final class OooO0O0<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f119522OooO00o;

        public OooO0O0(String str) {
            this.f119522OooO00o = str;
        }

        public final String toString() {
            return this.f119522OooO00o;
        }
    }

    public C33058OooO00o(IdentityHashMap<OooO0O0<?>, Object> identityHashMap) {
        this.f119519OooO00o = identityHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C33058OooO00o.class != obj.getClass()) {
            return false;
        }
        IdentityHashMap<OooO0O0<?>, Object> identityHashMap = this.f119519OooO00o;
        int size = identityHashMap.size();
        IdentityHashMap<OooO0O0<?>, Object> identityHashMap2 = ((C33058OooO00o) obj).f119519OooO00o;
        if (size != identityHashMap2.size()) {
            return false;
        }
        for (Map.Entry<OooO0O0<?>, Object> entry : identityHashMap.entrySet()) {
            if (!identityHashMap2.containsKey(entry.getKey()) || !Objects.equal(entry.getValue(), identityHashMap2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry<OooO0O0<?>, Object> entry : this.f119519OooO00o.entrySet()) {
            iHashCode += Objects.hashCode(entry.getKey(), entry.getValue());
        }
        return iHashCode;
    }

    public final String toString() {
        return this.f119519OooO00o.toString();
    }
}
