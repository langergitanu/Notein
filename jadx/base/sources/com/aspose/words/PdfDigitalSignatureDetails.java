package com.aspose.words;

import java.util.Date;

/* JADX INFO: loaded from: classes6.dex */
public class PdfDigitalSignatureDetails {
    private PdfDigitalSignatureTimestampSettings zzXFc;
    private CertificateHolder zzZiK;
    private int zzjj;
    private com.aspose.words.internal.zzZQ9 zzjk;
    private String zzjl;
    private String zzjm;

    public PdfDigitalSignatureDetails() {
        this((CertificateHolder) null, (String) null, (String) null, com.aspose.words.internal.zzR1.zzQO());
    }

    private void zz5(com.aspose.words.internal.zzZQ9 zzzq9) {
        this.zzjk = zzzq9.zzkF();
    }

    public CertificateHolder getCertificateHolder() {
        return this.zzZiK;
    }

    public int getHashAlgorithm() {
        return this.zzjj;
    }

    public String getLocation() {
        return this.zzjl;
    }

    public String getReason() {
        return this.zzjm;
    }

    public Date getSignatureDate() {
        return com.aspose.words.internal.zzZQ9.zzJ(this.zzjk);
    }

    public PdfDigitalSignatureTimestampSettings getTimestampSettings() {
        return this.zzXFc;
    }

    public void setCertificateHolder(CertificateHolder certificateHolder) {
        this.zzZiK = certificateHolder;
    }

    public void setHashAlgorithm(int i) {
        this.zzjj = i;
    }

    public void setLocation(String str) {
        this.zzjl = str;
    }

    public void setReason(String str) {
        this.zzjm = str;
    }

    public void setSignatureDate(Date date) {
        zz5(com.aspose.words.internal.zzZQ9.zzZ(date));
    }

    public void setTimestampSettings(PdfDigitalSignatureTimestampSettings pdfDigitalSignatureTimestampSettings) {
        this.zzXFc = pdfDigitalSignatureTimestampSettings;
    }

    public final com.aspose.words.internal.zz4Q zzYnB() {
        com.aspose.words.internal.zzWZ zzwzZz4v = this.zzZiK.zz4v();
        String str = this.zzjm;
        String str2 = this.zzjl;
        com.aspose.words.internal.zzZQ9 zzzq9 = this.zzjk;
        int iZzqc = zzYM0.zzqc(this.zzjj);
        PdfDigitalSignatureTimestampSettings pdfDigitalSignatureTimestampSettings = this.zzXFc;
        return new com.aspose.words.internal.zz4Q(zzwzZz4v, str, str2, zzzq9, iZzqc, pdfDigitalSignatureTimestampSettings != null ? pdfDigitalSignatureTimestampSettings.zzYnA() : null);
    }

    private PdfDigitalSignatureDetails(CertificateHolder certificateHolder, String str, String str2, com.aspose.words.internal.zzZQ9 zzzq9) {
        this.zzjk = com.aspose.words.internal.zzR1.zzQO();
        this.zzjj = 0;
        this.zzZiK = certificateHolder;
        setReason(str);
        setLocation(str2);
        zz5(zzzq9);
    }

    public PdfDigitalSignatureDetails(CertificateHolder certificateHolder, String str, String str2, Date date) {
        this(certificateHolder, str, str2, com.aspose.words.internal.zzZQ9.zzZ(date));
    }
}
