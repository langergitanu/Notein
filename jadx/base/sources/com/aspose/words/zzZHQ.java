package com.aspose.words;

import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzZHQ extends DocumentVisitor implements zzZ9F {
    private zzYE2 zzYQL;
    private zzZHR zzYqf;
    private HashMap<String, String> zzYqg;
    private HashMap<String, Integer> zzYqh;
    private HashMap<String, String> zzYqi;
    private com.aspose.words.internal.zzZYT<com.aspose.words.internal.zzZVA> zzYqj;

    public zzZHQ(zzZHR zzzhr) {
        this.zzYqf = zzzhr;
    }

    private String zzL(com.aspose.words.internal.zzZXH zzzxh) {
        String str = com.aspose.words.internal.zzZKN.format("{0}+{1}", zzzxh.getFullFontName(), zzzxh.getFileName());
        String str2 = (String) com.aspose.words.internal.zzQW.zzZ(this.zzYqi, str);
        if (str2 != null) {
            return str2;
        }
        String strZzU2 = com.aspose.words.internal.zzZKN.zzU2(com.aspose.words.internal.zzZOQ.zzVh(zzzxh.getFileName()));
        int iIntValue = this.zzYqh.containsKey(strZzU2) ? this.zzYqh.get(strZzU2).intValue() + 1 : 0;
        this.zzYqh.put(strZzU2, Integer.valueOf(iIntValue));
        if (iIntValue != 0) {
            strZzU2 = com.aspose.words.internal.zzZKN.format("{0}_{1}{2}", com.aspose.words.internal.zzZOQ.zzVg(strZzU2), Integer.valueOf(iIntValue), com.aspose.words.internal.zzZOQ.zzVe(strZzU2));
        }
        com.aspose.words.internal.zzZQF.zzY(this.zzYqi, str, strZzU2);
        return strZzU2;
    }

    private void zzP(Font font) throws Exception {
        zzY(font, "\u00ad", 3);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitDocumentStart(Document document) {
        this.zzYQL = new zzYE2(this, document.getCompatibilityOptions(), 1);
        this.zzYqj = new com.aspose.words.internal.zzZYT<>();
        this.zzYqi = new HashMap<>();
        this.zzYqh = new HashMap<>();
        this.zzYqg = new HashMap<>();
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitParagraphStart(Paragraph paragraph) throws Exception {
        if (paragraph.zzYoU()) {
            ListLabel listLabel = paragraph.getListLabel();
            if (com.aspose.words.internal.zzZ1.zzZ(listLabel.zzYOz())) {
                this.zzYQL.zzZ(listLabel.zzYOu(), listLabel.getFont());
            }
        }
        if (!paragraph.zzYoT()) {
            return 0;
        }
        ListLabel listLabel2 = paragraph.getListLabel();
        if (!com.aspose.words.internal.zzZ1.zzZ(listLabel2.zzYOy())) {
            return 0;
        }
        this.zzYQL.zzZ(listLabel2.zzYOt(), listLabel2.getFont());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitRun(Run run) throws Exception {
        if (run.getText().length() == 0) {
            return 0;
        }
        this.zzYQL.zzZ(run.getText(), run.getFont());
        return 0;
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzT(Font font) throws Exception {
        zzP(font);
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzU(Font font) throws Exception {
        zzP(font);
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzV(Font font) throws Exception {
        zzY(font, "‑", 3);
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzW(Font font) {
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzX(Font font) {
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzY(Font font) {
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzZ(Font font, boolean z) {
    }

    public final HashMap<String, String> zzZ22() {
        return this.zzYqg;
    }

    public final com.aspose.words.internal.zzZYT<com.aspose.words.internal.zzZVA> zzZ23() {
        return this.zzYqj;
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzZnZ() {
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzZo0() {
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzZo1() {
    }

    private com.aspose.words.internal.zzZVA zzX(String str, com.aspose.words.internal.zzZXH zzzxh) {
        if (!this.zzYqg.containsKey(str)) {
            com.aspose.words.internal.zzZQF.zzY(this.zzYqg, str, zzzxh.zzPh());
        }
        String strZzL = zzL(zzzxh);
        com.aspose.words.internal.zzZVA zzzva = (com.aspose.words.internal.zzZVA) com.aspose.words.internal.zzQW.zzZ((com.aspose.words.internal.zzZYT) this.zzYqj, strZzL);
        if (zzzva != null) {
            return zzzva;
        }
        com.aspose.words.internal.zzZVA zzzva2 = new com.aspose.words.internal.zzZVA(zzzxh);
        this.zzYqj.set(strZzL, zzzva2);
        return zzzva2;
    }

    public final void zzY(com.aspose.words.internal.zzZXH zzzxh, String str, boolean z) {
        zzX(zzzxh.zzPh(), zzzxh).zzO(str, z);
    }

    @Override // com.aspose.words.zzZ9F
    public final void zzZ(Font font, String str, int i) throws Exception {
        zzY(font, str, i);
    }

    private void zzY(Font font, String str, int i) throws Exception {
        if (font.getAllCaps() || font.getSmallCaps()) {
            str = com.aspose.words.internal.zzZKN.zzU1(str);
        }
        zzX(this.zzYqf.zzX(font, i)[0], this.zzYqf.zzW(font, i)).zzO(str, font.getBidi());
    }
}
