package com.aspose.words;

import com.microsoft.identity.common.adal.internal.AuthenticationConstants;

/* JADX INFO: loaded from: classes6.dex */
public final class NumeralFormat {
    public static final int ARABIC_INDIC = 1;
    public static final int CONTEXT = 3;
    public static final int EASTERN_ARABIC_INDIC = 2;
    public static final int EUROPEAN = 0;
    public static final int SYSTEM = 4;
    public static final int length = 5;

    private NumeralFormat() {
    }

    public static int fromName(String str) {
        if ("EUROPEAN".equals(str)) {
            return 0;
        }
        if ("ARABIC_INDIC".equals(str)) {
            return 1;
        }
        if ("EASTERN_ARABIC_INDIC".equals(str)) {
            return 2;
        }
        if ("CONTEXT".equals(str)) {
            return 3;
        }
        if ("SYSTEM".equals(str)) {
            return 4;
        }
        throw new IllegalArgumentException("Unknown NumeralFormat name.");
    }

    public static String getName(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown NumeralFormat value." : "SYSTEM" : "CONTEXT" : "EASTERN_ARABIC_INDIC" : "ARABIC_INDIC" : "EUROPEAN";
    }

    public static int[] getValues() {
        return new int[]{0, 1, 2, 3, 4};
    }

    public static String toString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown NumeralFormat value." : "System" : AuthenticationConstants.Broker.CHALLENGE_RESPONSE_CONTEXT : "EasternArabicIndic" : "ArabicIndic" : "European";
    }
}
