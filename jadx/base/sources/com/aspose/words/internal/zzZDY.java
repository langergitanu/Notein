package com.aspose.words.internal;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZDY<K, V> {
    final int zzWJ9;
    final zzZ<K, V> zzWJa;

    public static final class zzZ<K, V> extends LinkedHashMap<K, V> {
        final int zzWJ9;

        public zzZ(int i) {
            super(i, 0.8f, true);
            this.zzWJ9 = i;
        }

        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<K, V> entry) {
            return size() >= this.zzWJ9;
        }
    }

    public zzZDY(int i) {
        this.zzWJa = new zzZ<>(i);
        this.zzWJ9 = i;
    }

    public final void zzB(K k, V v) {
        this.zzWJa.put(k, v);
    }

    public final V zzYG(K k) {
        return this.zzWJa.get(k);
    }
}
