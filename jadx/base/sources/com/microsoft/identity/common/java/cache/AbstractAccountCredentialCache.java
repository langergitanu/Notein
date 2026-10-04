package com.microsoft.identity.common.java.cache;

import com.microsoft.identity.common.java.AuthenticationConstants;
import com.microsoft.identity.common.java.authscheme.PopAuthenticationSchemeInternal;
import com.microsoft.identity.common.java.authscheme.PopAuthenticationSchemeWithClientKeyInternal;
import com.microsoft.identity.common.java.dto.AccessTokenRecord;
import com.microsoft.identity.common.java.dto.AccountRecord;
import com.microsoft.identity.common.java.dto.Credential;
import com.microsoft.identity.common.java.dto.CredentialType;
import com.microsoft.identity.common.java.dto.IdTokenRecord;
import com.microsoft.identity.common.java.dto.PrimaryRefreshTokenRecord;
import com.microsoft.identity.common.java.dto.RefreshTokenRecord;
import com.microsoft.identity.common.java.interfaces.INameValueStorage;
import com.microsoft.identity.common.java.logging.Logger;
import com.microsoft.identity.common.java.providers.oauth2.TokenRequest;
import com.microsoft.identity.common.java.util.StringUtil;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractAccountCredentialCache implements IAccountCredentialCache {
    private static final String NEW_LINE = "\n";
    private static final String TAG = "AbstractAccountCredentialCache";
    protected final INameValueStorage<String> mSharedPreferencesFileManager;

    /* JADX INFO: renamed from: com.microsoft.identity.common.java.cache.AbstractAccountCredentialCache$1 */
    public static /* synthetic */ class C186751 {
        static final /* synthetic */ int[] $SwitchMap$com$microsoft$identity$common$java$dto$CredentialType;

        static {
            int[] iArr = new int[CredentialType.values().length];
            $SwitchMap$com$microsoft$identity$common$java$dto$CredentialType = iArr;
            try {
                iArr[CredentialType.AccessToken.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$microsoft$identity$common$java$dto$CredentialType[CredentialType.AccessToken_With_AuthScheme.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$microsoft$identity$common$java$dto$CredentialType[CredentialType.RefreshToken.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$microsoft$identity$common$java$dto$CredentialType[CredentialType.IdToken.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$microsoft$identity$common$java$dto$CredentialType[CredentialType.V1IdToken.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$microsoft$identity$common$java$dto$CredentialType[CredentialType.PrimaryRefreshToken.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public AbstractAccountCredentialCache(INameValueStorage<String> iNameValueStorage) {
        if (iNameValueStorage == null) {
            throw new NullPointerException("sharedPreferencesFileManager is marked non-null but is null");
        }
        this.mSharedPreferencesFileManager = iNameValueStorage;
    }

    public static boolean targetsIntersect(String str, String str2, boolean z) {
        if (str == null) {
            throw new NullPointerException("targetToMatch is marked non-null but is null");
        }
        if (str2 == null) {
            throw new NullPointerException("credentialTarget is marked non-null but is null");
        }
        String[] strArrSplit = str.trim().split("\\s+");
        String[] strArrSplit2 = str2.trim().split("\\s+");
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (String str3 : strArrSplit) {
            hashSet.add(str3.toLowerCase(Locale.ROOT));
        }
        for (String str4 : strArrSplit2) {
            hashSet2.add(str4.toLowerCase(Locale.ROOT));
        }
        if (z) {
            Set<String> set = AuthenticationConstants.DEFAULT_SCOPES;
            hashSet.removeAll(set);
            hashSet2.removeAll(set);
        }
        return hashSet2.containsAll(hashSet);
    }

    public List<AccountRecord> getAccountsFilteredByInternal(String str, String str2, String str3, List<AccountRecord> list) {
        if (list == null) {
            throw new NullPointerException("allAccounts is marked non-null but is null");
        }
        boolean zIsNullOrEmpty = StringUtil.isNullOrEmpty(str);
        boolean zIsNullOrEmpty2 = StringUtil.isNullOrEmpty(str2);
        boolean zIsNullOrEmpty3 = StringUtil.isNullOrEmpty(str3);
        String str4 = TAG;
        StringBuilder sb = new StringBuilder("Account lookup filtered by home_account_id? [");
        sb.append(!zIsNullOrEmpty);
        sb.append("]\nAccount lookup filtered by realm? [");
        sb.append(!zIsNullOrEmpty3);
        sb.append("]");
        Logger.verbose(str4, sb.toString());
        ArrayList arrayList = new ArrayList();
        for (AccountRecord accountRecord : list) {
            boolean zEqualsIgnoreCaseTrimBoth = !zIsNullOrEmpty ? StringUtil.equalsIgnoreCaseTrimBoth(str, accountRecord.getHomeAccountId()) : true;
            if (!zIsNullOrEmpty2) {
                zEqualsIgnoreCaseTrimBoth = zEqualsIgnoreCaseTrimBoth && StringUtil.equalsIgnoreCaseTrimBoth(str2, accountRecord.getEnvironment());
            }
            if (!zIsNullOrEmpty3) {
                zEqualsIgnoreCaseTrimBoth = zEqualsIgnoreCaseTrimBoth && StringUtil.equalsIgnoreCaseTrimBoth(str3, accountRecord.getRealm());
            }
            if (zEqualsIgnoreCaseTrimBoth) {
                arrayList.add(accountRecord);
            }
        }
        Logger.verbose(TAG, "Found [" + arrayList.size() + "] matching accounts");
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0275 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<Credential> getCredentialsFilteredByInternal(List<Credential> list, String str, String str2, CredentialType credentialType, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        boolean z;
        boolean z2;
        Iterator<Credential> it;
        Iterator<Credential> it2;
        String accessTokenType;
        String str11 = str6;
        if (list == null) {
            throw new NullPointerException("allCredentials is marked non-null but is null");
        }
        boolean zIsNullOrEmpty = StringUtil.isNullOrEmpty(str2);
        boolean zIsNullOrEmpty2 = StringUtil.isNullOrEmpty(str);
        boolean z3 = !zIsNullOrEmpty2;
        boolean zIsNullOrEmpty3 = StringUtil.isNullOrEmpty(str11);
        boolean z4 = !zIsNullOrEmpty3;
        boolean zIsNullOrEmpty4 = StringUtil.isNullOrEmpty(str7);
        boolean z5 = !zIsNullOrEmpty4;
        boolean zIsNullOrEmpty5 = StringUtil.isNullOrEmpty(str3);
        boolean z6 = !zIsNullOrEmpty5;
        boolean zIsNullOrEmpty6 = StringUtil.isNullOrEmpty(str4);
        boolean z7 = !zIsNullOrEmpty6;
        boolean zIsNullOrEmpty7 = StringUtil.isNullOrEmpty(str5);
        boolean z8 = !zIsNullOrEmpty7;
        boolean z9 = credentialType != null;
        if (z9 && !StringUtil.isNullOrEmpty(str8)) {
            z = zIsNullOrEmpty3;
            if (credentialType == CredentialType.AccessToken_With_AuthScheme) {
                z2 = true;
            }
            boolean zIsNullOrEmpty8 = StringUtil.isNullOrEmpty(str10);
            boolean zIsNullOrEmpty9 = StringUtil.isNullOrEmpty(str9);
            String str12 = TAG;
            StringBuilder sb = new StringBuilder("Credential lookup filtered by home_account_id? [");
            sb.append(z3);
            sb.append("]\nCredential lookup filtered by realm? [");
            sb.append(z4);
            sb.append("]\nCredential lookup filtered by target? [");
            sb.append(z5);
            sb.append("]\nCredential lookup filtered by clientId? [");
            sb.append(z6);
            sb.append("]\nCredential lookup filtered by applicationIdentifier? [");
            sb.append(z7);
            sb.append("]\nCredential lookup filtered by mamEnrollmentIdentifier? [");
            sb.append(z8);
            sb.append("]\nCredential lookup filtered by credential type? [");
            sb.append(z9);
            sb.append("]\nCredential lookup filtered by auth scheme? [");
            sb.append(z2);
            sb.append("]\nCredential lookup filtered by requested claims? [");
            sb.append(!zIsNullOrEmpty9);
            sb.append("]");
            Logger.verbose(str12, sb.toString());
            ArrayList arrayList = new ArrayList();
            it = list.iterator();
            while (it.hasNext()) {
                Credential next = it.next();
                boolean zEqualsIgnoreCaseTrimBoth = !zIsNullOrEmpty2 ? StringUtil.equalsIgnoreCaseTrimBoth(str, next.getHomeAccountId()) : true;
                if (!zIsNullOrEmpty) {
                    zEqualsIgnoreCaseTrimBoth = zEqualsIgnoreCaseTrimBoth && StringUtil.equalsIgnoreCaseTrimBoth(str2, next.getEnvironment());
                }
                if (z9) {
                    zEqualsIgnoreCaseTrimBoth = zEqualsIgnoreCaseTrimBoth && StringUtil.equalsIgnoreCaseTrimBoth(credentialType.name(), next.getCredentialType());
                }
                if (!zIsNullOrEmpty5) {
                    zEqualsIgnoreCaseTrimBoth = zEqualsIgnoreCaseTrimBoth && StringUtil.equalsIgnoreCaseTrimBoth(str3, next.getClientId());
                }
                if (!zIsNullOrEmpty6) {
                    if (next instanceof AccessTokenRecord) {
                        zEqualsIgnoreCaseTrimBoth = zEqualsIgnoreCaseTrimBoth && StringUtil.equalsIgnoreCaseTrimBoth(str4, ((AccessTokenRecord) next).getApplicationIdentifier());
                    } else {
                        Logger.verbose(TAG, "Query specified applicationIdentifier match, but credential type does not have application identifier");
                    }
                }
                if (!zIsNullOrEmpty7) {
                    if (next instanceof AccessTokenRecord) {
                        zEqualsIgnoreCaseTrimBoth = zEqualsIgnoreCaseTrimBoth && StringUtil.equalsIgnoreCaseTrimBoth(str5, ((AccessTokenRecord) next).getMamEnrollmentIdentifier());
                    } else {
                        it2 = it;
                        Logger.verbose(TAG, "Query specified mamEnrollmentIdentifier match, but credential type does not have MAM enrollment identifier");
                        if (!z && (next instanceof AccessTokenRecord)) {
                            zEqualsIgnoreCaseTrimBoth = !zEqualsIgnoreCaseTrimBoth && StringUtil.equalsIgnoreCaseTrimBoth(str11, ((AccessTokenRecord) next).getRealm());
                        }
                        if (!z && (next instanceof IdTokenRecord)) {
                            zEqualsIgnoreCaseTrimBoth = !zEqualsIgnoreCaseTrimBoth && StringUtil.equalsIgnoreCaseTrimBoth(str11, ((IdTokenRecord) next).getRealm());
                        }
                        if (!zIsNullOrEmpty4) {
                            if (next instanceof AccessTokenRecord) {
                                zEqualsIgnoreCaseTrimBoth = zEqualsIgnoreCaseTrimBoth && targetsIntersect(str7, ((AccessTokenRecord) next).getTarget(), true);
                            } else if (next instanceof RefreshTokenRecord) {
                                RefreshTokenRecord refreshTokenRecord = (RefreshTokenRecord) next;
                                if (zEqualsIgnoreCaseTrimBoth && targetsIntersect(str7, refreshTokenRecord.getTarget(), true)) {
                                    zEqualsIgnoreCaseTrimBoth = true;
                                }
                            } else {
                                Logger.verbose(TAG, "Query specified target-match, but no target to match.");
                            }
                        }
                        if (z2 && (next instanceof AccessTokenRecord)) {
                            accessTokenType = ((AccessTokenRecord) next).getAccessTokenType();
                            if (accessTokenType != null) {
                                accessTokenType = accessTokenType.trim();
                            }
                            zEqualsIgnoreCaseTrimBoth = TokenRequest.TokenType.POP.equalsIgnoreCase(accessTokenType) ? zEqualsIgnoreCaseTrimBoth && str8.equalsIgnoreCase(accessTokenType) : zEqualsIgnoreCaseTrimBoth && (str8.equalsIgnoreCase(PopAuthenticationSchemeWithClientKeyInternal.SCHEME_POP_WITH_CLIENT_KEY) || str8.equalsIgnoreCase(PopAuthenticationSchemeInternal.SCHEME_POP));
                        }
                        if (zIsNullOrEmpty8 && (next instanceof AccessTokenRecord)) {
                            zEqualsIgnoreCaseTrimBoth = zEqualsIgnoreCaseTrimBoth && str10.equalsIgnoreCase(((AccessTokenRecord) next).getKid());
                        }
                        if (!zIsNullOrEmpty9) {
                            if (next instanceof AccessTokenRecord) {
                                zEqualsIgnoreCaseTrimBoth = zEqualsIgnoreCaseTrimBoth && StringUtil.equalsIgnoreCaseTrimBoth(str9, ((AccessTokenRecord) next).getRequestedClaims());
                            } else {
                                Logger.verbose(TAG, "Query specified requested_claims-match, but attempted to match with non-AT credential type.");
                            }
                        }
                        if (!zEqualsIgnoreCaseTrimBoth) {
                            arrayList.add(next);
                        }
                        it = it2;
                        str11 = str6;
                    }
                }
                it2 = it;
                if (!z) {
                    if (zEqualsIgnoreCaseTrimBoth) {
                        zEqualsIgnoreCaseTrimBoth = !zEqualsIgnoreCaseTrimBoth && StringUtil.equalsIgnoreCaseTrimBoth(str11, ((AccessTokenRecord) next).getRealm());
                    }
                }
                if (!z) {
                    if (zEqualsIgnoreCaseTrimBoth) {
                        zEqualsIgnoreCaseTrimBoth = !zEqualsIgnoreCaseTrimBoth && StringUtil.equalsIgnoreCaseTrimBoth(str11, ((IdTokenRecord) next).getRealm());
                    }
                }
                if (!zIsNullOrEmpty4) {
                }
                if (z2) {
                    accessTokenType = ((AccessTokenRecord) next).getAccessTokenType();
                    if (accessTokenType != null) {
                    }
                    if (TokenRequest.TokenType.POP.equalsIgnoreCase(accessTokenType)) {
                    }
                }
                if (zIsNullOrEmpty8) {
                }
                if (!zIsNullOrEmpty9) {
                }
                if (!zEqualsIgnoreCaseTrimBoth) {
                }
                it = it2;
                str11 = str6;
            }
            return arrayList;
        }
        z = zIsNullOrEmpty3;
        z2 = false;
        boolean zIsNullOrEmpty82 = StringUtil.isNullOrEmpty(str10);
        boolean zIsNullOrEmpty92 = StringUtil.isNullOrEmpty(str9);
        String str122 = TAG;
        StringBuilder sb2 = new StringBuilder("Credential lookup filtered by home_account_id? [");
        sb2.append(z3);
        sb2.append("]\nCredential lookup filtered by realm? [");
        sb2.append(z4);
        sb2.append("]\nCredential lookup filtered by target? [");
        sb2.append(z5);
        sb2.append("]\nCredential lookup filtered by clientId? [");
        sb2.append(z6);
        sb2.append("]\nCredential lookup filtered by applicationIdentifier? [");
        sb2.append(z7);
        sb2.append("]\nCredential lookup filtered by mamEnrollmentIdentifier? [");
        sb2.append(z8);
        sb2.append("]\nCredential lookup filtered by credential type? [");
        sb2.append(z9);
        sb2.append("]\nCredential lookup filtered by auth scheme? [");
        sb2.append(z2);
        sb2.append("]\nCredential lookup filtered by requested claims? [");
        sb2.append(!zIsNullOrEmpty92);
        sb2.append("]");
        Logger.verbose(str122, sb2.toString());
        ArrayList arrayList2 = new ArrayList();
        it = list.iterator();
        while (it.hasNext()) {
        }
        return arrayList2;
    }

    public Class<? extends Credential> getTargetClassForCredentialType(String str, CredentialType credentialType) {
        if (credentialType == null) {
            throw new NullPointerException("targetType is marked non-null but is null");
        }
        switch (C186751.$SwitchMap$com$microsoft$identity$common$java$dto$CredentialType[credentialType.ordinal()]) {
            case 1:
            case 2:
                return AccessTokenRecord.class;
            case 3:
                return RefreshTokenRecord.class;
            case 4:
            case 5:
                return IdTokenRecord.class;
            case 6:
                return PrimaryRefreshTokenRecord.class;
            default:
                String str2 = TAG;
                Logger.warn(str2, "Could not match CredentialType to class. Did you forget to update this method with a new type?");
                if (str != null) {
                    Logger.warnPII(str2, "Sought key was: [" + str + "]");
                }
                return null;
        }
    }
}
