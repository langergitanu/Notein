package o0000Ooo;

/* JADX INFO: renamed from: o0000Ooo.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24243OooOOo0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final long f81501OooO0O0 = C24242OooOOo.OooO00o(0.0f, 0.0f);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ int f81502OooO0OO = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f81503OooO00o;

    public static long OooO00o(float f, float f2, long j, int i) {
        if ((i & 1) != 0) {
            f = OooO0O0(j);
        }
        if ((i & 2) != 0) {
            f2 = OooO0OO(j);
        }
        return C24242OooOOo.OooO00o(f, f2);
    }

    public static final float OooO0O0(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float OooO0OO(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final long OooO0Oo(long j, long j2) {
        return C24242OooOOo.OooO00o(OooO0O0(j) - OooO0O0(j2), OooO0OO(j) - OooO0OO(j2));
    }

    public static final long OooO0o0(long j, long j2) {
        return C24242OooOOo.OooO00o(OooO0O0(j2) + OooO0O0(j), OooO0OO(j2) + OooO0OO(j));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C24243OooOOo0) {
            return this.f81503OooO00o == ((C24243OooOOo0) obj).f81503OooO00o;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f81503OooO00o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j = this.f81503OooO00o;
        sb.append(OooO0O0(j));
        sb.append(", ");
        sb.append(OooO0OO(j));
        sb.append(") px/sec");
        return sb.toString();
    }
}
