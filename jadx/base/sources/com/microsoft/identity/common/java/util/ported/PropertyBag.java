package com.microsoft.identity.common.java.util.ported;

import com.microsoft.identity.common.java.interfaces.INameValueStorage;
import java.io.Serializable;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class PropertyBag {
    private final INameValueStorage<Object> mMap = new InMemoryStorage();

    private <T extends Serializable> T getOrDefaultInternal(String str, T t) {
        if (str == null) {
            throw new NullPointerException("name is marked non-null but is null");
        }
        Object obj = this.mMap.get(str);
        if (obj != null) {
            try {
                return (T) obj;
            } catch (ClassCastException unused) {
            }
        }
        return t;
    }

    public <T extends Serializable> T get(String str) {
        if (str != null) {
            return (T) getOrDefaultInternal(str, null);
        }
        throw new NullPointerException("name is marked non-null but is null");
    }

    public <T extends Serializable> T getOrDefault(String str, T t) {
        if (str == null) {
            throw new NullPointerException("name is marked non-null but is null");
        }
        if (t != null) {
            return (T) getOrDefaultInternal(str, t);
        }
        throw new NullPointerException("defaultValue is marked non-null but is null");
    }

    public Set<String> keySet() {
        return this.mMap.keySet();
    }

    public <T extends Serializable> void put(String str, T t) {
        if (str == null) {
            throw new NullPointerException("name is marked non-null but is null");
        }
        this.mMap.put(str, t);
    }
}
