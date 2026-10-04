package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
class zzY6N extends zzTG {
    private int[] zzX5A;
    private int[] zzX5B;
    private zzZNE zzX5p;
    private boolean zzX5q;
    private boolean zzX5r;
    private zzZN zzX5y;
    private zzY6Z zzX5z;
    private zzY6P zzZA5;
    private int zzXZT = -1;
    private int zzX5x = Integer.MIN_VALUE;
    private int zzX5w = Integer.MIN_VALUE;
    private int zzX5v = Integer.MIN_VALUE;
    private int zzX5u = Integer.MIN_VALUE;
    private int zzX5t = Integer.MIN_VALUE;
    private int zzX5s = Integer.MIN_VALUE;

    private boolean zzXY4() throws Exception {
        if (this.zzZA5 == null) {
            return true;
        }
        int iZz6f = zz6f();
        int iZz6e = zz6e();
        this.zzX5z = null;
        this.zzX5y = null;
        this.zzZA5 = null;
        return (iZz6f == zz6f() && iZz6e == zz6e()) ? false : true;
    }

    private boolean zzXY5() throws Exception {
        ((zzZ30) zzYTt()).zzYKv();
        if (!((zzZ30) zzYTt()).zzYKv()) {
            return false;
        }
        zzY6P zzy6pZzY = zzXY7().zzY(this);
        if (zzXYs()) {
            return false;
        }
        this.zzZA5 = zzy6pZzY;
        return true;
    }

    private void zzXY6() throws Exception {
        zzXY8().zzXZQ();
        this.zzZA5 = new zzY6P(0, zzXY8().getMinWidth(), zzXY8().getMaxWidth());
    }

    private zzZN zzXY7() {
        if (this.zzX5y == null) {
            this.zzX5y = new zzZN();
        }
        return this.zzX5y;
    }

    private zzY6Z zzXY8() throws Exception {
        if (this.zzX5z == null) {
            this.zzX5z = new zzY6Z(this);
        }
        return this.zzX5z;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int[] zzXYm() throws Exception {
        int[] iArr;
        int iZzS = zzZL5.zzS(this);
        int[] iArr2 = this.zzX5B;
        if (iArr2 == null || iZzS != iArr2.length) {
            iArr = null;
        } else {
            int i = 0;
            while (true) {
                if (i >= iZzS) {
                    break;
                }
                if (this.zzX5B[i] <= 0) {
                    iZzS = 0;
                    break;
                }
                i++;
            }
            if (iZzS > 0) {
                iArr = this.zzX5B;
            }
        }
        if (iArr != null) {
            return iArr;
        }
        zzXY8().zzXZR();
        int columnsCount = zzXY8().getColumnsCount();
        int[] iArr3 = new int[columnsCount];
        for (int i2 = 0; i2 < columnsCount; i2++) {
            iArr3[i2] = Math.max(0, zzXY8().zzAm(i2).zzCu * 50);
        }
        this.zzX5z = null;
        return iArr3;
    }

    private void zzXYp() throws Exception {
        if (((zzZ30) zzYTt()).zzYKv()) {
            zz6f();
        }
        if (zzXYr()) {
            return;
        }
        this.zzX5A = zzXYu();
        if (zzXYr()) {
            return;
        }
        this.zzX5A = zzXYm();
    }

    private boolean zzXYr() {
        return this.zzX5A != null;
    }

    private int[] zzXYu() throws Exception {
        if (((zzZ30) zzYTt()).zzYKv()) {
            zzXY7().zzZ(this);
        }
        if (zzY6U.zzZ(zzXYo())) {
            return zzXYo().zzXZq();
        }
        return null;
    }

    private void zzXYv() throws Exception {
        this.zzX5A = null;
        for (zzYIC zzyic = (zzYIC) zzZXZ(); zzyic != null; zzyic = (zzYIC) zzyic.zzYTp()) {
            for (zzWV zzwv = (zzWV) zzyic.zzZXZ(); zzwv != null; zzwv = (zzWV) zzwv.zzYTp()) {
                zzwv.zz6j();
                for (zzZ6T zzz6tZzZXZ = zzwv.zzZXZ(); zzz6tZzZXZ != null; zzz6tZzZXZ = zzz6tZzZXZ.zzYTp()) {
                    if (4 == zzz6tZzZXZ.zz6y()) {
                        ((zzY6N) zzz6tZzZXZ).zzXYv();
                    } else if (32 == zzz6tZzZXZ.zz6y()) {
                        zzY44.zzK(zzz6tZzZXZ);
                    }
                }
                for (zzWT zzwtZz6t = zzwv.zz6t(); zzwtZz6t != null; zzwtZz6t = (zzWT) zzwtZz6t.zzYo1()) {
                    zzwtZz6t.zzMG(0);
                }
            }
        }
    }

    private void zzYoc() throws Exception {
        this.zzX5q = true;
        if (!zzXY5()) {
            zzXY6();
        }
        this.zzX5q = false;
    }

    @Override // com.aspose.words.zzTG, com.aspose.words.zzZ6T
    public final void merge() throws Exception {
        if (zzYTp() == null) {
            return;
        }
        this.zzX5B = ((zzY6N) zzYTp()).zzX5B;
        super.merge();
    }

    public final int zz56() throws Exception {
        if (this.zzZA5 == null) {
            zzYoc();
        }
        return this.zzZA5.zz56();
    }

    public final int zz6e() throws Exception {
        if (this.zzZA5 == null) {
            zzYoc();
        }
        return this.zzZA5.zz6e();
    }

    public final int zz6f() throws Exception {
        if (this.zzZA5 == null) {
            zzYoc();
        }
        return this.zzZA5.zz6f();
    }

    @Override // com.aspose.words.zzZ6T
    public final zzZ6T zz6u() throws Exception {
        zzY6N zzy6n = new zzY6N();
        zzy6n.zzZ(zzYTt());
        int[] iArr = this.zzX5B;
        if (iArr != null) {
            zzy6n.zzX5B = (int[]) iArr.clone();
        }
        return zzy6n;
    }

    @Override // com.aspose.words.zzZ6T
    public final int zz6y() {
        return 4;
    }

    public final void zzPH(boolean z) {
        this.zzX5r = z;
    }

    public final void zzVc(int i, int i2) throws Exception {
        this.zzX5w = zzYIB.zzZ(this, 0, i, i2) - i;
        this.zzX5v = zzYIB.zzZ(this, 1, i, i2) - i;
        this.zzX5u = zzYIB.zzZ(this, 2, i, i2) - i;
        zzTF zztfZzZZJ = ((zzYIC) zzZXZ()).zzYk3().zzZZJ();
        if (zzYIB.zzR(((zzYIC) zzZXZ()).zzYk3())) {
            i = zztfZzZZJ.zzZXT() - i2;
        }
        this.zzX5t = i;
        this.zzX5s = i;
    }

    @Override // com.aspose.words.zzZ6T
    public final zzTF zzX(zzYMD zzymd) throws Exception {
        return zza9().zzX(zzymd);
    }

    public final zzZNE zzXY9() {
        return this.zzX5p;
    }

    public final boolean zzXYa() {
        return this.zzX5q;
    }

    public final int zzXYb() {
        return this.zzX5s;
    }

    public final int zzXYc() {
        return this.zzX5t;
    }

    public final int zzXYd() {
        return this.zzX5u;
    }

    public final int zzXYe() {
        return this.zzX5v;
    }

    public final int zzXYf() {
        return this.zzX5w;
    }

    public final zzYIC zzXYg() {
        zzYIC zzyic = null;
        for (zzYIC zzyic2 = (zzYIC) zzZXZ(); zzyic2 != null && zzyic2.zzBz(); zzyic2 = (zzYIC) zzyic2.zzYTp()) {
            zzyic = zzyic2;
        }
        return zzyic;
    }

    public final void zzXYh() {
        this.zzX5x = Integer.MIN_VALUE;
    }

    public final int zzXYi() throws Exception {
        if (this.zzX5x == Integer.MIN_VALUE) {
            this.zzX5x = 0;
            if (!zzXYk()) {
                return this.zzX5x;
            }
            for (zzYIC zzyic = (zzYIC) zzZXZ(); zzyic != null && zzyic.zzBz(); zzyic = (zzYIC) zzyic.zzYTp()) {
                this.zzX5x += zzyic.zz6x().getHeight();
            }
        }
        return this.zzX5x;
    }

    public final boolean zzXYj() {
        return this.zzX5r;
    }

    public final boolean zzXYk() {
        return (this.zzX5r || !((zzYIC) zzZXZ()).zzBz() || ((zzY6N) ((zzYIC) zzZXZ()).zza9()).zzhk()) ? false : true;
    }

    public final int[] zzXYl() {
        return this.zzX5B;
    }

    public final boolean zzXYn() throws Exception {
        boolean z = false;
        if (!zzY6U.zzZ(zzXYo())) {
            return false;
        }
        if (((zzZ30) zzYTt()).zzYKv() && ((zzZ30) zzYTt()).zzYMZ().isAuto() && zzXYo().getState() == 2 && !((zzZ30) zzYTt()).zzZz()) {
            z = true;
        }
        if (z) {
            zzk0(1);
            zzXYv();
        }
        return z;
    }

    public final zzY6U zzXYo() {
        Table parentTable = ((zzYIC) zzZXY()).zz69().zzY67().getParentTable();
        if (parentTable != null) {
            return parentTable.zzZYf().zzXXf();
        }
        return null;
    }

    public final void zzXYq() throws Exception {
        if (zzXYr()) {
            return;
        }
        zzXYp();
    }

    public final boolean zzXYs() {
        ((zzZ30) zzYTt()).zzYKv();
        return zzXYo() == null || zzXYo().getState() == 1;
    }

    public final int[] zzXYt() throws Exception {
        zzXYp();
        return this.zzX5A;
    }

    @Override // com.aspose.words.zzZ6T
    public final void zzY(zzTG zztg) throws Exception {
        zza9();
        if (zztg == null) {
            zztg = (zzTG) zza9().zzYTo();
        }
        zza9();
        zzY6N zzy6n = (zzY6N) zz6u();
        zztg.zzZ(zztg.zzZXY(), null, zzy6n);
        ArrayList<zzZ6T> arrayListZzX = zzX((zzZ6T) null);
        for (int i = 0; i < arrayListZzX.size(); i++) {
            arrayListZzX.get(i).zzY((zzTG) zzy6n);
        }
    }

    public final zzZ30 zzY6a() {
        return (zzZ30) zzYTt();
    }

    @Override // com.aspose.words.zzZ6T
    public final void zzYTq() throws Exception {
        for (zzYIC zzyic = (zzYIC) zzZXZ(); zzyic != null; zzyic = (zzYIC) zzyic.zzYTp()) {
            zzyic.zzYTq();
        }
    }

    @Override // com.aspose.words.zzZ6T
    public final void zzYTr() throws Exception {
        for (zzYIC zzyic = (zzYIC) zzZXZ(); zzyic != null; zzyic = (zzYIC) zzyic.zzYTp()) {
            zzyic.zzYTr();
        }
    }

    public final void zzYU(Object obj) {
        zzY9C zzy9cZzaa;
        if (((zzZ30) zzYTt()) != null) {
            if ((obj != this && !((zzZ30) zzYTt()).zzYKv()) || (zzy9cZzaa = zzaa()) == null || this.zzXZT == zzy9cZzaa.zzYDM()) {
                return;
            }
            this.zzXZT = zzy9cZzaa.zzYDM();
            zzZ(this, new zzYZC(this, ((zzZ30) zzYTt()).zzYKv() ? 2 : 1, this.zzXZT));
        }
    }

    @Override // com.aspose.words.zzZ6T
    public final void zzZ(zzZ3E zzz3e) throws Exception {
        super.zzZ(zzz3e);
        zzYU(this);
    }

    public final void zzZY(int[] iArr) {
        this.zzX5B = iArr;
    }

    public final boolean zzZz() {
        return ((zzZ30) zzYTt()).zzZz();
    }

    @Override // com.aspose.words.zzYS
    public final zzY6N zza6() {
        if (zza9() == null || !zzhk()) {
            return null;
        }
        return (zzY6N) ((zzYIC) ((zzWV) zza9()).zza9()).zza9();
    }

    public final boolean zzhk() {
        return zza9().zz6y() == 16;
    }

    public final void zzjY(int i) {
        this.zzX5s = i;
    }

    public final void zzjZ(int i) {
        this.zzX5t = i;
    }

    public final void zzk0(int i) {
        zzY6N zzy6nZza6 = this;
        while (true) {
            if (zzy6nZza6.zzXYo() != null) {
                zzy6nZza6.zzXYo().setState(1);
            }
            if (!zzy6nZza6.zzhk()) {
                return;
            } else {
                zzy6nZza6 = zzy6nZza6.zza6();
            }
        }
    }

    @Override // com.aspose.words.zzZ6T
    public final void zzZ(zzTG zztg) throws Exception {
        zza9();
        if (zztg == null) {
            zztg = (zzTG) zza9().zzYTp();
        }
        zza9();
        ArrayList<zzYMD> arrayListZzA = zzA(null);
        for (int size = arrayListZzA.size() - 1; size >= 0; size--) {
            arrayListZzA.get(size).zzZZJ().zzY(arrayListZzA.get(size), true);
        }
        zzY6N zzy6n = (zzY6N) zz6u();
        zztg.zzZ(null, zztg.zzZXZ(), zzy6n);
        ArrayList<zzZ6T> arrayListZzX = zzX((zzZ6T) null);
        for (int size2 = arrayListZzX.size() - 1; size2 >= 0; size2--) {
            arrayListZzX.get(size2).zzZ((zzTG) zzy6n);
        }
    }

    @Override // com.aspose.words.zzTG, com.aspose.words.zzZ6T
    public final void zzY(zzZ6T zzz6t) throws Exception {
        zzYU(this);
        super.zzY(zzz6t);
    }

    @Override // com.aspose.words.zzTG, com.aspose.words.zzZ6T
    public final void zzZ(zzZ6T zzz6t, zzZ6T zzz6t2, zzZ6T zzz6t3) throws Exception {
        zzYU(this);
        super.zzZ(zzz6t, zzz6t2, zzz6t3);
    }

    @Override // com.aspose.words.zzYS
    public final void zzZ(zzYZC zzyzc) throws Exception {
        zzY6N zzy6n;
        if (zza9() == null) {
            return;
        }
        int iZzYDN = zzyzc.zzYDN();
        if (iZzYDN == 2 || iZzYDN == 1) {
            ((zzZ30) zzYTt()).zzYKv();
            if (iZzYDN == 2 && ((zzZ30) zzYTt()).zzYKv()) {
                zzy6n = this;
                while (zzy6n.zzXY4() && zzy6n.zzhk()) {
                    zzWV zzwv = (zzWV) zzy6n.zza9();
                    zzwv.zz6d();
                    zzy6n = (zzY6N) ((zzYIC) zzwv.zza9()).zza9();
                    ((zzZ30) zzy6n.zzYTt()).zzYKv();
                }
            } else {
                zzy6n = this;
            }
            zzZNC.zzX(((zzYIC) zzy6n.zzZXZ()).zzYk3());
            zzy6n.zzXYv();
        }
    }

    public final void zzZ(zzZNE zzzne) {
        this.zzX5p = zzzne;
    }
}
