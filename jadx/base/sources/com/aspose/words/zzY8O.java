package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY8O {
    private static com.aspose.words.internal.zzD4 zzX9g;

    static {
        com.aspose.words.internal.zzD4 zzd4 = new com.aspose.words.internal.zzD4();
        zzX9g = zzd4;
        zzd4.add(0, 0);
        zzX9g.add(1, 1);
        zzX9g.add(2, 2);
        zzX9g.add(3, 3);
        zzX9g.add(4, 4);
        zzX9g.add(5, 5);
        zzX9g.add(6, 6);
        zzX9g.add(7, 7);
        zzX9g.add(8, 8);
        zzX9g.add(9, 9);
        zzX9g.add(65, 10);
        zzX9g.add(105, 11);
        zzX9g.add(107, 12);
    }

    public static int zzAE(String str) {
        return zzY8T.zzAP(zzY8T.zzAN(str));
    }

    public static void zzW(Style style, Style style2) {
        style.getStyles();
        style.zzZb(StyleIdentifier.USER, true);
        if (style2 != null) {
            style.zzZc(style2.zzZ7j(), true);
            return;
        }
        if (zzX9g.zzVA(style.zzZ7j())) {
            style.zzZc(style.getStyles().zzY30(), true);
        }
    }

    public static boolean zzZ(Style style, int i, Style style2, boolean z) {
        style.zzZb(i, z);
        int iZzkH = zzkH(i);
        if (iZzkH != 12287) {
            style.zzZc(iZzkH, z);
            return true;
        }
        if (style2 == null) {
            return false;
        }
        style.zzZc(style2.zzZ7j(), z);
        return true;
    }

    public static boolean zzd(Style style) {
        return style.getStyleIdentifier() == 65 || style.getStyleIdentifier() == 105;
    }

    public static boolean zzkF(int i) {
        return i > 0 && i <= 9;
    }

    public static boolean zzkG(int i) {
        return zzX9g.zzVA(i);
    }

    public static int zzkH(int i) {
        int i2 = zzX9g.get(i);
        return com.aspose.words.internal.zzD4.zzWm(i2) ? StyleIdentifier.NIL : i2;
    }
}
