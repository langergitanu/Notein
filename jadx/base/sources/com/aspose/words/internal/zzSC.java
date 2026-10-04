package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzSC {
    private static boolean zzS(zzZVP zzzvp, zzZVP zzzvp2) {
        return zzzvp.zzv() == zzzvp2.zzv() || zzzvp2.zzv() == null;
    }

    public static boolean zzT(zzZVP zzzvp, zzZVP zzzvp2) {
        return zzzvp.zzs() ? zzzvp2.zznr() : (zzzvp.zznt() || zzzvp2.zznt()) ? zzzvp.getType() == zzzvp2.getType() : zzS(zzzvp, zzzvp2) && zzY(zzzvp, zzzvp2, false) == 2;
    }

    public static boolean zzU(zzZVP zzzvp, zzZVP zzzvp2) {
        return zzZ(zzzvp, zzzvp2, false);
    }

    private static boolean zzV(zzZVP zzzvp, zzZVP zzzvp2) {
        if (!zzzvp.zzTU() || zzzvp.zznw() != 9) {
            return false;
        }
        int iIntValue = ((Integer) zzzvp.zzTT()).intValue();
        int iZznw = zzzvp2.zznw();
        return iZznw != 6 ? iZznw == 7 && iIntValue >= -32768 && iIntValue <= 32767 : iIntValue >= 0 && iIntValue <= 255;
    }

    public static boolean zzW(zzZVP zzzvp, zzZVP zzzvp2) {
        if (zzzvp.zzs()) {
            return zzzvp2.zznr();
        }
        if ((zzzvp.zzRC() && zzzvp2.zzns()) || zzV(zzzvp, zzzvp2)) {
            return true;
        }
        return zzZ(zzzvp, zzzvp2, false);
    }

    public static boolean zzX(zzZVP zzzvp, zzZVP zzzvp2) {
        return zzZ(zzzvp, zzzvp2, false) || zzZ(zzzvp2, zzzvp, true);
    }

    public static boolean zzY(zzZVP zzzvp, zzZVP zzzvp2) {
        int iZzY;
        if (zzzvp.zzs()) {
            return zzzvp2.zznr();
        }
        if (zzzvp.zznn() && zzzvp2.zznn()) {
            return true;
        }
        if (!zzS(zzzvp, zzzvp2)) {
            return false;
        }
        int iZzY2 = zzY(zzzvp, zzzvp2, true);
        if (iZzY2 == 2 || (iZzY = zzY(zzzvp2, zzzvp, true)) == 2) {
            return true;
        }
        if (iZzY2 != 1 && iZzY != 1) {
            boolean zIsInterface = zzzvp.getType().isInterface();
            boolean zIsInterface2 = zzzvp2.getType().isInterface();
            if (zIsInterface && zIsInterface2) {
                return true;
            }
            if (zIsInterface && !zzZZO.zzF(zzzvp2.getType())) {
                return true;
            }
            if (zIsInterface2 && !zzZZO.zzF(zzzvp.getType())) {
                return true;
            }
        }
        return false;
    }

    private static boolean zzZ(zzZVP zzzvp, zzZVP zzzvp2, boolean z) {
        if (zzzvp.zznu() && zzzvp2.zznq()) {
            return false;
        }
        if (zzzvp.zzns() || zzzvp2.zzns() || !zzzvp.zznn() || !zzzvp2.zznn()) {
            return zzS(!z ? zzzvp : zzzvp2, !z ? zzzvp2 : zzzvp) && zzY(zzzvp, zzzvp2, true) == 2;
        }
        return zzs(zzzvp.zznw(), zzzvp2.zznw());
    }

    public static boolean zzs(int i, int i2) {
        if (i == i2) {
            return true;
        }
        if (i == 4) {
            return i2 == 9 || i2 == 11 || i2 == 13 || i2 == 14;
        }
        if (i == 9) {
            return i2 == 11 || i2 == 13 || i2 == 14;
        }
        if (i == 11) {
            return i2 == 13 || i2 == 14;
        }
        if (i == 13) {
            return i2 == 14;
        }
        if (i == 6) {
            return i2 == 7 || i2 == 9 || i2 == 11 || i2 == 13 || i2 == 14;
        }
        if (i != 7) {
            return false;
        }
        return i2 == 9 || i2 == 11 || i2 == 13 || i2 == 14;
    }

    private static int zzY(zzZVP zzzvp, zzZVP zzzvp2, boolean z) {
        return zzZZO.zzY(z ? zzzvp.zzw() : zzzvp.getType(), z ? zzzvp2.zzw() : zzzvp2.getType());
    }
}
