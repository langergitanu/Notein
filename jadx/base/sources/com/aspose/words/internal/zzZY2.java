package com.aspose.words.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzZY2<T> implements Iterable<Map.Entry<String, T>> {
    private zzZY0 zzbB;
    private int zzby;
    private zzZQH<String, T> zzbA = new zzZQH<>();
    private HashMap<T, String> zzbz = new HashMap<>();

    public zzZY2(zzZY0 zzzy0, int i) {
        this.zzby = i;
        this.zzbB = zzzy0;
    }

    public final int getCount() {
        return this.zzbA.getCount();
    }

    @Override // java.lang.Iterable
    public final Iterator<Map.Entry<String, T>> iterator() {
        return this.zzbA.iterator();
    }

    public final String zzf(T t) {
        String str = (String) zzQW.zzZ(this.zzbz, t);
        if (str != null) {
            return str;
        }
        String strZzW7 = this.zzbB.zzW7(this.zzby);
        this.zzbz.put(t, strZzW7);
        this.zzbA.set(strZzW7, t);
        return strZzW7;
    }
}
