package com.microsoft.identity.common.java.storage;

import com.microsoft.identity.common.java.cache.IMultiTypeNameValueStorage;
import com.microsoft.identity.common.java.interfaces.AbstractPerSeparatorMultiTypeNameValueStorage;
import com.microsoft.identity.common.java.interfaces.IPlatformComponents;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: loaded from: classes9.dex */
public class StringSeparatedMultiTypeNameValueStorage extends AbstractPerSeparatorMultiTypeNameValueStorage<String> {
    private static final int MAX_ITEM_COUNT = 25;
    private static final Map<String, IMultiTypeNameValueStorage> sStringSeparatedStorageCache = Collections.synchronizedMap(new LinkedHashMap<String, IMultiTypeNameValueStorage>(2, 0.75f, true) { // from class: com.microsoft.identity.common.java.storage.StringSeparatedMultiTypeNameValueStorage.1
        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<String, IMultiTypeNameValueStorage> entry) {
            return size() > 25;
        }
    });
    private final IPlatformComponents mPlatformComponents;
    private final boolean mShouldEncrypt;

    public StringSeparatedMultiTypeNameValueStorage(IPlatformComponents iPlatformComponents, boolean z) {
        if (iPlatformComponents == null) {
            throw new NullPointerException("mPlatformComponents is marked non-null but is null");
        }
        this.mPlatformComponents = iPlatformComponents;
        this.mShouldEncrypt = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ IMultiTypeNameValueStorage lambda$getStoreForSeparator$0(String str, String str2) {
        return this.mShouldEncrypt ? this.mPlatformComponents.getStorageSupplier().getEncryptedFileStore(str) : this.mPlatformComponents.getStorageSupplier().getUnencryptedFileStore(str);
    }

    @Override // com.microsoft.identity.common.java.interfaces.AbstractPerSeparatorMultiTypeNameValueStorage
    public synchronized IMultiTypeNameValueStorage getStoreForSeparator(final String str) {
        if (str == null) {
            throw new NullPointerException("separator is marked non-null but is null");
        }
        return sStringSeparatedStorageCache.computeIfAbsent(str, new Function() { // from class: com.microsoft.identity.common.java.storage.OooO00o
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f69010OooO00o.lambda$getStoreForSeparator$0(str, (String) obj);
            }
        });
    }
}
