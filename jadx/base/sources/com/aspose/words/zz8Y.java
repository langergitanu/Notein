package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz8Y {
    private com.aspose.words.internal.zzZYV<ArrayList<zz2O>> zzZ5q = new com.aspose.words.internal.zzZYV<>();

    public final void zzZ(zz2O zz2o, int i) {
        if (!this.zzZ5q.zzVE(i)) {
            this.zzZ5q.add(i, new ArrayList<>());
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzZ5q.get(i), zz2o);
    }

    public final Iterable<zz2O> zzZCD() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.zzZ5q.getCount(); i++) {
            Iterator<zz2O> it = this.zzZ5q.get(this.zzZ5q.zzT3(i)).iterator();
            while (it.hasNext()) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zz2O>) arrayList, it.next());
            }
        }
        return arrayList;
    }
}
