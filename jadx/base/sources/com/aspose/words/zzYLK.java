package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYLK {
    static boolean zzZD5 = false;

    public static void zzZ(com.aspose.words.internal.zzZOX zzzox, int i, int i2, zzZ9P zzz9p, String str) throws Exception {
        if (i == 0) {
            return;
        }
        int i3 = (i - 4) / (i2 + 4);
        if (zzZD5) {
            com.aspose.words.internal.zzZKN.format("\nReading PLCF {0}, tableSize:{1}, structureSize:{2}, structureCount:{3}.", str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
        zzZ(zzzox, i3, zzz9p);
    }

    public static void zzZ(com.aspose.words.internal.zzZOX zzzox, int i, zzZ9P zzz9p) throws Exception {
        int i2 = i + 1;
        if (zzZD5) {
            com.aspose.words.internal.zzZKN.format("fcCount:{0}, fc:", Integer.valueOf(i2));
        }
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            int iZzXc = zzzox.zzXc();
            iArr[i4] = iZzXc;
            if (zzZD5) {
                com.aspose.words.internal.zzZKN.format("{0} ", Integer.valueOf(iZzXc));
            }
        }
        while (i3 < i) {
            int i5 = iArr[i3];
            i3++;
            zzz9p.zzY(zzzox, i5, iArr[i3]);
        }
    }
}
