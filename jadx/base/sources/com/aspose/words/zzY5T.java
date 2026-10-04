package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY5T {
    public static int zzjJ(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        int i2 = 4;
        if (i != 4) {
            i2 = 5;
            if (i != 5) {
                if (i == 7) {
                    return 7;
                }
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: textOrientation");
            }
        }
        return i2;
    }

    public static int zzjK(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 3;
        }
        int i2 = 4;
        if (i != 4) {
            i2 = 5;
            if (i != 5) {
                if (i == 7) {
                    return 7;
                }
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: textFlow");
            }
        }
        return i2;
    }
}
