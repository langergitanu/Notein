package oO000Oo;

import androidx.core.location.LocationRequestCompat;
import com.google.common.math.LongMath;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final long f114759OooO00o = TimeUnit.SECONDS.toNanos(1);

    public static Long OooO(String str, Map map) {
        String strOooO0oo = OooO0oo(map, str);
        if (strOooO0oo == null) {
            return null;
        }
        try {
            return Long.valueOf(OooOO0O(strOooO0oo));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static void OooO00o(List list) {
        for (int i = 0; i < list.size(); i++) {
            if (!(list.get(i) instanceof Map)) {
                throw new ClassCastException(String.format(Locale.US, "value %s for idx %d in %s is not object", list.get(i), Integer.valueOf(i), list));
            }
        }
    }

    public static Boolean OooO0O0(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, str, map));
    }

    public static List OooO0OO(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
    }

    public static List OooO0Oo(String str, Map map) {
        List listOooO0OO = OooO0OO(str, map);
        if (listOooO0OO == null) {
            return null;
        }
        for (int i = 0; i < listOooO0OO.size(); i++) {
            if (!(listOooO0OO.get(i) instanceof String)) {
                throw new ClassCastException(String.format(Locale.US, "value '%s' for idx %d in '%s' is not string", listOooO0OO.get(i), Integer.valueOf(i), listOooO0OO));
            }
        }
        return listOooO0OO;
    }

    public static Integer OooO0o(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (!(obj instanceof Double)) {
            if (!(obj instanceof String)) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not an integer", obj, str));
            }
        }
        Double d = (Double) obj;
        int iIntValue = d.intValue();
        if (iIntValue == d.doubleValue()) {
            return Integer.valueOf(iIntValue);
        }
        throw new ClassCastException("Number expected to be integer: " + d);
    }

    public static Double OooO0o0(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (!(obj instanceof String)) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' in '%s' is not a number", obj, str, map));
        }
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            throw new IllegalArgumentException(String.format("value '%s' for key '%s' is not a double", obj, str));
        }
    }

    public static Map OooO0oO(String str, Map map) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof Map) {
            return (Map) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
    }

    public static String OooO0oo(Map<String, ?> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        Object obj = map.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
    }

    public static long OooOO0(int i, long j) {
        long j2 = i;
        long j3 = f114759OooO00o;
        if (j2 <= (-j3) || j2 >= j3) {
            j = LongMath.checkedAdd(j, j2 / j3);
            i = (int) (j2 % j3);
        }
        if (j > 0 && i < 0) {
            i = (int) (((long) i) + j3);
            j--;
        }
        if (j < 0 && i > 0) {
            i = (int) (((long) i) - j3);
            j++;
        }
        if (j >= -315576000000L && j <= 315576000000L) {
            long j4 = i;
            if (j4 >= -999999999 && j4 < j3 && ((j >= 0 && i >= 0) || (j <= 0 && i <= 0))) {
                long nanos = TimeUnit.SECONDS.toNanos(j);
                long j5 = i;
                long j6 = nanos + j5;
                return (((j5 ^ nanos) > 0L ? 1 : ((j5 ^ nanos) == 0L ? 0 : -1)) < 0) | ((nanos ^ j6) >= 0) ? j6 : ((j6 >>> 63) ^ 1) + LocationRequestCompat.PASSIVE_INTERVAL;
            }
        }
        throw new IllegalArgumentException("Duration is not valid. See proto definition for valid values. Seconds (" + j + ") must be in range [-315,576,000,000, +315,576,000,000]. Nanos (" + i + ") must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds");
    }

    public static long OooOO0O(String str) throws ParseException {
        boolean z;
        String strSubstring;
        int iCharAt;
        if (str.isEmpty() || androidx.core.content.OooO0O0.OooO00o(1, str) != 's') {
            throw new ParseException("Invalid duration string: ".concat(str), 0);
        }
        if (str.charAt(0) == '-') {
            str = str.substring(1);
            z = true;
        } else {
            z = false;
        }
        String strOooO00o = androidx.core.content.OooO0OO.OooO00o(1, 0, str);
        int iIndexOf = strOooO00o.indexOf(46);
        if (iIndexOf != -1) {
            strSubstring = strOooO00o.substring(iIndexOf + 1);
            strOooO00o = strOooO00o.substring(0, iIndexOf);
        } else {
            strSubstring = "";
        }
        long j = Long.parseLong(strOooO00o);
        if (strSubstring.isEmpty()) {
            iCharAt = 0;
        } else {
            iCharAt = 0;
            for (int i = 0; i < 9; i++) {
                iCharAt *= 10;
                if (i < strSubstring.length()) {
                    if (strSubstring.charAt(i) < '0' || strSubstring.charAt(i) > '9') {
                        throw new ParseException("Invalid nanoseconds.", 0);
                    }
                    iCharAt = (strSubstring.charAt(i) - '0') + iCharAt;
                }
            }
        }
        if (j < 0) {
            throw new ParseException("Invalid duration string: ".concat(str), 0);
        }
        if (z) {
            j = -j;
            iCharAt = -iCharAt;
        }
        try {
            return OooOO0(iCharAt, j);
        } catch (IllegalArgumentException unused) {
            throw new ParseException("Duration value is out of range.", 0);
        }
    }
}
