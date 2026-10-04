package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzC5 extends zz98 implements Cloneable {
    private String mName;
    private zz4H zzZ8l;
    private ArrayList<zzZZV> zzZ8m;

    public final String getName() {
        return this.mName;
    }

    @Override // com.aspose.words.zz98
    public final Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void setName(String str) {
        this.mName = str;
    }

    @Override // com.aspose.words.zz98
    public final void zzZ(zzZCK zzzck) {
        zzzck.zzZ(this);
    }

    @Override // com.aspose.words.zz98
    public final zz98 zzZFO() {
        zzC5 zzc5 = (zzC5) memberwiseClone();
        zzc5.zzZ8m = new ArrayList<>(this.zzZ8m.size());
        Iterator<zzZZV> it = this.zzZ8m.iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZQG.zzZ(zzc5.zzZ8m, it.next().zzZrW());
        }
        zz4H zz4h = this.zzZ8l;
        if (zz4h != null) {
            zzc5.zzZ8l = zz4h.zzZxL();
        }
        return zzc5;
    }

    public final zz4H zzZFP() {
        return this.zzZ8l;
    }

    public final ArrayList<zzZZV> zzZFQ() {
        return this.zzZ8m;
    }

    @Override // com.aspose.words.zz98
    public final int zzZSn() {
        return 1;
    }

    public final void zzc(ArrayList<zzZZV> arrayList) {
        this.zzZ8m = arrayList;
    }

    public final void zzZ(zz4H zz4h) {
        this.zzZ8l = zz4h;
    }
}
