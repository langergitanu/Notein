package o0oooOO0;

/* JADX INFO: renamed from: o0oooOO0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31838OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final long[] f113465OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int[] f113466OooO0O0;

    static {
        long[] jArr = new long[19];
        f113465OooO00o = jArr;
        jArr[0] = 1;
        int i = 1;
        int i2 = 1;
        while (true) {
            long[] jArr2 = f113465OooO00o;
            if (i2 >= jArr2.length) {
                break;
            }
            jArr2[i2] = jArr2[i2 - 1] * 10;
            i2++;
        }
        int[] iArr = new int[10];
        f113466OooO0O0 = iArr;
        iArr[0] = 1;
        while (true) {
            int[] iArr2 = f113466OooO0O0;
            if (i >= iArr2.length) {
                return;
            }
            iArr2[i] = iArr2[i - 1] * 10;
            i++;
        }
    }

    public static int OooO00o(long j, byte[] bArr, int i, int i2, boolean z) {
        while (j > 2147483647L && (!z || j > 0)) {
            long j2 = f113465OooO00o[i];
            j -= j2 * (j / j2);
            bArr[i2] = (byte) (r3 + 48);
            i--;
            i2++;
        }
        int i3 = (int) j;
        while (i >= 0 && (!z || i3 > 0)) {
            int i4 = f113466OooO0O0[i];
            int i5 = i3 / i4;
            i3 -= i4 * i5;
            bArr[i2] = (byte) (i5 + 48);
            i--;
            i2++;
        }
        return i2;
    }
}
