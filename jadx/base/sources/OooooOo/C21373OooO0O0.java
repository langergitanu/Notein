package OooooOo;

/* JADX INFO: renamed from: OooooOo.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21373OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final long f61822OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final long f61823OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final long f61824OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final long f61825OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ int f61826OooO0o0 = 0;

    static {
        long j = 3;
        long j2 = j << 32;
        f61822OooO00o = (((long) 0) & 4294967295L) | j2;
        f61823OooO0O0 = (((long) 1) & 4294967295L) | j2;
        f61824OooO0OO = j2 | (((long) 2) & 4294967295L);
        f61825OooO0Oo = (j & 4294967295L) | (((long) 4) << 32);
    }

    public static final boolean OooO00o(long j, long j2) {
        return j == j2;
    }

    public static String OooO0O0(long j) {
        return OooO00o(j, f61822OooO00o) ? "Rgb" : OooO00o(j, f61823OooO0O0) ? "Xyz" : OooO00o(j, f61824OooO0OO) ? "Lab" : OooO00o(j, f61825OooO0Oo) ? "Cmyk" : "Unknown";
    }
}
