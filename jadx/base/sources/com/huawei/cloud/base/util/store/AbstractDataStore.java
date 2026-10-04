package com.huawei.cloud.base.util.store;

import com.huawei.cloud.base.util.Preconditions;
import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractDataStore<V extends Serializable> implements DataStore<V> {
    private final DataStoreFactory dataStoreFactory;

    /* JADX INFO: renamed from: id */
    private final String f52288id;

    public AbstractDataStore(DataStoreFactory dataStoreFactory, String str) {
        this.dataStoreFactory = (DataStoreFactory) Preconditions.checkNotNull(dataStoreFactory);
        this.f52288id = (String) Preconditions.checkNotNull(str);
    }

    @Override // com.huawei.cloud.base.util.store.DataStore
    public boolean containsKey(String str) throws IOException {
        return get(str) != null;
    }

    @Override // com.huawei.cloud.base.util.store.DataStore
    public boolean containsValue(V v) throws IOException {
        return values().contains(v);
    }

    @Override // com.huawei.cloud.base.util.store.DataStore
    public DataStoreFactory getDataStoreFactory() {
        return this.dataStoreFactory;
    }

    @Override // com.huawei.cloud.base.util.store.DataStore
    public final String getId() {
        return this.f52288id;
    }

    @Override // com.huawei.cloud.base.util.store.DataStore
    public boolean isEmpty() throws IOException {
        return size() == 0;
    }

    @Override // com.huawei.cloud.base.util.store.DataStore
    public int size() throws IOException {
        return keySet().size();
    }
}
