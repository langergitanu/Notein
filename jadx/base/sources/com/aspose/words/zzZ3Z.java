package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ3Z extends zzYKO<IDocumentLoadingCallback, DocumentLoadingArgs> {
    public zzZ3Z(DocumentBase documentBase, LoadOptions loadOptions) {
        super(documentBase, loadOptions.getProgressCallback(), 1024);
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

    public final void zzW(com.aspose.words.internal.zzZOP zzzop, boolean z) throws Exception {
        if (zzYVb() && zzYmt() && zzzop != null) {
            zzZ40 zzz40 = new zzZ40();
            zzY9G zzy9gZzZ = zzZ(zzzop, zzz40, z);
            zzZ(zzy9gZzZ != null ? new DocumentLoadingArgs(zzy9gZzZ, zzz40) : null);
        }
    }

    @Override // com.aspose.words.zzYKO
    public final boolean zzYVb() {
        return super.zzYVb() && zzYKN.zzpH(this.zzXDh.getOriginalLoadFormat());
    }

    public final void zzYX(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        zzW(zzzop, false);
    }
}
