package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz60 extends zz98 implements Cloneable {
    private static zz60 zzZ1P;
    private zzZCB zzZfn;

    public static class zzZ implements zzZCA, Cloneable {
        private zz60 zzZ1O;

        public zzZ(zz60 zz60Var) {
            this.zzZ1O = zz60Var;
        }

        private Object memberwiseClone() {
            try {
                return clone();
            } catch (CloneNotSupportedException e) {
                throw new IllegalStateException(e);
            }
        }

        @Override // com.aspose.words.zzZCA
        public final zzZCA zzZOl() {
            zzZ zzz = (zzZ) memberwiseClone();
            zz60 zz60Var = this.zzZ1O;
            if (zz60Var != null) {
                zzz.zzZ1O = zz60Var.zzZyX();
            }
            return zzz;
        }

        @Override // com.aspose.words.zzZCA
        public final zzZCB zzZOm() {
            zz60 zz60Var = this.zzZ1O;
            if (zz60Var != null) {
                return zz60Var.zzZfn;
            }
            return null;
        }
    }

    static {
        zz60 zz60Var = new zz60();
        zzZ1P = zz60Var;
        Boolean bool = Boolean.FALSE;
        zz60Var.zzL(0, bool);
        zzZ1P.zzL(1, new zz95(-1));
        zzZ1P.zzL(2, new zz95(-1));
        zzZ1P.zzL(3, bool);
        zzZ1P.zzL(4, 0);
        zzZ1P.zzL(5, 3);
        zzZ1P.zzL(6, 1);
        zzZ1P.zzL(7, 0);
        zzZ1P.zzL(8, 1);
    }

    public zz60() {
        zz6R zz6r = new zz6R();
        this.zzZfn = zz6r;
        zz6r.zzZ(new zzZ(zzZ1P));
    }

    private Object zzLv(int i) {
        return this.zzZfn.zzLv(i);
    }

    public final int getDirection() {
        return ((Integer) zzLv(4)).intValue();
    }

    @Override // com.aspose.words.zz98
    public final Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void setDirection(int i) {
        zzL(4, Integer.valueOf(i));
    }

    public final void zzHS(int i) {
        zzL(8, Integer.valueOf(i));
    }

    public final void zzHT(int i) {
        zzL(7, Integer.valueOf(i));
    }

    public final void zzHU(int i) {
        zzL(6, Integer.valueOf(i));
    }

    public final void zzHV(int i) {
        zzL(5, Integer.valueOf(i));
    }

    public final void zzL(int i, Object obj) {
        this.zzZfn.zzL(i, obj);
    }

    public final Object zzLu(int i) {
        return this.zzZfn.zzLu(i);
    }

    public final void zzX1(boolean z) {
        zzL(3, Boolean.valueOf(z));
    }

    public final void zzX2(boolean z) {
        zzL(0, Boolean.valueOf(z));
    }

    public final void zzY(zz60 zz60Var) {
        this.zzZfn.zzZ(new zzZ(zz60Var));
    }

    @Override // com.aspose.words.zz98
    public final void zzZ(zzZCK zzzck) {
        zzzck.zzZ(this);
    }

    @Override // com.aspose.words.zz98
    public final zz98 zzZFO() {
        return zzZyX();
    }

    @Override // com.aspose.words.zz98
    public final int zzZSn() {
        return 6;
    }

    public final int zzZyP() {
        return ((Integer) zzLv(8)).intValue();
    }

    public final int zzZyQ() {
        return ((Integer) zzLv(7)).intValue();
    }

    public final int zzZyR() {
        return ((Integer) zzLv(6)).intValue();
    }

    public final int zzZyS() {
        return ((Integer) zzLv(5)).intValue();
    }

    public final boolean zzZyT() {
        return ((Boolean) zzLv(3)).booleanValue();
    }

    public final zz95 zzZyU() {
        return (zz95) zzLv(2);
    }

    public final zz95 zzZyV() {
        return (zz95) zzLv(1);
    }

    public final boolean zzZyW() {
        return ((Boolean) zzLv(0)).booleanValue();
    }

    public final zz60 zzZyX() {
        zz60 zz60Var = (zz60) memberwiseClone();
        zz60Var.zzZfn = this.zzZfn.zzZzY();
        if (hasExtensions()) {
            zz60Var.setExtensions(zzZBz());
        }
        return zz60Var;
    }
}
