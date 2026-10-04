package com.microsoft.identity.common.migration;

import androidx.concurrent.futures.OooO00o;
import com.microsoft.identity.common.java.interfaces.INameValueStorage;
import com.microsoft.identity.common.java.util.TaskCompletedCallback;
import com.microsoft.identity.common.logging.Logger;
import com.microsoft.identity.common.migration.IMultiTypeNameValueStorageReencrypter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public class DefaultMultiTypeNameValueStorageReencrypter implements IMultiTypeNameValueStorageReencrypter {
    private static final String TAG = "DefaultMultiTypeNameValueStorageReencrypter";
    private static final ExecutorService executor = Executors.newSingleThreadExecutor();

    public interface Callable<T> {
        void call(T t) throws Exception;
    }

    private void applyCacheMutation(Map<String, String> map, Callable<Map.Entry<String, String>> callable, MigrationOperationResult migrationOperationResult, IMultiTypeNameValueStorageReencrypter.ReencryptionParams reencryptionParams, Set<String> set, Set<String> set2, AtomicBoolean atomicBoolean) {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":applyCacheMutation");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                if (set2.contains(entry.getKey())) {
                    Logger.warn(strOooO0OO, "Skipping entry.");
                } else {
                    callable.call(entry);
                }
            } catch (Exception e) {
                Logger.error(strOooO0OO, "Error during mutation", e);
                Logger.errorPII(strOooO0OO, "Failed key: " + entry.getKey(), e);
                migrationOperationResult.addFailure(e);
                set2.add(entry.getKey());
                if (reencryptionParams.eraseEntryOnError()) {
                    Logger.warn(strOooO0OO, "Marking key for removal.");
                    set.add(entry.getKey());
                }
                if (reencryptionParams.eraseAllOnError()) {
                    Logger.warn(strOooO0OO, "Marking all keys for removal.");
                    set.addAll(map.keySet());
                    atomicBoolean.set(true);
                    return;
                } else if (reencryptionParams.abortOnError()) {
                    atomicBoolean.set(true);
                    return;
                }
            }
        }
    }

    private void clearEntriesMarkedForRemoval(INameValueStorage<String> iNameValueStorage, Map<String, String> map, Set<String> set) {
        Logger.warn(TAG + ":clearEntriesMarkedForRemoval", "Removing entries marked for removal");
        for (String str : set) {
            map.remove(str);
            iNameValueStorage.remove(str);
        }
    }

    @Override // com.microsoft.identity.common.migration.IMultiTypeNameValueStorageReencrypter
    public IMigrationOperationResult reencrypt(INameValueStorage<String> iNameValueStorage, final IMultiTypeNameValueStorageReencrypter.IStringEncrypter iStringEncrypter, final IMultiTypeNameValueStorageReencrypter.IStringDecrypter iStringDecrypter, IMultiTypeNameValueStorageReencrypter.ReencryptionParams reencryptionParams) {
        String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":reencrypt");
        HashMap map = new HashMap(iNameValueStorage.getAll());
        Logger.verbose(strOooO0OO, "Attempting to migrate cache entries: " + map.size());
        MigrationOperationResult migrationOperationResult = new MigrationOperationResult();
        migrationOperationResult.setCountOfTotalRecords(map.size());
        Set<String> hashSet = new HashSet<>();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Set<String> hashSet2 = new HashSet<>();
        applyCacheMutation(map, new Callable<Map.Entry<String, String>>() { // from class: com.microsoft.identity.common.migration.DefaultMultiTypeNameValueStorageReencrypter.1
            @Override // com.microsoft.identity.common.migration.DefaultMultiTypeNameValueStorageReencrypter.Callable
            public void call(Map.Entry<String, String> entry) throws Exception {
                entry.setValue(iStringDecrypter.decrypt(entry.getValue()));
            }
        }, migrationOperationResult, reencryptionParams, hashSet, hashSet2, atomicBoolean);
        clearEntriesMarkedForRemoval(iNameValueStorage, map, hashSet);
        if (atomicBoolean.get()) {
            Logger.info(strOooO0OO, "Aborting after decrypt.");
            return migrationOperationResult;
        }
        applyCacheMutation(map, new Callable<Map.Entry<String, String>>() { // from class: com.microsoft.identity.common.migration.DefaultMultiTypeNameValueStorageReencrypter.2
            @Override // com.microsoft.identity.common.migration.DefaultMultiTypeNameValueStorageReencrypter.Callable
            public void call(Map.Entry<String, String> entry) throws Exception {
                entry.setValue(iStringEncrypter.encrypt(entry.getValue()));
            }
        }, migrationOperationResult, reencryptionParams, hashSet, hashSet2, atomicBoolean);
        clearEntriesMarkedForRemoval(iNameValueStorage, map, hashSet);
        if (atomicBoolean.get()) {
            Logger.info(strOooO0OO, "Aborting after reencrypt.");
            return migrationOperationResult;
        }
        Logger.info(strOooO0OO, "Writing reencrypted cache entries.");
        for (Map.Entry entry : map.entrySet()) {
            iNameValueStorage.put((String) entry.getKey(), (String) entry.getValue());
        }
        return migrationOperationResult;
    }

    @Override // com.microsoft.identity.common.migration.IMultiTypeNameValueStorageReencrypter
    public void reencryptAsync(final INameValueStorage<String> iNameValueStorage, final IMultiTypeNameValueStorageReencrypter.IStringEncrypter iStringEncrypter, final IMultiTypeNameValueStorageReencrypter.IStringDecrypter iStringDecrypter, final IMultiTypeNameValueStorageReencrypter.ReencryptionParams reencryptionParams, final TaskCompletedCallback<IMigrationOperationResult> taskCompletedCallback) {
        executor.execute(new Runnable() { // from class: com.microsoft.identity.common.migration.DefaultMultiTypeNameValueStorageReencrypter.3
            @Override // java.lang.Runnable
            public void run() {
                taskCompletedCallback.onTaskCompleted(DefaultMultiTypeNameValueStorageReencrypter.this.reencrypt(iNameValueStorage, iStringEncrypter, iStringDecrypter, reencryptionParams));
            }
        });
    }
}
