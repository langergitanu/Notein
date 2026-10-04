package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzBP {
    public static void zzS(ArrayList<String> arrayList) {
        zzBO.zzS(arrayList);
    }

    public static <T> boolean zzX(ArrayList<T> arrayList, ArrayList<T> arrayList2) {
        if (arrayList.size() != arrayList2.size()) {
            return false;
        }
        boolean zEquals = true;
        for (int i = 0; i < arrayList.size() && ((zEquals = zEquals & zzZKO.equals(arrayList.get(i), arrayList2.get(i)))); i++) {
        }
        return zEquals;
    }

    public static <TD, TS extends TD> void zzZ(ArrayList<TD> arrayList, Iterable<TS> iterable) {
        Iterator<TS> it = iterable.iterator();
        while (it.hasNext()) {
            zzZQG.zzZ((ArrayList<TS>) arrayList, it.next());
        }
    }
}
