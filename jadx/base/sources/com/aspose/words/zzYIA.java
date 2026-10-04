package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzYIA extends zzTC {
    private boolean zzXGn;
    private boolean zzXx1;
    private int zzXx9 = Integer.MIN_VALUE;
    private int zzXx8 = Integer.MIN_VALUE;
    private boolean zzXGm = false;
    private int zzXx7 = Integer.MIN_VALUE;
    private int zzXx6 = Integer.MIN_VALUE;
    private int zzXx5 = Integer.MIN_VALUE;
    private int zzXx4 = Integer.MIN_VALUE;
    private int zzXx3 = Integer.MIN_VALUE;
    private int zzXx2 = Integer.MIN_VALUE;

    private boolean zzRA(boolean z) throws Exception {
        if (z && this.zzXGm) {
            return this.zzXGn;
        }
        boolean zZzr = zzY39.zzr(this);
        if (z) {
            this.zzXGn = zZzr;
            this.zzXGm = true;
        }
        return zZzr;
    }

    private void zzYjJ() {
        if (Integer.MIN_VALUE == this.zzXx4) {
            zzYjy();
        }
    }

    private void zzYjP() {
        if (!((zzY6N) ((zzYIC) zza9()).zza9()).zzXYj() && zzZZJ().zz60() == 2 && !((zzY6N) ((zzYIC) zza9()).zza9()).zzY6a().isFloating() && !((zzYIC) zza9()).zzYTm() && zzYnZ() && zzZZJ().zzYnZ()) {
            for (zzYIC zzyic = (zzYIC) zza9(); zzyic != null && ((zzY6N) zzyic.zza9()) == ((zzY6N) ((zzYIC) zza9()).zza9()); zzyic = (zzYIC) zzyic.zzYTo()) {
                if (!zzyic.zzYk1().zzBz()) {
                    return;
                }
            }
            ((zzY6N) ((zzYIC) zza9()).zza9()).zzPH(true);
        }
    }

    private void zzYjy() {
        int iZzZ;
        int i;
        int iZzYN3 = ((zzYIC) zza9()).zzYk1().zzYMV().zzwz(0).zzYN3();
        int iZzYN32 = ((zzYIC) zza9()).zzYk1().zzYMV().zzwz(4).zzYN3();
        boolean zZzYk5 = ((zzYIC) zza9()).zzYk5();
        int iMax = 0;
        int iZzYKt = 0;
        int iMax2 = 0;
        int iMax3 = 0;
        int iMax4 = 0;
        for (zzWV zzwv = (zzWV) ((zzYIC) zza9()).zzZXZ(); zzwv != null && !zzwv.zzYTn(); zzwv = (zzWV) zzwv.zzYTp()) {
            zzZ3D zzz3dZzwz = ((zzZ3B) zzwv.zzYTt()).zzYMV().zzwz(0);
            if (zzz3dZzwz == null || zzz3dZzwz.isAmbient()) {
                iZzZ = iZzYN3;
                i = iZzYN32;
            } else {
                iZzZ = zzWU.zzZ(zzwv, 0);
                i = iZzZ;
            }
            iMax4 = Math.max(iMax4, ((zzZ3B) zzwv.zzYTt()).getBottomPadding());
            iMax2 = Math.max(iMax2, ((zzZ3B) zzwv.zzYTt()).getBottomPadding() + iZzZ);
            iMax3 = Math.max(iMax3, ((zzZ3B) zzwv.zzYTt()).getBottomPadding() + i);
            iZzYKt = Math.max(iZzYKt, iZzZ);
            iMax = Math.max(iMax, i);
        }
        if (zZzYk5) {
            this.zzXx5 = iMax4;
            this.zzXx3 = iMax4;
            int iMax5 = Math.max(0, iMax2 - iMax4);
            iMax = Math.max(0, iMax3 - iMax4) + ((zzYIC) zza9()).zzYKt();
            iZzYKt = ((zzYIC) zza9()).zzYKt() + iZzYN3 + iMax5;
            if (((zzYIC) zza9()).zzYTn()) {
                iZzYKt += ((zzYIC) zza9()).zzYKt();
            }
        } else {
            this.zzXx3 = Math.max(0, iMax2 - iZzYKt);
            this.zzXx5 = Math.max(0, iMax3 - iMax);
        }
        this.zzXx4 = iMax;
        this.zzXx2 = iZzYKt;
    }

    private void zzYjz() {
        int i;
        int iZzZ;
        int iZzYN3 = ((zzYIC) zza9()).zzYk1().zzYMV().zzwz(3).zzYN3();
        int iZzYN32 = ((zzYIC) zza9()).zzYk1().zzYMV().zzwz(4).zzYN3();
        boolean zZzYk5 = ((zzYIC) zza9()).zzYk5();
        int iZzYKt = 0;
        int iZzYKt2 = 0;
        for (zzWV zzwv = (zzWV) ((zzYIC) zza9()).zzZXZ(); zzwv != null && !zzwv.zzYTn(); zzwv = (zzWV) zzwv.zzYTp()) {
            zzZ3D zzz3dZzwz = ((zzZ3B) zzwv.zzYTt()).zzYMV().zzwz(3);
            if (zzz3dZzwz == null || zzz3dZzwz.isAmbient()) {
                i = iZzYN3;
                iZzZ = iZzYN32;
            } else {
                iZzZ = zzWU.zzZ(zzwv, 3);
                i = iZzZ;
            }
            int topPadding = ((zzZ3B) zzwv.zzYTt()).getTopPadding();
            iZzYKt = Math.max(iZzYKt, iZzZ + topPadding);
            iZzYKt2 = Math.max(iZzYKt2, topPadding + i);
        }
        if (zZzYk5) {
            iZzYKt += ((zzYIC) zza9()).zzYKt();
            iZzYKt2 += ((zzYIC) zza9()).zzYKt() + iZzYN3;
            if (((zzYIC) zza9()).zzYTm()) {
                iZzYKt2 += ((zzYIC) zza9()).zzYKt();
            }
        }
        this.zzXx7 = iZzYKt;
        this.zzXx6 = iZzYKt2;
    }

    private boolean zzpc(int i) throws Exception {
        this.zzXx9 = Integer.MIN_VALUE;
        this.zzXx8 = Integer.MIN_VALUE;
        boolean zZzRA = zzRA(false);
        this.zzXGm = false;
        super.setHeight(i);
        for (zzWT zzwt = (zzWT) zz6x(); zzwt != null; zzwt = (zzWT) zzwt.zz5Z()) {
            zzwt.zz5S();
        }
        return zZzRA != this.zzXGn;
    }

    @Override // com.aspose.words.zzYMD
    public final int getContentHeight() throws Exception {
        return zzYIB.zzJ(this);
    }

    @Override // com.aspose.words.zzTF, com.aspose.words.zzYMD
    public final int getHeight() throws Exception {
        if (zzRA(true)) {
            return 0;
        }
        if (super.getHeight() == Integer.MIN_VALUE) {
            zzYjQ();
        }
        return super.getHeight() + zzYjL();
    }

    @Override // com.aspose.words.zzYMD
    public final int zz0t() throws Exception {
        if (zzRA(true)) {
            return 0;
        }
        return zzYIB.zzI(this);
    }

    public final int zz56() throws Exception {
        if (Integer.MIN_VALUE == this.zzXx8) {
            this.zzXx8 = zzYIB.zzY(this, false);
        }
        return this.zzXx8;
    }

    @Override // com.aspose.words.zzTF
    public final boolean zz5T() {
        return ((zzYIC) zza9()).zz6a();
    }

    @Override // com.aspose.words.zzYMD
    public final int zz60() {
        return 8;
    }

    public final void zzRr(boolean z) {
        this.zzXx1 = z;
    }

    @Override // com.aspose.words.zzTC
    public final boolean zzX(zzTF zztf) throws Exception {
        if (!super.zzX(zztf) || zzRA(true) || zzZZJ().zz60() == 16) {
            return false;
        }
        zzYIA zzyiaZzYk2 = ((zzYIC) ((zzYIC) zza9()).zzYTo()) != null ? ((zzYIC) ((zzYIC) zza9()).zzYTo()).zzYk2() : null;
        if (zza7().zzZYM() && zzyiaZzYk2 != null && zzZ7C.zzQ(zzyiaZzYk2)) {
            return false;
        }
        return ((zzZ37) zzYMM.zzR(zza9()).zzYTt()).zzYLV();
    }

    public final boolean zzYjA() {
        return this.zzXx1;
    }

    public final boolean zzYjB() {
        return (!zzYnZ() || ((zzYIC) zza9()).zzYTm() || !((zzY6N) ((zzYIC) zza9()).zza9()).zzXYk() || ((zzYIC) zza9()).zzBz() || this.zzXx1) ? false : true;
    }

    public final boolean zzYjC() {
        for (zzYIA zzyia = this; zzyia.zzYnZ(); zzyia = (zzYIA) com.aspose.words.internal.zzZKW.zzZ(zzyia.zzZZJ().zzZZJ(), zzYIA.class)) {
            if (zzyia.zzZZJ().zz60() != 16) {
                if (zzyia.zzZZJ().zz60() == 2) {
                    return zzyia.zzZZJ().zzYnZ();
                }
                return false;
            }
        }
        return false;
    }

    public final boolean zzYjD() {
        return zzZZJ().zz60() == 2 && zzYnZ() && zzZZJ().zzYnZ();
    }

    public final boolean zzYjE() {
        return this == ((zzYIC) ((zzY6N) ((zzYIC) zza9()).zza9()).zzZXZ()).zzYk3();
    }

    public final boolean zzYjF() {
        return this == ((zzYIC) ((zzY6N) ((zzYIC) zza9()).zza9()).zzZXY()).zzYk2();
    }

    public final boolean zzYjG() {
        return zzYnY() || zza9().zzYTn();
    }

    public final boolean zzYjH() {
        return zzYnZ() || zzYjE();
    }

    public final int zzYjI() {
        zzYjJ();
        return zzYjG() ? this.zzXx3 : this.zzXx5;
    }

    public final int zzYjK() {
        zzYjJ();
        return zzYjG() ? this.zzXx2 : this.zzXx4;
    }

    public final int zzYjL() {
        return zzYjG() ? zzYjM() : ((zzYIC) zza9()).zzYk5() ? zzYjI() + zzYjK() : zzYjI();
    }

    public final int zzYjM() {
        zzYjJ();
        return this.zzXx3 + this.zzXx2;
    }

    public final int zzYjN() {
        if (this.zzXx7 == Integer.MIN_VALUE) {
            zzYjz();
        }
        if (((zzYIC) zza9()).zzYTm()) {
            return this.zzXx6;
        }
        if (!zzYnZ()) {
            int i = this.zzXx7;
            return !((zzYIC) zza9()).zzYk5() ? Math.max(i, ((zzYIA) zz5Y()).zzYjK()) : i;
        }
        if (zzYjB()) {
            return Math.max(this.zzXx7, ((zzY6N) ((zzYIC) zza9()).zza9()).zzXYg().zzYk3().zzYjK());
        }
        return this.zzXx6;
    }

    public final boolean zzYjO() {
        zzZ6T zzz6tZzZXZ = ((zzYIC) zza9()).zzZXZ();
        while (true) {
            zzWV zzwv = (zzWV) zzz6tZzZXZ;
            if (zzwv == ((zzWV) ((zzYIC) zza9()).zzZXY())) {
                return true;
            }
            if (zzwv.zz6n() == null) {
                return false;
            }
            zzz6tZzZXZ = zzwv.zzYTp();
        }
    }

    public final boolean zzYjQ() throws Exception {
        return zzpc(zzYIB.zzG(this) + zzYjN());
    }

    public final int zzYjR() throws Exception {
        if (Integer.MIN_VALUE == this.zzXx9) {
            this.zzXx9 = zzYIB.zzY(this, true);
        }
        return this.zzXx9;
    }

    public final zzYIA zzYjS() {
        zzYMD zzymdZz5Z = zz5Z();
        if (zzymdZz5Z != null && zzymdZz5Z.zz60() == 8 && zzymdZz5Z.zza9().zza9() == zza9().zza9()) {
            return (zzYIA) zzymdZz5Z;
        }
        return null;
    }

    public final zzYIA zzYjT() {
        zzYMD zzymd = this;
        while (true) {
            zzYMD zzymdZz5Y = zzymd.zz5Y();
            if (zzymdZz5Y == null || zzymdZz5Y.zz60() != 8 || zzymdZz5Y.zza9().zza9() != zza9().zza9()) {
                break;
            }
            zzymd = zzymdZz5Y;
        }
        return (zzYIA) zzymd;
    }

    public final boolean zzYjU() {
        for (zzWT zzwt = (zzWT) zz6x(); zzwt != null; zzwt = (zzWT) zzwt.zz5Z()) {
            if (!zzwt.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public final int zzYjV() throws Exception {
        if (zzZXN() == null) {
            return getY();
        }
        zzZXN();
        int y = zzZXN().zzZ8V().getY();
        if (!zzZXN().zzhk()) {
            if (((zzYBL) zzZZJ()).zz60() != 2) {
                zzYjF();
            }
            y -= ((zzYBL) zzZZJ()).getY();
        }
        return y + getY();
    }

    public final boolean zzYol() throws Exception {
        return zzRA(true);
    }

    public final void zzYzp() throws Exception {
        zza9();
        setY(zzYJP.zzo(this));
        if (getY() != Integer.MIN_VALUE) {
            return;
        }
        zzYjP();
        int iZzXYi = 0;
        int iZz5W = zzYJP.zzl(this) ? 0 : zzZZJ().zz5W();
        if (!((zzYIC) zza9()).zzBz() && !this.zzXx1) {
            iZzXYi = ((zzY6N) ((zzYIC) zza9()).zza9()).zzXYi();
        }
        setY(iZz5W + iZzXYi);
    }

    @Override // com.aspose.words.zzTC
    public final zzZ6T zzZXH() {
        zzYIC zzyic = (zzYIC) ((zzYIC) zza9()).zzYTo();
        return zzyic == null ? ((zzY6N) ((zzYIC) zza9()).zza9()).zzYTo() : zzyic;
    }

    @Override // com.aspose.words.zzTC
    public final zzZ6T zzZXI() {
        zzYIC zzyic = (zzYIC) ((zzYIC) zza9()).zzYTp();
        return zzyic == null ? ((zzY6N) ((zzYIC) zza9()).zza9()).zzYTp() : zzyic;
    }

    @Override // com.aspose.words.zzYS
    public final zzYIC zza5() {
        return (zzYIC) zza9();
    }

    @Override // com.aspose.words.zzTF, com.aspose.words.zzYMD
    public final com.aspose.words.internal.zzZL zzbF() throws Exception {
        if (super.zzbF() == null) {
            com.aspose.words.internal.zzG zzgZzZ = zz5.zzZ((zzTF) this, false);
            if (zzZXQ() != 0) {
                if (zzgZzZ.zzZO() == null) {
                    com.aspose.words.internal.OooO0O0.OooO00o(zzgZzZ);
                }
                zzgZzZ.zzZO().zzY(0.0f, zzZXQ() / 1000.0f, 1);
            }
            super.zzF(zzgZzZ);
        }
        return super.zzbF();
    }

    public final void zzpb(int i) throws Exception {
        zzYjG();
        zzpc(zzYIB.zzX(this, i));
    }
}
