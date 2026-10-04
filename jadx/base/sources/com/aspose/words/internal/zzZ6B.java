package com.aspose.words.internal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ6B implements zzZ6I {
    protected static final Map zzWmn;
    protected static final Set zzWmo;

    static {
        HashSet hashSet = new HashSet();
        zzWmo = hashSet;
        HashMap map = new HashMap();
        zzWmn = map;
        hashSet.add(zzZ96.zzWyz);
        hashSet.add(zzZ96.zzWz2);
        hashSet.add(zzZ96.zzWyy);
        hashSet.add(zzZ96.zzWyx);
        hashSet.add(zzZ9K.zzWz2);
        hashSet.add(zzZ9K.zzWz4);
        hashSet.add(zzZ9K.zzWz3);
        hashSet.add(zzZ9K.zzWyU);
        hashSet.add(zzZ8R.zzWu1);
        hashSet.add(zzZ8R.zzWu2);
        hashSet.add(zzZ8R.zzWu0);
        map.put(zzZAE.zzWEO, new zzZ86(zzZAE.zzWEQ, zzZC8.zzWHS));
    }

    @Override // com.aspose.words.internal.zzZ6I
    public final zzZ86 zzZ(zzZ86 zzz86) {
        if (zzWmo.contains(zzz86.zzXJk())) {
            return new zzZ86(zzZ96.zzWyA, zzZC8.zzWHS);
        }
        Map map = zzWmn;
        return map.containsKey(zzz86.zzXJk()) ? (zzZ86) map.get(zzz86.zzXJk()) : zzz86;
    }
}
