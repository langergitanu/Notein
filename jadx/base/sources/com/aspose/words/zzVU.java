package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzVU implements zzZBS {
    private com.aspose.words.internal.zzZOP zzN5;
    private Document zzZEY;
    private ChmLoadOptions zzZx2;

    public zzVU(com.aspose.words.internal.zzZOP zzzop, LoadOptions loadOptions, Document document) {
        this.zzN5 = zzzop;
        this.zzZx2 = loadOptions instanceof ChmLoadOptions ? (ChmLoadOptions) loadOptions : new ChmLoadOptions(loadOptions);
        this.zzZEY = document;
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
        new zzVL(this.zzN5, this.zzZEY, this.zzZx2).zzIh();
    }
}
