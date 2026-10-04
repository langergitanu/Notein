package oOo000Oo;

import java.util.Collections;
import java.util.Map;
import oO00ooO.C32443OooOOO;

/* JADX INFO: loaded from: classes10.dex */
public class Oooo0 extends o0O0OOO0.OooO00o {
    public static int OooO0Oo(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final <K, V> Map<K, V> OooO0o(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> mapSingletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        kotlin.jvm.internal.OooOOO0.OooO0o(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    public static <K, V> Map<K, V> OooO0o0(C32443OooOOO<? extends K, ? extends V> pair) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(pair, "pair");
        Map<K, V> mapSingletonMap = Collections.singletonMap(pair.f116638OooOo0o, pair.f116637OooOo);
        kotlin.jvm.internal.OooOOO0.OooO0o(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }
}
