package com.aspose.words.internal;

import com.aspose.words.ref.Ref;
import com.aspose.words.ref.RefBoolean;
import com.aspose.words.ref.RefInt;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZQF {
    public static <K, V> boolean zzY(Map<K, V> map, K k) {
        if (k == null || !map.containsKey(k)) {
            return false;
        }
        map.remove(k);
        return true;
    }

    public static <K, V> boolean zzZ(Map<K, V> map, K k, Ref<V> ref) {
        if (k == null || !map.containsKey(k)) {
            return false;
        }
        ref.set(map.get(k));
        return true;
    }

    public static <K, V> void zzY(Map<K, V> map, K k, V v) {
        if (k != null && map.containsKey(k)) {
            throw new IllegalArgumentException("error: addition of a duplicate key to a dictionary");
        }
        map.put(k, v);
    }

    public static <K> boolean zzZ(Map<K, Integer> map, K k, RefInt refInt) {
        if (k == null || !map.containsKey(k)) {
            return false;
        }
        refInt.set(map.get(k).intValue());
        return true;
    }

    public static <K> boolean zzZ(Map<K, Boolean> map, K k, RefBoolean refBoolean) {
        if (k == null || !map.containsKey(k)) {
            return false;
        }
        refBoolean.set(map.get(k).booleanValue());
        return true;
    }
}
