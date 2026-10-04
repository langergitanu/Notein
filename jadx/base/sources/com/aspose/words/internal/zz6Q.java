package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import com.orion.notein.domain.models.transactions.TransactionsConstants;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParsePosition;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class zz6Q {
    static final /* synthetic */ boolean zzVr = true;
    private DecimalFormat zzlU;
    private DecimalFormat zzlV;
    private DecimalFormat zzlW;
    private DecimalFormat zzlX;
    private DecimalFormat zzlY;
    private DecimalFormat zzlZ;
    private DecimalFormat zzm0;
    private DecimalFormat zzm1;
    private DecimalFormat zzm2;
    private DecimalFormat zzm3;
    private DecimalFormat zzm4;
    private DecimalFormat[] zzm5;
    private DecimalFormat zzm6;
    private DecimalFormat zzm7;
    private DecimalFormat zzm8;
    private static final char[] zzlR = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final char[] zzlQ = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private char[] zzlT = new char[8];
    private char[] zzlS = new char[16];

    public zz6Q() {
        Locale locale = Locale.US;
        DecimalFormat decimalFormatZzT = zzZHS.zzT(locale);
        this.zzm8 = decimalFormatZzT;
        decimalFormatZzT.applyPattern("0.##################");
        DecimalFormat decimalFormatZzT2 = zzZHS.zzT(locale);
        this.zzm7 = decimalFormatZzT2;
        decimalFormatZzT2.applyPattern("0.##############E00");
        DecimalFormat decimalFormatZzT3 = zzZHS.zzT(locale);
        this.zzm6 = decimalFormatZzT3;
        decimalFormatZzT3.applyPattern("0.#E0");
        this.zzm5 = new DecimalFormat[10];
        String strOooO0Oo = "0";
        int i = 0;
        while (i < 10) {
            this.zzm5[i] = zzZHS.zzT(Locale.US);
            this.zzm5[i].applyPattern(strOooO0Oo);
            strOooO0Oo = i == 0 ? C21111o0ooOoO.OooO0Oo(strOooO0Oo, ".#") : C21111o0ooOoO.OooO0Oo(strOooO0Oo, "#");
            i++;
        }
        Locale locale2 = Locale.US;
        DecimalFormat decimalFormatZzT4 = zzZHS.zzT(locale2);
        this.zzm4 = decimalFormatZzT4;
        decimalFormatZzT4.applyPattern("0.##");
        DecimalFormat decimalFormatZzT5 = zzZHS.zzT(locale2);
        this.zzm3 = decimalFormatZzT5;
        decimalFormatZzT5.applyPattern("0.#########");
        DecimalFormat decimalFormatZzT6 = zzZHS.zzT(locale2);
        this.zzm2 = decimalFormatZzT6;
        decimalFormatZzT6.applyPattern("0E0");
        this.zzm2.setMinimumIntegerDigits(2);
        DecimalFormat decimalFormatZzT7 = zzZHS.zzT(locale2);
        this.zzm1 = decimalFormatZzT7;
        decimalFormatZzT7.applyPattern("0E0");
        this.zzm1.setMinimumIntegerDigits(11);
        DecimalFormat decimalFormatZzT8 = zzZHS.zzT(locale2);
        this.zzm0 = decimalFormatZzT8;
        decimalFormatZzT8.applyPattern("0.########");
        DecimalFormat decimalFormatZzT9 = zzZHS.zzT(locale2);
        this.zzlZ = decimalFormatZzT9;
        decimalFormatZzT9.applyPattern("0.#########");
        DecimalFormat decimalFormatZzT10 = zzZHS.zzT(locale2);
        this.zzlY = decimalFormatZzT10;
        decimalFormatZzT10.applyPattern("00");
        DecimalFormat decimalFormatZzT11 = zzZHS.zzT(locale2);
        this.zzlX = decimalFormatZzT11;
        decimalFormatZzT11.applyPattern("000");
        DecimalFormat decimalFormatZzT12 = zzZHS.zzT(locale2);
        this.zzlW = decimalFormatZzT12;
        decimalFormatZzT12.applyPattern(TransactionsConstants.API_RESULT_SUCCESS);
        DecimalFormat decimalFormatZzT13 = zzZHS.zzT(locale2);
        this.zzlV = decimalFormatZzT13;
        decimalFormatZzT13.applyPattern("00000");
        DecimalFormat decimalFormatZzT14 = zzZHS.zzT(locale2);
        this.zzlU = decimalFormatZzT14;
        decimalFormatZzT14.applyPattern("0000000000");
    }

    private static double zzW(double d, int i) {
        if (d == 0.0d || d == -0.0d) {
            return 0.0d;
        }
        if (Double.isNaN(d)) {
            return d;
        }
        double dPow = Math.pow(10.0d, i);
        return zzZx(d * dPow) / dPow;
    }

    private static double zzZ(String str, DecimalFormat decimalFormat) {
        String str2;
        if (!zzZYD.zzXk(str)) {
            return Double.NaN;
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length - 1;
        int i = 0;
        while (i < length && zzZKU.zzG(charArray[i])) {
            i++;
        }
        while (i < length && zzZKU.zzG(charArray[length])) {
            length--;
        }
        if (charArray[i] == '+') {
            i++;
        }
        if (i > length) {
            return Double.NaN;
        }
        boolean z = true;
        int i2 = 0;
        int i3 = i;
        while (i3 < length) {
            if (z && !zzp(charArray[i3])) {
                z = false;
            }
            if (charArray[i3] == 'e') {
                charArray[i3] = 'E';
                i3++;
                if (i3 < length && charArray[i3] == '+') {
                    i2 = i3;
                }
                if (z && !zzp(charArray[i3])) {
                    z = false;
                }
            }
            i3++;
        }
        int i4 = length - i;
        int i5 = i4 + 1;
        try {
            if (i2 > 0) {
                char[] cArr = new char[i4];
                int i6 = i2 - i;
                System.arraycopy(charArray, i, cArr, 0, i6);
                System.arraycopy(charArray, i2 + 1, cArr, i6, length - i2);
                str2 = new String(cArr);
            } else {
                str2 = new String(charArray, i, i5);
                i4 = i5;
            }
            ParsePosition parsePosition = new ParsePosition(0);
            Number number = decimalFormat.parse(str2, parsePosition);
            if (parsePosition.getErrorIndex() == -1 && parsePosition.getIndex() == i4) {
                double dDoubleValue = number.doubleValue();
                if (dDoubleValue == -0.0d) {
                    return 0.0d;
                }
                return dDoubleValue;
            }
            if (z) {
                return new BigDecimal(str2).doubleValue();
            }
            return Double.NaN;
        } catch (Exception unused) {
            return Double.NaN;
        }
    }

    public static double zzZj(String str) {
        double dZzZ = zzZ(str, zzZHS.zzck());
        if (Double.isNaN(dZzZ)) {
            dZzZ = zzZq(str);
        }
        if (!Double.isNaN(dZzZ)) {
            return dZzZ;
        }
        String strZzH1 = zzJB.zzH1();
        int iIndexOf = str.indexOf(strZzH1);
        if (iIndexOf == 0) {
            str = str.substring(strZzH1.length());
        } else if (iIndexOf > 0) {
            str = zzZKN.zzT(str, iIndexOf, strZzH1.length());
        }
        return zzZq(str);
    }

    public static double zzZq(String str) {
        return zzZ(str, zzZHS.zzcm());
    }

    private static double zzZw(double d) {
        if (d == 0.0d || d == -0.0d) {
            return 0.0d;
        }
        if (Double.isNaN(d)) {
            return d;
        }
        return Math.round(d * r0) / Math.pow(10.0d, 15 - ((int) Math.ceil(Math.log10(d < 0.0d ? -d : d))));
    }

    private static double zzZx(double d) {
        return Math.floor(Math.abs(d) + 0.5d) * Math.signum(d);
    }

    private static boolean zzp(char c) {
        return c == '+' || c == '-' || c == '.' || c == 'e' || c == 'E' || Character.isDigit(c);
    }

    public static DecimalFormat zzwV() {
        return zzZHS.zzck();
    }

    public final String zz3(long j) {
        return this.zzlV.format(j);
    }

    public final String zz4(long j) {
        return this.zzlW.format(j);
    }

    public final String zz5(long j) {
        return this.zzlX.format(j);
    }

    public final String zz6(long j) {
        return this.zzlY.format(j);
    }

    public final String zzG(long j, int i) {
        return zzZ(j, i, true, this.zzlS, 16);
    }

    public final String zzV(float f, int i) {
        if (!zzVr && (i < 0 || i > 9)) {
            throw new AssertionError();
        }
        if (Float.isNaN(f)) {
            return "NaN";
        }
        String str = this.zzm5[i].format(zzZw(zzW(zzZKQ.zzS(f, i), i)));
        String string = Float.toString(f);
        return str.length() <= string.length() ? str : string;
    }

    public final String zzWA(int i) {
        return this.zzlU.format(i);
    }

    public final String zzX(double d, int i) {
        if (zzVr || (i >= 0 && i <= 9)) {
            return Double.isNaN(d) ? "NaN" : this.zzm5[i].format(d);
        }
        throw new AssertionError();
    }

    public final double zzY4(String str) {
        return zzZ(str, this.zzm0);
    }

    public final String zzZT(double d) {
        if (Double.isNaN(d)) {
            return "NaN";
        }
        return this.zzm3.format(zzZw(zzW(d, 9)));
    }

    public final String zzZU(double d) {
        if (Double.isNaN(d)) {
            return "NaN";
        }
        return this.zzm4.format(zzZw(zzW(d, 2)));
    }

    public final String zzZV(double d) {
        return Double.isNaN(d) ? "NaN" : this.zzm6.format(d);
    }

    public final String zzZX(double d) {
        return Double.isNaN(d) ? "NaN" : this.zzm1.format(d).replace('E', 'e');
    }

    public final String zzZZ(double d) {
        if (Double.isNaN(d)) {
            return "NaN";
        }
        double dAbs = Math.abs(d);
        return (dAbs <= 0.0d || dAbs >= 1.0E-4d) ? this.zzm8.format(zzZw(d)) : this.zzm7.format(d);
    }

    public final double zzZs(String str) {
        return zzZ(str, this.zzm8);
    }

    public final String zzq(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        return this.zzlZ.format(zzZw(zzW(f, 9)));
    }

    public final String zzs(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        return this.zzm0.format(zzZw(zzW(f, 8)));
    }

    public final String zzZ(long j, int i, boolean z) {
        return zzZ(j, i, z, this.zzlT, 8);
    }

    private static String zzZ(long j, int i, boolean z, char[] cArr, int i2) {
        char[] cArr2 = z ? zzlR : zzlQ;
        int i3 = i2 - 1;
        int i4 = i3;
        while (i3 >= 0) {
            int i5 = (int) (15 & j);
            if (i5 != 0) {
                i4 = i3;
            }
            cArr[i3] = cArr2[i5];
            j >>= 4;
            i3--;
        }
        if (i <= 0) {
            return new String(cArr, i4, cArr.length - i4);
        }
        int iMin = Math.min(i2 - i, i4);
        return new String(cArr, iMin, cArr.length - iMin);
    }

    public static String zzZ(double d, String str, boolean z, boolean z2) {
        DecimalFormat decimalFormatZzcm = zzZHS.zzcm();
        try {
            decimalFormatZzcm.applyPattern(zzZKP.zzW(str, d));
            if (decimalFormatZzcm.getGroupingSize() == 1) {
                decimalFormatZzcm.setGroupingSize(3);
            }
            double dZzZw = zzZw(zzW(d, decimalFormatZzcm.getMaximumFractionDigits() + (z ? 2 : 0)));
            if (z2 && dZzZw < 0.0d) {
                decimalFormatZzcm.setNegativePrefix("(");
                decimalFormatZzcm.setNegativeSuffix(")");
            }
            return decimalFormatZzcm.format(dZzZw);
        } catch (Exception e) {
            return e.getMessage();
        }
    }
}
