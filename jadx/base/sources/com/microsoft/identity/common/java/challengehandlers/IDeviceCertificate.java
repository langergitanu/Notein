package com.microsoft.identity.common.java.challengehandlers;

import com.microsoft.identity.common.java.exception.ClientException;
import java.security.cert.X509Certificate;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface IDeviceCertificate {
    X509Certificate getX509();

    boolean isValidIssuer(List<String> list);

    byte[] sign(String str, byte[] bArr) throws ClientException;
}
