package com.microsoft.identity.client.exception;

import com.microsoft.identity.common.java.exception.UnsupportedBrokerException;

/* JADX INFO: loaded from: classes9.dex */
public class MsalUnsupportedBrokerException extends MsalException {
    private final String mActiveBrokerPackageName;

    public MsalUnsupportedBrokerException(UnsupportedBrokerException unsupportedBrokerException) {
        super(unsupportedBrokerException.getErrorCode(), unsupportedBrokerException.getMessage());
        this.mActiveBrokerPackageName = unsupportedBrokerException.getActiveBrokerPackageName();
    }

    public String getActiveBrokerPackageName() {
        return this.mActiveBrokerPackageName;
    }
}
