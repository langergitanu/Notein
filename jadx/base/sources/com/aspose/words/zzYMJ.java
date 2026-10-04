package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYMJ {
    protected zzYBL zzXGb;

    public static boolean zz0(zzZ55 zzz55) throws Exception {
        zzYAU zzyauZzYQc = zzz55.zzYQc();
        if (!zzY9R.zzlw(zzyauZzYQc.zzZo6()) && zzY9R.zzmO(((zzYAU) zzz55.zz6w()).zzZo6())) {
            zzyauZzYQc = zzVE.zzY((zzYAU) zzyauZzYQc.zz5Y(), (zzYAU) zzz55.zz6x());
        }
        if (zzyauZzYQc != null) {
            return zzY9R.zzlw(zzyauZzYQc.zzZo6()) || 10528 == zzyauZzYQc.zzZo6();
        }
        return false;
    }

    private boolean zzO(zzTC zztc) throws Exception {
        zztc.zza7();
        zzUZ zzuz = (zzUZ) zztc.zzqh(2);
        if (zzuz.zz0m()) {
            return false;
        }
        zztc.zzN(zzuz.zzYn(false));
        for (zzUZ zzuz2 = zzuz; zzuz2 != null && zzuz2.zz0H() == zzuz.zz0H(); zzuz2 = (zzUZ) zzuz2.zzYo1()) {
            zzuz2.zzQP(true);
        }
        zztc.zzZZJ();
        return true;
    }

    private boolean zzX(zzWT zzwt, boolean z) throws Exception {
        zzTC zztcZzJ;
        boolean z2 = false;
        if (((zzWV) zzwt.zza9()).zz6m() != 0 || (zztcZzJ = zzY39.zzJ(zzwt)) == null) {
            return false;
        }
        if (zztcZzJ.zz60() != 8) {
            return zzZ(zzwt, zztcZzJ, z);
        }
        zzYIA zzyia = (zzYIA) zztcZzJ;
        if (z && zzyia.zzYnZ()) {
            z2 = true;
        }
        return zzZ(zzyia, z2);
    }

    public final boolean zzRy(boolean z) {
        if (this.zzXGb.zz60() == 16384 && !this.zzXGb.zzYnZ()) {
            return false;
        }
        if (this.zzXGb.zz60() == 2) {
            if (((zzTC) this.zzXGb.zz6x()).zz60() == 8 && this.zzXGb.zza7().zzZYM()) {
                zzYIA zzyia = (zzYIA) ((zzTC) this.zzXGb.zz6x());
                if (z && zzyia.zzYjB() && !zzyia.zzYTn()) {
                    return false;
                }
            } else {
                zzUZ zzuz = (zzUZ) this.zzXGb;
                if (((zzZ35) ((zzZ2D) zzuz.zza9()).zzYTt()).getColumnsCount() > 1 && zzuz.zz0h() && zzuz.zz0o() && zzuz.zz0H().isEmpty()) {
                    return true;
                }
            }
        }
        return z;
    }

    public boolean zzRz(boolean z) throws Exception {
        return (this.zzXGb.zz60() != 2 || this.zzXGb.zza7().zzZYM()) ? zzRy(z) : z || ((zzUZ) this.zzXGb).zz0h();
    }

    public boolean zzS(zzTC zztc) {
        return zztc.zzYnZ();
    }

    public boolean zzV(zzTC zztc, boolean z) throws Exception {
        boolean z2 = false;
        if (!zztc.zzZZJ().zza7().zzZYM()) {
            return false;
        }
        zzYIA zzyia = (zzYIA) zztc;
        if (z && zztc.zzYnZ()) {
            z2 = true;
        }
        return zzZ(zzyia, z2);
    }

    public abstract boolean zzW(zzTC zztc, boolean z) throws Exception;

    public abstract boolean zzY(zzYBL zzybl);

    public boolean zzYob() {
        return false;
    }

    public final boolean zzZ(zzYBL zzybl, boolean z) throws Exception {
        zzTC zztcZzJ;
        if (zzybl.isEmpty() || zzybl.zzYTn() || !zzY(zzybl) || (zztcZzJ = zzY39.zzJ(zzybl)) == null) {
            return false;
        }
        this.zzXGb = zzybl;
        boolean zZzRz = zzRz(z);
        int iZz60 = zztcZzJ.zz60();
        if (iZz60 == 8) {
            return zzV(zztcZzJ, zZzRz);
        }
        if (iZz60 == 32) {
            return zzW(zztcZzJ, zZzRz);
        }
        throw new IllegalStateException("Unexpected part type.");
    }

    public boolean zzZ(zzYIA zzyia, boolean z) throws Exception {
        boolean z2 = false;
        if (zzyia.zzZXN() != null && !zzYob()) {
            return false;
        }
        zzWT zzwt = (zzWT) zzyia.zz6x();
        boolean zZzX = false;
        while (true) {
            if (zzwt == null) {
                break;
            }
            if (!zzwt.isEmpty() && !zzwt.isVirtual()) {
                zZzX |= zzX(zzwt, z);
                if (!zzyia.isActive()) {
                    return zZzX;
                }
                if (zzwt.isEmpty()) {
                    zzyia.zzZZJ();
                    zzyia.zzN((zzTF) zzyia.zzZZJ().zzYo1());
                    if (zzyia.zzZXN() != null && !zzyia.zzYjE()) {
                        ((zzZNG) com.aspose.words.internal.zzZKW.zzZ(zzyia.zzZXN(), zzZNG.class)).zzP((zzYIA) ((zzYIC) ((zzYIC) zzyia.zza9()).zzYTo()).zz6w());
                    }
                    z2 = true;
                } else {
                    zzwt.zzYU(true);
                }
            }
            zzwt = (zzWT) zzwt.zz5Z();
        }
        if (!z2 && !zzyia.zzac()) {
            zzyia.zzYU(true);
            zzyia.zzYjQ();
        }
        return zZzX;
    }

    public final boolean zzZ(zzTC zztc, zzTC zztc2, boolean z) throws Exception {
        if (zzS(zztc) && z) {
            if (this.zzXGb.zz60() == 2 && zztc.zza7().zzZYM()) {
                return zzO(zztc2);
            }
            return false;
        }
        zztc.zzZZJ();
        ((zzUZ) zztc.zzqh(2)).zzQP(true);
        zztc.zzN((zzTF) zztc.zzZZJ().zzYo1());
        return true;
    }

    public boolean zzZ(zzWT zzwt, zzTC zztc, boolean z) throws Exception {
        return zzW(zztc, z);
    }
}
