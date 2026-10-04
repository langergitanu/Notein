package com.aspose.words.internal;

import com.aspose.words.ref.RefInt;
import com.aspose.words.ref.RefLong;

/* JADX INFO: loaded from: classes5.dex */
final class zzS9 {
    public static boolean zzY(char[] cArr, int i, int i2, RefInt refInt) {
        int i3;
        refInt.set(0);
        while (i < i2) {
            char c = cArr[i];
            if (c <= '9' && c >= '0') {
                i3 = c - '0';
            } else if (c <= 'F' && c >= 'A') {
                i3 = c - '7';
            } else {
                if (c > 'f' || c < 'a') {
                    refInt.set(0);
                    return false;
                }
                i3 = c - 'W';
            }
            refInt.set(refInt.get() + (i3 << (((i2 - 1) - i) * 4)));
            i++;
        }
        return true;
    }

    public static int zzZ(char[] cArr, int i, int i2, RefInt refInt) {
        refInt.set(0);
        boolean z = cArr[i] == '-';
        if (z) {
            i++;
            i2--;
        }
        int i3 = i2 + i;
        while (i < i3) {
            int i4 = cArr[i] - '0';
            if (i4 < 0 || i4 > 9) {
                return 3;
            }
            int i5 = (refInt.get() * 10) - i4;
            if (i5 > refInt.get()) {
                for (int i6 = i + 1; i6 < i3; i6++) {
                    int i7 = cArr[i6] - '0';
                    if (i7 < 0 || i7 > 9) {
                        return 3;
                    }
                }
                return 2;
            }
            refInt.set(i5);
            i++;
        }
        if (!z) {
            if (refInt.get() == Integer.MIN_VALUE) {
                return 2;
            }
            refInt.set(-refInt.get());
        }
        return 1;
    }

    public static int zzZ(char[] cArr, int i, int i2, RefLong refLong) {
        refLong.set(0L);
        if (i2 == 0) {
            return 3;
        }
        boolean z = cArr[i] == '-';
        if (z) {
            if (i2 == 1) {
                return 3;
            }
            i++;
            i2--;
        }
        int i3 = i + i2;
        if (i2 > 19) {
            while (i < i3) {
                int i4 = cArr[i] - '0';
                if (i4 < 0 || i4 > 9) {
                    return 3;
                }
                i++;
            }
            return 2;
        }
        while (i < i3) {
            int i5 = cArr[i] - '0';
            if (i5 < 0 || i5 > 9) {
                return 3;
            }
            long j = (refLong.get() * 10) - ((long) i5);
            if (j > refLong.get()) {
                for (int i6 = i + 1; i6 < i3; i6++) {
                    int i7 = cArr[i6] - '0';
                    if (i7 < 0 || i7 > 9) {
                        return 3;
                    }
                }
                return 2;
            }
            refLong.set(j);
            i++;
        }
        if (!z) {
            if (refLong.get() == Long.MIN_VALUE) {
                return 2;
            }
            refLong.set(-refLong.get());
        }
        return 1;
    }
}
