package com.aspose.words.internal;

import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zz76 implements Iterable<zz77> {
    private zzZYT<zz77> zzmQ;

    public zz76() {
        this.zzmQ = new zzZYT<>(false);
    }

    public final boolean contains(String str) {
        return this.zzmQ.containsKey(str);
    }

    public final int getCount() {
        return this.zzmQ.getCount();
    }

    @Override // java.lang.Iterable
    public final Iterator<zz77> iterator() {
        return this.zzmQ.zzl9().iterator();
    }

    public final void remove(String str) {
        this.zzmQ.remove(str);
    }

    public final void zzY(zz77 zz77Var) {
        this.zzmQ.zzB(zz77Var.getName(), zz77Var);
    }

    public final zz77 zzY8(String str) {
        return (zz77) zzQW.zzZ((zzZYT) this.zzmQ, str);
    }

    public zz76(Comparator<String> comparator) {
        this.zzmQ = new zzZYT<>(comparator);
    }
}
