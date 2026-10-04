package com.microsoft.identity.common.internal.cache;

import com.microsoft.identity.common.java.interfaces.INameValueStorage;
import com.microsoft.identity.common.java.interfaces.IStorageSupplier;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oO0o0oOo.C33900OooO0o0;
import oO0o0oOo.InterfaceC33895OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \f2\u00020\u00012\u00020\u0002:\u0001\fB\u001f\b\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b¨\u0006\r"}, m80612d2 = {"Lcom/microsoft/identity/common/internal/cache/ClientActiveBrokerCache;", "Lcom/microsoft/identity/common/internal/cache/BaseActiveBrokerCache;", "Lcom/microsoft/identity/common/internal/cache/IClientActiveBrokerCache;", "Lcom/microsoft/identity/common/java/interfaces/INameValueStorage;", "", "storage", "LoO0o0oOo/OooO00o;", "lock", "<init>", "(Lcom/microsoft/identity/common/java/interfaces/INameValueStorage;LoO0o0oOo/OooO00o;)V", "Lcom/microsoft/identity/common/java/interfaces/INameValueStorage;", "LoO0o0oOo/OooO00o;", "Companion", "common_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
public final class ClientActiveBrokerCache extends BaseActiveBrokerCache implements IClientActiveBrokerCache {
    private static final String BROKER_METADATA_CACHE_STORE_ON_BROKER_SDK_SIDE_STORAGE_NAME = "BROKER_METADATA_CACHE_STORE_ON_BROKER_SDK_SIDE";
    private static final String BROKER_METADATA_CACHE_STORE_ON_CLIENT_SDK_SIDE_STORAGE_NAME = "BROKER_METADATA_CACHE_STORE_ON_CLIENT_SDK_SIDE";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC33895OooO00o sBrokerSdkSideLock = C33900OooO0o0.OooO00o();
    private static final InterfaceC33895OooO00o sClientSdkSideLock = C33900OooO0o0.OooO00o();
    private final InterfaceC33895OooO00o lock;
    private final INameValueStorage<String> storage;

    @Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, m80612d2 = {"Lcom/microsoft/identity/common/internal/cache/ClientActiveBrokerCache$Companion;", "", "<init>", "()V", "Lcom/microsoft/identity/common/java/interfaces/IStorageSupplier;", "storageSupplier", "Lcom/microsoft/identity/common/internal/cache/IClientActiveBrokerCache;", "getBrokerSdkCache", "(Lcom/microsoft/identity/common/java/interfaces/IStorageSupplier;)Lcom/microsoft/identity/common/internal/cache/IClientActiveBrokerCache;", "getClientSdkCache", "", "BROKER_METADATA_CACHE_STORE_ON_BROKER_SDK_SIDE_STORAGE_NAME", "Ljava/lang/String;", "BROKER_METADATA_CACHE_STORE_ON_CLIENT_SDK_SIDE_STORAGE_NAME", "LoO0o0oOo/OooO00o;", "sBrokerSdkSideLock", "LoO0o0oOo/OooO00o;", "sClientSdkSideLock", "common_distRelease"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final IClientActiveBrokerCache getBrokerSdkCache(IStorageSupplier storageSupplier) {
            OooOOO0.OooO0oO(storageSupplier, "storageSupplier");
            return new ClientActiveBrokerCache(storageSupplier.getEncryptedNameValueStore(ClientActiveBrokerCache.BROKER_METADATA_CACHE_STORE_ON_BROKER_SDK_SIDE_STORAGE_NAME, String.class), ClientActiveBrokerCache.sBrokerSdkSideLock);
        }

        public final IClientActiveBrokerCache getClientSdkCache(IStorageSupplier storageSupplier) {
            OooOOO0.OooO0oO(storageSupplier, "storageSupplier");
            return new ClientActiveBrokerCache(storageSupplier.getEncryptedNameValueStore(ClientActiveBrokerCache.BROKER_METADATA_CACHE_STORE_ON_CLIENT_SDK_SIDE_STORAGE_NAME, String.class), ClientActiveBrokerCache.sClientSdkSideLock);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientActiveBrokerCache(INameValueStorage<String> storage, InterfaceC33895OooO00o lock) {
        super(storage, lock);
        OooOOO0.OooO0oO(storage, "storage");
        OooOOO0.OooO0oO(lock, "lock");
        this.storage = storage;
        this.lock = lock;
    }

    public static final IClientActiveBrokerCache getBrokerSdkCache(IStorageSupplier iStorageSupplier) {
        return INSTANCE.getBrokerSdkCache(iStorageSupplier);
    }

    public static final IClientActiveBrokerCache getClientSdkCache(IStorageSupplier iStorageSupplier) {
        return INSTANCE.getClientSdkCache(iStorageSupplier);
    }
}
