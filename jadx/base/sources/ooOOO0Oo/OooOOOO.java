package ooOOO0Oo;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import oO00ooO.C32443OooOOO;
import oO0OooO0.C33474OooO;
import oO0OooO0.C33476OooO0O0;
import oO0OooO0.C33477OooO0OO;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final LinkedHashMap f125802OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Map<C33477OooO0OO, C33477OooO0OO> f125803OooO0O0;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f125802OooO00o = linkedHashMap;
        OooO0O0(C33474OooO.f120960OooOOo, OooO00o("java.util.ArrayList", "java.util.LinkedList"));
        OooO0O0(C33474OooO.f120962OooOOoo, OooO00o("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        OooO0O0(C33474OooO.f120964OooOo00, OooO00o("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        OooO0O0(C33476OooO0O0.OooOO0(new C33477OooO0OO("java.util.function.Function")), OooO00o("java.util.function.UnaryOperator"));
        OooO0O0(C33476OooO0O0.OooOO0(new C33477OooO0OO("java.util.function.BiFunction")), OooO00o("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new C32443OooOOO(((C33476OooO0O0) entry.getKey()).OooO0O0(), ((C33476OooO0O0) entry.getValue()).OooO0O0()));
        }
        f125803OooO0O0 = C34444Oooo0O0.OooOO0o(arrayList);
    }

    public static ArrayList OooO00o(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C33476OooO0O0.OooOO0(new C33477OooO0OO(str)));
        }
        return arrayList;
    }

    public static void OooO0O0(C33476OooO0O0 c33476OooO0O0, ArrayList arrayList) {
        for (Object obj : arrayList) {
            f125802OooO00o.put(obj, c33476OooO0O0);
        }
    }
}
