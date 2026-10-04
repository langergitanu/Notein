package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzCL implements Cloneable {
    private static zzZCA zzZ9l;
    private zz4A zzZ9m;
    private zz0N zzZ9p;
    private zz10 zzZ9q;
    private zz10 zzZ9o = new zz10();
    private ArrayList<zz4A> zzZ9n = new ArrayList<>();

    static {
        zzZCB zzzcbZzZzY = zz48.zzZx8().zzZzY();
        zzzcbZzZzY.zzL(1, 1);
        zzZ9l = new zz6Q(zzzcbZzZzY);
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final boolean isEmpty() {
        if (this.zzZ9q == null && this.zzZ9n.size() <= 0) {
            zz4A zz4a = this.zzZ9m;
            if (zz4a == null) {
                return true;
            }
            if (zz4a.zzZxp().isEmpty() && ((this.zzZ9m.zzZCZ() == null || this.zzZ9m.zzZCZ().zzZtK().isEmpty()) && this.zzZ9m.zzZxo().isEmpty())) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList<zz4A> zzMi() {
        return this.zzZ9n;
    }

    public final void zzX(zz10 zz10Var) {
        this.zzZ9q = zz10Var;
    }

    public final zz0N zzZGp() {
        if (this.zzZ9p == null) {
            this.zzZ9p = new zz0N();
        }
        return this.zzZ9p;
    }

    public final void zzZGq() {
        if (this.zzZ9n.size() == 0) {
            this.zzZ9n.add(zzZGt());
        }
    }

    public final zzCL zzZGr() {
        zz4A zz4a;
        zzCL zzcl = (zzCL) memberwiseClone();
        zz10 zz10Var = this.zzZ9q;
        if (zz10Var != null) {
            zzcl.zzZ9q = zz10Var.zzZtJ();
        }
        zzcl.zzZ9o = this.zzZ9o.zzZtJ();
        zz0N zz0n = this.zzZ9p;
        if (zz0n != null) {
            zzcl.zzZ9p = zz0n.zzZsW();
        }
        zzcl.zzZ9n = new ArrayList<>();
        Iterator<zz4A> it = this.zzZ9n.iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZQG.zzZ(zzcl.zzZ9n, it.next().zzZxr());
        }
        zzcl.zzZ9m = (this.zzZ9n.size() != 0 || (zz4a = this.zzZ9m) == null) ? null : zz4a.zzZxr();
        return zzcl;
    }

    public final zz4A zzZGs() {
        zz4A zz4a = new zz4A();
        zz4a.zzZxp().zzY(zzZ9l);
        com.aspose.words.internal.zzZQG.zzZ(this.zzZ9n, zz4a);
        return zz4a;
    }

    public final zz4A zzZGt() {
        if (this.zzZ9m == null) {
            if (this.zzZ9n.size() > 0) {
                this.zzZ9m = this.zzZ9n.get(0);
            } else {
                zz4A zz4a = new zz4A();
                this.zzZ9m = zz4a;
                zz4a.zzZxp().zzY(zzZ9l);
            }
        }
        return this.zzZ9m;
    }

    public final zz10 zzZHh() {
        zz10 zz10Var = this.zzZ9q;
        return zz10Var == null ? this.zzZ9o : zz10Var;
    }

    public final zz30 zzZHj() {
        return zzZGt().zzZxp().zzZHc();
    }
}
