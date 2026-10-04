package com.aspose.words;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX INFO: loaded from: classes6.dex */
public final class DigitalSignatureType {
    public static final int CRYPTO_API = 1;
    public static final int UNKNOWN = 0;
    public static final int XML_DSIG = 2;
    public static final int length = 3;

    private DigitalSignatureType() {
    }

    public static int fromName(String str) {
        if (GrsBaseInfo.CountryCodeSource.UNKNOWN.equals(str)) {
            return 0;
        }
        if ("CRYPTO_API".equals(str)) {
            return 1;
        }
        if ("XML_DSIG".equals(str)) {
            return 2;
        }
        throw new IllegalArgumentException("Unknown DigitalSignatureType name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown DigitalSignatureType value." : "XML_DSIG" : "CRYPTO_API" : GrsBaseInfo.CountryCodeSource.UNKNOWN;
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? "Unknown DigitalSignatureType value." : "XmlDsig" : "CryptoApi" : "Unknown";
    }
}
