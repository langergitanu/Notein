package com.microsoft.identity.common.java.providers.oauth2;

import com.google.gson.annotations.Expose;

/* JADX INFO: loaded from: classes9.dex */
public class AuthorizationErrorResponse implements IErrorResponse {

    @Expose
    private String mError;

    @Expose
    private String mErrorDescription;
    private String mUpnToWpj;

    public static class Fields {
        public static final String ERROR = "error";
        public static final String ERROR_DESCRIPTION = "error_description";
    }

    public AuthorizationErrorResponse(String str, String str2) {
        this.mError = str;
        this.mErrorDescription = str2;
    }

    @Override // com.microsoft.identity.common.java.providers.oauth2.IErrorResponse
    public String getError() {
        return this.mError;
    }

    @Override // com.microsoft.identity.common.java.providers.oauth2.IErrorResponse
    public String getErrorDescription() {
        return this.mErrorDescription;
    }

    public String getUpnToWpj() {
        return this.mUpnToWpj;
    }

    public void setError(String str) {
        this.mError = str;
    }

    public void setErrorDescription(String str) {
        this.mErrorDescription = str;
    }

    public void setUpnToWpj(String str) {
        this.mUpnToWpj = str;
    }
}
