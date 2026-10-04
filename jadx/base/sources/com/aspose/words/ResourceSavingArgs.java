package com.aspose.words;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes6.dex */
public class ResourceSavingArgs {
    private OutputStream zzXBX;
    private Document zzYTQ;
    private boolean zzcG;
    private boolean zzcH;
    private String zzcI;
    private String zzcJ;

    public ResourceSavingArgs(Document document, String str, String str2) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        com.aspose.words.internal.zzZYD.zzXk(str2);
        this.zzYTQ = document;
        this.zzcJ = str;
        this.zzcI = str2;
    }

    public Document getDocument() {
        return this.zzYTQ;
    }

    public boolean getKeepResourceStreamOpen() {
        return this.zzcG;
    }

    public String getResourceFileName() {
        return this.zzcJ;
    }

    public String getResourceFileUri() {
        return this.zzcI;
    }

    public OutputStream getResourceStream() {
        return this.zzXBX;
    }

    public void setKeepResourceStreamOpen(boolean z) {
        this.zzcG = z;
    }

    public void setResourceFileName(String str) throws Exception {
        com.aspose.words.internal.zzZ4.zzU(str, "ResourceFileName");
        if (!com.aspose.words.internal.zzZKN.equals(com.aspose.words.internal.zzZOQ.zzVh(str), str)) {
            throw new IllegalArgumentException("ResourceFileName must be a file name without path.");
        }
        this.zzcJ = str;
    }

    public void setResourceFileUri(String str) {
        com.aspose.words.internal.zzZ4.zzU(str, "ResourceFileUri");
        this.zzcI = str;
        this.zzcH = true;
    }

    public void setResourceStream(OutputStream outputStream) {
        this.zzXBX = outputStream;
    }

    public final boolean zzrp() {
        return this.zzcH;
    }
}
