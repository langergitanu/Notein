package com.aspose.words;

import androidx.core.text.util.LocalePreferences;

/* JADX INFO: loaded from: classes6.dex */
final class zzBN {
    public static void zzW(String str, zzBW zzbw, zzZXR zzzxr) {
        if (zzbw == null) {
            return;
        }
        switch (zzbw.zzZHs()) {
            case 0:
                zzZ(str, (zz6S) zzbw, zzzxr);
                return;
            case 1:
                zzZ(str, (zz6M) zzbw, zzzxr);
                return;
            case 2:
                zzZ(str, (zz3Y) zzbw, zzzxr);
                return;
            case 3:
                zzZ(str, (zz3M) zzbw, zzzxr);
                return;
            case 4:
                zzZ(str, (zz3H) zzbw, zzzxr);
                return;
            case 5:
                zzZ(str, (zz2Q) zzbw, zzzxr);
                return;
            case 6:
                zzZ(str, (zz13) zzbw, zzzxr);
                return;
            default:
                throw new IllegalArgumentException("Unexpected Dml color type.");
        }
    }

    public static void zzZ(zzBW zzbw, zzZXR zzzxr) {
        zzW("a", zzbw, zzzxr);
    }

    private static void zzZ(String str, zz6S zz6s, zzZXR zzzxr) {
        String str2 = com.aspose.words.internal.zzZKN.format("{0}:srgbClr", str);
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(str2);
        zzzydZzZlV.zz0(zz56.zzZl(str, "val"), zz6s.getValue());
        zzZ(zz6s, zzzxr);
        zzBS.zzZ(str, zz6s.zzZNX(), zzzxr);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zz6S zz6s, zzZXR zzzxr) {
        if (zz6s.zzZzZ() == null) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        String str = com.aspose.words.internal.zzZKN.format("{0}:legacySpreadsheetColorIndex", "a14");
        String strZz9 = zzZX5.zz9(14, zzzxr.getCompliance() == 2);
        zzzydZzZlV.zz0(str, zz6s.zzZzZ());
        zzzydZzZlV.zz0("mc:Ignorable", "a14");
        zzzydZzZlV.zz0("xmlns:a14", "http://schemas.microsoft.com/office/drawing/2010/main");
        zzzydZzZlV.zz0("xmlns:mc", strZz9);
    }

    private static void zzZ(String str, zz6M zz6m, zzZXR zzzxr) {
        String str2 = com.aspose.words.internal.zzZKN.format("{0}:hslClr", str);
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        boolean z = zzzxr.getCompliance() == 2;
        zzzydZzZlV.zzY(str2);
        zzzydZzZlV.zzO(zz56.zzZl(str, "hue"), zz6m.zzZzQ().getValue());
        zzzydZzZlV.zz0(zz56.zzZl(str, LocalePreferences.FirstDayOfWeek.SATURDAY), zz3W.zzS(zz6m.zzZzS(), z));
        zzzydZzZlV.zz0(zz56.zzZl(str, "lum"), zz3W.zzS(zz6m.zzZzR(), z));
        zzBS.zzZ(str, zz6m.zzZNX(), zzzxr);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(String str, zz3Y zz3y, zzZXR zzzxr) {
        String str2 = com.aspose.words.internal.zzZKN.format("{0}:scrgbClr", str);
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(str2);
        zzZ(zzzxr, str, "r", zz3y.zzZwD());
        zzZ(zzzxr, str, "g", zz3y.zzZwC());
        zzZ(zzzxr, str, "b", zz3y.zzZwB());
        zzBS.zzZ(str, zz3y.zzZNX(), zzzxr);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zzZXR zzzxr, String str, String str2, double d) {
        if (com.aspose.words.internal.zzAN.zzZD(d)) {
            d = 0.0d;
        }
        zzzxr.zzZlV().zz0(zz56.zzZl(str, str2), zz3W.zzS(d, zzzxr.getCompliance() == 2));
    }

    private static void zzZ(String str, zz3M zz3m, zzZXR zzzxr) {
        String str2 = com.aspose.words.internal.zzZKN.format("{0}:schemeClr", str);
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(str2);
        zzzydZzZlV.zz0(zz56.zzZl(str, "val"), "phClr");
        zzBS.zzZ(str, zz3m.zzZNX(), zzzxr);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(String str, zz3H zz3h, zzZXR zzzxr) {
        String str2 = com.aspose.words.internal.zzZKN.format("{0}:prstClr", str);
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(str2);
        zzzydZzZlV.zz0(zz56.zzZl(str, "val"), zz3h.getValue());
        zzBS.zzZ(str, zz3h.zzZNX(), zzzxr);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(String str, zz2Q zz2q, zzZXR zzzxr) {
        String str2 = com.aspose.words.internal.zzZKN.format("{0}:schemeClr", str);
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(str2);
        zzzydZzZlV.zz0(zz56.zzZl(str, "val"), zzY5L.toString(zz2q.getValue()));
        zzBS.zzZ(str, zz2q.zzZNX(), zzzxr);
        zzzydZzZlV.zzo();
    }

    private static void zzZ(String str, zz13 zz13Var, zzZXR zzzxr) {
        String str2 = com.aspose.words.internal.zzZKN.format("{0}:sysClr", str);
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(str2);
        zzzydZzZlV.zz0(zz56.zzZl(str, "val"), zz13Var.getValue());
        zzzydZzZlV.zzA(zz56.zzZl(str, "lastClr"), zz13Var.zzZtN(), "");
        zzBS.zzZ(str, zz13Var.zzZNX(), zzzxr);
        zzzydZzZlV.zzo();
    }
}
