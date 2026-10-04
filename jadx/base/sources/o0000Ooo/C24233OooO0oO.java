package o0000Ooo;

/* JADX INFO: renamed from: o0000Ooo.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24233OooO0oO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final long f81480OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ int f81481OooO0OO = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f81482OooO00o;

    static {
        float f = 0;
        C24231OooO0o.OooO00o(f, f);
        f81480OooO0O0 = C24231OooO0o.OooO00o(Float.NaN, Float.NaN);
    }

    public static final float OooO00o(long j) {
        if (j != f81480OooO0O0) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("DpOffset is unspecified");
    }

    public static final float OooO0O0(long j) {
        if (j != f81480OooO0O0) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("DpOffset is unspecified");
    }

    public static String OooO0OO(long j) {
        if (j == f81480OooO0O0) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) C24232OooO0o0.OooO0O0(OooO00o(j))) + ", " + ((Object) C24232OooO0o0.OooO0O0(OooO0O0(j))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C24233OooO0oO) {
            return this.f81482OooO00o == ((C24233OooO0oO) obj).f81482OooO00o;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f81482OooO00o);
    }

    public final String toString() {
        return OooO0OO(this.f81482OooO00o);
    }
}
