package com.aspose.words;

import androidx.core.view.PointerIconCompat;
import com.microsoft.identity.client.internal.MsalUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzZMJ {
    private static final com.aspose.words.internal.zzZHW zzUR;
    private static HashMap<com.aspose.words.internal.zzPV, String> zzYwf;

    static {
        HashMap<com.aspose.words.internal.zzPV, String> map = new HashMap<>();
        zzYwf = map;
        com.aspose.words.internal.zzZQF.zzY(map, com.aspose.words.internal.zzPV.zzS(192, 0, 0), "Dark Red");
        com.aspose.words.internal.zzZQF.zzY(zzYwf, com.aspose.words.internal.zzPV.zzS(255, 255, 0), "Yellow");
        com.aspose.words.internal.zzZQF.zzY(zzYwf, com.aspose.words.internal.zzPV.zzS(255, 0, 0), "Red");
        com.aspose.words.internal.zzZQF.zzY(zzYwf, com.aspose.words.internal.zzPV.zzS(0, 176, 80), "Green");
        com.aspose.words.internal.zzZQF.zzY(zzYwf, com.aspose.words.internal.zzPV.zzS(146, 208, 80), "Light Green");
        com.aspose.words.internal.zzZQF.zzY(zzYwf, com.aspose.words.internal.zzPV.zzS(112, 48, 160), "Purple");
        com.aspose.words.internal.zzZQF.zzY(zzYwf, com.aspose.words.internal.zzPV.zzS(0, 32, 96), "Dark Blue");
        com.aspose.words.internal.zzZQF.zzY(zzYwf, com.aspose.words.internal.zzPV.zzS(0, 112, 192), "Blue");
        com.aspose.words.internal.zzZQF.zzY(zzYwf, com.aspose.words.internal.zzPV.zzS(255, 192, 0), "Orange");
        com.aspose.words.internal.zzZQF.zzY(zzYwf, com.aspose.words.internal.zzPV.zzS(0, 0, 0), "Black");
        zzUR = new com.aspose.words.internal.zzZHW("accent1", "accent2", "accent3", "accent4", "accent5", "accent6", "text1", "text2", "background1", "background2");
    }

    private static double zzAL(int i) {
        return com.aspose.words.internal.zzZKQ.zzS((((double) i) / 56.69291338582678d) / 10.0d, 2);
    }

    private static String zzAM(int i) {
        if (i == 1) {
            return "Underline";
        }
        if (i == 43) {
            return "Wave double underline";
        }
        if (i == 3) {
            return "Double underline";
        }
        if (i == 4) {
            return "Dotted underline";
        }
        if (i == 6) {
            return "Thick underline";
        }
        if (i == 7) {
            return "Dashed underline";
        }
        switch (i) {
            case 9:
                return "Dot-dash underline";
            case 10:
                return "Dot-dot-dash underline";
            case 11:
                return "Wave underline";
            default:
                return "";
        }
    }

    private static String zzAN(int i) {
        if (i == 1) {
            return "Single solid line";
        }
        if (i == 6) {
            return "Dotted";
        }
        if (i == 7) {
            return "Dashed (large gap)";
        }
        if (i == 9) {
            return "Dash dot dot";
        }
        if (i == 10) {
            return "Triple solid lines";
        }
        switch (i) {
            case 21:
                return "Double wavy";
            case 22:
                return "Dashed (small gap)";
            case 23:
                return "Dash dot (stroked)";
            default:
                return "";
        }
    }

    private static String zzAO(int i) {
        return i != 0 ? i != 1 ? i != 4 ? i != 14 ? i != 18 ? i != 37 ? i != 51 ? i != 24 ? i != 25 ? "" : "Lt Trellis" : "Lt Grid" : "62.5%" : "12.5%" : "Dk Grid" : "Dk Horizontal" : "20%" : "Solid (100%)" : "Clear";
    }

    private static String zzAP(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "" : "Subscript" : "Superscript" : "Baseline";
    }

    private static String zzAQ(int i) {
        return i != 0 ? i != 1 ? i != 2 ? MsalUtils.QUERY_STRING_SYMBOL : "Right" : "Centered" : "Left";
    }

    private static String zzAR(int i) {
        return i != 2 ? i != 6 ? "Left" : "List" : "Right";
    }

    private static String zzAS(int i) {
        return i != 0 ? i != 1 ? i != 23 ? "" : "Bullet" : "I, II, III, ..." : "1, 2, 3, ...";
    }

    private static com.aspose.words.internal.zzZP1 zzAT(int i) {
        try {
            return new com.aspose.words.internal.zzZP1(i, false);
        } catch (Exception unused) {
            return null;
        }
    }

    private static String zzR(Shading shading) {
        StringBuilder sb = new StringBuilder();
        if (shading.getTexture() == 1) {
            zzS(sb, com.aspose.words.internal.zzZKN.format("Pattern: {0} ({1})", zzAO(shading.getTexture()), zzw(shading.zzYbJ(), shading.zzYbI())));
        } else if (shading.getTexture() == 0) {
            zzS(sb, com.aspose.words.internal.zzZKN.format("Pattern: {0} ({1})", zzAO(shading.getTexture()), zzw(shading.zzYbK(), shading.zzYbH())));
        } else {
            zzS(sb, com.aspose.words.internal.zzZKN.format("Pattern: {0} ({1} Foreground, {2} Background)", zzAO(shading.getTexture()), zzw(shading.zzYbJ(), shading.zzYbI()), zzw(shading.zzYbK(), shading.zzYbH())));
        }
        return sb.toString();
    }

    private static String zzS(zzZS zzzs) {
        StringBuilder sb = new StringBuilder();
        if (zzzs.contains(2280)) {
            zzS(sb, com.aspose.words.internal.zzZKN.format("Left: {0} cm", Double.valueOf(zzAL(((Integer) zzzs.get(2280)).intValue()))));
        }
        if (zzzs.contains(2290)) {
            zzS(sb, com.aspose.words.internal.zzZKN.format("Right: {0} cm", Double.valueOf(zzAL(((Integer) zzzs.get(2290)).intValue()))));
        }
        if (zzzs.contains(2300)) {
            zzS(sb, com.aspose.words.internal.zzZKN.format("Top: {0} cm", Double.valueOf(zzAL(((Integer) zzzs.get(2300)).intValue()))));
        }
        if (zzzs.contains(2310)) {
            zzS(sb, com.aspose.words.internal.zzZKN.format("Bottom: {0} cm", Double.valueOf(zzAL(((Integer) zzzs.get(2310)).intValue()))));
        }
        if (zzzs.contains(2260)) {
            zzS(sb, com.aspose.words.internal.zzZKN.format("Width: {0} cm", Double.valueOf(zzAL(((Integer) zzzs.get(2260)).intValue()))));
        }
        if (zzzs.contains(2270)) {
            zzS(sb, com.aspose.words.internal.zzZKN.format("Height: {0} cm", Double.valueOf(zzAL(((Integer) zzzs.get(2270)).intValue()))));
        }
        return sb.toString();
    }

    private static String zzT(zzZS zzzs, int i) {
        int iIntValue;
        StringBuilder sb = new StringBuilder();
        if (zzzs.contains(1160)) {
            zzS(sb, com.aspose.words.internal.zzZKN.format("Left: {0}", zzXg(i, ((Integer) zzzs.zzPj(EditingLanguage.CENTRAL_KURDISH_IRAQ)).intValue() + ((Integer) zzzs.get(1160)).intValue())));
        }
        if (zzzs.contains(EditingLanguage.BRETON)) {
            zzS(sb, com.aspose.words.internal.zzZKN.format("Right: {0}", zzXg(i, ((Integer) zzzs.get(EditingLanguage.BRETON)).intValue())));
        }
        if (zzzs.contains(EditingLanguage.CENTRAL_KURDISH_IRAQ) && (iIntValue = ((Integer) zzzs.get(EditingLanguage.CENTRAL_KURDISH_IRAQ)).intValue()) != 0) {
            zzS(sb, com.aspose.words.internal.zzZKN.format("{0}: {1} cm", iIntValue > 0 ? "First Line" : "Hanging", Double.valueOf(zzAL(Math.abs(iIntValue)))));
        }
        return sb.toString();
    }

    private static boolean zzW(Border border, Border border2) {
        return border != null && border2 != null && border.getLineStyle() == border2.getLineStyle() && com.aspose.words.internal.zzAN.zzL(border.getLineWidth(), border2.getLineWidth()) && border.zz8Q().equals(border2.zz8Q()) && border.zz8P() == border2.zz8P() && border.getShadow() == border2.getShadow() && com.aspose.words.internal.zzZKN.equals(border.zz8O(), border2.zz8O()) && com.aspose.words.internal.zzZKN.equals(border.zz8N(), border2.zz8N()) && com.aspose.words.internal.zzZKN.equals(border.zz8M(), border2.zz8M());
    }

    private static String zzX(zzZS zzzs, DocumentBase documentBase) {
        int iIntValue = ((Integer) zzzs.get(EditingLanguage.KASHMIRI_ARABIC)).intValue();
        int iIntValue2 = ((Integer) zzzs.zzPj(EditingLanguage.GALICIAN)).intValue();
        if (iIntValue == 0) {
            return "No bullets or numbering";
        }
        ListLevel listLevel = documentBase.getLists().getListByListId(iIntValue).getListLevels().get(iIntValue2);
        int measurementUnit = documentBase.zzYBb().getLayoutOptions().getRevisionOptions().getMeasurementUnit();
        int iIntValue3 = ((Integer) listLevel.zzZYj().zzPj(EditingLanguage.CENTRAL_KURDISH_IRAQ)).intValue() + ((Integer) listLevel.zzZYj().zzPj(1160)).intValue();
        StringBuilder sb = new StringBuilder();
        com.aspose.words.internal.zzZNH.zzU(sb, com.aspose.words.internal.zzZKN.format("Numbered + Level: {0} + ", Integer.valueOf(iIntValue2 + 1)));
        com.aspose.words.internal.zzZNH.zzU(sb, com.aspose.words.internal.zzZKN.format("Numbering Style: {0} + ", zzAS(listLevel.getNumberStyle())));
        com.aspose.words.internal.zzZNH.zzU(sb, com.aspose.words.internal.zzZKN.format("Aligned at: {0} + ", zzXg(measurementUnit, iIntValue3)));
        if (listLevel.zzZYj().getTabStops() != null && listLevel.zzZYj().getTabStops().getCount() == 1) {
            com.aspose.words.internal.zzZNH.zzU(sb, com.aspose.words.internal.zzZKN.format("Tab after: {0} cm + ", Double.valueOf(zzAL(listLevel.zzZYj().getTabStops().get(0).zzY0E()))));
        }
        com.aspose.words.internal.zzZNH.zzU(sb, com.aspose.words.internal.zzZKN.format("Indent at: {0}", zzXg(measurementUnit, ((Integer) listLevel.zzZYj().zzPj(1160)).intValue())));
        return sb.toString();
    }

    private static String zzXg(int i, int i2) {
        double dZzXh = zzXh(i, i2);
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : com.aspose.words.internal.zzZKN.format("{0} pi", Double.valueOf(com.aspose.words.internal.zzZKQ.zzS(dZzXh, 1))) : com.aspose.words.internal.zzZKN.format("{0} pt", Double.valueOf(com.aspose.words.internal.zzZKQ.zzS(dZzXh, 0))) : com.aspose.words.internal.zzZKN.format("{0} mm", Double.valueOf(com.aspose.words.internal.zzZKQ.zzS(dZzXh, 1))) : com.aspose.words.internal.zzZKN.format("{0} cm", Double.valueOf(com.aspose.words.internal.zzZKQ.zzS(dZzXh, 2))) : com.aspose.words.internal.zzZKN.format("{0}\"", Double.valueOf(com.aspose.words.internal.zzZKQ.zzS(dZzXh, 2)));
    }

    private static double zzXh(int i, int i2) {
        double d;
        double d2;
        if (i == 0) {
            d = i2;
            d2 = 1440.0d;
        } else if (i == 1) {
            d = i2;
            d2 = 566.9291338582677d;
        } else if (i == 2) {
            d = i2;
            d2 = 56.69291338582678d;
        } else if (i == 3) {
            d = i2;
            d2 = 20.0d;
        } else {
            if (i != 4) {
                return Double.NaN;
            }
            d = i2;
            d2 = 240.0d;
        }
        return d / d2;
    }

    private static String zzY(zzZS zzzs, DocumentBase documentBase) {
        int measurementUnit = documentBase.zzYBb().getLayoutOptions().getRevisionOptions().getMeasurementUnit();
        StringBuilder sb = new StringBuilder();
        if (zzzs.contains(PointerIconCompat.TYPE_GRAB)) {
            zzS(sb, zzAQ(((Integer) zzzs.get(PointerIconCompat.TYPE_GRAB)).intValue()));
        }
        String strZzT = zzT(zzzs, measurementUnit);
        if (com.aspose.words.internal.zzZYD.zzXk(strZzT)) {
            zzS(sb, com.aspose.words.internal.zzZKN.format("Indent: {0}", strZzT));
        }
        if (zzzs.contains(EditingLanguage.KASHMIRI_ARABIC)) {
            zzS(sb, zzX(zzzs, documentBase));
        }
        StringBuilder sb2 = new StringBuilder();
        if (zzzs.contains(EditingLanguage.GUARANI)) {
            TabStopCollection tabStopCollection = (TabStopCollection) zzzs.get(EditingLanguage.GUARANI);
            for (int i = 0; i < tabStopCollection.getCount(); i++) {
                zzS(sb2, zzZ(tabStopCollection.get(i), measurementUnit));
            }
            if (sb2.length() > 0) {
                zzS(sb, com.aspose.words.internal.zzZKN.format("Tab stops: {0}", sb2));
            }
        }
        sb2.setLength(0);
        if (zzzs.contains(1200)) {
            zzS(sb2, com.aspose.words.internal.zzZKN.format("Before: {0} pt", Integer.valueOf(((Integer) zzzs.get(1200)).intValue() / 20)));
        }
        if (zzzs.contains(1220)) {
            zzS(sb2, com.aspose.words.internal.zzZKN.format("After: {0} pt", Integer.valueOf(((Integer) zzzs.get(1220)).intValue() / 20)));
        }
        if (sb2.length() > 0) {
            zzS(sb, com.aspose.words.internal.zzZKN.format("Space {0}", sb2));
        }
        if (zzzs.contains(1650)) {
            zzS(sb, com.aspose.words.internal.zzZKN.format("Line spacing: {0}", zzZ((zzZ52) zzzs.get(1650))));
        }
        zzZ(sb, zzzs, 1270, "Automatically adjust right indent when grid is defined", "Don't automatically adjust right indent when grid is defined");
        zzZ(sb, zzzs, 1022, "Don't add space between paragraphs of the same style", "Add space between paragraphs of the same style");
        zzZ(sb, zzzs, 1470, "Widow/orphan control", "No widow/orphan control");
        zzZ(sb, zzzs, EditingLanguage.SLOVENIAN, "Page break before", "No page break before");
        zzZ(sb, zzzs, 1050, "Keep with next", "Don't keep with next");
        zzZ(sb, zzzs, EditingLanguage.ITALIAN_ITALY, "Keep lines together", "Don't keep lines together");
        zzZ(sb, zzzs, EditingLanguage.YORUBA, "Suppress line numbers", "Don't suppress line numbers");
        zzZ(sb, zzzs, 1410, "Don't hyphenate", "Hyphenate");
        zzZ(sb, zzzs, EditingLanguage.SORBIAN, "Use Asian rules to control first and last character", "Don't use Asian rules to control first and last character");
        zzZ(sb, zzzs, EditingLanguage.FAEROESE, "Don't allow text to wrap in the middle of a word", "Allow text to wrap in the middle of a word");
        zzZ(sb, zzzs, EditingLanguage.TURKMEN, "Allow hanging punctuation", "Don't allow hanging punctuation");
        zzZ(sb, zzzs, 1240, "Adjust space between Latin and Asian text", "Don't adjust space between Latin and Asian text");
        zzZ(sb, zzzs, 1250, "Adjust space between Asian text and numbers", "Don't adjust space between Asian text and numbers");
        zzZ(sb, zzzs, 1260, "Snap to grid", "Don't snap to grid");
        zzZ(sb, zzzs, EditingLanguage.PAPIAMENTU, "Don't swap indents on facing pages", "Not Don't swap indents on facing pages");
        zzZ(sb, zzzs, EditingLanguage.MALAYALAM, "Compress initial punctuation", "Don't compress initial punctuation");
        sb2.setLength(0);
        if (zzzs.contains(1360) || zzzs.contains(1380) || zzzs.contains(1350) || zzzs.contains(1400) || zzzs.contains(1390) || zzzs.contains(1370)) {
            zzS(sb2, zzR(zzzs));
        }
        if (sb2.length() > 0) {
            zzS(sb, com.aspose.words.internal.zzZKN.format("Border: {0}", sb2));
        }
        if (zzzs.contains(1460)) {
            zzS(sb, zzR((Shading) zzzs.get(1460)));
        }
        return sb.toString();
    }

    public static String zzZ(zzZMK zzzmk, DocumentBase documentBase) {
        StringBuilder sb = new StringBuilder();
        WordAttrCollection wordAttrCollectionZzZ6C = zzzmk.zzZ6C();
        if (wordAttrCollectionZzZ6C.contains(1000)) {
            zzS(sb, documentBase.getStyles().zzZ8(((Integer) wordAttrCollectionZzZ6C.get(1000)).intValue(), false).getName());
        }
        zzS(sb, zzZ(wordAttrCollectionZzZ6C, documentBase));
        zzS(sb, zzY(wordAttrCollectionZzZ6C, documentBase));
        zzS(sb, zzS(wordAttrCollectionZzZ6C));
        return sb.toString();
    }

    private static String zzw(Object obj, Object obj2) {
        if (obj2 == null) {
            com.aspose.words.internal.zzPV zzpv = (com.aspose.words.internal.zzPV) obj;
            if (zzpv.isEmpty()) {
                return "Auto";
            }
            String str = (String) com.aspose.words.internal.zzQW.zzZ(zzYwf, zzpv);
            return com.aspose.words.internal.zzZYD.zzXk(str) ? str : com.aspose.words.internal.zzZKN.format("Custom Color(RGB({0},{1},{2}))", Integer.valueOf(zzpv.zzPC()), Integer.valueOf(zzpv.zzPB()), Integer.valueOf(zzpv.zzPA()));
        }
        switch (zzUR.zzTP((String) obj2)) {
            case 0:
                return "Accent 1";
            case 1:
                return "Accent 2";
            case 2:
                return "Accent 3";
            case 3:
                return "Accent 4";
            case 4:
                return "Accent 5";
            case 5:
                return "Accent 6";
            case 6:
                return "Text 1";
            case 7:
                return "Text 2";
            case 8:
                return "Background 1";
            case 9:
                return "Background 2";
            default:
                return "";
        }
    }

    private static String zzZ(zzZS zzzs, DocumentBase documentBase) {
        com.aspose.words.internal.zzZP1 zzzp1ZzAT;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        if (zzzs.contains(230)) {
            zzU1 zzu1 = (zzU1) zzzs.get(230);
            Theme themeZzZqI = documentBase.zzZqI();
            String strZzZ = zzU1.zzZ(zzu1, themeZzZqI);
            if (zzu1.zzZYI()) {
                strZzZ = com.aspose.words.internal.zzZKN.format((zzu1.zzZYJ() & WarningType.MINOR_FORMATTING_LOSS_CATEGORY) == 65536 ? "+Headings ({0})" : "+Body ({0})", strZzZ);
            }
            String strZzZ2 = zzZ(zzzs, themeZzZqI);
            String strZzZ3 = zzZ(documentBase.getStyles().zzY37(), themeZzZqI);
            if (zzzs.contains(270) || com.aspose.words.internal.zzZKN.equals(strZzZ2, strZzZ3) || com.aspose.words.internal.zzZKN.equals(com.aspose.words.internal.zzJF.zzHd().get(strZzZ), strZzZ3)) {
                strZzZ = com.aspose.words.internal.zzZKN.format("(Default) {0}", strZzZ);
            }
            zzS(sb2, strZzZ);
        }
        if (zzzs.contains(190)) {
            zzS(sb2, com.aspose.words.internal.zzZKN.format("{0} pt", Integer.valueOf(((Integer) zzzs.get(190)).intValue() / 2)));
        }
        zzZ(sb2, zzzs, 60, "Bold");
        zzZ(sb2, zzzs, 70, "Italic");
        if (sb2.length() > 0) {
            zzS(sb, com.aspose.words.internal.zzZKN.format("Font: {0}", sb2));
        }
        if (zzzs.contains(140)) {
            zzS(sb, zzAM(((Integer) zzzs.get(140)).intValue()));
        }
        if (zzzs.contains(450)) {
            zzS(sb, com.aspose.words.internal.zzZKN.format("Underline color: {0}", zzw(zzzs.get(450), zzzs.get(521))));
        }
        if (zzzs.contains(160)) {
            zzS(sb, com.aspose.words.internal.zzZKN.format("Font color: {0}", zzw(zzzs.get(160), zzzs.get(500))));
        }
        sb2.setLength(0);
        if (zzzs.contains(270)) {
            zzU1 zzu12 = (zzU1) zzzs.get(270);
            String strZzZ4 = zzU1.zzZ(zzu12, documentBase.zzZqI());
            if (zzu12.zzZYI()) {
                strZzZ4 = com.aspose.words.internal.zzZKN.format((zzu12.zzZYJ() & WarningType.MINOR_FORMATTING_LOSS_CATEGORY) == 65536 ? "+Headings ({0})" : "+Body ({0})", strZzZ4);
            }
            zzS(sb2, strZzZ4);
        }
        if (zzzs.contains(StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4)) {
            zzS(sb2, com.aspose.words.internal.zzZKN.format("{0} pt", Integer.valueOf(((Integer) zzzs.get(StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4)).intValue() / 2)));
        }
        zzZ(sb2, zzzs, 250, "Bold");
        zzZ(sb2, zzzs, StyleIdentifier.SUBTLE_EMPHASIS, "Italic");
        if (sb2.length() > 0) {
            zzS(sb, com.aspose.words.internal.zzZKN.format("Complex Script Font: {0}", sb2));
        }
        zzZ(sb, zzzs, 80, "Strikethrough");
        zzZ(sb, zzzs, 300, "Double strikethrough");
        if (zzzs.contains(210)) {
            zzS(sb, zzAP(((Integer) zzzs.get(210)).intValue()));
        }
        zzZ(sb, zzzs, 110, "Small caps");
        if (zzzs.contains(StyleIdentifier.GRID_TABLE_4_ACCENT_2)) {
            zzS(sb, com.aspose.words.internal.zzZKN.format("Character scale: {0}%", (Integer) zzzs.get(StyleIdentifier.GRID_TABLE_4_ACCENT_2)));
        }
        if (zzzs.contains(150)) {
            zzS(sb, com.aspose.words.internal.zzZKN.format("Expanded by {0} pt", Integer.valueOf(((Integer) zzzs.get(150)).intValue() / 20)));
        }
        if (zzzs.contains(200)) {
            zzS(sb, com.aspose.words.internal.zzZKN.format("Raised by {0} pt", Integer.valueOf(((Integer) zzzs.get(200)).intValue() / 2)));
        }
        if (zzzs.contains(220)) {
            zzS(sb, com.aspose.words.internal.zzZKN.format("Kern at {0} pt", Integer.valueOf(((Integer) zzzs.get(220)).intValue() / 2)));
        }
        if (zzzs.contains(StyleIdentifier.LIST_TABLE_4_ACCENT_5)) {
            zzS(sb, com.aspose.words.internal.zzZKN.format("Border: {0}", zzY("", (Border) zzzs.get(StyleIdentifier.LIST_TABLE_4_ACCENT_5))));
        }
        zzY(sb, zzzs, 20, "Highlight");
        StringBuilder sb3 = new StringBuilder();
        zzY(sb3, zzzs, 825, "Outline");
        zzY(sb3, zzzs, 810, "Glow");
        zzY(sb3, zzzs, 820, "Reflection");
        zzY(sb3, zzzs, 830, "Fill");
        zzY(sb3, zzzs, 840, "Bevel");
        if (sb3.length() > 0) {
            zzS(sb, com.aspose.words.internal.zzZKN.format("Text {0}", sb3));
        }
        if (zzzs.contains(380) && (zzzp1ZzAT = zzAT(((Integer) zzzs.get(380)).intValue())) != null) {
            zzS(sb, zzzp1ZzAT.getDisplayName());
        }
        return sb.toString();
    }

    private static String zzR(zzZS zzzs) {
        StringBuilder sb = new StringBuilder();
        Border border = (Border) zzzs.get(1390);
        Border border2 = (Border) zzzs.get(1400);
        zzS(sb, zzY("Between", border));
        zzS(sb, zzY("Bar", border2));
        Border border3 = (Border) zzzs.get(1360);
        Border border4 = (Border) zzzs.get(1380);
        Border border5 = (Border) zzzs.get(1350);
        Border border6 = (Border) zzzs.get(1370);
        if (border3 != null && zzW(border3, border4) && zzW(border3, border5) && zzW(border3, border6)) {
            zzS(sb, zzY("Box", border3));
        } else {
            zzS(sb, zzY("Top", border5));
            zzS(sb, zzY("Bottom", border6));
            zzS(sb, zzY("Left", border3));
            zzS(sb, zzY("Right", border4));
        }
        return sb.toString();
    }

    private static void zzS(StringBuilder sb, String str) {
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            if (sb.length() > 0) {
                com.aspose.words.internal.zzZNH.zzU(sb, ", ");
            }
            com.aspose.words.internal.zzZNH.zzU(sb, str);
        }
    }

    private static void zzY(StringBuilder sb, zzZS zzzs, int i, String str) {
        if (zzzs.contains(i)) {
            zzS(sb, str);
        }
    }

    private static String zzY(String str, Border border) {
        if (border == null) {
            return "";
        }
        return com.aspose.words.internal.zzZKN.format("{0}: ({1}{2}, {3}, {4} pt Line width)", str, border.getShadow() ? "Shadowed " : "", zzAN(border.getLineStyle()), zzw(border.zz8Q(), border.zz8O()), Double.valueOf(border.getLineWidth()));
    }

    private static String zzZ(zzZS zzzs, Theme theme) {
        if (!zzzs.contains(240)) {
            return null;
        }
        zzU1 zzu1 = (zzU1) zzzs.get(240);
        if (zzu1.zzZYI()) {
            return zzU1.zzZ(zzu1, theme);
        }
        return zzu1.getName();
    }

    private static void zzZ(StringBuilder sb, zzZS zzzs, int i, String str) {
        Object obj = zzzs.get(i);
        if (obj != null) {
            zzS(sb, zzZ((zzZU) obj, str));
        }
    }

    private static void zzZ(StringBuilder sb, zzZS zzzs, int i, String str, String str2) {
        Object obj = zzzs.get(i);
        if (obj != null) {
            if (!((Boolean) obj).booleanValue()) {
                str = str2;
            }
            zzS(sb, str);
        }
    }

    private static String zzZ(TabStop tabStop, int i) {
        if (tabStop.isClear()) {
            return com.aspose.words.internal.zzZKN.format("Not at {0}", zzXg(i, tabStop.zzY0E()));
        }
        return com.aspose.words.internal.zzZKN.format("{0}, {1}", zzXg(i, tabStop.zzY0E()), zzAR(tabStop.getAlignment()));
    }

    private static String zzZ(zzZ52 zzz52) {
        if (zzz52.zzZ4A() != 2) {
            return com.aspose.words.internal.zzZKN.format("{0} {1} pt", zzz52.zzZ4A() == 1 ? "Exactly" : "At least", Double.valueOf(((double) zzz52.getValue()) / 20.0d));
        }
        if (zzz52.getValue() == 240) {
            return "Single";
        }
        if (zzz52.getValue() == 480) {
            return "Double";
        }
        return com.aspose.words.internal.zzZKN.format("{0} lines", Double.valueOf(((double) zzz52.getValue()) / 240.0d));
    }

    private static String zzZ(zzZU zzzu, String str) {
        return zzzu.toBool() ? str : com.aspose.words.internal.zzZKN.format("Not {0}", str);
    }
}
