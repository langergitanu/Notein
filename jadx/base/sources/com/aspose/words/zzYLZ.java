package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYLZ implements zzZBS {
    private com.aspose.words.internal.zzZOP zzN5;
    private LoadOptions zzYWO;
    private Document zzZEY;

    public zzYLZ(com.aspose.words.internal.zzZOP zzzop, LoadOptions loadOptions, Document document) {
        this.zzN5 = zzzop;
        this.zzZEY = document;
        this.zzYWO = loadOptions;
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
        throw new UnsupportedFileFormatException("Pdf format is not supported on this platform. Use .NET Standard, .NET 4.6.1 or NET 6.0 version of Aspose.Words for loading Pdf documents.");
    }
}
