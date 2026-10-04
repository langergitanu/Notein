package oOo000Oo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import oO00ooO.C32443OooOOO;

/* JADX INFO: renamed from: oOo000Oo.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C34447Oooo0o0 extends C34445Oooo0OO {
    public static C34433OooOo0o OooOOOo(Map map) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(map, "<this>");
        return OooOo.OooOooo(map.entrySet());
    }

    public static List OooOOo0(LinkedHashMap linkedHashMap) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(linkedHashMap, "<this>");
        int size = linkedHashMap.size();
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        if (size != 0) {
            Iterator it = linkedHashMap.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!it.hasNext()) {
                    return com.facebook.soloader.OooOo.OooO0oO(new C32443OooOOO(entry.getKey(), entry.getValue()));
                }
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                arrayList.add(new C32443OooOOO(entry.getKey(), entry.getValue()));
                do {
                    Map.Entry entry2 = (Map.Entry) it.next();
                    arrayList.add(new C32443OooOOO(entry2.getKey(), entry2.getValue()));
                } while (it.hasNext());
                return arrayList;
            }
        }
        return c34434OooOoO;
    }
}
