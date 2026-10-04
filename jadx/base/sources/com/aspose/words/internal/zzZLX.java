package com.aspose.words.internal;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZLX {
    private Map<String, zzZLZ> zzZSo = new HashMap();

    public final void clear() {
        this.zzZSo.clear();
    }

    public final int getCount() {
        return this.zzZSo.size();
    }

    public final Collection<zzZLZ> values() {
        return this.zzZSo.values();
    }

    public final zzZLZ zzS(zzZN4 zzzn4) {
        if (zzzn4 == null) {
            return null;
        }
        return this.zzZSo.get(zzzn4.getName());
    }

    public final boolean zzT(zzZN4 zzzn4) {
        return this.zzZSo.containsKey(zzzn4.getName());
    }

    public final void zzY(zzZN4 zzzn4, zzZLZ zzzlz) {
        this.zzZSo.put(zzzn4.getName(), zzzlz);
    }

    public final void zzZ(zzZN4 zzzn4, zzZLZ zzzlz) {
        this.zzZSo.put(zzzn4.getName(), zzzlz);
    }
}
