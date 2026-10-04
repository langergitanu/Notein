package o000ooOO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import o000oo0.AbstractC24673OooOo0O;
import o000oo0.C24656OooO0O0;
import o000ooO0.AbstractC24732OooO00o;
import oO00ooO.C32443OooOOO;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0090 A[EDGE_INSN: B:45:0x0090->B:41:0x0090 BREAK  A[LOOP:0: B:11:0x0016->B:49:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final List<AbstractC24732OooO00o> OooO00o(AbstractC24673OooOo0O.C24674OooO0Oo c24674OooO0Oo, int i, int i2) {
        C32443OooOOO c32443OooOOO;
        boolean z;
        kotlin.jvm.internal.OooOOO0.OooO0oO(c24674OooO0Oo, "<this>");
        if (i == i2) {
            return C34434OooOoO.f123453OooOo0o;
        }
        boolean z2 = i2 > i;
        ArrayList arrayList = new ArrayList();
        do {
            if (z2) {
                if (i >= i2) {
                    return arrayList;
                }
                LinkedHashMap linkedHashMap = c24674OooO0Oo.f83610OooO00o;
                if (z2) {
                    TreeMap treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                    if (treeMap != null) {
                        c32443OooOOO = new C32443OooOOO(treeMap, treeMap.keySet());
                    }
                } else {
                    TreeMap treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                    c32443OooOOO = treeMap2 == null ? null : new C32443OooOOO(treeMap2, treeMap2.descendingKeySet());
                }
                if (c32443OooOOO != null) {
                    break;
                }
                Map map = (Map) c32443OooOOO.f116638OooOo0o;
                Iterator it = ((Iterable) c32443OooOOO.f116637OooOo).iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    if (!z2) {
                        if (i2 <= iIntValue && iIntValue < i) {
                            Object obj = map.get(Integer.valueOf(iIntValue));
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(obj);
                            arrayList.add(obj);
                            z = true;
                            i = iIntValue;
                            break;
                            break;
                        }
                    } else if (i + 1 <= iIntValue && iIntValue <= i2) {
                        Object obj2 = map.get(Integer.valueOf(iIntValue));
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(obj2);
                        arrayList.add(obj2);
                        z = true;
                        i = iIntValue;
                        break;
                    }
                }
                z = false;
            } else {
                if (i <= i2) {
                    return arrayList;
                }
                LinkedHashMap linkedHashMap2 = c24674OooO0Oo.f83610OooO00o;
                if (z2) {
                }
                if (c32443OooOOO != null) {
                }
            }
        } while (z);
        return null;
    }

    public static final boolean OooO0O0(C24656OooO0O0 c24656OooO0O0, int i, int i2) {
        Set<Integer> set;
        kotlin.jvm.internal.OooOOO0.OooO0oO(c24656OooO0O0, "<this>");
        return (i <= i2 || !c24656OooO0O0.f83527OooOO0o) && c24656OooO0O0.f83526OooOO0O && ((set = c24656OooO0O0.f83529OooOOO0) == null || !set.contains(Integer.valueOf(i)));
    }
}
