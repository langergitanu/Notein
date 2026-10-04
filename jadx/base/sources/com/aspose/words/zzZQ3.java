package com.aspose.words;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes6.dex */
final class zzZQ3 {
    private static int[] zzYDz = {1292, 1302, 1340, 1310, 1430, 1520, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, 1490, 1330, 1320, 1290, 1300, 1480, 1660};

    public static int zzLV(String str) {
        if (str == null) {
            return -1;
        }
        if (str.length() == 0) {
            return -2;
        }
        return com.aspose.words.internal.zzZKU.zzZK(str.charAt(0));
    }

    private static boolean zzM(Field field) {
        int type = field.getType();
        if (type == 8 || type == 13) {
            return true;
        }
        if (type == 73) {
            return false;
        }
        throw new IllegalArgumentException();
    }

    public static DocumentBuilder zzN(Field field) {
        DocumentBuilder documentBuilder = new DocumentBuilder(field.getStart().zzYBb());
        if (zzM(field) && !field.getStart().zzYB2()) {
            if (field.getSeparator().getParentNode() != field.getEnd().getParentNode()) {
                documentBuilder.moveTo(field.getSeparator().getParentParagraph());
            } else {
                documentBuilder.moveTo(field.getEnd());
            }
            documentBuilder.writeln();
        }
        documentBuilder.moveTo(field.getEnd());
        return documentBuilder;
    }

    public static Node zzW(DocumentBuilder documentBuilder) {
        Run run = new Run(documentBuilder.getDocument());
        documentBuilder.getCurrentParagraph().appendChild(run);
        return run;
    }

    private static String zzY(FieldRD fieldRD) throws Exception {
        String fileName = fieldRD.getFileName();
        if (com.aspose.words.internal.zzZKN.zzU3(fileName)) {
            return null;
        }
        Document documentZzYBb = fieldRD.getStart().zzYBb();
        return (!fieldRD.isPathRelative() || com.aspose.words.internal.zzZKN.zzU3(documentZzYBb.getOriginalFileName())) ? fileName : com.aspose.words.internal.zzZOQ.zzZW(com.aspose.words.internal.zzZOQ.zzVd(documentZzYBb.getOriginalFileName()), fileName);
    }

    public static void zzZ(Field field, DocumentBuilder documentBuilder, int i) {
        documentBuilder.moveTo(field.getEnd());
        documentBuilder.writeln();
        documentBuilder.moveTo(documentBuilder.getCurrentParagraph().zzYB9());
        zzYMX zzymx = (zzYMX) field.getStart().getParentParagraph().zzZYj().zzbn();
        boolean zIsBidiTextSupportedOnUpdate = documentBuilder.getDocument().getFieldOptions().isBidiTextSupportedOnUpdate();
        boolean z = false;
        boolean z2 = zIsBidiTextSupportedOnUpdate && documentBuilder.getParagraphFormat().getBidi();
        documentBuilder.getParagraphFormat().clearFormatting();
        documentBuilder.getParagraphFormat().setStyleIdentifier(i);
        if (z2) {
            documentBuilder.getParagraphFormat().setBidi(true);
        }
        if (zIsBidiTextSupportedOnUpdate && documentBuilder.getCurrentParagraph().getParagraphBreakFont().getBidi()) {
            z = true;
        }
        documentBuilder.getCurrentParagraph().getParagraphBreakFont().clearFormatting();
        if (z) {
            documentBuilder.getCurrentParagraph().getParagraphBreakFont().setBidi(true);
        }
        zzymx.zzZ(documentBuilder.getCurrentParagraph().zzZYj(), zzYDz);
    }

    private static TabStop zzs(Paragraph paragraph) {
        TabStopCollection tabStops;
        if (paragraph == null || (tabStops = paragraph.zzqw(0).getTabStops()) == null || tabStops.getCount() == 0 || tabStops.get(tabStops.getCount() - 1).getAlignment() != 2) {
            return null;
        }
        return tabStops.get(tabStops.getCount() - 1);
    }

    private static boolean zzt(Paragraph paragraph) {
        Table parentTable = paragraph.getParentTable();
        if (parentTable == null) {
            return false;
        }
        return parentTable.isFloating();
    }

    public static void zzZ(Document document, zzZ9G zzz9g) {
        boolean zIsBidiTextSupportedOnUpdate = document.getFieldOptions().isBidiTextSupportedOnUpdate();
        if (document.zzZqI() != null) {
            zzz9g.setRunAttr(230, zzU1.zzMW(131076));
            zzz9g.setRunAttr(240, zzU1.zzMW(131076));
            if (zIsBidiTextSupportedOnUpdate) {
                zzz9g.setRunAttr(270, zzU1.zzMW(131074));
                zzz9g.setRunAttr(235, zzU1.zzMW(131075));
            }
        } else {
            zzz9g.setRunAttr(230, zzU1.zzSP("Calibri"));
            zzz9g.setRunAttr(240, zzU1.zzSP("Calibri"));
            if (zIsBidiTextSupportedOnUpdate) {
                zzz9g.setRunAttr(270, zzU1.zzSP("Arial"));
                zzz9g.setRunAttr(235, zzU1.zzSP("Calibri"));
            }
        }
        zzz9g.setRunAttr(190, 22);
        if (zIsBidiTextSupportedOnUpdate) {
            zzz9g.setRunAttr(StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4, 22);
        }
        zzz9g.setRunAttr(440, zzZU.zzZF6);
    }

    public static void zzZ(DocumentBuilder documentBuilder, Paragraph paragraph) {
        if (!zzt(documentBuilder.getCurrentParagraph()) && zzs(documentBuilder.getCurrentParagraph()) == null) {
            Section currentSection = documentBuilder.getCurrentSection();
            int columnsCount = currentSection.zzYvR().getColumnsCount();
            double dZzYRX = currentSection.getPageSetup().zzYRX();
            if (columnsCount > 1) {
                dZzYRX = (dZzYRX - ((((double) currentSection.zzYvR().zzYco()) / 20.0d) * ((double) (columnsCount - 1)))) / ((double) columnsCount);
            }
            TabStop tabStopZzs = zzs(paragraph);
            zzZ(documentBuilder.getCurrentParagraph(), dZzYRX - 0.5d, 2, tabStopZzs != null ? tabStopZzs.getLeader() : 1);
        }
    }

    private static void zzZ(Paragraph paragraph, double d, int i, int i2) {
        ParagraphFormat paragraphFormat = paragraph.getParagraphFormat();
        TabStop tabStop = paragraphFormat.getStyle().getParagraphFormat().getTabStops().get(d);
        if (tabStop == null || tabStop.isClear()) {
            paragraphFormat.getTabStops().add(d, i, i2);
        }
    }

    public static void zzZ(Run run, int i, boolean z) {
        com.aspose.words.internal.zzZKN.equals(run.getText(), ControlChar.TAB);
        double dZzZ = zzZ(run.zzYBb(), run.getFont(), zzYVY.zzJ(new zzYWB(run.getParentParagraph().getFirstChild(), true, run, false)), i, z);
        if (!com.aspose.words.internal.zzAN.zzZC(dZzZ)) {
            zzZ(run.getParentParagraph(), dZzZ, 0, 0);
        }
        zzZ(run.zzYBb(), run);
    }

    private static double zzZ(Document document, Font font, String str, int i, boolean z) {
        double dZz7 = document.zzZqy().zzY(font.getName(), (float) font.getSize(), font.zzza()).zz7(str);
        ParagraphFormat paragraphFormatZzZ = zzZ(i, document, z);
        double firstLineIndent = paragraphFormatZzZ.getFirstLineIndent();
        double leftIndent = paragraphFormatZzZ.getLeftIndent() + firstLineIndent + dZz7;
        double dZzZ = zzZ(i, leftIndent, document, z);
        if (com.aspose.words.internal.zzAN.zzZC(dZzZ)) {
            dZzZ = zzZ(i, leftIndent + 11.0d, document);
        }
        if (firstLineIndent < 0.0d) {
            double d = -firstLineIndent;
            if (dZzZ < d || com.aspose.words.internal.zzAN.zzL(dZzZ, d)) {
                return -1.7976931348623157E308d;
            }
        }
        return dZzZ;
    }

    private static double zzZ(int i, double d, Document document, boolean z) {
        ParagraphFormat paragraphFormatZzZ = zzZ(i, document, z);
        double leftIndent = paragraphFormatZzZ.getFirstLineIndent() < 0.0d ? paragraphFormatZzZ.getLeftIndent() - d : 0.0d;
        TabStop tabStopAfter = paragraphFormatZzZ.getTabStops().after(d);
        if (tabStopAfter == null || tabStopAfter.getAlignment() != 0) {
            return -1.7976931348623157E308d;
        }
        double position = tabStopAfter.getPosition() - d;
        if (leftIndent <= 0.0d || leftIndent >= position) {
            leftIndent = position;
        }
        if (leftIndent > 0.0d) {
            return d + leftIndent;
        }
        return -1.7976931348623157E308d;
    }

    private static double zzZ(int i, double d, Document document) {
        double leftIndent;
        do {
            ParagraphFormat paragraphFormatZzZ = zzZ(i, document, false);
            double leftIndent2 = paragraphFormatZzZ.getFirstLineIndent() < 0.0d ? paragraphFormatZzZ.getLeftIndent() - d : 0.0d;
            if (leftIndent2 <= 0.0d) {
                leftIndent2 = 0.0d;
            }
            if (leftIndent2 > 0.0d) {
                return d + leftIndent2;
            }
            if (i >= 9) {
                return d;
            }
            i++;
            leftIndent = zzZ(i, document, false).getLeftIndent();
        } while (leftIndent - d <= 0.0d);
        return leftIndent;
    }

    private static ParagraphFormat zzZ(int i, Document document, boolean z) {
        int iZzZY = FieldToc.zzZY(i, z);
        Style styleZzZ7 = document.getStyles().zzZ7(iZzZY, false);
        if (styleZzZ7 != null) {
            return new ParagraphFormat(styleZzZ7.zzqw(0), document.getStyles());
        }
        ParagraphFormat paragraphFormat = new ParagraphFormat((zzZ9Q) document.getStyles().zzY32().getByStyleIdentifier(iZzZY).zzZYj().zzbn(), document.getStyles());
        paragraphFormat.setLeftIndent(((double) (i - 1)) * 11.0d);
        return paragraphFormat;
    }

    public static Document zzZ(FieldRD fieldRD) throws Exception {
        String strZzY = zzY(fieldRD);
        Document document = null;
        if (com.aspose.words.internal.zzZKN.zzU3(strZzY)) {
            return null;
        }
        com.aspose.words.internal.zzZOP zzzopZzY = zzZOO.zzY(strZzY, fieldRD.getStart().getDocument().getResourceLoadingCallback());
        if (zzzopZzY != null) {
            try {
                document = new Document(zzzopZzY, null, false);
            } finally {
                zzzopZzY.close();
            }
        }
        if (zzzopZzY != null) {
        }
        return document;
    }
}
