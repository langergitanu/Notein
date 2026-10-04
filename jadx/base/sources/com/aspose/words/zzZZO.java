package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZZO implements zzZBS {
    private com.aspose.words.internal.zzZOP zzN5;
    private FileFormatInfo zzYWN;
    private LoadOptions zzYWO;
    private Document zzZEY;

    public zzZZO(com.aspose.words.internal.zzZOP zzzop, LoadOptions loadOptions, FileFormatInfo fileFormatInfo, Document document) {
        this.zzYWO = loadOptions;
        this.zzYWN = fileFormatInfo;
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
        com.aspose.words.internal.zzKD zzkd;
        boolean zIsEncrypted;
        if (this.zzYWO.zzYNG() == 2 && zzYBD.zzX(this.zzN5, this.zzZEY)) {
            return;
        }
        FileFormatInfo fileFormatInfo = this.zzYWN;
        if (fileFormatInfo != null) {
            zzkd = fileFormatInfo.zzZ9V();
            zIsEncrypted = this.zzYWN.isEncrypted();
        } else {
            zzkd = new com.aspose.words.internal.zzKD(this.zzN5);
            zIsEncrypted = false;
        }
        new zzZZC(zzkd, this.zzZEY, this.zzYWO, zIsEncrypted).zzIh();
    }
}
