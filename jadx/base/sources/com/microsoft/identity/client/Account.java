package com.microsoft.identity.client;

import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.client.exception.MsalClientException;
import com.microsoft.identity.common.internal.util.StringUtil;
import com.microsoft.identity.common.java.authorities.CIAMAuthority;
import com.microsoft.identity.common.java.providers.oauth2.IDToken;
import com.microsoft.identity.common.java.util.SchemaUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class Account implements IAccount {
    private static final String TAG = "Account";
    private String mClientInfo;
    private String mEnvironment;
    private String mHomeAccountId;
    private String mHomeOid;
    private String mHomeTenantId;
    private final Map<String, ?> mIdTokenClaims;
    private final String mRawIdToken;

    public Account(String str, IDToken iDToken) {
        this.mClientInfo = str;
        if (iDToken != null) {
            this.mIdTokenClaims = iDToken.getTokenClaims();
            this.mRawIdToken = iDToken.getRawIDToken();
        } else {
            this.mIdTokenClaims = null;
            this.mRawIdToken = null;
        }
    }

    @Override // com.microsoft.identity.client.IAccount
    public String getAuthority() {
        if (getClaims() == null) {
            return SchemaUtil.MISSING_FROM_THE_TOKEN_RESPONSE;
        }
        String str = (String) getClaims().get("iss");
        return !StringUtil.isEmpty(str) ? (!str.contains(CIAMAuthority.CIAM_LOGIN_URL_SEGMENT) || StringUtil.isEmpty(getEnvironment()) || StringUtil.isEmpty(getTenantId())) ? str : CIAMAuthority.getTenantIdVariantUrlFromAuthorityWithoutPath(getEnvironment(), getTenantId()) : SchemaUtil.MISSING_FROM_THE_TOKEN_RESPONSE;
    }

    @Override // com.microsoft.identity.client.IClaimable
    public Map<String, ?> getClaims() {
        return this.mIdTokenClaims;
    }

    public String getEnvironment() {
        return this.mEnvironment;
    }

    public String getHomeAccountId() {
        return getId() + "." + this.mHomeTenantId;
    }

    @Override // com.microsoft.identity.client.IAccount
    public String getId() {
        ClientInfo clientInfo;
        String uIdFromHomeAccountId;
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":getId");
        String str = this.mClientInfo;
        if (str != null) {
            try {
                clientInfo = new ClientInfo(str);
            } catch (MsalClientException e) {
                com.microsoft.identity.common.logging.Logger.error(strOooO0OO, "Failed to parse ClientInfo", e);
                clientInfo = null;
            }
        } else {
            clientInfo = null;
        }
        if (clientInfo != null) {
            uIdFromHomeAccountId = clientInfo.getUniqueIdentifier();
        } else {
            Map<String, ?> map = this.mIdTokenClaims;
            uIdFromHomeAccountId = map != null ? (String) map.get("oid") : this.mHomeOid;
        }
        if (StringUtil.isEmpty(uIdFromHomeAccountId)) {
            com.microsoft.identity.common.logging.Logger.warn(strOooO0OO, "Unable to get account id from either ClientInfo or IdToken. Attempting to obtain from home account id.");
            uIdFromHomeAccountId = com.microsoft.identity.common.java.util.StringUtil.getUIdFromHomeAccountId(this.mHomeAccountId);
        }
        if (!StringUtil.isEmpty(uIdFromHomeAccountId)) {
            return uIdFromHomeAccountId;
        }
        com.microsoft.identity.common.logging.Logger.warn(strOooO0OO, "Account ID is empty. Returning MISSING_FROM_THE_TOKEN_RESPONSE.");
        return SchemaUtil.MISSING_FROM_THE_TOKEN_RESPONSE;
    }

    @Override // com.microsoft.identity.client.IClaimable
    public String getIdToken() {
        return this.mRawIdToken;
    }

    @Override // com.microsoft.identity.client.IClaimable
    public String getTenantId() {
        return this.mHomeTenantId;
    }

    @Override // com.microsoft.identity.client.IClaimable
    public String getUsername() {
        return getClaims() != null ? SchemaUtil.getDisplayableId(getClaims()) : SchemaUtil.MISSING_FROM_THE_TOKEN_RESPONSE;
    }

    public void setEnvironment(String str) {
        this.mEnvironment = str;
    }

    public void setHomeAccountId(String str) {
        this.mHomeAccountId = str;
    }

    public void setId(String str) {
        this.mHomeOid = str;
    }

    public void setTenantId(String str) {
        this.mHomeTenantId = str;
    }
}
