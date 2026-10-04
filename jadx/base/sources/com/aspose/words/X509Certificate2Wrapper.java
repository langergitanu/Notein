package com.aspose.words;

import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes6.dex */
public class X509Certificate2Wrapper {
    private com.aspose.words.internal.zzZOG zzWTI;

    public X509Certificate2Wrapper(String str, String str2) {
        this.zzWTI = new com.aspose.words.internal.zzZOG(str, str2);
    }

    public static X509Certificate2Wrapper zzX(com.aspose.words.internal.zzZOG zzzog) {
        return new X509Certificate2Wrapper(zzzog);
    }

    public X509Certificate getJavaCertificateInfo() {
        return this.zzWTI.zzin();
    }

    private X509Certificate2Wrapper(com.aspose.words.internal.zzZOG zzzog) {
        this.zzWTI = zzzog;
    }
}
