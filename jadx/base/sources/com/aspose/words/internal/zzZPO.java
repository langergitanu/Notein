package com.aspose.words.internal;

import com.huawei.hms.network.embedded.C18241k5;
import java.text.DecimalFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZPO {
    private static char[] zz0h = {'d', 'D', 'f', 'F', 'g', 'G', 'm', 'M', 'o', 'O', 'r', 'R', 's', 't', 'T', 'u', 'U', 'y', 'Y'};
    private static final zzZNF zz0g = null;
    private static final ThreadLocal<DecimalFormat[]> zz0f = new ThreadLocal<DecimalFormat[]>() { // from class: com.aspose.words.internal.zzZPO.1
        private static DecimalFormat[] zzjT() {
            DecimalFormat[] decimalFormatArr = new DecimalFormat[8];
            for (int i = 0; i < 8; i++) {
                DecimalFormat decimalFormatZzQ = zzZHS.zzQ(Locale.US);
                decimalFormatArr[i] = decimalFormatZzQ;
                decimalFormatZzQ.setMaximumIntegerDigits(i);
                decimalFormatArr[i].setMinimumIntegerDigits(i);
                decimalFormatArr[i].setDecimalSeparatorAlwaysShown(false);
                decimalFormatArr[i].setGroupingUsed(false);
            }
            return decimalFormatArr;
        }

        @Override // java.lang.ThreadLocal
        public final /* synthetic */ DecimalFormat[] initialValue() {
            return zzjT();
        }
    };

    private static String zzF(long j, int i) {
        return zz0f.get()[i].format(j);
    }

    private static void zzY(StringBuilder sb, int i) {
        sb.append(zzZPF.toString(i));
    }

    private static int zzZ(String str, int i, char c) {
        int length = str.length();
        int i2 = i + 1;
        while (i2 < length && str.charAt(i2) == c) {
            i2++;
        }
        return i2 - i;
    }

    private static String zzZi(int i, int i2) {
        return zz0f.get()[i2].format(i);
    }

    private static int zzy(String str, int i) {
        if (i >= str.length() - 1) {
            return -1;
        }
        return str.charAt(i + 1);
    }

    private static String zzY(int i, int i2, zzZP0 zzzp0) {
        return i2 == 3 ? zzzp0.zzQN(i) : zzzp0.zzQM(i);
    }

    private static String zzZ(int i, int i2, zzZP0 zzzp0) {
        if (i2 == 3) {
            return zzzp0.zzQJ(i);
        }
        return zzzp0.zzQI(i);
    }

    private static String zzY(zzZQ9 zzzq9, String str, zzZP0 zzzp0, zzZNF zzznf) throws Exception {
        boolean z;
        int id;
        if (str == null || str.length() == 0) {
            if (zzzq9.zzkP() >= 864000000000L || !((id = zzzp0.zzjs().getID()) == 3 || id == 4 || id == 6 || id == 8 || id == 13 || id == 23)) {
                z = false;
            } else {
                zzzp0 = zzZP0.zziQ();
                z = true;
            }
            if (zzznf == zz0g) {
                str = z ? "s" : "G";
            } else {
                str = z ? "yyyy'-'MM'-'ddTHH':'mm':'ss zzz" : zzzp0.zziP();
            }
        }
        if (str.length() == 1) {
            str = zzZ(str, zzzq9, zzzp0, zzznf);
        }
        return zzZ(zzzq9, str, zzzp0, zzznf);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        if (r6 == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        return r1 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        throw new java.lang.Exception(OoooooO.C21421OooO0oO.OooO00o("Format_BadQuote=", r2));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int zzZ(String str, int i, StringBuilder sb) throws Exception {
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
            } else if (i3 < length) {
                i2 += 2;
                sb.append(str.charAt(i3));
            } else {
                throw new Exception("Format_InvalidString");
            }
        }
    }

    public static String zzZ(String str, zzZP0 zzzp0) throws Exception {
        if (zzzp0 == null) {
            zzzp0 = zzZP0.zziQ();
        }
        char cCharAt = str.charAt(0);
        if (cCharAt != 'D') {
            if (cCharAt != 'M') {
                if (cCharAt != 'O') {
                    if (cCharAt != 'R') {
                        if (cCharAt != 'Y') {
                            if (cCharAt == 'd') {
                                return zzzp0.getShortDatePattern();
                            }
                            if (cCharAt != 'm') {
                                if (cCharAt == 'o') {
                                    return "yyyy'-'MM'-'dd'T'HH':'mm':'ss.fffffffK";
                                }
                                if (cCharAt != 'y') {
                                    if (cCharAt == 'F') {
                                        return zzzp0.zzkd();
                                    }
                                    if (cCharAt == 'G') {
                                        return zzzp0.zziS();
                                    }
                                    if (cCharAt == 'T') {
                                        return zzzp0.getLongTimePattern();
                                    }
                                    if (cCharAt == 'U') {
                                        return zzzp0.zzkd();
                                    }
                                    if (cCharAt == 'f') {
                                        return zzzp0.getLongDatePattern() + " " + zzzp0.getShortTimePattern();
                                    }
                                    if (cCharAt != 'g') {
                                        switch (cCharAt) {
                                            case 'r':
                                                break;
                                            case 's':
                                                return zzzp0.zzkb();
                                            case 't':
                                                return zzzp0.getShortTimePattern();
                                            case 'u':
                                                return zzzp0.zzka();
                                            default:
                                                throw new Exception("Format_InvalidString");
                                        }
                                    } else {
                                        return zzzp0.zziT();
                                    }
                                }
                            }
                        }
                        return zzzp0.zzkg();
                    }
                    return zzzp0.zziU();
                }
                return "yyyy'-'MM'-'dd'T'HH':'mm':'ss.fffffffK";
            }
            return zzzp0.zzkh();
        }
        return zzzp0.getLongDatePattern();
    }

    private static void zzZ(StringBuilder sb, int i, int i2) {
        if (i2 > 2) {
            i2 = 2;
        }
        int i3 = 16;
        char[] cArr = new char[16];
        do {
            i3--;
            cArr[i3] = (char) ((i % 10) + 48);
            i /= 10;
            if (i == 0) {
                break;
            }
        } while (i3 > 0);
        int i4 = 16 - i3;
        while (i4 < i2 && i3 > 0) {
            i3--;
            cArr[i3] = '0';
            i4++;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            sb.append(cArr[i3 + i5]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    private static String zzZ(zzZQ9 zzzq9, String str, zzZP0 zzzp0, zzZNF zzznf) throws Exception {
        int iZzZ;
        zzZPU zzzpuZzjs = zzzp0.zzjs();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 1;
        boolean z = zzzpuZzjs.getID() == 8;
        int i3 = 0;
        boolean z2 = 1;
        while (i3 < str.length()) {
            char cCharAt = str.charAt(i3);
            switch (cCharAt) {
                case '\"':
                case '\'':
                    StringBuilder sb2 = new StringBuilder();
                    iZzZ = zzZ(str, i3, sb2);
                    sb.append((CharSequence) sb2);
                    i3 += iZzZ;
                    i = 0;
                    z2 = z2;
                    break;
                case '%':
                    int iZzy = zzy(str, i3);
                    if (iZzy >= 0 && iZzy != 37) {
                        sb.append(zzZ(zzzq9, String.valueOf((char) iZzy), zzzp0, zzznf));
                        i3 += iZzZ;
                        i = 0;
                        z2 = z2;
                    } else {
                        throw new Exception("Format_InvalidString");
                    }
                    break;
                case '/':
                    sb.append(zzzp0.zzkf());
                    iZzZ = i2;
                    i3 += iZzZ;
                    i = 0;
                    z2 = z2;
                    break;
                case ':':
                    sb.append(zzzp0.zzke());
                    iZzZ = i2;
                    i3 += iZzZ;
                    i = 0;
                    z2 = z2;
                    break;
                case 'F':
                case 'f':
                    iZzZ = zzZ(str, i3, cCharAt);
                    if (iZzZ <= 7) {
                        int i4 = i2;
                        long jZzkP = (zzzq9.zzkP() % 10000000) / ((long) Math.pow(10.0d, 7 - iZzZ));
                        if (cCharAt != 'f') {
                            int i5 = iZzZ;
                            while (i5 > 0 && jZzkP % 10 == 0) {
                                jZzkP /= 10;
                                i5--;
                            }
                            if (i5 > 0) {
                                sb.append(zzF(jZzkP, i5));
                            } else {
                                if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '.') {
                                    i2 = i4;
                                    sb.delete(sb.length() - 1, i2);
                                }
                                i3 += iZzZ;
                                i = 0;
                                z2 = z2;
                            }
                        } else {
                            sb.append(zzF(jZzkP, iZzZ));
                        }
                        i2 = i4;
                        i3 += iZzZ;
                        i = 0;
                        z2 = z2;
                    } else {
                        throw new Exception("Format_InvalidString");
                    }
                    break;
                case 'H':
                    iZzZ = zzZ(str, i3, cCharAt);
                    zzZ(sb, zzzq9.getHour(), iZzZ);
                    i3 += iZzZ;
                    i = 0;
                    z2 = z2;
                    break;
                case 'K':
                    zzZ(zzzq9, zzznf, sb);
                    iZzZ = i2;
                    i3 += iZzZ;
                    i = 0;
                    z2 = z2;
                    break;
                case 'M':
                    iZzZ = zzZ(str, i3, cCharAt);
                    int iZzF = zzzpuZzjs.zzF(zzzq9);
                    if (iZzZ <= 2) {
                        if (z) {
                            zzY(sb, iZzF);
                        } else {
                            zzZ(sb, iZzF, iZzZ);
                        }
                    } else if (z) {
                        sb.append(zzZ(zzzq9, iZzF, iZzZ, zzzp0));
                    } else if ((zzzp0.zziG() & i2) != 0 && iZzZ >= 4) {
                        sb.append(zzzp0.zzQM(iZzF));
                    } else {
                        sb.append(zzY(iZzF, iZzZ, zzzp0));
                    }
                    iZzZ = iZzZ;
                    z2 = i;
                    i3 += iZzZ;
                    i = 0;
                    z2 = z2;
                    break;
                case '\\':
                    int iZzy2 = zzy(str, i3);
                    if (iZzy2 >= 0) {
                        sb.append((char) iZzy2);
                        i3 += iZzZ;
                        i = 0;
                        z2 = z2;
                    } else {
                        throw new Exception("Format_InvalidString");
                    }
                    break;
                case 'd':
                    iZzZ = zzZ(str, i3, cCharAt);
                    if (iZzZ <= 2) {
                        int iZzI = zzzpuZzjs.zzI(zzzq9);
                        if (z) {
                            zzY(sb, iZzI);
                        } else {
                            zzZ(sb, iZzI, iZzZ);
                        }
                    } else {
                        sb.append(zzZ(zzzpuZzjs.zzH(zzzq9), iZzZ, zzzp0));
                    }
                    iZzZ = iZzZ;
                    z2 = i;
                    i3 += iZzZ;
                    i = 0;
                    z2 = z2;
                    break;
                case 'g':
                    iZzZ = zzZ(str, i3, cCharAt);
                    sb.append(zzzp0.zzQK(zzzpuZzjs.zzG(zzzq9)));
                    i3 += iZzZ;
                    i = 0;
                    z2 = z2;
                    break;
                case 'h':
                    iZzZ = zzZ(str, i3, cCharAt);
                    int hour = zzzq9.getHour() % 12;
                    zzZ(sb, hour != 0 ? hour : 12, iZzZ);
                    i3 += iZzZ;
                    i = 0;
                    z2 = z2;
                    break;
                case 'm':
                    iZzZ = zzZ(str, i3, cCharAt);
                    zzZ(sb, zzzq9.getMinute(), iZzZ);
                    i3 += iZzZ;
                    i = 0;
                    z2 = z2;
                    break;
                case 's':
                    iZzZ = zzZ(str, i3, cCharAt);
                    zzZ(sb, zzzq9.getSecond(), iZzZ);
                    i3 += iZzZ;
                    i = 0;
                    z2 = z2;
                    break;
                case 't':
                    iZzZ = zzZ(str, i3, cCharAt);
                    if (iZzZ == i2) {
                        if (zzzq9.getHour() < 12) {
                            if (zzzp0.getAMDesignator().length() > 0) {
                                sb.append(zzzp0.getAMDesignator().charAt(i));
                            }
                        } else if (zzzp0.getPMDesignator().length() > 0) {
                            sb.append(zzzp0.getPMDesignator().charAt(i));
                        }
                    } else {
                        sb.append(zzzq9.getHour() < 12 ? zzzp0.getAMDesignator() : zzzp0.getPMDesignator());
                    }
                    i3 += iZzZ;
                    i = 0;
                    z2 = z2;
                    break;
                case 'y':
                    int iZzE = zzzpuZzjs.zzE(zzzq9);
                    int iZzZ2 = zzZ(str, i3, cCharAt);
                    if (zzzp0.zziR()) {
                        zzZ(sb, iZzE, iZzZ2 <= 2 ? iZzZ2 : 2);
                    } else if (z) {
                        zzY(sb, iZzE);
                    } else if (iZzZ2 <= 2) {
                        zzZ(sb, iZzE % 100, iZzZ2);
                    } else {
                        sb.append(zzZi(iZzE, 4));
                    }
                    z2 = i;
                    iZzZ = iZzZ2;
                    i3 += iZzZ;
                    i = 0;
                    z2 = z2;
                    break;
                case 'z':
                    iZzZ = zzZ(str, i3, cCharAt);
                    zzZ(zzzq9, zzznf, iZzZ, z2, sb);
                    i3 += iZzZ;
                    i = 0;
                    z2 = z2;
                    break;
                default:
                    sb.append(cCharAt);
                    iZzZ = i2;
                    i3 += iZzZ;
                    i = 0;
                    z2 = z2;
                    break;
            }
        }
        return sb.toString();
    }

    private static String zzZ(zzZQ9 zzzq9, int i, int i2, zzZP0 zzzp0) {
        if (zzzp0.zzjs().zzZl(zzzp0.zzjs().zzE(zzzq9), 0)) {
            return zzzp0.zzQM(i);
        }
        if (i >= 7) {
            i++;
        }
        if (i2 == 3) {
            return zzzp0.zzQN(i);
        }
        return zzzp0.zzQM(i);
    }

    private static void zzZ(zzZQ9 zzzq9, zzZNF zzznf, int i, boolean z, StringBuilder sb) {
        if (zzznf == zz0g) {
            if (z && zzzq9.zzkP() < 864000000000L) {
                zzznf = new zzZNF(zzZQ9.zzQO().zzkJ());
            } else if (zzzq9.zzkR() == 1) {
                zzZQ9.zzY(zzzq9, 2);
                zzznf = zzZNF.zzZVR;
            } else {
                zzznf = new zzZNF(zzzq9.zzkJ());
            }
        }
        if (zzznf.getHours() < 0 && zzznf.getMinutes() < 0) {
            sb.append('-');
            zzznf = zzznf.zzhx();
        } else {
            sb.append('+');
        }
        if (i <= 1) {
            sb.append(zzZi(zzznf.getHours(), 1));
            return;
        }
        sb.append(zzZi(zzznf.getHours(), 2));
        if (i >= 3) {
            sb.append(C18241k5.f55433h + zzZi(zzznf.getMinutes(), 2));
        }
    }

    private static void zzZ(zzZQ9 zzzq9, zzZNF zzznf, StringBuilder sb) {
        if (zzznf.getHours() == 0 || zzznf.getMinutes() == 0) {
            int iZzkR = (int) zzzq9.zzkR();
            if (iZzkR == 1) {
                sb.append("Z");
                return;
            } else if (iZzkR != 2) {
                return;
            } else {
                zzznf = new zzZNF(zzzq9.zzkJ());
            }
        }
        if (zzznf.getHours() <= 0 && zzznf.getMinutes() <= 0) {
            sb.append('-');
            zzznf = zzznf.zzhx();
        } else {
            sb.append('+');
        }
        sb.append(zzZi(zzznf.getHours(), 2));
        sb.append(C18241k5.f55433h);
        sb.append(zzZi(zzznf.getMinutes(), 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String zzZ(String str, zzZQ9 zzzq9, zzZP0 zzzp0, zzZNF zzznf) throws Exception {
        char cCharAt = str.charAt(0);
        if (cCharAt == 'O') {
            zzzp0 = zzZP0.zziQ();
        } else if (cCharAt == 'R') {
            if (zzznf != zz0g) {
                zzzq9.zzY(zzznf);
            } else {
                zzzq9.zzkR();
            }
            zzzp0 = zzZP0.zziQ();
        } else if (cCharAt != 'U') {
            if (cCharAt != 'o') {
                if (cCharAt == 'u') {
                    if (zzznf != zz0g) {
                        zzzq9.zzY(zzznf);
                    } else {
                        zzzq9.zzkR();
                    }
                    zzzp0 = zzZP0.zziQ();
                } else if (cCharAt != 'r') {
                    if (cCharAt == 's') {
                        zzzp0 = zzZP0.zziQ();
                    }
                }
            }
        } else if (zzznf == zz0g) {
            if (zzzp0.zzjs().zzkn() != 1) {
                zzzp0 = zzzp0.zziF();
                zzzp0.zzZ(zzZPI.zzje());
            }
            zzzq9.zzkF();
        } else {
            throw new Exception("Format_InvalidString");
        }
        return zzZ(str, zzzp0);
    }

    public static String zzZ(zzZQ9 zzzq9, String str, zzZP0 zzzp0) {
        try {
            return zzY(zzzq9, str, zzzp0, zz0g);
        } catch (Exception e) {
            zzZHV.zzZ(e);
            return "DateTime error";
        }
    }
}
