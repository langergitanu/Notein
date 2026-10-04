package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZXU extends zzZXT {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("background", "body");
    private zzZWH zzYOY;
    private Document zzYUB;

    public zzZXU(com.aspose.words.internal.zz78 zz78Var, com.aspose.words.internal.zz77 zz77Var, Document document, LoadOptions loadOptions, zzYO3 zzyo3, zzZWG zzzwg, zzZWH zzzwh, zzZX3 zzzx3, zzZWM zzzwm) throws Exception {
        super(zz78Var, zz77Var, document, loadOptions, zzyo3, zzzwg, zzzwh, zzzx3, zzzwm);
        this.zzYUB = document;
        this.zzYOY = zzzwh;
    }

    private void zzZmq() {
        for (Section section : this.zzYUB.getSections()) {
            if (section.getPageSetup().getPageWidth() > 3052.8d) {
                section.getPageSetup().setPageWidth(3052.8d);
                zzZ(65536, 9, "PageWidth has been truncated.");
            }
            if (section.getPageSetup().getPageHeight() > 3052.8d) {
                section.getPageSetup().setPageHeight(3052.8d);
                zzZ(65536, 9, "PageHeight has been truncated.");
            }
        }
    }

    private void zzZmr() throws Exception {
        com.aspose.words.internal.zz77 zz77VarZzZ = zzZ(zzZme(), zzZmp().zzZkG());
        if (zz77VarZzZ == null) {
            return;
        }
        this.zzYUB.setGlossaryDocument(new GlossaryDocument());
        zzZXE zzzxeZzZ = zzZWW.zzZ(zzZmf(), zz77VarZzZ, this.zzYUB.getGlossaryDocument(), zzYyZ(), this.zzYUB.zzZqn());
        zzzxeZzZ.zzIh();
        zzzxeZzZ.zzYz4();
    }

    private void zzZms() throws Exception {
        zzK(this.zzYUB);
        this.zzYOY.zzF(this);
    }

    private void zzZmt() throws Exception {
        zzSz("preserve".equals(zzZsD().zzV("space", "")));
        while (zzZsD().zzQ("document")) {
            int iZzTP = zzUR.zzTP(zzZsD().getLocalName());
            if (iZzTP == 0) {
                zzZYH.zzE(this);
            } else if (iZzTP != 1) {
                zzZms();
            } else {
                zzL(this.zzYUB);
            }
        }
        endSection();
    }

    @Override // com.aspose.words.zzYVB, com.aspose.words.zzZ8W
    @ReservedForInternalUse
    @Deprecated
    public final Document getDocument() {
        return this.zzYUB;
    }

    @Override // com.aspose.words.zzZXT
    public void zzZmu() throws Exception {
        zzZY0.zzZ(this, zzYyZ().getWarningCallback());
        zzZW9.zzZ(this);
        zzZmt();
        zzYz4();
        zzZW8.zzZ(this);
        zzZXX.zzZ(this);
        zzZmr();
        zzZmq();
    }

    @Override // com.aspose.words.zzYVB
    public boolean zzZmv() {
        return false;
    }

    @Override // com.aspose.words.zzYVB, com.aspose.words.zzZ8W
    @ReservedForInternalUse
    @Deprecated
    public final /* bridge */ /* synthetic */ DocumentBase getDocument() {
        return this.zzYUB;
    }
}
