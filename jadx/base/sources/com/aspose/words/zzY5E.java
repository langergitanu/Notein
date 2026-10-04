package com.aspose.words;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzY5E {
    public static void zzZ(zzZXR zzzxr, Theme theme, boolean z) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        String str = z ? "a:themeOverride" : "a:theme";
        zzzydZzZlV.zzV(true);
        zzzydZzZlV.zzY(str);
        zzzydZzZlV.zzX("xmlns:a", zzZX5.zz9(6, zzzxr.getCompliance() == 2));
        if (!z) {
            zzzydZzZlV.zzX("name", theme.getName());
            zzzydZzZlV.zzY("a:themeElements");
        }
        zzZ(zzzydZzZlV, theme.zzXVE());
        zzzydZzZlV.zzY("a:fontScheme");
        zzzydZzZlV.zzX("name", theme.zzXVG());
        zzzydZzZlV.zzY("a:majorFont");
        zzZ(zzzydZzZlV, theme.getMajorFonts());
        zzzydZzZlV.zzo();
        zzzydZzZlV.zzY("a:minorFont");
        zzZ(zzzydZzZlV, theme.getMinorFonts());
        zzzydZzZlV.zzo();
        zzzydZzZlV.zzo();
        zzZ(zzzxr, theme.zzXVD());
        if (!z) {
            zzzydZzZlV.zzo();
            zzZ(zzzxr, theme.zzXVC());
            zzZ(zzzxr, theme);
            zz7Z.zzZ(theme.getExtensions(), zzzxr);
        }
        zzzydZzZlV.zzo();
        zzzydZzZlV.endDocument();
        zzzydZzZlV.flush();
    }

    private static void zzZ(com.aspose.words.internal.zzP zzp, ThemeColors themeColors) {
        zzBW zzbwZzjC;
        zzp.zzY("a:clrScheme");
        zzp.zzX("name", themeColors.getName());
        for (int i : ThemeColors.zzX36) {
            if (i != 14 && i != 15 && i != 12 && i != 13 && (zzbwZzjC = themeColors.zzjC(i)) != null) {
                zzp.zzY("a:" + zzY5L.toString(i));
                int iZzZHs = zzbwZzjC.zzZHs();
                if (iZzZHs == 0) {
                    zzp.zzY("a:srgbClr");
                    zzp.zzX("val", ((zz6S) zzbwZzjC).getValue());
                    zzp.zzp();
                } else if (iZzZHs == 6) {
                    zz13 zz13Var = (zz13) zzbwZzjC;
                    zzp.zzY("a:sysClr");
                    zzp.zzX("val", zz13Var.getValue());
                    zzp.zzX("lastClr", zz13Var.zzZtN());
                    zzp.zzo();
                } else {
                    throw new IllegalStateException("Unexpected color type.");
                }
                zzY5L.toString(i);
                zzp.zzo();
            }
        }
        zzp.zzo();
    }

    private static void zzZ(com.aspose.words.internal.zzP zzp, ThemeFonts themeFonts) {
        zzp.zzY("a:latin");
        zzp.zzX("typeface", themeFonts.getLatin());
        zzp.zzo();
        zzp.zzY("a:ea");
        zzp.zzX("typeface", themeFonts.getEastAsian());
        zzp.zzo();
        zzp.zzY("a:cs");
        zzp.zzX("typeface", themeFonts.getComplexScript());
        zzp.zzo();
        for (Map.Entry<String, zzY5F> entry : themeFonts.zzXVu().entrySet()) {
            String key = entry.getKey();
            String strZzXVp = entry.getValue().zzXVp();
            zzp.zzY("a:font");
            zzp.zzX("script", key);
            zzp.zzX("typeface", strZzXVp);
            zzp.zzo();
        }
    }

    private static void zzZ(zzZXR zzzxr, zzZMH zzzmh) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("a:fmtScheme");
        if (com.aspose.words.internal.zzZYD.zzXk(zzzmh.getName())) {
            zzzydZzZlV.zzX("name", zzzmh.getName());
        }
        zzzydZzZlV.zzY("a:fillStyleLst");
        for (int i = 0; i < zzzmh.zzZ6z(); i++) {
            zz7T.zzZ(zzzmh.getFillStyle(i), zzzxr, false);
        }
        zzzydZzZlV.zzo();
        zzzydZzZlV.zzY("a:lnStyleLst");
        for (int i2 = 0; i2 < zzzmh.zzZ6y(); i2++) {
            zz4B.zzZ("a:ln", zzzmh.getLineStyle(i2), zzzxr);
        }
        zzzydZzZlV.zzo();
        zzzydZzZlV.zzY("a:effectStyleLst");
        for (int i3 = 0; i3 < zzzmh.zzZ6x(); i3++) {
            zzZ(zzzxr, zzzmh.getEffectStyle(i3));
        }
        zzzydZzZlV.zzo();
        zzzydZzZlV.zzY("a:bgFillStyleLst");
        for (int i4 = 0; i4 < zzzmh.zzZ6A(); i4++) {
            zz7T.zzZ(zzzmh.getBackgroundFillStyle(i4), zzzxr, false);
        }
        zzzydZzZlV.zzo();
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zzZXR zzzxr, zzZV0 zzzv0) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("a:effectStyle");
        zz2A.zzZ(zzzv0.zzZTe(), zzzxr, true);
        if (zzzv0.zzZTd() != null) {
            zzJN.zzZ("a", zzzv0.zzZTd(), zzzxr, true);
        }
        if (zzzv0.zzZTc() != null) {
            zzJN.zzZ("a", zzzv0.zzZTc(), zzzxr, true);
        }
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zzZXR zzzxr, zzY5G zzy5g) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY("a:objectDefaults");
        if (zzy5g != null) {
            zzZ(zzzxr, zzy5g.zzXVt(), "a:spDef");
            zzZ(zzzxr, zzy5g.zzXVs(), "a:lnDef");
            zzZ(zzzxr, zzy5g.zzXVr(), "a:txDef");
        }
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zzZXR zzzxr, zzK2 zzk2, String str) throws Exception {
        if (zzk2 == null) {
            return;
        }
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        zzzydZzZlV.zzY(str);
        if (zzk2.zzZTm() != null) {
            zz1T.zzZ("a", zzk2.zzZTm(), zzzxr);
        }
        if (zzk2.zzZTl() != null) {
            zz0F.zzZ("a:bodyPr", zzk2.zzZTl(), zzzxr);
        }
        if (zzk2.zzZTk() != null) {
            zz0F.zzZ(zzk2.zzZTk(), zzzxr);
        }
        if (zzk2.zzZTj() != null) {
            zz1I.zzZ("a", zzk2.zzZTj(), zzzxr);
        }
        zzzydZzZlV.zzo();
    }

    private static void zzZ(zzZXR zzzxr, Theme theme) throws Exception {
        zzZYD zzzydZzZlV = zzzxr.zzZlV();
        theme.zzXVI().zzR1().zzH(0L);
        com.aspose.words.internal.zzO zzo = new com.aspose.words.internal.zzO(theme.zzXVI().zzR1());
        boolean zEquals = com.aspose.words.internal.zzZKN.equals(zzo.getNamespaceURI(), zzZX5.zz9(6, true));
        boolean z = zzzxr.getCompliance() == 2;
        zz6D zz6d = zEquals != z ? new zz6D(z) : null;
        String localName = zzo.getLocalName();
        zzo.zzQ(localName);
        while (!zzo.zzP(localName)) {
            String localName2 = zzo.getLocalName();
            String strZzZ = zzo.zzZ(zz6d, (com.aspose.words.internal.zzZSO) null);
            if (!"themeElements".equals(localName2) && !"objectDefaults".equals(localName2) && !"extLst".equals(localName2)) {
                zzzydZzZlV.zzY(strZzZ, true);
            }
        }
    }
}
