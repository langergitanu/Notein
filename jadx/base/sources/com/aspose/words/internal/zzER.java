package com.aspose.words.internal;

import java.util.HashMap;

/* JADX INFO: loaded from: classes5.dex */
final class zzER<T> {
    private HashMap<byte[], Integer> zzwv = new HashMap<>();
    private zzZYV<T> zzwu = new zzZYV<>();

    private int zzX(byte[] bArr, zzEP zzep) {
        return zzZ(zzZY(bArr), zzep);
    }

    private int zzZY(byte[] bArr) {
        if (this.zzwv.containsKey(bArr)) {
            return this.zzwv.get(bArr).intValue();
        }
        int iHashCode = zzIL.zz3(bArr).hashCode();
        this.zzwv.put(bArr, Integer.valueOf(iHashCode));
        return iHashCode;
    }

    public final int getCount() {
        return this.zzwu.getCount();
    }

    public final T zzVY(int i) {
        return this.zzwu.zzVY(i);
    }

    public final T zzY(byte[] bArr, zzEP zzep) {
        return this.zzwu.get(zzX(bArr, zzep));
    }

    public final void zzZ(byte[] bArr, zzEP zzep, T t) {
        this.zzwu.set(zzX(bArr, zzep), t);
    }

    private static int zzZ(int i, zzEP zzep) {
        return (i * 397) ^ ((zzep == null || !zzep.zzDX()) ? 0 : zzep.hashCode());
    }
}
