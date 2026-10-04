package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz4H extends zz80 implements Cloneable {
    private String mName;
    private ArrayList<zz98> zzro;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final String getName() {
        return this.mName;
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

    public final zz4H zzZxL() {
        zz4H zz4h = (zz4H) memberwiseClone();
        zz4h.zzro = new ArrayList<>(this.zzro.size());
        Iterator<zz98> it = this.zzro.iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZQG.zzZ(zz4h.zzro, it.next().zzZFO());
        }
        return zz4h;
    }
}
