package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class SaveOutputParameters {
    private String zzZR;

    public SaveOutputParameters(String str) {
        setContentType(str);
    }

    private void setContentType(String str) {
        com.aspose.words.internal.zzZ4.zzU(str, "contentType");
        this.zzZR = str;
    }

    public String getContentType() {
        return this.zzZR;
    }
}
