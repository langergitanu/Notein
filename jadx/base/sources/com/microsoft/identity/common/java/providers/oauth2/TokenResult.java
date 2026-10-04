package com.microsoft.identity.common.java.providers.oauth2;

import com.microsoft.identity.common.java.telemetry.CliTelemInfo;

/* JADX INFO: loaded from: classes9.dex */
public class TokenResult implements IResult {
    private CliTelemInfo mCliTelemInfo;
    private boolean mSuccess;
    private TokenErrorResponse mTokenErrorResponse;
    private TokenResponse mTokenResponse;

    public TokenResult() {
        this.mSuccess = false;
    }

    public CliTelemInfo getCliTelemInfo() {
        return this.mCliTelemInfo;
    }

    @Override // com.microsoft.identity.common.java.providers.oauth2.IResult
    public boolean getSuccess() {
        return this.mSuccess;
    }

    public TokenResponse getTokenResponse() {
        return this.mTokenResponse;
    }

    public void setCliTelemInfo(CliTelemInfo cliTelemInfo) {
        this.mCliTelemInfo = cliTelemInfo;
    }

    public void setSuccess(boolean z) {
        this.mSuccess = z;
    }

    public String toString() {
        return "TokenResult{mTokenResponse=" + this.mTokenResponse + ", mTokenErrorResponse=" + this.mTokenErrorResponse + ", mSuccess=" + this.mSuccess + '}';
    }

    @Override // com.microsoft.identity.common.java.providers.oauth2.IResult
    public TokenErrorResponse getErrorResponse() {
        return this.mTokenErrorResponse;
    }

    @Override // com.microsoft.identity.common.java.providers.oauth2.IResult
    public TokenResponse getSuccessResponse() {
        return this.mTokenResponse;
    }

    public TokenResult(TokenResponse tokenResponse) {
        this(tokenResponse, null);
    }

    public TokenResult(TokenErrorResponse tokenErrorResponse) {
        this(null, tokenErrorResponse);
    }

    public TokenResult(TokenResponse tokenResponse, TokenErrorResponse tokenErrorResponse) {
        this.mSuccess = false;
        this.mTokenResponse = tokenResponse;
        this.mTokenErrorResponse = tokenErrorResponse;
        if (tokenResponse != null) {
            this.mSuccess = true;
        }
    }
}
