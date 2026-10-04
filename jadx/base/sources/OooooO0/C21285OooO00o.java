package OooooO0;

/* JADX INFO: renamed from: OooooO0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21285OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final long f61710OooO00o = C21286OooO0O0.OooO00o(0.0f, 0.0f);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f61711OooO0O0 = 0;

    public static final boolean OooO00o(long j, long j2) {
        return j == j2;
    }

    public static final float OooO0O0(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float OooO0OO(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static String OooO0Oo(long j) {
        if (OooO0O0(j) == OooO0OO(j)) {
            return "CornerRadius.circular(" + C21287OooO0OO.OooO0O0(OooO0O0(j)) + ')';
        }
        return "CornerRadius.elliptical(" + C21287OooO0OO.OooO0O0(OooO0O0(j)) + ", " + C21287OooO0OO.OooO0O0(OooO0OO(j)) + ')';
    }
}
