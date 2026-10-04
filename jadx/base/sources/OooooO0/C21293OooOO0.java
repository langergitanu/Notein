package OooooO0;

/* JADX INFO: renamed from: OooooO0.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21293OooOO0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final long f61728OooO0O0 = C21294OooOO0O.OooO00o(0.0f, 0.0f);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final long f61729OooO0OO = C21294OooOO0O.OooO00o(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ int f61730OooO0Oo = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f61731OooO00o;

    public static final boolean OooO00o(long j, long j2) {
        return j == j2;
    }

    public static final float OooO0O0(long j) {
        if (j != f61729OooO0OO) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("Size is unspecified");
    }

    public static final float OooO0OO(long j) {
        return Math.min(Math.abs(OooO0Oo(j)), Math.abs(OooO0O0(j)));
    }

    public static final float OooO0Oo(long j) {
        if (j != f61729OooO0OO) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("Size is unspecified");
    }

    public static String OooO0o(long j) {
        if (j == f61729OooO0OO) {
            return "Size.Unspecified";
        }
        return "Size(" + C21287OooO0OO.OooO0O0(OooO0Oo(j)) + ", " + C21287OooO0OO.OooO0O0(OooO0O0(j)) + ')';
    }

    public static final boolean OooO0o0(long j) {
        return OooO0Oo(j) <= 0.0f || OooO0O0(j) <= 0.0f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C21293OooOO0) {
            return this.f61731OooO00o == ((C21293OooOO0) obj).f61731OooO00o;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f61731OooO00o);
    }

    public final String toString() {
        return OooO0o(this.f61731OooO00o);
    }
}
