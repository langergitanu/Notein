package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zzZOH {
    static final /* synthetic */ boolean zzVr = true;

    private static int zzW(String str, int i, int i2) {
        if (str.charAt(0) == '-') {
            i2++;
        }
        while (i2 < str.length() && Character.digit(str.charAt(i2), 16) != -1) {
            i2++;
        }
        return i2;
    }

    public static long zzY(String str, int[] iArr) {
        if (str == null) {
            throw new IllegalArgumentException("s");
        }
        int i = iArr[0];
        int iZzW = zzW(str, 16, i);
        String strSubstring = str.substring(i, iZzW);
        iArr[0] = iZzW;
        return Long.parseLong(strSubstring, 16);
    }
}
