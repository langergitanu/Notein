package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZNC {
    public static void zzJ(zzUZ zzuz) throws Exception {
        if (zzuz.zzYnZ() && !zzuz.zz0p() && ((zzYN8) zzuz.zzZZJ()).zzYF(true).zzZ83() + ((zzYN8) zzuz.zzZZJ()).zzYE(true).zzZ83() > 0) {
            zzX(zzuz, false);
        }
    }

    public static zzZNO zzU(zzTC zztc) {
        if (((zzYBL) zztc.zzZZJ()).zz60() != 1024) {
            return null;
        }
        zzZKY zzzky = (zzZKY) ((zzYBL) zztc.zzZZJ());
        if (!zzzky.zza7().zzZYM() && zztc.zz60() == 8 && zztc.zzYnZ() && zztc.zzZXN() == null) {
            zztc = zztc.zzZXK();
        }
        if (zztc == null) {
            return null;
        }
        zzZNL zzznlZzYF = ((zzYN8) zzzky.zzZZJ()).zzYF(true);
        zzZNO zzznoZzX = zzX(zztc, true);
        if (zzznoZzX != null && zzzky.zza7().zzZYM()) {
            int count = zzznlZzYF.getCount() - 1;
            while (true) {
                if (count >= 0) {
                    zzZNO zzznoZzBz = zzznlZzYF.zzBz(count);
                    if (zzznoZzBz != zzznoZzX) {
                        if (zzznoZzBz.zzZ93().zzaa() == zzzky.zzaa() && zzznoZzBz.zzZ8T() && !zzznoZzBz.zzZ8X()) {
                            zzznoZzBz.zzZ8E().zzZZJ();
                            zzznoZzX = zzznoZzBz;
                            break;
                        }
                        count--;
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
            if (zzznoZzX.zzZ8X()) {
                return null;
            }
        }
        return zzznoZzX;
    }

    private static zzTC zzV(zzTC zztc) {
        zzTC zztcZzZXK = zztc.zzZXK();
        if (zztcZzZXK != null) {
            return zztcZzZXK;
        }
        zzUZ zzuz = (zzUZ) com.aspose.words.internal.zzZKW.zzZ((zzYBL) zztc.zzZZJ(), zzUZ.class);
        if (zzuz == null) {
            return null;
        }
        return zzuz.zzYn(true).zz02();
    }

    private static zzZNO zzW(zzTC zztc) {
        zzWT zzwt = (zzWT) ((zzYBL) zztc.zzZZJ());
        if (zzwt.zz5N().getCount() == 0) {
            return null;
        }
        return zzZ((zzTC) zzwt.zz6x(), zztc, 0, zzwt.zz5N());
    }

    public static void zzX(zzTC zztc) throws Exception {
        zzZ(zztc, false);
    }

    private static void zzY(zzTC zztc, boolean z) throws Exception {
        zzUZ zzuz = (zzUZ) com.aspose.words.internal.zzZKW.zzZ((zzYBL) zztc.zzZZJ(), zzUZ.class);
        if (zzuz == null) {
            return;
        }
        zzZNO zzznoZzX = zzX(zztc, true);
        zzZNO zzznoZzX2 = zzX(zztc, false);
        if (!z && zzznoZzX == null && zzznoZzX2 == null) {
            return;
        }
        zzX(zzuz, true);
        if (zzznoZzX != null) {
            zzznoZzX.unregister();
        }
        ((zzYN8) zzuz.zzZZJ()).zzYE(true).zzT(zzznoZzX2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d A[PHI: r1 r2 r8
      0x003d: PHI (r1v3 com.aspose.words.zzZNO) = (r1v2 com.aspose.words.zzZNO), (r1v5 com.aspose.words.zzZNO) binds: [B:9:0x0018, B:18:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x003d: PHI (r2v2 com.aspose.words.zzTC) = (r2v1 com.aspose.words.zzTC), (r2v3 com.aspose.words.zzTC) binds: [B:9:0x0018, B:18:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x003d: PHI (r8v2 int) = (r8v1 int), (r8v4 int) binds: [B:9:0x0018, B:18:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzZNO zzZ(zzTC zztc, zzTC zztc2, int i, zzZNL zzznl) {
        if (i < 0 || zzznl.getCount() <= i) {
            return null;
        }
        zzZNO zzznoZzBz = zzznl.zzBz(i);
        zzTC zztcZzZ8E = zzznoZzBz.zzZ8E();
        zzYN8 zzyn8ZzZ8m = zztc.zzZ8m();
        while (zztc != zztc2) {
            if (zztc == zztcZzZ8E) {
                while (true) {
                    i++;
                    if (i >= zzznl.getCount()) {
                        break;
                    }
                    zzznoZzBz = zzznl.zzBz(i);
                    zzTC zztcZzZ8E2 = zzznoZzBz.zzZ8E();
                    if (zztcZzZ8E2 != zztcZzZ8E) {
                        zztcZzZ8E = zztcZzZ8E2;
                        break;
                    }
                }
                if (i < zzznl.getCount() && zztcZzZ8E.zzaa() == zztc2.zzaa()) {
                    zztc = zzV(zztc);
                    if (zztc == null || zztc.zzZ8m() != zzyn8ZzZ8m) {
                    }
                }
            }
            return null;
        }
        return zzznoZzBz;
    }

    private static zzZNO zzX(zzTC zztc, boolean z) {
        zzYN8 zzyn8ZzZ8m = zztc.zzZ8m();
        if (zztc.zzZXN() != null && zztc.zzZXN().zzZ8Y() == z) {
            return zztc.zzZXN();
        }
        zzZNL zzznlZzYF = z ? zzyn8ZzZ8m.zzYF(true) : zzyn8ZzZ8m.zzYE(true);
        int iZz60 = ((zzYBL) zztc.zzZZJ()).zz60();
        if (iZz60 == 2) {
            return zzZ(((zzUZ) zzyn8ZzZ8m.zz6x()).zz02(), zztc, zzznlZzYF.zzZ81(), zzznlZzYF);
        }
        if (iZz60 != 1024) {
            return null;
        }
        zzZKY zzzky = (zzZKY) ((zzYBL) zztc.zzZZJ());
        return zzZ((zzTC) zzzky.zz6x(), zztc, zzznlZzYF.zzY(zzzky), zzznlZzYF);
    }

    public static void zzV(zzYN8 zzyn8) throws Exception {
        if (zzyn8.zzYF(true).getCount() > 0) {
            zzyn8.zzYF(true).zzBz(0).unregister();
        }
        if (zzyn8.zzYE(true).getCount() > 0) {
            zzyn8.zzYE(true).clear();
        }
        zzyn8.zzYG(true).zzXVU();
    }

    public static boolean zzZ(zzZKY zzzky, zzZKY zzzky2) throws Exception {
        zzZ(zzzky, zzzky2, false);
        return zzZ(zzzky, zzzky2, true);
    }

    private static boolean zzZ(zzZKY zzzky, zzZKY zzzky2, boolean z) throws Exception {
        zzZNL zzznlZzYE;
        if (zzzky2 == null) {
            return false;
        }
        zzZKV zzzkv = (zzZKV) zzzky2.zzaa();
        zzYN8 zzyn8 = (zzYN8) zzzky.zzZZJ();
        if (z) {
            zzznlZzYE = zzyn8.zzYF(true);
        } else {
            zzznlZzYE = zzyn8.zzYE(true);
        }
        zzY5N zzy5nZzYG = zzyn8.zzYG(true);
        ArrayList arrayList = (!z || zzyn8.zza7().zzZYM()) ? null : new ArrayList();
        boolean zZzZ95 = false;
        for (zzZNO zzzno : zzznlZzYE) {
            if (zzzno.zzbD()) {
                break;
            }
            boolean z2 = zzzkv == zzzno.zzZ8E().zzaa();
            if (!zZzZ95 && z2) {
                if (zzzky.isHeader()) {
                    zZzZ95 = zzzno.zzZ94();
                } else if (zzzky2.isHeader()) {
                    zZzZ95 = zzzno.zzZ95();
                } else {
                    zZzZ95 = zzyn8.zza7().zzZYM() || zzzno.zzZ95() || zzzno.zzZ8G().zzYMc();
                }
            }
            if (zZzZ95 && z2) {
                if (z) {
                    if (zzzno.zzZ8T() && !zzzno.zzZ8X()) {
                        zzy5nZzYG.zzZ(zzzno, true, true);
                    }
                    if (!zzyn8.zza7().zzZYM()) {
                        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZNO>) arrayList, zzzno);
                    }
                }
                zzzno.zzZ8Q();
            }
        }
        if (z) {
            zzy5nZzYG.zzq(null);
            if (zzyn8.zza7().zzZYM()) {
                return zZzZ95;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((zzZNO) it.next()).zzZ8K();
            }
        }
        return false;
    }

    private static void zzX(zzUZ zzuz, boolean z) throws Exception {
        zzY5N zzy5nZzYG = ((zzYN8) zzuz.zzZZJ()).zzYG(true);
        if (!zzuz.zza7().zzZYM() && zzy5nZzYG.zzXVV() && zzy5nZzYG.zzXVS().zzZ82()) {
            if (z) {
                zzy5nZzYG.zzXVT();
            }
            zzy5nZzYG.zzXVU();
        }
    }

    public static void zzZ(zzTC zztc, boolean z) throws Exception {
        while (((zzYBL) zztc.zzZZJ()).zz60() == 16) {
            zzZNO zzznoZzW = zzW(zztc);
            if (zzznoZzW != null) {
                zzznoZzW.unregister();
            }
            zzWT zzwt = (zzWT) ((zzYBL) zztc.zzZZJ());
            zzwt.zz5M().clear();
            zztc = (zzYIA) zzwt.zzZZJ();
        }
        if (zztc.zzZZJ().zz60() != 2) {
            return;
        }
        zzY(zztc, z);
    }
}
