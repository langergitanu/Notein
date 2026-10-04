package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZZV extends zz80 implements Cloneable {
    private String mName;
    private String mValue;
    private int zzG4;
    private int zzYWT;
    private zz6C zzZ3G = new zz6C();
    private int zzZ6k = 0;
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

    public final String getValue() {
        return this.mValue;
    }

    public final void setName(String str) {
        this.mName = str;
    }

    public final void setValue(String str) {
        this.mValue = str;
    }

    public final void zz4(ArrayList<zz98> arrayList) {
        this.zzro = arrayList;
    }

    public final ArrayList<zz98> zzAy() {
        return this.zzro;
    }

    public final void zzGu(int i) {
        this.zzZ6k = i;
    }

    public final void zzGv(int i) {
        this.zzYWT = i;
    }

    public final void zzJv(int i) {
        this.zzG4 = i;
    }

    public final int zzNi() {
        return this.zzG4;
    }

    public final zz6C zzZAS() {
        return this.zzZ3G;
    }

    public final zzZZV zzZrW() {
        zzZZV zzzzv = (zzZZV) memberwiseClone();
        zzzzv.zzro = new ArrayList<>(this.zzro.size());
        Iterator<zz98> it = this.zzro.iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZQG.zzZ(zzzzv.zzro, it.next().zzZFO());
        }
        return zzzzv;
    }

    public final int zzZrX() {
        return this.zzZ6k;
    }

    public final int zzZrY() {
        return this.zzYWT;
    }
}
