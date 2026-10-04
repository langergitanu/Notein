package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz0N implements Cloneable {
    private zz49[] zzYXv = new zz49[9];
    private zz49 zzYXw;

    public zz0N() {
        int i = 0;
        while (true) {
            zz49[] zz49VarArr = this.zzYXv;
            if (i >= zz49VarArr.length) {
                zz49 zz49Var = new zz49();
                this.zzYXw = zz49Var;
                this.zzYXv[0].zzZ(zz49Var);
                this.zzYXv[0].zzZHc().zzU(this.zzYXw.zzZHc());
                return;
            }
            zz49VarArr[i] = new zz49();
            zz49 zz49Var2 = new zz49();
            this.zzYXv[i].zzZ(zz49Var2);
            zz49Var2.setLevel(i);
            if (i > 0) {
                int i2 = i - 1;
                zz49Var2.zzZ(this.zzYXv[i2]);
                this.zzYXv[i].zzZHc().zzU(this.zzYXv[i2].zzZHc());
            }
            i++;
        }
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final boolean isEmpty() {
        for (zz49 zz49Var : this.zzYXv) {
            if (zz49Var != null && !zz49Var.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public final zz49 zzGF(int i) {
        return this.zzYXv[i];
    }

    public final zz49 zzZsM() {
        return this.zzYXv[8];
    }

    public final zz49 zzZsN() {
        return this.zzYXv[7];
    }

    public final zz49 zzZsO() {
        return this.zzYXv[6];
    }

    public final zz49 zzZsP() {
        return this.zzYXv[5];
    }

    public final zz49 zzZsQ() {
        return this.zzYXv[4];
    }

    public final zz49 zzZsR() {
        return this.zzYXv[3];
    }

    public final zz49 zzZsS() {
        return this.zzYXv[2];
    }

    public final zz49 zzZsT() {
        return this.zzYXv[1];
    }

    public final zz49 zzZsU() {
        return this.zzYXv[0];
    }

    public final zz49 zzZsV() {
        return this.zzYXw;
    }

    public final zz0N zzZsW() {
        zz0N zz0n = (zz0N) memberwiseClone();
        zz0n.zzYXw = this.zzYXw.zzZxm();
        zz0n.zzYXv = new zz49[this.zzYXv.length];
        int i = 0;
        while (true) {
            zz49[] zz49VarArr = this.zzYXv;
            if (i >= zz49VarArr.length) {
                return zz0n;
            }
            zz0n.zzYXv[i] = zz49VarArr[i].zzZxm();
            i++;
        }
    }
}
