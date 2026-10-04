package com.microsoft.identity.common.java.providers.oauth2;

import com.microsoft.identity.common.java.providers.oauth2.AuthorizationErrorResponse;
import com.microsoft.identity.common.java.providers.oauth2.AuthorizationResponse;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AuthorizationResult<GenericAuthorizationResponse extends AuthorizationResponse, GenericAuthorizationErrorResponse extends AuthorizationErrorResponse> implements IResult {
    private GenericAuthorizationErrorResponse mAuthorizationErrorResponse;
    private GenericAuthorizationResponse mAuthorizationResponse;
    private AuthorizationStatus mAuthorizationStatus;
    private boolean mSuccess;

    public AuthorizationResult(GenericAuthorizationResponse genericauthorizationresponse, GenericAuthorizationErrorResponse genericauthorizationerrorresponse) {
        this.mSuccess = false;
        this.mAuthorizationResponse = genericauthorizationresponse;
        this.mAuthorizationErrorResponse = genericauthorizationerrorresponse;
        if (genericauthorizationresponse != null) {
            this.mSuccess = true;
        }
    }

    public GenericAuthorizationErrorResponse getAuthorizationErrorResponse() {
        return this.mAuthorizationErrorResponse;
    }

    public GenericAuthorizationResponse getAuthorizationResponse() {
        return this.mAuthorizationResponse;
    }

    public AuthorizationStatus getAuthorizationStatus() {
        return this.mAuthorizationStatus;
    }

    @Override // com.microsoft.identity.common.java.providers.oauth2.IResult
    public IErrorResponse getErrorResponse() {
        return this.mAuthorizationErrorResponse;
    }

    @Override // com.microsoft.identity.common.java.providers.oauth2.IResult
    public boolean getSuccess() {
        return this.mSuccess;
    }

    @Override // com.microsoft.identity.common.java.providers.oauth2.IResult
    public ISuccessResponse getSuccessResponse() {
        return this.mAuthorizationResponse;
    }

    public void setAuthorizationErrorResponse(GenericAuthorizationErrorResponse genericauthorizationerrorresponse) {
        this.mAuthorizationErrorResponse = genericauthorizationerrorresponse;
    }

    public void setAuthorizationResponse(GenericAuthorizationResponse genericauthorizationresponse) {
        this.mAuthorizationResponse = genericauthorizationresponse;
    }

    public void setAuthorizationStatus(AuthorizationStatus authorizationStatus) {
        this.mAuthorizationStatus = authorizationStatus;
    }

    public AuthorizationResult(AuthorizationStatus authorizationStatus) {
        this.mSuccess = false;
        this.mAuthorizationStatus = authorizationStatus;
    }

    public AuthorizationResult() {
        this.mSuccess = false;
    }
}
