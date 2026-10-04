package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz99 extends zz98 implements Cloneable {
    private String mName;
    private String zzZ5G;
    private int zzZ5H = 0;
    private String zzZ6a;
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

    public final void zzIX(int i) {
        this.zzZ5H = i;
    }

    public final void zzPF(String str) {
        this.zzZ5G = str;
    }

    public final void zzPG(String str) {
        this.zzZ6a = str;
    }

    @Override // com.aspose.words.zz98
    public final void zzZ(zzZCK zzzck) {
        zzzck.zzW(this);
    }

    public final String zzZDV() {
        return this.zzZ6a;
    }

    public final String zzZDj() {
        return this.zzZ5G;
    }

    public final int zzZDk() {
        return this.zzZ5H;
    }

    @Override // com.aspose.words.zz98
    public final zz98 zzZFO() {
        zz99 zz99Var = (zz99) memberwiseClone();
        zz99Var.zzro = new ArrayList<>(this.zzro.size());
        Iterator<zz98> it = this.zzro.iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZQG.zzZ(zz99Var.zzro, it.next().zzZFO());
        }
        return zz99Var;
    }

    @Override // com.aspose.words.zz98
    public final int zzZSn() {
        return 3;
    }
}
