package com.microsoft.identity.client.exception;

/* JADX INFO: loaded from: classes9.dex */
public final class MsalUiRequiredException extends MsalException {
    public static final String INVALID_GRANT = "invalid_grant";
    public static final String NO_ACCOUNT_FOUND = "no_account_found";
    public static final String NO_TOKENS_FOUND = "no_tokens_found";
    private String mOauthSubErrorCode;

    public MsalUiRequiredException(String str) {
        super(str);
    }

    public String getOauthSubErrorCode() {
        return this.mOauthSubErrorCode;
    }

    public MsalUiRequiredException(String str, String str2) {
        super(str, str2);
    }

    public MsalUiRequiredException(String str, String str2, Throwable th) {
        super(str, str2, th);
    }

    public MsalUiRequiredException(String str, String str2, String str3) {
        super(str, str3);
        this.mOauthSubErrorCode = str2;
    }
}
