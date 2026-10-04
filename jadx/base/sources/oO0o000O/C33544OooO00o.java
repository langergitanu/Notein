package oO0o000O;

import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: oO0o000O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33544OooO00o<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final T f121140OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final T f121141OooO0O0;

    public C33544OooO00o(T t, T t2) {
        this.f121140OooO00o = t;
        this.f121141OooO0O0 = t2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33544OooO00o)) {
            return false;
        }
        C33544OooO00o c33544OooO00o = (C33544OooO00o) obj;
        return OooOOO0.OooO0O0(this.f121140OooO00o, c33544OooO00o.f121140OooO00o) && OooOOO0.OooO0O0(this.f121141OooO0O0, c33544OooO00o.f121141OooO0O0);
    }

    public final int hashCode() {
        T t = this.f121140OooO00o;
        int iHashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.f121141OooO0O0;
        return iHashCode + (t2 != null ? t2.hashCode() : 0);
    }

    public final String toString() {
        return "ApproximationBounds(lower=" + this.f121140OooO00o + ", upper=" + this.f121141OooO0O0 + ')';
    }
}
