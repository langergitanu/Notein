package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYJH implements com.aspose.words.internal.zzFR {
    private Document zzYTQ;
    private IResourceSavingCallback zzYqz;

    public zzYJH(Document document, IResourceSavingCallback iResourceSavingCallback) {
        this.zzYTQ = document;
        this.zzYqz = iResourceSavingCallback;
    }

    @Override // com.aspose.words.internal.zzFR
    public final void zzZ(com.aspose.words.internal.zzZZD zzzzd) throws Exception {
        if (this.zzYqz == null) {
            return;
        }
        ResourceSavingArgs resourceSavingArgs = new ResourceSavingArgs(this.zzYTQ, zzzzd.getResourceFileName(), zzzzd.getResourceFileUri());
        this.zzYqz.resourceSaving(resourceSavingArgs);
        zzzzd.setResourceFileName(resourceSavingArgs.getResourceFileName());
        if (resourceSavingArgs.zzrp()) {
            zzzzd.setResourceFileUri(resourceSavingArgs.getResourceFileUri());
        }
        zzzzd.setResourceStream(resourceSavingArgs.getResourceStream());
        zzzzd.setKeepResourceStreamOpen(resourceSavingArgs.getKeepResourceStreamOpen());
    }
}
