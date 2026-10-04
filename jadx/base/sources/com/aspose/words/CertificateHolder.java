package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class CertificateHolder {
    private com.aspose.words.internal.zzWZ zzZz8;

    public CertificateHolder(com.aspose.words.internal.zzWZ zzwz) {
        this.zzZz8 = zzwz;
    }

    public static CertificateHolder create(byte[] bArr, String str) throws Exception {
        return new CertificateHolder(com.aspose.words.internal.zzWZ.zzY(bArr, str));
    }

    public X509Certificate2Wrapper getCertificate() {
        return X509Certificate2Wrapper.zzX(zz4w());
    }

    public final com.aspose.words.internal.zzWZ zz4v() {
        return this.zzZz8;
    }

    public final com.aspose.words.internal.zzZOG zz4w() {
        com.aspose.words.internal.zzWZ zzwz = this.zzZz8;
        if (zzwz != null) {
            return zzwz.zzVi();
        }
        return null;
    }

    public static CertificateHolder create(String str, String str2) throws Exception {
        return new CertificateHolder(com.aspose.words.internal.zzWZ.zzR(str, str2));
    }

    public static CertificateHolder create(String str, String str2, String str3) throws Exception {
        return new CertificateHolder(com.aspose.words.internal.zzWZ.zzX(str, str2, str3));
    }
}
