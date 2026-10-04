package o00o0OO0;

/* JADX INFO: renamed from: o00o0OO0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25343OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f86338OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f86339OooO0O0;

    public C25343OooO0OO(long j, int i) {
        this.f86339OooO0O0 = j;
        this.f86338OooO00o = i;
    }

    public static C25343OooO0OO OooO00o(int i, int i2, String str) {
        if (i >= i2) {
            return null;
        }
        long j = 0;
        int i3 = i;
        while (i3 < i2) {
            char cCharAt = str.charAt(i3);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j = (j * 10) + ((long) (cCharAt - '0'));
            if (j > 2147483647L) {
                return null;
            }
            i3++;
        }
        if (i3 == i) {
            return null;
        }
        return new C25343OooO0OO(j, i3);
    }
}
