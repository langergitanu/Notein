package com.aspose.words.internal;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zzZXG {
    private String zzF3;
    private zzD3<zzZXH> zza6 = new zzD3<>();

    public zzZXG(String str, Iterable<zzZXH> iterable) {
        this.zzF3 = str;
        for (zzZXH zzzxh : iterable) {
            this.zza6.set(zzzxh.getStyle(), zzzxh);
        }
    }

    public final zzZXH zzSB(int i) {
        zzZXH zzzxh = this.zza6.get(i);
        if (zzzxh != null) {
            return zzzxh;
        }
        zzZXH zzzxh2 = this.zza6.get(i & (-5));
        if (zzzxh2 != null) {
            return zzzxh2;
        }
        zzZXH zzzxh3 = this.zza6.get(i & (-9));
        if (zzzxh3 != null) {
            return zzzxh3;
        }
        zzZXH zzzxh4 = this.zza6.get(i & (-3));
        if (zzzxh4 != null) {
            return zzzxh4;
        }
        zzZXH zzzxh5 = this.zza6.get(i & (-2));
        if (zzzxh5 != null) {
            return zzzxh5;
        }
        zzZXH zzzxh6 = this.zza6.get(0);
        if (zzzxh6 != null) {
            return zzzxh6;
        }
        zzZXH zzzxh7 = this.zza6.get(2);
        if (zzzxh7 != null) {
            return zzzxh7;
        }
        zzZXH zzzxh8 = this.zza6.get(i | 1);
        if (zzzxh8 != null) {
            return zzzxh8;
        }
        Iterator<zzZXH> it = this.zza6.zzCJ().iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }
}
