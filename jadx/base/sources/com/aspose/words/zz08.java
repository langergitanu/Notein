package com.aspose.words;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz08 {
    public static void zzZ(com.aspose.words.internal.zzZP zzzp, ArrayList<zz8E> arrayList, zzGR zzgr) throws Exception {
        Collection<zz8D> collectionZzZ = zz87.zzZ(arrayList, zzgr.getThemeProvider());
        if (collectionZzZ.size() == 0) {
            return;
        }
        Collection<com.aspose.words.internal.zz4> collectionZzM = zzzp.zzM(collectionZzZ.size());
        Iterator<zz8D> it = collectionZzZ.iterator();
        while (it.hasNext()) {
            collectionZzM.add(it.next().zzU(zzgr.zzZPL()));
        }
    }
}
