package com.aspose.words;

import com.aspose.words.ref.Ref;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYI6 {
    private static zzTC zzF(zzWT zzwt) throws Exception {
        zzTC zztc = (zzTC) zzwt.zz6w();
        return (((zzTC) zzwt.zz6x()) != zztc && zztc.zz60() == 32 && zztc.getBottom() == 0) ? (zzTC) zztc.zz5Y() : zztc;
    }

    private static boolean zzN(zzTC zztc) throws Exception {
        zzZ55 zzz55 = (zzZ55) com.aspose.words.internal.zzZKW.zzZ(zztc.zzZXK(), zzZ55.class);
        return (zzz55 == null || !zzz55.zzYQ6() || zzZ51.zz7(zzz55)) ? false : true;
    }

    private static boolean zzS(zzYIA zzyia, int i) throws Exception {
        return zzT(zzyia, i) > 0;
    }

    private static int zzT(zzYIA zzyia, int i) throws Exception {
        int y;
        zzWT zzwt;
        if (zzyia.zz0t() <= i) {
            return 0;
        }
        int iZzYjR = zzyia.zzYjR();
        if (!zzyia.zzYnZ()) {
            iZzYjR = Math.max(zzyia.zz56(), zzt(zzyia));
        }
        if (iZzYjR > i) {
            return -1;
        }
        boolean zZzYjC = zzyia.zzYjC();
        for (zzWT zzwt2 = (zzWT) zzyia.zz6x(); zzwt2 != null && !zzwt2.isVirtual(); zzwt2 = (zzWT) zzwt2.zz5Z()) {
            int iZz6m = ((zzWV) zzwt2.zza9()).zz6m();
            if (iZz6m == 0) {
                y = 0;
                zzwt = zzwt2;
            } else if (iZz6m != 3) {
                y = 0;
                zzwt = null;
            } else {
                Ref ref = new Ref(null);
                Ref ref2 = new Ref(null);
                zzWK.zzZ(zzwt2, (Ref<zzWT>) ref, (Ref<zzWT>) ref2);
                zzwt = (zzWT) ref.get();
                y = ((zzYIA) ((zzWT) ref2.get()).zzZZJ()).getY() - zzyia.getY();
            }
            zzTC zztcZzF = zzwt != null ? zzF(zzwt) : null;
            if (zztcZzF != null) {
                if (i < zztcZzF.getBottom() + y + zzyia.zzYjM() && zztcZzF.zz5Y() != null) {
                    if (((y + zzwt.zz6x().getBottom()) - (((zzTC) zzwt.zz6x()).getY() - zzwt.zz5W())) + zzyia.zzYjM() <= i || zZzYjC) {
                        return 1;
                    }
                    if (zzwt.zz6x().zz60() == 8) {
                        zzYIA zzyia2 = (zzYIA) zzwt.zz6x();
                        int y2 = (i - zzyia2.getY()) - zzyia.zzYjM();
                        if (((zzYIC) zzyia2.zza9()).zzYk1().getHeightRule() == 0 || zzS(zzyia2, y2)) {
                            return 1;
                        }
                    }
                }
                if (zzU(zzwt, i)) {
                    return 1;
                }
            }
        }
        return -1;
    }

    public static int zzU(zzYIA zzyia, int i) throws Exception {
        zzyia.zza9();
        ((zzYIC) zzyia.zza9()).zzYk1().getHeightRule();
        int iZzT = zzT(zzyia, i);
        if (iZzT <= 0) {
            return iZzT;
        }
        if (!zzyia.zzYTn()) {
            ((zzY6N) ((zzYIC) zzyia.zza9()).zza9()).zzY6a().isFloating();
        }
        zzyia.zzYj(true);
        ArrayList<zzYMD> arrayListZzZ = zzyia.zzZ((zzYMD) null, (zzYMD) null);
        Iterator<zzYMD> it = arrayListZzZ.iterator();
        while (it.hasNext()) {
            zzWK.zzZ((zzWT) it.next(), i);
        }
        zzYIA zzyia2 = new zzYIA();
        ((zzYIC) zzyia.zza9()).zzZ(zzyia, null, zzyia2, true);
        for (int size = arrayListZzZ.size() - 1; size >= 0; size--) {
            arrayListZzZ.get(size).zzYo1().zzO(zzyia2);
        }
        zzyia.zzYjQ();
        zzyia.zzYj(false);
        return zzyia.zz0t();
    }

    private static boolean zzV(zzYIA zzyia, int i, boolean z) throws Exception {
        zzZ55 zzz55;
        zzZNL zzznlZzYF;
        boolean zZzZYM = zzyia.zza7().zzZYM();
        int heightRule = ((zzYIC) zzyia.zza9()).zzYk1().getHeightRule();
        if (heightRule == 1) {
            return true;
        }
        if (!((zzYIC) zzyia.zza9()).zzYk1().zzYLA() && !zzyia.zzYjD() && (!zZzZYM || !zzYJP.zzl(zzyia))) {
            return true;
        }
        if (!zZzZYM && (zzyia.zzaa().getStoryType() == 3 || ((zzYBL) zzyia.zzZZJ()).zz60() == 1024)) {
            return true;
        }
        boolean z2 = z && zzyia.zzYnZ();
        if (zzyia.zz56() > i && !z2) {
            return true;
        }
        if (z2 && heightRule == 0 && zzYIB.zzF(zzyia) + zzyia.zzYjN() + zzyia.zzYjM() <= i) {
            return true;
        }
        for (zzWT zzwt = (zzWT) zzyia.zz6x(); zzwt != null; zzwt = (zzWT) com.aspose.words.internal.zzZKW.zzZ(zzwt.zz5Z(), zzWT.class)) {
            if (!zzwt.isVirtual() && !zzwt.isEmpty() && (zzz55 = (zzZ55) com.aspose.words.internal.zzZKW.zzZ((zzTC) zzwt.zz6x(), zzZ55.class)) != null && (zzznlZzYF = zzwt.zzYF(false)) != null && zzznlZzYF.getCount() > 0) {
                for (zzZNO zzzno : zzznlZzYF) {
                    zzY9X zzy9x = (zzY9X) com.aspose.words.internal.zzZKW.zzZ(zzzno.zzZ90(), zzY9X.class);
                    if (zzy9x != null && zzy9x.zzZZJ() == zzz55 && zzzno.zzZ8V().getBottom() > i) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static int zzW(zzYIA zzyia, int i, boolean z) throws Exception {
        int i2;
        boolean zZzZYM = zzyia.zza7().zzZYM();
        if (zzW(zzyia, z)) {
            return 6;
        }
        if (zzyia.zz0t() <= i) {
            return 1;
        }
        boolean zZzV = zzV(zzyia, i, z);
        boolean z2 = zzyia.zzYjR() > i;
        if (z2 && (!zZzZYM || !z)) {
            zZzV = true;
        }
        if (z2 && !zZzV) {
            i = zzyia.zzYjR();
        }
        if (zZzV) {
            i2 = 0;
        } else {
            int iZzU = zzU(zzyia, i);
            zzyia.zzYjR();
            if (iZzU >= 0) {
                i2 = 3;
            } else {
                zZzV = true;
                i2 = 0;
            }
        }
        if (zZzV) {
            boolean z3 = zzyia.zzZZJ().zz60() == 2 && zzyia.zzZZJ().zzYTm() && !zzyia.zzZZJ().zzYnZ();
            if (!zzyia.zzYnZ() || z3 || zzyia.zzaa().getStoryType() == 2) {
                i2 = 5;
            } else if (z || (!z2 && ((zzYIC) zzyia.zza9()).zzYk1().getHeightRule() == 0)) {
                i2 = 3;
            } else {
                zzUZ zzuz = (zzUZ) zzyia.zzqh(2);
                int i3 = (zzuz == null || zzuz.zz0p()) ? 5 : 6;
                if (zzuz == null) {
                    zzyia.zzqh(1024);
                }
                i2 = i3;
            }
        }
        if (!zZzZYM && i2 == 3 && zzN(zzyia)) {
            return 8;
        }
        return i2;
    }

    private static int zzt(zzYIA zzyia) throws Exception {
        return zzyia.zzYjN() + zzYIB.zzX(zzyia, false) + zzyia.zzYjM();
    }

    private static boolean zzW(zzYIA zzyia, boolean z) throws Exception {
        return !(z && zzyia.zzYnZ()) && zzyia.zzX(zzyia.zzZZJ());
    }

    private static boolean zzU(zzWT zzwt, int i) throws Exception {
        if (((zzWV) zzwt.zza9()).zz6m() != 0) {
            zzwt.zza9();
        }
        zzZNL zzznlZzYF = zzwt.zzYF(false);
        if (zzznlZzYF == null) {
            return false;
        }
        for (zzZNO zzzno : zzznlZzYF) {
            if (zzzno.zzZ99() != 25604 && zzzno.zzZ8V().getBottom() > i) {
                if (!zzzno.zzZ93().zzYnZ()) {
                    return true;
                }
                zzZNG zzzng = (zzZNG) zzzno;
                if (!zzzng.zzZ7E()) {
                    continue;
                } else {
                    if (zzzng.zzZ93() != zzzng.zzZ91() && zzzng.zzZ93().getBottom() < i) {
                        return true;
                    }
                    zzYIA zzyia = (zzYIA) zzzng.zzZ93();
                    if (zzS(zzyia, i - zzyia.getY())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
