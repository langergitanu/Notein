package com.microsoft.identity.common.java.request;

import com.microsoft.identity.common.java.AuthenticationConstants;

/* JADX INFO: loaded from: classes9.dex */
public enum SdkType {
    ADAL,
    MSAL,
    MSAL_CPP,
    MSAL_XPLAT_LINUX,
    UNKNOWN;

    public String getProductName() {
        return (ADAL == this || MSAL == this) ? AuthenticationConstants.SdkPlatformFields.PRODUCT_NAME_MSAL : MSAL_CPP == this ? AuthenticationConstants.SdkPlatformFields.PRODUCT_NAME_MSAL_CPP : MSAL_XPLAT_LINUX == this ? AuthenticationConstants.SdkPlatformFields.PRODUCT_NAME_MSAL_XPLAT_LINUX : "";
    }

    public boolean isCapableOfMSA() {
        return this == MSAL || this == MSAL_CPP || this == MSAL_XPLAT_LINUX;
    }
}
