package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public class zzYGS implements zzYGK, zzYGQ {

    /* JADX INFO: renamed from: eF */
    private Collection<Object> f50827eF;

    public zzYGS(Collection<Object> collection) {
        this.f50827eF = new ArrayList(collection);
    }

    @Override // java.lang.Iterable
    public Iterator<Object> iterator() {
        return zzZ(null).iterator();
    }

    @Override // com.aspose.words.internal.zzYGK
    public final Collection<Object> zzZ(zzYGL<Object> zzygl) {
        if (zzygl == null) {
            return new ArrayList(this.f50827eF);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f50827eF) {
            if (zzygl.zzWP(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
