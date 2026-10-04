package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzY0B {
    private int zzWTT;
    private int zzWTU;
    static zzY0B zzWTS = new zzY0B(0, 0);
    private static zzY0B zzWTR = new zzY0B(Integer.MAX_VALUE, Integer.MAX_VALUE);

    private zzY0B(int i, int i2) {
        this.zzWTU = i;
        this.zzWTT = i2;
    }

    private static int zzH(zzTF zztf) {
        int iZz60 = zztf.zz60();
        int i = 1;
        if (iZz60 != 1) {
            if (iZz60 == 2) {
                for (zzUZ zzuz = (zzUZ) zztf.zzZ8m().zz6x(); zzuz != zztf; zzuz = (zzUZ) zzuz.zz5Z()) {
                    i++;
                }
                return i;
            }
            if (iZz60 == 16) {
                int i2 = 0;
                for (zzWT zzwt = (zzWT) zztf; zzwt != null; zzwt = (zzWT) zzwt.zzYo0()) {
                    i2++;
                }
                return i2;
            }
            if (iZz60 != 1024) {
                return zzWTR.zzWTT;
            }
        }
        return zzWTR.zzWTT;
    }

    private static int zzI(zzTF zztf) {
        int iZz60 = zztf.zz60();
        if (iZz60 == 1 || iZz60 == 2) {
            return zztf.zzZ8m().getIndex() + 1;
        }
        if (iZz60 == 16 || iZz60 == 1024) {
            return 0;
        }
        return zzWTR.zzWTU;
    }

    public static zzY0B zzV(zzTF zztf) {
        int iZz60 = zztf.zz60();
        return (iZz60 == 1 || iZz60 == 2 || iZz60 == 16 || iZz60 == 1024) ? new zzY0B(zztf) : zzWTR;
    }

    public static boolean zzZ(zzTF zztf, zzTC zztc) {
        return zzZ(zzV(zztf), zztc);
    }

    public boolean zzY(zzY0B zzy0b, zzTC zztc) {
        return zzy0b.zzY(this);
    }

    public final boolean zzY(zzY0B zzy0b) {
        int i = zzy0b.zzWTU;
        int i2 = this.zzWTU;
        if (i >= i2) {
            return i == i2 && zzy0b.zzWTT < this.zzWTT;
        }
        return true;
    }

    public static boolean zzZ(zzY0B zzy0b, zzTC zztc) {
        return zztc.zza9().zzYTi().zzY(zzy0b, zztc);
    }

    public zzY0B(zzTF zztf) {
        this.zzWTU = zzI(zztf);
        this.zzWTT = zzH(zztf);
    }
}
