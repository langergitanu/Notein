package com.aspose.words.internal;

import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.words.internal.zzZPL;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZPM {
    private static boolean zzR(zzZPL.zzX zzx, zzZPL.zzY zzy) {
        zzx.setHour(zzy.zzR0(0));
        zzx.setMinute(zzy.zzR0(1));
        return true;
    }

    public static int zzR9(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "wrong year "));
        }
        if (i < 100) {
            return androidx.core.graphics.OooO0OO.OooO00o(20, i > 99 ? 1 : 0, 100, i);
        }
        return i;
    }

    private static int zzRa(int i) {
        return i < 100 ? zzR9(i) : i;
    }

    private static boolean zzS(zzZPL.zzX zzx, zzZPL.zzY zzy) {
        zzx.setHour(zzy.zzR0(0));
        zzx.setMinute(zzy.zzR0(1));
        zzx.setSecond(zzy.zzR0(2));
        return true;
    }

    private static int zzT(zzZPL zzzpl, zzZP0 zzzp0) {
        int i = -1;
        int i2 = 0;
        if (zzzpl.zzjR()) {
            int i3 = 0;
            for (int i4 = 0; i4 <= 6; i4++) {
                int iZzK = zzzpl.zzK(zzzp0.zzQJ(i4), false);
                if (iZzK > i3) {
                    i = i4;
                    i3 = iZzK;
                }
            }
            i2 = i3;
        }
        if (i >= 0) {
            zzzpl.setIndex((zzzpl.getIndex() + i2) - 1);
        }
        return i;
    }

    private static int zzU(zzZPL zzzpl, zzZP0 zzzp0) {
        int i = 0;
        int i2 = -1;
        if (zzzpl.zzjR()) {
            int i3 = zzzp0.zzQM(13).length() == 0 ? 12 : 13;
            int i4 = 0;
            int i5 = -1;
            for (int i6 = 1; i6 <= i3; i6++) {
                int iZzK = zzzpl.zzK(zzzp0.zzQN(i6), false);
                if (iZzK != -1 && iZzK > i4) {
                    i5 = i6;
                    i4 = iZzK;
                }
            }
            i = i4;
            i2 = i5;
        }
        if (i2 > 0) {
            zzzpl.setIndex((zzzpl.getIndex() + i) - 1);
        }
        return i2;
    }

    private static int zzV(zzZPL zzzpl, zzZP0 zzzp0) {
        int i = 0;
        int i2 = -1;
        if (zzzpl.zzjR()) {
            int i3 = zzzp0.zzQM(13).length() == 0 ? 12 : 13;
            for (int i4 = 1; i4 <= i3; i4++) {
                int length = zzzp0.zzQM(i4).length();
                if (length > i) {
                    i2 = i4;
                    i = length;
                }
            }
        }
        if (i2 > 0) {
            zzzpl.setIndex((zzzpl.getIndex() + i) - 1);
        }
        return i2;
    }

    private static int zzVu(String str) {
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = -1;
        while (i2 < str.length() && i3 < 2) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\"' || cCharAt == '\'') {
                z = !z;
            }
            if (!z) {
                if (cCharAt == 'M') {
                    int i5 = i3 + 1;
                    while (true) {
                        int i6 = i2 + 1;
                        if (i6 >= str.length() || str.charAt(i6) != 'M') {
                            break;
                        }
                        i2 = i6;
                    }
                    int i7 = i3;
                    i3 = i5;
                    i = i7;
                } else if (cCharAt == 'd') {
                    int i8 = 1;
                    while (true) {
                        int i9 = i2 + 1;
                        if (i9 >= str.length() || str.charAt(i9) != 'd') {
                            break;
                        }
                        i8++;
                        i2 = i9;
                    }
                    if (i8 <= 2) {
                        int i10 = i3;
                        i3++;
                        i4 = i10;
                    }
                }
            }
            i2++;
        }
        return (i == 0 && i4 == 1) ? zzZPL.zzZZH : (i4 == 0 && i == 1) ? zzZPL.zzZZG : zzZPL.zzZZF;
    }

    private static int zzVv(String str) {
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = -1;
        while (i2 < str.length() && i3 < 2) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\"' || cCharAt == '\'') {
                z = !z;
            }
            if (!z) {
                if (cCharAt == 'M') {
                    int i5 = i3 + 1;
                    while (true) {
                        int i6 = i2 + 1;
                        if (i6 >= str.length() || str.charAt(i6) != 'M') {
                            break;
                        }
                        i2 = i6;
                    }
                    int i7 = i3;
                    i3 = i5;
                    i4 = i7;
                } else if (cCharAt == 'y') {
                    int i8 = i3 + 1;
                    while (true) {
                        int i9 = i2 + 1;
                        if (i9 >= str.length() || str.charAt(i9) != 'y') {
                            break;
                        }
                        i2 = i9;
                    }
                    int i10 = i3;
                    i3 = i8;
                    i = i10;
                }
            }
            i2++;
        }
        return (i == 0 && i4 == 1) ? zzZPL.zzZZJ : (i4 == 0 && i == 1) ? zzZPL.zzZZI : zzZPL.zzZZF;
    }

    private static int zzW(zzZPL zzzpl, zzZP0 zzzp0) {
        if (!zzzpl.zzjR()) {
            return -1;
        }
        if (zzzpl.zzjP() == zzzp0.getAMDesignator().charAt(0)) {
            return 0;
        }
        return zzzpl.zzjP() == zzzp0.getPMDesignator().charAt(0) ? 1 : -1;
    }

    private static int zzX(zzZPL zzzpl, zzZP0 zzzp0) {
        int i = zzzp0.getAMDesignator().length() == 0 ? 0 : -1;
        if (zzzp0.getPMDesignator().length() == 0) {
            i = 1;
        }
        if (zzzpl.zzjR()) {
            String aMDesignator = zzzp0.getAMDesignator();
            if (aMDesignator.length() > 0 && zzzpl.zzVt(aMDesignator)) {
                zzzpl.setIndex((aMDesignator.length() + zzzpl.getIndex()) - 1);
                return 0;
            }
            String pMDesignator = zzzp0.getPMDesignator();
            if (pMDesignator.length() > 0 && zzzpl.zzVt(pMDesignator)) {
                zzzpl.setIndex((pMDesignator.length() + zzzpl.getIndex()) - 1);
                return 1;
            }
            zzzpl.setIndex(zzzpl.getIndex() - 1);
        }
        return i;
    }

    private static boolean zzY(zzZPL zzzpl) throws Exception {
        while (zzzpl.zzjR()) {
            char cZzjP = (char) zzzpl.zzjP();
            if (cZzjP == '+') {
                return true;
            }
            if (cZzjP == '-') {
                return false;
            }
        }
        throw new IllegalStateException(" A sign symbol ('+' or '-') is expected. However, end of string is encountered.");
    }

    public static zzZQ9 zzZ(String str, zzZP0 zzzp0, int i) {
        return zzY(str, zzzp0, i);
    }

    private static int zzZh(int i, int i2) {
        return i == -1 ? i2 : i;
    }

    public static zzZQ9 zzZ(String str, String str2, zzZP0 zzzp0, int i) {
        zzZPL.zzX zzx = new zzZPL.zzX();
        zzx.zzra();
        return zzZ(str, str2, i, zzzp0, zzx) ? zzx.zzjr() : zzZQ9.zz35;
    }

    public static double zzW(zzZPL zzzpl) {
        double d = 0.0d;
        int i = 0;
        double d2 = 0.1d;
        while (zzzpl.zzjR()) {
            char cZzFI = zzzpl.zzFI();
            if (!zzZPL.isDigit(cZzFI)) {
                break;
            }
            d += ((double) (cZzFI - '0')) * d2;
            d2 *= 0.1d;
            i++;
        }
        if (i > 0) {
            return d;
        }
        return -1.0d;
    }

    private static int zzY(zzZPL zzzpl, zzZP0 zzzp0) {
        int i = 0;
        int i2 = -1;
        if (zzzpl.zzjR()) {
            int i3 = 0;
            while (i <= 6) {
                int length = zzzp0.zzQI(i).length();
                if (length > i3) {
                    i2 = i;
                    i3 = length;
                }
                i++;
            }
            i = i3;
        }
        if (i2 >= 0) {
            zzzpl.setIndex((zzzpl.getIndex() + i) - 1);
        }
        return i2;
    }

    private static boolean zzT(zzZPL.zzX zzx, zzZPL.zzY zzy) {
        zzZ(zzx, zzy.getYear(), zzy.getMonth(), zzy.zzR0(0));
        return true;
    }

    private static boolean zzW(zzZPL.zzX zzx, zzZPL.zzY zzy) {
        if (zzy.zzjw() == -1) {
            return false;
        }
        zzx.setHour(zzy.zzR0(0));
        return true;
    }

    private static boolean zzU(zzZPL.zzX zzx, zzZPL.zzY zzy) {
        zzZ(zzx, zzy.getYear(), zzy.zzR0(0), 1);
        return true;
    }

    private static boolean zzV(zzZPL zzzpl) {
        char cCharAt = zzzpl.getValue().charAt(zzzpl.getIndex());
        if (cCharAt != '#') {
            if (cCharAt != 0) {
                return false;
            }
            for (int index = zzzpl.getIndex(); index < zzzpl.zzjS(); index++) {
                if (zzzpl.getValue().charAt(index) != 0) {
                    return false;
                }
            }
            zzzpl.setIndex(zzzpl.zzjS());
            return true;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < zzzpl.zzjS(); i++) {
            char cCharAt2 = zzzpl.getValue().charAt(i);
            if (cCharAt2 == '#') {
                if (!z2) {
                    z2 = true;
                } else {
                    if (z) {
                        return false;
                    }
                    z = true;
                }
            } else if (cCharAt2 == 0) {
                if (!z) {
                    return false;
                }
            } else if (!zzZKU.zzG(cCharAt2) && (!z2 || z)) {
                return false;
            }
        }
        if (!z) {
            return false;
        }
        zzzpl.zzjR();
        return true;
    }

    private static boolean zzW(zzZP0 zzzp0, zzZPL.zzX zzx, zzZPL.zzY zzy) {
        int iZzVu = zzVu(zzzp0.zzkh());
        if (iZzVu == zzZPL.zzZZF) {
            return false;
        }
        if (iZzVu == zzZPL.zzZZG) {
            int iZzVv = zzVv(zzzp0.zzkg());
            if (iZzVv == zzZPL.zzZZF) {
                return false;
            }
            if (iZzVv == zzZPL.zzZZI) {
                zzZ(zzx, zzRa(zzy.zzR0(0)), zzy.getMonth(), 1);
                return true;
            }
        }
        zzX(zzx);
        zzZ(zzx, zzx.getYear(), zzy.getMonth(), zzy.zzR0(0));
        return true;
    }

    private static boolean zzZ(String str, String str2, int i, zzZP0 zzzp0, zzZPL.zzX zzx) {
        String strZzZ = str2;
        zzZPL.zzV zzv = new zzZPL.zzV();
        zzZPL.zzV.zzra();
        zzZPL.zzV.zzZ(zzzp0.zzjs());
        zzZPL.zzV.zzZ7((i & 4) != 0);
        zzZPL.zzV.zzZ6((i & 2) != 0);
        if (strZzZ.length() == 1) {
            if ((zzx.getFlags() & 2048) != 0 && strZzZ.charAt(0) == 'U') {
                return false;
            }
            strZzZ = zzZ(strZzZ, zzzp0, zzx);
        }
        zzx.zzZ(zzZPL.zzV.zzjs());
        if (zzZPL.zzV.zzjs().getID() == 8) {
            zzZPL.zzV.zzjf();
        }
        zzx.setHour(-1);
        zzx.setMinute(-1);
        zzx.setSecond(-1);
        zzZPL zzzpl = new zzZPL(strZzZ, zzzp0);
        zzZPL zzzpl2 = new zzZPL(str, zzzp0);
        if (zzZPL.zzV.zzjh()) {
            zzzpl.zzjI();
            zzzpl.zzjH();
            zzzpl2.zzjI();
        }
        if ((i & 1) != 0) {
            zzzpl.zzjQ();
            zzzpl.zzjG();
            zzzpl2.zzjQ();
        }
        while (zzzpl.zzjR()) {
            if (zzZPL.zzV.zzji()) {
                zzzpl2.zzjQ();
            }
            if (!zzZ(zzzpl2, zzzpl, zzv, zzzp0, zzx)) {
                return false;
            }
        }
        if (zzZPL.zzV.zzjk() && (zzzp0.zzZXY & 8) == 0) {
            if (zzx.getYear() >= 100) {
                return false;
            }
            zzx.zzR3(zzR9(zzx.getYear()));
        }
        if (zzZPL.zzV.zzjm()) {
            if (zzZPL.zzV.zzjw() == -1) {
                zzZPL.zzV.zzR2(0);
            }
            int hour = 12;
            if (zzx.getHour() > 12) {
                return false;
            }
            if (zzZPL.zzV.zzjw() == 0) {
                if (zzx.getHour() == 12) {
                    hour = 0;
                }
            } else if (zzx.getHour() != 12) {
                hour = 12 + zzx.getHour();
            }
            zzx.setHour(hour);
        }
        boolean z = zzx.getYear() == -1 && zzx.getMonth() == -1 && zzx.getDay() == -1;
        zzY(zzx, i);
        if (!z && zzzp0.zziH()) {
            if (!zzzp0.zzZ(new int[]{zzx.getYear(), zzx.getMonth()}, (zzx.getFlags() & 1024) != 0)) {
                return false;
            }
        }
        zzx.zzD(zzZPL.zzV.zzjs().zzZ(zzx.getYear(), zzx.getMonth(), zzx.getDay(), zzx.getHour(), zzx.getMinute(), zzx.getSecond(), zzx.zzju()));
        if (zzx.zzjr() == zzZQ9.zz35 || zzx.zzjr() == null) {
            return false;
        }
        if (zzx.zzjv() > 0.0d) {
            zzx.zzD(zzx.zzjr().zzYL(Math.round(zzx.zzjv() * 1.0E7d)));
        }
        if (zzZPL.zzV.zzkS() == -1 || zzZPL.zzV.zzkS() == zzZPL.zzV.zzjs().zzH(zzx.zzjr())) {
            return i == 0 || zzZ(zzx, i, z);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if (r7 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        return r1 - r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int zzY(String str, int i, StringBuilder sb) {
        boolean z;
        int length = str.length();
        int i2 = i + 1;
        char cCharAt = str.charAt(i);
        while (true) {
            if (i2 >= length) {
                z = false;
                break;
            }
            int i3 = i2 + 1;
            char cCharAt2 = str.charAt(i2);
            if (cCharAt2 == cCharAt) {
                z = true;
                i2 = i3;
                break;
            }
            if (cCharAt2 != '\\') {
                sb.append(cCharAt2);
                i2 = i3;
            } else {
                if (i3 >= length) {
                    return -1;
                }
                i2 += 2;
                sb.append(str.charAt(i3));
            }
        }
    }

    public static zzZNF zzX(zzZPL zzzpl) {
        int i;
        int i2;
        zzzpl.zzjM();
        if (zzZPL.zzZ.getLength() != 1) {
            return null;
        }
        char cZzjF = zzZPL.zzZ.zzjF();
        if (cZzjF != '+' && cZzjF != '-') {
            return null;
        }
        zzzpl.zzjL();
        zzzpl.zzjM();
        if (zzZPL.zzZ.getType() != 2) {
            return null;
        }
        int value = zzZPL.zzZ.getValue();
        int length = zzZPL.zzZ.getLength();
        if (length == 1 || length == 2) {
            zzzpl.zzjL();
            zzzpl.zzjM();
            if (zzZPL.zzZ.getLength() == 1 && zzZPL.zzZ.zzjF() == ':') {
                zzzpl.zzjL();
                zzzpl.zzjM();
                if (zzZPL.zzZ.getType() != 2 || zzZPL.zzZ.getLength() <= 0 || zzZPL.zzZ.getLength() > 2) {
                    return null;
                }
                int value2 = zzZPL.zzZ.getValue();
                zzzpl.zzjL();
                i2 = value2;
                i = value;
            } else {
                i = value;
                i2 = 0;
            }
        } else {
            if (length != 3 && length != 4) {
                return null;
            }
            i = value / 100;
            i2 = value % 100;
            zzzpl.zzjL();
        }
        if (i2 < 0 || i2 >= 60) {
            return null;
        }
        zzZNF zzznf = new zzZNF(i, i2);
        return cZzjF == '-' ? zzznf.zzhx() : zzznf;
    }

    private static double zzY(zzZPL zzzpl, int i) {
        if (!zzzpl.zzjO()) {
            zzzpl.setIndex(zzzpl.getIndex() - 1);
            return -1.0d;
        }
        double dZzjN = zzzpl.zzjN();
        int i2 = 1;
        while (true) {
            if (i2 >= i) {
                break;
            }
            if (!zzzpl.zzjO()) {
                zzzpl.setIndex(zzzpl.getIndex() - 1);
                break;
            }
            dZzjN = (dZzjN * 10.0d) + ((double) zzzpl.zzjN());
            i2++;
        }
        if (i2 != i) {
            return -1.0d;
        }
        return dZzjN / Math.pow(10.0d, i2);
    }

    private static boolean zzV(zzZPL.zzX zzx, zzZPL.zzY zzy) {
        zzZ(zzx, zzy.getYear(), zzy.getMonth(), 1);
        return true;
    }

    private static boolean zzV(zzZP0 zzzp0, zzZPL.zzX zzx, zzZPL.zzY zzy) {
        int iZzR0 = zzy.zzR0(0);
        int iZzR02 = zzy.zzR0(1);
        if (zzX(zzzp0) == zzZPL.zzZZK) {
            zzZ(zzx, zzy.getYear(), iZzR02, iZzR0);
            return true;
        }
        zzZ(zzx, zzy.getYear(), iZzR0, iZzR02);
        return true;
    }

    private static boolean zzW(zzZPL.zzX zzx, zzZPL.zzY zzy, zzZP0 zzzp0) {
        int iZzVu = zzVu(zzzp0.zzkh());
        if (iZzVu == -1) {
            return false;
        }
        zzx.setMonth(zzy.getMonth());
        if (iZzVu != 7) {
            return false;
        }
        zzx.setDay(zzy.zzR0(0));
        return true;
    }

    private static zzZQ9 zzY(String str, zzZP0 zzzp0, int i) {
        zzZQ9 zzzq9 = zzZQ9.zz35;
        zzZPL zzzpl = new zzZPL(str, zzzp0);
        zzZPL.zzX zzx = new zzZPL.zzX();
        zzx.zzra();
        zzZPL.zzY zzy = new zzZPL.zzY();
        zzy.zzO(new int[12]);
        zzx.zzZ(zzzp0.zzjs());
        boolean z = false;
        zzx.zzQZ(0);
        zzZPL.zzW zzw = new zzZPL.zzW();
        zzw.zzjo();
        zzzpl.zzjR();
        int i2 = 0;
        boolean z2 = false;
        while (zzZPL.zzZ(i2, zzzpl, zzw, zzy, zzx, zzzp0)) {
            if (zzw.zzjq() != 18) {
                if (zzw.zzjp() != 256) {
                    if (!zzZ(zzx, zzy, zzw)) {
                        return zzZQ9.zz35;
                    }
                    zzw.zzjo();
                }
                if (zzw.zzjq() == 19) {
                    if (i2 != 13 && i2 != 12) {
                        return zzZQ9.zz35;
                    }
                    return zzZ(zzy, zzzpl, i, zzx);
                }
                i2 = zzZPL.zzZZO[i2][zzw.zzjq()];
                if (i2 == 20) {
                    return zzZQ9.zz35;
                }
                if (i2 > 20) {
                    if ((zzzp0.zzZXY & 8) != 0) {
                        if (!zzZ(i2, zzx, zzy, zzzp0)) {
                            return zzZQ9.zz35;
                        }
                    } else if (!zzZ(i2, zzx, i, zzy, zzzp0)) {
                        return zzZQ9.zz35;
                    }
                    i2 = 0;
                    z2 = true;
                }
            }
            if (zzw.zzjq() == 0 || zzw.zzjq() == 1 || zzw.zzjq() == 6) {
                if (!z2) {
                    return zzZQ9.zz35;
                }
                zzZ(zzzp0, zzy);
                if (!zzZ(zzx, zzy)) {
                    return zzZQ9.zz35;
                }
                if (zzx.getYear() == -1 && zzx.getMonth() == -1 && zzx.getDay() == -1) {
                    z = true;
                }
                zzY(zzx, i);
                zzZQ9 zzzq9ZzZ = zzx.zzjs().zzZ(zzx.getYear(), zzx.getMonth(), zzx.getDay(), zzx.getHour(), zzx.getMinute(), zzx.getSecond(), zzx.zzju());
                zzZQ9 zzzq92 = zzZQ9.zz35;
                if (zzzq9ZzZ != zzzq92) {
                    if (zzy.zzjv() > 0.0d) {
                        zzzq9ZzZ = zzzq9ZzZ.zzYL(Math.round(zzy.zzjv() * 1.0E7d));
                    }
                    if (zzy.zzkS() == -1 || zzy.zzkS() == zzx.zzjs().zzH(zzzq9ZzZ)) {
                        zzx.zzD(zzzq9ZzZ);
                        if (zzZ(zzx, i, z)) {
                            return zzx.zzjr();
                        }
                    }
                }
                return zzzq92;
            }
        }
        return zzZQ9.zz35;
    }

    private static int zzX(zzZPL zzzpl, int i) {
        if (i == 1) {
            return zzZ(zzzpl, 1, 2);
        }
        return zzZ(zzzpl, i, i);
    }

    private static boolean zzX(zzZPL.zzX zzx, zzZPL.zzY zzy) {
        if (zzy.zzjy() != 1 || zzx.getDay() != -1) {
            return false;
        }
        zzx.setDay(zzy.zzR0(0));
        return true;
    }

    private static boolean zzX(zzZP0 zzzp0, zzZPL.zzX zzx, zzZPL.zzY zzy) {
        int iZzVu = zzVu(zzzp0.zzkh());
        if (iZzVu == zzZPL.zzZZF) {
            return false;
        }
        if (iZzVu == zzZPL.zzZZH) {
            int iZzVv = zzVv(zzzp0.zzkg());
            if (iZzVv == zzZPL.zzZZF) {
                return false;
            }
            if (iZzVv == zzZPL.zzZZJ) {
                zzZ(zzx, zzRa(zzy.zzR0(0)), zzy.getMonth(), 1);
                return true;
            }
        }
        zzX(zzx);
        zzZ(zzx, zzx.getYear(), zzy.getMonth(), zzy.zzR0(0));
        return true;
    }

    private static boolean zzX(zzZPL.zzX zzx, zzZPL.zzY zzy, zzZP0 zzzp0) {
        int iZzR0 = zzy.zzR0(0);
        int iZzR02 = zzy.zzR0(1);
        int iZzX = zzX(zzzp0);
        if (iZzX == zzZPL.zzZZF) {
            return false;
        }
        if (iZzX != zzZPL.zzZZM && iZzX != zzZPL.zzZZN) {
            zzZ(zzx, zzy.getYear(), iZzR02, iZzR0);
            return true;
        }
        zzZ(zzx, zzy.getYear(), iZzR0, iZzR02);
        return true;
    }

    private static int zzX(zzZP0 zzzp0) {
        int i;
        String shortDatePattern = zzzp0.getShortDatePattern();
        if ("ka-GE".equals(zzzp0.zzk2())) {
            shortDatePattern = zzzp0.getLongDatePattern();
        }
        int i2 = 0;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = 0;
        boolean z = false;
        while (i2 < shortDatePattern.length() && i6 < 3) {
            char cCharAt = shortDatePattern.charAt(i2);
            if (cCharAt == '\'' || cCharAt == '\"') {
                z = !z;
            }
            if (!z) {
                if (cCharAt == 'y') {
                    int i7 = i6 + 1;
                    while (true) {
                        int i8 = i2 + 1;
                        if (i8 >= shortDatePattern.length() || shortDatePattern.charAt(i8) != 'y') {
                            break;
                        }
                        i2 = i8;
                    }
                    i = i7;
                    i3 = i6;
                } else if (cCharAt == 'M') {
                    int i9 = i6 + 1;
                    while (true) {
                        int i10 = i2 + 1;
                        if (i10 >= shortDatePattern.length() || shortDatePattern.charAt(i10) != 'M') {
                            break;
                        }
                        i2 = i10;
                    }
                    i = i9;
                    i4 = i6;
                } else if (cCharAt == 'd') {
                    int i11 = 1;
                    while (true) {
                        int i12 = i2 + 1;
                        if (i12 >= shortDatePattern.length() || shortDatePattern.charAt(i12) != 'd') {
                            break;
                        }
                        i11++;
                        i2 = i12;
                    }
                    if (i11 <= 2) {
                        i = i6 + 1;
                        i5 = i6;
                    }
                }
                i6 = i;
            }
            i2++;
        }
        if (i3 == 0 && i4 == 1 && i5 == 2) {
            return zzZPL.zzZZN;
        }
        if (i4 == 0 && i5 == 1 && i3 == 2) {
            return zzZPL.zzZZM;
        }
        if (i5 == 0 && i4 == 1 && i3 == 2) {
            return zzZPL.zzZZL;
        }
        if (i3 == 0 && i5 == 1 && i4 == 2) {
            return zzZPL.zzZZK;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:247:0x03e1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean zzZ(zzZPL zzzpl, zzZPL zzzpl2, zzZPL.zzV zzv, zzZP0 zzzp0, zzZPL.zzX zzx) {
        int iZzV;
        int iZzX;
        int iZzY;
        int iZzX2;
        int iZzX3;
        char cZzjP = (char) zzzpl2.zzjP();
        int i = 0;
        switch (cZzjP) {
            case '\"':
            case '\'':
                StringBuilder sb = new StringBuilder();
                int iZzY2 = zzY(zzzpl2.getValue(), zzzpl2.getIndex(), sb);
                if (iZzY2 == -1) {
                    return false;
                }
                zzzpl2.setIndex((zzzpl2.getIndex() + iZzY2) - 1);
                String string = sb.toString();
                for (int i2 = 0; i2 < string.length(); i2++) {
                    if (string.charAt(i2) == ' ' && zzZPL.zzV.zzji()) {
                        zzzpl.zzjQ();
                    } else if (!zzzpl.zzZX(string.charAt(i2))) {
                        return false;
                    }
                }
                if ((zzx.getFlags() & 2048) != 0) {
                    if ((zzx.getFlags() & 8192) != 0 && "GMT".equals(string)) {
                        zzx.setFlags(zzx.getFlags() | 256);
                        zzx.zzX(zzZNF.zzZVR);
                    } else if ((zzx.getFlags() & 16384) != 0 && "Z".equals(string)) {
                        zzx.setFlags(zzx.getFlags() | 256);
                        zzx.zzX(zzZNF.zzZVR);
                    }
                }
            case '%':
                return zzzpl2.getIndex() < zzzpl2.getValue().length() - 1 && zzzpl2.getValue().charAt(zzzpl2.getIndex() + 1) != '%';
            case '.':
                if (!zzzpl.zzZX(cZzjP)) {
                    if (!zzzpl2.zzjR() || !zzzpl2.zzZX('F')) {
                        return false;
                    }
                    zzzpl2.getRepeatCount();
                }
            case '/':
                if (!zzzpl.zzZX(zzzp0.zzkf().charAt(0))) {
                    return false;
                }
                break;
            case ':':
                if (!zzzpl.zzZX(zzzp0.zzke().charAt(0))) {
                    return false;
                }
                break;
            case 'F':
            case 'f':
                int repeatCount = zzzpl2.getRepeatCount();
                if (repeatCount > 7) {
                    return false;
                }
                double dZzY = zzY(zzzpl, repeatCount);
                if (dZzY == -1.0d && cZzjP == 'f') {
                    return false;
                }
                if (zzx.zzjv() < 0.0d) {
                    zzx.zzZf(dZzY);
                } else if (dZzY != zzx.zzjv()) {
                    return false;
                }
                zzx.zzZf(dZzY);
            case 'H':
                int iZzX4 = zzX(zzzpl, zzzpl2.getRepeatCount() < 2 ? 1 : 2);
                if (iZzX4 == -1 || zzZh(zzx.getHour(), iZzX4) == -1) {
                    return false;
                }
                zzx.setHour(iZzX4);
            case 'K':
                if (zzzpl.zzZX('Z')) {
                    if ((zzx.getFlags() & 256) != 0 && zzx.zzjt() != zzZNF.zzZVR) {
                        return false;
                    }
                    zzx.setFlags(zzx.getFlags() | 256);
                    zzx.zzX(new zzZNF(0L));
                    zzx.setFlags(zzx.getFlags() | 512);
                } else if (zzzpl.zzZX('+') || zzzpl.zzZX('-')) {
                    zzzpl.setIndex(zzzpl.getIndex() - 1);
                    new zzZNF(0L);
                    zzZNF zzznfZzZ = zzZ(zzzpl, 3);
                    if (zzznfZzZ == null) {
                        return false;
                    }
                    if ((zzx.getFlags() & 256) != 0 && zzznfZzZ != zzx.zzjt()) {
                        return false;
                    }
                    zzx.zzX(zzznfZzZ);
                    zzx.setFlags(zzx.getFlags() | 256);
                }
            case 'M':
                int repeatCount2 = zzzpl2.getRepeatCount();
                if (repeatCount2 <= 2) {
                    iZzX = zzX(zzzpl, repeatCount2);
                    if (iZzX == -1 && (!zzZPL.zzV.zzjg() || (iZzX = zzX(zzzpl, repeatCount2)) == -1)) {
                        return false;
                    }
                } else {
                    if (repeatCount2 == 3) {
                        iZzV = zzU(zzzpl, zzzp0);
                        if (iZzV == -1) {
                            return false;
                        }
                    } else {
                        iZzV = zzV(zzzpl, zzzp0);
                        if (iZzV == -1) {
                            return false;
                        }
                    }
                    iZzX = iZzV;
                    zzx.setFlags(zzx.getFlags() | 1024);
                }
                if (zzZh(zzx.getMonth(), iZzX) == -1) {
                    return false;
                }
                zzx.setMonth(iZzX);
            case 'Z':
                if ((zzx.getFlags() & 256) != 0 && zzx.zzjt() != zzZNF.zzZVR) {
                    return false;
                }
                zzx.setFlags(zzx.getFlags() | 256);
                zzx.zzX(new zzZNF(0L));
                zzx.setFlags(zzx.getFlags() | 512);
                zzzpl.setIndex(zzzpl.getIndex() + 1);
                if (zzZ(zzzpl)) {
                    zzzpl.setIndex(zzzpl.getIndex() - 1);
                }
                return false;
            case '\\':
                if (!zzzpl2.zzjR() || !zzzpl.zzZX((char) zzzpl2.zzjP())) {
                    return false;
                }
                break;
            case 'd':
                int repeatCount3 = zzzpl2.getRepeatCount();
                if (repeatCount3 <= 2) {
                    int iZzX5 = zzX(zzzpl, repeatCount3);
                    if ((iZzX5 == -1 && (!zzZPL.zzV.zzjg() || (iZzX5 = zzX(zzzpl, repeatCount3)) == -1)) || zzZh(zzx.getDay(), iZzX5) == -1) {
                        return false;
                    }
                    i = iZzX5;
                } else {
                    if (repeatCount3 == 3) {
                        iZzY = zzT(zzzpl, zzzp0);
                        if (iZzY == -1) {
                            return false;
                        }
                    } else {
                        iZzY = zzY(zzzpl, zzzp0);
                        if (iZzY == -1) {
                            return false;
                        }
                    }
                    if (zzZh(zzZPL.zzV.zzkS(), iZzY) == -1) {
                        return false;
                    }
                }
                zzx.setDay(i);
            case 'g':
                zzzpl2.getRepeatCount();
                zzx.zzQZ(zzZ(zzzpl, zzzp0));
                if (zzx.zzju() == -1) {
                    return false;
                }
                break;
            case 'h':
                zzZPL.zzV.zzjl();
                int iZzX6 = zzX(zzzpl, zzzpl2.getRepeatCount() < 2 ? 1 : 2);
                if (iZzX6 == -1 || zzZh(zzx.getHour(), iZzX6) == -1) {
                    return false;
                }
                zzx.setHour(iZzX6);
            case 'm':
                int iZzX7 = zzX(zzzpl, zzzpl2.getRepeatCount() < 2 ? 1 : 2);
                if (iZzX7 == -1 || zzZh(zzx.getMinute(), iZzX7) == -1) {
                    return false;
                }
                zzx.setMinute(iZzX7);
            case 's':
                int iZzX8 = zzX(zzzpl, zzzpl2.getRepeatCount() < 2 ? 1 : 2);
                if (iZzX8 == -1 || zzZh(zzx.getSecond(), iZzX8) == -1) {
                    return false;
                }
                zzx.setSecond(iZzX8);
            case 't':
                if (zzzpl2.getRepeatCount() == 1) {
                    iZzX2 = zzW(zzzpl, zzzp0);
                    if (iZzX2 == -1) {
                        return false;
                    }
                } else {
                    iZzX2 = zzX(zzzpl, zzzp0);
                    if (iZzX2 == -1) {
                        return false;
                    }
                }
                if (zzZPL.zzV.zzjw() == -1) {
                    zzZPL.zzV.zzR2(iZzX2);
                } else if (zzZPL.zzV.zzjw() != iZzX2) {
                    return false;
                }
            case 'y':
                int repeatCount4 = zzzpl2.getRepeatCount();
                if (zzzp0.zziR()) {
                    iZzX3 = zzZ(zzzpl, 1, 4);
                } else {
                    if (repeatCount4 <= 2) {
                        zzZPL.zzV.zzjj();
                    }
                    iZzX3 = zzX(zzzpl, repeatCount4);
                }
                if (iZzX3 == -1 && zzZPL.zzV.zzjg()) {
                    iZzX3 = zzX(zzzpl, repeatCount4);
                }
                if (iZzX3 == -1 || zzZh(zzx.getYear(), iZzX3) == -1) {
                    return false;
                }
                zzx.zzR3(iZzX3);
            case 'z':
                int repeatCount5 = zzzpl2.getRepeatCount();
                new zzZNF(0L);
                zzZNF zzznfZzZ2 = zzZ(zzzpl, repeatCount5);
                if (zzznfZzZ2 == null) {
                    return false;
                }
                if ((zzx.getFlags() & 256) != 0 && zzznfZzZ2 != zzx.zzjt()) {
                    return false;
                }
                zzx.zzX(zzznfZzZ2);
                zzx.setFlags(zzx.getFlags() | 256);
            default:
                if (cZzjP == ' ') {
                    if (!zzZPL.zzV.zzji() && !zzzpl.zzZX(cZzjP)) {
                        if (zzZPL.zzV.zzjh() && zzzpl2.zzjR()) {
                            zzZ(zzzpl, zzzpl2, zzv, zzzp0, zzx);
                        }
                        return false;
                    }
                } else if (zzzpl2.zzVt("GMT")) {
                    zzzpl2.setIndex(zzzpl2.getIndex() + 2);
                    zzx.setFlags(zzx.getFlags() | 256);
                    zzx.zzX(zzZNF.zzZVR);
                    if (!zzzpl.zzZX("GMT".charAt(0))) {
                        return false;
                    }
                } else if (!zzzpl.zzZX(cZzjP)) {
                    return false;
                }
        }
    }

    private static void zzX(zzZPL.zzX zzx) {
        zzx.zzR3(zzZQ9.zzQO().getYear());
    }

    private static boolean zzY(zzZPL.zzX zzx) {
        long jZzkP = zzx.zzjr().zzkP() - zzx.zzjt().zzkP();
        if (jZzkP < 0) {
            jZzkP += 864000000000L;
        }
        if (jZzkP < 0 || jZzkP > 3155378975999999999L) {
            return false;
        }
        zzx.zzD(new zzZQ9(jZzkP, 1L));
        return true;
    }

    private static boolean zzY(zzZPL.zzX zzx, int i) {
        if (zzx.getYear() == -1 || zzx.getMonth() == -1 || zzx.getDay() == -1) {
            zzZQ9 zzzq9ZzQO = zzZQ9.zzQO();
            if (zzx.getMonth() == -1 && zzx.getDay() == -1) {
                if (zzx.getYear() != -1) {
                    zzx.setMonth(1);
                    zzx.setDay(1);
                } else if ((i & 8) != 0) {
                    zzx.zzR3(1);
                    zzx.setMonth(1);
                    zzx.setDay(1);
                } else {
                    zzx.zzR3(zzzq9ZzQO.getYear());
                    zzx.setMonth(zzzq9ZzQO.getMonth());
                    zzx.setDay(zzzq9ZzQO.getDay());
                }
            } else {
                if (zzx.getYear() == -1) {
                    zzx.zzR3(zzzq9ZzQO.getYear());
                }
                if (zzx.getMonth() == -1) {
                    zzx.setMonth(1);
                }
                if (zzx.getDay() == -1) {
                    zzx.setDay(1);
                }
            }
        }
        if (zzx.getHour() == -1) {
            zzx.setHour(0);
        }
        if (zzx.getMinute() == -1) {
            zzx.setMinute(0);
        }
        if (zzx.getSecond() == -1) {
            zzx.setSecond(0);
        }
        if (zzx.zzju() == -1) {
            zzx.zzQZ(0);
        }
        return true;
    }

    private static boolean zzY(zzZPL.zzX zzx, zzZPL.zzY zzy) {
        if (zzx.getMonth() == -1 || zzx.getYear() != -1) {
            return false;
        }
        zzx.zzR3(zzRa(zzy.zzR0(0)));
        zzx.setDay(1);
        return true;
    }

    private static boolean zzY(zzZP0 zzzp0, zzZPL.zzX zzx, zzZPL.zzY zzy) {
        int iZzR0 = zzy.zzR0(0);
        int iZzR02 = zzy.zzR0(1);
        zzX(zzx);
        int iZzVu = zzVu(zzzp0.zzkh());
        if (iZzVu == zzZPL.zzZZF) {
            return false;
        }
        if (iZzVu == zzZPL.zzZZH) {
            zzZ(zzx, zzx.getYear(), iZzR0, iZzR02);
            return true;
        }
        zzZ(zzx, zzx.getYear(), iZzR02, iZzR0);
        return true;
    }

    private static boolean zzY(zzZPL.zzX zzx, zzZPL.zzY zzy, zzZP0 zzzp0) {
        int iZzR0 = zzy.zzR0(0);
        int iZzR02 = zzy.zzR0(1);
        int iZzR03 = zzy.zzR0(2);
        int iZzX = zzX(zzzp0);
        if (iZzX == zzZPL.zzZZF) {
            return false;
        }
        if (iZzX == zzZPL.zzZZN) {
            zzZ(zzx, zzRa(iZzR0), iZzR02, iZzR03);
            return true;
        }
        if (iZzX == zzZPL.zzZZM) {
            zzZ(zzx, zzRa(iZzR03), iZzR0, iZzR02);
            return true;
        }
        if (iZzX == zzZPL.zzZZL) {
            zzZ(zzx, zzRa(iZzR03), iZzR02, iZzR0);
            return true;
        }
        if (iZzX != zzZPL.zzZZK) {
            return false;
        }
        zzZ(zzx, zzRa(iZzR0), iZzR03, iZzR02);
        return true;
    }

    private static boolean zzZ(zzZPL zzzpl) {
        return zzZ(zzzpl, "GMT") || zzZ(zzzpl, "Z");
    }

    private static boolean zzZ(zzZPL zzzpl, String str) {
        if (str.length() > zzzpl.getValue().length() - zzzpl.getIndex() || zzZPL.zzZ(zzzpl.getValue(), zzzpl.getIndex(), str, 0) != 0) {
            return false;
        }
        int length = str.length() + zzzpl.getIndex();
        if (length < zzzpl.getValue().length() && Character.isLetter(zzzpl.getValue().charAt(length))) {
            return false;
        }
        zzzpl.setIndex(length);
        if (zzzpl.getIndex() >= zzzpl.zzjS()) {
            return true;
        }
        zzzpl.zzZY(zzzpl.getValue().charAt(zzzpl.getIndex()));
        return true;
    }

    private static int zzZ(zzZPL zzzpl, zzZP0 zzzp0) {
        String[] eraNames;
        if (!zzzpl.zzjR() || (eraNames = zzzp0.getEraNames()) == null) {
            return -1;
        }
        for (int i = 0; i < eraNames.length; i++) {
            if (zzzpl.zzVt(zzzp0.zzQK(i))) {
                zzzpl.setIndex((r2.length() + zzzpl.getIndex()) - 1);
                return i;
            }
            if (zzzpl.zzVt(zzZP0.zzQL(i))) {
                zzzpl.setIndex((r2.length() + zzzpl.getIndex()) - 1);
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048 A[PHI: r1 r7 r8
      0x0048: PHI (r1v4 int) = (r1v3 int), (r1v5 int), (r1v5 int) binds: [B:25:0x0043, B:16:0x0030, B:13:0x0021] A[DONT_GENERATE, DONT_INLINE]
      0x0048: PHI (r7v4 int) = (r7v3 int), (r7v7 int), (r7v8 int) binds: [B:25:0x0043, B:16:0x0030, B:13:0x0021] A[DONT_GENERATE, DONT_INLINE]
      0x0048: PHI (r8v3 boolean) = (r8v2 boolean), (r8v4 boolean), (r8v4 boolean) binds: [B:25:0x0043, B:16:0x0030, B:13:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzZNF zzZ(zzZPL zzzpl, int i) {
        int iZzX;
        int iZzX2;
        boolean zZzY;
        zzZNF zzznf = zzZNF.zzZVR;
        if (i != 1 && i != 2) {
            try {
                zZzY = zzY(zzzpl);
                iZzX = zzX(zzzpl, 1);
                if (iZzX != -1) {
                    if (zzzpl.zzZX(':')) {
                        iZzX2 = zzX(zzzpl, 2);
                        if (iZzX2 != -1) {
                            if (iZzX2 >= 0) {
                                zzznf = new zzZNF(iZzX, iZzX2);
                                if (!zZzY) {
                                }
                            }
                        }
                    } else {
                        zzzpl.setIndex(zzzpl.getIndex() - 1);
                        iZzX2 = zzX(zzzpl, 2);
                        if (iZzX2 != -1) {
                        }
                    }
                }
            } catch (Exception e) {
                zzZHV.zzZ(e);
                return null;
            }
        } else {
            try {
                boolean zZzY2 = zzY(zzzpl);
                int iZzX3 = zzX(zzzpl, i);
                if (iZzX3 == -1) {
                    iZzX = iZzX3;
                    iZzX2 = 0;
                    zZzY = zZzY2;
                    if (iZzX2 >= 0 && iZzX2 < 60) {
                        zzznf = new zzZNF(iZzX, iZzX2);
                        if (!zZzY) {
                            return zzznf.zzhx();
                        }
                    }
                }
            } catch (Exception e2) {
                zzZHV.zzZ(e2);
                return null;
            }
        }
        return zzznf;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String zzZ(String str, zzZP0 zzzp0, zzZPL.zzX zzx) {
        char cCharAt = str.charAt(0);
        if (cCharAt == 'O') {
            zzZPL.zzV.zzZ(zzZPI.zzje());
            zzzp0 = zzZP0.zziQ();
        } else if (cCharAt == 'R') {
            zzZPL.zzV.zzZ(zzZPI.zzje());
            zzzp0 = zzZP0.zziQ();
            if ((zzx.getFlags() & 2048) != 0) {
                zzx.setFlags(zzx.getFlags() | 8192);
            }
        } else if (cCharAt == 'U') {
            zzZPL.zzV.zzZ(zzZPI.zzje());
            zzx.setFlags(zzx.getFlags() | 256);
            zzx.zzX(new zzZNF(0L));
            zzx.setFlags(zzx.getFlags() | 512);
            if (zzzp0.zzjs().getID() != 1) {
                zzzp0 = zzzp0.zziF();
                zzzp0.zzZ(zzZPI.zzje());
            }
        } else if (cCharAt != 'o') {
            if (cCharAt == 'u') {
                zzZPL.zzV.zzZ(zzZPI.zzje());
                zzzp0 = zzZP0.zziQ();
                if ((zzx.getFlags() & 2048) != 0) {
                    zzx.setFlags(zzx.getFlags() | 16384);
                }
            } else if (cCharAt != 'r') {
                if (cCharAt == 's') {
                    zzzp0 = zzZP0.zziQ();
                    zzZPL.zzV.zzZ(zzZPI.zzje());
                }
            }
        }
        try {
            return zzZPO.zzZ(str, zzzp0);
        } catch (Exception e) {
            zzZHV.zzZ(e);
            return null;
        }
    }

    public static zzZQ9 zzZ(String str, String[] strArr, zzZP0 zzzp0, int i) {
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str2 = strArr[i2];
            if (str2 != null && str2.length() != 0) {
                zzZQ9 zzzq9ZzZ = zzZ(str, strArr[i2], zzzp0, i);
                if (zzzq9ZzZ != zzZQ9.zz35) {
                    return zzzq9ZzZ;
                }
            } else {
                return zzZQ9.zz35;
            }
        }
        return zzZQ9.zz35;
    }

    private static boolean zzZ(zzZPL.zzX zzx, zzZPL.zzY zzy) {
        int hour = zzx.getHour();
        int iZzjw = zzy.zzjw();
        if (iZzjw != -1) {
            if (iZzjw == 0) {
                if (hour < 0 || hour > 12) {
                    return false;
                }
                if (hour == 12) {
                    hour = 0;
                }
            } else {
                if (hour < 0 || hour > 23) {
                    return false;
                }
                if (hour < 12) {
                    hour += 12;
                }
            }
        }
        zzx.setHour(hour);
        zzy.zzR2(iZzjw);
        return true;
    }

    private static boolean zzZ(zzZPL.zzX zzx, int i, boolean z) {
        if ((zzx.getFlags() & 2048) != 0) {
            return zzZ(zzx, i);
        }
        if ((zzx.getFlags() & 256) == 0) {
            if ((i & 32) != 0) {
                if ((i & 16) != 0) {
                    zzx.setFlags(zzx.getFlags() | 256);
                    zzx.zzX(zzZNG.zzC(zzx.zzjr()));
                } else {
                    zzx.zzD(zzZQ9.zzY(zzx.zzjr(), 2));
                    return true;
                }
            } else {
                if ((i & 64) == 0) {
                    return true;
                }
                if ((i & 16) != 0) {
                    zzx.zzD(zzZQ9.zzY(zzx.zzjr(), 1));
                    return true;
                }
                zzx.setFlags(zzx.getFlags() | 256);
                zzx.zzX(zzZNF.zzZVR);
            }
        }
        int i2 = i & 128;
        if (i2 != 0 && (zzx.getFlags() & 512) != 0) {
            return true;
        }
        if ((i & 16) != 0 && zzZ(zzx)) {
            return zzY(zzx);
        }
        if (i2 != 0) {
            long jZzkP = zzZNG.zzC(z ? zzZQ9.zzQO() : zzx.zzjr()).zzkP() + (zzx.zzjr().zzkP() - zzx.zzjt().zzkP());
            if (jZzkP < 0) {
                jZzkP += 864000000000L;
            }
            zzx.zzD(new zzZQ9(jZzkP, 2L));
            return true;
        }
        if (zzx.zzjt() != null && (zzx.zzjt().getHours() > 0 || zzx.zzjt().getMinutes() > 0)) {
            return zzZ(zzx, z).booleanValue();
        }
        if (i == 0) {
            return true;
        }
        return zzZ(zzx, z).booleanValue();
    }

    private static boolean zzZ(zzZPL.zzX zzx) {
        return zzx.zzjt().zzkP() != 0 || zzx.getYear() == -1 || zzx.getMonth() == -1 || zzx.getDay() == -1 || (zzx.getFlags() & 256) == 0 || (zzx.getFlags() & 512) == 0;
    }

    private static boolean zzZ(zzZPL.zzX zzx, int i) {
        if ((zzx.getFlags() & 256) == 0) {
            if ((i & 64) != 0) {
                zzx.zzX(zzZNF.zzZVR);
            } else {
                zzx.zzX(zzZNG.zzC(zzx.zzjr()));
            }
        }
        long jZzkP = zzx.zzjt().zzkP();
        long jZzkP2 = zzx.zzjr().zzkP() - jZzkP;
        if (jZzkP2 < 0 || jZzkP2 > 3155378975999999999L || jZzkP < -504000000000L || jZzkP > 504000000000L) {
            return false;
        }
        if ((i & 16) == 0) {
            return true;
        }
        if ((zzx.getFlags() & 256) == 0 && (i & 64) == 0) {
            boolean zZzY = zzY(zzx);
            zzx.zzX(zzZNF.zzZVR);
            return zZzY;
        }
        zzx.zzD(new zzZQ9(jZzkP2, 1L));
        zzx.zzX(zzZNF.zzZVR);
        return true;
    }

    private static Boolean zzZ(zzZPL.zzX zzx, boolean z) {
        long jZzkP;
        long jZzkP2 = zzx.zzjr().zzkP();
        boolean z2 = zzx.zzjt() != null && (zzx.zzjt().getHours() > 0 || zzx.zzjt().getMinutes() > 0);
        if (jZzkP2 >= 864000000000L && !z2) {
            jZzkP = jZzkP2 - zzx.zzjt().zzkP();
            if (jZzkP < 0 || jZzkP > 3155378975999999999L) {
                jZzkP += zzZNG.zzC(zzx.zzjr()).zzkP();
            }
        } else {
            jZzkP = (jZzkP2 - zzx.zzjt().zzkP()) + zzZNG.zzC(z ? zzZQ9.zzQO() : zzx.zzjr()).zzkP();
            if (jZzkP < 0) {
                jZzkP += 864000000000L;
            }
        }
        if (jZzkP >= 0 && jZzkP <= 3155378975999999999L) {
            zzx.zzD(new zzZQ9(jZzkP, 2L));
            return Boolean.TRUE;
        }
        zzx.zzD(zzZQ9.zz35);
        return Boolean.FALSE;
    }

    private static void zzZ(zzZP0 zzzp0, zzZPL.zzY zzy) {
        if (zzy.zzjw() != -1 || zzzp0.getAMDesignator() == null || zzzp0.getPMDesignator() == null) {
            return;
        }
        if (zzzp0.getAMDesignator().length() == 0 && zzzp0.getPMDesignator().length() != 0) {
            zzy.zzR2(0);
        }
        if (zzzp0.getPMDesignator().length() != 0 || zzzp0.getAMDesignator().length() == 0) {
            return;
        }
        zzy.zzR2(1);
    }

    private static zzZQ9 zzZ(zzZPL.zzY zzy, zzZPL zzzpl, int i, zzZPL.zzX zzx) {
        int i2;
        zzzpl.setIndex(zzzpl.getIndex() - 1);
        zzzpl.zzjQ();
        int iZzX = zzX(zzzpl, 2);
        if (iZzX == -1) {
            return zzZQ9.zz35;
        }
        zzzpl.zzjQ();
        if (!zzzpl.zzZX(':')) {
            return zzZQ9.zz35;
        }
        zzzpl.zzjQ();
        int iZzX2 = zzX(zzzpl, 2);
        if (iZzX2 == -1) {
            return zzZQ9.zz35;
        }
        zzzpl.zzjQ();
        double dZzW = 0.0d;
        if (zzzpl.zzZX(':')) {
            zzzpl.zzjQ();
            int iZzX3 = zzX(zzzpl, 2);
            if (iZzX3 == -1) {
                return zzZQ9.zz35;
            }
            if (zzzpl.zzZX(FilenameUtils.EXTENSION_SEPARATOR)) {
                dZzW = zzW(zzzpl);
                if (dZzW == -1.0d) {
                    return zzZQ9.zz35;
                }
                zzzpl.setIndex(zzzpl.getIndex() - 1);
            }
            zzzpl.zzjQ();
            i2 = iZzX3;
        } else {
            i2 = 0;
        }
        double d = dZzW;
        if (zzzpl.zzjR()) {
            int iZzjP = zzzpl.zzjP();
            if (iZzjP == 43 || iZzjP == 45) {
                zzx.setFlags(zzx.getFlags() | 256);
                zzZNF zzznfZzX = zzX(zzzpl);
                if (zzznfZzX == null) {
                    return zzZQ9.zz35;
                }
                zzx.zzX(zzznfZzX);
            } else if (iZzjP != 90 && iZzjP != 122) {
                zzzpl.setIndex(zzzpl.getIndex() - 1);
            } else {
                zzx.setFlags(zzx.getFlags() | 256);
                zzx.zzX(zzZNF.zzZVR);
                zzx.setFlags(zzx.getFlags() | 512);
            }
            zzzpl.zzjQ();
            if (zzzpl.zzZX('#')) {
                if (!zzV(zzzpl)) {
                    return zzZQ9.zz35;
                }
                zzzpl.zzjQ();
            }
            if (zzzpl.zzZX((char) 0) && !zzV(zzzpl)) {
                return zzZQ9.zz35;
            }
            if (zzzpl.zzjR()) {
                return zzZQ9.zz35;
            }
        }
        try {
            zzx.zzD(new zzZQ9(zzy.getYear(), zzy.zzR0(0), zzy.zzR0(1), iZzX, iZzX2, i2, 0, zzx.zzju()).zzYL(Math.round(d * 1.0E7d)));
            if (!zzZ(zzx, i, false)) {
                return zzZQ9.zz35;
            }
            return zzx.zzjr();
        } catch (Exception e) {
            zzZHV.zzZ(e);
            return zzZQ9.zz35;
        }
    }

    private static int zzZ(zzZPL zzzpl, int i, int i2) {
        int index = zzzpl.getIndex();
        int i3 = 0;
        int iZzjN = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            if (!zzzpl.zzjO()) {
                zzzpl.setIndex(zzzpl.getIndex() - 1);
                break;
            }
            iZzjN = (iZzjN * 10) + zzzpl.zzjN();
            i3++;
        }
        if (i3 >= i) {
            return iZzjN;
        }
        zzzpl.setIndex(index);
        return -1;
    }

    private static boolean zzZ(zzZPL.zzX zzx, zzZPL.zzY zzy, zzZPL.zzW zzw) {
        int iZzjp = zzw.zzjp();
        if (iZzjp != 2048) {
            if (iZzjp != 2304) {
                if (iZzjp != 2560) {
                    if (iZzjp != 2816) {
                        if (iZzjp != 3072) {
                            if (iZzjp == 3328) {
                                if ((zzx.getFlags() & 32) != 0) {
                                    return false;
                                }
                                zzx.setFlags(zzx.getFlags() | 32);
                                zzx.setSecond(zzw.zzjn());
                            }
                        } else {
                            if ((zzx.getFlags() & 16) != 0) {
                                return false;
                            }
                            zzx.setFlags(zzx.getFlags() | 16);
                            zzx.setMinute(zzw.zzjn());
                        }
                    } else {
                        if ((zzx.getFlags() & 8) != 0) {
                            return false;
                        }
                        zzx.setFlags(zzx.getFlags() | 8);
                        zzx.setHour(zzw.zzjn());
                    }
                } else {
                    if ((zzx.getFlags() & 4) != 0) {
                        return false;
                    }
                    zzx.setFlags(zzx.getFlags() | 4);
                    zzx.setDay(zzw.zzjn());
                }
            } else {
                if ((zzx.getFlags() & 2) != 0) {
                    return false;
                }
                zzx.setFlags(zzx.getFlags() | 2);
                zzx.setMonth(zzy.zzR4(zzw.zzjn()));
            }
        } else {
            if ((zzx.getFlags() & 1) != 0) {
                return false;
            }
            zzx.setFlags(zzx.getFlags() | 1);
            zzx.zzR3(zzy.zzR3(zzw.zzjn()));
        }
        return true;
    }

    private static boolean zzZ(int i, zzZPL.zzX zzx, int i2, zzZPL.zzY zzy, zzZP0 zzzp0) {
        boolean zZzY;
        switch (i) {
            case 21:
                zZzY = zzY(zzzp0, zzx, zzy);
                break;
            case 22:
                zZzY = zzY(zzx, zzy, zzzp0);
                break;
            case 23:
                zZzY = zzW(zzzp0, zzx, zzy);
                break;
            case 24:
                zZzY = zzX(zzzp0, zzx, zzy);
                break;
            case 25:
                zZzY = zzZ(zzx, zzy, zzzp0);
                break;
            case 26:
            case 37:
            default:
                zZzY = true;
                break;
            case 27:
                zZzY = zzX(zzx, zzy);
                break;
            case 28:
                zZzY = zzY(zzx, zzy);
                break;
            case 29:
                zZzY = zzZ(zzzp0, zzx, zzy);
                break;
            case 30:
                zZzY = zzV(zzzp0, zzx, zzy);
                break;
            case 31:
                zZzY = zzT(zzx, zzy);
                break;
            case 32:
                zZzY = zzU(zzx, zzy);
                break;
            case 33:
                zZzY = zzV(zzx, zzy);
                break;
            case 34:
                zZzY = zzW(zzx, zzy);
                break;
            case 35:
                zZzY = zzR(zzx, zzy);
                break;
            case 36:
                zZzY = zzS(zzx, zzy);
                break;
            case 38:
                zZzY = zzX(zzx, zzy, zzzp0);
                break;
        }
        if (i > 20) {
            zzy.zzjx();
        }
        return zZzY;
    }

    private static boolean zzZ(zzZP0 zzzp0, zzZPL.zzX zzx, zzZPL.zzY zzy) {
        int iZzX;
        if (zzy.getYear() != -1 && zzx.getDay() == -1 && zzx.getMonth() == -1) {
            zzZ(zzx, zzx.zzR3(zzRa(zzy.getYear())), zzy.zzR0(0), zzy.zzR0(1));
            return true;
        }
        if (zzy.getYear() == -1 || zzx.getDay() != -1 || zzx.getMonth() == -1 || (iZzX = zzX(zzzp0)) == zzZPL.zzZZF) {
            return false;
        }
        if (iZzX == zzZPL.zzZZN) {
            zzZ(zzx, zzRa(zzy.zzR0(0)), zzx.getMonth(), zzy.zzR0(1));
            return true;
        }
        zzZ(zzx, zzRa(zzy.zzR0(1)), zzx.getMonth(), zzy.zzR0(0));
        return true;
    }

    private static boolean zzZ(zzZPL.zzX zzx, zzZPL.zzY zzy, zzZP0 zzzp0) {
        int iZzR0 = zzy.zzR0(0);
        int iZzR02 = zzy.zzR0(1);
        int iZzX = zzX(zzzp0);
        if (iZzX == zzZPL.zzZZF) {
            return false;
        }
        if (iZzX == 1) {
            zzx.zzD(zzRa(iZzR02), zzy.getMonth(), iZzR0);
            return true;
        }
        if (iZzX == 0) {
            zzx.zzD(zzRa(iZzR0), zzy.getMonth(), iZzR02);
            return true;
        }
        if (iZzX != 2) {
            return false;
        }
        zzx.zzD(zzRa(iZzR02), zzy.getMonth(), iZzR0);
        return true;
    }

    private static boolean zzZ(zzZPL.zzX zzx, int i, int i2, int i3) {
        zzx.zzD(i, i2, i3);
        return true;
    }

    private static boolean zzZ(int i, zzZPL.zzX zzx, zzZPL.zzY zzy, zzZP0 zzzp0) {
        if (i == 24) {
            zzX(zzx);
            if (!zzzp0.zzZ(new int[]{zzx.getYear(), zzy.getMonth()}, true) || !zzW(zzx, zzy, zzzp0)) {
                return false;
            }
        } else if (i == 25) {
            zzy.zzR3(zzy.zzR0(1));
            if (!zzzp0.zzZ(new int[]{zzy.getYear(), zzy.getMonth()}, true) || !zzZ(zzx, zzy, zzzp0)) {
                return false;
            }
        } else if (i != 31) {
            switch (i) {
                case 33:
                    if (!zzzp0.zzZ(new int[]{zzy.getYear(), zzy.getMonth()}, true)) {
                        return false;
                    }
                    zzV(zzx, zzy);
                    break;
                    break;
                case 34:
                    if (!zzW(zzx, zzy)) {
                        return false;
                    }
                    break;
                case 35:
                    zzR(zzx, zzy);
                    break;
                case 36:
                    zzS(zzx, zzy);
                    break;
                default:
                    return false;
            }
        } else {
            if (!zzzp0.zzZ(new int[]{zzy.getYear(), zzy.getMonth()}, true)) {
                return false;
            }
            zzT(zzx, zzy);
        }
        if (i > 20) {
            zzy.zzjx();
        }
        return true;
    }
}
