package com.aspose.words.internal;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ6R extends zzZ6T {
    public zzZ6R(X509Certificate x509Certificate) throws CertificateEncodingException {
        super(zzZ80.zzXh(x509Certificate.getEncoded()));
    }
}
