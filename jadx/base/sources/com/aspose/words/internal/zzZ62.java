package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ62 implements zzYGQ {
    private List zzWlW;
    private Map zzZSo = new HashMap();

    public zzZ62(Collection<zzZ63> collection) {
        this.zzWlW = new ArrayList();
        for (zzZ63 zzz63 : collection) {
            zzZ66 zzz66ZzXHf = zzz63.zzXHf();
            ArrayList arrayList = (ArrayList) this.zzZSo.get(zzz66ZzXHf);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.zzZSo.put(zzz66ZzXHf, arrayList);
            }
            arrayList.add(zzz63);
        }
        this.zzWlW = new ArrayList(collection);
    }

    @Override // java.lang.Iterable
    public final Iterator<zzZ63> iterator() {
        return zzXH9().iterator();
    }

    public final Collection<zzZ63> zzXH9() {
        return new ArrayList(this.zzWlW);
    }
}
