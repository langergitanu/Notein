package com.microsoft.identity.common.java.result;

import com.microsoft.identity.common.java.providers.oauth2.AuthorizationResult;
import com.microsoft.identity.common.java.providers.oauth2.TokenResult;

/* JADX INFO: loaded from: classes9.dex */
public class AcquireTokenResult {
    private AuthorizationResult mAuthorizationResult;
    private ILocalAuthenticationResult mLocalAuthenticationResult;
    private Boolean mSucceeded = Boolean.FALSE;
    private TokenResult mTokenResult;

    public AuthorizationResult getAuthorizationResult() {
        return this.mAuthorizationResult;
    }

    public ILocalAuthenticationResult getLocalAuthenticationResult() {
        return this.mLocalAuthenticationResult;
    }

    public Boolean getSucceeded() {
        return this.mSucceeded;
    }

    public TokenResult getTokenResult() {
        return this.mTokenResult;
    }

    public void setAuthorizationResult(AuthorizationResult authorizationResult) {
        this.mAuthorizationResult = authorizationResult;
    }

    public void setLocalAuthenticationResult(ILocalAuthenticationResult iLocalAuthenticationResult) {
        this.mLocalAuthenticationResult = iLocalAuthenticationResult;
        this.mSucceeded = Boolean.TRUE;
    }

    public void setTokenResult(TokenResult tokenResult) {
        this.mTokenResult = tokenResult;
    }
}
