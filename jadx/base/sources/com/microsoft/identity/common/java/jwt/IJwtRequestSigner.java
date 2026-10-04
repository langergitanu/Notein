package com.microsoft.identity.common.java.jwt;

import com.microsoft.identity.common.java.exception.ClientException;
import java.security.cert.CertificateEncodingException;

/* JADX INFO: loaded from: classes9.dex */
public interface IJwtRequestSigner {
    String getSignedJwt(JwtRequestBody jwtRequestBody) throws ClientException, CertificateEncodingException;
}
