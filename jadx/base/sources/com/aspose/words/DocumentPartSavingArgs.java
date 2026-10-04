package com.aspose.words;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes6.dex */
public class DocumentPartSavingArgs {
    private boolean zzYR8;
    private String zzYR9;
    private com.aspose.words.internal.zzZOP zzYRa;
    private Document zzZEY;

    public DocumentPartSavingArgs(Document document, String str) {
        this.zzZEY = document;
        this.zzYR9 = str;
    }

    public Document getDocument() {
        return this.zzZEY;
    }

    public String getDocumentPartFileName() {
        return this.zzYR9;
    }

    public OutputStream getDocumentPartStream() {
        return com.aspose.words.internal.zzZOP.zzZF(this.zzYRa);
    }

    public boolean getKeepDocumentPartStreamOpen() {
        return this.zzYR8;
    }

    public void setDocumentPartFileName(String str) throws Exception {
        com.aspose.words.internal.zzZ4.zzU(str, "DocumentPartFileName");
        if (!com.aspose.words.internal.zzZKN.equals(com.aspose.words.internal.zzZOQ.zzVh(str), str)) {
            throw new IllegalArgumentException("DocumentPartFileName must be a file name without path.");
        }
        this.zzYR9 = str;
    }

    public void setDocumentPartStream(OutputStream outputStream) {
        this.zzYRa = com.aspose.words.internal.zzZOP.zzY(outputStream);
    }

    public void setKeepDocumentPartStreamOpen(boolean z) {
        this.zzYR8 = z;
    }

    public final zzY3P zzZVm() {
        return new zzY3P(this.zzYRa, this.zzYR8);
    }

    public final boolean zzro() {
        return this.zzYRa != null;
    }
}
