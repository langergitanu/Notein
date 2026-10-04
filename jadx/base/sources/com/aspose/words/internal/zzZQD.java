package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZQD<E> {
    private zzZQE<E> zz3f;
    private E zz3g;

    public zzZQD(E e, zzZQE<E> zzzqe) {
        this.zz3g = e;
        this.zz3f = zzzqe;
    }

    public final E getValue() {
        return this.zz3g;
    }

    public final zzZQD<E> zzl5() {
        int iIndexOf = this.zz3f.indexOf(this.zz3g) + 1;
        if (iIndexOf < this.zz3f.size()) {
            return new zzZQD<>(this.zz3f.get(iIndexOf), this.zz3f);
        }
        return null;
    }
}
