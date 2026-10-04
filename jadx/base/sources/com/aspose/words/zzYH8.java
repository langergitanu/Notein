package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYH8 extends zzYHS {
    private Footnote zzYqa;
    private boolean zzZEG;

    public zzYH8(zzYFT zzyft, boolean z) {
        super(zzyft);
        this.zzZEG = z;
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzT(zzYET zzyet) throws Exception {
        if ("\\ftnalt".equals(zzyet.getName())) {
            this.zzYqa.zzZ6V();
        } else {
            super.zzT(zzyet);
        }
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzYjb() throws Exception {
        if (zzYiN().getType() != 80) {
            super.zzYjb();
        } else {
            zzYiM().zzH(this.zzYqa);
        }
    }

    @Override // com.aspose.words.zzYHS, com.aspose.words.zzYHQ
    public final void zzZ(zzYET zzyet) throws Exception {
        if (zzYiN().getType() != 80) {
            super.zzZ(zzyet);
            return;
        }
        this.zzYqa = new Footnote(getDocument(), 0, this.zzZEG, null, zzYiL().zzYir());
        zzYiM().zzI(this.zzYqa);
        zzYiR();
        if (this.zzZEG) {
            return;
        }
        Run runZzRD = this.zzYqa.getParentParagraph().zzRD(false);
        if (runZzRD == null) {
            this.zzYqa.setReferenceMark(ControlChar.PARAGRAPH_BREAK);
            return;
        }
        this.zzYqa.setReferenceMark(runZzRD.getText());
        this.zzYqa.zzL(runZzRD.zzZYh());
        runZzRD.remove();
    }
}
