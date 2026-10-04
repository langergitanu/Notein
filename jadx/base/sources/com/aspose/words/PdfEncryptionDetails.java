package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class PdfEncryptionDetails {
    private String zziG;
    private String zziH;
    private int zziI;

    public PdfEncryptionDetails(String str, String str2) {
        this(str, str2, 0);
    }

    public String getOwnerPassword() {
        return this.zziG;
    }

    public int getPermissions() {
        return this.zziI;
    }

    public String getUserPassword() {
        return this.zziH;
    }

    public void setOwnerPassword(String str) {
        this.zziG = str;
    }

    public void setPermissions(int i) {
        this.zziI = i;
    }

    public void setUserPassword(String str) {
        this.zziH = str;
    }

    public final com.aspose.words.internal.zz4H zzYnz() {
        return new com.aspose.words.internal.zz4H(getUserPassword(), getOwnerPassword(), getPermissions());
    }

    public PdfEncryptionDetails(String str, String str2, int i) {
        setUserPassword(str);
        setOwnerPassword(str2);
        setPermissions(i);
    }
}
