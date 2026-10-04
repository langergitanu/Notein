package com.microsoft.identity.common.java.providers.microsoft.microsoftsts;

import com.microsoft.identity.common.java.providers.microsoft.MicrosoftAuthorizationErrorResponse;

/* JADX INFO: loaded from: classes9.dex */
public class MicrosoftStsAuthorizationErrorResponse extends MicrosoftAuthorizationErrorResponse {
    private String mErrorSubcode;

    public MicrosoftStsAuthorizationErrorResponse(String str, String str2) {
        super(str, str2);
    }

    public String getErrorSubcode() {
        return this.mErrorSubcode;
    }

    public void setErrorSubcode(String str) {
        this.mErrorSubcode = str;
    }

    public MicrosoftStsAuthorizationErrorResponse(String str, String str2, String str3) {
        super(str, str3);
        this.mErrorSubcode = str2;
    }
}
