package o0000Ooo;

/* JADX INFO: renamed from: o0000Ooo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24237OooOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f81492OooO00o;

    public static final boolean OooO00o(long j, long j2) {
        return j == j2;
    }

    public static String OooO0O0(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C24237OooOO0o) {
            return this.f81492OooO00o == ((C24237OooOO0o) obj).f81492OooO00o;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f81492OooO00o);
    }

    public final String toString() {
        return OooO0O0(this.f81492OooO00o);
    }
}
