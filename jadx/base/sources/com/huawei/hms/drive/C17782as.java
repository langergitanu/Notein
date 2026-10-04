package com.huawei.hms.drive;

import androidx.core.location.LocationRequestCompat;
import com.google.common.net.HttpHeaders;
import com.huawei.hms.network.embedded.C18340r9;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.huawei.hms.drive.as */
/* JADX INFO: loaded from: classes6.dex */
public final class C17782as {

    /* JADX INFO: renamed from: a */
    private static final Pattern f52721a = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: b */
    private static final Pattern f52722b = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: c */
    private static final Pattern f52723c = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: d */
    private static final Pattern f52724d = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: e */
    private final String f52725e;

    /* JADX INFO: renamed from: f */
    private final String f52726f;

    /* JADX INFO: renamed from: g */
    private final long f52727g;

    /* JADX INFO: renamed from: h */
    private final String f52728h;

    /* JADX INFO: renamed from: i */
    private final String f52729i;

    /* JADX INFO: renamed from: j */
    private final boolean f52730j;

    /* JADX INFO: renamed from: k */
    private final boolean f52731k;

    /* JADX INFO: renamed from: l */
    private final boolean f52732l;

    /* JADX INFO: renamed from: m */
    private final boolean f52733m;

    private C17782as(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f52725e = str;
        this.f52726f = str2;
        this.f52727g = j;
        this.f52728h = str3;
        this.f52729i = str4;
        this.f52730j = z;
        this.f52731k = z2;
        this.f52733m = z3;
        this.f52732l = z4;
    }

    /* JADX INFO: renamed from: a */
    public String m76031a() {
        return this.f52725e;
    }

    /* JADX INFO: renamed from: b */
    public String m76033b() {
        return this.f52726f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C17782as)) {
            return false;
        }
        C17782as c17782as = (C17782as) obj;
        return c17782as.f52725e.equals(this.f52725e) && c17782as.f52726f.equals(this.f52726f) && c17782as.f52728h.equals(this.f52728h) && c17782as.f52729i.equals(this.f52729i) && c17782as.f52727g == this.f52727g && c17782as.f52730j == this.f52730j && c17782as.f52731k == this.f52731k && c17782as.f52732l == this.f52732l && c17782as.f52733m == this.f52733m;
    }

    public int hashCode() {
        int iOooO0O0 = com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(527, 31, this.f52725e), 31, this.f52726f), 31, this.f52728h), 31, this.f52729i);
        long j = this.f52727g;
        return ((((((((iOooO0O0 + ((int) (j ^ (j >>> 32)))) * 31) + (!this.f52730j ? 1 : 0)) * 31) + (!this.f52731k ? 1 : 0)) * 31) + (!this.f52732l ? 1 : 0)) * 31) + (!this.f52733m ? 1 : 0);
    }

    public String toString() {
        return m76032a(false);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m76029a(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !C17806bp.m76353c(str);
    }

    /* JADX INFO: renamed from: b */
    private static String m76030b(String str) {
        if (str.endsWith(".")) {
            throw new IllegalArgumentException();
        }
        if (str.startsWith(".")) {
            str = str.substring(1);
        }
        String strM76329a = C17806bp.m76329a(str);
        if (strM76329a != null) {
            return strM76329a;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: a */
    public static C17782as m76027a(C17792bb c17792bb, String str) {
        return m76026a(System.currentTimeMillis(), c17792bb, str);
    }

    /* JADX INFO: renamed from: a */
    public static C17782as m76026a(long j, C17792bb c17792bb, String str) {
        long j2;
        String str2;
        String strM76352c;
        int length = str.length();
        char c = ';';
        int iM76323a = C17806bp.m76323a(str, 0, length, ';');
        int iM76323a2 = C17806bp.m76323a(str, 0, iM76323a, '=');
        String strM76030b = null;
        if (iM76323a2 == iM76323a) {
            return null;
        }
        String strM76352c2 = C17806bp.m76352c(str, 0, iM76323a2);
        if (strM76352c2.isEmpty() || C17806bp.m76347b(strM76352c2) != -1) {
            return null;
        }
        String strM76352c3 = C17806bp.m76352c(str, iM76323a2 + 1, iM76323a);
        if (C17806bp.m76347b(strM76352c3) != -1) {
            return null;
        }
        int i = iM76323a + 1;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = true;
        long jM76025a = 253402300799999L;
        long jM76024a = -1;
        String str3 = null;
        while (i < length) {
            int iM76323a3 = C17806bp.m76323a(str, i, length, c);
            int iM76323a4 = C17806bp.m76323a(str, i, iM76323a3, '=');
            String strM76352c4 = C17806bp.m76352c(str, i, iM76323a4);
            if (iM76323a4 < iM76323a3) {
                strM76352c = C17806bp.m76352c(str, iM76323a4 + 1, iM76323a3);
            } else {
                strM76352c = "";
            }
            if (strM76352c4.equalsIgnoreCase("expires")) {
                try {
                    jM76025a = m76025a(strM76352c, 0, strM76352c.length());
                    z3 = true;
                } catch (NumberFormatException | IllegalArgumentException unused) {
                }
            } else if (strM76352c4.equalsIgnoreCase("max-age")) {
                jM76024a = m76024a(strM76352c);
                z3 = true;
            } else if (strM76352c4.equalsIgnoreCase("domain")) {
                strM76030b = m76030b(strM76352c);
                z4 = false;
            } else if (strM76352c4.equalsIgnoreCase("path")) {
                str3 = strM76352c;
            } else if (strM76352c4.equalsIgnoreCase("secure")) {
                z = true;
            } else if (strM76352c4.equalsIgnoreCase("httponly")) {
                z2 = true;
            }
            i = iM76323a3 + 1;
            c = ';';
        }
        if (jM76024a == Long.MIN_VALUE) {
            j2 = Long.MIN_VALUE;
        } else if (jM76024a != -1) {
            long j3 = j + (jM76024a <= 9223372036854775L ? jM76024a * 1000 : LocationRequestCompat.PASSIVE_INTERVAL);
            j2 = (j3 < j || j3 > C18340r9.f56029a) ? 253402300799999L : j3;
        } else {
            j2 = jM76025a;
        }
        String strM76151f = c17792bb.m76151f();
        if (strM76030b == null) {
            str2 = strM76151f;
        } else {
            if (!m76029a(strM76151f, strM76030b)) {
                return null;
            }
            str2 = strM76030b;
        }
        if (strM76151f.length() != str2.length() && C17860dp.m76758a().m76763a(str2) == null) {
            return null;
        }
        String strSubstring = "/";
        if (str3 == null || !str3.startsWith("/")) {
            String strM76153h = c17792bb.m76153h();
            int iLastIndexOf = strM76153h.lastIndexOf(47);
            if (iLastIndexOf != 0) {
                strSubstring = strM76153h.substring(0, iLastIndexOf);
            }
            str3 = strSubstring;
        }
        return new C17782as(strM76352c2, strM76352c3, j2, str2, str3, z, z2, z4, z3);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static long m76025a(String str, int i, int i2) {
        int iM76023a = m76023a(str, i, i2, false);
        Matcher matcher = f52724d.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int iIndexOf = -1;
        int i6 = -1;
        int i7 = -1;
        while (iM76023a < i2) {
            int iM76023a2 = m76023a(str, iM76023a + 1, i2, true);
            matcher.region(iM76023a, iM76023a2);
            if (i4 == -1 && matcher.usePattern(f52724d).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
                i6 = Integer.parseInt(matcher.group(2));
                i7 = Integer.parseInt(matcher.group(3));
            } else if (i5 == -1 && matcher.usePattern(f52723c).matches()) {
                i5 = Integer.parseInt(matcher.group(1));
            } else if (iIndexOf == -1) {
                Pattern pattern = f52722b;
                if (matcher.usePattern(pattern).matches()) {
                    iIndexOf = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                } else if (i3 == -1 && matcher.usePattern(f52721a).matches()) {
                    i3 = Integer.parseInt(matcher.group(1));
                }
            }
            iM76023a = m76023a(str, iM76023a2 + 1, i2, false);
        }
        if (i3 >= 70 && i3 <= 99) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 <= 69) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            throw new IllegalArgumentException();
        }
        if (iIndexOf == -1) {
            throw new IllegalArgumentException();
        }
        if (i5 < 1 || i5 > 31) {
            throw new IllegalArgumentException();
        }
        if (i4 < 0 || i4 > 23) {
            throw new IllegalArgumentException();
        }
        if (i6 < 0 || i6 > 59) {
            throw new IllegalArgumentException();
        }
        if (i7 >= 0 && i7 <= 59) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(C17806bp.f52960g);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i3);
            gregorianCalendar.set(2, iIndexOf - 1);
            gregorianCalendar.set(5, i5);
            gregorianCalendar.set(11, i4);
            gregorianCalendar.set(12, i6);
            gregorianCalendar.set(13, i7);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: a */
    private static int m76023a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt >= '0' && cCharAt <= '9') || ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: a */
    private static long m76024a(String str) {
        try {
            long j = Long.parseLong(str);
            if (j <= 0) {
                return Long.MIN_VALUE;
            }
            return j;
        } catch (NumberFormatException e) {
            if (str.matches("-?\\d+")) {
                if (str.startsWith(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR)) {
                    return Long.MIN_VALUE;
                }
                return LocationRequestCompat.PASSIVE_INTERVAL;
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: a */
    public static List<C17782as> m76028a(C17792bb c17792bb, C17788ay c17788ay) {
        List<String> listM76077b = c17788ay.m76077b(HttpHeaders.SET_COOKIE);
        int size = listM76077b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C17782as c17782asM76027a = m76027a(c17792bb, listM76077b.get(i));
            if (c17782asM76027a != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c17782asM76027a);
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: a */
    public String m76032a(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f52725e);
        sb.append('=');
        sb.append(this.f52726f);
        if (this.f52732l) {
            if (this.f52727g == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(C17826ci.m76479a(new Date(this.f52727g)));
            }
        }
        if (!this.f52733m) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.f52728h);
        }
        sb.append("; path=");
        sb.append(this.f52729i);
        if (this.f52730j) {
            sb.append("; secure");
        }
        if (this.f52731k) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
