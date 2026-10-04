package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzMW {
    private static zzLU zzZpm;

    static {
        zzLU zzlu = new zzLU();
        zzZpm = zzlu;
        zzlu.zzZ("text-indent", 0.0d, 4);
        zzZpm.zzZs("background-color", "transparent");
        zzZpm.zzV("widows", 2.0d);
        zzZpm.zzV("orphans", 2.0d);
        zzZpm.zzZs("line-height", "normal");
        zzZpm.zzZs("page-break-inside", "auto");
        zzZpm.zzZs("page-break-after", "auto");
        zzZpm.zzZs("page-break-before", "auto");
        zzZpm.zzZs("text-align", "initial");
        zzZpm.zzZ("margin-top", 0.0d, 4);
        zzZpm.zzZ("margin-right", 0.0d, 4);
        zzZpm.zzZ("margin-bottom", 0.0d, 4);
        zzZpm.zzZ("margin-left", 0.0d, 4);
        zzZpm.zzZ("padding-top", 0.0d, 4);
        zzZpm.zzZ("padding-right", 0.0d, 4);
        zzZpm.zzZ("padding-bottom", 0.0d, 4);
        zzZpm.zzZ("padding-left", 0.0d, 4);
        zzZpm.zzX(zzL4.zzZno, zzL4.zzZlB, zzL4.zzZnp);
    }

    private static int zzMo(int i) {
        if (i != 3) {
            return i != 4 ? 1 : 2;
        }
        return 0;
    }

    private static OfficeMath zzR(Paragraph paragraph) {
        int i = 0;
        OfficeMath officeMath = null;
        for (Node nodeZzZYr = paragraph.zzZYr(); nodeZzZYr != null; nodeZzZYr = nodeZzZYr.zzYB4()) {
            i++;
            if (nodeZzZYr.getNodeType() == 35) {
                officeMath = (OfficeMath) nodeZzZYr;
            }
        }
        if (i == 1) {
            return officeMath;
        }
        return null;
    }

    public static boolean zzS(Paragraph paragraph) {
        Paragraph paragraph2;
        return paragraph.getParagraphFormat().getNoSpaceBetweenParagraphsOfSameStyle() && (paragraph2 = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(paragraph.zzYB5(), Paragraph.class)) != null && com.aspose.words.internal.zzZKN.equals(paragraph.zzqy(0).getName(), paragraph2.zzqy(0).getName());
    }

    public static boolean zzT(Paragraph paragraph) {
        Paragraph paragraph2;
        return paragraph.getParagraphFormat().getNoSpaceBetweenParagraphsOfSameStyle() && (paragraph2 = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(paragraph.zzYB6(), Paragraph.class)) != null && com.aspose.words.internal.zzZKN.equals(paragraph.zzqy(0).getName(), paragraph2.zzqy(0).getName());
    }

    private static void zzX(zzLU zzlu) {
        Iterator<zzPT> it = zzZpm.iterator();
        while (it.hasNext()) {
            String strZzZWo = it.next().zzZWo();
            if (zzlu.zzSd(strZzZWo) == null) {
                zzlu.zzZ(strZzZWo, zzZpm.zzSd(strZzZWo));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzLU zzY(Paragraph paragraph, ParagraphFormat paragraphFormat, double d, int i, boolean z, boolean z2, int i2, boolean z3) throws Exception {
        int iZzMo;
        zzLU zzlu = new zzLU();
        zzZ(paragraph, paragraphFormat, i != 0, z, z2, i2, zzlu);
        zzZ(paragraphFormat, i, z, z2, i2, zzlu);
        double firstLineIndent = zzZGI.zzZW(paragraph).getFirstLineIndent();
        if (!com.aspose.words.internal.zzAN.zzZD(firstLineIndent)) {
            zzlu.zzZ("text-indent", firstLineIndent, 4);
        }
        OfficeMath officeMathZzR = zzR(paragraph);
        if (officeMathZzR != null) {
            iZzMo = officeMathZzR.getJustification() != (paragraphFormat.getBidi() ? 4 : 3) ? zzMo(officeMathZzR.getJustification()) : zzi(paragraphFormat.getAlignment(), paragraphFormat.getBidi());
        }
        if (iZzMo != (paragraphFormat.getBidi() ? 2 : 0)) {
            zzlu.zzZs("text-align", zzZDY.zzyP(iZzMo));
        }
        if (paragraphFormat.getKeepTogether()) {
            zzlu.zzZs("page-break-inside", "avoid");
        }
        if (paragraphFormat.getKeepWithNext()) {
            zzlu.zzZs("page-break-after", "avoid");
        }
        if (paragraphFormat.getPageBreakBefore()) {
            zzlu.zzZs("page-break-before", "always");
        }
        if (!paragraphFormat.getWidowControl()) {
            zzlu.zzV("widows", 0.0d);
            zzlu.zzV("orphans", 0.0d);
        }
        int lineSpacingRule = paragraphFormat.getLineSpacingRule();
        if (lineSpacingRule == 0) {
            zzlu.zzZ("line-height", Math.max(paragraphFormat.getLineSpacing(), d), 4);
        } else if (lineSpacingRule == 1) {
            zzlu.zzZ("line-height", paragraphFormat.getLineSpacing(), 4);
        } else {
            if (lineSpacingRule != 2) {
                throw new IllegalStateException("Unknown line spacing rule.");
            }
            double dZzZa = com.aspose.words.internal.zzZKQ.zzZa((paragraphFormat.getLineSpacing() / 12.0d) * 100.0d);
            if (dZzZa != 100.0d) {
                zzlu.zzU("line-height", dZzZa);
            }
            zzlu.zzZ("font-size", d, 4);
        }
        if (i == 0) {
            zzQS.zzZ(zzlu, paragraphFormat.getBorders(), z3);
        } else if (paragraphFormat.getBorders().getHorizontal().isVisible() && i != 3) {
            zzQS.zzZ(zzlu, paragraphFormat.getBorders().getHorizontal(), 0, false, false, z3, false);
        }
        zzM9.zzZ(paragraphFormat.getShading(), zzlu);
        if (paragraph.getFrameFormat().isFrame()) {
            String strZzM7 = zzL5.zzM7(paragraphFormat.zzYpr());
            if (!"lr-tb".equals(strZzM7)) {
                zzlu.zzZs("writing-mode", strZzM7);
            }
        }
        if (paragraphFormat.getBaselineAlignment() != 4 && paragraphFormat.getBaselineAlignment() != 2) {
            zzlu.zzV(new zzM3("vertical-align", zzL5.zzM6(paragraphFormat.getBaselineAlignment()), (byte) 0));
        }
        return zzlu;
    }

    public static zzLU zzZ(Paragraph paragraph, ParagraphFormat paragraphFormat, double d, int i, boolean z, boolean z2, int i2, boolean z3) throws Exception {
        zzLU zzluZzY = zzY(paragraph, paragraphFormat, d, i, z, z2, i2, z3);
        zzX(zzluZzY);
        return zzluZzY;
    }

    private static int zzi(int i, boolean z) {
        if (z) {
            if (i == 0) {
                return 2;
            }
            if (i == 2) {
                return 0;
            }
        }
        return i;
    }

    private static void zzZ(Paragraph paragraph, ParagraphFormat paragraphFormat, zzO0 zzo0) {
        ParagraphFormat paragraphFormat2;
        Node nodeZzYB9 = paragraph.zzYB9();
        ParagraphFormat paragraphFormat3 = null;
        if (nodeZzYB9 == null || nodeZzYB9.getNodeType() != 8) {
            paragraphFormat2 = null;
        } else {
            Paragraph paragraph2 = (Paragraph) nodeZzYB9;
            paragraphFormat2 = new ParagraphFormat(zzZDY.zzZI(paragraph2), paragraph2.getDocument().getStyles());
        }
        Node nodeZzYB4 = paragraph.zzYB4();
        if (nodeZzYB4 != null && nodeZzYB4.getNodeType() == 8) {
            Paragraph paragraph3 = (Paragraph) nodeZzYB4;
            paragraphFormat3 = new ParagraphFormat(zzZDY.zzZI(paragraph3), paragraph3.getDocument().getStyles());
        }
        Document document = (Document) paragraph.getDocument();
        if (!document.getCompatibilityOptions().getDoNotUseHTMLParagraphAutoSpacing()) {
            boolean z = true;
            boolean z2 = paragraph != document.getFirstSection().getBody().getFirstParagraph();
            Cell cell = (Cell) paragraph.getAncestor(7);
            if (cell != null && paragraph == cell.getFirstParagraph()) {
                z2 = false;
            }
            if (cell != null && paragraph == cell.getLastParagraph()) {
                z = false;
            }
            if (paragraphFormat2 != null && paragraphFormat2.isListItem() && paragraphFormat.isListItem()) {
                z2 = false;
            }
            boolean z3 = (paragraphFormat3 != null && paragraphFormat3.isListItem() && paragraphFormat.isListItem()) ? false : z;
            if (paragraphFormat.getSpaceBeforeAuto() && z2) {
                zzo0.setTop(14.0d);
            } else if (!paragraphFormat.getSpaceBeforeAuto()) {
                zzo0.setTop(paragraphFormat.getSpaceBefore());
            } else {
                zzo0.setTop(0.0d);
            }
            if (paragraphFormat.getSpaceAfterAuto() && z3) {
                zzo0.zzYX(14.0d);
                return;
            } else if (!paragraphFormat.getSpaceAfterAuto()) {
                zzo0.zzYX(paragraphFormat.getSpaceAfter());
                return;
            } else {
                zzo0.zzYX(0.0d);
                return;
            }
        }
        zzo0.setTop(paragraphFormat.getSpaceBefore());
        if (paragraphFormat2 != null) {
            zzo0.setTop(paragraphFormat2.getSpaceAfter() + zzo0.getTop());
        }
        zzo0.zzYX(paragraphFormat.getSpaceAfter());
        if (paragraphFormat3 != null) {
            zzo0.zzYX(paragraphFormat3.getSpaceBefore() + zzo0.getBottom());
        }
    }

    private static void zzZ(Paragraph paragraph, ParagraphFormat paragraphFormat, boolean z, boolean z2, boolean z3, int i, zzLU zzlu) throws Exception {
        Border left;
        Border right;
        zzO0 zzo0 = new zzO0();
        zzZGI zzzgiZzZW = zzZGI.zzZW(paragraph);
        if (z) {
            zzo0.setLeft(0.0d);
            if (zzzgiZzZW.getFirstLineIndent() < 0.0d) {
                zzo0.setLeft(-zzzgiZzZW.getFirstLineIndent());
            }
            zzo0.zzYY(0.0d);
        } else {
            zzo0.setLeft(zzzgiZzZW.getLeftIndent());
            zzo0.zzYY(zzzgiZzZW.getRightIndent());
            if (paragraphFormat.getBidi()) {
                left = paragraphFormat.getBorders().getRight();
            } else {
                left = paragraphFormat.getBorders().getLeft();
            }
            zzo0.setLeft(zzo0.getLeft() - (left.getDistanceFromText() + ((double) zzQS.zzH(left))));
            if (paragraphFormat.getBidi()) {
                right = paragraphFormat.getBorders().getLeft();
            } else {
                right = paragraphFormat.getBorders().getRight();
            }
            zzo0.zzYY(zzo0.getRight() - (right.getDistanceFromText() + ((double) zzQS.zzH(right))));
        }
        zzZ(paragraph, paragraphFormat, zzo0);
        if (z2 || z) {
            zzo0.setTop(0.0d);
        }
        if (z3 || z) {
            zzo0.zzYX(0.0d);
        }
        zzO0 zzo0Zzl = zzo0.zzl(i, paragraphFormat.getBidi());
        zzlu.zzZ("margin-top", zzo0Zzl.getTop(), 4);
        zzlu.zzZ("margin-right", zzo0Zzl.getRight(), 4);
        zzlu.zzZ("margin-bottom", zzo0Zzl.getBottom(), 4);
        zzlu.zzZ("margin-left", zzo0Zzl.getLeft(), 4);
    }

    private static void zzZ(ParagraphFormat paragraphFormat, int i, boolean z, boolean z2, int i2, zzLU zzlu) throws Exception {
        zzN5 zzn5Zzj = new zzN5().zzj(i2, paragraphFormat.getBidi());
        zzn5Zzj.setLeft(paragraphFormat.getBorders().getLeft().getDistanceFromText() + zzn5Zzj.getLeft());
        zzn5Zzj.zzYY(paragraphFormat.getBorders().getRight().getDistanceFromText() + zzn5Zzj.getRight());
        if (i == 0) {
            if (!z) {
                zzn5Zzj.setTop(paragraphFormat.getBorders().getTop().getDistanceFromText() + zzn5Zzj.getTop());
            }
            if (!z2) {
                zzn5Zzj.zzYX(paragraphFormat.getBorders().getBottom().getDistanceFromText() + zzn5Zzj.getBottom());
            }
        } else if (i == 1) {
            zzn5Zzj.setTop(paragraphFormat.getBorders().getTop().getDistanceFromText() + zzn5Zzj.getTop());
            if (paragraphFormat.getBorders().getHorizontal().isVisible()) {
                zzn5Zzj.zzYX(paragraphFormat.getBorders().getTop().getDistanceFromText() + zzn5Zzj.getBottom());
            }
            if (!z2) {
                zzn5Zzj.zzYX(paragraphFormat.getSpaceAfter() + zzn5Zzj.getBottom());
            }
        } else if (i == 2) {
            if (!z2) {
                zzn5Zzj.zzYX(paragraphFormat.getSpaceAfter() + zzn5Zzj.getBottom());
            }
            if (paragraphFormat.getBorders().getHorizontal().isVisible()) {
                zzn5Zzj.setTop(paragraphFormat.getBorders().getTop().getDistanceFromText() + zzn5Zzj.getTop());
                zzn5Zzj.zzYX(paragraphFormat.getBorders().getTop().getDistanceFromText() + zzn5Zzj.getBottom());
            }
        } else if (i == 3) {
            if (paragraphFormat.getBorders().getHorizontal().isVisible()) {
                zzn5Zzj.setTop(paragraphFormat.getBorders().getTop().getDistanceFromText() + zzn5Zzj.getTop());
            }
            zzn5Zzj.zzYX(paragraphFormat.getBorders().getBottom().getDistanceFromText() + zzn5Zzj.getBottom());
        }
        zzn5Zzj.zzYg(true);
        zzn5Zzj.zzYf(true);
        zzn5Zzj.zzYe(true);
        zzn5Zzj.zzYd(true);
        zzn5Zzj.zzZ(zzlu);
    }
}
