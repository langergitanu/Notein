package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ5Y {
    private static double zzZA(Paragraph paragraph) {
        ListLabel listLabel = paragraph.getListLabel();
        ListLevel listLevelZzRB = paragraph.zzRB(false);
        return (((double) listLevelZzRB.zzYO6()) / 20.0d) + ((double) paragraph.getDocument().zzZqy().zzY(listLabel.getFont().getName(), (float) listLabel.getFont().getSize(), 0).zz7(listLabel.zzYOu()));
    }

    public static TabStop zzZB(Paragraph paragraph) {
        double dMax;
        if (!paragraph.isListItem()) {
            return null;
        }
        ListLevel listLevelZzRB = paragraph.zzRB(false);
        if (!listLevelZzRB.getLegacy()) {
            return null;
        }
        double firstLineIndent = paragraph.getParagraphFormat().getFirstLineIndent() + paragraph.getParagraphFormat().getLeftIndent();
        if (listLevelZzRB.zzYO5() == 0 && listLevelZzRB.zzYO6() == 0) {
            dMax = paragraph.getParagraphFormat().getLeftIndent();
        } else {
            dMax = Math.max(((double) listLevelZzRB.zzYO5()) / 20.0d, listLevelZzRB.zzYO6() != 0 ? zzZA(paragraph) : 0.0d) + firstLineIndent;
        }
        return TabStop.zzO(dMax, dMax <= firstLineIndent ? 2 : 0);
    }
}
