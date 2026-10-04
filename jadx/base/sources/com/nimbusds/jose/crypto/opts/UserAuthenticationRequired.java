package com.nimbusds.jose.crypto.opts;

import com.nimbusds.jose.JWSSignerOption;

/* JADX INFO: loaded from: classes9.dex */
public final class UserAuthenticationRequired implements JWSSignerOption {
    private static final UserAuthenticationRequired SINGLETON = new UserAuthenticationRequired();

    private UserAuthenticationRequired() {
    }

    public static UserAuthenticationRequired getInstance() {
        return SINGLETON;
    }

    public String toString() {
        return "UserAuthenticationRequired";
    }
}
