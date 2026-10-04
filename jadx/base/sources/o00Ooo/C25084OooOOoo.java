package o00Ooo;

/* JADX INFO: renamed from: o00Ooo.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25084OooOOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f85133OooO00o;

    public static final boolean OooO00o(long j, long j2) {
        return j == j2;
    }

    public static String OooO0O0(long j) {
        return "PointerId(value=" + j + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C25084OooOOoo) {
            return this.f85133OooO00o == ((C25084OooOOoo) obj).f85133OooO00o;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f85133OooO00o);
    }

    public final String toString() {
        return OooO0O0(this.f85133OooO00o);
    }
}
