package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzTC extends zzTF {
    private zzZNO zzZsr;

    private boolean zzW(zzTF zztf) {
        if (!zza7().zzZYM() && zztf != null && zztf == zzZZJ()) {
            zzYN8 zzyn8ZzZ8m = zzZ8m();
            if (((zzUZ) zzyn8ZzZ8m.zz6x()) == ((zzYBL) zzZZJ())) {
                zzTC zztc = (zzTC) ((zzYBL) zzZZJ()).zz6x();
                if (!zzYJP.zzl(zztc)) {
                    return false;
                }
                if ((zz60() != 8 || zzYJP.zzl(this)) && this == zztc.zzZXM().zzZ91().zz5Z()) {
                    return zzyn8ZzZ8m.zzYF(true).zzZ82();
                }
            }
        }
        return false;
    }

    public static zzTC zzZ(zzZ6T zzz6t, boolean z) {
        zzYMD zzymdZz6x;
        zzYMD zzymd = null;
        if (zzz6t == null) {
            return null;
        }
        int iZz6y = zzz6t.zz6y();
        if (iZz6y != 4) {
            if (iZz6y == 8 || iZz6y == 32) {
                zzymdZz6x = z ? zzz6t.zz6x() : zzz6t.zz6w();
            }
            return (zzTC) zzymd;
        }
        zzY6N zzy6n = (zzY6N) zzz6t;
        zzymdZz6x = z ? ((zzYIC) zzy6n.zzZXZ()).zz6x() : ((zzYIC) zzy6n.zzZXY()).zz6w();
        zzymd = zzymdZz6x;
        return (zzTC) zzymd;
    }

    @Override // com.aspose.words.zzYMD
    public final zzYMD zz5Y() {
        zza9();
        zzTC zztcZzZXJ = this;
        do {
            zztcZzZXJ = zztcZzZXJ.zzZXJ();
            if (zztcZzZXJ == null) {
                return null;
            }
        } while (zztcZzZXJ.zzZZJ() == null);
        if (zztcZzZXJ.zzZZJ() != zzZZJ()) {
            return null;
        }
        zztcZzZXJ.zzZZJ();
        zzZZJ();
        return zztcZzZXJ;
    }

    @Override // com.aspose.words.zzYMD
    public final zzYMD zz5Z() {
        zza9();
        zzTC zztcZzZXK = this;
        do {
            zztcZzZXK = zztcZzZXK.zzZXK();
            if (zztcZzZXK == null) {
                return null;
            }
        } while (zztcZzZXK.zzZZJ() == null);
        if (zztcZzZXK.zzZZJ() != zzZZJ()) {
            return null;
        }
        zztcZzZXK.zzZZJ();
        zzZZJ();
        return zztcZzZXK;
    }

    @Override // com.aspose.words.zzTF
    public final void zzMG(int i) throws Exception {
        ((zzYBL) zzZZJ()).zzZXQ();
        super.zzMG(i);
    }

    public boolean zzX(zzTF zztf) throws Exception {
        if (zzYTm()) {
            return ((zztf != null && this == zztf.zz6x() && this == ((zzUZ) zztf.zzZ8m().zz6x()).zz02()) || !zzaa().zzbD() || zzW(zztf)) ? false : true;
        }
        return false;
    }

    public zzZ6T zzZXH() {
        return zza9().zzYTo();
    }

    public zzZ6T zzZXI() {
        return zza9().zzYTp();
    }

    public final zzTC zzZXJ() {
        return zzYo0() != null ? (zzTC) zzYo0() : zzZ(zzZXH(), false);
    }

    public final zzTC zzZXK() {
        return zzYo1() != null ? (zzTC) zzYo1() : zzZ(zzZXI(), true);
    }

    public final int zzZXL() throws Exception {
        if (zzZXM() == null) {
            return 0;
        }
        zzZXM();
        return zzZXM().zzVI(false).getY();
    }

    public zzZNO zzZXM() {
        return this.zzZsr;
    }

    public final zzZNO zzZXN() {
        return zzZXM();
    }

    @Override // com.aspose.words.zzTF
    public final int zzZXQ() {
        return super.zzZXQ() != 0 ? super.zzZXQ() : (zzZXM() == null || zzZXM().zzZXQ() == Integer.MIN_VALUE) ? ((zzYBL) zzZZJ()).zzZXQ() : zzZXM().zzZXQ();
    }

    public final void zzX(zzZNO zzzno) {
        this.zzZsr = zzzno;
    }
}
