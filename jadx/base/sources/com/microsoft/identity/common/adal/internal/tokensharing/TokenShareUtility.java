package com.microsoft.identity.common.adal.internal.tokensharing;

import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.adal.internal.cache.ADALTokenCacheItem;
import com.microsoft.identity.common.adal.tokensharing.SSOStateSerializer;
import com.microsoft.identity.common.internal.migration.AdalMigrationAdapter;
import com.microsoft.identity.common.internal.migration.TokenCacheItemMigrationAdapter;
import com.microsoft.identity.common.java.authscheme.BearerAuthenticationSchemeInternal;
import com.microsoft.identity.common.java.cache.ICacheRecord;
import com.microsoft.identity.common.java.cache.MsalOAuth2TokenCache;
import com.microsoft.identity.common.java.dto.AccountRecord;
import com.microsoft.identity.common.java.dto.IdTokenRecord;
import com.microsoft.identity.common.java.dto.RefreshTokenRecord;
import com.microsoft.identity.common.java.exception.BaseException;
import com.microsoft.identity.common.java.exception.ClientException;
import com.microsoft.identity.common.java.exception.ServiceException;
import com.microsoft.identity.common.java.providers.microsoft.MicrosoftAccount;
import com.microsoft.identity.common.java.providers.microsoft.MicrosoftRefreshToken;
import com.microsoft.identity.common.java.providers.oauth2.IDToken;
import com.microsoft.identity.common.logging.Logger;
import com.nimbusds.jose.JOSEObjectType;
import com.nimbusds.jose.PlainHeader;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.PlainJWT;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes9.dex */
public class TokenShareUtility implements ITokenShareInternal {
    private static final String CONSUMERS_ENDPOINT = "https://login.microsoftonline.com/consumers";
    private static final String TAG = "TokenShareUtility";
    private static final Map<String, String> sClaimRemapper = new HashMap();
    private final String mClientId;
    private final String mRedirectUri;
    private final MsalOAuth2TokenCache mTokenCache;

    public enum Environment {
        WORLDWIDE("https://login.windows.net/common"),
        GALLATIN("https://login.partner.microsoftonline.cn/common"),
        BLACKFOREST("https://login.microsoftonline.de/common"),
        ITAR("https://login.microsoftonline.us/common");

        private String mCommonEndpoint;

        Environment(String str) {
            this.mCommonEndpoint = str;
        }

        public static Environment toEnvironment(String str) throws ClientException {
            String str2;
            str2 = TokenShareUtility.TAG + ":toEnvironment";
            str.getClass();
            switch (str) {
                case "login.partner.microsoftonline.cn":
                case "login.chinacloudapi.cn":
                    return GALLATIN;
                case "login.microsoftonline.de":
                    return BLACKFOREST;
                case "login.microsoftonline.us":
                case "login.usgovcloudapi.net":
                    return ITAR;
                case "sts.windows.net":
                case "login.microsoft.com":
                case "login.windows.net":
                case "login.microsoftonline.com":
                    return WORLDWIDE;
                default:
                    Logger.warn(str2, "Unable to map provided env to enum: ".concat(str));
                    throw new ClientException("Unrecognized environment");
            }
        }

        public String getCommonEndpoint() {
            return this.mCommonEndpoint;
        }
    }

    static {
        applyV1ToV2Mappings();
    }

    public TokenShareUtility(String str, String str2, MsalOAuth2TokenCache msalOAuth2TokenCache) {
        this.mClientId = str;
        this.mRedirectUri = str2;
        this.mTokenCache = msalOAuth2TokenCache;
    }

    private static ADALTokenCacheItem adapt(IdTokenRecord idTokenRecord, RefreshTokenRecord refreshTokenRecord) throws BaseException {
        ADALTokenCacheItem aDALTokenCacheItem = new ADALTokenCacheItem();
        aDALTokenCacheItem.setClientId(refreshTokenRecord.getClientId());
        aDALTokenCacheItem.setRefreshToken(refreshTokenRecord.getSecret());
        aDALTokenCacheItem.setRawIdToken(mintV1IdTokenFromRawV2IdToken(idTokenRecord.getSecret()));
        aDALTokenCacheItem.setFamilyClientId(refreshTokenRecord.getFamilyId());
        aDALTokenCacheItem.setAuthority(isFromHomeTenant(idTokenRecord) ? Environment.toEnvironment(refreshTokenRecord.getEnvironment()).getCommonEndpoint() : idTokenRecord.getAuthority());
        return aDALTokenCacheItem;
    }

    private static void applyV1ToV2Mappings() {
        sClaimRemapper.put("preferred_username", "upn");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ADALTokenCacheItem createTokenCacheItem(String str, String str2) {
        ADALTokenCacheItem aDALTokenCacheItem = new ADALTokenCacheItem();
        aDALTokenCacheItem.setAuthority(str2);
        aDALTokenCacheItem.setClientId(this.mClientId);
        aDALTokenCacheItem.setRefreshToken(str);
        return aDALTokenCacheItem;
    }

    private AccountRecord getAccountRecordForIdentifier(String str) throws ClientException {
        AccountRecord accountByLocalAccountId = this.mTokenCache.getAccountByLocalAccountId(null, this.mClientId, str);
        if (accountByLocalAccountId == null) {
            List<AccountRecord> accountsByUsername = this.mTokenCache.getAccountsByUsername(null, this.mClientId, str);
            if (!accountsByUsername.isEmpty()) {
                accountByLocalAccountId = accountsByUsername.get(0);
            }
        }
        if (accountByLocalAccountId != null) {
            return accountByLocalAccountId;
        }
        throw new ClientException(ClientException.TOKEN_CACHE_ITEM_NOT_FOUND);
    }

    private ICacheRecord getCacheRecordForIdentifier(String str) throws ClientException {
        return this.mTokenCache.load(this.mClientId, null, null, null, getAccountRecordForIdentifier(str), new BearerAuthenticationSchemeInternal());
    }

    private static boolean isFromHomeTenant(IdTokenRecord idTokenRecord) {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":isFromHomeTenant");
        String homeAccountId = idTokenRecord.getHomeAccountId();
        try {
            String str = (String) IDToken.parseJWT(idTokenRecord.getSecret()).get("oid");
            if (str != null) {
                return homeAccountId.contains(str);
            }
            Logger.warn(strOooO0OO, "OID claims was missing from token.");
            return false;
        } catch (ServiceException unused) {
            Logger.warn(strOooO0OO, "Failed to parse IdToken.");
            return false;
        }
    }

    private static String mintV1IdTokenFromRawV2IdToken(String str) throws ServiceException {
        Map<String, ?> jwt = IDToken.parseJWT(str);
        JWTClaimsSet.Builder builder = new JWTClaimsSet.Builder();
        for (Map.Entry<String, ?> entry : jwt.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if ("ver".equals(key)) {
                value = "1";
            }
            builder.claim(remap(key), value);
        }
        return new PlainJWT(new PlainHeader(JOSEObjectType.JWT, null, null, null, null), builder.build()).serialize();
    }

    private static String remap(String str) {
        String str2 = sClaimRemapper.get(str);
        return str2 == null ? str : str2;
    }

    private void saveResult(Map.Entry<MicrosoftAccount, MicrosoftRefreshToken> entry) throws ClientException {
        if (entry != null) {
            this.mTokenCache.setSingleSignOnState(entry.getKey(), entry.getValue());
        }
    }

    private void throwIfCacheRecordIncomplete(String str, ICacheRecord iCacheRecord) throws ClientException {
        if (iCacheRecord.getRefreshToken() == null || iCacheRecord.getIdToken() == null) {
            Logger.warn(OooO00o.OooO0OO(new StringBuilder(), TAG, ":throwIfCacheRecordIncomplete"), "That's strange, we had an AccountRecord for identifier: " + str + " but couldn't find tokens for them.");
            throw new ClientException(ClientException.TOKEN_CACHE_ITEM_NOT_FOUND);
        }
    }

    @Override // com.microsoft.identity.common.adal.internal.tokensharing.ITokenShareInternal
    public String getMsaFamilyRefreshToken(String str) throws Exception {
        return getMsaFamilyRefreshTokenWithMetadata(str).getRefreshToken();
    }

    @Override // com.microsoft.identity.common.adal.internal.tokensharing.ITokenShareInternal
    public ITokenShareResultInternal getMsaFamilyRefreshTokenWithMetadata(String str) throws Exception {
        ICacheRecord cacheRecordForIdentifier = getCacheRecordForIdentifier(str);
        throwIfCacheRecordIncomplete(str, cacheRecordForIdentifier);
        return new TokenShareResultInternal(cacheRecordForIdentifier, cacheRecordForIdentifier.getRefreshToken().getSecret(), "RAW");
    }

    @Override // com.microsoft.identity.common.adal.internal.tokensharing.ITokenShareInternal
    public String getOrgIdFamilyRefreshToken(String str) throws BaseException {
        return getOrgIdFamilyRefreshTokenWithMetadata(str).getRefreshToken();
    }

    @Override // com.microsoft.identity.common.adal.internal.tokensharing.ITokenShareInternal
    public ITokenShareResultInternal getOrgIdFamilyRefreshTokenWithMetadata(String str) throws BaseException {
        ICacheRecord cacheRecordForIdentifier = getCacheRecordForIdentifier(str);
        throwIfCacheRecordIncomplete(str, cacheRecordForIdentifier);
        return new TokenShareResultInternal(cacheRecordForIdentifier, SSOStateSerializer.serialize(adapt(cacheRecordForIdentifier.getIdToken(), cacheRecordForIdentifier.getRefreshToken())), "SSO_STATE_SERIALIZER_BLOB");
    }

    @Override // com.microsoft.identity.common.adal.internal.tokensharing.ITokenShareInternal
    public void saveMsaFamilyRefreshToken(final String str) throws Exception {
        final String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":saveMsaFamilyRefreshToken");
        saveResult((Map.Entry) TokenCacheItemMigrationAdapter.sBackgroundExecutor.submit(new Callable<Map.Entry<MicrosoftAccount, MicrosoftRefreshToken>>() { // from class: com.microsoft.identity.common.adal.internal.tokensharing.TokenShareUtility.2
            @Override // java.util.concurrent.Callable
            public Map.Entry<MicrosoftAccount, MicrosoftRefreshToken> call() throws ClientException {
                ADALTokenCacheItem aDALTokenCacheItemCreateTokenCacheItem = TokenShareUtility.this.createTokenCacheItem(str, TokenShareUtility.CONSUMERS_ENDPOINT);
                if (AdalMigrationAdapter.loadCloudDiscoveryMetadata()) {
                    return TokenCacheItemMigrationAdapter.renewToken(TokenShareUtility.this.mRedirectUri, aDALTokenCacheItemCreateTokenCacheItem);
                }
                Logger.warn(strOooO0OO, "Failed to load cloud metadata, aborting.");
                return null;
            }
        }).get());
    }

    @Override // com.microsoft.identity.common.adal.internal.tokensharing.ITokenShareInternal
    public void saveOrgIdFamilyRefreshToken(final String str) throws Exception {
        final String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":saveOrgIdFamilyRefreshToken");
        saveResult((Map.Entry) TokenCacheItemMigrationAdapter.sBackgroundExecutor.submit(new Callable<Map.Entry<MicrosoftAccount, MicrosoftRefreshToken>>() { // from class: com.microsoft.identity.common.adal.internal.tokensharing.TokenShareUtility.1
            @Override // java.util.concurrent.Callable
            public Map.Entry<MicrosoftAccount, MicrosoftRefreshToken> call() throws ClientException {
                ADALTokenCacheItem aDALTokenCacheItemDeserialize = SSOStateSerializer.deserialize(str);
                aDALTokenCacheItemDeserialize.setClientId(TokenShareUtility.this.mClientId);
                aDALTokenCacheItemDeserialize.setResource(null);
                if (AdalMigrationAdapter.loadCloudDiscoveryMetadata()) {
                    return TokenCacheItemMigrationAdapter.renewToken(TokenShareUtility.this.mRedirectUri, aDALTokenCacheItemDeserialize);
                }
                Logger.warn(strOooO0OO, "Failed to load cloud metadata, aborting.");
                return null;
            }
        }).get());
    }
}
