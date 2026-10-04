package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzQ4 extends zzPT {
    private zzMS zzZqy;
    private zzMP zzZqz;

    public zzQ4(zzMS zzms, zzMP zzmp, boolean z, zzMP zzmp2) {
        super(zzmp, z);
        this.zzZqy = zzms;
        this.zzZqz = zzmp2;
    }

    public final void zzV(Row row) throws Exception {
        this.zzZqy.zzZ(zzZWj(), row);
    }

    public final void zzW(Shape shape) throws Exception {
        this.zzZqy.zzY(zzZWj(), shape);
    }

    public final void zzX(Shape shape) throws Exception {
        this.zzZqy.zzZ(zzZWj(), shape);
    }

    public final void zzY(Table table) throws Exception {
        this.zzZqy.zzZ(zzZWj(), table);
    }

    public final void zzZ(CellFormat cellFormat) throws Exception {
        this.zzZqy.zzZ(zzZWj(), cellFormat);
    }

    @Override // com.aspose.words.zzPT
    public final String zzZWo() {
        return this.zzZqy.getName();
    }

    public final zzMP zzZWp() {
        return this.zzZqz;
    }

    public final void zzV(Document document) {
        this.zzZqy.zzZ(zzZWj(), document);
    }
}
