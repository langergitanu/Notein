package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class PdfDigitalSignatureTimestampSettings {
    private com.aspose.words.internal.zzZNF zzje;
    private String zzjf;
    private String zzjg;
    private String zzjh;

    public PdfDigitalSignatureTimestampSettings() {
        this(null, null, null);
    }

    public String getPassword() {
        return this.zzjf;
    }

    public String getServerUrl() {
        return this.zzjh;
    }

    public long getTimeout() {
        return com.aspose.words.internal.zzZNF.zzV(this.zzje);
    }

    public String getUserName() {
        return this.zzjg;
    }

    public void setPassword(String str) {
        this.zzjf = str;
    }

    public void setServerUrl(String str) {
        this.zzjh = str;
    }

    public void setTimeout(long j) {
        this.zzje = com.aspose.words.internal.zzZNF.zzYv(j);
    }

    public void setUserName(String str) {
        this.zzjg = str;
    }

    public final com.aspose.words.internal.zz4O zzYnA() {
        if (this.zzjh == null) {
            return null;
        }
        return new com.aspose.words.internal.zz4O(getServerUrl(), getUserName(), getPassword(), this.zzje);
    }

    public PdfDigitalSignatureTimestampSettings(String str, String str2, String str3) {
        this(str, str2, str3, com.aspose.words.internal.zzZNF.zzhw());
    }

    private PdfDigitalSignatureTimestampSettings(String str, String str2, String str3, com.aspose.words.internal.zzZNF zzznf) {
        this.zzjh = str;
        this.zzjg = str2;
        this.zzjf = str3;
        this.zzje = zzznf;
    }

    public PdfDigitalSignatureTimestampSettings(String str, String str2, String str3, long j) {
        this(str, str2, str3, com.aspose.words.internal.zzZNF.zzYv(j));
    }
}
