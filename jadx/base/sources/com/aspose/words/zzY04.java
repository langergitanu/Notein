package com.aspose.words;

import com.google.mlkit.p567nl.translate.TranslateLanguage;

/* JADX INFO: loaded from: classes6.dex */
final class zzY04 {
    public static void zzW(zzYU6 zzyu6, Paragraph paragraph) throws Exception {
        zzZ(zzyu6, paragraph, true);
    }

    public static void zzX(zzYU6 zzyu6, Paragraph paragraph) throws Exception {
        ParagraphFormat paragraphFormat = paragraph.getParagraphFormat();
        zzZ(zzyu6, "Margin", zzXZY.zzXR(paragraph).zzXRQ(), paragraphFormat.getSpaceBefore(), paragraphFormat.getRightIndent(), paragraphFormat.getSpaceAfter());
        zzZ(zzyu6, paragraphFormat.getBorders().getLeft(), paragraphFormat.getBorders().getTop(), paragraphFormat.getBorders().getRight(), paragraphFormat.getBorders().getBottom());
    }

    public static void zzY(zzYU6 zzyu6, Paragraph paragraph) {
        zzZGI zzzgiZzZW = zzZGI.zzZW(paragraph);
        zzzgiZzZW.isListItem();
        zzXZY zzxzyZzXR = zzXZY.zzXR(paragraph);
        zzyu6.zz0("Padding", "0");
        if (zzxzyZzXR.zzXRO()) {
            zzyu6.zz0("MarkerOffset", zzY02.zzQ(zzxzyZzXR.zzXRP(), TranslateLanguage.PORTUGUESE));
        }
        ListLevel listLevel = zzzgiZzZW.getListLevel();
        if (listLevel.getStartAt() > 0) {
            zzyu6.zzZj("StartIndex", listLevel.getStartAt());
        }
        zzyu6.zz0("MarkerStyle", zzY02.zzH(listLevel));
        zzZ(zzyu6, paragraph.getParagraphFormat().getBidi());
    }

    public static void zzZ(zzYU6 zzyu6, Font font, zzZN8 zzzn8) {
        zzZ(zzyu6, font, 3, zzzn8, true);
    }

    private static boolean zzu(Border border) {
        return (border == null || border.getLineStyle() == 0) ? false : true;
    }

    public static void zzZ(zzYU6 zzyu6, Font font, int i, zzZN8 zzzn8, boolean z) {
        zzyu6.zz0("FontFamily", font.getFontName(i));
        zzyu6.zz0("FontSize", com.aspose.words.internal.zzZKN.format("{0}pt", com.aspose.words.internal.zzJB.zzZU(font.getSize())));
        if (font.getItalic()) {
            zzyu6.zz0("FontStyle", "Italic");
        }
        if (font.getBold()) {
            zzyu6.zz0("FontWeight", "Bold");
        }
        if (font.getUnderline() != 0) {
            zzyu6.zz0("TextDecorations", "Underline");
        }
        if (font.getAllCaps() || font.getSmallCaps()) {
            zzyu6.zz0("Typography.Capitals", font.getAllCaps() ? "AllSmallCaps" : "SmallCaps");
        }
        if (z) {
            return;
        }
        if (!font.zzZ7k().isEmpty()) {
            zzyu6.zz0("Background", zzY02.zzw(font.zzZ7k()));
        }
        zzyu6.zz0("Foreground", zzY02.zzw(zzzn8.zz7(font.zz8Q())));
        zzZ(zzyu6, font.getBidi());
    }

    public static void zzY(zzYU6 zzyu6, Table table) {
        zzZ(zzyu6, "Padding", table.getLeftPadding(), table.getTopPadding(), table.getRightPadding(), table.getBottomPadding());
        zzZ(zzyu6, "Margin", table.getLeftIndent(), 0.0d, 0.0d, 0.0d);
        zzyu6.zz0("CellSpacing", com.aspose.words.internal.zzZKN.format("{0}pt", com.aspose.words.internal.zzJB.zzZU(table.getCellSpacing())));
        zzZ(zzyu6, table.getBidi());
    }

    public static void zzZ(zzYU6 zzyu6, Paragraph paragraph) throws Exception {
        zzZ(zzyu6, paragraph, false);
    }

    public static void zzZ(zzYU6 zzyu6, zzWP zzwp) {
        zzZ(zzyu6, zzwp.zz5y(), zzwp.zz5A(), zzwp.zz5x(), zzwp.zz5z());
        zzZ(zzyu6, zzwp.getShading());
    }

    private static void zzZ(zzYU6 zzyu6, boolean z) {
        if (z) {
            zzyu6.zz0("FlowDirection", "RightToLeft");
        }
    }

    private static void zzZ(zzYU6 zzyu6, Border border, Border border2, Border border3, Border border4) {
        Border borderZzZ = zzZ(border, border2, border3, border4);
        if (borderZzZ != null) {
            zzZ(zzyu6, "BorderThickness", zzu(border) ? border.getLineWidth() : 0.0d, zzu(border2) ? border2.getLineWidth() : 0.0d, zzu(border3) ? border3.getLineWidth() : 0.0d, zzu(border4) ? border4.getLineWidth() : 0.0d);
            zzyu6.zz0("BorderBrush", zzY02.zzw(borderZzZ.zz8Q().isEmpty() ? com.aspose.words.internal.zzPV.zzKa : borderZzZ.zz8Q()));
        }
    }

    private static Border zzZ(Border border, Border border2, Border border3, Border border4) {
        if (zzu(border)) {
            return border;
        }
        if (zzu(border2)) {
            return border2;
        }
        if (zzu(border3)) {
            return border3;
        }
        if (zzu(border4)) {
            return border4;
        }
        return null;
    }

    private static void zzZ(zzYU6 zzyu6, Shading shading) {
        if (shading == null) {
            return;
        }
        if (!shading.zzYbK().isEmpty()) {
            zzyu6.zz0("Background", zzY02.zzw(shading.zzYbK()));
        }
        if (shading.zzYbJ().isEmpty()) {
            return;
        }
        zzyu6.zz0("Foreground", zzY02.zzw(shading.zzYbJ()));
    }

    private static void zzZ(zzYU6 zzyu6, String str, double d, double d2, double d3, double d4) {
        if (com.aspose.words.internal.zzAN.zzL(d, d2) && com.aspose.words.internal.zzAN.zzL(d, d3) && com.aspose.words.internal.zzAN.zzL(d, d4)) {
            zzyu6.zz0(str, zzY02.zzQ(d, TranslateLanguage.PORTUGUESE));
        } else {
            zzyu6.zz0(str, com.aspose.words.internal.zzZKN.format("{0},{1},{2},{3}", zzY02.zzQ(d, TranslateLanguage.PORTUGUESE), zzY02.zzQ(d2, TranslateLanguage.PORTUGUESE), zzY02.zzQ(d3, TranslateLanguage.PORTUGUESE), zzY02.zzQ(d4, TranslateLanguage.PORTUGUESE)));
        }
    }

    private static void zzZ(zzYU6 zzyu6, Paragraph paragraph, boolean z) throws Exception {
        zzYU6 zzyu62;
        ParagraphFormat paragraphFormat = paragraph.getParagraphFormat();
        zzyu6.zzw("KeepTogether", paragraphFormat.getKeepTogether());
        zzyu6.zzw("KeepWithNext", paragraphFormat.getKeepWithNext());
        zzyu6.zzA("TextAlignment", zzY02.zzyP(paragraphFormat.getAlignment()), "Left");
        if (!z) {
            if (paragraphFormat.getFirstLineIndent() > 0.0d) {
                zzyu6.zz0("TextIndent", zzY02.zzQ(paragraphFormat.getFirstLineIndent(), TranslateLanguage.PORTUGUESE));
            }
            zzyu62 = zzyu6;
            zzZ(zzyu62, "Margin", paragraphFormat.getLeftIndent(), paragraphFormat.getSpaceBefore(), paragraphFormat.getRightIndent(), paragraphFormat.getSpaceAfter());
        } else {
            zzyu62 = zzyu6;
            zzXZY zzxzyZzXR = zzXZY.zzXR(paragraph);
            if (zzxzyZzXR.zzXRM()) {
                zzyu62.zz0("TextIndent", zzY02.zzQ(zzxzyZzXR.zzXRN(), TranslateLanguage.PORTUGUESE));
            }
        }
        zzZ(zzyu62, paragraphFormat.getShading());
        if (!z) {
            zzZ(zzyu62, paragraphFormat.getBorders().getLeft(), paragraphFormat.getBorders().getTop(), paragraphFormat.getBorders().getRight(), paragraphFormat.getBorders().getBottom());
        }
        zzZ(zzyu62, paragraphFormat.getBidi());
    }
}
