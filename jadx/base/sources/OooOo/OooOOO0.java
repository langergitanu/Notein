package OooOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final long[] f58496OooO00o;

    static {
        long[] jArr;
        C20482OooOo0 c20482OooOo0 = new C20482OooOo0();
        int iOooO0o = C20491OooOooo.OooO0o(0);
        int iMax = iOooO0o > 0 ? Math.max(7, C20491OooOooo.OooO0o0(iOooO0o)) : 0;
        c20482OooOo0.f58491OooO0OO = iMax;
        if (iMax == 0) {
            jArr = C20491OooOooo.f58536OooO00o;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            Oooo.OooO0OO.OooOOOo(jArr);
        }
        c20482OooOo0.f58489OooO00o = jArr;
        int i = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i] = (jArr[i] & (~j)) | j;
        c20482OooOo0.f58490OooO0O0 = new long[iMax];
        f58496OooO00o = new long[0];
    }
}
