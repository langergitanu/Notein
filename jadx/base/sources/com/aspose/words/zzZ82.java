package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZ82 extends zzYKO<IDocumentLoadingCallback, DocumentLoadingArgs> {
    protected int zzYip;
    private int zzYiq;

    public zzZ82(DocumentBase documentBase, IDocumentLoadingCallback iDocumentLoadingCallback, int i, int i2) {
        super(documentBase, iDocumentLoadingCallback, i);
        this.zzYiq = 0;
        this.zzYip = i2;
    }

    private void zzZ(DocumentLoadingArgs documentLoadingArgs) throws Exception {
        if (documentLoadingArgs == null) {
            return;
        }
        try {
            ((IDocumentLoadingCallback) this.zzXDg).notify(documentLoadingArgs);
        } catch (Exception e) {
            throw new zzX3(e);
        }
    }

    public final void zzV6(boolean z) throws Exception {
        int i;
        if (zzYVb() && zzYmt()) {
            zzZ40 zzz40 = new zzZ40();
            if (z) {
                i = this.zzYip;
            } else {
                i = this.zzYiq + 1;
                this.zzYiq = i;
            }
            this.zzYiq = i;
            zzY9G zzy9gZzZ = zzZ(i, this.zzYip, zzz40);
            zzZ(zzy9gZzZ != null ? new DocumentLoadingArgs(zzy9gZzZ, zzz40) : null);
        }
    }

    @Override // com.aspose.words.zzYKO
    public final boolean zzYVb() {
        return super.zzYVb() && zzYKN.zzpH(this.zzXDh.getOriginalLoadFormat());
    }
}
