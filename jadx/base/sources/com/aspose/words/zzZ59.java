package com.aspose.words;

import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.firebase.FirebaseError;
import com.huawei.hms.network.embedded.C18196h2;
import com.microsoft.identity.common.java.commands.SilentTokenCommand;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ59 {
    private static int zzYdH = com.aspose.words.internal.zzSA.zzYy(14);
    private static long[] zzYdG = {com.aspose.words.internal.zzZPZ.zzZm(12000, 0), com.aspose.words.internal.zzZPZ.zzZm(13000, -1000), com.aspose.words.internal.zzZPZ.zzZm(14000, -1500), com.aspose.words.internal.zzZPZ.zzZm(C18196h2.f55021c, -2000), com.aspose.words.internal.zzZPZ.zzZm(16000, -3200), com.aspose.words.internal.zzZPZ.zzZm(FirebaseError.ERROR_INVALID_CUSTOM_TOKEN, -4200), com.aspose.words.internal.zzZPZ.zzZm(18000, -5000), com.aspose.words.internal.zzZPZ.zzZm(19000, -6000), com.aspose.words.internal.zzZPZ.zzZm(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH, -6500), com.aspose.words.internal.zzZPZ.zzZm(21000, -7300), com.aspose.words.internal.zzZPZ.zzZm(22000, -8000), com.aspose.words.internal.zzZPZ.zzZm(23000, -9000), com.aspose.words.internal.zzZPZ.zzZm(SilentTokenCommand.ACQUIRE_TOKEN_SILENT_DEFAULT_TIMEOUT_MILLISECONDS, -14500), com.aspose.words.internal.zzZPZ.zzZm(32000, -16000), com.aspose.words.internal.zzZPZ.zzZm(34000, -19000), com.aspose.words.internal.zzZPZ.zzZm(38000, -20500), com.aspose.words.internal.zzZPZ.zzZm(40000, -22200), com.aspose.words.internal.zzZPZ.zzZm(50000, -30500)};

    private static int zz6(int i, int i2, int i3) {
        return (i2 == 0 || i3 == 0) ? zzxJ(i) : (((i3 * i2) / 100) / 50) * 50;
    }

    public static void zzA(zzZ55 zzz55) throws Exception {
        if (zzz55 != null) {
            zzz55.isActive();
        }
        int width = zzs(zzz55).getWidth();
        if (zzz55.zzYQ7()) {
            zzz55.setX(0);
            zzz55.setY(zzz55.zzZZJ().zz5W());
            zzz55.setWidth(zzz55.zzZZJ().getWidth());
        } else {
            if (!zzz55.zzYQ9()) {
                zzz55.setY(zzt(zzz55));
                zzU(zzz55, width);
                return;
            }
            zzZ55 zzz55ZzYQd = zzz55.zzYQd();
            zzz55.setY(zzz55ZzYQd.getY());
            if (zzz55.zz5T()) {
                zzz55.setX(zzm(zzz55));
                zzP(zzz55, ((zzYAU) zzz55ZzYQd.zz6w()).getX() - zzz55.getX());
            } else {
                zzz55.setX(zzz55ZzYQd.getX() + ((zzYAU) zzz55ZzYQd.zz6w()).getRight());
                zzQ(zzz55, width);
            }
        }
    }

    private static void zzP(zzZ55 zzz55, int i) {
        if (i < 0) {
            if (zzz55.zz5T()) {
                zzz55.setX(zzz55.getX() + i);
            }
            i = 0;
        }
        zzz55.setWidth(i);
    }

    private static void zzQ(zzZ55 zzz55, int i) throws Exception {
        zzP(zzz55, ((i - zzz55.zzZZJ().zz5V()) - zzq(zzz55)) - zzz55.getX());
    }

    private static void zzR(zzZ55 zzz55, int i) {
        int i2 = (int) (i * 0.8f);
        zzz55.zzYQj();
        zzz55.setBaseline(zzz55.zzYQj().zzYQF() + i2);
        if (i < zzz55.zzYQj().zzYdx) {
            zzz55.zzYQj().zzYdx = i;
            return;
        }
        int i3 = (int) (zzz55.zzYQj().zzYdx * 0.8f);
        if (zzz55.zza7().getNoExtraLineSpacing()) {
            zzz55.setBaseline(zzz55.zzYQj().zzYQF() + i3);
        } else {
            zzz55.zzYQj().zzYdy = i2 - i3;
        }
        zzz55.zzYQj().zzYdw = (i - zzz55.zzYQj().zzYdx) - zzz55.zzYQj().zzYdy;
    }

    private static void zzS(zzZ55 zzz55, int i) {
        int i2 = i - zzz55.zzYQj().zzYdx;
        zzz55.zzYQj().zzYdy = i2 / 2;
        zzz55.zzYQj().zzYdw = i2 - zzz55.zzYQj().zzYdy;
        zzz55.setBaseline(zzz55.zzYQj().zzYdx - zzz55.zzYQj().zzYdC);
    }

    private static void zzT(zzZ55 zzz55, int i) {
        int iZzu = zzu(zzz55);
        if (zzWR(i, iZzu)) {
            zzS(zzz55, iZzu);
            zzz55.setBaseline(zzz55.getBaseline() + zzz55.zzYQj().zzYQF());
        } else {
            zzz55.zzYQj().zzYdy = Math.max(i - zzz55.zzYQj().zzYdx, 0);
            zzz55.setBaseline(zzz55.zzYQj().zzYQC() - zzz55.zzYQj().zzYdC);
        }
    }

    public static void zzU(zzZ55 zzz55, int i) throws Exception {
        zzz55.setX(zzm(zzz55));
        zzQ(zzz55, i);
    }

    private static boolean zzWR(int i, int i2) {
        return i > 0 && i2 > i;
    }

    private static int zzWS(int i, int i2) {
        if (i <= 0) {
            i = 1;
        }
        if (i2 <= 0) {
            return i;
        }
        return ((i / i2) + (i % i2 <= 0 ? 0 : 1)) * i2;
    }

    private static boolean zzY(zzZ55 zzz55, boolean z) {
        zzZ37 zzz37 = (zzZ37) ((zzYMM) zzz55.zza9()).zzYTt();
        if (!zzz37.zzYLS()) {
            return false;
        }
        if (zzz55.zzYQf() && zzz55.zza7().getAllowSpaceOfSameStyleInTable()) {
            return false;
        }
        int iZzYLQ = z ? zzz37.zzYLQ() : zzz37.zzYLR();
        if (z && zzz37.zzYLP()) {
            return zzz37.zzYLO() == iZzYLQ;
        }
        if (!z && zzz37.zzYLN()) {
            return zzz37.zzYLM() == iZzYLQ;
        }
        zzYAU zzyau = z ? (zzYAU) ((zzYMM) zzz55.zza9()).zzZ9s().zzYo0() : (zzYAU) ((zzYMM) zzz55.zza9()).zzZ9r().zzYo1();
        if (zzyau == null || (zzyau.zzYTl() > 0 && zzyau.zza9().zza9().zzYTn())) {
            return iZzYLQ == 0;
        }
        zzZ37 zzz372 = (zzZ37) zzyau.zzY6S().zzYTt();
        return iZzYLQ == (z ? zzz372.zzYLR() : zzz372.zzYLQ());
    }

    private static boolean zzZ(zzZ37 zzz37, zzZ37 zzz372) {
        return zzz37 != null && zzz372 != null && zzz37.isList() && zzz372.isList() && zzz37.zzYLL().getId() == zzz372.zzYLL().getId();
    }

    public static int zzd(zzYAU zzyau) throws Exception {
        if (zzyau.zzY74()) {
            return 0;
        }
        return zzyau.getWidth();
    }

    public static int zze(zzYAU zzyau) throws Exception {
        return zzyau.zzY74() ? zzyau.getX() : zzyau.getRight();
    }

    private static boolean zzf(zzZ55 zzz55) throws Exception {
        if (zzz55.zzaa().getStoryType() == 1) {
            zzz55.zzZZJ();
        }
        zzz55.zzYnZ();
        boolean z = zzY9R.zzmT(zzz55.zzI(false, true).zzZo6()) && zzz55.zza7().zzZYM();
        if (zzz55.zzYTm() && !zzYJP.zzl(zzz55) && !z) {
            zzUZ zzuz = (zzUZ) zzz55.zzZZJ();
            boolean z2 = ((zzZ37) ((zzYMM) zzz55.zza9()).zzYTt()).zzYM2() < 0;
            if ((zzuz.zz0h() || z2) && zzuz.zzh(zzz55) == null && !zzz55.zzYPR()) {
                return true;
            }
        }
        return false;
    }

    private static boolean zzg(zzZ55 zzz55) {
        if (!zzz55.zzYTm() || zzz55.zzYnZ()) {
            return false;
        }
        zzz55.zza9();
        return zzYJP.zzl(zzz55.zz5Y());
    }

    private static boolean zzh(zzZ55 zzz55) throws Exception {
        boolean zZzZYM = zzz55.zza7().zzZYM();
        boolean z = zzz55.zzaa().zzbD() && zzz55.zzZZJ().zz60() == 2;
        boolean z2 = zzz55.zzaa().zzZ4E() && zzz55.zzZZJ().zz60() == 1024;
        if (!zZzZYM && zzz55.zzYTm() && zzY9R.zzlw(zzz55.zzI(false, true).zzZo6()) && !zzz55.zza7().getDoNotSuppressParagraphBorders() && !zzg(zzz55)) {
            return false;
        }
        if (!zzz55.zzYQo().zzYQ3()) {
            return true;
        }
        zzZ37 zzz37 = (zzZ37) ((zzYMM) zzz55.zza9()).zzYTt();
        boolean z3 = zzz37.zzYM2() < 0;
        zzYAU zzyau = (zzYAU) ((zzYMM) zzz55.zza9()).zzZ9s().zzYo0();
        zzZ37 zzz372 = zzyau == null ? null : (zzZ37) zzyau.zzY6S().zzYTt();
        if (!zzz55.zzYTm() || zzyau != null || zzz55.zzYQf()) {
            if (zzY(zzz55, true)) {
                return true;
            }
            if ((!zzz55.zzYQf() && zzz55.zzaa().getStoryType() != 5) || !zzz55.zzYnZ()) {
                if (z3 && zzZ(zzz37, zzz372)) {
                    return true;
                }
                if (!z) {
                    return z2 && z3 && zzz55.zzYnZ();
                }
                if (!zzz55.zzYnZ()) {
                    return zzf(zzz55);
                }
                if (!zZzZYM && zzz37.zzYLV()) {
                    return false;
                }
                if (!zzz55.zzYTm()) {
                    zzYAU zzyau2 = (zzYAU) ((zzZ55) zzz55.zzYo0()).zz6x();
                    while (zzyau2 != null && (zzyau2 instanceof zzYA3)) {
                        zzyau2 = (zzYAU) zzyau2.zz5Z();
                    }
                    if (!zZzZYM && zzyau2 != null && zzY9R.zzlv(zzyau2.zzZo6()) && !zzz55.zza7().getSuppressSpBfAfterPgBrk()) {
                        return false;
                    }
                }
                zzUZ zzuz = (zzUZ) zzz55.zzZZJ();
                return (!zzuz.zz0h() || zzz55.zzYPR() || zzuz.zzYTm()) ? false : true;
            }
            if (zzd(zzz55)) {
                return true;
            }
        }
        return z3;
    }

    private static int zzi(zzZ55 zzz55) throws Exception {
        if (zze(zzz55)) {
            return 0;
        }
        return zz6(((zzZ37) ((zzYMM) zzz55.zza9()).zzYTt()).zzYM0(), ((zzZ37) ((zzYMM) zzz55.zza9()).zzYTt()).zzYLZ(), zzz55.zzYPY());
    }

    private static int zzj(zzZ55 zzz55) throws Exception {
        zzYMM zzymmZzZ;
        if (zzh(zzz55)) {
            return 0;
        }
        int iZzYM2 = ((zzZ37) ((zzYMM) zzz55.zza9()).zzYTt()).zzYM2();
        int iZzYM1 = ((zzZ37) ((zzYMM) zzz55.zza9()).zzYTt()).zzYM1();
        int iZz6 = zz6(iZzYM2, iZzYM1, zzz55.zzYPY());
        boolean z = iZzYM2 < 0;
        if (!((zzYMM) zzz55.zza9()).zza7().zzYMQ() || (zzymmZzZ = zzZ((zzYMM) zzz55.zza9(), z)) == null || (zze(zzymmZzZ.zzYSj()) && (!((zzZ37) zzymmZzZ.zzYTt()).zzYLS() || ((zzZ37) ((zzYMM) zzz55.zza9()).zzYTt()).zzYLS()))) {
            return iZz6;
        }
        int iMax = Math.max(0, iZz6 - zz6(((zzZ37) zzymmZzZ.zzYTt()).zzYM0(), ((zzZ37) zzymmZzZ.zzYTt()).zzYLZ(), zzymmZzZ.zzYSj().zzYPY()));
        if (iZzYM1 == 0 || iMax >= 1000) {
            return iMax;
        }
        return 0;
    }

    private static void zzk(zzZ55 zzz55) throws Exception {
        zzYAU zzyauZzYQc = zzz55.zzYQc();
        if (!zzY9R.zzlw(zzyauZzYQc.zzZo6())) {
            zzyauZzYQc = null;
        }
        int right = zzz55.getRight() - zzz55.getX();
        for (zzYAU zzyauZzYQl = zzz55.zzYQl(); zzyauZzYQl != null; zzyauZzYQl = zzyauZzYQl.zzY6Q()) {
            if (zzyauZzYQl == zzyauZzYQc) {
                zzyauZzYQl.setContentWidth(right);
                zzyauZzYQl.setX(0);
            } else {
                zzyauZzYQl.setX(right - zzd(zzyauZzYQl));
            }
            right = zzyauZzYQl.getX();
        }
        zzZ5H.zzT(zzz55);
    }

    private static void zzl(zzZ55 zzz55) throws Exception {
        int iZze = 0;
        for (zzYAU zzyauZzYQl = zzz55.zzYQl(); zzyauZzYQl != null; zzyauZzYQl = zzyauZzYQl.zzY6Q()) {
            zzyauZzYQl.setX(iZze);
            iZze = zze(zzyauZzYQl);
        }
        zzYAU zzyauZzYQc = zzz55.zzYQc();
        if (zzY9R.zzlw(zzyauZzYQc.zzZo6())) {
            zzyauZzYQc.setContentWidth(zzyauZzYQc.zzZZJ().getWidth() - zzyauZzYQc.getX());
        }
        zzZ5H.zzT(zzz55);
    }

    private static int zzm(zzZ55 zzz55) throws Exception {
        return zzr(zzz55) + zzs(zzz55).zz5X();
    }

    private static int zzn(zzZ55 zzz55) throws Exception {
        if (zzZ55.zza(zzz55)) {
            return 0;
        }
        return ((zzYMM) zzz55.zza9()).zzYMa();
    }

    private static int zzo(zzZ55 zzz55) throws Exception {
        int iZzn = zzn(zzz55);
        if (zzz55.zzYQ3()) {
            if (iZzn > 0) {
                return iZzn;
            }
            return 0;
        }
        if (iZzn < 0) {
            return -iZzn;
        }
        return 0;
    }

    public static int zzp(zzZ55 zzz55) throws Exception {
        return ((zzYMM) zzz55.zza9()).zzYM7() + ((zzYMM) zzz55.zza9()).zzYM4() + zzo(zzz55);
    }

    public static int zzq(zzZ55 zzz55) throws Exception {
        return zzZ(zzz55, !zzz55.zz5T());
    }

    public static int zzr(zzZ55 zzz55) throws Exception {
        return zzZ(zzz55, zzz55.zz5T());
    }

    private static zzTF zzs(zzZ55 zzz55) {
        return zzz55.zzaa().getStoryType() == 4 ? (zzTF) zzz55.zzqh(4096) : zzz55.zzZZJ();
    }

    private static int zzt(zzZ55 zzz55) throws Exception {
        int iZzo = zzYJP.zzo(zzz55);
        if (iZzo != Integer.MIN_VALUE) {
            return iZzo;
        }
        if (zzYJP.zzl(zzz55)) {
            return 0;
        }
        zzUZ zzuz = (zzUZ) com.aspose.words.internal.zzZKW.zzZ(zzz55.zzZZJ(), zzUZ.class);
        return (zzuz == null || zzuz.zz0n() || !zzz55.zzYnZ() || !zzuz.zz0h() || zzj(zzz55) <= 0) ? zzz55.zzZZJ().zz5W() : zzz55.zzYQj().zzYdD - zzz55.getBaseline();
    }

    private static int zzu(zzZ55 zzz55) {
        int iZzYPY = zzz55.zzYPY();
        if (iZzYPY > 0) {
            return zzWS(zzz55.zzYQj().zzYdx, iZzYPY);
        }
        return 0;
    }

    private static void zzv(zzZ55 zzz55) {
        double dZzYw = com.aspose.words.internal.zzSA.zzYw(((zzZ37) ((zzYMM) zzz55.zza9()).zzYTt()).zzHT());
        int iZzYPY = zzz55.zzYPY();
        if (iZzYPY == 0 || dZzYw == 0.0d) {
            int iZzZ = (int) ((dZzYw - 1.0d) * ((double) zzz55.zzYQj().zzYdB));
            if (((zzYAU) zzz55.zz6x()).zzY6N().zzYKI()) {
                iZzZ = com.aspose.words.internal.zzSA.zzZ(iZzZ, ((zzYAU) zzz55.zz6x()).zzY6N().zzZ7e().getDpi());
            }
            if (iZzZ >= 0) {
                zzz55.zzYQj().zzYdw += iZzZ;
                zzz55.setBaseline(zzz55.zzYQj().zzYdx - zzz55.zzYQj().zzYdC);
            } else {
                zzz55.zzYQj().zzYdx += iZzZ;
                zzz55.setBaseline((int) (((double) zzz55.zzYQj().zzYdx) - (((double) zzz55.zzYQj().zzYdC) * dZzYw)));
            }
        } else {
            int iZzWS = zzWS(zzz55.zzYQj().zzYdx, iZzYPY);
            if (iZzWS / iZzYPY < dZzYw) {
                iZzWS = (int) (((double) iZzYPY) * dZzYw);
            }
            zzS(zzz55, iZzWS);
        }
        zzz55.setBaseline(zzz55.getBaseline() + zzz55.zzYQj().zzYQF());
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzw(zzZ55 zzz55) throws Exception {
        int i;
        boolean z;
        if (((zzZ55) zzz55.zzYo0()) != null) {
            ((zzZ55) zzz55.zzYo0()).zza9();
        }
        if (((zzYMM) zzz55.zza9()).zzRA(true)) {
            zzz55.zzZ((zzZ56) null);
            zzz55.setHeight(0);
            zzz55.setBaseline(0);
            zzz55.zzxF(0);
            return;
        }
        if (zzz55.zzYQ9()) {
            zzZ55 zzz55ZzYQd = zzz55.zzYQd();
            zzz55.zzZ(zzz55ZzYQd.zzYQj().zzYQB());
            zzz55.setHeight(zzz55ZzYQd.getHeight());
            zzz55.setBaseline(zzz55ZzYQd.getBaseline());
            zzz55.zzxF(zzz55ZzYQd.zz0t());
            return;
        }
        zzz55.zzZ(new zzZ56());
        zzz55.zzYQj().zz4((zzYAU) zzz55.zz6x());
        zzz55.zzYQj().zzYdA = zzj(zzz55);
        if (((zzYMM) zzz55.zza9()).zzYoi()) {
            zzz55.zzYQj().zzYdu = 0;
            zzz55.zzYQj().zzYdz = 0;
            zzz55.zzYQj().zzYdv = 0;
            zzz55.zzYQj().zzYdx = 0;
            zzz55.setHeight(0);
            zzz55.zzxF(0);
            return;
        }
        zzz55.zzYQj().zzYdu = zzi(zzz55);
        zzz55.zzYQj().zzYdz = zzz55.zzYQi().zzYPC().zzYN3();
        zzz55.zzYQj().zzYdv = zzz55.zzYQi().zzYPA();
        zzZ37 zzz37 = (zzZ37) ((zzYMM) zzz55.zza9()).zzYTt();
        zzz55.zzYQj().zzYdx = Math.max(zzz55.zzYQj().zzYdD + zzz55.zzYQj().zzYdC, zzz55.zzYQj().zzYdB);
        int iZzHT = zzd(zzz55) ? 0 : zzz37.zzHT();
        int lineSpacingRule = zzz37.getLineSpacingRule();
        if (lineSpacingRule == 0) {
            zzT(zzz55, iZzHT);
        } else {
            if (lineSpacingRule == 1) {
                zzR(zzz55, iZzHT);
                if (!zzz55.zza7().getNoExtraLineSpacing() || !zzz55.zza7().getSuppressBottomSpacing()) {
                    i = zzz55.zzYQj().zzYdw;
                }
                zzz55.zzYQj();
                zzz55.setHeight(zzz55.zzYQj().getHeight());
                z = zzz55.zzZZJ().zza9() instanceof zzZMT;
                if (z || !zzz55.zzZZJ().zza7().zzZYM()) {
                    zzz55.zzxF(i + zzz55.zzYQj().zzYQF() + zzz55.zzYQj().zzYdx);
                } else {
                    zzz55.zzxF(zzz55.getHeight());
                }
                zzz55.getHeight();
                zzz55.zz0t();
                if (!zzz55.zzYQ6()) {
                    zzz55.zzxF(0);
                    return;
                } else {
                    if (z) {
                        return;
                    }
                    zzz55.zzxF(zzz55.zz0t() + (zzz55.zzYTn() ? zzz55.zzYQi().zzYPA() : Math.max(zzz37.zzYMV().zzwz(0).zzYN3(), zzz37.zzYMV().zzwz(4).zzYN3())));
                    return;
                }
            }
            if (lineSpacingRule != 2) {
                zzz55.zzZ((zzZ56) null);
            } else {
                zzv(zzz55);
            }
        }
        i = 0;
        zzz55.zzYQj();
        zzz55.setHeight(zzz55.zzYQj().getHeight());
        z = zzz55.zzZZJ().zza9() instanceof zzZMT;
        if (z) {
            zzz55.zzxF(i + zzz55.zzYQj().zzYQF() + zzz55.zzYQj().zzYdx);
        }
        zzz55.getHeight();
        zzz55.zz0t();
        if (!zzz55.zzYQ6()) {
        }
    }

    private static void zzx(zzZ55 zzz55) {
        zzZ37 zzz37 = (zzZ37) ((zzYMM) zzz55.zza9()).zzYTt();
        zzZ3C zzz3cZzYMV = zzz37.zzYMV();
        if (zzz55.zza7().getSuppressTopSpacing() && zzz55.zzYnZ() && zzz55.zzZZJ().zz60() == 2 && zzz37.zzYMW().isEmpty() && !zzz3cZzYMV.zzwz(3).isVisible() && !zzz3cZzYMV.zzwz(1).isVisible() && !zzz3cZzYMV.zzwz(2).isVisible()) {
            int lineSpacingRule = zzz37.getLineSpacingRule();
            if (lineSpacingRule != 0) {
                if (lineSpacingRule != 1) {
                    return;
                }
                zzz55.setY(com.aspose.words.internal.zzAN.zzX(zzz37.zzHT(), zzYdG));
            } else if (zzWR(zzz37.zzHT(), zzu(zzz55))) {
                zzz55.setY(Math.min(0, 9500 - zzz37.zzHT()));
            } else {
                zzz55.setY(Math.min(0, (9500 - Math.min(zzz55.zzYQj().zzYdx, zzz37.zzHT())) - zzz55.zzYQj().zzYdy));
            }
        }
    }

    private static int zzxJ(int i) {
        return i >= 0 ? i : zzYdH;
    }

    public static void zzy(zzZ55 zzz55) throws Exception {
        if (zzz55.zz5T()) {
            zzk(zzz55);
        } else {
            zzl(zzz55);
        }
    }

    public static void zzz(zzZ55 zzz55) throws Exception {
        zzy(zzz55);
        zzw(zzz55);
        zzx(zzz55);
    }

    private static int zzZ(zzZ55 zzz55, boolean z) throws Exception {
        int iZzYM4 = z ? ((zzYMM) zzz55.zza9()).zzYM4() : ((zzYMM) zzz55.zza9()).zzYM7();
        if (!z) {
            iZzYM4 += zzo(zzz55);
        }
        if (zzz55.zzaa() instanceof zzYBY) {
            zzY9X zzy9x = (zzY9X) com.aspose.words.internal.zzZKW.zzZ((zzYAU) zzz55.zz6x(), zzY9X.class);
            zzYAS zzyas = (zzYAS) com.aspose.words.internal.zzZKW.zzZ((zzYAU) ((zzYAU) zzz55.zz6x()).zzYo1(), zzYAS.class);
            if (zzy9x != null && zzyas != null && zzyas.zzYTn() && zzy9x.zzY4Y()) {
                return 0;
            }
        }
        return iZzYM4;
    }

    private static boolean zzd(zzZ55 zzz55) throws Exception {
        return zzz55.zzYQc() != null && zzz55.zzYQc().zzZo6() == 21577 && ((zzYAS) zzz55.zzYQc()).zzY6d();
    }

    private static boolean zze(zzZ55 zzz55) throws Exception {
        if (!zzz55.zzYTn()) {
            return true;
        }
        zzZ37 zzz37 = (zzZ37) ((zzYMM) zzz55.zza9()).zzYTt();
        boolean z = zzz37.zzYM0() < 0;
        if (zzz55.zzYQq() && (zzz55.zzaa().zzZ4E() || zzz55.zzaa().getStoryType() == 2 || zzz55.zzaa().getStoryType() == 3 || zzz55.zzaa().getStoryType() == 5)) {
            return false;
        }
        zzZ6T zzz6tZzYTp = ((zzYMM) zzz55.zza9()).zzYTp();
        if ((zzY9R.zzmW(zzz55.zzYQc().zzZo6()) && zzz55.zzYQc().zzYol() && (zzz6tZzYTp instanceof zzY6N)) || zzY(zzz55, false)) {
            return true;
        }
        zzZ37 zzz372 = zzz6tZzYTp instanceof zzYMM ? (zzZ37) zzz6tZzYTp.zzYTt() : null;
        if (z && zzZ(zzz37, zzz372)) {
            return true;
        }
        return (z && zzz55.zzYQc().zzZo6() == 21577 && !zzz37.isList()) || zzd(zzz55);
    }

    public static void zzU(zzTF zztf) throws Exception {
        if (zztf.isEmpty() || zztf.zz6w().zz60() != 32) {
            return;
        }
        zzZ55 zzz55 = (zzZ55) zztf.zz6w();
        if (zzz55.zzZXN() == null && zzz55.getHeight() > 1) {
            zzw(zzz55);
        }
    }

    private static zzYMM zzZ(zzYMM zzymm, boolean z) {
        zzZ39 zzz39ZzTV = ((zzZ37) zzymm.zzYTt()).zzTV(true);
        zzZ6T zzz6tZzYTo = zzymm.zzYTo();
        while (zzz6tZzYTo != null) {
            zzY6N zzy6n = (zzY6N) com.aspose.words.internal.zzZKW.zzZ(zzz6tZzYTo, zzY6N.class);
            if (zzy6n != null) {
                if (!z || !zzy6n.zzY6a().isFloating()) {
                    return null;
                }
                zzz6tZzYTo = zzz6tZzYTo.zzYTo();
            } else {
                zzYMM zzymm2 = (zzYMM) zzz6tZzYTo;
                zzZ39 zzz39ZzTV2 = ((zzZ37) zzymm2.zzYTt()).zzTV(true);
                if (zzz39ZzTV.isFloating()) {
                    if (!zzz39ZzTV.equals(zzz39ZzTV2)) {
                        return null;
                    }
                } else if (zzz39ZzTV2.isFloating()) {
                    zzz6tZzYTo = zzymm2.zzYTo();
                }
                return zzymm2;
            }
        }
        if ((!zzymm.zzaa().zzbD() && !(zzymm.zzaa() instanceof zzYVI)) || (zzymm.zza9() instanceof zzWV) || !zzymm.zzYTm()) {
            return null;
        }
        zzYAU zzyauZzZ9s = zzymm.zzZ9s();
        if (zzyauZzZ9s.zzYo0() != null) {
            return (zzYMM) zzyauZzZ9s.zzYo0().zza9();
        }
        return null;
    }
}
