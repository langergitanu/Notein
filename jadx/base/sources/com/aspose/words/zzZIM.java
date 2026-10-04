package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZIM implements zzZBS {
    private com.aspose.words.internal.zzZOP zzN5;
    private FileFormatInfo zzYWN;
    private HtmlLoadOptions zzYrf;
    private Document zzZEY;

    public zzZIM(com.aspose.words.internal.zzZOP zzzop, LoadOptions loadOptions, FileFormatInfo fileFormatInfo, Document document) {
        this.zzYrf = loadOptions instanceof HtmlLoadOptions ? (HtmlLoadOptions) loadOptions : new HtmlLoadOptions(loadOptions);
        this.zzN5 = zzzop;
        this.zzYWN = fileFormatInfo;
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
        com.aspose.words.internal.zzZO0 zzzo0ZzZ9Y;
        if (this.zzYrf.zzZ9Y() != null) {
            zzzo0ZzZ9Y = this.zzYrf.zzZ9Y();
        } else {
            FileFormatInfo fileFormatInfo = this.zzYWN;
            zzzo0ZzZ9Y = fileFormatInfo != null ? fileFormatInfo.zzZ9Y() : null;
        }
        zzZFF zzzff = new zzZFF(this.zzYrf.getResourceLoadingCallback(), this.zzZEY.getWarningCallback());
        zzzff.setWebRequestTimeout(this.zzYrf.getWebRequestTimeout());
        if (this.zzYrf.zzZ0A()) {
            new zzYWY(zzzff).zzZ(this.zzN5, zzzo0ZzZ9Y, this.zzZEY, this.zzYrf.zzZ9Y());
        } else {
            new zzZFI(this.zzYrf.zz1r(), 50, zzzff).zzZ(this.zzN5, zzzo0ZzZ9Y, this.zzZEY);
        }
    }
}
