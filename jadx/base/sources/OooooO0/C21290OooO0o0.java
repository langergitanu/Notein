package OooooO0;

/* JADX INFO: renamed from: OooooO0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21290OooO0o0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final long f61718OooO0O0 = C21289OooO0o.OooO00o(0.0f, 0.0f);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final long f61719OooO0OO = C21289OooO0o.OooO00o(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final long f61720OooO0Oo = C21289OooO0o.OooO00o(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ int f61721OooO0o0 = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f61722OooO00o;

    public static final boolean OooO00o(long j, long j2) {
        return j == j2;
    }

    public static final float OooO0O0(long j) {
        return (float) Math.sqrt((OooO0Oo(j) * OooO0Oo(j)) + (OooO0OO(j) * OooO0OO(j)));
    }

    public static final float OooO0OO(long j) {
        if (j != f61720OooO0Oo) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        throw new IllegalStateException("Offset is unspecified");
    }

    public static final float OooO0Oo(long j) {
        if (j != f61720OooO0Oo) {
            return Float.intBitsToFloat((int) (j & 4294967295L));
        }
        throw new IllegalStateException("Offset is unspecified");
    }

    public static final long OooO0o(long j, long j2) {
        return C21289OooO0o.OooO00o(OooO0OO(j2) + OooO0OO(j), OooO0Oo(j2) + OooO0Oo(j));
    }

    public static final long OooO0o0(long j, long j2) {
        return C21289OooO0o.OooO00o(OooO0OO(j) - OooO0OO(j2), OooO0Oo(j) - OooO0Oo(j2));
    }

    public static final long OooO0oO(float f, long j) {
        return C21289OooO0o.OooO00o(OooO0OO(j) * f, OooO0Oo(j) * f);
    }

    public static String OooO0oo(long j) {
        if (!C21289OooO0o.OooO0o(j)) {
            return "Offset.Unspecified";
        }
        return "Offset(" + C21287OooO0OO.OooO0O0(OooO0OO(j)) + ", " + C21287OooO0OO.OooO0O0(OooO0Oo(j)) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C21290OooO0o0) {
            return this.f61722OooO00o == ((C21290OooO0o0) obj).f61722OooO00o;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f61722OooO00o);
    }

    public final String toString() {
        return OooO0oo(this.f61722OooO00o);
    }
}
