package o0000Ooo;

/* JADX INFO: renamed from: o0000Ooo.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24234OooO0oo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final long f81483OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final long f81484OooO0OO = C24231OooO0o.OooO0O0(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ int f81485OooO0Oo = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f81486OooO00o;

    static {
        float f = 0;
        f81483OooO0O0 = C24231OooO0o.OooO0O0(f, f);
    }

    public static final float OooO00o(long j) {
        if (j != f81484OooO0OO) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("DpSize is unspecified");
    }

    public static final float OooO0O0(long j) {
        if (j != f81484OooO0OO) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("DpSize is unspecified");
    }

    public static String OooO0OO(long j) {
        if (j == f81484OooO0OO) {
            return "DpSize.Unspecified";
        }
        return ((Object) C24232OooO0o0.OooO0O0(OooO0O0(j))) + " x " + ((Object) C24232OooO0o0.OooO0O0(OooO00o(j)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C24234OooO0oo) {
            return this.f81486OooO00o == ((C24234OooO0oo) obj).f81486OooO00o;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f81486OooO00o);
    }

    public final String toString() {
        return OooO0OO(this.f81486OooO00o);
    }
}
