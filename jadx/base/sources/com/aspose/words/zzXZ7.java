package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzXZ7 implements zzZBR {
    private com.aspose.words.internal.zz78 zzYOV = new com.aspose.words.internal.zz79();
    private zzYDZ zzZFZ;
    private com.aspose.words.internal.zzZWT zzmY;

    private IWarningCallback getWarningCallback() {
        return this.zzZFZ.zzYfy.getWarningCallback();
    }

    private static int zzEB(int i) {
        if (i == 0) {
            return 5;
        }
        if (i == 1) {
            return 9;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 1;
        }
        throw new IllegalArgumentException();
    }

    private XlsxSaveOptions zzXRd() {
        return (XlsxSaveOptions) this.zzZFZ.zzXpa;
    }

    private void zzZk7() throws Exception {
        zzXZN zzxznZzn = zzn("/docProps/core.xml", "application/vnd.openxmlformats-package.core-properties+xml", "http://schemas.openxmlformats.org/package/2006/relationships/metadata/core-properties");
        BuiltInDocumentProperties builtInDocumentProperties = this.zzZFZ.zzYfy.getBuiltInDocumentProperties();
        com.aspose.words.internal.zz7B.zzZ(zzxznZzn, builtInDocumentProperties.getTitle(), builtInDocumentProperties.getSubject(), builtInDocumentProperties.getAuthor(), builtInDocumentProperties.getKeywords(), builtInDocumentProperties.getComments(), builtInDocumentProperties.getLastSavedBy(), Integer.toString(builtInDocumentProperties.getRevisionNumber()), builtInDocumentProperties.zz7g(), builtInDocumentProperties.zz7h(), builtInDocumentProperties.zz7f(), builtInDocumentProperties.getCategory(), builtInDocumentProperties.getContentStatus(), builtInDocumentProperties.get("Language").getValue().toString(), builtInDocumentProperties.get("DocumentVersion").getValue().toString());
    }

    private void zzZm7() throws Exception {
        new zzXZL(this, this.zzmY, getWarningCallback()).zzIg();
    }

    public final Document getDocument() {
        return this.zzZFZ.zzYfy;
    }

    @Override // com.aspose.words.zzZBR
    public final SaveOutputParameters zzZ(zzYDZ zzydz) throws Exception {
        this.zzZFZ = zzydz;
        this.zzYOV = new com.aspose.words.internal.zz79(new zzYO0(), zzEB(zzXRd().getCompressionLevel()), 0);
        this.zzmY = new com.aspose.words.internal.zzZWT(zzXRd().getTempFolder());
        zzZm7();
        zzXZJ.zzZ(this);
        zzZk7();
        com.aspose.words.internal.zz73.zzZ(this.zzYOV, zzXRd().getPrettyFormat());
        com.aspose.words.internal.zz7C.zzZ((com.aspose.words.internal.zz79) this.zzYOV, zzXRd().getPrettyFormat());
        this.zzYOV.zzL(zzydz.zzXpb);
        this.zzmY.cleanup();
        return new SaveOutputParameters("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
    }

    public final com.aspose.words.internal.zz78 zzZmf() {
        return this.zzYOV;
    }

    public final zzYDZ zzZqS() {
        return this.zzZFZ;
    }

    public final zzXZN zzn(String str, String str2, String str3) throws Exception {
        return new zzXZN(this.zzYOV.zzZ(null, str, str2, str3), zzXRd().getPrettyFormat(), getWarningCallback());
    }
}
