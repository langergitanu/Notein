package com.microsoft.identity.client.claims;

/* JADX INFO: loaded from: classes9.dex */
public class WWWAuthenticateHeader {
    static final String CLAIMS_DIRECTIVE = "claims=";
    static final char COMMA = ',';
    static final char DOUBLE_QUOTE = '\"';
    static final char SINGLE_QUOTE = '\'';
    static final char SPACE = ' ';

    public static ClaimsRequest getClaimsRequestFromWWWAuthenticateHeaderValue(String str) {
        String strSubstring;
        int iIndexOf = str.indexOf(CLAIMS_DIRECTIVE);
        if (iIndexOf == -1) {
            return null;
        }
        int i = iIndexOf + 7;
        int i2 = iIndexOf + 8;
        char cCharAt = str.substring(i, i2).charAt(0);
        if (cCharAt == '\'') {
            strSubstring = str.substring(i2, str.indexOf(39, i2));
        } else if (cCharAt == '\"') {
            strSubstring = str.substring(i2, str.indexOf("}\"", i2) + 1);
        } else {
            int iIndexOf2 = str.indexOf(44, i);
            int iIndexOf3 = str.indexOf(32, i);
            strSubstring = (iIndexOf2 == -1 && iIndexOf3 == -1) ? str.substring(i) : iIndexOf2 != -1 ? str.substring(i, iIndexOf2) : str.substring(i, iIndexOf3);
        }
        return ClaimsRequest.getClaimsRequestFromJsonString(strSubstring);
    }

    public static Boolean hasClaimsDirective(String str) {
        return str.indexOf(CLAIMS_DIRECTIVE) == -1 ? Boolean.FALSE : Boolean.TRUE;
    }
}
