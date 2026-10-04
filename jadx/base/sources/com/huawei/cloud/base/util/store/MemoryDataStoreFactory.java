package com.huawei.cloud.base.util.store;

import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public class MemoryDataStoreFactory extends AbstractDataStoreFactory {

    public static class InstanceHolder {
        static final MemoryDataStoreFactory INSTANCE = new MemoryDataStoreFactory();
    }

    public static class MemoryDataStore<V extends Serializable> extends AbstractMemoryDataStore<V> {
        public MemoryDataStore(MemoryDataStoreFactory memoryDataStoreFactory, String str) {
            super(memoryDataStoreFactory, str);
        }

        @Override // com.huawei.cloud.base.util.store.AbstractDataStore, com.huawei.cloud.base.util.store.DataStore
        public MemoryDataStoreFactory getDataStoreFactory() {
            return (MemoryDataStoreFactory) super.getDataStoreFactory();
        }
    }

    public static MemoryDataStoreFactory getDefaultInstance() {
        return InstanceHolder.INSTANCE;
    }

    @Override // com.huawei.cloud.base.util.store.AbstractDataStoreFactory
    public <V extends Serializable> DataStore<V> createDataStore(String str) throws IOException {
        return new MemoryDataStore(this, str);
    }
}
