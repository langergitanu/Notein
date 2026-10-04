package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzHY {
    private int zzZhl;
    private int zzZhm;
    private int zzZhn;
    private int zzZho;
    private int zzZhp;
    private int zzZhq;

    public zzHY(zz64 zz64Var) {
        this.zzZhq = zzZ(zz64Var.zzHX(22));
        this.zzZhp = zzZ(zz64Var.zzHX(27));
        this.zzZho = zzY(zz64Var.zzHX(20));
        this.zzZhn = zzY(zz64Var.zzHX(25));
        this.zzZhm = zzY(zz64Var.zzHX(33));
        this.zzZhl = zzY(zz64Var.zzHX(6));
    }

    private static int zzY(zz65 zz65Var) {
        return com.aspose.words.internal.zzSA.zzp(zzHW.zzW(zz65Var));
    }

    private static int zzZ(zz65 zz65Var) {
        int iZzW = (int) zzHW.zzW(zz65Var);
        if (iZzW > 1) {
            return iZzW;
        }
        return 1;
    }

    public final boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zzHY.class) {
            return false;
        }
        return zzZ((zzHY) obj);
    }

    public final int hashCode() {
        return (((((((((this.zzZhq * 397) ^ this.zzZhp) * 397) ^ this.zzZho) * 397) ^ this.zzZhn) * 397) ^ this.zzZhm) * 397) ^ this.zzZhl;
    }

    public final int zzZRf() {
        return this.zzZhl;
    }

    public final int zzZRg() {
        return this.zzZhm;
    }

    public final int zzZRh() {
        return this.zzZhn;
    }

    public final int zzZRi() {
        return this.zzZho;
    }

    public final int zzZRj() {
        return this.zzZhp;
    }

    public final int zzZRk() {
        return this.zzZhq;
    }

    private boolean zzZ(zzHY zzhy) {
        return this.zzZhq == zzhy.zzZhq && this.zzZhp == zzhy.zzZhp && this.zzZho == zzhy.zzZho && this.zzZhn == zzhy.zzZhn && this.zzZhm == zzhy.zzZhm && this.zzZhl == zzhy.zzZhl;
    }
}
