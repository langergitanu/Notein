package com.aspose.words.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZSO {
    private zzZSO zz66;
    private zzZYT<String> zz67 = new zzZYT<>();

    public zzZSO(zzZSO zzzso) {
        this.zz66 = zzzso;
    }

    public final boolean zzWd(String str) {
        for (zzZSO zzzso = this; zzzso != null; zzzso = zzzso.zz66) {
            if (zzzso.zz67.containsKey(str)) {
                return true;
            }
        }
        return false;
    }

    public final zzZYT<String> zzmu() {
        return this.zz67;
    }

    public final Map<String, String> zzmv() {
        HashMap map = new HashMap();
        Iterator<Map.Entry<K, V>> it = this.zz67.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zzZQF.zzY(map, (String) entry.getKey(), (String) entry.getValue());
        }
        return map;
    }
}
