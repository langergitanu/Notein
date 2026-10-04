package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz7N extends zz98 implements Cloneable {
    private String mName;
    private zz6C zzZ3G = new zz6C();
    private String zzZ3H;
    private ArrayList<zz98> zzro;

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

    public final void zz4(ArrayList<zz98> arrayList) {
        this.zzro = arrayList;
    }

    public final ArrayList<zz98> zzAy() {
        return this.zzro;
    }

    public final void zzOF(String str) {
        this.zzZ3H = str;
    }

    @Override // com.aspose.words.zz98
    public final void zzZ(zzZCK zzzck) {
        zzzck.zzZ(this);
    }

    public final zz6C zzZAS() {
        return this.zzZ3G;
    }

    public final String zzZAT() {
        return this.zzZ3H;
    }

    @Override // com.aspose.words.zz98
    public final zz98 zzZFO() {
        zz7N zz7n = (zz7N) memberwiseClone();
        zz7n.zzro = new ArrayList<>(this.zzro.size());
        Iterator<zz98> it = this.zzro.iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZQG.zzZ(zz7n.zzro, it.next().zzZFO());
        }
        return zz7n;
    }

    @Override // com.aspose.words.zz98
    public final int zzZSn() {
        return 5;
    }
}
