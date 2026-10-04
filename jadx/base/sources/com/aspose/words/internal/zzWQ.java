package com.aspose.words.internal;

import com.aspose.words.StyleIdentifier;

/* JADX INFO: loaded from: classes5.dex */
final class zzWQ {
    private static zzD5 zzTI = new zzD5();

    static {
        zzW(32, 126, 31);
        zzW(161, 175, 65);
        zzW(177, 180, 66);
        zzW(182, 189, 67);
        zzW(191, 191, 68);
        zzW(193, 200, 69);
        zzW(202, 203, 70);
        zzW(205, 208, 71);
        zzTI.set(225, 138);
        zzTI.set(227, 139);
        zzW(232, 235, 92);
        zzTI.set(241, 144);
        zzTI.set(245, 145);
        zzW(StyleIdentifier.LIGHT_GRID_ACCENT_6, StyleIdentifier.MEDIUM_LIST_1_ACCENT_6, 102);
    }

    private static void zzW(int i, int i2, int i3) {
        while (i <= i2) {
            zzTI.set(i, i - i3);
            i++;
        }
    }

    public static int zzZu(int i) {
        int iZzVC = zzTI.zzVC(i);
        if (iZzVC == Integer.MIN_VALUE) {
            return 0;
        }
        return iZzVC;
    }
}
