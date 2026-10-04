package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZI6 extends zzZI4 {
    private zzYJG zzYqL;
    private String zzYqM;

    public zzZI6(String str, HtmlSaveOptions htmlSaveOptions) throws Exception {
        String strZzVh = com.aspose.words.internal.zzZOQ.zzVh(htmlSaveOptions.getCssStyleSheetFileName());
        this.zzYqM = strZzVh;
        if (com.aspose.words.internal.zzZYD.zzXk(strZzVh)) {
            if (!com.aspose.words.internal.zzZOQ.hasExtension(this.zzYqM)) {
                this.zzYqM = com.aspose.words.internal.zzZKN.zzZI(this.zzYqM, ".css");
            }
        } else if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            String strZzVh2 = com.aspose.words.internal.zzZOQ.zzVh(str);
            this.zzYqM = strZzVh2;
            this.zzYqM = com.aspose.words.internal.zzZOQ.zzZX(strZzVh2, ".css");
        } else {
            this.zzYqM = null;
        }
        this.zzYqL = new zzYJG(str, null, zzY(htmlSaveOptions), htmlSaveOptions.getResourceFolderAlias(), "External CSS file cannot be written to disk. When saving to a stream or to a string either ResourceFolder should be specified, or custom streams should be provided via CssSavingCallback, or an absolute path should be specified via CssStyleSheetFileName. Please see documentation for details.", false, true);
    }

    private static String zzY(HtmlSaveOptions htmlSaveOptions) throws Exception {
        if (!com.aspose.words.internal.zzZKN.equals(htmlSaveOptions.getCssStyleSheetFileName(), "")) {
            String strZzVd = com.aspose.words.internal.zzZOQ.zzVd(htmlSaveOptions.getCssStyleSheetFileName());
            if (!com.aspose.words.internal.zzZKN.equals(strZzVd, "")) {
                return strZzVd;
            }
        }
        return htmlSaveOptions.getResourceFolder();
    }

    @Override // com.aspose.words.zzZI4
    public final String getUri() throws Exception {
        String str = this.zzYqM;
        if (str != null) {
            return this.zzYqL.zzCL(str);
        }
        return null;
    }

    @Override // com.aspose.words.zzZI4
    public final void zzKL(String str) throws Exception {
        getUri();
        this.zzYqL.zzYlM();
        com.aspose.words.internal.zzZON zzzon = new com.aspose.words.internal.zzZON(this.zzYqL.zzCM(this.zzYqM));
        try {
            zzzon.write(str);
        } finally {
            zzzon.close();
        }
    }
}
