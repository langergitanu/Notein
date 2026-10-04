package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzD1 extends zz80 implements Cloneable {
    private zzEZ zzZ9T;
    private zzCY zzZ9U;
    private zzCY zzZ9V;
    private double zzZ9W = 1.0d;
    private zzCY zzZ9X;
    private zz30 zzZa5;
    private String[] zzZcM;
    private zz10 zzZjm;
    private zzK1 zzZjn;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    private static zzCY zzZ(zzCY zzcy) {
        if (zzcy != null) {
            return (zzCY) zzcy.zzZM2();
        }
        return null;
    }

    public final void zzI(String[] strArr) {
        this.zzZcM = strArr;
    }

    public final void zzW(zzCY zzcy) {
        this.zzZ9U = zzcy;
    }

    public final void zzX(zzCY zzcy) {
        this.zzZ9V = zzcy;
    }

    public final void zzY(zzCY zzcy) {
        this.zzZ9X = zzcy;
    }

    public final void zzYb(double d) {
        this.zzZ9W = d;
    }

    public final zzEZ zzZHm() {
        if (this.zzZ9T == null) {
            this.zzZ9T = new zzEZ();
        }
        return this.zzZ9T;
    }

    public final zzCY zzZHn() {
        if (this.zzZ9U == null) {
            this.zzZ9U = new zzCY();
        }
        return this.zzZ9U;
    }

    public final zzCY zzZHo() {
        if (this.zzZ9V == null) {
            this.zzZ9V = new zzCY();
        }
        return this.zzZ9V;
    }

    public final double zzZHp() {
        return this.zzZ9W;
    }

    public final zzCY zzZHq() {
        if (this.zzZ9X == null) {
            this.zzZ9X = new zzCY();
        }
        return this.zzZ9X;
    }

    public final zzD1 zzZHr() {
        zzD1 zzd1 = (zzD1) memberwiseClone();
        zzd1.zzZ9X = zzZ(this.zzZ9X);
        zzd1.zzZ9V = zzZ(this.zzZ9V);
        zzd1.zzZ9U = zzZ(this.zzZ9U);
        zzEZ zzez = this.zzZ9T;
        if (zzez != null) {
            zzd1.zzZ9T = (zzEZ) zzez.zzZM2();
        }
        zzK1 zzk1 = this.zzZjn;
        if (zzk1 != null) {
            zzd1.zzZjn = zzk1.zzZTi();
        }
        zz30 zz30Var = this.zzZa5;
        if (zz30Var != null) {
            zzd1.zzZa5 = zz30Var.zzZw2();
        }
        zz10 zz10Var = this.zzZjm;
        if (zz10Var != null) {
            zzd1.zzZjm = zz10Var.zzZtJ();
        }
        String[] strArr = this.zzZcM;
        if (strArr != null) {
            zzd1.zzZcM = new String[strArr.length];
            int i = 0;
            while (true) {
                String[] strArr2 = this.zzZcM;
                if (i >= strArr2.length) {
                    break;
                }
                zzd1.zzZcM[i] = strArr2[i];
                i++;
            }
        }
        zzd1.setExtensions(zzZBz());
        return zzd1;
    }

    public final zz30 zzZHw() {
        return this.zzZa5;
    }

    public final String[] zzZM1() {
        return this.zzZcM;
    }

    public final zz10 zzZTl() {
        return this.zzZjm;
    }

    public final zzK1 zzZTm() {
        return this.zzZjn;
    }

    public final void zzY(zz30 zz30Var) {
        this.zzZa5 = zz30Var;
    }

    public final void zzZ(zzEZ zzez) {
        this.zzZ9T = zzez;
    }

    public final void zzZ(zzK1 zzk1) {
        this.zzZjn = zzk1;
    }

    public final void zzZ(zz10 zz10Var) {
        this.zzZjm = zz10Var;
    }
}
