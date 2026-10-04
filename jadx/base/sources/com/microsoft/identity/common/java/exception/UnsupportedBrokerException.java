package com.microsoft.identity.common.java.exception;

/* JADX INFO: loaded from: classes9.dex */
public class UnsupportedBrokerException extends BaseException {
    private final String mActiveBrokerPackageName;

    public UnsupportedBrokerException(String str) {
        this(str, ErrorStrings.UNSUPPORTED_BROKER_VERSION_ERROR_CODE, ErrorStrings.UNSUPPORTED_BROKER_VERSION_ERROR_MESSAGE);
        if (str == null) {
            throw new NullPointerException("activeBrokerPackageName is marked non-null but is null");
        }
    }

    public String getActiveBrokerPackageName() {
        return this.mActiveBrokerPackageName;
    }

    public UnsupportedBrokerException(String str, String str2, String str3) {
        super(str2, str3);
        if (str == null) {
            throw new NullPointerException("activeBrokerPackageName is marked non-null but is null");
        }
        if (str2 != null) {
            this.mActiveBrokerPackageName = str;
            return;
        }
        throw new NullPointerException("errorCode is marked non-null but is null");
    }
}
