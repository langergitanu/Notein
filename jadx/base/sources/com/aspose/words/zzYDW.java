package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYDW extends zzYKO<IDocumentSavingCallback, DocumentSavingArgs> {
    private int zzXor;
    private int zzXos;
    private int zzZCv;

    public zzYDW(DocumentBase documentBase, SaveOptions saveOptions, int i) {
        super(documentBase, saveOptions.getProgressCallback(), i);
        this.zzXor = 0;
        this.zzZCv = saveOptions.getSaveFormat();
        if (zzYmt() && zzYVb()) {
            this.zzXos = this.zzXDh.getChildNodes(8, true).getCount();
        }
    }

    private void zzV6(boolean z) throws Exception {
        int i;
        if (zzYVb() && zzYmt()) {
            zzYDX zzydx = new zzYDX();
            if (z) {
                i = this.zzXos;
            } else {
                i = this.zzXor + 1;
                this.zzXor = i;
            }
            this.zzXor = i;
            zzY9G zzy9gZzZ = zzZ(i, this.zzXos, zzydx);
            zzZ(zzy9gZzZ != null ? new DocumentSavingArgs(zzy9gZzZ, zzydx) : null);
        }
    }

    private void zzZ(DocumentSavingArgs documentSavingArgs) throws Exception {
        if (documentSavingArgs == null) {
            return;
        }
        ((IDocumentSavingCallback) this.zzXDg).notify(documentSavingArgs);
    }

    public final void complete() throws Exception {
        zzV6(true);
    }

    @Override // com.aspose.words.zzYKO
    public final boolean zzYVb() {
        return super.zzYVb() && zzYKN.zzpG(this.zzZCv);
    }

    public final void zzYd0() throws Exception {
        zzV6(false);
    }
}
