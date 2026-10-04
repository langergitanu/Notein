package com.aspose.words.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzYPK {
    private final Map zzVUq;

    public zzYPK() {
        HashMap map = new HashMap();
        map.put(zzZ9U.zzWB9.getId(), 16);
        zzZDA zzzda = zzZ96.zzWya;
        map.put(zzzda.getId(), 24);
        map.put(zzZ96.zzWwu.getId(), 24);
        map.put(zzzda.getId(), 24);
        map.put(zzZ9O.zzWAt.getId(), 16);
        map.put(zzZ9O.zzWAl.getId(), 24);
        map.put(zzZ9O.zzWAd.getId(), 32);
        map.put(zzZ9O.zzWAp.getId(), 16);
        map.put(zzZ9O.zzWAh.getId(), 24);
        map.put(zzZ9O.zzWA9.getId(), 32);
        map.put(zzZ9O.zzWAo.getId(), 16);
        map.put(zzZ9O.zzWAg.getId(), 24);
        map.put(zzZ9O.zzWA8.getId(), 32);
        map.put(zzZ9O.zzWAr.getId(), 16);
        map.put(zzZ9O.zzWAj.getId(), 24);
        map.put(zzZ9O.zzWAb.getId(), 32);
        map.put(zzZ9O.zzWAs.getId(), 16);
        map.put(zzZ9O.zzWAk.getId(), 24);
        map.put(zzZ9O.zzWAc.getId(), 32);
        map.put(zzZ9O.zzWAq.getId(), 16);
        map.put(zzZ9O.zzWAi.getId(), 24);
        map.put(zzZ9O.zzWAa.getId(), 32);
        map.put(zzZ96.zzWy4.getId(), 20);
        map.put(zzZ96.zzWy3.getId(), 28);
        map.put(zzZ96.zzWy2.getId(), 32);
        map.put(zzZ96.zzWy1.getId(), 48);
        map.put(zzZ96.zzWy0.getId(), 64);
        map.put(zzZ9M.zzWzb.getId(), 16);
        map.put(zzZ9M.zzWza.getId(), 24);
        map.put(zzZ9M.zzWz9.getId(), 32);
        map.put(zzZ9M.zzWz8.getId(), 16);
        map.put(zzZ9M.zzWz7.getId(), 24);
        map.put(zzZ9M.zzWz6.getId(), 32);
        map.put(zzZ9X.zzWBz.getId(), 16);
        map.put(zzZ9X.zzWBy.getId(), 16);
        map.put(zzZ9K.zzWz0.getId(), 8);
        map.put(zzZAE.zzWEX.getId(), 32);
        map.put(zzZAE.zzWF0.getId(), 32);
        map.put(zzZ96.zzWwy.getId(), 16);
        map.put(zzZ96.zzWwz.getId(), 24);
        map.put(zzZ96.zzWwx.getId(), 16);
        map.put(zzZ96.zzWwB.getId(), 16);
        map.put(zzZ96.zzWww.getId(), 5);
        this.zzVUq = Collections.unmodifiableMap(map);
    }

    public final int zzT(zzZ86 zzz86) {
        Integer num = (Integer) this.zzVUq.get(zzz86.zzXJk().getId());
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public final int zzwA(String str) {
        Integer num = (Integer) this.zzVUq.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }
}
