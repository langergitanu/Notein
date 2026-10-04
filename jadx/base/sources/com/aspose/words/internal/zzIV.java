package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzIV {
    public static String zz0(long j) {
        if (j < 1) {
            return "";
        }
        while (j > 9999) {
            j -= 9999;
        }
        ArrayList<Integer> arrayListZzQ = zzIU.zzQ(j, 1);
        StringBuilder sb = new StringBuilder();
        for (int size = arrayListZzQ.size() - 1; size >= 0; size--) {
            int iIntValue = arrayListZzQ.get(size).intValue();
            if (iIntValue > 0) {
                zzZNH.zzU(sb, zzc(iIntValue, size));
            }
        }
        return sb.toString();
    }

    private static String zzc(int i, int i2) {
        if (i2 == 0) {
            return i == 6 ? "στ" : Character.toString("αβγδε?ζηθ".charAt(i - 1));
        }
        if (i2 == 1) {
            return Character.toString("ικλμνξοπϟ".charAt(i - 1));
        }
        if (i2 == 2) {
            return Character.toString("ρστυφχψωϡ".charAt(i - 1));
        }
        if (i2 == 3) {
            return "," + zzc(i, 0);
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: " + zzZKN.format("Unexpected exponent: '{0}'", Integer.valueOf(i2)));
    }
}
