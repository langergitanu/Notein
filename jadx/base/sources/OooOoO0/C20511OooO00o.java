package OooOoO0;

import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: OooOoO0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20511OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f58580OooO00o = new int[0];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final long[] f58581OooO0O0 = new long[0];

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Object[] f58582OooO0OO = new Object[0];

    public static final int OooO00o(int i, long[] array, long j) {
        OooOOO0.OooO0oO(array, "array");
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = array[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    public static final int OooO0O0(int[] array, int i, int i2) {
        OooOOO0.OooO0oO(array, "array");
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = array[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }
}
