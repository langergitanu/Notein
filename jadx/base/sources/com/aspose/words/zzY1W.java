package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY1W extends zzYMJ {
    private static boolean zzZI(zzZ55 zzz55) {
        return zzz55.zzYTn() || ((zzZ55) zzz55.zzYo1()).zzYPR();
    }

    private static boolean zzZJ(zzZ55 zzz55) {
        if (zzz55 != null) {
            return zzz55.zzYTm() || zzz55.zzYnZ();
        }
        return false;
    }

    private static boolean zzZK(zzZ55 zzz55) {
        if (zzz55.zzZZJ().zz60() == 2 && !((zzUZ) zzz55.zzZZJ()).zz0n()) {
            zzUZ zzuz = (zzUZ) zzz55.zzZZJ();
            int columnIndex = zzuz.getColumnIndex();
            int[] iArrZzYLt = ((zzZ35) ((zzZ2D) zzuz.zza9()).zzYTt()).zzYLt();
            if (!((zzUZ) zzuz.zzYo0()).isEmpty() && iArrZzYLt[columnIndex - 1] == iArrZzYLt[columnIndex]) {
                return true;
            }
        }
        return false;
    }

    private static zzZ55 zzZL(zzZ55 zzz55) throws Exception {
        zzTF zztfZzZZJ = zzz55.zzZZJ();
        if (!((zzZ37) ((zzYMM) zzz55.zza9()).zzYTt()).zzYLU()) {
            return null;
        }
        zzZ55 zzz55ZzYQn = zzz55.zzYQn();
        if (zzZI(zzz55ZzYQn) || zzYMJ.zz0(zzz55ZzYQn)) {
            return null;
        }
        zzZ55 zzz55ZzYQo = zzz55.zzYQo();
        if (!zzz55ZzYQn.zzYo1().zzYTn()) {
            if (zzZJ(zzz55ZzYQo)) {
                return zzz55ZzYQo;
            }
            return null;
        }
        zzZ55 zzz55ZzYQo2 = (zzZ55) zzz55ZzYQo.zzYo0();
        if (zzz55ZzYQo2 != null) {
            zzz55ZzYQo2 = zzz55ZzYQo2.zzYQo();
        }
        return (zzz55ZzYQo2 != null && zzz55ZzYQo2.zzZZJ() == zztfZzZZJ && zzZJ(zzz55ZzYQo2) && !zzZK(zzz55ZzYQo2)) ? zzz55ZzYQo2 : zzz55ZzYQo;
    }

    @Override // com.aspose.words.zzYMJ
    public final boolean zzRz(boolean z) throws Exception {
        zzZ55 zzz55;
        if (zzRy(z)) {
            return true;
        }
        zzWT zzwt = (zzWT) com.aspose.words.internal.zzZKW.zzZ(this.zzXGb, zzWT.class);
        if (!this.zzXGb.zzaa().zzbD() || zzwt == null || !((zzYIA) zzwt.zzZZJ()).zzYjC() || (zzz55 = (zzZ55) com.aspose.words.internal.zzZKW.zzZ(zzwt.zz6x(), zzZ55.class)) == null || zzz55.getHeight() == Integer.MIN_VALUE || ((zzZ55) zzz55.zzYo1()) == null || ((zzZ55) zzz55.zzYo1()).getHeight() == Integer.MIN_VALUE) {
            return false;
        }
        zzYN8 zzyn8ZzZ8m = zzwt.zzZ8m();
        return zzz55.getHeight() + ((zzZ55) zzz55.zzYo1()).getHeight() > zzyn8ZzZ8m.zzYqn() - zzyn8ZzZ8m.zzYqo();
    }

    @Override // com.aspose.words.zzYMJ
    public final boolean zzW(zzTC zztc, boolean z) throws Exception {
        zzZ55 zzz55ZzZL;
        zzZ55 zzz55 = (zzZ55) com.aspose.words.internal.zzZKW.zzZ(zztc, zzZ55.class);
        if (zzz55 == null || (zzz55ZzZL = zzZL(zzz55)) == null) {
            return false;
        }
        zzTC zztcZzZXK = zztc.zzZXK();
        if (zzz55ZzZL.zzYnZ() && z && zztcZzZXK.zzZZJ().zz60() == 16) {
            zztcZzZXK = (zzYIA) ((zzWT) zztcZzZXK.zzZZJ()).zzZZJ();
        }
        return zzZ(zzz55ZzZL, zztcZzZXK, z);
    }

    @Override // com.aspose.words.zzYMJ
    public final boolean zzY(zzYBL zzybl) {
        int iZz60 = zzybl.zz60();
        if (iZz60 == 2) {
            return true;
        }
        if (iZz60 != 16 && iZz60 != 2048) {
            return iZz60 == 16384 && ((zzZ35) ((zzZ2D) ((zzUZ) zzybl.zzqh(2)).zza9()).zzYTt()).getColumnsCount() == 1;
        }
        return zzybl.zza7().zzZYM();
    }

    @Override // com.aspose.words.zzYMJ
    public final boolean zzYob() {
        return true;
    }
}
