package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZI7 extends DocumentVisitor {
    private zzZI8 zzYqN;
    private HtmlSaveOptions zzYt2;

    public zzZI7(HtmlSaveOptions htmlSaveOptions) {
        if (htmlSaveOptions.getExportListLabels() != 0) {
            htmlSaveOptions.getExportListLabels();
        }
        this.zzYt2 = htmlSaveOptions;
        this.zzYqN = new zzZI8();
    }

    private static int zzZ(List list, ListLevel listLevel) {
        boolean z;
        int numberStyle;
        String numberFormat = listLevel.getNumberFormat();
        if (!com.aspose.words.internal.zzZYD.zzXk(numberFormat)) {
            return 0;
        }
        if (numberFormat.length() == 1 && (numberFormat.charAt(0) == 61623 || numberFormat.charAt(0) == 'o' || numberFormat.charAt(0) == 61607)) {
            String strZzYG = zzZ4H.zzYG(numberFormat.charAt(0));
            zzU1 zzu1ZzYdS = listLevel.zzZYh().zzYdS();
            if (com.aspose.words.internal.zzZYD.zzi(strZzYG, (zzu1ZzYdS == null || zzu1ZzYdS.zzZYI()) ? null : zzu1ZzYdS.getName())) {
                return 1;
            }
        }
        int i = 0;
        while (true) {
            if (i >= 9) {
                z = false;
                break;
            }
            if (numberFormat.indexOf((char) i) != -1) {
                z = true;
                break;
            }
            i++;
        }
        if (!z && com.aspose.words.internal.zzZYD.zzXk(numberFormat)) {
            return numberFormat.length() == 1 ? 2 : 3;
        }
        if (numberFormat.length() == 2 && numberFormat.charAt(0) == listLevel.zzYOa() && numberFormat.charAt(1) == '.' && (listLevel.getNumberStyle() == 0 || listLevel.getNumberStyle() == 4 || listLevel.getNumberStyle() == 3 || listLevel.getNumberStyle() == 2 || listLevel.getNumberStyle() == 1)) {
            return 4;
        }
        boolean z2 = true;
        for (int i2 = 0; i2 < 9; i2++) {
            if (numberFormat.indexOf((char) i2) != -1 && (numberStyle = list.getListLevels().get(i2).getNumberStyle()) != 255 && numberStyle != 0 && numberStyle != 22 && numberStyle != 4 && numberStyle != 3 && numberStyle != 2 && numberStyle != 1) {
                z2 = false;
            }
        }
        if (z) {
            return z2 ? 5 : 6;
        }
        return 7;
    }

    @Override // com.aspose.words.DocumentVisitor
    public int visitParagraphStart(Paragraph paragraph) throws Exception {
        zzZGI zzzgiZzZW = zzZGI.zzZW(paragraph);
        if (!zzzgiZzZW.isListItem()) {
            return 0;
        }
        this.zzYqN.update(zzzgiZzZW.getList().getListId(), zzY(paragraph, zzZ(zzzgiZzZW.getList(), zzzgiZzZW.getListLevel())));
        return super.visitParagraphStart(paragraph);
    }

    public final boolean zzW(Paragraph paragraph, int i) {
        if (i != 1 && i != 4) {
            return false;
        }
        if (i == 4 && this.zzYt2.zzYZc()) {
            return false;
        }
        Font fontZzZ0S = zzZGI.zzZW(paragraph).zzZ0S();
        return (fontZzZ0S.getUnderline() != 0 || fontZzZ0S.getStrikeThrough() || fontZzZ0S.getDoubleStrikeThrough()) ? false : true;
    }

    public abstract int zzY(Paragraph paragraph, int i);

    public final zzZI8 zzZ2t() {
        return this.zzYqN;
    }

    public final boolean zzZ2u() {
        return this.zzYt2.getSaveFormat() != 51;
    }
}
