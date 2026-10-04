package com.aspose.words;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes6.dex */
final class zz87 {
    public static Collection<zz8D> zzZ(ArrayList<zz8E> arrayList, zzZ90 zzz90) {
        if (arrayList == null || arrayList.size() == 0) {
            return new ArrayList();
        }
        com.aspose.words.internal.zzZQH zzzqh = new com.aspose.words.internal.zzZQH();
        for (zz8E zz8e : arrayList) {
            zz8D zz8dZzZ = zz8C.zzZ(zz8e, zzz90);
            if (zz8dZzZ != null && zz8dZzZ.getOrder() != 0) {
                if (zzzqh.containsKey(Integer.valueOf(zz8dZzZ.getOrder()))) {
                    if (!zzZ(zz8e)) {
                        zzzqh.remove(Integer.valueOf(zz8dZzZ.getOrder()));
                    }
                }
                zzzqh.zzB(Integer.valueOf(zz8dZzZ.getOrder()), zz8dZzZ);
            }
        }
        return zzzqh.zzl9();
    }

    private static boolean zzZ(zz8E zz8e) {
        return zz8e.getType() != 11;
    }
}
