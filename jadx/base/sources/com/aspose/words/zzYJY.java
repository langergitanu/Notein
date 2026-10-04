package com.aspose.words;

import com.huawei.hms.network.embedded.C18115b5;

/* JADX INFO: loaded from: classes6.dex */
class zzYJY implements zzZ8Z {
    private com.aspose.words.internal.zzBY<zzZPE> zzXCy;
    private zzZ8Z zzXCz;
    private zzYWB zzXG5;
    private String zzZCG;
    private Document zzZEY;

    public zzYJY(zzZ8Z zzz8z, Document document, com.aspose.words.internal.zzBY<zzZPE> zzby) throws Exception {
        this.zzZEY = document;
        this.zzXCz = zzz8z;
        this.zzXCy = zzby;
        String str = C18115b5.CONNECTOR + com.aspose.words.internal.zzZZS.zzY(new Object[0]).toString("N");
        this.zzZCG = str;
        this.zzXG5 = this.zzXCz.insertBookmark(str);
    }

    public final Document getDocument() {
        return this.zzZEY;
    }

    @Override // com.aspose.words.zzZ8Z
    public String getDocumentOutlineTitle() {
        return null;
    }

    @Override // com.aspose.words.zzZ8Z
    public zzYWB getLabelRange() throws Exception {
        return this.zzXCz.getLabelRange();
    }

    @Override // com.aspose.words.zzZ8Z
    public int getLevel() {
        return this.zzXCz.getLevel();
    }

    @Override // com.aspose.words.zzZ8Z
    public boolean getOmitPageNumber() throws Exception {
        return this.zzXCz.getOmitPageNumber();
    }

    @Override // com.aspose.words.zzZ8Z
    public int getPageNumber() throws Exception {
        zzYAT zzyatZzCY = this.zzZEY.zzWA(true).zzCY(this.zzZCG);
        if (zzyatZzCY != null) {
            return zzYAH.zzZt(zzyatZzCY);
        }
        return 0;
    }

    @Override // com.aspose.words.zzZ8Z
    public Paragraph getParagraph() {
        return null;
    }

    @Override // com.aspose.words.zzZ8Z
    public int getSequenceValue(String str) throws Exception {
        zzZPE value = this.zzXCy.getValue();
        value.zzLM(this.zzZCG);
        return value.zzZ9(this.zzZCG, str).zzxK();
    }

    @Override // com.aspose.words.zzZ8Z
    public boolean hasBookmark() {
        return false;
    }

    @Override // com.aspose.words.zzZ8Z
    public zzYWB insertBookmark(String str) {
        return this.zzXG5;
    }

    @Override // com.aspose.words.zzZ8Z
    public boolean isInFieldCode() {
        return false;
    }

    public final zzZ8Z zzYma() {
        return this.zzXCz;
    }
}
