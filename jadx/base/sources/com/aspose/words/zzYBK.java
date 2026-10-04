package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYBK {
    private zzYBL zzXGb;
    private zzTB zzXer = new zzTB();
    private boolean zzXes;
    private boolean zzXet;
    private zzY0B zzXeu;
    private boolean zzXev;
    private zzTC zzXew;
    private zzTC zzXex;
    private boolean zzXey;
    private int zzYdm;
    private zzY5N zzZA2;
    private int zzZsp;
    private int zzZvz;

    private boolean zzK(zzTC zztc) {
        return zzY0B.zzZ(this.zzXeu, zztc);
    }

    private boolean zzL(zzZNO zzzno) throws Exception {
        zzzno.zzbD();
        int i = this.zzXet ? zzzno.zzZ8z() : true ? 5 : 1;
        this.zzZsp = i;
        if (i != 5) {
            return false;
        }
        zzM(zzzno);
        return true;
    }

    private void zzM(zzZNO zzzno) {
        zzzno.zzZ8D().remove(zzzno.zzZ90());
        if (this.zzXGb.zz60() == 2) {
            zzY5N.zzZ((zzUZ) this.zzXGb, zzzno);
        }
        zzTC zztc = (zzTC) zzzno.zzZ93();
        this.zzXex = zztc;
        this.zzXew = zztc;
    }

    private boolean zzN(zzZNO zzzno) throws Exception {
        zzTC zztc = (zzTC) zzzno.zzZ93();
        zztc.zzZZJ();
        if (!zztc.zzX(zztc.zzZZJ())) {
            return false;
        }
        this.zzZsp = 6;
        zzM(zzzno);
        return true;
    }

    private boolean zzX(zzYBL zzybl, int i, boolean z, boolean z2) throws Exception {
        if (zzybl != null) {
            zzybl.isActive();
        }
        zzY(zzybl, i, z, z2);
        while (true) {
            int i2 = this.zzZsp;
            if (i2 != 1 && i2 != 0) {
                return zzZjc();
            }
            zzY8a();
            zzY8h();
            zzY8f();
            if (this.zzZsp == 9) {
                return true;
            }
            if (!this.zzXGb.isActive()) {
                return false;
            }
            zzTC zztc = this.zzXew;
            if (zztc != null && !zztc.isActive()) {
                this.zzZsp = 0;
                this.zzXew = null;
            } else {
                if (zzY8c()) {
                    return true;
                }
                zzYS.zzZ(this.zzXGb, 1);
            }
        }
    }

    private void zzY(zzYBL zzybl, int i, boolean z, boolean z2) {
        this.zzXGb = zzybl;
        this.zzXeu = zzY0B.zzV(zzybl);
        this.zzZvz = i;
        this.zzXet = z;
        this.zzXes = z2;
        if (this.zzXGb.zzaa().zzZZB()) {
            this.zzZA2 = this.zzXGb.zz60() == 16 ? ((zzWT) this.zzXGb).zz5O() : this.zzXGb.zzZ8m().zz5O();
        }
        this.zzXex = null;
        this.zzXew = null;
        this.zzXev = false;
        this.zzYdm = Integer.MIN_VALUE;
        this.zzZsp = 0;
    }

    private void zzY85() throws Exception {
        zzTC zztc = this.zzXew;
        if (zztc == null) {
            return;
        }
        boolean zZzK = zzK(zztc);
        if (!zZzK && this.zzXGb.zz60() == 16) {
            this.zzXew = null;
            return;
        }
        if (this.zzXew.zzZZJ().zz60() == 1024 && this.zzXew.zzZZJ() != this.zzXGb) {
            this.zzXew = null;
            return;
        }
        if (this.zzXGb.zz60() != 2) {
            return;
        }
        if (!zZzK && (!this.zzXet || (this.zzXew != this.zzXGb.zz6x() && this.zzXGb.zz6x() != null))) {
            if (this.zzXew.zz60() == 32 && this.zzXew.zzZZJ().zz60() == 2 && !this.zzXew.zzZZJ().zzYnZ()) {
                this.zzXew.zzNd(1);
            }
            this.zzXew = null;
            return;
        }
        zzTF zztfZzZZJ = this.zzXew.zzZZJ();
        zzYBL zzybl = this.zzXGb;
        if (zztfZzZZJ == zzybl) {
            zzUZ zzuz = (zzUZ) zzybl;
            if (!zzZ51.zzX(this.zzXew, this.zzXet)) {
                return;
            } else {
                zzuz.zz04();
            }
        }
        if (this.zzXew.zzYTm() && this.zzXew.zzX(this.zzXGb)) {
            if (this.zzXet && !this.zzXes && this.zzXGb.isEmpty()) {
                zzYBL zzybl2 = this.zzXGb;
                if ((zzybl2 instanceof zzUZ) && zzybl2.zzY8m()) {
                    return;
                }
            }
            this.zzXew = null;
        }
    }

    private zzTC zzY86() throws Exception {
        zzYMD zzymdZz6x;
        switch (this.zzZsp) {
            case 1:
                zzymdZz6x = null;
                break;
            case 2:
                zzTC zztc = this.zzXex;
                zzymdZz6x = zztc == null ? this.zzXGb.zz6x() : zztc.zz5Z();
                break;
            case 3:
            case 4:
                zzymdZz6x = this.zzXex.zz5Z();
                break;
            case 5:
            case 6:
                zzymdZz6x = this.zzXex;
                this.zzXex = (zzTC) zzymdZz6x.zz5Y();
                break;
            case 7:
            case 8:
                zzTC zztc2 = (zzTC) this.zzXex.zz5Z();
                this.zzXex = zztc2;
                if (zztc2 != null && zztc2.zz60() == 32) {
                    this.zzXex.zzZZJ();
                }
                if (!this.zzXex.zzac()) {
                    this.zzXer.zzZ(this.zzXex, Integer.MAX_VALUE, true);
                }
                zzymdZz6x = this.zzXex.zz5Z();
                break;
            default:
                throw new IllegalStateException();
        }
        return (zzTC) zzymdZz6x;
    }

    private boolean zzY87() throws Exception {
        if (this.zzXGb.zz60() == 1024) {
            return false;
        }
        zzY5N zzy5n = this.zzZA2;
        if (zzy5n != null && zzy5n.zzW(this.zzXGb)) {
            return true;
        }
        this.zzXex = (zzTC) this.zzXGb.zz6w();
        if (!this.zzXey) {
            zzYMI.zzY(this.zzXGb, this.zzXet);
        }
        if (this.zzXGb.isActive() && this.zzXex != this.zzXGb.zz6w()) {
            this.zzXex = (zzTC) this.zzXGb.zz6w();
            zzY5N zzy5n2 = this.zzZA2;
            if (zzy5n2 != null && zzy5n2.zzW(this.zzXGb)) {
                return true;
            }
        }
        return false;
    }

    private void zzY88() throws Exception {
        zzTC zztc;
        zzYIA zzyia;
        zzYMD zzymdZz5Y;
        if (this.zzXGb.zz60() == 16 || !this.zzXGb.zzZZK() || (zztc = this.zzXex) == null) {
            return;
        }
        if (zztc.zz60() != 8) {
            zzZ55 zzz55 = (zzZ55) this.zzXex;
            if (!zzz55.zzYQ6() || (zzymdZz5Y = zzz55.zz5Y()) == null || zzymdZz5Y.zz60() != 8) {
                return;
            } else {
                zzyia = (zzYIA) zzymdZz5Y;
            }
        } else {
            zzyia = (zzYIA) this.zzXex;
        }
        zzYI9.zzW(zzyia, this.zzZvz);
    }

    private void zzY89() {
        if (this.zzXew == null) {
            this.zzZsp = 2;
        }
    }

    private void zzY8a() throws Exception {
        if (this.zzZsp == 0) {
            this.zzXex = null;
            this.zzZsp = 1;
        }
        if (this.zzXes) {
            zzTC zztc = this.zzXex;
            this.zzXew = zztc != null ? (zzTC) zztc.zz5Z() : (zzTC) this.zzXGb.zz6x();
        } else {
            int iZz60 = this.zzXGb.zz60();
            if (iZz60 != 2 && iZz60 != 16 && iZz60 != 1024 && iZz60 != 2048 && iZz60 != 4096 && iZz60 != 8192 && iZz60 != 16384) {
                throw new IllegalStateException();
            }
            zzTC zztc2 = this.zzXex;
            this.zzXew = zztc2 == null ? (zzTC) zzYJP.zzM(this.zzXGb) : zztc2.zzZXK();
        }
        zzY85();
        zzY89();
    }

    private boolean zzY8b() throws Exception {
        return this.zzZsp == 8 && this.zzXex.zz60() == 32 && 21779 != ((zzZ55) this.zzXex).zzYQc().zzZo6();
    }

    private boolean zzY8c() throws Exception {
        if (this.zzZsp == 0) {
            return false;
        }
        zzTC zztcZzY86 = zzY86();
        zzTC zztc = this.zzXew;
        if (zztc != null && zztc != zztcZzY86) {
            zzY(zztc, this.zzXex);
            if (this.zzZsp == 9) {
                return true;
            }
        }
        boolean z = (this.zzZsp == 1 || zztcZzY86 == null) ? false : true;
        this.zzXev = z;
        if (z) {
            zzL(zztcZzY86);
        }
        return this.zzZsp == 9;
    }

    private boolean zzY8d() throws Exception {
        return this.zzXGb.zz60() == 2 && this.zzZA2.zzq(null) > 0;
    }

    private void zzY8e() throws Exception {
        zzTC zztcZzZXK = this.zzXer.zzZXG().zzZXK();
        if (!zzK(zztcZzZXK)) {
            this.zzZsp = 3;
            return;
        }
        zztcZzZXK.zzO(this.zzXGb);
        this.zzXer.zzZ(zztcZzZXK, Math.max(0, this.zzZvz - this.zzXew.getY()), this.zzXet);
    }

    private void zzY8f() throws Exception {
        if (this.zzZsp != 1) {
            return;
        }
        this.zzXew.zzO(this.zzXGb);
        this.zzXer.zzY(this.zzXew, this.zzZvz, this.zzXet);
        if (this.zzXer.zzZXE()) {
            this.zzXer.zzZXD();
        }
        if (this.zzXew.isActive()) {
            this.zzXex = this.zzXer.zzZXG();
            if (this.zzXew.zz60() == 8 && this.zzXex != this.zzXew) {
                this.zzXGb.zza7();
                this.zzXew = null;
            }
            int iZzZXF = this.zzXer.zzZXF();
            this.zzZsp = iZzZXF;
            if (iZzZXF == 5 || iZzZXF == 6) {
                if (this.zzXex.zz60() == 32) {
                    this.zzXex = ((zzZ55) this.zzXex).zzYQo();
                }
            } else if (iZzZXF == 7 || iZzZXF == 8) {
                zzY8e();
            }
        }
    }

    private zzZNO zzY8g() throws Exception {
        zzZNO zzznoZzQ = zzZNO.zzQ(this.zzXew);
        if (zzznoZzQ == null) {
            return null;
        }
        zzZNG zzzng = (zzZNG) com.aspose.words.internal.zzZKW.zzZ(zzznoZzQ, zzZNG.class);
        if (zzzng == null || !(zzZ(zzzng) || zzY(zzzng))) {
            this.zzXew.zzO(this.zzXGb);
            return zzZNO.zzW(zzznoZzQ);
        }
        zzTC zztc = this.zzXex;
        if (zztc == null) {
            this.zzZsp = 2;
        } else {
            this.zzXew = zztc;
            this.zzZsp = 3;
        }
        return null;
    }

    private void zzY8h() throws Exception {
        zzZNO zzznoZzY8g;
        if (this.zzZsp != 1) {
            return;
        }
        while (this.zzXew != null && (zzznoZzY8g = zzY8g()) != null && !zzN(zzznoZzY8g)) {
            int iZzZ = zzZ(this.zzXGb, zzznoZzY8g, this.zzZA2, this.zzZvz);
            this.zzZsp = iZzZ;
            if (iZzZ == 5) {
                this.zzXGb.zza7();
                zzM(zzznoZzY8g);
                return;
            }
            if (zzznoZzY8g.zzZ8B() && !zzznoZzY8g.zzZ97()) {
                if (zzL(zzznoZzY8g)) {
                    return;
                }
                this.zzZA2.zzZ(zzznoZzY8g, false, true);
                if (this.zzZA2.zzXVN() > 0) {
                    this.zzZA2.zzq(null);
                    this.zzZsp = zzZ(zzznoZzY8g, this.zzXGb.zz60());
                } else {
                    this.zzZsp = 1;
                }
            }
            if (this.zzZsp != 1) {
                return;
            }
            this.zzXex = (zzTC) zzznoZzY8g.zzZ91();
            zzY8a();
        }
    }

    private static void zzZ0(ArrayList<zzZNO> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            zzZNO zzzno = arrayList.get(size);
            if (zzzno == null || zzzno.zzZ8W() || !zzzno.zzZ8Y() || zzzno.zzZ8X()) {
                arrayList.remove(size);
            }
        }
    }

    private static int zzZg(int i, boolean z) {
        if (i == 2) {
            return 9;
        }
        if (i != 16) {
            if (i != 1024) {
                return 1;
            }
            if (z) {
                return 9;
            }
        }
        return 0;
    }

    private boolean zzZjc() throws Exception {
        if (this.zzXGb.isEmpty()) {
            return false;
        }
        if (zzY87()) {
            return true;
        }
        if (this.zzXGb.isActive()) {
            zzZ59.zzU(this.zzXGb);
            if (this.zzXGb.zz60() != 16) {
                zzY88();
                if (this.zzXGb.zz60() != 4096) {
                    zzYI9.zzX(this.zzXGb);
                }
            }
        }
        return false;
    }

    public final boolean isOverflow() {
        return this.zzZsp != 9 && this.zzXev;
    }

    public final int zz0t() throws Exception {
        int iZz0t;
        if (this.zzYdm == Integer.MIN_VALUE) {
            zzYMD zzymdZzj = this.zzXGb.zzj(this.zzXex);
            if (zzymdZzj != null && zzymdZzj.zz60() == 32) {
                zzZ55 zzz55 = (zzZ55) zzymdZzj;
                if (zzz55.zzYQ6()) {
                    zzymdZzj = this.zzXGb.zzj(zzz55.zz5Y());
                }
            }
            if (zzymdZzj == null) {
                iZz0t = 0;
            } else {
                iZz0t = zzymdZzj.zz0t() + zzymdZzj.getY();
            }
            this.zzYdm = iZz0t;
        }
        return this.zzYdm;
    }

    public final void zzQN(boolean z) {
        this.zzXey = z;
    }

    public final zzYBL zzY8i() {
        return this.zzXGb;
    }

    public final boolean zzZ(zzYBL zzybl, int i, boolean z, boolean z2) throws Exception {
        return zzX(zzybl, i, z, z2);
    }

    private int zzZ(zzYMD zzymd, zzZNO zzzno, zzY5N zzy5n, int i) throws Exception {
        zzymd.isActive();
        int iZz60 = zzy5n.zzZZJ().zz60();
        if (!zzzno.zzhk() || iZz60 != 16) {
            zzzno.zzhk();
        }
        zzzno.zzZ8W();
        int iZzZ = 1;
        if (zzzno.zzZ8W()) {
            return 1;
        }
        if (!zzzno.zzZ8T()) {
            if (zzymd.zz60() == 16) {
                zzzno.zzhk();
            }
            zzzno.zzZoN();
            zzzno.zzZ8K();
            if (zzzno.zzZ8B()) {
                iZzZ = 0;
            } else if (zzy5n.zzK(zzzno)) {
                zzy5n.zzZ(zzzno, false, true);
                zzy5n.zzq(null);
                iZzZ = zzZ(zzzno, zzymd.zz60());
            }
        } else if (zzzno.zzZ9a()) {
            zzzno.zzZoN();
            if (zzzno.zzZ97()) {
                iZzZ = zzZ(zzzno, zzy5n);
            } else {
                zzzno.zzZ8J();
            }
        }
        if (zzymd.zz60() == 1024 && !zzymd.zza7().zzZYM() && zzzno.zzBE(this.zzXGb.getY() + i)) {
            return 5;
        }
        return iZzZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void zzL(zzTC zztc) throws Exception {
        zzTF zztfZzYn;
        int iZz60 = this.zzXGb.zz60();
        if (iZz60 == 2 || iZz60 == 16) {
            int i = this.zzZsp;
            zztfZzYn = (i == 4 || i == 6 || zzY8b()) ? ((zzUZ) this.zzXGb).zzYn(false) : (zzTF) this.zzXGb.zzYo1();
        } else {
            zztfZzYn = null;
            if (iZz60 == 1024) {
                zzZKY zzzky = (zzZKY) this.zzXGb;
                this.zzXew = null;
                zzTC zztc2 = (((zzTC) zzzky.zz6x()).zzZXN() != null || ((zzTC) zzzky.zz6x()).getBottom() <= this.zzZvz) ? zztc : (zzTC) zzzky.zz6x();
                if (((zzYBL) zztc2.zzZZJ()) != this.zzXGb) {
                    this.zzZsp = 2;
                    zztc = null;
                } else {
                    zzZNO zzznoZzU = zzZNC.zzU(zztc2);
                    if (zzznoZzU != null) {
                        zzzky.zzZ8m().zz5O().zzYQ(zzznoZzU.zzZ90());
                    }
                    if (zzznoZzU != null && zzzky.zza7().zzZYM()) {
                        this.zzZsp = 9;
                        zztc = zzznoZzU.zzZ99() == 25604 ? null : (zzTC) zzznoZzU.zzZ93();
                        zzzky.zzY(zzznoZzU);
                    } else {
                        this.zzZsp = 2;
                    }
                    zzzky.zzZ4S();
                    zztfZzYn = zzzky.zzZ4R();
                }
            } else if (iZz60 != 2048) {
                if (iZz60 == 16384) {
                    zzYVQ zzyvq = (zzYVQ) this.zzXGb;
                    zzTF zztfZzZZJ = zzyvq.zzZZJ();
                    zztfZzYn = zztfZzZZJ.zz0s();
                    if (((zzYVQ) zzyvq.zzYo1()) != null && ((zzYVQ) zzyvq.zzYo1()).zzZZJ() == zztfZzZZJ) {
                        ((zzYVQ) zzyvq.zzYo1()).zzN(zztfZzYn);
                    }
                }
            }
        }
        if (zztc != null) {
            zztc.zzN(zztfZzYn);
        }
    }

    private int zzM(zzTC zztc) throws Exception {
        zzZNL zzznlZzYF;
        if (this.zzXGb.zz60() != 2 || (zzznlZzYF = this.zzXGb.zzZ8m().zzYF(false)) == null) {
            return 1;
        }
        ArrayList arrayList = null;
        for (zzZNO zzzno : zzznlZzYF) {
            if (zztc.zzS(zzzno.zzZ93()) && zztc != zzzno.zzZ93()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZNO>) arrayList, zzzno);
            }
        }
        if (arrayList != null) {
            return zzZ(this.zzXGb, arrayList, this.zzZA2);
        }
        return 1;
    }

    private int zzX(zzZ55 zzz55, zzZ55 zzz552) throws Exception {
        zzZNO zzznoZzR;
        zzY5N zzy5n = this.zzZA2;
        if (zzy5n == null || zzy5n.zzXVX()) {
            return 1;
        }
        zzYAU zzyau = (zzYAU) ((zzYAU) zzz552.zz6w()).zzYo1();
        ArrayList arrayList = null;
        for (zzYAU zzyau2 = (zzYAU) zzz55.zz6x(); zzyau2 != zzyau; zzyau2 = (zzYAU) zzyau2.zzYo1()) {
            if (zzyau2.zzZo6() == 25604 && (zzznoZzR = zzZNO.zzR(zzyau2)) != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZNO>) arrayList, zzznoZzR);
            }
        }
        if (arrayList != null) {
            return zzZ(this.zzXGb, arrayList, this.zzZA2);
        }
        return 1;
    }

    private boolean zzY(zzZNG zzzng) {
        zzTC zztc;
        return zzzng != null && (zztc = this.zzXex) != null && zztc.zz60() == 8 && this.zzXex.zza9().zza9() == this.zzXew.zza9().zza9();
    }

    private void zzY(zzTC zztc, zzTC zztc2) throws Exception {
        int iZzM;
        zzUZ zzuz = (zzUZ) this.zzXGb.zzqh(2);
        if (zzuz == null || !zzuz.zz0p()) {
            int iZz60 = zztc.zz60();
            if (iZz60 != 8) {
                iZzM = iZz60 != 32 ? 1 : zzX((zzZ55) zztc, (zzZ55) zztc2);
            } else {
                iZzM = zzY8d() ? 9 : zzM(zztc);
            }
            if (iZzM != 1) {
                this.zzZsp = iZzM;
            }
        }
    }

    private static int zzZ(zzZNO zzzno, int i) {
        if (zzzno.zzZ99() == 25604) {
            return 1;
        }
        zzTC zztc = (zzTC) com.aspose.words.internal.zzZKW.zzZ(zzzno.zzZ93(), zzTC.class);
        if (zztc != null) {
            zztc.zzZZJ();
        }
        if (i == 1024 && !zztc.zza7().zzZYM()) {
            return 1;
        }
        if (i == 2) {
            zzUZ zzuz = (zzUZ) zztc.zzZZJ().zzqh(2);
            if (!zzuz.zzYnZ() && zzYBL.zzX((zzUZ) ((zzYN8) zzuz.zzZZJ()).zz6x(), zzuz)) {
                return 9;
            }
        }
        return zzYBL.zzX(zztc.zzZZJ().zz6x(), zztc) ? 0 : 1;
    }

    private static int zzZ(zzYMD zzymd, ArrayList<zzZNO> arrayList, zzY5N zzy5n) throws Exception {
        int i;
        zzymd.isActive();
        zzZ0(arrayList);
        zzy5n.zzXVN();
        ArrayList<zzZNO> arrayList2 = new ArrayList();
        zzZKY zzzky = (zzymd.zz60() == 1024 && zzymd.zza7().zzZYM()) ? (zzZKY) zzymd : null;
        Iterator<zzZNO> it = arrayList.iterator();
        boolean z = false;
        boolean z2 = false;
        while (true) {
            if (!it.hasNext()) {
                i = 1;
                break;
            }
            zzZNO next = it.next();
            next.zzZ8Y();
            boolean zZzZ8T = next.zzZ8T();
            if (zzy5n.zzK(next)) {
                if (zZzZ8T) {
                    zzXR zzxrZzZ8L = next.zzZ8L();
                    if (!next.zzZ8R().zzY(zzxrZzZ8L)) {
                        zzTC zztcZzZ8E = next.zzZ8E();
                        int iZzZ = zzy5n.zzZ(zzxrZzZ8L, zztcZzZ8E, zzzky);
                        int iZzZ2 = zzy5n.zzZ(next.zzZ8R(), zztcZzZ8E, zzzky);
                        if (zzzky == null || next.zzhk()) {
                            if (iZzZ2 == 0 && iZzZ == 0) {
                                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZNO>) arrayList2, next);
                            }
                        } else if (2 != iZzZ2 && 2 != iZzZ) {
                            com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZNO>) arrayList2, next);
                        }
                    }
                } else {
                    int iZzZ3 = zzy5n.zzZ(next.zzVH(true), (zzYMD) null, zzzky);
                    z |= iZzZ3 != 0;
                    z2 = (iZzZ3 & 2) != 0;
                    if (next.zzZ8B()) {
                        next.zzbD();
                        next.zzhk();
                        zzUZ zzuz = (zzUZ) next.zzZ93().zzqh(2);
                        if (zzuz.zzh(next.zzZ93().zzZZJ()) != null) {
                            next.zzZ8D().remove(next.zzZ90());
                            zzY5N.zzZ(zzuz, next);
                            i = 9;
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            } else if (!zZzZ8T) {
                next.zzZ8K();
            }
        }
        for (zzZNO zzzno : arrayList2) {
            zzy5n.zzZ(zzzno, true, true);
            zzzno.zzZ8K();
            z = true;
        }
        if (z) {
            zzy5n.zzq(null);
            return zzZg(zzymd.zz60(), z2);
        }
        zzy5n.zzXVQ();
        return i;
    }

    private static int zzZ(zzZNO zzzno, zzY5N zzy5n) throws Exception {
        zzzno.zzbD();
        int i = 1;
        if (zzzno.zzZ96() && !zzzno.zzhk()) {
            zzXR zzxrZzZ8L = zzzno.zzZ8L();
            if (!zzzno.zzZ8R().zzY(zzxrZzZ8L)) {
                if (zzzno.zzZ8Y() && zzy5n.zzZ(zzxrZzZ8L, zzzno.zzZ8E(), (zzZKY) null) != 0) {
                    zzy5n.zzXVQ();
                } else {
                    zzy5n.zzZ(zzzno, true, true);
                    zzzno.zzZ8K();
                    if (zzy5n.zzq(((zzUZ) zzzno.zzZ93().zzqh(2)).zz0H()) > 0) {
                        i = 9;
                    }
                }
                zzy5n.zzXVN();
            }
        }
        return i;
    }

    private boolean zzZ(zzZNG zzzng) {
        if (zzzng != null && !zzzng.zzhk()) {
            zzUZ zzuz = (zzUZ) this.zzXGb.zzqh(2);
            zzUZ zzuz2 = (zzUZ) this.zzXew.zzqh(2);
            if (zzuz2 != null && ((zzYN8) zzuz.zzZZJ()) == ((zzYN8) zzuz2.zzZZJ())) {
                do {
                    zzuz = (zzUZ) zzuz.zzYo1();
                    if (zzuz == null) {
                        break;
                    }
                } while (zzuz != zzuz2);
                if (zzuz != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
