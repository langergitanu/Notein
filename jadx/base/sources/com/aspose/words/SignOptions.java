package com.aspose.words;

import java.util.Date;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class SignOptions {
    private String zzXem;
    private byte[] zzXen;
    private com.aspose.words.internal.zzZOZ zzXeo;
    private com.aspose.words.internal.zzZOZ zzZiB;
    private String zzZiH = "";
    private com.aspose.words.internal.zzZQ9 zzZiI = com.aspose.words.internal.zzZQ9.zzQO();

    public SignOptions() {
        com.aspose.words.internal.zzZOZ zzzoz = com.aspose.words.internal.zzZOZ.zzZXP;
        this.zzXeo = zzzoz;
        this.zzZiB = zzzoz;
        this.zzXem = "";
    }

    public String getComments() {
        return this.zzZiH;
    }

    public String getDecryptionPassword() {
        return this.zzXem;
    }

    public UUID getProviderId() {
        return com.aspose.words.internal.zzZOZ.zzV(this.zzZiB);
    }

    public Date getSignTime() {
        return com.aspose.words.internal.zzZQ9.zzJ(this.zzZiI);
    }

    public UUID getSignatureLineId() {
        return com.aspose.words.internal.zzZOZ.zzV(this.zzXeo);
    }

    public byte[] getSignatureLineImage() {
        return this.zzXen;
    }

    public void setComments(String str) {
        this.zzZiH = str;
    }

    public void setDecryptionPassword(String str) {
        this.zzXem = str;
    }

    public void setProviderId(UUID uuid) {
        this.zzZiB = com.aspose.words.internal.zzZOZ.zzZ(uuid);
    }

    public void setSignTime(Date date) {
        this.zzZiI = com.aspose.words.internal.zzZQ9.zzZ(date);
    }

    public void setSignatureLineId(UUID uuid) {
        this.zzXeo = com.aspose.words.internal.zzZOZ.zzZ(uuid);
    }

    public void setSignatureLineImage(byte[] bArr) {
        this.zzXen = bArr;
    }

    public final void zzX(DigitalSignature digitalSignature) {
        digitalSignature.setComments(getComments());
        digitalSignature.zzq(this.zzZiI);
        digitalSignature.zzQ(this.zzXeo);
        digitalSignature.setImageBytes(getSignatureLineImage());
        digitalSignature.zzP(this.zzZiB);
    }
}
