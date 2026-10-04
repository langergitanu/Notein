package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz33 implements Cloneable {
    private zzHK zzYZD;
    private zzHK zzYZE;
    private zzHK zzYZF;

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
        zz33 zz33Var = (zz33) obj;
        return com.aspose.words.internal.zzZKO.equals(zz33Var.zzYZF, this.zzYZF) && com.aspose.words.internal.zzZKO.equals(zz33Var.zzYZE, this.zzYZE) && com.aspose.words.internal.zzZKO.equals(zz33Var.zzYZD, this.zzYZD);
    }

    public final int hashCode() {
        zzHK zzhk = this.zzYZF;
        int iHashCode = zzhk != null ? zzhk.hashCode() : 0;
        zzHK zzhk2 = this.zzYZE;
        if (zzhk2 != null) {
            iHashCode ^= zzhk2.hashCode();
        }
        zzHK zzhk3 = this.zzYZD;
        return zzhk3 != null ? iHashCode ^ zzhk3.hashCode() : iHashCode;
    }

    public final void zzR(zzHK zzhk) {
        this.zzYZD = zzhk;
    }

    public final void zzS(zzHK zzhk) {
        this.zzYZE = zzhk;
    }

    public final void zzT(zzHK zzhk) {
        this.zzYZF = zzhk;
    }

    public final zzHK zzZw3() {
        return this.zzYZD;
    }

    public final zzHK zzZw4() {
        return this.zzYZE;
    }

    public final zzHK zzZw5() {
        return this.zzYZF;
    }

    public final zz33 zzZw6() {
        zz33 zz33Var = (zz33) memberwiseClone();
        zzHK zzhk = this.zzYZF;
        if (zzhk != null) {
            zz33Var.zzYZF = zzhk.zzZQT();
        }
        zzHK zzhk2 = this.zzYZE;
        if (zzhk2 != null) {
            zz33Var.zzYZE = zzhk2.zzZQT();
        }
        zzHK zzhk3 = this.zzYZD;
        if (zzhk3 != null) {
            zz33Var.zzYZD = zzhk3.zzZQT();
        }
        return zz33Var;
    }
}
