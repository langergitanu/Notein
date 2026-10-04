package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ7D extends zzYMJ {
    @Override // com.aspose.words.zzYMJ
    public final boolean zzW(zzTC zztc, boolean z) throws Exception {
        zzZ55 zzz55ZzW;
        zzZ55 zzz55 = (zzZ55) com.aspose.words.internal.zzZKW.zzZ(zztc, zzZ55.class);
        if (zzz55 == null || (zzz55ZzW = zzW(zzz55)) == null) {
            return false;
        }
        zzTC zztc2 = (zzZ55) zzz55.zzYo1();
        if (zzz55ZzW.zzYnZ() && z && zztc2.zzZZJ().zz60() == 16) {
            zztc2 = (zzYIA) ((zzWT) zztc2.zzZZJ()).zzZZJ();
        }
        return zzZ(zzz55ZzW, zztc2, z);
    }

    @Override // com.aspose.words.zzYMJ
    public final boolean zzY(zzYBL zzybl) {
        int iZz60 = zzybl.zz60();
        if (iZz60 != 2) {
            return iZz60 == 16384 && ((zzZ35) ((zzZ2D) ((zzUZ) zzybl.zzqh(2)).zza9()).zzYTt()).zzYLt().length == 1;
        }
        return true;
    }

    private static zzZ55 zzW(zzZ55 zzz55) throws Exception {
        if (zzz55.zzYTn() || zzYMJ.zz0(zzz55)) {
            return null;
        }
        zzYMM zzymm = (zzYMM) zzz55.zza9();
        if (!((zzZ37) zzymm.zzYTt()).zzYLX()) {
            return null;
        }
        zzZ55 zzz55ZzYos = zzymm.zzYos();
        if (zzz55ZzYos.zzZZJ() == zzz55.zzZZJ()) {
            return zzz55ZzYos;
        }
        zzZ55 zzz552 = (zzZ55) com.aspose.words.internal.zzZKW.zzZ(zzz55.zzZZJ().zz6x(), zzZ55.class);
        zzz552.zza9();
        return zzz552;
    }
}
