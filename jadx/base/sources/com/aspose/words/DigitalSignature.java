package com.aspose.words;

import com.microsoft.identity.client.internal.MsalUtils;
import java.util.Date;

/* JADX INFO: loaded from: classes6.dex */
public class DigitalSignature {
    private String zzZi;
    private boolean zzZiA;
    private com.aspose.words.internal.zzZOZ zzZiB;
    private com.aspose.words.internal.zzZOZ zzZiC;
    private byte[] zzZiD;
    private byte[] zzZiE;
    private byte[] zzZiF;
    private boolean zzZiG;
    private String zzZiH;
    private com.aspose.words.internal.zzZQ9 zzZiI;
    private com.aspose.words.internal.zzWZ zzZiJ;
    private CertificateHolder zzZiK;
    private int zzZiL;
    private byte[] zzZiM;

    public DigitalSignature(CertificateHolder certificateHolder) {
        com.aspose.words.internal.zzZOZ zzzoz = com.aspose.words.internal.zzZOZ.zzZXP;
        this.zzZiC = zzzoz;
        this.zzZiB = zzzoz;
        this.zzZiK = certificateHolder;
        this.zzZiJ = certificateHolder.zz4v();
        this.zzZiI = com.aspose.words.internal.zzZQ9.zzQO();
    }

    public static String zzRO(String str) {
        int i = com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8;
        int iZzT = com.aspose.words.internal.zzZKN.zzT(str, "CN=", i);
        if (iZzT == -1) {
            return str;
        }
        int iZzW = com.aspose.words.internal.zzZKN.zzW(str, ",", iZzT, i);
        if (iZzW == -1) {
            iZzW = str.length();
        }
        int i2 = iZzT + 3;
        return str.substring(i2, ((iZzW - iZzT) - 3) + i2);
    }

    public CertificateHolder getCertificateHolder() {
        return this.zzZiK;
    }

    public String getComments() {
        return this.zzZiH;
    }

    public final byte[] getImageBytes() {
        return this.zzZiF;
    }

    public String getIssuerName() {
        return this.zzZiK.zz4w().zzip();
    }

    public Date getSignTime() {
        return com.aspose.words.internal.zzZQ9.zzJ(this.zzZiI);
    }

    public int getSignatureType() {
        return this.zzZiL;
    }

    public byte[] getSignatureValue() {
        return this.zzZiM;
    }

    public String getSubjectName() {
        return this.zzZiK.zz4w().getSubject();
    }

    public final boolean getVisible() {
        return this.zzZiA;
    }

    public boolean isValid() {
        return this.zzZiG;
    }

    public final void setComments(String str) {
        this.zzZiH = str;
    }

    public final void setImageBytes(byte[] bArr) {
        this.zzZiF = bArr;
    }

    public final void setText(String str) {
        this.zzZi = str;
    }

    public final void setVisible(boolean z) {
        this.zzZiA = z;
    }

    public String toString() {
        com.aspose.words.internal.zzZ6T zzz6tZzVk = this.zzZiJ.zzVk();
        Integer numValueOf = Integer.valueOf(this.zzZiL);
        String str = this.zzZiG ? "Valid" : "Not valid";
        String string = MsalUtils.QUERY_STRING_SYMBOL;
        String strZzRO = zzz6tZzVk != null ? zzRO(zzz6tZzVk.zzXHp().zzXIe().toString()) : MsalUtils.QUERY_STRING_SYMBOL;
        String strZzRO2 = zzz6tZzVk != null ? zzRO(zzz6tZzVk.zzXHp().zzXIh().toString()) : MsalUtils.QUERY_STRING_SYMBOL;
        String string2 = !com.aspose.words.internal.zzZQ9.zzZ(this.zzZiI, com.aspose.words.internal.zzZQ9.zz35) ? this.zzZiI.toString() : MsalUtils.QUERY_STRING_SYMBOL;
        if (zzz6tZzVk != null) {
            string = zzz6tZzVk.getNotAfter().toString();
        }
        return com.aspose.words.internal.zzZKN.format("Signature [{0}, {1}, {2}/{3}, {4}/{5}]", numValueOf, str, strZzRO, strZzRO2, string2, string);
    }

    public final void zzP(com.aspose.words.internal.zzZOZ zzzoz) {
        this.zzZiB = zzzoz;
    }

    public final void zzQ(com.aspose.words.internal.zzZOZ zzzoz) {
        this.zzZiC = zzzoz;
    }

    public final void zzS(com.aspose.words.internal.zzWZ zzwz) {
        this.zzZiJ.zzZ(zzwz.zzVk());
    }

    public final void zzY9(boolean z) {
        this.zzZiG = z;
    }

    public final void zzYu(byte[] bArr) {
        this.zzZiD = bArr;
    }

    public final void zzYv(byte[] bArr) {
        this.zzZiE = bArr;
    }

    public final void zzYw(byte[] bArr) {
        this.zzZiM = bArr;
    }

    public final com.aspose.words.internal.zzZQ9 zzZSA() {
        return this.zzZiI;
    }

    public final com.aspose.words.internal.zzZOZ zzZSv() {
        return this.zzZiB;
    }

    public final com.aspose.words.internal.zzZOZ zzZSw() {
        return this.zzZiC;
    }

    public final byte[] zzZSx() {
        return this.zzZiD;
    }

    public final byte[] zzZSy() {
        return this.zzZiE;
    }

    public final com.aspose.words.internal.zzWZ zzZSz() {
        return this.zzZiJ;
    }

    public final void zzq(com.aspose.words.internal.zzZQ9 zzzq9) {
        this.zzZiI = zzzq9;
    }

    public DigitalSignature(int i) {
        this(com.aspose.words.internal.zzWZ.zzVh());
        this.zzZiL = i;
        this.zzZiI = com.aspose.words.internal.zzZQ9.zz35;
        this.zzZiH = "";
    }

    private DigitalSignature(com.aspose.words.internal.zzWZ zzwz) {
        com.aspose.words.internal.zzZOZ zzzoz = com.aspose.words.internal.zzZOZ.zzZXP;
        this.zzZiC = zzzoz;
        this.zzZiB = zzzoz;
        this.zzZiJ = zzwz;
        this.zzZiK = new CertificateHolder(zzwz);
    }
}
