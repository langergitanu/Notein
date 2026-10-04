package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ7R {
    private static Object zzS(Paragraph paragraph, int i) {
        DocumentBase document = paragraph.getDocument();
        Table parentTable = paragraph.getParentTable();
        if (parentTable == null) {
            return null;
        }
        Style styleZzqy = paragraph.zzqy(0);
        TableStyle tableStyle = (TableStyle) com.aspose.words.internal.zzZKW.zzZ(document.getStyles().zzZ8(parentTable.zzZ7j(), false), TableStyle.class);
        if (tableStyle == null || !zzZ(document, tableStyle) || !styleZzqy.zzZYh().contains(i) || ((Integer) styleZzqy.zzZYh().get(i)).intValue() != 24) {
            return null;
        }
        Object directRunAttr = tableStyle.getDirectRunAttr(i);
        if (directRunAttr == null) {
            directRunAttr = tableStyle.zzZ9(i, false);
        }
        if (directRunAttr == null) {
            directRunAttr = document.getStyles().zzY37().get(i);
        }
        if (zzyb(i) && directRunAttr != null && ((Integer) directRunAttr).intValue() == 20) {
            return null;
        }
        return directRunAttr;
    }

    private static Style zzT(Paragraph paragraph, int i) {
        if (paragraph == null) {
            return null;
        }
        return paragraph.zzqy(((i & 8) == 0 && (i & 16) == 0) ? 0 : 1);
    }

    public static boolean zzU(zzZAM zzzam) {
        return zzzam.getRunPr_IInline().zzXS4();
    }

    private static Object zzV(zzZAM zzzam, int i) {
        Object objZzPk = zzzam.getDocument_IInline().getStyles().zzY37().zzPk(i);
        return objZzPk == null ? zzYEF.zzne(i) : objZzPk;
    }

    private static Object zzW(zzZAM zzzam, int i) {
        Table parentTable = zzzam.getParentParagraph_IInline().getParentTable();
        if (zzzam.getDocument_IInline().getStyles().zzZ8(parentTable.zzZ7j(), false) == null) {
            return null;
        }
        TableStyle tableStyle = (TableStyle) com.aspose.words.internal.zzZKW.zzZ(parentTable.getStyle(), TableStyle.class);
        Cell cellZzZex = zzzam.getParentParagraph_IInline().zzZex();
        if (tableStyle == null || cellZzZex == null) {
            return null;
        }
        return tableStyle.zzY(i, cellZzZex);
    }

    private static void zzX(zzYEF zzyef, zzYEF zzyef2) {
        if (!zzyef.zzVE(830) || !zzyef2.zzVE(160) || zzyef2.zzVE(830) || ((zz1C) com.aspose.words.internal.zzZKW.zzZ(zzyef.get(830), zz1C.class)) == null) {
            return;
        }
        zzyef.remove(830);
    }

    public static Style zzY(zzZAM zzzam) {
        return zzY(zzzam, true);
    }

    public static zzYEF zzZ(zzZAM zzzam, int i) {
        zzYEF zzyef = new zzYEF();
        zzZ(zzzam, zzyef, i);
        return zzyef;
    }

    public static Style zzZH(Paragraph paragraph) {
        if (paragraph == null || !paragraph.isInCell() || paragraph.getParentTable() == null) {
            return null;
        }
        return paragraph.getParentTable().getStyle();
    }

    private static boolean zzyb(int i) {
        return i == 190 || i == 350;
    }

    public static boolean zzT(zzZAM zzzam) {
        return zzzam.getRunPr_IInline().zzXS3();
    }

    public static Object zzY(zzZAM zzzam, int i) {
        Style styleZzY = zzY(zzzam, false);
        Object objZzZa = (styleZzY == null || styleZzY.getType() != 2) ? null : styleZzY.zzZa(i, false);
        if (objZzZa == null) {
            objZzZa = zzX(zzzam, i);
            if (objZzZa == null && zzX(zzzam)) {
                objZzZa = zzW(zzzam, i);
            }
        } else if (objZzZa instanceof zzZU) {
            objZzZa = zzZ(zzzam, i, (zzZU) objZzZa);
        }
        return objZzZa != null ? objZzZa : zzV(zzzam, i);
    }

    public static boolean zzV(zzZAM zzzam) {
        return zzzam.getRunPr_IInline().zzYrW();
    }

    public static void zzZ(zzZAM zzzam, zzYEF zzyef, int i) {
        zzZ(zzzam.getDocument_IInline(), zzzam.getParentParagraph_IInline(), zzzam.getRunPr_IInline(), zzyef, i);
    }

    public static void zzZ(Paragraph paragraph, zzYEF zzyef, int i) {
        zzZ(paragraph.getDocument(), paragraph, paragraph.zzYp5(), zzyef, i);
    }

    private static void zzZ(DocumentBase documentBase, Paragraph paragraph, zzYEF zzyef, zzYEF zzyef2, int i) {
        Style styleZzZ7;
        Cell cellZzZex;
        StyleCollection styles = documentBase.getStyles();
        Style styleZzZ = zzZ(documentBase, zzyef, i);
        Style styleZzT = (i & 256) == 0 ? zzT(paragraph, i) : styles.zzZ8(0, false);
        Style styleZzZH = zzZH(paragraph);
        zzYEF zzyefZzn9 = zzyef.zzn9(i);
        if ((i & 8) != 0 && zzyef.zz6D()) {
            zzyef2.zzZ((zzZMK) zzyef.zzYsN().deepCloneComplexAttr());
        }
        boolean zZzS = zzyef2.zzS(190, StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4);
        boolean z = (i & 128) == 0;
        int i2 = i & (-129);
        zzYEF zzyefZzY37 = (i & 1) != 0 ? styles.zzY37() : new zzYEF();
        boolean zZzS2 = zzyefZzY37.zzS(190, StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4) | zZzS;
        zzyefZzY37.zzZ(zzyef2, (i & 32) != 0);
        if ((i & 64) == 0 && paragraph != null && (cellZzZex = paragraph.zzZex()) != null && cellZzZex.getParentRow().getParentTable() != null && (styleZzZH = (Style) com.aspose.words.internal.zzZKW.zzZ(styleZzZH, TableStyle.class)) != null) {
            ((TableStyle) styleZzZH).zzZ(cellZzZex, zzyef2);
            zZzS2 |= styleZzZH.zzZYh().zzS(190, StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4);
        }
        if (styleZzT != null) {
            if (styleZzT.getType() == 2) {
                styleZzT = styles.zzZ7(0, false);
            }
            if (zZzS2 && zzZ(documentBase, (TableStyle) com.aspose.words.internal.zzZKW.zzZ(styleZzZH, TableStyle.class))) {
                i2 |= 2;
            }
            styleZzT.zzT(zzyef2, i2 & (-34));
        }
        if (styleZzZ != null && styleZzZ.getType() != 1) {
            if ((i2 & 4) != 0 && styleZzZ.getStyleIdentifier() == 85) {
                if ((!zzyef2.contains(120) && styleZzZ.getFont().getAllCaps()) || (!zzyef2.contains(110) && styleZzZ.getFont().getSmallCaps())) {
                    zzyef2.zzQ(120, zzZU.zzZF6);
                }
                for (int i3 : zzYEF.zzXq6) {
                    Object objZzZa = styleZzZ.zzZa(i3, false);
                    if (objZzZa != null) {
                        zzyef2.zzQ(i3, objZzZa);
                    }
                }
            } else {
                styleZzZ.zzT(zzyef2, (i2 & 8) != 0 ? 8 : 0);
            }
        }
        if (z) {
            if (zzyefZzn9.zz6D() && (i2 & 8) != 0) {
                zzYEF zzyef3 = (zzYEF) zzyefZzn9.zzbn();
                zzyef3.zzYpN();
                zzyef3.zzY(zzyef2);
                if (zzyefZzn9.zzYrW()) {
                    zzyef2.zzQ(12, zzyefZzn9.getDeleteRevision().deepCloneComplexAttr());
                }
                if (zzyefZzn9.zzYrV()) {
                    zzyef2.zzQ(14, zzyefZzn9.getInsertRevision().deepCloneComplexAttr());
                }
                if (zzyefZzn9.zz6D()) {
                    zzyef2.zzQ(10010, zzyefZzn9.zzYsN().deepCloneComplexAttr());
                }
                if (zzyefZzn9.zzXS4()) {
                    zzyef2.zzQ(13, zzyefZzn9.getMoveFromRevision().deepCloneComplexAttr());
                }
                if (zzyefZzn9.zzXS3()) {
                    zzyef2.zzQ(15, zzyefZzn9.getMoveToRevision().deepCloneComplexAttr());
                }
            } else {
                zzyefZzn9.zzY(zzyef2);
                zzyefZzn9.zzI(zzyef2);
            }
        }
        zzX(zzyef2, zzyefZzn9);
        if ((i2 & 512) != 0 || paragraph == null || paragraph.getAncestor(19) == null || (styleZzZ7 = styles.zzZ7(153, false)) == null) {
            return;
        }
        styleZzZ7.zzZYh().zzX(zzyef2, 190);
        styleZzZ7.zzZYh().zzX(zzyef2, StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4);
    }

    public static boolean zzW(zzZAM zzzam) {
        return zzzam.getRunPr_IInline().zzYrV();
    }

    private static boolean zzX(zzZAM zzzam) {
        Paragraph parentParagraph_IInline = zzzam.getParentParagraph_IInline();
        return (parentParagraph_IInline == null || parentParagraph_IInline.getParentTable() == null) ? false : true;
    }

    public static boolean zzW(zzZ9G zzz9g, int i) {
        return ((zzZU) zzZ(zzz9g, i, 0)).toBool();
    }

    private static Object zzX(zzZAM zzzam, int i) {
        Object objZzS;
        Paragraph parentParagraph_IInline = zzzam.getParentParagraph_IInline();
        if (parentParagraph_IInline == null) {
            return null;
        }
        Style styleZzqy = parentParagraph_IInline.zzqy(0);
        return (styleZzqy.getStyleIdentifier() == 0 && zzyb(i) && (objZzS = zzS(parentParagraph_IInline, i)) != null) ? objZzS : styleZzqy.zzZa(i, false);
    }

    public static boolean zzS(zzZAM zzzam) {
        return zzzam.getRunPr_IInline().zz6D();
    }

    private static Style zzY(zzZAM zzzam, boolean z) {
        zzYEF runPr_IInline = zzzam.getRunPr_IInline();
        DocumentBase document_IInline = zzzam.getDocument_IInline();
        if (z) {
            return document_IInline.getStyles().zzVp(((Integer) runPr_IInline.zzVR(50, 0)).intValue(), 10);
        }
        Object objZzVQ = runPr_IInline.zzVQ(50, 0);
        if (objZzVQ != null) {
            return document_IInline.getStyles().zzZ8(((Integer) objZzVQ).intValue(), false);
        }
        return null;
    }

    public static Shading zzX(zzZ9G zzz9g) throws Exception {
        Paragraph parentParagraph_IInline;
        Shading shadingZzX;
        Shading shading = (Shading) zzZ(zzz9g, StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_6, 0);
        if (shading.isVisible()) {
            return shading;
        }
        if (zzz9g instanceof zzZ9Q) {
            Shading shading2 = (Shading) ((zzZ9Q) zzz9g).fetchParaAttr(1460);
            if (shading2.isVisible()) {
                return shading2;
            }
        } else if ((zzz9g instanceof zzZAM) && (parentParagraph_IInline = ((zzZAM) zzz9g).getParentParagraph_IInline()) != null) {
            Shading shading3 = (Shading) parentParagraph_IInline.fetchParaAttr(1460);
            if (shading3.isVisible()) {
                return shading3;
            }
            if (parentParagraph_IInline.isInCell()) {
                Shading shading4 = (Shading) parentParagraph_IInline.zzZex().fetchCellAttr(3170);
                if (shading4.isVisible()) {
                    return shading4;
                }
            }
            if (parentParagraph_IInline.getDocument().getBackgroundShape() != null && (shadingZzX = parentParagraph_IInline.getDocument().getBackgroundShape().zzY9J().zzX(null)) != null && shadingZzX.isVisible()) {
                return shadingZzX;
            }
        }
        return null;
    }

    private static Style zzZ(DocumentBase documentBase, zzYEF zzyef, int i) {
        Object objZzVQ = zzyef.zzVQ(50, i);
        if (objZzVQ != null) {
            return documentBase.getStyles().zzZ8(((Integer) objZzVQ).intValue(), false);
        }
        return null;
    }

    private static zzZU zzZ(zzZAM zzzam, int i, zzZU zzzu) {
        zzZU zzzu2 = (zzZU) zzX(zzzam, i);
        if (zzzu2 == null || zzzu == null) {
            return zzzu;
        }
        zzZU zzzu3 = (zzZU) zzV(zzzam, i);
        zzZU zzzu4 = zzZU.zzZF6;
        return zzzu3 == zzzu4 ? zzzu3 : zzzu == zzzu2 ? zzZU.zzZF7 : zzzu4;
    }

    public static boolean zzZ(DocumentBase documentBase, TableStyle tableStyle) {
        if (tableStyle == null || tableStyle.zzZ7j() == 11) {
            return false;
        }
        zzKR zzkrZzRZ = documentBase.zzZpV().zzYVg.zzZYT().zzRZ("overrideTableStyleFontSizeAndJustification");
        return zzkrZzRZ == null || "0".equals(zzkrZzRZ.getValue());
    }

    public static Object zzZ(zzZ9G zzz9g, int i, int i2) {
        if (zzz9g == null) {
            return null;
        }
        Object directRunAttr = zzz9g.getDirectRunAttr(i, i2);
        if (directRunAttr == null) {
            return zzz9g.fetchInheritedRunAttr(i);
        }
        return directRunAttr instanceof zzZU ? ((zzZU) directRunAttr).zzZ(zzz9g, i) : directRunAttr;
    }
}
