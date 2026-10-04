package com.aspose.words.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZQI<K, V> implements Map.Entry<K, V> {
    private K zz3r;
    private V zztT;

    public zzZQI() {
        this.zz3r = null;
        this.zztT = null;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.zz3r;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.zztT;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        this.zztT = v;
        return v;
    }

    public zzZQI(K k, V v) {
        this.zz3r = k;
        this.zztT = v;
    }
}
