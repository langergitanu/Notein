package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzWV extends zzTG {
    private int zzVL = Integer.MIN_VALUE;
    private zzWV zzZA3;
    private zzWV zzZA4;
    private zzY6P zzZA5;
    private zzYMD zzZA6;
    private zzYMD zzZA7;
    private int zzZA8;
    private int zzZA9;

    private int zz61() {
        if (!((zzZ3B) zzYTt()).zzYMX() && ((zzZ3B) zzYTt()).zzYMZ().isFixed() && zza6().zzY6a().zzYKu()) {
            return com.aspose.words.internal.zzSA.zzYx(((zzZ3B) zzYTt()).zzYMV().zzwz(1).zzYN3() + ((zzZ3B) zzYTt()).zzYMV().zzwz(2).zzYN3());
        }
        return 0;
    }

    private int zz62() {
        zzWV zzwv;
        zzZ3D zzz3dZzwz = ((zzZ3B) zzYTt()).zzYMV().zzwz(2);
        return (((zzYIC) zza9()).zzYk5() || (zzwv = (zzWV) zzYTp()) == null || zzwv.zzYTn()) ? zzz3dZzwz.zzYN3() : zzZ(((zzZ3B) zzwv.zzYTt()).zzYMV().zzwz(1), zzz3dZzwz);
    }

    private int zz63() {
        zzWV zzwv;
        zzZ3D zzz3dZzwz = ((zzZ3B) zzYTt()).zzYMV().zzwz(1);
        return (((zzYIC) zza9()).zzYk5() || (zzwv = (zzWV) zzYTo()) == null) ? zzz3dZzwz.zzYN3() : zzZ(zzz3dZzwz, ((zzZ3B) zzwv.zzYTt()).zzYMV().zzwz(2));
    }

    private int zz64() {
        int iZz63 = zz63() + zz62();
        int leftPadding = ((zzZ3B) zzYTt()).getLeftPadding() + ((zzZ3B) zzYTt()).getRightPadding();
        return com.aspose.words.internal.zzSA.zzYx(((zzYIC) zza9()).zzYk5() ? leftPadding + iZz63 : Math.max(leftPadding, iZz63 / 2));
    }

    private boolean zz65() throws Exception {
        if (zz6c()) {
            return false;
        }
        for (zzZ6T zzz6tZzZXZ = zzZXZ(); zzz6tZzZXZ != null; zzz6tZzZXZ = zzz6tZzZXZ.zzYTp()) {
            if (zzz6tZzZXZ.zz6y() != 32 || !zzX((zzYMM) zzz6tZzZXZ)) {
                return false;
            }
        }
        return true;
    }

    private void zz66() throws Exception {
        zzY6P zzy6p = new zzY6P();
        zzZ(zzy6p);
        zzy6p.zzk5(Math.max(zzy6p.zz6f(), zz64() + 6));
        zzy6p.zzk4(Math.max(zzy6p.zz6e(), zzy6p.zz6f()));
        zzy6p.zzXYP();
        this.zzZA5 = zzy6p;
    }

    private boolean zz6r() {
        return !zzYTn() && ((zzWV) zzYTp()).zzYTn();
    }

    public final int getColumnCount() {
        return zzY6U.zzZ(((zzY6N) ((zzYIC) zza9()).zza9()).zzXYo()) ? this.zzZA8 : this.zzZA9;
    }

    public final int getColumnIndex() {
        zza9();
        int iZzYka = ((zzYIC) zza9()).zzYka();
        if (zzYTm()) {
            return iZzYka;
        }
        for (zzZ6T zzz6tZzYTp = (zzWV) ((zzYIC) zza9()).zzZXZ(); zzz6tZzYTp != null && this != zzz6tZzYTp; zzz6tZzYTp = zzz6tZzYTp.zzYTp()) {
            iZzYka += ((zzWV) zzz6tZzYTp).getColumnCount();
        }
        return iZzYka;
    }

    public final int getRight() throws Exception {
        return zzWU.zzX(this) + getWidth();
    }

    public final int getWidth() throws Exception {
        if (Integer.MIN_VALUE == this.zzVL) {
            this.zzVL = zzWU.zzW(this);
        }
        return this.zzVL;
    }

    @Override // com.aspose.words.zzTG, com.aspose.words.zzZ6T
    public final void merge() throws Exception {
        if (zzYTp() == null) {
            return;
        }
        zzWV zzwv = (zzWV) zzYTp();
        this.zzZA9 = zzwv.zzZA9;
        this.zzZA8 = zzwv.zzZA8;
        super.merge();
    }

    @Override // com.aspose.words.zzZ6T
    public final void remove() throws Exception {
        while (true) {
            zzYMD zzymd = this.zzZA7;
            if (zzymd == null) {
                super.remove();
                return;
            } else {
                zzymd.zzZZJ().zzY(this.zzZA7, true);
                zzB(this.zzZA7);
            }
        }
    }

    public final int zz67() {
        return zzWU.zzZ(this, !zz6a() ? 2 : 1);
    }

    public final int zz68() {
        return zzWU.zzZ(this, zz6a() ? 2 : 1);
    }

    public final zzYAS zz69() {
        return (zzYAS) ((zzYMM) zzZXY()).zzZ9r();
    }

    public final boolean zz6a() {
        return ((zzY6N) ((zzYIC) zza9()).zza9()).zzY6a().zzZz();
    }

    public final void zz6b() {
        if (zza9() == null || zza9().zza9() == null) {
            return;
        }
        this.zzZA5 = null;
        ((zzY6N) ((zzYIC) zza9()).zza9()).zzYU(this);
    }

    public final boolean zz6c() {
        int orientation;
        return (zzYTn() || (orientation = ((zzZ3B) zzYTt()).getOrientation()) == 0 || orientation == 4) ? false : true;
    }

    public final void zz6d() {
        this.zzZA5 = null;
    }

    public final int zz6e() throws Exception {
        return zz6g().zz6e();
    }

    public final int zz6f() throws Exception {
        return zz6g().zz6f();
    }

    public final zzY6P zz6g() throws Exception {
        if (this.zzZA5 == null) {
            zz66();
        }
        return this.zzZA5;
    }

    public final zzWV zz6h() {
        zza9();
        if (((zzYIC) ((zzYIC) zza9()).zzYTp()) == null) {
            return null;
        }
        return ((zzYIC) ((zzYIC) zza9()).zzYTp()).zzpe(getColumnIndex());
    }

    public final zzWV zz6i() {
        zza9();
        if (((zzYIC) ((zzYIC) zza9()).zzYTo()) == null) {
            return null;
        }
        return ((zzYIC) ((zzYIC) zza9()).zzYTo()).zzpe(getColumnIndex());
    }

    public final void zz6j() {
        this.zzVL = Integer.MIN_VALUE;
    }

    public final zzWV zz6k() {
        zzWV zzwv = this;
        while (true) {
            zzWV zzwv2 = zzwv.zzZA3;
            if (zzwv2 == null) {
                return zzwv;
            }
            zzwv = zzwv2;
        }
    }

    public final zzWV zz6l() {
        zzWV zzwv = this;
        while (true) {
            zzWV zzwv2 = zzwv.zzZA4;
            if (zzwv2 == null) {
                return zzwv;
            }
            zzwv = zzwv2;
        }
    }

    public final int zz6m() {
        return this.zzZA4 == null ? this.zzZA3 == null ? 0 : 1 : this.zzZA3 == null ? 3 : 2;
    }

    public final zzWV zz6n() {
        return this.zzZA3;
    }

    public final zzWV zz6o() {
        return this.zzZA4;
    }

    public final int zz6p() {
        return this.zzZA8;
    }

    public final int zz6q() {
        return this.zzZA9;
    }

    public final zzWT zz6s() {
        return (zzWT) this.zzZA6;
    }

    public final zzWT zz6t() {
        return (zzWT) this.zzZA7;
    }

    @Override // com.aspose.words.zzZ6T
    public final zzZ6T zz6u() throws Exception {
        zzWV zzwv = new zzWV();
        zzwv.zzZ(zzYTt());
        zzwv.zzZA9 = this.zzZA9;
        zzwv.zzZA8 = this.zzZA8;
        return zzwv;
    }

    public final void zz6v() throws Exception {
        super.zzZ(zzZ3B.zzY((zzZ3B) zzYTt()));
    }

    @Override // com.aspose.words.zzZ6T
    public final zzYMD zz6w() {
        return this.zzZA6;
    }

    @Override // com.aspose.words.zzZ6T
    public final zzYMD zz6x() {
        return this.zzZA7;
    }

    @Override // com.aspose.words.zzZ6T
    public final int zz6y() {
        return 16;
    }

    public final boolean zz8s() {
        return ((zzY6N) ((zzYIC) zza9()).zza9()).zzY6a().zzZz() ? zzYTm() : zz6r();
    }

    public final boolean zz8t() {
        return ((zzY6N) ((zzYIC) zza9()).zza9()).zzY6a().zzZz() ? zz6r() : zzYTm();
    }

    public final void zzOB(int i) throws Exception {
        zz6g();
        zz6g().zzk5(Math.max(zz6g().zz6f(), Math.max(0, i) + zz64()));
        zz6g().zzk4(Math.max(zz6g().zz6e(), zz6g().zz6f()));
    }

    public final void zzOC(int i) {
        this.zzZA8 = i;
    }

    public final void zzOD(int i) {
        this.zzZA9 = i;
    }

    @Override // com.aspose.words.zzZ6T
    public final zzTF zzX(zzYMD zzymd) throws Exception {
        zzymd.zza9();
        zza9();
        if (16 == zzymd.zz60()) {
            return ((zzYIC) zza9()).zzX(zzymd);
        }
        zzYMD zzymd2 = this.zzZA7;
        if (zzymd2 == null) {
            zzZ(null, null, new zzWT(), true);
            return (zzTF) this.zzZA7;
        }
        if (zzymd2 == this.zzZA6) {
            return (zzTF) zzymd2;
        }
        do {
            zzymd = ((zzTC) zzymd).zzZXJ();
            if (zzymd == null || !zzZ(this, zzymd)) {
                return (zzTF) this.zzZA7;
            }
        } while (zzymd.zzZZJ() == null);
        return zzymd.zzZZJ();
    }

    @Override // com.aspose.words.zzZ6T
    public final void zzY(zzYMD zzymd) {
        this.zzZA6 = zzymd;
    }

    @Override // com.aspose.words.zzZ6T
    public final void zzZ(zzYMD zzymd) {
        this.zzZA7 = zzymd;
    }

    @Override // com.aspose.words.zzYS
    public final zzYIC zza5() {
        return (zzYIC) zza9();
    }

    @Override // com.aspose.words.zzTG, com.aspose.words.zzZ6T
    public final void zzY(zzZ6T zzz6t) throws Exception {
        zz6b();
        super.zzY(zzz6t);
    }

    @Override // com.aspose.words.zzTG, com.aspose.words.zzZ6T
    public final void zzZ(zzZ6T zzz6t, zzZ6T zzz6t2, zzZ6T zzz6t3) throws Exception {
        zz6b();
        super.zzZ(zzz6t, zzz6t2, zzz6t3);
    }

    public final void zzY(zzWV zzwv) {
        if (zzwv != null && zzwv.getColumnCount() == getColumnCount()) {
            zzwv.getColumnIndex();
            getColumnIndex();
        }
        this.zzZA3 = zzwv;
    }

    public final void zzZ(zzWV zzwv) {
        if (zzwv != null && zzwv.getColumnCount() == getColumnCount()) {
            zzwv.getColumnIndex();
            getColumnIndex();
        }
        this.zzZA4 = zzwv;
    }

    private static int zzZ(zzZ3D zzz3d, zzZ3D zzz3d2) {
        Border borderZzZ = Border.zzZ(zz5.zzZ(zzz3d), zz5.zzZ(zzz3d2));
        return com.aspose.words.internal.zzSA.zzn(Border.zzT(borderZzZ.getLineStyle(), (float) borderZzZ.getLineWidth()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.aspose.words.zzYMD] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.aspose.words.zzYS] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.aspose.words.zzZ6T] */
    private static boolean zzZ(zzZ6T zzz6t, zzYMD zzymd) {
        do {
            zzymd = zzymd.zza9();
            if (zzymd == 0) {
                return false;
            }
        } while (zzymd != zzz6t);
        return true;
    }

    @Override // com.aspose.words.zzZ6T
    public final void zzZ(zzZ3E zzz3e) throws Exception {
        if (((zzYIC) zza9()) != null) {
            zz6b();
        }
        super.zzZ(zzz3e);
    }

    private void zzZ(zzY6P zzy6p) throws Exception {
        int iZz6f;
        if (((zzY6N) ((zzYIC) zza9()).zza9()).zzY6a().zzYKv() && !((zzZ3B) zzYTt()).getFitText()) {
            int iZz64 = zz64();
            zzy6p.zzk6(iZz64);
            int iZzS = zzWU.zzS(this) / 50;
            for (zzZ6T zzz6tZzZXZ = zzZXZ(); zzz6tZzZXZ != null; zzz6tZzZXZ = zzz6tZzZXZ.zzYTp()) {
                int iZz6y = zzz6tZzZXZ.zz6y();
                if (iZz6y == 4) {
                    zzY6N zzy6n = (zzY6N) zzz6tZzZXZ;
                    if (zz6c()) {
                        if (zzz6tZzZXZ == zzZXZ()) {
                            zzy6p.zzk5(((zzYIC) zzy6n.zzZXZ()).zz6x().getHeight() + iZz64);
                            if (zzz6tZzZXZ.zzYTp() != null) {
                                iZz6f = ((zzYIC) zzy6n.zzZXZ()).zzYk0() + iZz64;
                            } else {
                                iZz6f = zzy6p.zz6f();
                            }
                            zzy6p.zzk4(iZz6f);
                        } else {
                            zzy6p.zzk4(zzy6p.zz6e() + ((zzYIC) zzy6n.zzZXZ()).zzYk0());
                        }
                    } else {
                        int i = (-zzy6n.zzY6a().zzYKr()) - iZzS;
                        zzy6p.zzk6(Math.max(zzy6p.zz56(), zzy6n.zz56() + i));
                        zzy6p.zzk5(Math.max(zzy6p.zz6f(), zzy6n.zz6f() + i));
                        zzy6p.zzk4(Math.max(zzy6p.zz6e(), zzy6n.zz6e() + i));
                    }
                } else if (iZz6y == 32) {
                    zzYMM zzymm = (zzYMM) zzz6tZzZXZ;
                    if (zz6c()) {
                        if (zzz6tZzZXZ == zzZXZ()) {
                            zzy6p.zzk4(zzymm.zzYoq() + iZz64);
                            zzy6p.zzk5(zzy6p.zz6e());
                        } else {
                            zzy6p.zzk4(zzy6p.zz6e() + zzymm.zzYoq());
                        }
                    } else {
                        int minWidth = zzymm.getMinWidth() + iZz64;
                        int maxWidth = zzymm.getMaxWidth() + iZz64;
                        if (!((zzZ3B) zzYTt()).zzYMX()) {
                            if (((zzZ3B) zzYTt()).zzYMZ().isFixed()) {
                                minWidth = Math.max(((zzZ3B) zzYTt()).zzYMZ().zzYmD() + zz61(), minWidth);
                                maxWidth = Math.max(maxWidth, minWidth);
                            } else {
                                minWidth = maxWidth;
                            }
                        }
                        zzy6p.zzk5(Math.max(zzy6p.zz6f(), minWidth));
                        zzy6p.zzk4(Math.max(zzy6p.zz6e(), maxWidth));
                    }
                }
            }
            if (zz65()) {
                zzy6p.zzk5(iZz64 + 1440);
                zzy6p.zzk4(zzy6p.zz6f());
            }
        }
    }

    private static boolean zzX(zzYMM zzymm) throws Exception {
        boolean z;
        zzYAU zzyauZzZ9s = zzymm.zzZ9s();
        boolean z2 = false;
        while (true) {
            if (zzyauZzZ9s == zzymm.zzZ9r()) {
                z = false;
                break;
            }
            if (zzyauZzZ9s.zzY75() && !zzY9R.zzmW(zzyauZzZ9s.zzZo6())) {
                if (!zzY9X.zzZf(zzyauZzZ9s)) {
                    z = true;
                    break;
                }
                z2 = true;
            }
            zzyauZzZ9s = (zzYAU) zzyauZzZ9s.zzYo1();
        }
        return z2 && !z;
    }
}
