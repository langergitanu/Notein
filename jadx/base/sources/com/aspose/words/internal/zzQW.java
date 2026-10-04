package com.aspose.words.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzQW {
    public static <TKey, TValue> TValue zzZ(Map<TKey, TValue> map, TKey tkey) {
        if (map.containsKey(tkey)) {
            return map.get(tkey);
        }
        return null;
    }

    public static <TKey, TValue> TValue zzZ(zzZQH<TKey, TValue> zzzqh, TKey tkey) {
        if (zzzqh.containsKey(tkey)) {
            return zzzqh.get(tkey);
        }
        return null;
    }

    public static <TValue> TValue zzZ(zzZYT<TValue> zzzyt, String str) {
        if (zzzyt.containsKey(str)) {
            return zzzyt.get(str);
        }
        return null;
    }

    public static <TValue, TKey> TValue zzZ(Map<TKey, TValue> map, TKey tkey, TValue tvalue) {
        return map.containsKey(tkey) ? map.get(tkey) : tvalue;
    }

    public static <TValue, TKey> TValue zzZ(zzZQH<TKey, TValue> zzzqh, TKey tkey, TValue tvalue) {
        return zzzqh.containsKey(tkey) ? zzzqh.get(tkey) : tvalue;
    }

    public static <TValue> TValue zzZ(zzZYT<TValue> zzzyt, String str, TValue tvalue) {
        return zzzyt.containsKey(str) ? zzzyt.get(str) : tvalue;
    }
}
