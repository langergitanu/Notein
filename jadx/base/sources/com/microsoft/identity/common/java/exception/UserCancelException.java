package com.microsoft.identity.common.java.exception;

/* JADX INFO: loaded from: classes9.dex */
public final class UserCancelException extends BaseException {
    public static final String sName = "com.microsoft.identity.common.exception.UserCancelException";
    private static final long serialVersionUID = 5184560527352649832L;

    public UserCancelException() {
    }

    @Override // com.microsoft.identity.common.java.exception.BaseException
    public String getExceptionName() {
        return sName;
    }

    public UserCancelException(String str, String str2) {
        super(str, str2);
    }
}
