package oO00Ooo;

import java.util.List;

/* JADX INFO: renamed from: oO00Ooo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32298OooO0oO extends AbstractC32308OooOo0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<Object> f116192OooO00o;

    public C32298OooO0oO(List<Object> list) {
        if (list == null) {
            throw new NullPointerException("Null entries");
        }
        this.f116192OooO00o = list;
    }

    @Override // oO00Ooo.AbstractC32308OooOo0o
    public final List<Object> OooO00o() {
        return this.f116192OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC32308OooOo0o) {
            return this.f116192OooO00o.equals(((AbstractC32308OooOo0o) obj).OooO00o());
        }
        return false;
    }

    public final int hashCode() {
        return this.f116192OooO00o.hashCode() ^ 1000003;
    }

    public final String toString() {
        return com.google.firebase.firestore.util.OooOOO.OooO0O0("}", new StringBuilder("Tracestate{entries="), this.f116192OooO00o);
    }
}
