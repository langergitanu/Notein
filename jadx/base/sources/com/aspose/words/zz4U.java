package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz4U extends zz98 implements Cloneable {
    private static zz4U zzZ15;
    private ArrayList<zz4V> zzUY;

    static {
        zz4U zz4u = new zz4U();
        zzZ15 = zz4u;
        zz4u.zzUY = new ArrayList<>();
    }

    public static zz4U zzZy1() {
        return zzZ15;
    }

    @Override // com.aspose.words.zz98
    public final Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void zz9(ArrayList<zz4V> arrayList) {
        this.zzUY = arrayList;
    }

    @Override // com.aspose.words.zz98
    public final void zzZ(zzZCK zzzck) {
        zzzck.zzZ(this);
    }

    @Override // com.aspose.words.zz98
    public final zz98 zzZFO() {
        zz4U zz4u = (zz4U) memberwiseClone();
        zz4u.zzUY = new ArrayList<>(this.zzUY.size());
        Iterator<zz4V> it = this.zzUY.iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZQG.zzZ(zz4u.zzUY, it.next().zzZy2());
        }
        return zz4u;
    }

    @Override // com.aspose.words.zz98
    public final int zzZSn() {
        return 7;
    }

    public final ArrayList<zz4V> zzl9() {
        return this.zzUY;
    }
}
