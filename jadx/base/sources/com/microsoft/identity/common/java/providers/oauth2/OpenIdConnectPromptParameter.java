package com.microsoft.identity.common.java.providers.oauth2;

import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
public enum OpenIdConnectPromptParameter {
    UNSET,
    NONE,
    SELECT_ACCOUNT,
    LOGIN,
    CONSENT,
    CREATE;

    public static OpenIdConnectPromptParameter _fromPromptBehavior(String str) {
        return (str == null || !str.equals("FORCE_PROMPT")) ? UNSET : LOGIN;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this == UNSET ? "" : name().toLowerCase(Locale.ROOT);
    }
}
