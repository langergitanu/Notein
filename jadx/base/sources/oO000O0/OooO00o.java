package oO000O0;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o {
    public static Object[] OooO00o(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        if (objArr != null) {
            for (Object obj : objArr) {
                if (obj instanceof Object[]) {
                    for (Object obj2 : OooO00o((Object[]) obj)) {
                        arrayList.add(obj2);
                    }
                } else {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList.toArray();
    }
}
