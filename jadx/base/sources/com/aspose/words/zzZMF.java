package com.aspose.words;

import com.aspose.words.ref.RefBoolean;

/* JADX INFO: loaded from: classes6.dex */
final class zzZMF {
    private static int[] zzYw7 = {StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2, 380, 390};
    private static int[] zzYw6 = {390, 235};
    private static int[] zzYw5 = {StyleIdentifier.SUBTLE_EMPHASIS, 250, 270, StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4, StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2};
    private static int[] zzYw4 = {30, 40, 790, 890, 1580, 1610, 1620, 1630, 1640, 2250, 2430, 10010};
    private static int[] zzYw3 = {30, 40, StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2, 380, 390, 1580, 2250, 10010};
    private static int[] zzYw2 = {3010, 3220, 3900, 4251, 4253, 4261, 4400, 5100, 5101, 5102, 5103, 5104, 5105, 5106, 5107, 5108, 5111, 5112};

    private static void zzO(zzYEF zzyef) {
        for (int i : zzYw7) {
            if (((Integer) zzyef.zzPj(i)).intValue() == 1024) {
                zzyef.remove(i);
            }
        }
    }

    private static zzY6G zzR(Row row) {
        zzY6G zzy6g = new zzY6G();
        TableStyle tableStyle = (TableStyle) com.aspose.words.internal.zzZKW.zzZ(row.getParentTable().getStyle(), TableStyle.class);
        if (tableStyle != null) {
            tableStyle.zzXWU().zzZ((zzZS) zzy6g, true);
            row.zzZYf().zzY(zzy6g);
            zzy6g.remove(5100);
        }
        return zzy6g;
    }

    private static boolean zzY(Run run, Run run2, zzU8 zzu8) throws Exception {
        if (zzu8.zzZul.containsKey(new zzZT(run.zzZYh(), run2.zzZYh())) && run.getAncestor(5) == null && run2.getAncestor(5) == null) {
            Paragraph parentParagraph = run.getParentParagraph();
            Paragraph parentParagraph2 = run2.getParentParagraph();
            zzZT zzzt = new zzZT(parentParagraph.zzZYj(), parentParagraph2.zzZYj());
            RefBoolean refBoolean = new RefBoolean(false);
            boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(zzu8.zzZuk, zzzt, refBoolean);
            if (refBoolean.get()) {
                return true;
            }
            if (!zZzZ) {
                zzZ((Paragraph) parentParagraph.deepClone(false), (Paragraph) parentParagraph2.deepClone(false), zzu8);
                zzu8.zzZuk.put(zzzt, Boolean.valueOf(!r5.zzZYj().zz6D()));
            }
        }
        return false;
    }

    public static void zzZ(Paragraph paragraph, Paragraph paragraph2, zzU8 zzu8) throws Exception {
        if (zzu8.zzZup.zzZZ4()) {
            return;
        }
        zzYMX zzymxZzqw = paragraph.zzqw(85);
        zzymxZzqw.zzBl(zzymxZzqw.zzZ7j());
        zzYMX zzymxZzqw2 = paragraph2.zzqw(69);
        zzymxZzqw2.zzBl(zzu8.zzN8(zzymxZzqw2.zzZ7j()));
        zzymxZzqw2.zzxC(zzZ4K.zzZ(zzymxZzqw.getListId(), zzymxZzqw2.getListId(), zzu8));
        if (!zzymxZzqw.zzW(zzymxZzqw2, zzYw4)) {
            zzymxZzqw2.zzX(zzymxZzqw);
            if (zzymxZzqw2.getListId() != 0 && !paragraph2.zzZYj().zzVE(EditingLanguage.KASHMIRI_ARABIC)) {
                zzymxZzqw2.zzX(zzu8.zzZZ6().getLists().zzZ(zzymxZzqw2, 0).zzZYj());
            }
            if (zzymxZzqw2.zzYpL()) {
                paragraph2.zzZYj().zzW(zzymxZzqw2, 1160);
                paragraph2.zzZYj().zzW(zzymxZzqw2, EditingLanguage.CENTRAL_KURDISH_IRAQ);
            }
            boolean zZzVE = zzymxZzqw2.zzVE(EditingLanguage.KASHMIRI_ARABIC);
            zzYMX zzymx = (zzYMX) zzZ(paragraph2.zzZYj(), zzymxZzqw2);
            if (zzymx.getListId() != 0 && !zZzVE) {
                zzymx.zzxC(zzu8.zzN7(zzymx.getListId()));
            }
            if (zzymxZzqw.getListId() != zzymx.getListId()) {
                paragraph2.zzZYj().zzW(zzymx, 1160);
                paragraph2.zzZYj().zzW(zzymx, EditingLanguage.CENTRAL_KURDISH_IRAQ);
            }
            zzZ(paragraph.zzZYj(), zzymx, zzu8);
        }
        if (zzu8.zzZZ9()) {
            zzZ4K.zzZ(paragraph, zzu8);
        }
        zzYEF zzyefZzqv = paragraph.zzqv(41);
        zzyefZzqv.zzBl(zzyefZzqv.zzZ7j());
        zzYEF zzyefZzqv2 = paragraph2.zzqv(33);
        zzyefZzqv2.zzBl(zzu8.zzN8(zzyefZzqv2.zzZ7j()));
        zzZ(zzyefZzqv, zzyefZzqv2, zzYw6);
        zzyefZzqv.remove(400);
        zzyefZzqv2.remove(400);
        if (zzZ(paragraph.zzYp5(), zzyefZzqv, paragraph2.zzYp5(), zzyefZzqv2)) {
            return;
        }
        zzyefZzqv2.zzX(zzyefZzqv);
        zzZ(paragraph.zzYp5(), (zzYEF) zzZ((WordAttrCollection) paragraph2.zzYp5(), (WordAttrCollection) zzyefZzqv2), zzu8);
    }

    public static void zzZ(Section section, Section section2, zzU8 zzu8) {
        if (zzu8.zzZup.zzZZ4()) {
            return;
        }
        zzZS zzycz = new zzYCZ();
        section.zzYvR().zzZ(zzycz, true);
        zzYCZ zzycz2 = new zzYCZ();
        section2.zzYvR().zzZ((zzZS) zzycz2, true);
        if (zzycz.zzW(zzycz2, zzYw4)) {
            return;
        }
        zzycz2.zzX(zzycz);
        zzZ(section.zzYvR(), zzycz2, zzu8);
    }

    public static void zzZ(Row row, Row row2, zzU8 zzu8) {
        if (zzu8.zzZup.zzZZ4()) {
            return;
        }
        zzZS zzzsZzR = zzR(row);
        zzY6G zzy6gZzR = zzR(row2);
        zzy6gZzR.zzBl(zzu8.zzN8(zzy6gZzR.zzZ7j()));
        if (zzzsZzR.zzW(zzy6gZzR, zzYw2)) {
            return;
        }
        zzy6gZzR.zzX(zzzsZzR, 4400);
        zzZ(row.zzZYf(), zzy6gZzR, zzu8);
    }

    public static void zzZ(Cell cell, Cell cell2, zzU8 zzu8) {
        if (zzu8.zzZup.zzZZ4()) {
            return;
        }
        zzWP zzwp = new zzWP();
        cell.zz6G().zzZ((zzZS) zzwp, true);
        cell.zz6G().zzY((zzZS) zzwp);
        zzWP zzwp2 = new zzWP();
        cell2.zz6G().zzZ((zzZS) zzwp2, true);
        cell2.zz6G().zzY((zzZS) zzwp2);
        if (!zzwp.zzW(zzwp2, zzYw2)) {
            zzWP zzwp3 = (zzWP) zzwp2.zzbn();
            zzwp3.zzX(zzwp);
            zzZ(cell.zz6G(), zzwp3, zzu8);
            return;
        }
        cell.zz6G().setWidth(cell2.zz6G().getWidth());
    }

    public static void zzZ(Style style, Style style2, zzU8 zzu8) throws Exception {
        if (zzu8.zzZup.zzZZ4() || style.getType() == 3 || style.getStyleIdentifier() == 65) {
            return;
        }
        zzYEF zzyefZzl1 = style.zzl1(41);
        zzyefZzl1.remove(50);
        zzYEF zzyefZzl12 = style2.zzl1(33);
        zzyefZzl12.remove(50);
        if (!zzyefZzl1.zzW(zzyefZzl12, zzYw3)) {
            zzyefZzl12.zzX(zzyefZzl1);
            zzZ(style.zzZYh(), zzyefZzl12, zzu8);
        }
        if (style.getType() != 2) {
            zzYMX zzymxZzqw = style.zzqw(85);
            zzymxZzqw.remove(1000);
            zzYMX zzymxZzqw2 = style2.zzqw(69);
            zzymxZzqw2.remove(1000);
            zzymxZzqw2.zzxC(zzZ4K.zzZ(zzymxZzqw.getListId(), zzymxZzqw2.getListId(), zzu8));
            if (zzymxZzqw.zzW(zzymxZzqw2, zzYw4)) {
                return;
            }
            zzymxZzqw2.zzX(zzymxZzqw);
            zzZ(style.zzZYj(), zzymxZzqw2, zzu8);
        }
    }

    public static zzYEF zzZ(Run run, Run run2, zzU8 zzu8) throws Exception {
        if (zzu8.zzZup.zzZZ4() || zzY(run, run2, zzu8)) {
            return null;
        }
        zzYEF zzyefZzZ = zzZ7R.zzZ(run, 41);
        zzyefZzZ.zzBl(zzyefZzZ.zzZ7j());
        zzYEF zzyefZzZ2 = zzZ7R.zzZ(run2, 33);
        zzyefZzZ2.zzBl(zzu8.zzN8(zzyefZzZ2.zzZ7j()));
        if (!zzyefZzZ.zzYdM().toBool()) {
            zzZ(zzyefZzZ, zzyefZzZ2, zzYw5);
        }
        if (zzY0C.zzzG(run.getText().charAt(0)) != 1) {
            zzZ(zzyefZzZ, zzyefZzZ2, zzYw6);
        }
        if (!zzZ(run.zzZYh(), zzyefZzZ, run2.zzZYh(), zzyefZzZ2)) {
            zzyefZzZ2.zzX(zzyefZzZ);
            return zzyefZzZ2;
        }
        zzu8.zzZul.put(new zzZT(run.zzZYh(), run2.zzZYh()), Boolean.TRUE);
        return null;
    }

    public static void zzZ(WordAttrCollection wordAttrCollection, WordAttrCollection wordAttrCollection2, zzU8 zzu8) {
        if (wordAttrCollection2.getCount() == 0) {
            return;
        }
        if (zzu8.zzZup.zzZZ3()) {
            wordAttrCollection2.zzY(wordAttrCollection);
            return;
        }
        zzZV7 zzzv7ZzZqs = zzu8.zzZZ6().zzZqs();
        wordAttrCollection.zzZ(new zzZMK(wordAttrCollection2, zzzv7ZzZqs.getAuthor(), zzzv7ZzZqs.zzZx()));
        zzu8.zzZZ7();
    }

    public static void zzZ(Row row, Row row2) {
        zzZS zzzsZzR = zzR(row);
        zzY6G zzy6gZzR = zzR(row2);
        if (zzzsZzR.zzW(zzy6gZzR, zzYw2)) {
            return;
        }
        zzy6gZzR.zzX(zzzsZzR, 4400);
        zzy6gZzR.zzY(row.zzZYf());
    }

    private static WordAttrCollection zzZ(WordAttrCollection wordAttrCollection, WordAttrCollection wordAttrCollection2) {
        if (!wordAttrCollection2.contains(1000) && !wordAttrCollection2.contains(50)) {
            return wordAttrCollection2;
        }
        WordAttrCollection wordAttrCollection3 = (WordAttrCollection) wordAttrCollection.zzbn();
        wordAttrCollection2.zzY(wordAttrCollection3);
        return wordAttrCollection3;
    }

    private static boolean zzZ(zzYEF zzyef, zzYEF zzyef2, zzYEF zzyef3, zzYEF zzyef4) {
        if (zzyef2.zzW(zzyef4, zzYw4)) {
            return true;
        }
        zzYEF zzyef5 = (zzYEF) zzyef2.zzbn();
        zzYEF zzyef6 = (zzYEF) zzyef4.zzbn();
        zzZ(zzyef, zzyef5);
        zzZ(zzyef3, zzyef6);
        zzO(zzyef5);
        zzO(zzyef6);
        return zzyef5.zzW(zzyef6, zzYw4);
    }

    private static void zzZ(zzYEF zzyef, zzYEF zzyef2) {
        for (int i : zzYw7) {
            if (!zzyef.contains(i)) {
                zzyef2.remove(i);
            }
        }
    }

    private static void zzZ(WordAttrCollection wordAttrCollection, WordAttrCollection wordAttrCollection2, int[] iArr) {
        for (int i : iArr) {
            wordAttrCollection.remove(i);
            wordAttrCollection2.remove(i);
        }
    }
}
