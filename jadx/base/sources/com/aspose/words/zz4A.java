package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz4A implements Cloneable {
    private zz49 zzZ0H;
    private zz30 zzZ0I;
    private zz11 zzZ5E;
    private ArrayList<zz47> zzZom;

    public zz4A() {
        this.zzZom = new ArrayList<>();
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final ArrayList<zz47> zzMf() {
        return this.zzZom;
    }

    public final void zzX(zz11 zz11Var) {
        this.zzZ5E = zz11Var;
        zzZxp().zzY(zz11Var.zzZtL());
        zzZxp().zzZHc().zzZ(this, zz11Var.zzZtL());
        zzZxo().zzZ(this, zz11Var.zzZtL());
    }

    public final void zzY(zz47 zz47Var) {
        zz47Var.zzZ(this);
        com.aspose.words.internal.zzZQG.zzZ(this.zzZom, zz47Var);
    }

    public final zz11 zzZCZ() {
        return this.zzZ5E;
    }

    public final zz47 zzZxn() {
        if (this.zzZom.size() > 0) {
            return this.zzZom.get(0);
        }
        return null;
    }

    public final zz30 zzZxo() {
        if (this.zzZ0I == null) {
            this.zzZ0I = new zz30();
        }
        return this.zzZ0I;
    }

    public final zz49 zzZxp() {
        if (this.zzZ0H == null) {
            this.zzZ0H = new zz49();
        }
        return this.zzZ0H;
    }

    public final String zzZxq() {
        StringBuilder sb = new StringBuilder();
        Iterator<zz47> it = this.zzZom.iterator();
        while (it.hasNext()) {
            zz31 zz31Var = (zz31) com.aspose.words.internal.zzZKW.zzZ(it.next(), zz31.class);
            if (zz31Var != null) {
                com.aspose.words.internal.zzZNH.zzU(sb, zz31Var.getText());
            }
        }
        return sb.toString();
    }

    public final zz4A zzZxr() {
        zz4A zz4a = (zz4A) memberwiseClone();
        zz49 zz49Var = this.zzZ0H;
        if (zz49Var != null) {
            zz4a.zzZ0H = zz49Var.zzZxm();
        }
        zz30 zz30Var = this.zzZ0I;
        if (zz30Var != null) {
            zz4a.zzZ0I = zz30Var.zzZw2();
        }
        if (this.zzZom != null) {
            zz4a.zzZom = new ArrayList<>(this.zzZom.size());
            Iterator<zz47> it = this.zzZom.iterator();
            while (it.hasNext()) {
                zz4a.zzY(it.next().zzZx7());
            }
        }
        return zz4a;
    }

    public zz4A(byte b) {
        this.zzZom = new ArrayList<>();
        this.zzZ0H = null;
        this.zzZ0I = null;
    }
}
