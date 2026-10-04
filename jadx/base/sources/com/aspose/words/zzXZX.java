package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzXZX extends zzZ1G {
    private int zzWTx;
    private int zzWTy;
    private zzXZW zzWTz;
    private zzYU6 zzXSu;

    public zzXZX(zzYU6 zzyu6, zzXZW zzxzw) {
        this.zzXSu = zzyu6;
        this.zzWTz = zzxzw;
    }

    private static double zzXP(Paragraph paragraph) {
        Font font = paragraph.zzYp7().getFont();
        return paragraph.getDocument().zzZqy().zzY(font.getName(), (float) font.getSize(), font.zzza()).zz7(" ");
    }

    private void zzXQ(Paragraph paragraph) {
        this.zzWTz.zzV(paragraph.zzYp7().getFont(), zzhu((int) (zzXZY.zzXR(paragraph).zzZ1a() / zzXP(paragraph))), 3);
    }

    private void zzXRL() {
        if (this.zzWTy != 0) {
            this.zzXSu.zzm();
            this.zzWTy = 0;
            this.zzWTx = 0;
        }
    }

    private static String zzhu(int i) {
        return i <= 0 ? "" : i >= 8 ? "\t" : com.aspose.words.internal.zzZKN.zzS(ControlChar.SPACE_CHAR, i);
    }

    private static boolean zzyq(String str) {
        return !com.aspose.words.internal.zzZYD.zzXk(str) || "\u0000".equals(str) || "\u0000.".equals(str) || "\u0000)".equals(str);
    }

    @Override // com.aspose.words.zzZ1G
    public final void zzZ(Paragraph paragraph, zzYMX zzymx, int i) throws Exception {
        int listId = paragraph.getListFormat().getListId();
        int iZzYOa = zzZGI.zzZW(paragraph).getListLevel().zzYOa();
        int i2 = this.zzWTy;
        if (i2 == 0 || i2 != listId || this.zzWTx != iZzYOa) {
            zzXRL();
            this.zzWTy = listId;
            this.zzWTx = iZzYOa;
            this.zzXSu.zzY("List");
            zzY04.zzY(this.zzXSu, paragraph);
        }
        this.zzXSu.zzY("ListItem");
        zzY04.zzX(this.zzXSu, paragraph);
        this.zzXSu.zzY("Paragraph");
        zzY04.zzW(this.zzXSu, paragraph);
    }

    @Override // com.aspose.words.zzZ1G
    public final void zzZ0K() {
        zzXRL();
    }

    @Override // com.aspose.words.zzZ1G
    public final void zzZ0L() {
        if (this.zzWTy != 0) {
            this.zzXSu.zzm();
        }
    }

    @Override // com.aspose.words.zzZ1G
    public final boolean zzZV(Paragraph paragraph) {
        ListLevel listLevelZzRB = paragraph.zzRB(false);
        String strZzH = zzY02.zzH(listLevelZzRB);
        return !com.aspose.words.internal.zzZKN.equals(strZzH, "") && (listLevelZzRB.zzYOa() == 0 || !zzY02.zzys(strZzH)) && (zzyq(listLevelZzRB.getNumberFormat()) || zzY02.zzyr(strZzH));
    }

    @Override // com.aspose.words.zzZ1G
    public final void zzZ(Paragraph paragraph, zzYMX zzymx, int i, boolean z) throws Exception {
        this.zzXSu.zzY("Paragraph");
        zzY04.zzZ(this.zzXSu, paragraph);
        this.zzWTz.zzV(paragraph.getListLabel().getFont(), paragraph.getListLabel().zzYOu(), 3);
        zzXQ(paragraph);
    }
}
