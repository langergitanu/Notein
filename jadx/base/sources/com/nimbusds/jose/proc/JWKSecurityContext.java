package com.nimbusds.jose.proc;

import com.nimbusds.jose.jwk.JWK;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class JWKSecurityContext implements SecurityContext {
    private final List<JWK> keys;

    public JWKSecurityContext(List<JWK> list) {
        this.keys = list;
        if (list == null) {
            throw new IllegalArgumentException("The list of keys must not be null");
        }
    }

    public List<JWK> getKeys() {
        return this.keys;
    }
}
