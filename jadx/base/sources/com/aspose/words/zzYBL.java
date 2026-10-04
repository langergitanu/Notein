package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYBL extends zzTF {
    private boolean zzXez;

    private void zzQO(boolean z) throws Exception {
        zza9();
        if (zzYo1() == null) {
            return;
        }
        for (zzYMD zzymd : ((zzTF) zzYo1()).zzZ((zzYMD) null, (zzYMD) null)) {
            ((zzTF) zzYo1()).zzY(zzymd, z);
            zzU(zzymd);
        }
    }

    public static boolean zzX(zzYMD zzymd, zzYMD zzymd2) {
        while (zzymd != null && zzymd != zzymd2) {
            if (!zzymd.zzac()) {
                return true;
            }
            zzymd = zzymd.zz5Z();
        }
        return false;
    }

    public final void merge() throws Exception {
        zzQO(true);
    }

    public final void zzQP(boolean z) {
        this.zzXez = z;
    }

    public final zzYMD zzY8j() {
        if (isEmpty()) {
            return null;
        }
        return zzYJP.zzl(zz6x()) ? zzi(zz6x()) : zz6x();
    }

    public final zzYMD zzY8k() {
        return zzj(zz6w());
    }

    public final void zzY8l() throws Exception {
        zzQO(false);
    }

    public final boolean zzY8m() {
        return this.zzXez;
    }

    public boolean zzZZK() {
        return true;
    }

    public final zzYMD zzh(zzYMD zzymd) {
        if (zzymd != null) {
            zzymd.zzZZJ();
        }
        while (true) {
            zzYMD zzymdZz5Y = zzymd.zz5Y();
            if (zzymdZz5Y == null || zzymdZz5Y.zzZZJ() != this) {
                return null;
            }
            if (!zzYJP.zzl(zzymdZz5Y)) {
                return zzymdZz5Y;
            }
            zzymd = zzymdZz5Y.zza9().zz6x();
        }
    }

    public final zzYMD zzi(zzYMD zzymd) {
        if (zzymd != null) {
            zzymd.zzZZJ();
        }
        while (true) {
            zzYMD zzymdZz5Z = zzymd.zz5Z();
            if (zzymdZz5Z == null || zzymdZz5Z.zzZZJ() != this) {
                return null;
            }
            if (!zzYJP.zzl(zzymdZz5Z)) {
                return zzymdZz5Z;
            }
            zzymd = zzymdZz5Z.zza9().zz6w();
        }
    }

    public final zzYMD zzj(zzYMD zzymd) {
        if (isEmpty()) {
            return null;
        }
        if (zzymd == null) {
            zzymd = zz6w();
        }
        return zzYJP.zzl(zzymd) ? zzh(zzymd) : zzymd;
    }

    public final zzZ55 zzw(boolean z, boolean z2) throws Exception {
        zzYMD zzymdZz5Z = z ? (zzTC) zz6x() : (zzTC) zz6w();
        while (zzymdZz5Z != null) {
            if (zzymdZz5Z.zz60() == 32) {
                return (zzZ55) zzymdZz5Z;
            }
            zzYIA zzyia = (zzYIA) zzymdZz5Z;
            if (!zzyia.zzYol()) {
                zzWT zzwt = z ? (zzWT) zzyia.zz6x() : (zzWT) zzyia.zz6w();
                while (zzwt != null) {
                    if (!zzwt.isVirtual() || !z2) {
                        zzZ55 zzz55Zzw = zzwt.zzw(z, z2);
                        if (zzz55Zzw != null) {
                            return zzz55Zzw;
                        }
                    } else {
                        if (z) {
                            break;
                        }
                        zzwt.zzYnY();
                    }
                    zzwt = (zzWT) (z ? zzwt.zz5Z() : zzwt.zz5Y());
                }
            }
            zzymdZz5Z = z ? zzymdZz5Z.zz5Z() : zzymdZz5Z.zz5Y();
        }
        return null;
    }
}
