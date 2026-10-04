package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz10 extends zz80 implements Cloneable {
    private static zzZCA zzZ9l = new zz6Q(zz0Z.zzZtr());
    private zz3F zzYY1;
    private zzHF zzYY2;
    private zz7R zzZ5b;
    private zzZCB zzZf9;
    private zz2N zzZjb;
    private zz2S zzZjc;

    public zz10() {
        zz6R zz6r = new zz6R();
        this.zzZf9 = zz6r;
        zz6r.zzZ(zzZ9l);
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    private void zzL(int i, Object obj) {
        this.zzZf9.zzL(i, obj);
    }

    private Object zzLv(int i) {
        return this.zzZf9.zzLv(i);
    }

    public final int getColumnNumber() {
        return ((Integer) zzLv(3)).intValue();
    }

    public final boolean hasInsets() {
        return zzLh(16) || zzLh(17) || zzLh(18) || zzLh(19);
    }

    public final boolean isEmpty() {
        return this.zzZf9.getCount() == 0 && this.zzZf9.zzZzW() == null && this.zzYY2 == null && this.zzZ5b == null && !hasInsets() && this.zzYY1 == null && this.zzZjc == null && this.zzZjb == null;
    }

    public final void setColumnNumber(int i) {
        if (i <= 0) {
            i = 1;
        }
        zzL(3, Integer.valueOf(i));
    }

    public final void zzGH(int i) {
        zzL(14, Integer.valueOf(i));
    }

    public final void zzGI(int i) {
        zzL(12, Integer.valueOf(i));
    }

    public final void zzGJ(int i) {
        zzL(13, Integer.valueOf(i));
    }

    public final void zzGK(int i) {
        zzL(10, Integer.valueOf(i));
    }

    public final void zzGL(int i) {
        zzL(4, Integer.valueOf(i));
    }

    public final void zzGM(int i) {
        zzL(11, Integer.valueOf(i));
    }

    public final void zzGN(int i) {
        zzL(0, Integer.valueOf(i));
    }

    public final void zzGO(int i) {
        zzL(16, Integer.valueOf(i));
    }

    public final void zzGP(int i) {
        zzL(18, Integer.valueOf(i));
    }

    public final void zzGQ(int i) {
        zzL(17, Integer.valueOf(i));
    }

    public final void zzGR(int i) {
        zzL(19, Integer.valueOf(i));
    }

    public final boolean zzLh(int i) {
        return this.zzZf9.zzLh(i);
    }

    public final Object zzLu(int i) {
        return this.zzZf9.zzLu(i);
    }

    public final int zzMg() {
        return ((Integer) zzLv(0)).intValue();
    }

    public final void zzV(zz10 zz10Var) {
        this.zzZf9.zzZ(new zz6Q(zz10Var.zzZf9));
    }

    public final void zzWE(boolean z) {
        zzL(7, Boolean.valueOf(z));
    }

    public final void zzWF(boolean z) {
        zzL(2, Boolean.valueOf(z));
    }

    public final void zzWG(boolean z) {
        zzL(6, Boolean.valueOf(z));
    }

    public final void zzWH(boolean z) {
        zzL(5, Boolean.valueOf(z));
    }

    public final void zzWI(boolean z) {
        zzL(15, Boolean.valueOf(z));
    }

    public final void zzWJ(boolean z) {
        zzL(1, Boolean.valueOf(z));
    }

    public final void zzX(zzHK zzhk) {
        zzL(8, zzhk);
    }

    public final void zzZ(zz3F zz3f) {
        this.zzYY1 = zz3f;
    }

    public final zzHK zzZCC() {
        return (zzHK) zzLv(8);
    }

    public final zz2N zzZTc() {
        return this.zzZjb;
    }

    public final zz2S zzZTd() {
        return this.zzZjc;
    }

    public final boolean zzZtA() {
        return ((Boolean) zzLv(9)).booleanValue();
    }

    public final int zzZtB() {
        return ((Integer) zzLv(11)).intValue();
    }

    public final boolean zzZtC() {
        return ((Boolean) zzLv(1)).booleanValue();
    }

    public final int zzZtD() {
        return ((Integer) zzLv(16)).intValue();
    }

    public final int zzZtE() {
        return ((Integer) zzLv(18)).intValue();
    }

    public final int zzZtF() {
        return ((Integer) zzLv(17)).intValue();
    }

    public final int zzZtG() {
        return ((Integer) zzLv(19)).intValue();
    }

    public final zzHF zzZtH() {
        if (this.zzYY2 == null) {
            this.zzYY2 = new zz55();
        }
        return this.zzYY2;
    }

    public final zz3F zzZtI() {
        if (this.zzYY1 == null) {
            this.zzYY1 = new zz3F();
        }
        return this.zzYY1;
    }

    public final zz10 zzZtJ() {
        zz10 zz10Var = (zz10) memberwiseClone();
        zzZCB zzzcb = this.zzZf9;
        if (zzzcb != null) {
            zz10Var.zzZf9 = zzzcb.zzZzY();
        }
        zz7R zz7r = this.zzZ5b;
        if (zz7r != null) {
            zz10Var.zzZ5b = zz7r.zzZB3();
        }
        zz3F zz3f = this.zzYY1;
        if (zz3f != null) {
            zz10Var.zzYY1 = zz3f.zzZwl();
        }
        zzHF zzhf = this.zzYY2;
        if (zzhf != null) {
            zz10Var.zzYY2 = zzhf.zzZQI();
        }
        zz2S zz2s = this.zzZjc;
        if (zz2s != null) {
            zz10Var.zzZjc = zz2s.zzZvG();
        }
        zz2N zz2n = this.zzZjb;
        if (zz2n != null) {
            zz10Var.zzZjb = zz2n.zzZvt();
        }
        if (hasExtensions()) {
            zz10Var.setExtensions(zzZBz());
        }
        return zz10Var;
    }

    public final int zzZts() {
        return ((Integer) zzLv(14)).intValue();
    }

    public final int zzZtt() {
        return ((Integer) zzLv(12)).intValue();
    }

    public final int zzZtu() {
        return ((Integer) zzLv(13)).intValue();
    }

    public final boolean zzZtv() {
        return ((Boolean) zzLv(7)).booleanValue();
    }

    public final boolean zzZtw() {
        return ((Boolean) zzLv(2)).booleanValue();
    }

    public final int zzZtx() {
        return ((Integer) zzLv(10)).intValue();
    }

    public final int zzZty() {
        return ((Integer) zzLv(4)).intValue();
    }

    public final void zzZtz() {
        zzL(9, Boolean.TRUE);
    }

    public final void zzZxJ() {
        this.zzZf9.remove(8);
    }

    public final void zzZ(zzHF zzhf) {
        this.zzYY2 = zzhf;
    }

    public final void zzZ(zz2S zz2s) {
        this.zzZjc = zz2s;
    }

    public final void zzZ(zz2N zz2n) {
        this.zzZjb = zz2n;
    }
}
