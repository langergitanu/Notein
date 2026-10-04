package com.microsoft.identity.common.components;

import android.content.Context;
import com.microsoft.identity.common.internal.cache.SharedPreferencesFileManager;
import com.microsoft.identity.common.internal.util.SharedPrefStringNameValueStorage;
import com.microsoft.identity.common.internal.util.SharedPreferenceLongStorage;
import com.microsoft.identity.common.java.cache.IMultiTypeNameValueStorage;
import com.microsoft.identity.common.java.crypto.StorageEncryptionManager;
import com.microsoft.identity.common.java.interfaces.INameValueStorage;
import com.microsoft.identity.common.java.interfaces.IStorageSupplier;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J*\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\r0\f\"\u0004\b\u0000\u0010\r2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J*\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\r0\f\"\u0004\b\u0000\u0010\r2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m80612d2 = {"Lcom/microsoft/identity/common/components/AndroidStorageSupplier;", "Lcom/microsoft/identity/common/java/interfaces/IStorageSupplier;", "context", "Landroid/content/Context;", "storageEncryptionManager", "Lcom/microsoft/identity/common/java/crypto/StorageEncryptionManager;", "(Landroid/content/Context;Lcom/microsoft/identity/common/java/crypto/StorageEncryptionManager;)V", "getEncryptedFileStore", "Lcom/microsoft/identity/common/java/cache/IMultiTypeNameValueStorage;", "storeName", "", "getEncryptedNameValueStore", "Lcom/microsoft/identity/common/java/interfaces/INameValueStorage;", "T", "clazz", "Ljava/lang/Class;", "getUnencryptedFileStore", "getUnencryptedNameValueStore", "Companion", "common_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
public final class AndroidStorageSupplier implements IStorageSupplier {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Context context;
    private final StorageEncryptionManager storageEncryptionManager;

    @Metadata(m80611d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00050\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002¨\u0006\u000e"}, m80612d2 = {"Lcom/microsoft/identity/common/components/AndroidStorageSupplier$Companion;", "", "()V", "getNameValueStore", "Lcom/microsoft/identity/common/java/interfaces/INameValueStorage;", "T", "context", "Landroid/content/Context;", "storeName", "", "clazz", "Ljava/lang/Class;", "storageEncryptionManager", "Lcom/microsoft/identity/common/java/crypto/StorageEncryptionManager;", "common_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <T> INameValueStorage<T> getNameValueStore(Context context, String storeName, Class<T> clazz, StorageEncryptionManager storageEncryptionManager) {
            SharedPreferencesFileManager sharedPreferences = SharedPreferencesFileManager.getSharedPreferences(context, storeName, storageEncryptionManager);
            OooOOO0.OooO0o(sharedPreferences, "getSharedPreferences(con…storageEncryptionManager)");
            if (Long.TYPE.isAssignableFrom(clazz) || Long.class.isAssignableFrom(clazz)) {
                return new SharedPreferenceLongStorage(sharedPreferences);
            }
            if (String.class.isAssignableFrom(clazz) || String.class.isAssignableFrom(clazz)) {
                return new SharedPrefStringNameValueStorage(sharedPreferences);
            }
            throw new UnsupportedOperationException("Only Long and String are natively supported as types");
        }

        private Companion() {
        }
    }

    public AndroidStorageSupplier(Context context, StorageEncryptionManager storageEncryptionManager) {
        OooOOO0.OooO0oO(context, "context");
        OooOOO0.OooO0oO(storageEncryptionManager, "storageEncryptionManager");
        this.context = context;
        this.storageEncryptionManager = storageEncryptionManager;
    }

    @Override // com.microsoft.identity.common.java.interfaces.IStorageSupplier
    public IMultiTypeNameValueStorage getEncryptedFileStore(String storeName) {
        OooOOO0.OooO0oO(storeName, "storeName");
        SharedPreferencesFileManager sharedPreferences = SharedPreferencesFileManager.getSharedPreferences(this.context, storeName, this.storageEncryptionManager);
        OooOOO0.OooO0o(sharedPreferences, "getSharedPreferences(con…storageEncryptionManager)");
        return sharedPreferences;
    }

    @Override // com.microsoft.identity.common.java.interfaces.IStorageSupplier
    public <T> INameValueStorage<T> getEncryptedNameValueStore(String storeName, Class<T> clazz) {
        OooOOO0.OooO0oO(storeName, "storeName");
        OooOOO0.OooO0oO(clazz, "clazz");
        return INSTANCE.getNameValueStore(this.context, storeName, clazz, this.storageEncryptionManager);
    }

    @Override // com.microsoft.identity.common.java.interfaces.IStorageSupplier
    public IMultiTypeNameValueStorage getUnencryptedFileStore(String storeName) {
        OooOOO0.OooO0oO(storeName, "storeName");
        SharedPreferencesFileManager sharedPreferences = SharedPreferencesFileManager.getSharedPreferences(this.context, storeName, null);
        OooOOO0.OooO0o(sharedPreferences, "getSharedPreferences(context, storeName, null)");
        return sharedPreferences;
    }

    @Override // com.microsoft.identity.common.java.interfaces.IStorageSupplier
    public <T> INameValueStorage<T> getUnencryptedNameValueStore(String storeName, Class<T> clazz) {
        OooOOO0.OooO0oO(storeName, "storeName");
        OooOOO0.OooO0oO(clazz, "clazz");
        return INSTANCE.getNameValueStore(this.context, storeName, clazz, null);
    }
}
