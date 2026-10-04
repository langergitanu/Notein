package com.microsoft.identity.common.java.providers.microsoft.microsoftsts;

import com.microsoft.identity.common.java.providers.oauth2.AccessToken;

/* JADX INFO: loaded from: classes9.dex */
public class MicrosoftStsAccessToken extends AccessToken {
    private Long mExtExpiresIn;

    public MicrosoftStsAccessToken(MicrosoftStsTokenResponse microsoftStsTokenResponse) {
        super(microsoftStsTokenResponse);
        this.mExtExpiresIn = microsoftStsTokenResponse.getExtExpiresIn();
    }

    public Long getExtExpiresIn() {
        return this.mExtExpiresIn;
    }

    public void setExtExpiresIn(Long l) {
        this.mExtExpiresIn = l;
    }
}
