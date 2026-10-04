package com.microsoft.identity.common.internal.cache;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.concurrent.futures.OooO00o;
import com.google.gson.Gson;
import com.microsoft.identity.common.java.cache.IListTypeToken;
import com.microsoft.identity.common.java.cache.ISimpleCache;
import com.microsoft.identity.common.logging.Logger;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public abstract class SharedPreferencesSimpleCacheImpl<T> implements ISimpleCache<T>, IListTypeToken {
    private static final String EMPTY_ARRAY = "[]";
    private static final String TAG = "SharedPreferencesSimpleCacheImpl";
    private final Gson mGson = new Gson();
    private final String mKeySingleEntry;
    private final SharedPreferences mSharedPrefs;

    public SharedPreferencesSimpleCacheImpl(Context context, String str, String str2) {
        Logger.verbose(TAG + "::constructor", "Init");
        this.mSharedPrefs = context.getSharedPreferences(str, 0);
        this.mKeySingleEntry = str2;
    }

    @Override // com.microsoft.identity.common.java.cache.ISimpleCache
    public boolean clear() {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":clear");
        boolean zCommit = this.mSharedPrefs.edit().clear().commit();
        if (zCommit) {
            Logger.verbose(strOooO0OO, "Cache successfully cleared.");
            return zCommit;
        }
        Logger.warn(strOooO0OO, "Failed to clear cache.");
        return zCommit;
    }

    @Override // com.microsoft.identity.common.java.cache.ISimpleCache
    public List<T> getAll() {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":getAll");
        List<T> list = (List) this.mGson.fromJson(this.mSharedPrefs.getString(this.mKeySingleEntry, "[]"), getListTypeToken());
        Logger.verbose(strOooO0OO, "Found [" + list.size() + "] cache entries.");
        return list;
    }

    @Override // com.microsoft.identity.common.java.cache.ISimpleCache
    public boolean insert(T t) {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":insert");
        HashSet hashSet = new HashSet(getAll());
        Logger.verbose(strOooO0OO, "Existing metadata contained [" + hashSet.size() + "] elements.");
        hashSet.add(t);
        Logger.verbose(strOooO0OO, "New metadata set size: [" + hashSet.size() + "]");
        String json = this.mGson.toJson(hashSet);
        Logger.verbose(strOooO0OO, "Writing cache entry.");
        boolean zCommit = this.mSharedPrefs.edit().putString(this.mKeySingleEntry, json).commit();
        if (zCommit) {
            Logger.verbose(strOooO0OO, "Cache successfully updated.");
            return zCommit;
        }
        Logger.warn(strOooO0OO, "Error writing to cache.");
        return zCommit;
    }

    @Override // com.microsoft.identity.common.java.cache.ISimpleCache
    public boolean remove(T t) {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":remove");
        HashSet hashSet = new HashSet(getAll());
        Logger.verbose(strOooO0OO, "Existing metadata contained [" + hashSet.size() + "] elements.");
        boolean zRemove = hashSet.remove(t);
        Logger.verbose(strOooO0OO, "New metadata set size: [" + hashSet.size() + "]");
        if (!zRemove) {
            Logger.warn(strOooO0OO, "Nothing to delete -- cache entry is missing!");
            return true;
        }
        String json = this.mGson.toJson(hashSet);
        Logger.verbose(strOooO0OO, "Writing new cache values...");
        boolean zCommit = this.mSharedPrefs.edit().putString(this.mKeySingleEntry, json).commit();
        Logger.verbose(strOooO0OO, "Updated cache contents written? [" + zCommit + "]");
        return zCommit;
    }
}
