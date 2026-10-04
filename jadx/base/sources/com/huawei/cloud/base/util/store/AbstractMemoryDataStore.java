package com.huawei.cloud.base.util.store;

import com.huawei.cloud.base.util.IOUtils;
import com.huawei.cloud.base.util.Lists;
import com.huawei.cloud.base.util.Maps;
import com.huawei.cloud.base.util.Preconditions;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes8.dex */
public class AbstractMemoryDataStore<V extends Serializable> extends AbstractDataStore<V> {
    protected HashMap<String, byte[]> keyValueMap;
    private final Lock lock;

    public AbstractMemoryDataStore(DataStoreFactory dataStoreFactory, String str) {
        super(dataStoreFactory, str);
        this.keyValueMap = Maps.newHashMap();
        this.lock = new ReentrantLock();
    }

    @Override // com.huawei.cloud.base.util.store.DataStore
    public final DataStore<V> clear() throws IOException {
        this.lock.lock();
        try {
            this.keyValueMap.clear();
            save();
            return this;
        } finally {
            this.lock.unlock();
        }
    }

    @Override // com.huawei.cloud.base.util.store.AbstractDataStore, com.huawei.cloud.base.util.store.DataStore
    public boolean containsKey(String str) throws IOException {
        if (str == null) {
            return false;
        }
        this.lock.lock();
        try {
            return this.keyValueMap.containsKey(str);
        } finally {
            this.lock.unlock();
        }
    }

    @Override // com.huawei.cloud.base.util.store.AbstractDataStore, com.huawei.cloud.base.util.store.DataStore
    public boolean containsValue(V v) throws IOException {
        if (v == null) {
            return false;
        }
        this.lock.lock();
        try {
            byte[] bArrSerialize = IOUtils.serialize(v);
            Iterator<byte[]> it = this.keyValueMap.values().iterator();
            while (it.hasNext()) {
                if (Arrays.equals(bArrSerialize, it.next())) {
                    this.lock.unlock();
                    return true;
                }
            }
            return false;
        } finally {
            this.lock.unlock();
        }
    }

    @Override // com.huawei.cloud.base.util.store.DataStore
    public DataStore<V> delete(String str) throws IOException {
        if (str == null) {
            return this;
        }
        this.lock.lock();
        try {
            this.keyValueMap.remove(str);
            save();
            return this;
        } finally {
            this.lock.unlock();
        }
    }

    @Override // com.huawei.cloud.base.util.store.DataStore
    public final V get(String str) throws IOException {
        if (str == null) {
            return null;
        }
        this.lock.lock();
        try {
            return (V) IOUtils.deserialize(this.keyValueMap.get(str));
        } finally {
            this.lock.unlock();
        }
    }

    @Override // com.huawei.cloud.base.util.store.AbstractDataStore, com.huawei.cloud.base.util.store.DataStore
    public boolean isEmpty() throws IOException {
        this.lock.lock();
        try {
            return this.keyValueMap.isEmpty();
        } finally {
            this.lock.unlock();
        }
    }

    @Override // com.huawei.cloud.base.util.store.DataStore
    public final Set<String> keySet() throws IOException {
        this.lock.lock();
        try {
            return Collections.unmodifiableSet(this.keyValueMap.keySet());
        } finally {
            this.lock.unlock();
        }
    }

    public void save() throws IOException {
    }

    @Override // com.huawei.cloud.base.util.store.DataStore
    public final DataStore<V> set(String str, V v) throws IOException {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(v);
        this.lock.lock();
        try {
            this.keyValueMap.put(str, IOUtils.serialize(v));
            save();
            return this;
        } finally {
            this.lock.unlock();
        }
    }

    @Override // com.huawei.cloud.base.util.store.AbstractDataStore, com.huawei.cloud.base.util.store.DataStore
    public int size() throws IOException {
        this.lock.lock();
        try {
            return this.keyValueMap.size();
        } finally {
            this.lock.unlock();
        }
    }

    public String toString() {
        return DataStoreUtils.toString(this);
    }

    @Override // com.huawei.cloud.base.util.store.DataStore
    public final Collection<V> values() throws IOException {
        this.lock.lock();
        try {
            ArrayList arrayListNewArrayList = Lists.newArrayList();
            Iterator<byte[]> it = this.keyValueMap.values().iterator();
            while (it.hasNext()) {
                arrayListNewArrayList.add(IOUtils.deserialize(it.next()));
            }
            List listUnmodifiableList = Collections.unmodifiableList(arrayListNewArrayList);
            this.lock.unlock();
            return listUnmodifiableList;
        } catch (Throwable th) {
            this.lock.unlock();
            throw th;
        }
    }
}
