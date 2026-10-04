package com.microsoft.identity.common.java.dto;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public enum CredentialType {
    RefreshToken,
    AccessToken,
    IdToken,
    V1IdToken,
    Password,
    Cookie,
    Certificate,
    AccessToken_With_AuthScheme,
    PrimaryRefreshToken;

    public static final Collection<CredentialType> ID_TOKEN_TYPES = Collections.unmodifiableList(Arrays.asList(IdToken, V1IdToken));

    public static CredentialType fromString(String str) {
        for (CredentialType credentialType : values()) {
            if (credentialType.name().equalsIgnoreCase(str)) {
                return credentialType;
            }
        }
        return null;
    }

    public static Set<String> valueSet() {
        HashSet hashSet = new HashSet();
        for (CredentialType credentialType : values()) {
            hashSet.add(credentialType.name());
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
