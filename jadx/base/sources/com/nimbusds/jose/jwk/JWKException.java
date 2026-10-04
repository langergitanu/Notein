package com.nimbusds.jose.jwk;

import Oooo0oO.C21111o0ooOoO;
import com.nimbusds.jose.KeyException;

/* JADX INFO: loaded from: classes9.dex */
public class JWKException extends KeyException {
    public JWKException(String str) {
        super(str);
    }

    public static JWKException expectedClass(Class<? extends JWK> cls) {
        return new JWKException(C21111o0ooOoO.OooO0O0(cls, "Invalid JWK: Must be an instance of "));
    }

    public static JWKException expectedPrivate() {
        return new JWKException("Expected private JWK but none available");
    }
}
