package OooOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f58488OooO00o;

    static {
        long[] jArr;
        OooOo00 oooOo00 = new OooOo00();
        int iOooO0o = C20491OooOooo.OooO0o(0);
        int iMax = iOooO0o > 0 ? Math.max(7, C20491OooOooo.OooO0o0(iOooO0o)) : 0;
        oooOo00.f58487OooO0OO = iMax;
        if (iMax == 0) {
            jArr = C20491OooOooo.f58536OooO00o;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            Oooo.OooO0OO.OooOOOo(jArr);
        }
        oooOo00.f58485OooO00o = jArr;
        int i = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i] = (jArr[i] & (~j)) | j;
        C20491OooOooo.OooO0OO(oooOo00.f58487OooO0OO);
        oooOo00.f58486OooO0O0 = new int[iMax];
        f58488OooO00o = new int[0];
    }
}
