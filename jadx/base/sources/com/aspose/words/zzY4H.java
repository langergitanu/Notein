package com.aspose.words;

import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzY4H implements zzZBS {
    private com.aspose.words.internal.zzZO0 zzMW;
    private com.aspose.words.internal.zzZOP zzN5;
    private HashMap<zzY4J, List> zzX1w;
    private zzY4J zzX1x;
    private TxtLoadOptions zzX1y;
    private double zzXt;
    private DocumentBuilder zzYRM;
    private boolean zzYzF;
    private Document zzZEY;

    public zzY4H(com.aspose.words.internal.zzZOP zzzop, LoadOptions loadOptions, FileFormatInfo fileFormatInfo, Document document) throws Exception {
        this.zzN5 = zzzop;
        this.zzZEY = document;
        TxtLoadOptions txtLoadOptions = (TxtLoadOptions) com.aspose.words.internal.zzZKW.zzZ(loadOptions, TxtLoadOptions.class);
        this.zzX1y = txtLoadOptions;
        if (txtLoadOptions == null) {
            this.zzX1y = new TxtLoadOptions(loadOptions);
        }
        fileFormatInfo = fileFormatInfo == null ? new zzZOD().zzY(this.zzN5, null) : fileFormatInfo;
        this.zzMW = zzZ(this.zzX1y, fileFormatInfo);
        this.zzYzF = fileFormatInfo.zzZ9U();
        this.zzXt = -1.0d;
    }

    private double zzA7(String str) throws Exception {
        DocumentBuilder documentBuilder = this.zzYRM;
        if (documentBuilder == null) {
            documentBuilder = new DocumentBuilder();
            zzP(documentBuilder);
        }
        Font font = documentBuilder.getFont();
        return documentBuilder.getDocument().zzZqy().zzY(font.getName(), (float) font.getSize(), font.zzza()).zz7(str);
    }

    private static void zzJ(Font font) {
        font.setName("Courier New");
        font.setSize(10.5d);
        font.setSizeBi(10.5d);
    }

    private static void zzP(DocumentBuilder documentBuilder) {
        if (documentBuilder != null) {
            zzJ(documentBuilder.getFont());
        }
    }

    private void zzU(zzY4J zzy4j) {
        List listZzxt = zzy4j.zzXUL().zzXUG() != null ? (List) com.aspose.words.internal.zzQW.zzZ(this.zzX1w, zzy4j.zzXUL().zzXUG()) : zzy4j.zzXUL().zzXUF() != null ? (List) com.aspose.words.internal.zzQW.zzZ(this.zzX1w, zzy4j.zzXUL().zzXUF()) : this.zzYRM.getDocument().getLists().zzxt(zzy4j.zzXUL().zzXUE().zzXUz() ? 1 : 0);
        com.aspose.words.internal.zzZQF.zzY(this.zzX1w, zzy4j, listZzxt);
        this.zzYRM.getListFormat().setList(listZzxt);
    }

    private void zzV(zzY4J zzy4j) throws Exception {
        zzU(zzy4j);
        zzV(zzy4j.zzXUL());
        double dZzjs = zzjs(zzy4j.zzXUL().zzXUH());
        double dZzA7 = zzA7(androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), zzy4j.zzXUL().getText(), "  "));
        this.zzYRM.getParagraphFormat().setLeftIndent(dZzjs + dZzA7);
        this.zzYRM.getParagraphFormat().setFirstLineIndent(-dZzA7);
        zzy4j.zzZ(this.zzYRM, this.zzX1y);
        if (zzy4j.zzXUN()) {
            this.zzYRM.zzFU(2);
        }
    }

    private void zzW(zzY4J zzy4j) throws Exception {
        this.zzYRM.getParagraphFormat().setLeftIndent(zzjs(zzy4j.zzYM7()));
        this.zzYRM.getParagraphFormat().setFirstLineIndent(zzjs(zzy4j.zzYMa()));
        zzy4j.zzZ(this.zzYRM, this.zzX1y);
        if (zzy4j.zzXUN()) {
            this.zzYRM.zzFU(2);
        }
    }

    private void zzX(zzY4J zzy4j) throws Exception {
        if (zzy4j.zzXUL() != null) {
            zzV(zzy4j);
        } else {
            zzXUy();
            zzW(zzy4j);
        }
        this.zzX1x = zzy4j;
    }

    private void zzXUy() {
        zzY4J zzy4j = this.zzX1x;
        if (zzy4j == null || zzy4j.zzXUL() == null) {
            return;
        }
        this.zzYRM.getListFormat().removeNumbers();
    }

    public static com.aspose.words.internal.zzZO0 zzZ(LoadOptions loadOptions, FileFormatInfo fileFormatInfo) {
        return (loadOptions == null || loadOptions.zzZ9Y() == null) ? (fileFormatInfo == null || fileFormatInfo.zzZ9Y() == null) ? com.aspose.words.internal.zzZO0.zzhV() : fileFormatInfo.zzZ9Y() : loadOptions.zzZ9Y();
    }

    private double zzjs(int i) throws Exception {
        if (this.zzXt < 0.0d) {
            this.zzXt = zzA7("w");
        }
        return this.zzXt * ((double) i);
    }

    @Override // com.aspose.words.zzZBS
    public final boolean isEncrypted() {
        return false;
    }

    @Override // com.aspose.words.zzZBS
    public final com.aspose.words.internal.zzZOP zz1x() {
        return null;
    }

    @Override // com.aspose.words.zzZBS
    public final void zzIh() throws Exception {
        boolean z = this.zzZEY.getFirstSection() == null;
        this.zzYRM = new DocumentBuilder(this.zzZEY);
        if (this.zzX1y.getDocumentDirection() == 1 || (this.zzX1y.getDocumentDirection() == 2 && this.zzYzF)) {
            this.zzYRM.getParagraphFormat().setBidi(true);
        }
        zzP(this.zzYRM);
        zzY4I zzy4i = new zzY4I(new com.aspose.words.internal.zzZOO(this.zzN5, this.zzMW), this.zzX1y);
        this.zzX1w = new HashMap<>();
        this.zzXt = -1.0d;
        for (zzY4J zzy4j : zzy4i.zzZ(new zzZ3Z(this.zzZEY, this.zzX1y))) {
            zzX(zzy4j);
        }
        zzXUy();
        if (z && !this.zzZEY.getFirstSection().getBody().getLastParagraph().hasChildNodes()) {
            this.zzZEY.getFirstSection().getBody().getLastParagraph().remove();
        }
        this.zzYRM.getDocument().accept(new zzY4R());
        this.zzZEY.getFirstSection().zzYvR().zzYcd();
    }

    private void zzV(zzY4N zzy4n) {
        this.zzYRM.getListFormat().setListLevelNumber(zzy4n.getListLevelNumber());
        this.zzYRM.getListFormat().getListLevel().setNumberStyle(zzy4n.zzXUE().getNumberStyle());
        zzJ(this.zzYRM.getListFormat().getListLevel().getFont());
        this.zzYRM.getListFormat().getListLevel().setNumberFormat(zzy4n.zzXUE().zzPm(zzy4n.getListLevelNumber()));
    }
}
