package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zz63 implements zzZCK {
    private zz60 zzZ28;
    private zz93 zzZ29;
    private zz61 zzZ2a;
    private zz61 zzZ2b;
    private zz8Z zzZ7J;

    private zz63(zz8Z zz8z) {
        this.zzZ7J = zz8z;
    }

    private static zz60 zzH(zz93 zz93Var) {
        return (zz93Var == null || zz93Var.zzZCX() == null || zz93Var.zzZCX().zzZwj() == null) ? new zz60() : zz93Var.zzZCX().zzZwj();
    }

    private void zzK(Iterable<zz98> iterable) {
        if (iterable == null) {
            return;
        }
        Iterator<zz98> it = iterable.iterator();
        while (it.hasNext()) {
            it.next().zzZ(this);
        }
    }

    public static zz61 zzX(zz8Z zz8z) {
        zz63 zz63Var = new zz63(zz8z);
        zz99 zz99VarZzZCv = zz8z.zzZCG().zzZCv();
        zz63Var.zzZ29 = zz8z.zzZEk().zzZEl();
        zz63Var.zzZ28 = zzH(zz8z.zzZEk().zzZ(zz8z.zzZEk().zzZEl().zzZEC(), zz99VarZzZCv.getName()));
        zz63Var.zzW(zz99VarZzZCv);
        return zz63Var.zzZ2b;
    }

    private zz60 zzZz0() {
        zz60 zz60VarZzZyX = this.zzZ28;
        if (this.zzZ2a.zzZ1V != null) {
            zz60VarZzZyX = zz60VarZzZyX.zzZyX();
            zz60VarZzZyX.zzY(this.zzZ2a.zzZ1V);
        }
        zz60 zz60Var = this.zzZ2a.zzZ1W;
        if (zz60Var == this.zzZ28) {
            return zz60VarZzZyX;
        }
        zz60 zz60VarZzZyX2 = zz60Var.zzZyX();
        zz60VarZzZyX2.zzY(zz60VarZzZyX);
        return zz60VarZzZyX2;
    }

    @Override // com.aspose.words.zzZCK
    public final void zzW(zz99 zz99Var) {
        zz61 zz61Var = new zz61();
        zz61Var.zzZ23 = this.zzZ29;
        zz93 zz93VarZzZ = this.zzZ7J.zzZEk().zzZ(this.zzZ29.zzZEC(), zz99Var.getName());
        zz61Var.zzZ22 = zz93VarZzZ;
        zz61Var.zzZ20 = zz99Var;
        zz61Var.zzZ1W = zzH(zz93VarZzZ);
        zz61 zz61Var2 = this.zzZ2a;
        if (zz61Var2 == null) {
            this.zzZ2b = zz61Var;
        } else {
            com.aspose.words.internal.zzZQG.zzZ(zz61Var2.zzZ1Y, zz61Var);
            zz61Var.zzZ1S = this.zzZ2a;
        }
        zz61 zz61Var3 = this.zzZ2a;
        this.zzZ2a = zz61Var;
        Iterator<zz98> it = zz99Var.zzAy().iterator();
        while (it.hasNext()) {
            it.next().zzZ(this);
        }
        this.zzZ2a = zz61Var3;
    }

    @Override // com.aspose.words.zzZCK
    public final void zzZ(zzJG zzjg) {
        this.zzZ2a.zzZ1X = zzjg;
    }

    @Override // com.aspose.words.zzZCK
    public final void zzZ(zzC5 zzc5) {
        for (zzZZV zzzzv : zzc5.zzZFQ()) {
            if (zz9P.zzk(zzzzv.zzNi(), this.zzZ7J.zzZCK().zzZ(zzzzv.zzZrY(), zzzzv.zzZrX(), zzzzv.zzZAS(), this.zzZ29, zzZz0()), zz9P.zzPJ(zzzzv.getValue()))) {
                zzK(zzzzv.zzAy());
                return;
            }
        }
        if (zzc5.zzZFP() != null) {
            zzK(zzc5.zzZFP().zzAy());
        }
    }

    @Override // com.aspose.words.zzZCK
    public final void zzZ(zzBD zzbd) {
        this.zzZ2a.zzZ1U = zzbd;
    }

    @Override // com.aspose.words.zzZCK
    public final void zzZ(zz4U zz4u) {
        this.zzZ2a.zzZ1T = zz4u;
    }

    @Override // com.aspose.words.zzZCK
    public final void zzZ(zz7N zz7n) {
        ArrayList<zz93> arrayListZzZ = this.zzZ7J.zzZCL().zzZ(zz7n.zzZAS(), this.zzZ29);
        zz93 zz93Var = this.zzZ29;
        Iterator<zz93> it = arrayListZzZ.iterator();
        while (it.hasNext()) {
            this.zzZ29 = it.next();
            Iterator<zz98> it2 = zz7n.zzAy().iterator();
            while (it2.hasNext()) {
                it2.next().zzZ(this);
            }
        }
        this.zzZ29 = zz93Var;
    }

    @Override // com.aspose.words.zzZCK
    public final void zzW(zz8X zz8x) {
        this.zzZ2a.zzZ1Z = zz8x;
    }

    @Override // com.aspose.words.zzZCK
    public final void zzZ(zz60 zz60Var) {
        this.zzZ2a.zzZ1V = zz60Var;
    }

    @Override // com.aspose.words.zzZCK
    public final void zzZ(zz3J zz3j) {
        this.zzZ2a.zzZ21 = this.zzZ7J.zzZCL().zzZ(zz3j.zzZAS(), this.zzZ29);
    }
}
