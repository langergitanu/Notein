package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import com.aspose.words.ref.Ref;
import com.huawei.hms.network.embedded.C18241k5;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/* JADX INFO: loaded from: classes5.dex */
public class zzJB {
    static final /* synthetic */ boolean zzVr = true;
    private static zzZP0 zzzs;
    private static zzZP0 zzzt;
    private static zzZP0 zzzu;
    private static zzZP0 zzzv;
    private static final ThreadLocal<zz6Q> zzzy = new ThreadLocal<zz6Q>() { // from class: com.aspose.words.internal.zzJB.1
        @Override // java.lang.ThreadLocal
        public final /* synthetic */ zz6Q initialValue() {
            return new zz6Q();
        }
    };
    private static final ThreadLocal<zzZP0> zzzx = new ThreadLocal<>();
    private static final String[] zzzw = {"yyyy-MM-ddTHH:mm:ss.FFFFFFFzzz", "yyyy-MM-ddTHH:mm:ss.FFFFFFFK", "yyyy-MM-ddTHH:mm:ss.FFFFFFF", "yyyy-MM-ddTHH:mm:ss", "yyyy-MM-ddTHH:mm:ss%K", "yyyy-MM-dd"};

    static {
        zzZP0 zzzp0Zzjc = zzZXR.zzWZ("en-US").zzjc();
        zzzv = zzzp0Zzjc;
        zzzt = zzZ(zzzp0Zzjc);
        zzZP0 zzzp0Zzjc2 = zzZXR.zzWZ("en-NZ").zzjc();
        zzzu = zzzp0Zzjc2;
        zzzs = zzZ(zzzp0Zzjc2);
    }

    private zzJB() {
    }

    public static double parseDouble(String str) {
        double dZzZs = zzZs(str);
        if (Double.isNaN(dZzZs)) {
            return 0.0d;
        }
        return dZzZs;
    }

    public static int parseInt(String str) {
        return Integer.parseInt(str.trim());
    }

    public static String zz1(long j) {
        return zzzy.get().zzG(j, 8);
    }

    public static String zz2(long j) {
        return zzzy.get().zzG(j, 0);
    }

    public static String zz3(long j) {
        return zzzy.get().zz3(j);
    }

    public static String zz4(long j) {
        return zzzy.get().zz4(j);
    }

    public static String zz5(boolean z) {
        return z ? TelemetryEventStrings.Value.TRUE : TelemetryEventStrings.Value.FALSE;
    }

    public static String zz6(long j) {
        return zzzy.get().zz6(j);
    }

    public static String zz7(long j) {
        return Long.toString(j);
    }

    public static String zz8(long j) {
        return zzZKP.zzYu(j);
    }

    public static String zzH1() {
        return "fr-CH".equals(zzZXR.zzq0()) ? "CHF" : zzZHS.getCurrencySymbol();
    }

    public static char zzH2() {
        String strZzjZ = zzZP1.zzpZ().zzj5().zzjZ();
        if (zzZYD.zzXk(strZzjZ)) {
            return strZzjZ.charAt(0);
        }
        return ',';
    }

    public static int zzH3() {
        return zzZHS.getGroupingSize();
    }

    public static char zzH4() {
        return zzZHS.getGroupingSeparator();
    }

    public static char zzH5() {
        return zzZHS.getDecimalSeparator();
    }

    private static zzZP0 zzH6() {
        ThreadLocal<zzZP0> threadLocal = zzzx;
        return (threadLocal == null || threadLocal.get() == null) ? zzZP0.zzj3() : threadLocal.get();
    }

    public static String zzH7() {
        return zzH6().getShortTimePattern().replace("tt", "am/pm");
    }

    public static String zzH8() {
        return zzH6().getShortDatePattern();
    }

    public static String zzN(zzZQ9 zzzq9) {
        StringBuilder sb = new StringBuilder(zzzq9.zzY("ddd, d MMM yyyy HH':'mm':'ss zzzz", zzZP0.zzj3()));
        int iLastIndexOf = sb.lastIndexOf(C18241k5.f55433h);
        if (iLastIndexOf > 0) {
            sb = sb.deleteCharAt(iLastIndexOf);
        }
        return sb.toString();
    }

    public static String zzO(zzZQ9 zzzq9) {
        if (zzzq9 == null) {
            zzzq9 = zzZQ9.zz35;
        }
        return zzzq9.zzY("yyyyMMddHHmmssZ", zzZP1.zzj8());
    }

    public static String zzP(zzZQ9 zzzq9) {
        if (zzzq9 == null) {
            zzzq9 = zzZQ9.zz35;
        }
        return C21111o0ooOoO.OooO0Oo(zzzq9.zzY("yyyyMMddHHmmss", zzZP1.zzj8()), zzZKN.zzZ(zzzq9.zzY("zzz", zzZP1.zzj8()), ':', '\'') + '\'');
    }

    public static String zzQ(zzZQ9 zzzq9) {
        if (zzzq9 == null) {
            zzzq9 = zzZQ9.zz35;
        }
        return zzzq9.zzY("yyyy-MM-ddTHH:mm:ss", zzZP1.zzj8());
    }

    public static String zzR(zzZQ9 zzzq9) {
        if (zzzq9 == null) {
            zzzq9 = zzZQ9.zz35;
        }
        return zzzq9.zzY("yyyy-MM-ddTHH:mm:ssZ", zzZP1.zzj8());
    }

    public static String zzS(zzZQ9 zzzq9) {
        if (zzzq9 == null) {
            zzzq9 = zzZQ9.zz35;
        }
        return zzzq9.zzY("yyyy-MM-ddTHH:mm:sszzz", zzZP1.zzj8());
    }

    public static zzZQ9 zzV(String str, boolean z) {
        return zzZ(str, zzH6(), z);
    }

    public static String zzW(float f, int i) {
        return i < 8 ? zzzy.get().zzV(f, i) : zzzy.get().zzs(f);
    }

    public static String zzWA(int i) {
        return zzzy.get().zzWA(i);
    }

    public static String zzWB(int i) {
        String str = "D" + Integer.toString(11);
        zzZP1.zzj8();
        return zzZKP.zzM(i, str);
    }

    public static String zzWC(int i) {
        return Integer.toString(i);
    }

    public static String zzWD(int i) {
        return Integer.toString(i);
    }

    public static String zzWE(int i) {
        return Long.toString(((long) i) & 4294967295L);
    }

    public static String zzWF(int i) {
        return Integer.toString(i);
    }

    public static String zzWs(int i) {
        return zzzy.get().zzZ(i, 8, true);
    }

    public static String zzWt(int i) {
        return zzzy.get().zzZ(i, 6, true);
    }

    public static String zzWu(int i) {
        return zzzy.get().zzZ(i, 4, true);
    }

    public static String zzWv(int i) {
        return zzzy.get().zzZ(i, 2, false);
    }

    public static String zzWw(int i) {
        return zzzy.get().zzZ(i, 2, true);
    }

    public static String zzWx(int i) {
        return zzzy.get().zzZ(i, 0, false);
    }

    public static String zzWy(int i) {
        return zzzy.get().zzZ(i, 0, true);
    }

    public static String zzWz(int i) {
        return i == 0 ? "" : Integer.toString(i);
    }

    public static String zzX(double d, int i) {
        if (Double.isNaN(d)) {
            return "NaN";
        }
        if (!zzVr && (i < 0 || i > 9)) {
            throw new AssertionError();
        }
        return zzzy.get().zzX(zzZKQ.zzS(d, i), i);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzFO zzY(double d, zzFO zzfo, int i, zzFN zzfn) {
        zzFN zzfn2;
        zzFO zzfoZzEI = zzfo;
        boolean z = (i & 2) == 0;
        boolean z2 = (i & 4) != 0;
        boolean z3 = zzfoZzEI.indexOf("%") >= 0 && zzfoZzEI.indexOf("'%'") < 0;
        if (z && z3) {
            zzfoZzEI = zzfoZzEI.zzA("%", "'%'");
        }
        if (Math.abs(d) >= 1000.0d) {
            int i2 = 0;
            boolean z4 = false;
            boolean z5 = false;
            zzFM zzfmZzY = null;
            while (true) {
                if (i2 >= (zzfmZzY != null ? zzfmZzY.getLength() : zzfoZzEI.getLength())) {
                    break;
                }
                zzHG zzhgZzW9 = zzfmZzY != null ? zzfmZzY.zzW9(i2) : zzfoZzEI.zzW9(i2);
                char cZzFM = zzhgZzW9.zzFM();
                if (cZzFM == '#') {
                    if (!z4) {
                        z5 = true;
                    }
                } else if (cZzFM == '\'') {
                    z4 = !z4;
                } else if (cZzFM != ',') {
                    if (cZzFM != '0') {
                        if (cZzFM == ';') {
                            z5 = false;
                        } else if (cZzFM != 'x') {
                        }
                    }
                } else if (!z5) {
                    if (zzfmZzY == null) {
                        zzfmZzY = zzfn.zzY(zzfoZzEI);
                    }
                    zzfmZzY.zzZ(i2, '#', zzhgZzW9);
                    i2++;
                    z5 = true;
                }
                i2++;
            }
            zzfn2 = zzfn;
            if (zzfmZzY != null) {
                zzfoZzEI = zzfmZzY.zzEI();
            }
        } else {
            zzfn2 = zzfn;
        }
        zzFO zzfo2 = zzfoZzEI;
        if (z2) {
            return zzfn2.zzEJ().zzZ(zz6Q.zzZ(d, zzfo2.zzEL(), z3, false), (zzHG) null).zzEI();
        }
        return zz7G.zzZ(zzfo2, d, zzZNG.zzpZ(), i, zzfn2);
    }

    private static zzZP0 zzZ(zzZP0 zzzp0) {
        zzZP0 zzzp0ZziF = zzzp0.zziF();
        zzzp0ZziF.zzjs().zzki();
        return zzzp0ZziF;
    }

    public static boolean zzZ7(String str) {
        if (str == null) {
            return false;
        }
        int i = 0;
        while (i < str.length() && zzZKU.zzG(str.charAt(i))) {
            i++;
        }
        int length = str.length() - 1;
        while (length > i && zzZKU.zzG(str.charAt(length))) {
            length--;
        }
        if (length < i) {
            return false;
        }
        char cCharAt = str.charAt(i);
        if (cCharAt == '-' || cCharAt == '+') {
            if (i == length) {
                return false;
            }
            i++;
        }
        long j = 0;
        while (i <= length) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < '0' || cCharAt2 > '9') {
                return false;
            }
            j = (j * 10) + ((long) (cCharAt2 - '0'));
            if (cCharAt == '-') {
                if ((-j) < -2147483648L) {
                    return false;
                }
            } else if (j > 2147483647L) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static int zzZ8(String str) {
        return zzAN.zzZB(parseDouble(str)) & 65535;
    }

    public static String zzZ9(String str) {
        String strZzq0 = zzZXR.zzq0();
        return "fr-CH".equals(strZzq0) ? zzO(zzO(str, "SFr."), "fr.").replace("'", "") : ("ru-RU".equals(strZzq0) && str.contains("р.")) ? str.replace("р.", "руб.") : str;
    }

    public static String zzZT(double d) {
        if (Double.isNaN(d)) {
            return "NaN";
        }
        return zzzy.get().zzZT(zzZKQ.zzS(d, 9));
    }

    public static String zzZU(double d) {
        if (Double.isNaN(d)) {
            return "NaN";
        }
        return zzzy.get().zzZU(zzZKQ.zzS(d, 2));
    }

    public static String zzZV(double d) {
        return Double.isNaN(d) ? "NaN" : zzzy.get().zzZV(d);
    }

    public static String zzZW(double d) {
        if (Double.isNaN(d)) {
            return "NaN";
        }
        try {
            return zzZKP.zzY(d, "R", zzZNG.zzpZ());
        } catch (NumberFormatException unused) {
            return zzZKP.zzY(d, "R", zzZP1.zzj8());
        }
    }

    public static String zzZX(double d) {
        return Double.isNaN(d) ? "NaN" : zzzy.get().zzZX(d);
    }

    public static String zzZY(double d) {
        return Double.isNaN(d) ? "NaN" : zzZKP.zzZ(d, zzZNG.zzpZ());
    }

    public static String zzZZ(double d) {
        return Double.isNaN(d) ? "NaN" : zzzy.get().zzZZ(d);
    }

    public static boolean zzZa(String str) {
        if (str == null) {
            return false;
        }
        if (zzZYD.zzi(TelemetryEventStrings.Value.TRUE, str) || zzZYD.zzi(TelemetryEventStrings.Value.FALSE, str)) {
            return true;
        }
        String strZzS = zzZKN.zzS(zzZKN.zzTX(str), (char) 0);
        return zzZYD.zzi(TelemetryEventStrings.Value.TRUE, strZzS) || zzZYD.zzi(TelemetryEventStrings.Value.FALSE, strZzS);
    }

    public static boolean zzZb(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Cannot parse a string into boolean.");
        }
        if (zzZYD.zzi(TelemetryEventStrings.Value.TRUE, str)) {
            return true;
        }
        if (zzZYD.zzi(TelemetryEventStrings.Value.FALSE, str)) {
            return false;
        }
        String strZzS = zzZKN.zzS(zzZKN.zzTX(str), (char) 0);
        if (zzZYD.zzi(TelemetryEventStrings.Value.TRUE, strZzS)) {
            return true;
        }
        if (zzZYD.zzi(TelemetryEventStrings.Value.FALSE, strZzS)) {
            return false;
        }
        throw new IllegalArgumentException("Cannot parse a string into boolean.");
    }

    public static int zzZc(String str) {
        if (!zzZYD.zzXk(str)) {
            return Integer.MIN_VALUE;
        }
        try {
            return zzZe(str);
        } catch (Exception unused) {
            return Integer.MIN_VALUE;
        }
    }

    public static long zzZd(String str) {
        long jZzm = 0;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ') {
                if (!zzZYD.isHexDigit(cCharAt)) {
                    throw new IllegalStateException("Invalid hex string.");
                }
                jZzm = (jZzm << 4) | ((long) zzZYD.zzm(cCharAt));
            }
        }
        return jZzm;
    }

    public static int zzZe(String str) {
        if (str == null || "".equals(str)) {
            throw new NumberFormatException("Empty hex string.");
        }
        int iZzm = 0;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ') {
                if (!zzZYD.isHexDigit(cCharAt)) {
                    throw new NumberFormatException("Invalid hex string.");
                }
                iZzm = (iZzm << 4) | zzZYD.zzm(cCharAt);
            }
        }
        return iZzm;
    }

    public static long zzZf(String str) {
        return Long.parseLong(str.trim());
    }

    public static zzZQ9 zzZg(String str) {
        return zzV(str, false);
    }

    public static zzZQ9 zzZh(String str) {
        return zzZ(str, true, false);
    }

    public static zzZQ9 zzZi(String str) {
        return zzZ(str, false, true);
    }

    public static double zzZj(String str) {
        zzzy.get();
        return zz6Q.zzZj(str);
    }

    public static int zzZk(String str) {
        int iZzZo = Integer.MIN_VALUE;
        while (str.length() > 0 && (iZzZo = zzZo(str)) == Integer.MIN_VALUE) {
            str = androidx.core.content.OooO0OO.OooO00o(1, 0, str);
        }
        return iZzZo;
    }

    public static long zzZl(String str) {
        try {
            String strTrim = str.trim();
            if (strTrim.endsWith(".0")) {
                strTrim = strTrim.substring(0, strTrim.length() - 2);
            }
            return Long.parseLong(strTrim);
        } catch (Exception unused) {
            return Long.MIN_VALUE;
        }
    }

    private static int zzZm(String str) {
        try {
            String strTrim = str.trim();
            if (strTrim.endsWith(".0")) {
                strTrim = strTrim.substring(0, strTrim.length() - 2);
            }
            return (int) Long.parseLong(strTrim);
        } catch (Exception unused) {
            return Integer.MIN_VALUE;
        }
    }

    public static zz7I zzZn(String str) {
        try {
            String strTrim = str.trim();
            if (strTrim.charAt(0) == '+') {
                strTrim = strTrim.substring(1);
            }
            return new zz7I(Integer.parseInt(strTrim));
        } catch (Exception unused) {
            return zz7I.zznT;
        }
    }

    public static int zzZo(String str) {
        return zzZn(str).zzUz(Integer.MIN_VALUE);
    }

    public static boolean zzZp(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static double zzZq(String str) {
        zzzy.get();
        return zz6Q.zzZq(str);
    }

    public static float zzZr(String str) {
        return (float) zzzy.get().zzY4(str);
    }

    public static double zzZs(String str) {
        return zzzy.get().zzZs(str);
    }

    public static int zzZt(String str) {
        return zzZm(str);
    }

    public static int zzZu(String str) {
        return zzAN.zzZF(parseDouble(str));
    }

    public static int zzZv(String str) {
        return zzAN.zzZB(parseDouble(str));
    }

    public static zzZQ9 zzZw(String str) {
        Ref ref = new Ref(null);
        zzZQ9.zzZ(str, zzzw, zzZP1.zzj8(), 48, ref);
        return (zzZQ9) ref.get();
    }

    public static zzZQ9 zzZx(String str) {
        return zzZ(str, zzZP1.zzj8());
    }

    public static zzZQ9 zzZy(String str) {
        return zzZ(str, (zzZPC) zzZP1.zzj8(), false);
    }

    public static String zze(int i, int i2) {
        String strZzZI = i2 > 0 ? zzZKN.zzZI("X", Integer.toString(i2)) : "X";
        zzZP1.zzj8();
        return zzZKP.zzM(i, strZzZI);
    }

    public static String zzp(float f) {
        return zzV(f, 5);
    }

    public static String zzq(float f) {
        return zzV(f, 9);
    }

    public static String zzr(float f) {
        return zzzy.get().zzq(f);
    }

    public static String zzs(float f) {
        return zzV(f, 8);
    }

    public static String zzt(float f) {
        return zzzy.get().zzs(f);
    }

    public static String zz5(long j) {
        return zzzy.get().zz5(j);
    }

    public static String zzV(float f, int i) {
        return zzzy.get().zzV(f, i);
    }

    private static String zzO(String str, String str2) {
        return str.indexOf(str2) >= 0 ? zzZKN.format("{0} {1}", str.replace(str2, "").replace(" ", ""), "CHF") : str;
    }

    private static zzZP0 zzW(zzZP1 zzzp1) {
        if (zzzp1 != null) {
            return zzzp1.zzjc();
        }
        return zzH6();
    }

    private static zzZQ9 zzZ(String str, boolean z, boolean z2) {
        zzZP0 zzzp0ZzH6 = zzH6();
        if (z2) {
            zzzp0ZzH6 = zzZ(zzzp0ZzH6);
        }
        zzZP0[] zzzp0Arr = {zzzp0ZzH6, z2 ? zzzt : zzzv, z2 ? zzzs : zzzu};
        for (int i = 0; i < 3; i++) {
            zzZQ9 zzzq9ZzZ = zzZ(str, zzzp0Arr[i], z);
            if (!zzZQ9.zzZ(zzzq9ZzZ, zzZQ9.zz35)) {
                return zzzq9ZzZ;
            }
        }
        return zzZQ9.zz35;
    }

    public static String zzX(zzZP1 zzzp1) {
        return zzW(zzzp1).zzke();
    }

    public static String zzX(double d, String str) {
        return zzZKP.zzY(d, str, zzZP1.zzpZ());
    }

    private static zzZQ9 zzZ(String str, zzZPC zzzpc, boolean z) {
        return zzZQ9.zzZ(str, zzzpc, z ? 128 : 16);
    }

    private static zzZQ9 zzZ(String str, zzZPC zzzpc) {
        zzZQ9 zzzq9ZzZ = zzZQ9.zzZ(str, zzzpc, 0);
        return zzzq9ZzZ != null ? zzzq9ZzZ : zzZQ9.zz35;
    }

    public static String zzZ(double d, boolean z, boolean z2, int i, boolean z3) {
        if (i > 15) {
            i = 15;
        }
        if (z) {
            DecimalFormat decimalFormatZzwV = zz6Q.zzwV();
            if (i > 0) {
                decimalFormatZzwV.setMinimumFractionDigits(i);
                decimalFormatZzwV.setMaximumFractionDigits(i);
            } else {
                decimalFormatZzwV.setMinimumFractionDigits(2);
            }
            if (!z2) {
                decimalFormatZzwV.setGroupingUsed(false);
            }
            String str = "(" + decimalFormatZzwV.getCurrency().getSymbol(zzZNG.zzpZ().getLocale());
            if (z3 && d < 0.0d) {
                decimalFormatZzwV.setNegativePrefix(str);
                decimalFormatZzwV.setNegativeSuffix(")");
            }
            return zzZ9(decimalFormatZzwV.format(d));
        }
        StringBuilder sb = new StringBuilder(z2 ? "#,##0" : "0");
        if (i > 0) {
            sb.append(".");
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == 0 && ((int) d) == 0) {
                sb.append("0");
            } else {
                sb.append("#");
            }
        }
        return zz6Q.zzZ(d, sb.toString(), false, z3);
    }

    public static String zzY(zzZP1 zzzp1) {
        return zzW(zzzp1).getLongTimePattern();
    }

    public static String zzZ(double d, String str, int i) {
        return zzZ(d, zzZXQ.zzWW(str), i, zzZXP.zzb6).zzEL();
    }

    public static zzFO zzZ(double d, zzFO zzfo, int i, zzFN zzfn) {
        if ((i & 8) == 0) {
            zzfo = zzZ(zzfo, zzfn);
        }
        return zzY(d, zzfo, i, zzfn);
    }

    private static zzFO zzZ(zzFO zzfo, zzFN zzfn) {
        if (zzfn.zzZ(zzfo)) {
            return zzfn.zzEK();
        }
        DecimalFormatSymbols decimalFormatSymbols = zzZHS.getDecimalFormatSymbols();
        zzFM zzfmZzEJ = zzfn.zzEJ();
        for (int i = 0; i < zzfo.getLength(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(decimalFormatSymbols.getDecimalSeparator());
            if (zzZ(zzfo, i, sb.toString())) {
                zzfmZzEJ.zzZ(FilenameUtils.EXTENSION_SEPARATOR, zzfo.zzW9(i));
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(zzZHS.getGroupingSeparator());
                if (zzZ(zzfo, i, sb2.toString())) {
                    zzfmZzEJ.zzZ(',', zzfo.zzW9(i));
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(decimalFormatSymbols.getPercent());
                    if (zzZ(zzfo, i, sb3.toString())) {
                        zzfmZzEJ.zzZ('%', zzfo.zzW9(i));
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(decimalFormatSymbols.getPerMill());
                        if (zzZ(zzfo, i, sb4.toString())) {
                            zzfmZzEJ.zzZ((char) 8240, zzfo.zzW9(i));
                        } else {
                            zzfmZzEJ.zzZ(zzfo.zzW9(i));
                        }
                    }
                }
            }
        }
        int i2 = 0;
        for (int i3 = 0; i3 < zzfmZzEJ.getLength(); i3++) {
            if (zzfmZzEJ.zzW9(i3).zzFM() == '\'' && (i3 == 0 || zzfmZzEJ.zzW9(i3 - 1).zzFM() != '\\')) {
                i2++;
            }
        }
        if (i2 % 2 == 1) {
            zzfmZzEJ.zzz("#'##", "#,##");
        }
        return zzfmZzEJ.zzEI();
    }

    private static boolean zzZ(zzFO zzfo, int i, String str) {
        return zzZKN.zzY(zzfo.zzEL(), i, str, str.length()) == 0;
    }

    public static String zzZ(zzZP1 zzzp1) {
        return zzW(zzzp1).getShortDatePattern();
    }

    public static String zzZ(double d, String str, zzZP1 zzzp1) {
        return zzZKP.zzY(d, str, zzzp1);
    }
}
