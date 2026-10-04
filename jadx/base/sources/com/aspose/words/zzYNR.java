package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYNR implements zzZBS {
    private com.aspose.words.internal.zzZOP zzN5;
    private FileFormatInfo zzYWN;
    private LoadOptions zzYWO;
    private Document zzZEY;

    public zzYNR(com.aspose.words.internal.zzZOP zzzop, LoadOptions loadOptions, FileFormatInfo fileFormatInfo, Document document) {
        this.zzYWO = loadOptions;
        this.zzN5 = zzzop;
        this.zzYWN = fileFormatInfo;
        this.zzZEY = document;
    }

    @Override // com.aspose.words.zzZBS
    public final boolean isEncrypted() {
        FileFormatInfo fileFormatInfo = this.zzYWN;
        return fileFormatInfo != null && fileFormatInfo.isEncrypted();
    }

    @Override // com.aspose.words.zzZBS
    public final com.aspose.words.internal.zzZOP zz1x() throws Exception {
        return DigitalSignatureUtil.zzZ(this.zzYWN.zzZ9V(), this.zzYWO.getPassword());
    }

    @Override // com.aspose.words.zzZBS
    public final void zzIh() throws Exception {
        FileFormatInfo fileFormatInfo = this.zzYWN;
        if (fileFormatInfo != null) {
            fileFormatInfo.isEncrypted();
        }
        this.zzZEY.zzZ(new zzYO3());
        new zzZWX(this.zzN5, this.zzZEY, this.zzYWO).zzIh();
    }
}
