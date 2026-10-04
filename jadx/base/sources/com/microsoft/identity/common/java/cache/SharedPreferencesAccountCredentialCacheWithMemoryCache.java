package com.microsoft.identity.common.java.cache;

import com.aspose.slides.internal.p332p7.OooOO0;
import com.microsoft.identity.common.java.dto.AccessTokenRecord;
import com.microsoft.identity.common.java.dto.AccountRecord;
import com.microsoft.identity.common.java.dto.Credential;
import com.microsoft.identity.common.java.dto.CredentialType;
import com.microsoft.identity.common.java.dto.IdTokenRecord;
import com.microsoft.identity.common.java.dto.RefreshTokenRecord;
import com.microsoft.identity.common.java.interfaces.INameValueStorage;
import com.microsoft.identity.common.java.logging.Logger;
import com.microsoft.identity.common.java.util.StringUtil;
import com.microsoft.identity.common.java.util.ported.Predicate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class SharedPreferencesAccountCredentialCacheWithMemoryCache extends AbstractAccountCredentialCache {
    private static final String TAG = "SharedPreferencesAccountCredentialCacheWithMemoryCache";
    private final Object mCacheLock;
    private final ICacheKeyValueDelegate mCacheValueDelegate;
    private Map<String, AccountRecord> mCachedAccountRecordsWithKeys;
    private Map<String, Credential> mCachedCredentialsWithKeys;
    private boolean mLoaded;

    public SharedPreferencesAccountCredentialCacheWithMemoryCache(ICacheKeyValueDelegate iCacheKeyValueDelegate, INameValueStorage<String> iNameValueStorage) {
        super(iNameValueStorage);
        this.mCacheLock = new Object();
        this.mLoaded = false;
        this.mCachedAccountRecordsWithKeys = new HashMap();
        this.mCachedCredentialsWithKeys = new HashMap();
        if (iCacheKeyValueDelegate == null) {
            throw new NullPointerException("accountCacheValueDelegate is marked non-null but is null");
        }
        if (iNameValueStorage == null) {
            throw new NullPointerException("sharedPreferencesFileManager is marked non-null but is null");
        }
        String str = TAG;
        Logger.verbose(str, "Init: " + str);
        this.mCacheValueDelegate = iCacheKeyValueDelegate;
        new Thread(new OooO00o(this, 0)).start();
    }

    private Class<? extends Credential> credentialClassForType(String str) {
        if (str == null) {
            throw new NullPointerException("cacheKey is marked non-null but is null");
        }
        String strOooO0O0 = OooOO0.OooO0O0(new StringBuilder(), TAG, ":credentialClassForType", "Resolving class for key/CredentialType...");
        Logger.verbosePII(strOooO0O0, "Supplied key: [" + str + "]");
        CredentialType credentialTypeForCredentialCacheKey = getCredentialTypeForCredentialCacheKey(str);
        if (credentialTypeForCredentialCacheKey == null) {
            return null;
        }
        Logger.verbose(strOooO0O0, "CredentialType matched: [" + credentialTypeForCredentialCacheKey + "]");
        return getTargetClassForCredentialType(str, credentialTypeForCredentialCacheKey);
    }

    public static CredentialType getCredentialTypeForCredentialCacheKey(String str) {
        CredentialType credentialType;
        if (str == null) {
            throw new NullPointerException("cacheKey is marked non-null but is null");
        }
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, ":getCredentialTypeForCredentialCacheKey");
        if (StringUtil.isNullOrEmpty(str)) {
            throw new IllegalArgumentException("Param [cacheKey] cannot be null.");
        }
        Logger.verbosePII(strOooO0OO, "Evaluating cache key for CredentialType [" + str + "]");
        HashSet hashSet = new HashSet();
        Iterator<String> it = CredentialType.valueSet().iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().toLowerCase(Locale.US));
        }
        Iterator it2 = hashSet.iterator();
        while (true) {
            if (!it2.hasNext()) {
                credentialType = null;
                break;
            }
            String str2 = (String) it2.next();
            if (str.contains(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR + str2 + CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR)) {
                Logger.verbose(strOooO0OO, "Cache key is a Credential type...");
                credentialType = CredentialType.AccessToken;
                if (credentialType.name().equalsIgnoreCase(str2)) {
                    break;
                }
                credentialType = CredentialType.AccessToken_With_AuthScheme;
                if (credentialType.name().equalsIgnoreCase(str2)) {
                    break;
                }
                credentialType = CredentialType.RefreshToken;
                if (credentialType.name().equalsIgnoreCase(str2)) {
                    break;
                }
                credentialType = CredentialType.IdToken;
                if (credentialType.name().equalsIgnoreCase(str2)) {
                    break;
                }
                credentialType = CredentialType.V1IdToken;
                if (credentialType.name().equalsIgnoreCase(str2)) {
                    break;
                }
                credentialType = CredentialType.PrimaryRefreshToken;
                if (credentialType.name().equalsIgnoreCase(str2)) {
                    break;
                }
                Logger.warn(strOooO0OO, "Unexpected credential type.");
            }
        }
        Logger.verbose(strOooO0OO, "Cache key was type: [" + credentialType + "]");
        return credentialType;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isAccount(String str) {
        if (str == null) {
            throw new NullPointerException("cacheKey is marked non-null but is null");
        }
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, ":isAccount");
        Logger.verbosePII(strOooO0OO, "Evaluating cache key: [" + str + "]");
        boolean z = getCredentialTypeForCredentialCacheKey(str) == null;
        Logger.verbose(strOooO0OO, "isAccount? [" + z + "]");
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isCredential(String str) {
        if (str == null) {
            throw new NullPointerException("cacheKey is marked non-null but is null");
        }
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, ":isCredential");
        Logger.verbosePII(strOooO0OO, "Evaluating cache key: [" + str + "]");
        boolean z = getCredentialTypeForCredentialCacheKey(str) != null;
        Logger.verbose(strOooO0OO, "isCredential? [" + z + "]");
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: load, reason: merged with bridge method [inline-methods] */
    public void lambda$new$0() {
        Object obj;
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, ":load");
        synchronized (this.mCacheLock) {
            try {
                this.mCachedAccountRecordsWithKeys = loadAccountsWithKeys();
                Logger.info(strOooO0OO, "Loaded " + this.mCachedAccountRecordsWithKeys.size() + " AccountRecords");
                this.mCachedCredentialsWithKeys = loadCredentialsWithKeys();
                Logger.info(strOooO0OO, "Loaded " + this.mCachedCredentialsWithKeys.size() + " Credentials");
                this.mLoaded = true;
                obj = this.mCacheLock;
            } catch (Throwable th) {
                try {
                    Logger.error(strOooO0OO, "Failed to load initial accounts or credentials from SharedPreferences", th);
                    this.mLoaded = true;
                    obj = this.mCacheLock;
                } catch (Throwable th2) {
                    this.mLoaded = true;
                    this.mCacheLock.notifyAll();
                    throw th2;
                }
            }
            obj.notifyAll();
        }
    }

    private Map<String, AccountRecord> loadAccountsWithKeys() {
        String strOooO0O0 = OooOO0.OooO0O0(new StringBuilder(), TAG, ":loadAccountsWithKeys", "Loading Accounts + keys...");
        Iterator<Map.Entry<String, String>> allFilteredByKey = this.mSharedPreferencesFileManager.getAllFilteredByKey(new Predicate<String>() { // from class: com.microsoft.identity.common.java.cache.SharedPreferencesAccountCredentialCacheWithMemoryCache.1
            @Override // com.microsoft.identity.common.java.util.ported.Predicate
            public boolean test(String str) {
                return SharedPreferencesAccountCredentialCacheWithMemoryCache.isAccount(str);
            }
        });
        HashMap map = new HashMap();
        if (allFilteredByKey != null) {
            while (allFilteredByKey.hasNext()) {
                Map.Entry<String, String> next = allFilteredByKey.next();
                String key = next.getKey();
                AccountRecord accountRecord = (AccountRecord) this.mCacheValueDelegate.fromCacheValue(next.getValue().toString(), AccountRecord.class);
                if (accountRecord == null) {
                    Logger.warn(strOooO0O0, SharedPreferencesAccountCredentialCache.ACCOUNT_RECORD_DESERIALIZATION_FAILED);
                } else if (SharedPreferencesAccountCredentialCache.EMPTY_ACCOUNT.equals(accountRecord)) {
                    Logger.warn(strOooO0O0, "The returned Account was uninitialized. Removing...");
                    this.mSharedPreferencesFileManager.remove(key);
                } else {
                    map.put(key, accountRecord);
                }
            }
        }
        Logger.verbose(strOooO0O0, "Returning [" + map.size() + "] Accounts w/ keys...");
        return map;
    }

    private Map<String, Credential> loadCredentialsWithKeys() {
        String strOooO0O0 = OooOO0.OooO0O0(new StringBuilder(), TAG, ":getCredentialsWithKeys", "Loading Credentials with keys...");
        HashMap map = new HashMap();
        Iterator<Map.Entry<String, String>> allFilteredByKey = this.mSharedPreferencesFileManager.getAllFilteredByKey(new Predicate<String>() { // from class: com.microsoft.identity.common.java.cache.SharedPreferencesAccountCredentialCacheWithMemoryCache.2
            @Override // com.microsoft.identity.common.java.util.ported.Predicate
            public boolean test(String str) {
                return SharedPreferencesAccountCredentialCacheWithMemoryCache.isCredential(str);
            }
        });
        while (allFilteredByKey.hasNext()) {
            Map.Entry<String, String> next = allFilteredByKey.next();
            String key = next.getKey();
            Class<? extends Credential> clsCredentialClassForType = credentialClassForType(key);
            Credential credential = (Credential) this.mCacheValueDelegate.fromCacheValue(next.getValue().toString(), clsCredentialClassForType);
            if (credential == null) {
                Logger.warn(strOooO0O0, SharedPreferencesAccountCredentialCache.CREDENTIAL_DESERIALIZATION_FAILED);
            } else if ((AccessTokenRecord.class == clsCredentialClassForType && SharedPreferencesAccountCredentialCache.EMPTY_AT.equals(credential)) || ((RefreshTokenRecord.class == clsCredentialClassForType && SharedPreferencesAccountCredentialCache.EMPTY_RT.equals(credential)) || (IdTokenRecord.class == clsCredentialClassForType && SharedPreferencesAccountCredentialCache.EMPTY_ID.equals(credential)))) {
                Logger.warn(strOooO0O0, "The returned Credential was uninitialized. Removing...");
                this.mSharedPreferencesFileManager.remove(key);
            } else {
                map.put(key, credential);
            }
        }
        Logger.verbose(strOooO0O0, "Loaded [" + map.size() + "] Credentials...");
        return map;
    }

    private void waitForInitialLoad() {
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, ":waitForInitialLoad");
        while (!this.mLoaded) {
            try {
                this.mCacheLock.wait();
            } catch (InterruptedException e) {
                Logger.error(strOooO0OO, "Caught InterruptedException while waiting", e);
            }
        }
    }

    @Override // com.microsoft.identity.common.java.cache.IAccountCredentialCache
    public void clearAll() {
        String str = TAG + ":clearAll";
        Logger.info(str, "Clearing all SharedPreferences entries...");
        synchronized (this.mCacheLock) {
            waitForInitialLoad();
            this.mSharedPreferencesFileManager.clear();
            this.mCachedCredentialsWithKeys.clear();
            this.mCachedAccountRecordsWithKeys.clear();
        }
        Logger.info(str, "SharedPreferences cleared.");
    }

    @Override // com.microsoft.identity.common.java.cache.IAccountCredentialCache
    public AccountRecord getAccount(String str) {
        AccountRecord accountRecord;
        if (str == null) {
            throw new NullPointerException("cacheKey is marked non-null but is null");
        }
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, ":getAccount");
        synchronized (this.mCacheLock) {
            waitForInitialLoad();
            accountRecord = this.mCachedAccountRecordsWithKeys.get(str);
        }
        if (accountRecord != null) {
            try {
                return (AccountRecord) accountRecord.m80722clone();
            } catch (CloneNotSupportedException e) {
                Logger.error(strOooO0OO, "Failed to clone AccountRecord", e);
            }
        }
        return accountRecord;
    }

    @Override // com.microsoft.identity.common.java.cache.IAccountCredentialCache
    public List<AccountRecord> getAccounts() {
        ArrayList arrayList;
        String strOooO0O0 = OooOO0.OooO0O0(new StringBuilder(), TAG, ":getAccounts", "Loading Accounts...(no arg)");
        synchronized (this.mCacheLock) {
            waitForInitialLoad();
            arrayList = new ArrayList();
            Iterator<AccountRecord> it = this.mCachedAccountRecordsWithKeys.values().iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add((AccountRecord) it.next().m80722clone());
                } catch (CloneNotSupportedException e) {
                    Logger.error(strOooO0O0, "Failed to clone AccountRecord", e);
                }
            }
            Logger.info(strOooO0O0, "Found [" + arrayList.size() + "] Accounts...");
        }
        return arrayList;
    }

    @Override // com.microsoft.identity.common.java.cache.IAccountCredentialCache
    public List<AccountRecord> getAccountsFilteredBy(String str, String str2, String str3) {
        String strOooO0O0 = OooOO0.OooO0O0(new StringBuilder(), TAG, ":getAccountsFilteredBy", "Loading Accounts...");
        List<AccountRecord> accountsFilteredByInternal = getAccountsFilteredByInternal(str, str2, str3, getAccounts());
        Logger.verbose(strOooO0O0, "Found [" + accountsFilteredByInternal.size() + "] matching Accounts...");
        return accountsFilteredByInternal;
    }

    @Override // com.microsoft.identity.common.java.cache.IAccountCredentialCache
    public Credential getCredential(String str) {
        Credential credential;
        if (str == null) {
            throw new NullPointerException("cacheKey is marked non-null but is null");
        }
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, ":getCredential");
        synchronized (this.mCacheLock) {
            waitForInitialLoad();
            credential = this.mCachedCredentialsWithKeys.get(str);
        }
        if (credential != null) {
            try {
                return (Credential) credential.m80722clone();
            } catch (CloneNotSupportedException e) {
                Logger.error(strOooO0OO, "Failed to clone Credential", e);
            }
        }
        return credential;
    }

    @Override // com.microsoft.identity.common.java.cache.IAccountCredentialCache
    public List<Credential> getCredentials() {
        ArrayList arrayList;
        String strOooO0O0 = OooOO0.OooO0O0(new StringBuilder(), TAG, ":getCredentials", "Loading Credentials...");
        synchronized (this.mCacheLock) {
            waitForInitialLoad();
            arrayList = new ArrayList();
            Iterator<Credential> it = this.mCachedCredentialsWithKeys.values().iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add((Credential) it.next().m80722clone());
                } catch (CloneNotSupportedException e) {
                    Logger.error(strOooO0O0, "Failed to clone Credential", e);
                }
            }
        }
        return arrayList;
    }

    @Override // com.microsoft.identity.common.java.cache.IAccountCredentialCache
    public List<Credential> getCredentialsFilteredBy(String str, String str2, CredentialType credentialType, String str3, String str4, String str5, String str6, String str7, String str8) {
        String strOooO0O0 = OooOO0.OooO0O0(new StringBuilder(), TAG, ":getCredentialsFilteredBy", "getCredentialsFilteredBy()");
        List<Credential> credentialsFilteredByInternal = getCredentialsFilteredByInternal(getCredentials(), str, str2, credentialType, str3, str4, str5, str6, str7, str8, null, null);
        Logger.verbose(strOooO0O0, "Found [" + credentialsFilteredByInternal.size() + "] matching Credentials...");
        return credentialsFilteredByInternal;
    }

    @Override // com.microsoft.identity.common.java.cache.IAccountCredentialCache
    public boolean removeAccount(AccountRecord accountRecord) {
        boolean z;
        if (accountRecord == null) {
            throw new NullPointerException("accountToRemove is marked non-null but is null");
        }
        String str = TAG + ":removeAccount";
        Logger.info(str, "Removing Account...");
        String strGenerateCacheKey = this.mCacheValueDelegate.generateCacheKey(accountRecord);
        synchronized (this.mCacheLock) {
            try {
                waitForInitialLoad();
                if (this.mSharedPreferencesFileManager.keySet().contains(strGenerateCacheKey)) {
                    this.mSharedPreferencesFileManager.remove(strGenerateCacheKey);
                    z = true;
                } else {
                    z = false;
                }
                Logger.info(str, "Account was removed? [" + z + "]");
                this.mCachedAccountRecordsWithKeys.remove(strGenerateCacheKey);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // com.microsoft.identity.common.java.cache.IAccountCredentialCache
    public boolean removeCredential(Credential credential) {
        boolean z;
        if (credential == null) {
            throw new NullPointerException("credentialToRemove is marked non-null but is null");
        }
        String str = TAG + ":removeCredential";
        Logger.info(str, "Removing Credential...");
        String strGenerateCacheKey = this.mCacheValueDelegate.generateCacheKey(credential);
        synchronized (this.mCacheLock) {
            try {
                waitForInitialLoad();
                if (this.mSharedPreferencesFileManager.keySet().contains(strGenerateCacheKey)) {
                    this.mSharedPreferencesFileManager.remove(strGenerateCacheKey);
                    z = true;
                } else {
                    z = false;
                }
                Logger.info(str, "Credential was removed? [" + z + "]");
                this.mCachedCredentialsWithKeys.remove(strGenerateCacheKey);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // com.microsoft.identity.common.java.cache.IAccountCredentialCache
    public void saveAccount(AccountRecord accountRecord) {
        if (accountRecord == null) {
            throw new NullPointerException("accountInput is marked non-null but is null");
        }
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, ":saveAccount");
        try {
            AccountRecord accountRecord2 = (AccountRecord) accountRecord.m80722clone();
            Logger.verbose(strOooO0OO, "Saving Account...");
            Logger.verbose(strOooO0OO, "Account type: [" + accountRecord2.getClass().getSimpleName() + "]");
            String strGenerateCacheKey = this.mCacheValueDelegate.generateCacheKey(accountRecord2);
            Logger.verbosePII(strOooO0OO, "Generated cache key: [" + strGenerateCacheKey + "]");
            synchronized (this.mCacheLock) {
                try {
                    waitForInitialLoad();
                    AccountRecord account = getAccount(strGenerateCacheKey);
                    if (account != null) {
                        accountRecord2.mergeAdditionalFields(account);
                    }
                    this.mSharedPreferencesFileManager.put(strGenerateCacheKey, this.mCacheValueDelegate.generateCacheValue(accountRecord2));
                    this.mCachedAccountRecordsWithKeys.put(strGenerateCacheKey, accountRecord2);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (CloneNotSupportedException e) {
            Logger.error(strOooO0OO, "Failed to clone AccountRecord", e);
        }
    }

    @Override // com.microsoft.identity.common.java.cache.IAccountCredentialCache
    public void saveCredential(Credential credential) {
        if (credential == null) {
            throw new NullPointerException("credentialInput is marked non-null but is null");
        }
        String strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), TAG, ":saveCredential");
        try {
            Credential credential2 = (Credential) credential.m80722clone();
            Logger.verbose(strOooO0OO, "Saving credential...");
            String strGenerateCacheKey = this.mCacheValueDelegate.generateCacheKey(credential2);
            Logger.verbosePII(strOooO0OO, "Generated cache key: [" + strGenerateCacheKey + "]");
            synchronized (this.mCacheLock) {
                try {
                    waitForInitialLoad();
                    Credential credential3 = getCredential(strGenerateCacheKey);
                    if (credential3 != null) {
                        credential2.mergeAdditionalFields(credential3);
                    }
                    this.mSharedPreferencesFileManager.put(strGenerateCacheKey, this.mCacheValueDelegate.generateCacheValue(credential2));
                    this.mCachedCredentialsWithKeys.put(strGenerateCacheKey, credential2);
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (CloneNotSupportedException e) {
            Logger.error(strOooO0OO, "Failed to clone Credential", e);
        }
    }

    @Override // com.microsoft.identity.common.java.cache.IAccountCredentialCache
    public List<Credential> getCredentialsFilteredBy(String str, String str2, CredentialType credentialType, String str3, String str4, String str5, String str6, String str7, String str8, List<Credential> list) {
        if (list != null) {
            String strOooO0O0 = OooOO0.OooO0O0(new StringBuilder(), TAG, ":getCredentialsFilteredBy", "getCredentialsFilteredBy() -- with input list");
            List<Credential> credentialsFilteredByInternal = getCredentialsFilteredByInternal(list, str, str2, credentialType, str3, str4, str5, str6, str7, str8, null, null);
            Logger.verbose(strOooO0O0, "Found [" + credentialsFilteredByInternal.size() + "] matching Credentials...");
            return credentialsFilteredByInternal;
        }
        throw new NullPointerException("inputCredentials is marked non-null but is null");
    }

    @Override // com.microsoft.identity.common.java.cache.IAccountCredentialCache
    public List<Credential> getCredentialsFilteredBy(String str, String str2, CredentialType credentialType, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        String strOooO0O0 = OooOO0.OooO0O0(new StringBuilder(), TAG, ":getCredentialsFilteredBy", "getCredentialsFilteredBy()");
        List<Credential> credentialsFilteredByInternal = getCredentialsFilteredByInternal(getCredentials(), str, str2, credentialType, str3, str4, str5, str6, str7, str8, str9, null);
        Logger.verbose(strOooO0O0, "Found [" + credentialsFilteredByInternal.size() + "] matching Credentials...");
        return credentialsFilteredByInternal;
    }

    @Override // com.microsoft.identity.common.java.cache.IAccountCredentialCache
    public List<Credential> getCredentialsFilteredBy(String str, String str2, CredentialType credentialType, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List<Credential> list) {
        if (list != null) {
            String strOooO0O0 = OooOO0.OooO0O0(new StringBuilder(), TAG, ":getCredentialsFilteredBy", "getCredentialsFilteredBy()");
            List<Credential> credentialsFilteredByInternal = getCredentialsFilteredByInternal(list, str, str2, credentialType, str3, str4, str5, str6, str7, str8, str9, null);
            Logger.verbose(strOooO0O0, "Found [" + credentialsFilteredByInternal.size() + "] matching Credentials...");
            return credentialsFilteredByInternal;
        }
        throw new NullPointerException("inputCredentials is marked non-null but is null");
    }

    @Override // com.microsoft.identity.common.java.cache.IAccountCredentialCache
    public List<Credential> getCredentialsFilteredBy(String str, String str2, Set<CredentialType> set, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        if (set != null) {
            List<Credential> credentials = getCredentials();
            ArrayList arrayList = new ArrayList();
            Iterator<CredentialType> it = set.iterator();
            while (it.hasNext()) {
                arrayList.addAll(getCredentialsFilteredByInternal(credentials, str, str2, it.next(), str3, str4, str5, str6, str7, str8, str9, null));
            }
            return arrayList;
        }
        throw new NullPointerException("credentialTypes is marked non-null but is null");
    }

    @Override // com.microsoft.identity.common.java.cache.IAccountCredentialCache
    public List<Credential> getCredentialsFilteredBy(List<Credential> list, String str, String str2, CredentialType credentialType, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(getCredentialsFilteredByInternal(list, str, str2, credentialType, str3, str4, str5, str6, str7, str8, str9, str10));
            return arrayList;
        }
        throw new NullPointerException("inputCredentials is marked non-null but is null");
    }
}
