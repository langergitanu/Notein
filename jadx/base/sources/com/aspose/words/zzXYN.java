package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzXYN {
    public static int zzXa(long j) {
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j;
    }

    public static int zzYX(int i, boolean z) {
        return (i * 1024) + (z ? -251658240 : WarningType.UNEXPECTED_CONTENT_CATEGORY);
    }

    public static int zzYY(int i, boolean z) {
        return i - (z ? -251658240 : WarningType.UNEXPECTED_CONTENT_CATEGORY);
    }
}
