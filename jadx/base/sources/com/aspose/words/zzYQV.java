package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYQV {
    private zzYTG zzXQU;
    private zzYOR zzXRT;

    public zzYQV(zzYOR zzyor) throws Exception {
        this.zzXRT = zzyor;
        this.zzXQU = zzyor.zzDg("/meta.xml");
    }

    private void zzW(BuiltInDocumentProperties builtInDocumentProperties) throws Exception {
        String strZzVg;
        if (!com.aspose.words.internal.zzZYD.zzXk(builtInDocumentProperties.getTemplate()) || (strZzVg = com.aspose.words.internal.zzZOQ.zzVg(builtInDocumentProperties.getTemplate())) == null || com.aspose.words.internal.zzZKN.zzX(strZzVg, "normal", com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8)) {
            return;
        }
        this.zzXQU.zzX("meta:template", "xlink:href", builtInDocumentProperties.getTemplate(), "xlink:type", "simple");
    }

    private void zzX(BuiltInDocumentProperties builtInDocumentProperties) {
        this.zzXQU.zzZ("meta:editing-cycles", builtInDocumentProperties.getRevisionNumber());
        String strZzrV = zzrV(builtInDocumentProperties.getTotalEditingTime());
        if (com.aspose.words.internal.zzZYD.zzXk(strZzrV)) {
            this.zzXQU.zzZ("meta:editing-duration", strZzrV);
        }
    }

    private void zzY(BuiltInDocumentProperties builtInDocumentProperties) {
        if (com.aspose.words.internal.zzZYD.zzXk(builtInDocumentProperties.getKeywords())) {
            for (String str : com.aspose.words.internal.zzZKN.zzR(builtInDocumentProperties.getKeywords(), ',')) {
                this.zzXQU.zzZ("meta:keyword", str);
            }
        }
    }

    private void zzYj(String str, String str2) {
        DocumentProperty documentProperty = this.zzXRT.getDocument().getBuiltInDocumentProperties().get(str);
        if (documentProperty.zzZol() instanceof com.aspose.words.internal.zzZQ9) {
            com.aspose.words.internal.zzZQ9 zzzq9ZzZoj = documentProperty.zzZoj();
            if (com.aspose.words.internal.zzZQ9.zzZ(zzzq9ZzZoj, com.aspose.words.internal.zzZQ9.zz35)) {
                return;
            }
            this.zzXQU.zzZ(str2, com.aspose.words.internal.zzJB.zzQ(zzzq9ZzZoj));
        }
    }

    private void zzYvt() {
        String strZz5;
        for (DocumentProperty documentProperty : this.zzXRT.getDocument().getCustomDocumentProperties()) {
            Object objZzZol = documentProperty.zzZol();
            int type = documentProperty.getType();
            if (type == 0) {
                strZz5 = com.aspose.words.internal.zzJB.zz5(((Boolean) objZzZol).booleanValue());
            } else if (type == 1) {
                strZz5 = com.aspose.words.internal.zzJB.zzQ((com.aspose.words.internal.zzZQ9) objZzZol);
            } else if (type == 2) {
                strZz5 = com.aspose.words.internal.zzJB.zzZZ(((Double) objZzZol).doubleValue());
            } else if (type == 3) {
                strZz5 = com.aspose.words.internal.zzJB.zzWD(((Integer) objZzZol).intValue());
            } else if (type == 4) {
                strZz5 = (String) objZzZol;
            }
            this.zzXQU.zzY("meta:user-defined");
            this.zzXQU.zz0("meta:name", documentProperty.getName());
            this.zzXQU.zz0("meta:value-type", zzYS3.zzst(documentProperty.getType()));
            this.zzXQU.writeString(strZz5);
            this.zzXQU.zzo();
        }
    }

    private void zzYvu() throws Exception {
        BuiltInDocumentProperties builtInDocumentProperties = this.zzXRT.getDocument().getBuiltInDocumentProperties();
        this.zzXQU.zzZ("meta:generator", this.zzXRT.zzYsI().getExportGeneratorName() ? "Aspose.Words for Android via Java 24.3.0" : "Aspose.Words");
        this.zzXQU.zzZ("dc:title", builtInDocumentProperties.getTitle());
        if (com.aspose.words.internal.zzZYD.zzXk(builtInDocumentProperties.getComments())) {
            this.zzXQU.zzZ("dc:description", builtInDocumentProperties.getComments());
        }
        if (com.aspose.words.internal.zzZYD.zzXk(builtInDocumentProperties.getSubject())) {
            this.zzXQU.zzZ("dc:subject", builtInDocumentProperties.getSubject());
        }
        zzY(builtInDocumentProperties);
        this.zzXQU.zzZ("meta:initial-creator", builtInDocumentProperties.getAuthor());
        zzYj("CreateTime", "meta:creation-date");
        this.zzXQU.zzZ("dc:creator", builtInDocumentProperties.getLastSavedBy());
        zzYj("LastSavedTime", "dc:date");
        zzYj("LastPrinted", "meta:print-date");
        zzW(builtInDocumentProperties);
        zzX(builtInDocumentProperties);
        zzZ(builtInDocumentProperties);
    }

    private void zzZ(BuiltInDocumentProperties builtInDocumentProperties) {
        this.zzXQU.zzX("meta:document-statistic", "meta:page-count", Integer.valueOf(builtInDocumentProperties.getPages()), "meta:paragraph-count", Integer.valueOf(builtInDocumentProperties.getParagraphs()), "meta:row-count", Integer.valueOf(builtInDocumentProperties.getLines()), "meta:word-count", Integer.valueOf(builtInDocumentProperties.getWords()), "meta:character-count", Integer.valueOf(builtInDocumentProperties.getCharactersWithSpaces()), "meta:non-whitespace-character-count", Integer.valueOf(builtInDocumentProperties.getCharacters()));
    }

    private static String zzrV(int i) {
        if (i <= 0) {
            return null;
        }
        long j = i;
        return com.aspose.words.internal.zzZKN.format("PT{0}{1}", zzZ(j / 60, 'H'), zzZ(j % 60, 'M'));
    }

    public final void zzIg() throws Exception {
        this.zzXQU.zzX(this.zzXRT);
        this.zzXQU.zzY("office:meta");
        zzYvu();
        zzYvt();
        this.zzXQU.zzo();
        this.zzXQU.endDocument();
    }

    private static String zzZ(long j, char c) {
        if (j == 0) {
            return "";
        }
        return com.aspose.words.internal.zzZKN.format("{0}{1}", Long.valueOf(j), Character.valueOf(c));
    }
}
