package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zz7 extends zzZL implements Cloneable {
    private ArrayList<zzZL> zzZc = new ArrayList<>();

    public final void clear() {
        this.zzZc.clear();
    }

    public final int getCount() {
        return this.zzZc.size();
    }

    @Override // com.aspose.words.internal.zzZL
    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void removeAt(int i) {
        if (i < 0 || i >= this.zzZc.size()) {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: index");
        }
        this.zzZc.remove(i);
    }

    @Override // com.aspose.words.internal.zzZL
    public final zzZL zz1() {
        return zzP(true);
    }

    public final zzZL zzN(int i) {
        return this.zzZc.get(i);
    }

    public zz7 zzP(boolean z) {
        zz7 zz7Var = (zz7) memberwiseClone();
        zz7Var.zzZc = z ? zzW(zz7Var) : new ArrayList<>();
        return zz7Var;
    }

    public final int zzW(zzZL zzzl) {
        return this.zzZc.indexOf(zzzl);
    }

    public final void zzX(zzZL zzzl) {
        zzzl.zzV(this);
        zzZQG.zzZ(this.zzZc, zzzl);
    }

    @Override // com.aspose.words.internal.zzZL
    public void zzZ(zz6 zz6Var) throws Exception {
        Iterator<zzZL> it = this.zzZc.iterator();
        while (it.hasNext()) {
            it.next().zzZ(zz6Var);
        }
    }

    private ArrayList<zzZL> zzW(zz7 zz7Var) {
        ArrayList<zzZL> arrayList = new ArrayList<>();
        for (int i = 0; i < this.zzZc.size(); i++) {
            zzZL zzzlZz1 = this.zzZc.get(i).zz1();
            zzzlZz1.zzV(zz7Var);
            arrayList.add(i, zzzlZz1);
        }
        return arrayList;
    }

    public final void zzZ(int i, zzZL zzzl) {
        zzzl.zzV(this);
        this.zzZc.add(i, zzzl);
    }

    public final <T extends zzZL> void zzZ(int i, Iterable<T> iterable) {
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            zzZ(i, it.next());
            i++;
        }
    }

    public final <T extends zzZL> void zzZ(Iterable<T> iterable) {
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            zzX(it.next());
        }
    }

    public final <T extends zzZL> void zzZ(T[] tArr) {
        for (T t : tArr) {
            zzX(t);
        }
    }
}
