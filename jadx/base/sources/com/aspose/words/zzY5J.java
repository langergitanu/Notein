package com.aspose.words;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzY5J {
    private static int zzN(com.aspose.words.internal.zzPV zzpv, com.aspose.words.internal.zzPV zzpv2) {
        int iAbs = Math.abs(zzpv.zzPC() - zzpv2.zzPC());
        int iAbs2 = Math.abs(zzpv.zzPB() - zzpv2.zzPB());
        return Math.max(Math.max(iAbs, iAbs2), Math.abs(zzpv.zzPA() - zzpv2.zzPA()));
    }

    public static void zzZ(Style style, Theme theme) {
        TableStyle tableStyle = (TableStyle) com.aspose.words.internal.zzZKW.zzZ(style, TableStyle.class);
        if (tableStyle != null) {
            zzZ(tableStyle.getConditionalStyles().zzZY9(), theme);
        }
        zzZ(style.zzZYj(), theme);
    }

    public static void zzZR(Document document) {
        zzZ(document.getStyles(), document.zzZqI());
    }

    public static void zzd(Row row) {
        Theme themeZzZqI = row.getDocument().zzZqI();
        if (themeZzZqI == null) {
            return;
        }
        zzY6G zzy6gZzZYf = row.zzZYf();
        if (zzy6gZzZYf.contains(4330)) {
            zzZ(zzy6gZzZYf.getShading(), themeZzZqI);
        }
        Iterator<Integer> it = zzY6G.zzZzU.zzl9().iterator();
        while (it.hasNext()) {
            zzZ((Border) zzy6gZzZYf.get(it.next().intValue()), themeZzZqI);
        }
    }

    public static void zzi(Cell cell) {
        Theme themeZzZqI = cell.getDocument().zzZqI();
        if (themeZzZqI == null) {
            return;
        }
        zzWP zzwpZz6G = cell.zz6G();
        if (zzwpZz6G.contains(3170)) {
            zzZ(zzwpZz6G.getShading(), themeZzZqI);
        }
        for (int i : zzWP.zzZzT) {
            zzZ((Border) zzwpZz6G.get(i), themeZzZqI);
        }
    }

    private static void zzZ(StyleCollection styleCollection, Theme theme) {
        if (styleCollection == null || theme == null) {
            return;
        }
        Iterator<Style> it = styleCollection.iterator();
        while (it.hasNext()) {
            zzZ(it.next(), theme);
        }
    }

    public static void zzZ(zzYEF zzyef, Theme theme) {
        com.aspose.words.internal.zzPV zzpvZzZ;
        Object obj = zzyef.get(500);
        if (obj == null || (zzpvZzZ = zzYOQ.zzZ(obj, zzyef.get(520), zzyef.get(510), theme)) == null || zzpvZzZ.isEmpty() || zzN(zzyef.zzZy(), zzpvZzZ) <= 3) {
            return;
        }
        zzyef.zzY(zzpvZzZ);
    }

    private static void zzZ(Shading shading, Theme theme) {
        com.aspose.words.internal.zzPV zzpvZzZ = zzYOQ.zzZ(shading.zzYbH(), shading.zzYbF(), shading.zzYbG(), theme);
        if (zzpvZzZ != null) {
            shading.zzZK(zzpvZzZ);
        }
        com.aspose.words.internal.zzPV zzpvZzZ2 = zzYOQ.zzZ(shading.zzYbI(), shading.zz8M(), shading.zz8N(), theme);
        if (zzpvZzZ2 != null) {
            shading.zzZJ(zzpvZzZ2);
        }
    }

    private static void zzZ(Border border, Theme theme) {
        com.aspose.words.internal.zzPV zzpvZzZ;
        if (theme == null || border == null || (zzpvZzZ = zzYOQ.zzZ(border.zz8O(), border.zz8M(), border.zz8N(), theme)) == null) {
            return;
        }
        border.zzm(zzpvZzZ);
    }

    private static void zzZ(Iterable<ConditionalStyle> iterable, Theme theme) {
        for (ConditionalStyle conditionalStyle : iterable) {
            if (conditionalStyle != null && conditionalStyle.zzZYb() && conditionalStyle.zz6G().getShading() != null) {
                zzZ(conditionalStyle.zz6G().getShading(), theme);
            }
        }
    }

    private static void zzZ(zzYMX zzymx, Theme theme) {
        Iterator<Map.Entry<Integer, Integer>> it = zzYMX.zzZzU.iterator();
        while (it.hasNext()) {
            zzZ((Border) zzymx.get(it.next().getValue().intValue()), theme);
        }
    }
}
