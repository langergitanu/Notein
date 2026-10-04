package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYYY implements zzZBS {
    private com.aspose.words.internal.zzZOP zzN5;
    private LoadOptions zzYWO;
    private Document zzZEY;

    public zzYYY(com.aspose.words.internal.zzZOP zzzop, LoadOptions loadOptions, Document document) {
        this.zzYWO = loadOptions;
        this.zzN5 = zzzop;
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
        LoadOptions loadOptions = this.zzYWO;
        new zzYYU(loadOptions instanceof HtmlLoadOptions ? (HtmlLoadOptions) loadOptions : new HtmlLoadOptions(loadOptions)).zzZ(this.zzN5, this.zzZEY);
    }
}
