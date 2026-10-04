package oOo000Oo;

import OooOo.C20485OooOoO;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import oO00ooO.C32443OooOOO;

/* JADX INFO: renamed from: oOo000Oo.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C34444Oooo0O0 extends Oooo0 {
    public static LinkedHashMap OooO(C32443OooOOO... c32443OooOOOArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(Oooo0.OooO0Oo(c32443OooOOOArr.length));
        OooOO0O(linkedHashMap, c32443OooOOOArr);
        return linkedHashMap;
    }

    public static Object OooO0oO(Object obj, Map map) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(map, "<this>");
        if (map instanceof InterfaceC34443Oooo00o) {
            return ((InterfaceC34443Oooo00o) map).OooO0OO();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException(C20485OooOoO.OooO0O0("Key ", obj, " is missing in the map."));
    }

    public static <K, V> Map<K, V> OooO0oo(C32443OooOOO<? extends K, ? extends V>... c32443OooOOOArr) {
        if (c32443OooOOOArr.length <= 0) {
            return C34436OooOoOO.f123455OooOo0o;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(Oooo0.OooO0Oo(c32443OooOOOArr.length));
        OooOO0O(linkedHashMap, c32443OooOOOArr);
        return linkedHashMap;
    }

    public static LinkedHashMap OooOO0(Map map, Map map2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(map, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final void OooOO0O(HashMap map, C32443OooOOO[] c32443OooOOOArr) {
        for (C32443OooOOO c32443OooOOO : c32443OooOOOArr) {
            map.put(c32443OooOOO.f116638OooOo0o, c32443OooOOO.f116637OooOo);
        }
    }

    public static <K, V> Map<K, V> OooOO0o(Iterable<? extends C32443OooOOO<? extends K, ? extends V>> iterable) {
        boolean z = iterable instanceof Collection;
        C34436OooOoOO c34436OooOoOO = C34436OooOoOO.f123455OooOo0o;
        if (!z) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            OooOOO(iterable, linkedHashMap);
            int size = linkedHashMap.size();
            return size != 0 ? size != 1 ? linkedHashMap : Oooo0.OooO0o(linkedHashMap) : c34436OooOoOO;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return c34436OooOoOO;
        }
        if (size2 == 1) {
            return Oooo0.OooO0o0((C32443OooOOO) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(Oooo0.OooO0Oo(collection.size()));
        OooOOO(iterable, linkedHashMap2);
        return linkedHashMap2;
    }

    public static final void OooOOO(Iterable iterable, LinkedHashMap linkedHashMap) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            C32443OooOOO c32443OooOOO = (C32443OooOOO) it.next();
            linkedHashMap.put(c32443OooOOO.f116638OooOo0o, c32443OooOOO.f116637OooOo);
        }
    }

    public static <K, V> Map<K, V> OooOOO0(Map<? extends K, ? extends V> map) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? OooOOOO(map) : Oooo0.OooO0o(map) : C34436OooOoOO.f123455OooOo0o;
    }

    public static LinkedHashMap OooOOOO(Map map) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(map, "<this>");
        return new LinkedHashMap(map);
    }
}
