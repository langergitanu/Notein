package com.aspose.words;

import com.aspose.words.ref.RefInt;

/* JADX INFO: loaded from: classes6.dex */
final class zzYMQ {
    private int zzKF;
    private int zzVN;
    private int zzXGA;
    private int zzXGB;
    private int zzXGC;
    private zzYMM zzXGD;
    private int zzXGs;
    private boolean zzXGt;
    private boolean zzXGu;
    private int zzXGv;
    private int zzXGw;
    private zzZDB zzXGx;
    private zzVE zzXGy;
    private int zzXGz;
    private int zzY99;
    private zzZ7A zzYdQ;

    public zzYMQ(zzYMM zzymm) throws Exception {
        this.zzXGD = zzymm;
        if (zzymm.zzYos().zzI(false, false).zzZo6() == 21577) {
            return;
        }
        this.zzY99 = this.zzXGD.zzYM7();
        this.zzXGB = this.zzXGD.zzYM4();
        if (zzZYM()) {
            this.zzXGB = Math.max(0, this.zzXGB);
            this.zzXGC = this.zzXGD.zzYMa();
        }
        this.zzYdQ = zzZ7A.zzZ(this.zzXGD.zza7(), true);
    }

    private static boolean zzK(zzYAU zzyau, zzYAU zzyau2) throws Exception {
        boolean zZzY74 = false;
        while (zzyau != zzyau2 && zzyau != null) {
            zZzY74 = zzyau.zzY74();
            if (zZzY74) {
                break;
            }
            zzyau = (zzYAU) zzyau.zzYo1();
        }
        return zZzY74;
    }

    private int zzR(zzVE zzve) throws Exception {
        boolean z;
        int i = 0;
        int iZz11 = 0;
        do {
            zzYAU zzyauZz14 = zzve.zz14();
            z = zzyauZz14 == this.zzXGy.zz14();
            if (z && this.zzXGy.getIndex() == 0) {
                break;
            }
            zzY9S zzy9s = (zzY9S) com.aspose.words.internal.zzZKW.zzZ(zzyauZz14, zzY9S.class);
            if (zzy9s != null) {
                int index = zzve.getIndex();
                zzve.zzU(zzyauZz14);
                int index2 = z ? this.zzXGy.getIndex() - 1 : zzve.getIndex();
                if (!z) {
                    this.zzXGs += zzy9s.zzY5J();
                }
                iZz11 = zzy9s.zzVD(index, index2);
            } else {
                iZz11 = zzve.zz11();
                if (!(zzyauZz14 instanceof zzYAA)) {
                    if (!z || zzve.getIndex() < this.zzXGy.getIndex()) {
                    }
                    iZz11 = 0;
                }
                zzve.moveNext();
            }
            i += iZz11;
            iZz11 = 0;
            zzve.moveNext();
        } while (!z);
        return i + iZz11;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ca A[EDGE_INSN: B:88:0x00ca->B:69:0x00ca BREAK  A[LOOP:0: B:12:0x002b->B:67:0x00c6], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int zzX(int i, RefInt refInt) throws Exception {
        boolean z;
        zzVE zzve = this.zzXGy;
        if (zzve != null && !zzve.zz13()) {
            this.zzXGy.zz0U();
        }
        int i2 = this.zzXGv;
        int i3 = 10754;
        if (i2 > 0) {
            refInt.set(i2);
            this.zzXGv = 0;
            return 10754;
        }
        int iZzZo6 = this.zzXGy.zz14().zzZo6();
        refInt.set(0);
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            int iZzYoK = zzYoK();
            if (iZzYoK <= 0) {
                if (z2) {
                    break;
                }
                if (this.zzXGy.zz0U()) {
                    z2 |= z;
                    if (z) {
                    }
                }
            } else {
                if (!z3 && !this.zzXGy.zz0U()) {
                    z3 = zzYoD() || (this.zzYdQ != null && zzYoL() && this.zzYdQ.zzW(this.zzXGy));
                }
                if (this.zzXGy.zz0U() || !zzYoL()) {
                    z3 = false;
                }
                if (z3) {
                    com.aspose.words.internal.OooO0o.OooO00o(iZzYoK, refInt);
                    iZzZo6 = 9217;
                    z = this.zzXGy.zz0U() && zzYoL();
                    z2 |= z;
                    if (z) {
                        break;
                    }
                    com.aspose.words.internal.OooO0o.OooO00o(zzYoJ(), refInt);
                    zzZ7A zzz7a = this.zzYdQ;
                    if (!(zzz7a != null && zzz7a.zzX(this.zzXGy))) {
                        if (this.zzXGt) {
                            break;
                        }
                        z3 = this.zzXGu && zzYoy();
                        if (this.zzXGy.zz0U()) {
                            break;
                        }
                        iZzZo6 = 9217;
                    }
                } else if (z2) {
                    this.zzXGv = iZzYoK;
                } else {
                    refInt.set(iZzYoK);
                    iZzZo6 = 10754;
                }
            }
        }
        iZzZo6 = 9217;
        if (refInt.get() != 0 || z2) {
            return iZzZo6;
        }
        if (!zzY9R.zzmW(iZzZo6)) {
            if (!zzYoM()) {
                if (zzY9R.zzmX(iZzZo6)) {
                    refInt.set(this.zzXGy.zz14().getWidth());
                } else {
                    refInt.set(zzY74.zzZ((zzZ55) this.zzXGy.zz14().zzZZJ(), this.zzXGy.zz14(), i, 0).zzXWA);
                    i3 = iZzZo6;
                }
            }
            this.zzXGy.zz0X();
            return i3;
        }
        refInt.set(this.zzXGy.zz14().getWidth());
        i3 = 21514;
        this.zzXGy.zz0X();
        return i3;
    }

    private int zzYMa() {
        return Math.max(0, this.zzXGC);
    }

    private boolean zzYMu() {
        return this.zzXGD.zza7().zzYMu();
    }

    private int zzYoA() {
        return this.zzY99 + zzYMa();
    }

    private int zzYoB() {
        return Math.max(0, -this.zzXGC);
    }

    private int zzYoC() throws Exception {
        int iZzZ;
        zzVE zzve = new zzVE(this.zzXGy);
        boolean z = false;
        zzYAU zzyauZz14 = null;
        boolean zZzYoD = false;
        while (true) {
            if (this.zzXGw >= this.zzXGx.zzYX5().length) {
                break;
            }
            zZzYoD = zzYoD();
            if (!(this.zzXGy.zz14() instanceof zzYAA)) {
                zzyauZz14 = this.zzXGy.zz14();
                int[] iArrZzYX5 = this.zzXGx.zzYX5();
                this.zzXGw = this.zzXGw + 1;
                if (com.aspose.words.internal.zzAN.zzZP(iArrZzYX5[r6])) {
                    this.zzXGy.moveNext();
                    break;
                }
            }
            this.zzXGy.moveNext();
        }
        if (this.zzXGw >= this.zzXGx.zzYX5().length) {
            this.zzXGx = null;
            if (zzYoN()) {
                this.zzXGy.moveNext();
                iZzZ = 0;
            } else {
                iZzZ = 0;
                z = zZzYoD;
            }
        } else if (this.zzXGy.zz14() instanceof zzYAA) {
            this.zzXGy.moveNext();
            iZzZ = 0;
        } else {
            iZzZ = zzYAA.zzZ((zzZ55) zzyauZz14.zzZZJ(), zzyauZz14.zzY6N());
            zzYoN();
        }
        this.zzXGu = z;
        this.zzKF = 1;
        return zzR(zzve) + iZzZ;
    }

    private boolean zzYoD() throws Exception {
        return !this.zzXGy.zz0U() && this.zzXGy.zz14().zzZo6() == 9747;
    }

    private boolean zzYoE() throws Exception {
        if (!zzYoF()) {
            return false;
        }
        zzZ6L zzz6lZzY53 = ((zzY9X) this.zzXGy.zz14()).zzY53();
        return zzz6lZzY53.hasImage() || zzz6lZzY53.zzYS7();
    }

    private boolean zzYoF() throws Exception {
        return !this.zzXGy.zz0U() && this.zzXGy.zz14().zzZo6() == 25604;
    }

    private boolean zzYoG() throws Exception {
        if (zzYoF()) {
            return (zzYMu() && zzYoE()) ? false : true;
        }
        return false;
    }

    private int zzYoH() throws Exception {
        zzVE zzve = new zzVE(this.zzXGy);
        boolean z = false;
        boolean z2 = false;
        while (!this.zzXGy.zz0U() && zzYoL()) {
            boolean z3 = zzY9R.zzlx(this.zzXGy.zz14().zzZo6()) == 3072 || zzYoN();
            boolean zZzYoG = zzYoG();
            boolean zZzY6C = this.zzXGy.zz14().zzY6C();
            boolean zZzYoD = zzYoD();
            this.zzXGy.moveNext();
            if (!zZzY6C && !this.zzXGy.zz14().zzY6C()) {
                if (z3 && zzZ5B.zzY(this.zzXGD.zza7())) {
                    z = !zzZYM();
                } else if (zZzYoG) {
                    this.zzKF = 0;
                } else if (!zzYoE() || zzYMu()) {
                    this.zzKF = 2;
                    z2 = zZzYoD;
                } else {
                    this.zzKF = 0;
                }
                z2 = zZzYoD;
                break;
            }
            if (this.zzKF != 1) {
                this.zzKF = 2;
            }
            z2 = zZzYoD;
            break;
        }
        this.zzXGu = z2;
        this.zzXGt = z;
        return zzR(zzve);
    }

    private void zzYoI() throws Exception {
        zzZDA zzzdaZzZ;
        if (this.zzXGx == null && this.zzXGD.zzYoe() && zzZYM() && zzY9R.zzlx(this.zzXGy.zz14().zzZo6()) == 1024) {
            zzZYM();
            if (this.zzXGy.zz14().zzY6N().zzYKG()) {
                return;
            }
            zzYAH zzyahZzY6j = this.zzXGy.zz14().zzY6j();
            if ((zzyahZzY6j != null && !zzZ58.zzxH(zzyahZzY6j.getFieldType())) || this.zzXGy.zz14().zzYRO() || (zzzdaZzZ = Hyphenation.zzZ(this.zzXGy.zz14().zzZo2(), this.zzXGD.zzab())) == null) {
                return;
            }
            String strZzR = zzZ58.zzR(this.zzXGy.zz14(), this.zzXGy.getIndex());
            if (com.aspose.words.internal.zzZYD.zzXk(strZzR)) {
                this.zzXGx = zzzdaZzZ.zzQ(strZzR, zzZYM(), this.zzXGD.zza7().zzYMy());
                this.zzXGw = 0;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c A[EDGE_INSN: B:42:0x007c->B:41:0x007c BREAK  A[LOOP:0: B:3:0x0002->B:47:0x0002], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int zzYoJ() throws Exception {
        boolean z;
        int iZzYoC = 0;
        while (true) {
            if (this.zzKF != 2) {
                zzYoI();
            }
            boolean z2 = true;
            if (this.zzXGx == null) {
                iZzYoC += zzYoH();
            } else {
                zzYAU zzyauZz14 = this.zzXGy.zz14();
                iZzYoC += zzYoC();
                if (this.zzXGx == null && !this.zzXGy.zz0U() && zzyauZz14.zzY6j() != this.zzXGy.zz14().zzY6j()) {
                    z = true;
                }
                if (this.zzXGy.zz0U()) {
                    break;
                }
                zzZ7A zzz7a = this.zzYdQ;
                boolean z3 = zzz7a != null && (zzz7a.zzW(this.zzXGy) || this.zzYdQ.zzX(this.zzXGy));
                if (this.zzXGt || (!zzYoD() && !this.zzXGu)) {
                    z2 = false;
                }
                if (!zzYoL() || (!z2 && !z3 && !z)) {
                    break;
                }
            }
            z = false;
            if (this.zzXGy.zz0U()) {
            }
        }
        return iZzYoC;
    }

    private int zzYoK() throws Exception {
        int width = 0;
        boolean zZz0X = true;
        while (this.zzXGy.zz14().zzY6o() && zZz0X) {
            width += this.zzXGy.zz14().getWidth();
            zZz0X = this.zzXGy.zz0X();
        }
        return width;
    }

    private boolean zzYoL() throws Exception {
        if (zzYoM()) {
            return false;
        }
        int iZzlx = zzY9R.zzlx(this.zzXGy.zz14().zzZo6());
        if (iZzlx != 1024) {
            return iZzlx != 2048 ? iZzlx == 3072 || this.zzXGy.zz14().zzZo6() == 10785 : !this.zzXGy.zz14().zzY6p();
        }
        return true;
    }

    private boolean zzYoM() throws Exception {
        return zzY9X.zzZf(this.zzXGy.zz14());
    }

    private boolean zzYoN() throws Exception {
        return 9217 == this.zzXGy.zz14().zzZo6() && this.zzXGy.getCharacter() == '-';
    }

    private boolean zzYoy() {
        return this.zzXGD.zza7().zzYMA();
    }

    private int zzYoz() {
        return this.zzY99 + zzYoB();
    }

    private boolean zzZYM() {
        return this.zzXGD.zza7().zzZYM();
    }

    public final int getHeight() throws Exception {
        if (this.zzVN == Integer.MIN_VALUE) {
            this.zzVN = 0;
            for (zzZ55 zzz55ZzYos = this.zzXGD.zzYos(); zzz55ZzYos != null; zzz55ZzYos = (zzZ55) zzz55ZzYos.zzYo1()) {
                this.zzVN = Math.max(this.zzVN, zzz55ZzYos.getHeight());
            }
        }
        return this.zzVN;
    }

    public final int getMaxWidth() {
        return this.zzXGz;
    }

    public final int getMinWidth() {
        return this.zzXGA;
    }

    public final void zzYoO() throws Exception {
        int iZzYoA = zzYoA();
        int iZzYoA2 = zzYoA();
        zzVE zzve = new zzVE(this.zzXGD.zzZ9s(), this.zzXGD.zzZ9r());
        this.zzXGy = zzve;
        zzve.zzV(this.zzXGD.zzZ9s());
        boolean z = true;
        zzYAU zzyauZzI = this.zzXGD.zzYos().zzI(true, true);
        zzYAU zzyau = null;
        boolean z2 = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (!this.zzXGy.zz13()) {
            boolean z3 = (zzyau == null || !zzyau.zzYRO()) ? false : z;
            if (z3) {
                this.zzKF = 0;
            }
            zzYAU zzyauZz14 = this.zzXGy.zz14();
            int i5 = this.zzXGD.zza7().zzZYM() ? iZzYoA2 + i2 : i2;
            this.zzXGs = 0;
            RefInt refInt = new RefInt(0);
            int iZzX = zzX(i5, refInt);
            int i6 = refInt.get();
            int i7 = i2 + i6;
            boolean z4 = (i6 == i7 && z2) ? z : false;
            if (zzyauZz14.zzYRO()) {
                i6 = i7;
            } else if (iZzX != 9217) {
                if (iZzX == 10754) {
                    zzyauZz14.zzY7r();
                    this.zzKF = 0;
                    z2 = false;
                    i3 = 0;
                    i4 = i6;
                } else if (iZzX != 12803) {
                    if (iZzX == 21514) {
                        if (!zzZYM() || iZzYoA2 >= 0 || this.zzXGD.zza9().zz6y() != 16) {
                            i7 = (i7 - i6) - i4;
                        }
                        int iMax = Math.max(i, i7 + iZzYoA2);
                        boolean zZzK = zzK(zzyauZzI, zzyauZz14);
                        boolean z5 = zzyauZz14.zzZo6() == 21577;
                        boolean z6 = i4 > 0;
                        if (zZzK || !z5 || z6) {
                            iZzYoA = Math.max(iZzYoA, iZzYoA2);
                        }
                        if (z3 && !zZzK && z5) {
                            this.zzXGB = 0;
                            iZzYoA = 0;
                            i = 0;
                        } else {
                            i = iMax;
                        }
                        iZzYoA2 = zzYoz();
                        zzyauZzI = (zzYAU) zzyauZz14.zzYo1();
                        this.zzXGs = 0;
                        this.zzKF = 0;
                        i2 = 0;
                        z2 = false;
                        i3 = 0;
                        i4 = 0;
                    }
                    zzyau = zzyauZz14;
                    z = true;
                } else {
                    boolean z7 = (z4 || z3 || zzyauZz14.zzYRO()) ? false : true;
                    if (z7) {
                        i3 = i6;
                        i4 = i3;
                    } else {
                        i4 = 0;
                        i3 = i7;
                    }
                    z2 = !z7;
                    this.zzKF = 0;
                }
                i6 = i3;
            } else {
                boolean z8 = (z4 || z3 || (z2 && i3 > 0)) ? false : true;
                i6 = z8 ? i6 + i3 : i7;
                z2 = !z8;
                i3 = 0;
                i4 = 0;
            }
            if (z2) {
                iZzYoA = Math.max(iZzYoA, zzYoA() + (i7 - i4));
            } else if (i6 != 0) {
                iZzYoA = Math.max(iZzYoA, zzYoz() + i6);
            }
            i2 = i7 + this.zzXGs;
            zzyau = zzyauZz14;
            z = true;
        }
        int i8 = this.zzXGB;
        this.zzXGA = iZzYoA + i8;
        this.zzXGz = i + i8;
    }
}
