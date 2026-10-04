package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz11 implements Cloneable {
    private zz0N zzYY3;
    private zz10 zzYY4;
    private ArrayList<zz4A> zzZ9n;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final ArrayList<zz4A> zzMi() {
        if (this.zzZ9n == null) {
            this.zzZ9n = new ArrayList<>();
        }
        return this.zzZ9n;
    }

    public final void zzW(zz10 zz10Var) {
        this.zzYY4 = zz10Var;
    }

    public final void zzY(zz4A zz4a) {
        zz4a.zzX(this);
        com.aspose.words.internal.zzZQG.zzZ(zzMi(), zz4a);
    }

    public final zz10 zzZtK() {
        if (this.zzYY4 == null) {
            this.zzYY4 = new zz10();
        }
        return this.zzYY4;
    }

    public final zz0N zzZtL() {
        if (this.zzYY3 == null) {
            this.zzYY3 = new zz0N();
        }
        return this.zzYY3;
    }

    public final zz11 zzZtM() {
        zz11 zz11Var = (zz11) memberwiseClone();
        zz0N zz0n = this.zzYY3;
        if (zz0n != null) {
            zz11Var.zzYY3 = zz0n.zzZsW();
        }
        zz10 zz10Var = this.zzYY4;
        if (zz10Var != null) {
            zz11Var.zzYY4 = zz10Var.zzZtJ();
        }
        if (this.zzZ9n != null) {
            zz11Var.zzZ9n = new ArrayList<>(this.zzZ9n.size());
            Iterator<zz4A> it = this.zzZ9n.iterator();
            while (it.hasNext()) {
                zz11Var.zzY(it.next().zzZxr());
            }
        }
        return zz11Var;
    }
}
