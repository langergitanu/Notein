package com.microsoft.identity.common.java.util;

/* JADX INFO: loaded from: classes9.dex */
public class BrokerProtocolVersionUtil {
    public static final String MSAL_TO_BROKER_PROTOCOL_ACCOUNT_FROM_PRT_CHANGES_MINIMUM_VERSION = "8.0";
    public static final String MSAL_TO_BROKER_PROTOCOL_BROKER_MSA_SUPPORT_MINIMUM_VERSION = "14.0";
    public static final String MSAL_TO_BROKER_PROTOCOL_COMPRESSION_CHANGES_MINIMUM_VERSION = "5.0";
    public static final String MSAL_TO_BROKER_PROTOCOL_NAA_MINIMUM_VERSION = "15.0";
    public static final String MSAL_TO_BROKER_PROTOCOL_PKEYAUTH_HEADER_CHANGES_MINIMUM_VERSION = "9.0";

    /* JADX INFO: renamed from: MSAL_TO_BROKER_PROTOCOL_POP_SCHEME_WITH_CLIENT_KEY_MINIMUM_VERSION */
    public static final String f57086x4a7f8eb7 = "11.0";

    public static final boolean canCompressBrokerPayloads(String str) {
        return isProvidedBrokerProtocolLargerOrEqualThanRequiredBrokerProtocol(str, MSAL_TO_BROKER_PROTOCOL_COMPRESSION_CHANGES_MINIMUM_VERSION);
    }

    public static final boolean canFociAppsConstructAccountsFromPrtIdTokens(String str) {
        return isProvidedBrokerProtocolLargerOrEqualThanRequiredBrokerProtocol(str, MSAL_TO_BROKER_PROTOCOL_ACCOUNT_FROM_PRT_CHANGES_MINIMUM_VERSION);
    }

    public static boolean canSendPKeyAuthHeaderToTheTokenEndpoint(String str) {
        return isProvidedBrokerProtocolLargerOrEqualThanRequiredBrokerProtocol(str, MSAL_TO_BROKER_PROTOCOL_PKEYAUTH_HEADER_CHANGES_MINIMUM_VERSION);
    }

    public static boolean canSupportMsaAccountsInBroker(String str) {
        return isProvidedBrokerProtocolLargerOrEqualThanRequiredBrokerProtocol(str, MSAL_TO_BROKER_PROTOCOL_BROKER_MSA_SUPPORT_MINIMUM_VERSION);
    }

    public static boolean canSupportNestedAppAuthentication(String str) {
        return isProvidedBrokerProtocolLargerOrEqualThanRequiredBrokerProtocol(str, "15.0");
    }

    public static boolean canSupportPopAuthenticationSchemeWithClientKey(String str) {
        return isProvidedBrokerProtocolLargerOrEqualThanRequiredBrokerProtocol(str, f57086x4a7f8eb7);
    }

    public static final int compareSemanticVersion(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("thisVersion is marked non-null but is null");
        }
        if (str2 == null) {
            return 1;
        }
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        int iMax = Math.max(strArrSplit.length, strArrSplit2.length);
        int i = 0;
        while (i < iMax) {
            int i2 = i < strArrSplit.length ? Integer.parseInt(strArrSplit[i]) : 0;
            int i3 = i < strArrSplit2.length ? Integer.parseInt(strArrSplit2[i]) : 0;
            if (i2 < i3) {
                return -1;
            }
            if (i2 > i3) {
                return 1;
            }
            i++;
        }
        return 0;
    }

    public static boolean isFirstVersionNewerOrEqual(String str, String str2) {
        if (str != null) {
            return compareSemanticVersion(str, str2) >= 0;
        }
        throw new NullPointerException("first is marked non-null but is null");
    }

    public static boolean isFirstVersionOlderOrEqual(String str, String str2) {
        if (str != null) {
            return compareSemanticVersion(str, str2) <= 0;
        }
        throw new NullPointerException("first is marked non-null but is null");
    }

    public static boolean isProvidedBrokerProtocolLargerOrEqualThanRequiredBrokerProtocol(String str, String str2) {
        if (str2 == null) {
            throw new NullPointerException("requiredBrokerProtocol is marked non-null but is null");
        }
        if (StringUtil.isNullOrEmpty(str)) {
            return false;
        }
        return isFirstVersionNewerOrEqual(str, str2);
    }
}
