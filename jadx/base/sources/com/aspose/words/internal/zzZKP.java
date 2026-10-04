package com.aspose.words.internal;

import androidx.core.location.LocationRequestCompat;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class zzZKP {
    static final /* synthetic */ boolean zzVr = true;
    private static Map<Character, Object> zzZPq = new HashMap<Character, Object>() { // from class: com.aspose.words.internal.zzZKP.1
        {
            put('C', new Object() { // from class: com.aspose.words.internal.zzZKP.1.1
            });
            put('E', new Object() { // from class: com.aspose.words.internal.zzZKP.1.2
            });
            put('F', new Object() { // from class: com.aspose.words.internal.zzZKP.1.3
            });
            put('G', new Object() { // from class: com.aspose.words.internal.zzZKP.1.4
            });
            put('N', new Object() { // from class: com.aspose.words.internal.zzZKP.1.5
            });
            put('P', new Object() { // from class: com.aspose.words.internal.zzZKP.1.6
            });
            put('R', new Object() { // from class: com.aspose.words.internal.zzZKP.1.7
            });
        }
    };
    static final int[] zzZPp = {9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, Integer.MAX_VALUE};
    static final long[] zzZPo = {9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, 9999999999L, 99999999999L, 999999999999L, 9999999999999L, 99999999999999L, 999999999999999L, 9999999999999999L, 99999999999999999L, 999999999999999999L, LocationRequestCompat.PASSIVE_INTERVAL};
    static final char[] zzZPn = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    static final char[] zzZPm = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    static final char[] zzZPl = {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '5', '5', '5', '5', '5', '5', '5', '5', '5', '5', '6', '6', '6', '6', '6', '6', '6', '6', '6', '6', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '8', '8', '8', '8', '8', '8', '8', '8', '8', '8', '9', '9', '9', '9', '9', '9', '9', '9', '9', '9'};
    static final char[] zzZPk = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public static class zzZ {
        private float zzHV;
        private String zzPn;

        public zzZ(String str, float f) {
            this.zzPn = str;
            this.zzHV = f;
        }

        public final String getFormat() {
            return this.zzPn;
        }

        public final float zzPv() {
            return this.zzHV;
        }
    }

    private static void getChars(int i, int i2, char[] cArr, int i3) {
        while (i >= 65536) {
            int i4 = i / 100;
            int i5 = i - (((i4 << 6) + (i4 << 5)) + (i4 << 2));
            cArr[i2 - 1] = zzZPk[i5];
            if (i3 - 1 <= 0) {
                return;
            }
            i2 -= 2;
            cArr[i2] = zzZPl[i5];
            i3 -= 2;
            if (i3 <= 0) {
                return;
            } else {
                i = i4;
            }
        }
        while (true) {
            int i6 = (52429 * i) >>> 19;
            i2--;
            cArr[i2] = zzZPn[i - ((i6 << 3) + (i6 << 1))];
            i3--;
            if (i3 <= 0) {
                return;
            }
            if (i6 == 0) {
                while (true) {
                    int i7 = i3 - 1;
                    if (i3 <= 0) {
                        return;
                    }
                    i2--;
                    cArr[i2] = '0';
                    i3 = i7;
                }
            } else {
                i = i6;
            }
        }
    }

    private static String zzD(long j, int i) {
        char c;
        if (j == Long.MIN_VALUE) {
            return zzQl(i);
        }
        if (j < 0) {
            j = -j;
            c = '-';
        } else {
            c = 0;
        }
        int iZzYt = zzYt(j);
        if (i <= 0) {
            i = iZzYt;
        }
        if (iZzYt < i) {
            iZzYt = i;
        }
        int i2 = c != 0 ? iZzYt + 1 : iZzYt;
        char[] cArr = new char[i2];
        zzZ(j, i2, cArr, iZzYt);
        if (c != 0) {
            cArr[0] = c;
        }
        return new String(cArr, 0, i2);
    }

    private static String zzL(int i, String str) {
        int[] iArr = {0};
        char cZzX = zzX(str, iArr);
        int i2 = iArr[0];
        return cZzX != 'X' ? cZzX != 'x' ? zzZ5(i, i2) : zzY(i, i2, 8, false) : zzY(i, i2, 8, true);
    }

    public static String zzM(int i, String str) {
        return zzL(i, str);
    }

    public static String zzQ(Object obj, String str) {
        return obj instanceof Byte ? zzZ(((Byte) obj).byteValue(), str) : obj instanceof Short ? zzZ(((Short) obj).shortValue(), str) : obj instanceof Integer ? zzL(((Integer) obj).intValue(), str) : obj instanceof Long ? zzW(((Long) obj).longValue(), str) : obj instanceof Float ? zzY(((Float) obj).floatValue(), str) : obj instanceof Double ? zzV(((Double) obj).doubleValue(), str) : ((obj instanceof BigDecimal) || (obj instanceof BigInteger)) ? new DecimalFormat(str).format(obj) : obj.toString();
    }

    private static String zzQl(int i) {
        int i2;
        if (i <= 0 || i - 19 <= 0) {
            return "-9223372036854775808";
        }
        return CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR + zzZKN.zzS('0', i2) + "9223372036854775808";
    }

    private static String zzQm(int i) {
        int i2;
        if (i <= 0 || i - 10 <= 0) {
            return "-2147483648";
        }
        return CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR + zzZKN.zzS('0', i2) + "2147483648";
    }

    private static int zzQn(int i) {
        int i2 = 0;
        while (i > zzZPp[i2]) {
            i2++;
        }
        return i2 + 1;
    }

    private static DecimalFormat zzU4(String str) {
        DecimalFormat decimalFormatZzcn = zzZHS.zzcn();
        if (str != null && !"D".equals(str)) {
            decimalFormatZzcn.applyPattern(str.replace("\"", ""));
        }
        return decimalFormatZzcn;
    }

    private static int zzU5(String str) {
        for (int length = str.length() - 1; length > 0; length--) {
            if (str.charAt(length) == '.') {
                return length;
            }
        }
        return -1;
    }

    private static String zzU6(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == ';' && (i = i + 1) >= 2) {
                return str.substring(0, i2);
            }
        }
        return str;
    }

    private static String zzU7(String str) {
        int i = -1;
        int i2 = 0;
        int i3 = -1;
        for (int i4 = 0; i4 < str.length(); i4++) {
            if (str.charAt(i4) == ';') {
                i2++;
                if (i2 == 2) {
                    i = i4 + 1;
                }
                if (i2 == 3) {
                    i3 = i4;
                }
            }
        }
        return i < 0 ? str : i3 < 0 ? str.substring(i) : str.substring(i, i3);
    }

    private static boolean zzU8(String str) {
        if (str == null) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == ';' && (i = i + 1) >= 2) {
                return true;
            }
        }
        return false;
    }

    private static String zzU9(String str) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt == '\"') {
                int i2 = i + 1;
                int iIndexOf = str.indexOf(34, i2);
                if (iIndexOf != -1) {
                    while (true) {
                        if (iIndexOf >= length) {
                            z = false;
                            break;
                        }
                        int i3 = iIndexOf + 1;
                        z = true;
                        if (i3 == length) {
                            if (iIndexOf - i2 > 0) {
                                zzZ(sb, str, i2, iIndexOf);
                            }
                        } else if (str.charAt(i3) == '\"') {
                            int i4 = iIndexOf + 2;
                            int iIndexOf2 = str.indexOf(34, i4);
                            if (iIndexOf2 == -1) {
                                if (iIndexOf - i2 > 0) {
                                    zzZ(sb, str, i2, iIndexOf);
                                }
                                sb.append((CharSequence) str, i4, length);
                            } else {
                                iIndexOf = iIndexOf2;
                            }
                        } else {
                            if (iIndexOf - i2 > 0) {
                                zzZ(sb, str, i2, iIndexOf);
                            }
                            z = false;
                            i = i3;
                        }
                    }
                    if (z) {
                        break;
                    }
                } else {
                    sb.append((CharSequence) str, i2, length);
                    break;
                }
            } else {
                sb.append(cCharAt);
                i++;
            }
        }
        return sb.toString();
    }

    private static String zzUa(String str) {
        if (zzZKN.zzU3(str)) {
            return str;
        }
        String strZzU9 = zzU9(str);
        StringBuilder sb = new StringBuilder();
        int length = strZzU9.length();
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (i < length) {
            char cCharAt = strZzU9.charAt(i);
            if (cCharAt == '\"') {
                z = !z;
                if (!z2) {
                    sb.append("'");
                }
            } else if (z) {
                sb.append(cCharAt);
            } else if (cCharAt == '\\') {
                int i2 = i + 1;
                if (i2 == length) {
                    break;
                }
                char cCharAt2 = strZzU9.charAt(i2);
                if (cCharAt2 != 'u') {
                    if (!z2) {
                        sb.append("'");
                        z2 = true;
                    }
                    sb.append(cCharAt2);
                }
                i += 2;
            } else {
                if (z2) {
                    sb.append("'");
                    z2 = false;
                }
                sb.append(cCharAt);
            }
            i++;
        }
        if (z2) {
            sb.append("'");
        }
        return sb.toString();
    }

    private static String zzV(double d, String str) {
        if (str == null) {
            long j = (long) d;
            if (j == d) {
                return Long.toString(j);
            }
        }
        return zzZOI.zzZ(str, d, zzZNG.zzpZ());
    }

    private static String zzW(long j, String str) {
        int[] iArr = {0};
        char cZzX = zzX(str, iArr);
        int i = iArr[0];
        return cZzX != 'X' ? cZzX != 'x' ? zzD(j, i) : zzY(j, i, false) : zzY(j, i, true);
    }

    private static String zzX(float f, String str) {
        if (str == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        StringBuilder sb = new StringBuilder();
        zzY(sb, str, linkedHashMap);
        zzZ(sb, str, linkedHashMap);
        String string = sb.toString();
        sb.setLength(0);
        int iZzU5 = zzU5(string);
        String str2 = zzU4(string).format(f);
        int iZzU52 = zzU5(str2);
        sb.append(str2);
        return zzZ(linkedHashMap, iZzU5, iZzU52, sb);
    }

    private static void zzY(StringBuilder sb, String str, Map<Integer, Character> map) {
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '.') {
                sb.append(cCharAt);
                return;
            }
            if (cCharAt == '0') {
                sb.append(cCharAt);
                z = true;
            } else if (cCharAt == '#') {
                if (z) {
                    sb.append('0');
                } else {
                    sb.append(cCharAt);
                }
            } else if (cCharAt == ',') {
                sb.append(cCharAt);
            } else if (z || Character.isDigit(cCharAt)) {
                map.put(Integer.valueOf(i), Character.valueOf(cCharAt));
            } else {
                sb.append(cCharAt);
            }
        }
    }

    public static int zzYY(boolean z) {
        return z ? 1 : 0;
    }

    public static int zzYs(long j) {
        return (int) (j ^ (j >>> 32));
    }

    private static int zzYt(long j) {
        int i = 0;
        while (j > zzZPo[i]) {
            i++;
        }
        return i + 1;
    }

    public static String zzYu(long j) {
        return Long.toString(j);
    }

    private static String zzZ(byte b, String str) {
        int[] iArr = {0};
        char cZzX = zzX(str, iArr);
        int i = iArr[0];
        return cZzX != 'X' ? cZzX != 'x' ? zzZ5(b, i) : zzY(b & 255, i, 2, false) : zzY(b & 255, i, 2, true);
    }

    private static String zzZ5(int i, int i2) {
        char c;
        if (i == Integer.MIN_VALUE) {
            return zzQm(i2);
        }
        if (i < 0) {
            i = -i;
            c = '-';
        } else {
            c = 0;
        }
        int iZzQn = zzQn(i);
        if (i2 <= 0) {
            i2 = iZzQn;
        }
        if (iZzQn < i2) {
            iZzQn = i2;
        }
        int i3 = c != 0 ? iZzQn + 1 : iZzQn;
        char[] cArr = new char[i3];
        getChars(i, i3, cArr, iZzQn);
        if (c != 0) {
            cArr[0] = c;
        }
        return new String(cArr, 0, i3);
    }

    public static int zzZ9(double d) {
        long jDoubleToLongBits = Double.doubleToLongBits(d);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    private static boolean zzZD(double d) {
        return Math.abs(d) < Double.MIN_VALUE;
    }

    public static long zzZW(Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).longValue();
        }
        if (obj instanceof Byte) {
            return ((Byte) obj).longValue();
        }
        if (obj instanceof Short) {
            return ((Short) obj).longValue();
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (obj instanceof Float) {
            return ((Float) obj).longValue();
        }
        if (obj instanceof Double) {
            return ((Double) obj).longValue();
        }
        return 0L;
    }

    public static boolean zzZX(Object obj) {
        return obj instanceof Number;
    }

    private static char zzo(String str, int i) {
        if (i < str.length()) {
            return str.charAt(i);
        }
        return (char) 0;
    }

    public static String zzW(String str, double d) {
        if (!zzU8(str)) {
            return str;
        }
        if (zzZD(d)) {
            return zzU7(str);
        }
        return zzU6(str);
    }

    private static String zzZ(short s, String str) {
        int[] iArr = {0};
        char cZzX = zzX(str, iArr);
        int i = iArr[0];
        if (cZzX == 'X') {
            return zzY(s & 65535, i, 4, true);
        }
        if (cZzX != 'x') {
            return zzZ5(s, i);
        }
        return zzY(s & 65535, i, 4, false);
    }

    private static zzZ zzW(String str, float f) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt == ',') {
                i++;
                i2 = 1;
                while (true) {
                    if (i >= str.length()) {
                        break;
                    }
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 == ',') {
                        i2++;
                        i++;
                    } else if (cCharAt2 == '}') {
                        sb.append(cCharAt2);
                    } else {
                        while (i2 > 0) {
                            sb.append(",");
                            i2--;
                        }
                        sb.append(cCharAt2);
                        i2 = 0;
                    }
                }
            } else {
                sb.append(cCharAt);
            }
            i++;
        }
        if (i2 <= 0) {
            return null;
        }
        while (i2 > 0) {
            f /= 1000.0f;
            i2--;
        }
        return new zzZ(sb.toString(), Math.round(f));
    }

    private static String zzY(int i, int i2, int i3, boolean z) {
        if (i2 != -1 && i2 > i3) {
            i3 = i2;
        }
        char[] cArr = new char[i3];
        int iZzZ = zzZ(i, i3, cArr, i2, z);
        return new String(cArr, iZzZ, i3 - iZzZ);
    }

    private static char zzX(String str, int[] iArr) {
        char cZzo;
        int i;
        if (str != null && (cZzo = zzo(str, 0)) != 0) {
            if ((cZzo >= 'A' && cZzo <= 'Z') || (cZzo >= 'a' && cZzo <= 'z')) {
                char cZzo2 = zzo(str, 1);
                if (cZzo2 < '0' || cZzo2 > '9') {
                    i = -1;
                } else {
                    i = cZzo2 - '0';
                    cZzo2 = zzo(str, 2);
                    int i2 = 2;
                    while (cZzo2 >= '0' && cZzo2 <= '9') {
                        i = (i * 10) + (cZzo2 - '0');
                        i2++;
                        cZzo2 = zzo(str, i2);
                        if (i >= 10) {
                            break;
                        }
                    }
                }
                if (cZzo2 == 0) {
                    iArr[0] = i;
                    return zzo(str, 0);
                }
            }
            iArr[0] = -1;
            return (char) 0;
        }
        iArr[0] = -1;
        return 'G';
    }

    private static void zzZ(StringBuilder sb, String str, int i, int i2) {
        sb.append('\"');
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\"') {
                sb.append(cCharAt);
            }
            i++;
        }
        sb.append('\"');
    }

    private static String zzY(long j, int i, boolean z) {
        int i2 = (i == -1 || i <= 16) ? 16 : i;
        char[] cArr = new char[i2];
        int iZzZ = zzZ(j, i2, cArr, i, z);
        return new String(cArr, iZzZ, i2 - iZzZ);
    }

    public static String zzY(double d, String str, zzZP1 zzzp1) {
        if (str == null) {
            long j = (long) d;
            if (j == d) {
                return Long.toString(j);
            }
        }
        return zzZOI.zzZ(str, d, zzzp1);
    }

    public static String zzZ(double d, zzZP1 zzzp1) {
        return zzZOI.zzZ("", d, zzzp1);
    }

    private static String zzZ(Map<Integer, Character> map, int i, int i2, StringBuilder sb) {
        String string = sb.toString();
        if (!map.isEmpty()) {
            int i3 = i2 - i;
            try {
                for (Map.Entry<Integer, Character> entry : map.entrySet()) {
                    sb.insert(entry.getKey().intValue() + i3, entry.getValue().charValue());
                }
                return sb.toString();
            } catch (Throwable th) {
                zzZHV.zzZ(th);
            }
        }
        return string;
    }

    private static String zzY(float f, String str) {
        if (str == null) {
            long j = (long) f;
            if (j == f) {
                return Long.toString(j);
            }
        }
        String strZzW = zzW(zzUa(str), f);
        zzZ zzzZzW = zzW(strZzW, f);
        if (zzzZzW != null) {
            strZzW = zzzZzW.getFormat();
            f = zzzZzW.zzPv();
        }
        try {
            return zzU4(strZzW).format(f);
        } catch (IllegalArgumentException unused) {
            return zzX(f, strZzW);
        }
    }

    private static void zzZ(StringBuilder sb, String str, Map<Integer, Character> map) {
        int length = str.length() - 1;
        boolean z = false;
        for (int i = length; i > 0; i--) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '.') {
                return;
            }
            if (cCharAt == '0') {
                sb.append(cCharAt);
                z = true;
            } else if (cCharAt == '#') {
                if (z) {
                    sb.append('0');
                } else {
                    sb.append(cCharAt);
                }
            } else if (!z && !Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            } else {
                map.put(Integer.valueOf(length - i), Character.valueOf(cCharAt));
            }
        }
    }

    private static int zzZ(int i, int i2, char[] cArr, int i3, boolean z) {
        char[] cArr2 = z ? zzZPm : zzZPn;
        do {
            i2--;
            cArr[i2] = cArr2[i & 15];
            i3--;
            i >>>= 4;
        } while (i != 0);
        while (true) {
            int i4 = i3 - 1;
            if (i3 <= 0) {
                return i2;
            }
            i2--;
            cArr[i2] = '0';
            i3 = i4;
        }
    }

    private static void zzZ(long j, int i, char[] cArr, int i2) {
        if (!zzVr && j == Long.MIN_VALUE) {
            throw new AssertionError("calling method should filter out value == Long.MIN_VALUE");
        }
        while (j > 2147483647L) {
            long j2 = j / 100;
            int i3 = (int) (j - (((j2 << 6) + (j2 << 5)) + (j2 << 2)));
            cArr[i - 1] = zzZPk[i3];
            if (i2 - 1 <= 0) {
                return;
            }
            i -= 2;
            cArr[i] = zzZPl[i3];
            i2 -= 2;
            if (i2 <= 0) {
                return;
            } else {
                j = j2;
            }
        }
        int i4 = (int) j;
        while (i4 >= 65536) {
            int i5 = i4 / 100;
            int i6 = i4 - (((i5 << 6) + (i5 << 5)) + (i5 << 2));
            cArr[i - 1] = zzZPk[i6];
            if (i2 - 1 <= 0) {
                return;
            }
            i -= 2;
            cArr[i] = zzZPl[i6];
            i2 -= 2;
            if (i2 <= 0) {
                return;
            } else {
                i4 = i5;
            }
        }
        while (true) {
            int i7 = (52429 * i4) >>> 19;
            i--;
            cArr[i] = zzZPn[i4 - ((i7 << 3) + (i7 << 1))];
            i2--;
            if (i2 <= 0) {
                return;
            }
            if (i7 == 0) {
                while (true) {
                    int i8 = i2 - 1;
                    if (i2 <= 0) {
                        return;
                    }
                    i--;
                    cArr[i] = '0';
                    i2 = i8;
                }
            } else {
                i4 = i7;
            }
        }
    }

    private static int zzZ(long j, int i, char[] cArr, int i2, boolean z) {
        char[] cArr2 = z ? zzZPm : zzZPn;
        do {
            i--;
            cArr[i] = cArr2[(int) (15 & j)];
            i2--;
            j >>>= 4;
        } while (j != 0);
        while (true) {
            int i3 = i2 - 1;
            if (i2 <= 0) {
                return i;
            }
            i--;
            cArr[i] = '0';
            i2 = i3;
        }
    }
}
