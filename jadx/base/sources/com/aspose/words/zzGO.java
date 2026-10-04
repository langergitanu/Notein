package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzGO implements Cloneable {
    private zz33 zzZg2;
    private int zzZg4;
    private zzHK zzZg5 = zzHK.zzYR(180.0d);
    private double zzZg3 = 1.0d;

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!com.aspose.words.internal.zzZ4.zzW(this, obj)) {
            return false;
        }
        zzGO zzgo = (zzGO) obj;
        return zzgo.zzZg4 == this.zzZg4 && com.aspose.words.internal.zzAN.zzL(zzgo.zzZg3, this.zzZg3) && com.aspose.words.internal.zzZKO.equals(zzgo.zzZg5, this.zzZg5) && com.aspose.words.internal.zzZKO.equals(zzgo.zzZg2, this.zzZg2);
    }

    public final int hashCode() {
        int iHashCode = (this.zzZg5.hashCode() ^ this.zzZg4) ^ com.aspose.words.internal.zzZKP.zzZ9(this.zzZg3);
        zz33 zz33Var = this.zzZg2;
        return zz33Var != null ? iHashCode ^ zz33Var.hashCode() : iHashCode;
    }

    public final void zzLA(int i) {
        this.zzZg4 = i;
    }

    public final void zzY(zzHK zzhk) {
        this.zzZg5 = zzhk;
    }

    public final void zzYH(double d) {
        this.zzZg3 = d;
    }

    public final void zzZ(zz33 zz33Var) {
        this.zzZg2 = zz33Var;
    }

    public final zzGO zzZPA() {
        zzGO zzgo = (zzGO) memberwiseClone();
        zzgo.zzZg5 = this.zzZg5.zzZQT();
        zzgo.zzZg4 = this.zzZg4;
        zzgo.zzZg3 = this.zzZg3;
        zz33 zz33Var = this.zzZg2;
        if (zz33Var != null) {
            zzgo.zzZg2 = zz33Var.zzZw6();
        }
        return zzgo;
    }

    public final zz33 zzZPw() {
        return this.zzZg2;
    }

    public final double zzZPx() {
        return this.zzZg3;
    }

    public final int zzZPy() {
        return this.zzZg4;
    }

    public final zzHK zzZPz() {
        return this.zzZg5;
    }
}
