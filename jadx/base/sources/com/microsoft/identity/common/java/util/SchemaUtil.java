package com.microsoft.identity.common.java.util;

import Oooo0oO.o0Oo0oo;
import OoooooO.C21445Oooo;
import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.java.dto.CredentialType;
import com.microsoft.identity.common.java.exception.ServiceException;
import com.microsoft.identity.common.java.logging.Logger;
import com.microsoft.identity.common.java.providers.microsoft.azureactivedirectory.ClientInfo;
import com.microsoft.identity.common.java.providers.oauth2.IDToken;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class SchemaUtil {
    private static final String EXCEPTION_CONSTRUCTING_IDTOKEN = "Exception constructing IDToken. ";
    public static final String MISSING_FROM_THE_TOKEN_RESPONSE = "Missing from the token response";
    private static final String TAG = "SchemaUtil";

    private SchemaUtil() {
    }

    public static String getAlternativeAccountId(IDToken iDToken) {
        if (iDToken == null) {
            C21445Oooo.OooO0Oo(new StringBuilder(), TAG, ":getAlternativeAccountId", "IDToken was null.");
            return null;
        }
        String str = (String) iDToken.getTokenClaims().get("altsecid");
        StringBuilder sb = new StringBuilder();
        String str2 = TAG;
        Logger.verbosePII(OooO00o.OooO0OO(sb, str2, ":getAlternativeAccountId"), "alternative_account_id: " + str);
        if (str == null) {
            Logger.warn(str2 + ":getAlternativeAccountId", "alternative_account_id was null.");
        }
        return str;
    }

    public static String getAuthority(IDToken iDToken) {
        if (iDToken == null) {
            C21445Oooo.OooO0Oo(new StringBuilder(), TAG, ":getAuthority", "IDToken was null");
            return null;
        }
        String str = (String) iDToken.getTokenClaims().get("iss");
        StringBuilder sb = new StringBuilder();
        String str2 = TAG;
        Logger.verbosePII(OooO00o.OooO0OO(sb, str2, ":getAuthority"), "Issuer: " + str);
        if (str == null) {
            Logger.warn(str2 + ":getAuthority", "Environment was null or could not be parsed.");
        }
        return str;
    }

    public static String getAvatarUrl(IDToken iDToken) {
        if (iDToken == null) {
            C21445Oooo.OooO0Oo(new StringBuilder(), TAG, ":getAvatarUrl", "IDToken was null.");
            return null;
        }
        String str = (String) iDToken.getTokenClaims().get(IDToken.PICTURE);
        StringBuilder sb = new StringBuilder();
        String str2 = TAG;
        Logger.verbosePII(OooO00o.OooO0OO(sb, str2, ":getAvatarUrl"), "Avatar URL: " + str);
        if (str == null) {
            Logger.warn(str2 + ":getAvatarUrl", "Avatar URL was null.");
        }
        return str;
    }

    public static String getCredentialTypeFromVersion(String str) {
        String strName = CredentialType.IdToken.name();
        if (!StringUtil.isNullOrEmpty(str)) {
            try {
                if ("1.0".equalsIgnoreCase((String) new IDToken(str).getTokenClaims().get("ver"))) {
                    return CredentialType.V1IdToken.name();
                }
            } catch (ServiceException e) {
                Logger.warn(OooO00o.OooO0OO(new StringBuilder(), TAG, ":getCredentialTypeFromVersion"), EXCEPTION_CONSTRUCTING_IDTOKEN + e.getMessage());
            }
        }
        return strName;
    }

    public static String getDisplayableId(Map<String, ?> map) {
        if (map == null) {
            throw new NullPointerException("claims is marked non-null but is null");
        }
        if (!StringUtil.isNullOrEmpty((String) map.get("preferred_username"))) {
            return (String) map.get("preferred_username");
        }
        if (!StringUtil.isNullOrEmpty((String) map.get("email"))) {
            return (String) map.get("email");
        }
        if (!StringUtil.isNullOrEmpty((String) map.get("upn"))) {
            return (String) map.get("upn");
        }
        Logger.warn(TAG, "The preferred username is not returned from the IdToken.");
        return MISSING_FROM_THE_TOKEN_RESPONSE;
    }

    public static String getHomeAccountId(ClientInfo clientInfo) {
        String strOooO0Oo = null;
        if (clientInfo == null) {
            C21445Oooo.OooO0Oo(new StringBuilder(), TAG, "::getHomeAccountId", "ClientInfo was null.");
            return null;
        }
        String uid = clientInfo.getUid();
        String utid = clientInfo.getUtid();
        if (StringUtil.isNullOrEmpty(uid)) {
            C21445Oooo.OooO0Oo(new StringBuilder(), TAG, "::getHomeAccountId", "uid was null/blank");
        }
        if (StringUtil.isNullOrEmpty(utid)) {
            C21445Oooo.OooO0Oo(new StringBuilder(), TAG, "::getHomeAccountId", "utid was null/blank");
        }
        if (!StringUtil.isNullOrEmpty(uid) && !StringUtil.isNullOrEmpty(utid)) {
            strOooO0Oo = o0Oo0oo.OooO0Oo(uid, ".", utid);
        }
        Logger.verbosePII(OooO00o.OooO0OO(new StringBuilder(), TAG, "::getHomeAccountId"), "home_account_id: " + strOooO0Oo);
        return strOooO0Oo;
    }

    public static String getIdentityProvider(String str) {
        String str2 = null;
        if (str == null) {
            C21445Oooo.OooO0Oo(new StringBuilder(), TAG, ":getIdentityProvider", "IDToken was null.");
            return null;
        }
        try {
            String str3 = (String) new IDToken(str).getTokenClaims().get("idp");
            try {
                StringBuilder sb = new StringBuilder();
                String str4 = TAG;
                sb.append(str4);
                sb.append(":getIdentityProvider");
                Logger.verbosePII(sb.toString(), "idp: " + str3);
                if (str3 != null) {
                    return str3;
                }
                Logger.info(str4 + ":getIdentityProvider", "idp claim was null.");
                return str3;
            } catch (ServiceException e) {
                e = e;
                str2 = str3;
                Logger.warn(OooO00o.OooO0OO(new StringBuilder(), TAG, ":getIdentityProvider"), EXCEPTION_CONSTRUCTING_IDTOKEN + e.getMessage());
                return str2;
            }
        } catch (ServiceException e2) {
            e = e2;
        }
    }

    public static String getTenantId(String str, String str2) {
        try {
            if (!StringUtil.isNullOrEmpty(str2) && !StringUtil.isNullOrEmpty(str)) {
                IDToken iDToken = new IDToken(str2);
                ClientInfo clientInfo = new ClientInfo(str);
                Map<String, ?> tokenClaims = iDToken.getTokenClaims();
                if (!StringUtil.isNullOrEmpty((String) tokenClaims.get("tid"))) {
                    return (String) tokenClaims.get("tid");
                }
                if (StringUtil.isNullOrEmpty(clientInfo.getUtid())) {
                    Logger.warn(TAG, "realm and utid is not returned from server. Using empty string as default tid.");
                    return null;
                }
                Logger.warn(TAG, "realm is not returned from server. Use utid as realm.");
                return clientInfo.getUtid();
            }
        } catch (ServiceException e) {
            Logger.errorPII(TAG, "Failed to construct IDToken or ClientInfo", e);
        }
        return null;
    }
}
