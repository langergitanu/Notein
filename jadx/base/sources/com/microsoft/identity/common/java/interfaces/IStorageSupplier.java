package com.microsoft.identity.common.java.interfaces;

import com.microsoft.identity.common.java.cache.IMultiTypeNameValueStorage;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J*\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b2\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J*\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b2\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\nH&¨\u0006\r"}, m80612d2 = {"Lcom/microsoft/identity/common/java/interfaces/IStorageSupplier;", "", "getEncryptedFileStore", "Lcom/microsoft/identity/common/java/cache/IMultiTypeNameValueStorage;", "storeName", "", "getEncryptedNameValueStore", "Lcom/microsoft/identity/common/java/interfaces/INameValueStorage;", "T", "clazz", "Ljava/lang/Class;", "getUnencryptedFileStore", "getUnencryptedNameValueStore", "common4j"}, m80613k = 1, m80614mv = {1, 7, 1}, m80616xi = 48)
public interface IStorageSupplier {
    IMultiTypeNameValueStorage getEncryptedFileStore(String storeName);

    <T> INameValueStorage<T> getEncryptedNameValueStore(String storeName, Class<T> clazz);

    IMultiTypeNameValueStorage getUnencryptedFileStore(String storeName);

    <T> INameValueStorage<T> getUnencryptedNameValueStore(String storeName, Class<T> clazz);
}
