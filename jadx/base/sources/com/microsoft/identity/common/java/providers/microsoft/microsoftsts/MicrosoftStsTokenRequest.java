package com.microsoft.identity.common.java.providers.microsoft.microsoftsts;

import com.microsoft.identity.common.java.providers.microsoft.MicrosoftTokenRequest;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class MicrosoftStsTokenRequest extends MicrosoftTokenRequest {
    private transient Map<String, String> mJwtClaims;

    public Map<String, String> getJwtClaims() {
        return this.mJwtClaims;
    }

    public void setJwtClaims(Map<String, String> map) {
        this.mJwtClaims = map;
    }
}
