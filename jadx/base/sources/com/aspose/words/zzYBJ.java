package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYBJ {
    public static int zzU(zzTC zztc, boolean z) throws Exception {
        return z ? Math.max(zztc.getHeight(), zztc.zz0t()) : zztc.zz0t();
    }

    private static int zzV(zzUZ zzuz, boolean z) throws Exception {
        if (zzuz.isEmpty()) {
            return 0;
        }
        zzTC zztc = (zzTC) zzuz.zz6w();
        if (zztc.zzZXN() != null || zztc == zzuz.zz6x() || zztc.zz60() != 32) {
            return 0;
        }
        zzZ55 zzz55 = (zzZ55) zztc;
        if (!zzz55.zzYQ6()) {
            return 0;
        }
        zzYMD zzymdZzh = zzuz.zzh(zzz55);
        int y = zzz55.getY() + zzU(zzz55, z);
        if (zzymdZzh != null && !zzz55.zza7().zzZYM()) {
            return (zzymdZzh.getY() + zzU((zzTC) zzymdZzh, z)) - y;
        }
        int iZzYqn = ((zzYN8) zzuz.zzZZJ()).zzYqn() - zzuz.getY();
        zzZMW zzzmwZz09 = zzuz.zz09();
        if (zzzmwZz09 != null) {
            iZzYqn = Math.max(0, iZzYqn - zzzmwZz09.getHeight());
        }
        return Math.min(0, iZzYqn - y);
    }

    private static int zzW(zzUZ zzuz, boolean z) throws Exception {
        return zzW((zzYBL) zzuz, z) + zzY(zzuz.zz09(), z) + zzY(zzuz.zz08(), z);
    }

    public static int zzX(zzYBL zzybl, boolean z) throws Exception {
        return zzybl.zz60() == 2 ? zzW((zzUZ) zzybl, z) : zzW(zzybl, z);
    }

    private static int zzY(zzYVR zzyvr, boolean z) throws Exception {
        if (zzyvr == null) {
            return 0;
        }
        return z ? Math.max(zzyvr.getHeight(), zzyvr.zz0t()) : zzyvr.zz0t();
    }

    public static int zzW(zzYBL zzybl, boolean z) throws Exception {
        zzYMD zzymdZzY8k;
        int y = 0;
        if (zzybl == null) {
            return 0;
        }
        if (!zzybl.isEmpty() && (zzymdZzY8k = zzybl.zzY8k()) != null) {
            y = zzymdZzY8k.getY() + zzU((zzTC) zzymdZzY8k, z);
        }
        return zzybl.zz60() != 2 ? y : y + zzV((zzUZ) zzybl, z);
    }
}
