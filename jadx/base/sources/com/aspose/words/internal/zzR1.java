package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzR1 {
    public static zzZQ9 zzLW = new zzZQ9(2006, 1, 5, 19, 9, 1);
    private static boolean zzLX = false;

    public static zzZQ9 zzQO() {
        return zzLX ? zzLW : zzZQ9.zzQO();
    }

    public static zzZQ9 zzX(int i, int i2, int i3, int i4, int i5) {
        return zzZ(i, i2, i3, i4, i5, 0, 0, 0L);
    }

    public static zzZQ9 zzY(zzZQ9 zzzq9) {
        return zzLX ? zzzq9 : zzzq9.zzkF();
    }

    public static zzZQ9 zzZ(int i, int i2, int i3, int i4, int i5, int i6) {
        return zzZ(i, i2, i3, i4, i5, i6, 0, 2L);
    }

    public static zzZQ9 zzZ(long j, String str) {
        if (j >= 0) {
            return new zzZQ9(j + 504911232000000000L, 1L);
        }
        throw new IllegalArgumentException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Specified argument was out of the range of valid values.\r\nParameter name: ", str));
    }

    public static long zzZ(zzZQ9 zzzq9, String str) {
        long jZzkP = zzzq9.zzkP() - 504911232000000000L;
        if (jZzkP >= 0) {
            return jZzkP;
        }
        throw new IllegalArgumentException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Specified argument was out of the range of valid values.\r\nParameter name: ", str));
    }

    public static zzZQ9 zzZ(zzZQ9 zzzq9) {
        return zzLX ? zzzq9 : zzzq9.zzkK();
    }

    private static zzZQ9 zzZ(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        try {
            return new zzZQ9(i, i2, i3, i4, i5, i6, 0, j);
        } catch (Exception unused) {
            return zzZQ9.zz35;
        }
    }
}
