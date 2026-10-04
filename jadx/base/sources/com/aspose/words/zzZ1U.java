package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ1U implements zzZBS {
    private zzZ1T zzY3s;
    private com.aspose.words.internal.zzZOO zzY3t;
    private MarkdownLoadOptions zzY4b;
    private Document zzZEY;

    public zzZ1U(com.aspose.words.internal.zzZOP zzzop, LoadOptions loadOptions, FileFormatInfo fileFormatInfo, Document document) throws Exception {
        this.zzY3t = new com.aspose.words.internal.zzZOO(zzzop, zzY4H.zzZ(loadOptions, fileFormatInfo));
        MarkdownLoadOptions markdownLoadOptions = (MarkdownLoadOptions) com.aspose.words.internal.zzZKW.zzZ(loadOptions, MarkdownLoadOptions.class);
        this.zzY4b = markdownLoadOptions;
        if (markdownLoadOptions == null) {
            this.zzY4b = new MarkdownLoadOptions(loadOptions);
        }
        this.zzY3s = new zzZ1T(document);
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
        zzZ26 zzz26 = new zzZ26(this.zzY4b);
        zzz26.zzZ(this.zzY3t, new zzZ3Z(this.zzZEY, this.zzY4b));
        zzz26.zzZ(this.zzY3s);
    }
}
