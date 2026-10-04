package com.huawei.hms.network.embedded;

import androidx.core.location.LocationRequestCompat;
import com.aspose.slides.internal.p497xc.OooO00o;
import com.google.common.net.HttpHeaders;
import com.huawei.hms.network.okhttp.PublicSuffixDatabase;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.m7 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18271m7 {

    /* JADX INFO: renamed from: j */
    public static final Pattern f55672j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: k */
    public static final Pattern f55673k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: l */
    public static final Pattern f55674l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: m */
    public static final Pattern f55675m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a */
    public final String f55676a;

    /* JADX INFO: renamed from: b */
    public final String f55677b;

    /* JADX INFO: renamed from: c */
    public final long f55678c;

    /* JADX INFO: renamed from: d */
    public final String f55679d;

    /* JADX INFO: renamed from: e */
    public final String f55680e;

    /* JADX INFO: renamed from: f */
    public final boolean f55681f;

    /* JADX INFO: renamed from: g */
    public final boolean f55682g;

    /* JADX INFO: renamed from: h */
    public final boolean f55683h;

    /* JADX INFO: renamed from: i */
    public final boolean f55684i;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.m7$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public String f55685a;

        /* JADX INFO: renamed from: b */
        public String f55686b;

        /* JADX INFO: renamed from: d */
        public String f55688d;

        /* JADX INFO: renamed from: f */
        public boolean f55690f;

        /* JADX INFO: renamed from: g */
        public boolean f55691g;

        /* JADX INFO: renamed from: h */
        public boolean f55692h;

        /* JADX INFO: renamed from: i */
        public boolean f55693i;

        /* JADX INFO: renamed from: c */
        public long f55687c = C18340r9.f56029a;

        /* JADX INFO: renamed from: e */
        public String f55689e = "/";

        /* JADX INFO: renamed from: a */
        public a m79146a(long j) {
            if (j <= 0) {
                j = Long.MIN_VALUE;
            }
            if (j > C18340r9.f56029a) {
                j = 253402300799999L;
            }
            this.f55687c = j;
            this.f55692h = true;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m79149b() {
            this.f55691g = true;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m79151c() {
            this.f55690f = true;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m79153d(String str) {
            if (!str.startsWith("/")) {
                throw new IllegalArgumentException("path must start with '/'");
            }
            this.f55689e = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m79154e(String str) {
            if (str == null) {
                throw new NullPointerException("value == null");
            }
            if (!str.trim().equals(str)) {
                throw new IllegalArgumentException("value is not trimmed");
            }
            this.f55686b = str;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m79147a(String str) {
            return m79145a(str, false);
        }

        /* JADX INFO: renamed from: b */
        public a m79150b(String str) {
            return m79145a(str, true);
        }

        /* JADX INFO: renamed from: c */
        public a m79152c(String str) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (!str.trim().equals(str)) {
                throw new IllegalArgumentException("name is not trimmed");
            }
            this.f55685a = str;
            return this;
        }

        /* JADX INFO: renamed from: a */
        private a m79145a(String str, boolean z) {
            if (str == null) {
                throw new NullPointerException("domain == null");
            }
            String strM79364a = C18313p8.m79364a(str);
            if (strM79364a == null) {
                throw new IllegalArgumentException("unexpected domain: ".concat(str));
            }
            this.f55688d = strM79364a;
            this.f55693i = z;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C18271m7 m79148a() {
            return new C18271m7(this);
        }
    }

    public C18271m7(a aVar) {
        String str = aVar.f55685a;
        if (str == null) {
            throw new NullPointerException("builder.name == null");
        }
        String str2 = aVar.f55686b;
        if (str2 == null) {
            throw new NullPointerException("builder.value == null");
        }
        String str3 = aVar.f55688d;
        if (str3 == null) {
            throw new NullPointerException("builder.domain == null");
        }
        this.f55676a = str;
        this.f55677b = str2;
        this.f55678c = aVar.f55687c;
        this.f55679d = str3;
        this.f55680e = aVar.f55689e;
        this.f55681f = aVar.f55690f;
        this.f55682g = aVar.f55691g;
        this.f55683h = aVar.f55692h;
        this.f55684i = aVar.f55693i;
    }

    /* JADX INFO: renamed from: a */
    public static int m79125a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt >= '0' && cCharAt <= '9') || ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: b */
    public long m79137b() {
        return this.f55678c;
    }

    /* JADX INFO: renamed from: c */
    public boolean m79138c() {
        return this.f55684i;
    }

    /* JADX INFO: renamed from: d */
    public boolean m79139d() {
        return this.f55682g;
    }

    /* JADX INFO: renamed from: e */
    public String m79140e() {
        return this.f55676a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C18271m7)) {
            return false;
        }
        C18271m7 c18271m7 = (C18271m7) obj;
        return c18271m7.f55676a.equals(this.f55676a) && c18271m7.f55677b.equals(this.f55677b) && c18271m7.f55679d.equals(this.f55679d) && c18271m7.f55680e.equals(this.f55680e) && c18271m7.f55678c == this.f55678c && c18271m7.f55681f == this.f55681f && c18271m7.f55682g == this.f55682g && c18271m7.f55683h == this.f55683h && c18271m7.f55684i == this.f55684i;
    }

    /* JADX INFO: renamed from: f */
    public String m79141f() {
        return this.f55680e;
    }

    /* JADX INFO: renamed from: g */
    public boolean m79142g() {
        return this.f55683h;
    }

    /* JADX INFO: renamed from: h */
    public boolean m79143h() {
        return this.f55681f;
    }

    public int hashCode() {
        int iOooO0O0 = OooO00o.OooO0O0(OooO00o.OooO0O0(OooO00o.OooO0O0(OooO00o.OooO0O0(527, 31, this.f55676a), 31, this.f55677b), 31, this.f55679d), 31, this.f55680e);
        long j = this.f55678c;
        return ((((((((iOooO0O0 + ((int) (j ^ (j >>> 32)))) * 31) + (!this.f55681f ? 1 : 0)) * 31) + (!this.f55682g ? 1 : 0)) * 31) + (!this.f55683h ? 1 : 0)) * 31) + (!this.f55684i ? 1 : 0);
    }

    /* JADX INFO: renamed from: i */
    public String m79144i() {
        return this.f55677b;
    }

    public String toString() {
        return m79135a(false);
    }

    public C18271m7(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f55676a = str;
        this.f55677b = str2;
        this.f55678c = j;
        this.f55679d = str3;
        this.f55680e = str4;
        this.f55681f = z;
        this.f55682g = z2;
        this.f55684i = z3;
        this.f55683h = z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long m79126a(String str, int i, int i2) {
        int iM79125a = m79125a(str, i, i2, false);
        Matcher matcher = f55675m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int iIndexOf = -1;
        int i6 = -1;
        int i7 = -1;
        while (iM79125a < i2) {
            int iM79125a2 = m79125a(str, iM79125a + 1, i2, true);
            matcher.region(iM79125a, iM79125a2);
            if (i4 == -1 && matcher.usePattern(f55675m).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
                i6 = Integer.parseInt(matcher.group(2));
                i7 = Integer.parseInt(matcher.group(3));
            } else if (i5 == -1 && matcher.usePattern(f55674l).matches()) {
                i5 = Integer.parseInt(matcher.group(1));
            } else if (iIndexOf == -1) {
                Pattern pattern = f55673k;
                if (matcher.usePattern(pattern).matches()) {
                    iIndexOf = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                } else if (i3 == -1 && matcher.usePattern(f55672j).matches()) {
                    i3 = Integer.parseInt(matcher.group(1));
                }
            }
            iM79125a = m79125a(str, iM79125a2 + 1, i2, false);
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
        if (i7 < 0 || i7 > 59) {
            throw new IllegalArgumentException();
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(C18313p8.f55900i);
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

    /* JADX INFO: renamed from: b */
    public static long m79132b(String str) {
        try {
            long j = Long.parseLong(str);
            if (j <= 0) {
                return Long.MIN_VALUE;
            }
            return j;
        } catch (NumberFormatException e) {
            if (!str.matches("-?\\d+")) {
                throw e;
            }
            if (str.startsWith(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR)) {
                return Long.MIN_VALUE;
            }
            return LocationRequestCompat.PASSIVE_INTERVAL;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C18271m7 m79127a(long j, C18416x7 c18416x7, String str) {
        long j2;
        String str2;
        String str3;
        int length = str.length();
        char c = ';';
        int iM79359a = C18313p8.m79359a(str, 0, length, ';');
        int iM79359a2 = C18313p8.m79359a(str, 0, iM79359a, '=');
        String strM79129a = null;
        if (iM79359a2 == iM79359a) {
            return null;
        }
        String strM79395d = C18313p8.m79395d(str, 0, iM79359a2);
        if (strM79395d.isEmpty() || C18313p8.m79393c(strM79395d) != -1) {
            return null;
        }
        String strM79395d2 = C18313p8.m79395d(str, iM79359a2 + 1, iM79359a);
        if (C18313p8.m79393c(strM79395d2) != -1) {
            return null;
        }
        int i = iM79359a + 1;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = true;
        long jM79126a = 253402300799999L;
        long jM79132b = -1;
        String strSubstring = null;
        while (i < length) {
            int iM79359a3 = C18313p8.m79359a(str, i, length, c);
            int iM79359a4 = C18313p8.m79359a(str, i, iM79359a3, '=');
            String strM79395d3 = C18313p8.m79395d(str, i, iM79359a4);
            String strM79395d4 = iM79359a4 < iM79359a3 ? C18313p8.m79395d(str, iM79359a4 + 1, iM79359a3) : "";
            if (strM79395d3.equalsIgnoreCase("expires")) {
                try {
                    jM79126a = m79126a(strM79395d4, 0, strM79395d4.length());
                    z3 = true;
                } catch (NumberFormatException | IllegalArgumentException unused) {
                }
            } else if (strM79395d3.equalsIgnoreCase("max-age")) {
                jM79132b = m79132b(strM79395d4);
                z3 = true;
            } else if (strM79395d3.equalsIgnoreCase("domain")) {
                strM79129a = m79129a(strM79395d4);
                z4 = false;
            } else if (strM79395d3.equalsIgnoreCase("path")) {
                strSubstring = strM79395d4;
            } else if (strM79395d3.equalsIgnoreCase("secure")) {
                z = true;
            } else if (strM79395d3.equalsIgnoreCase("httponly")) {
                z2 = true;
            }
            i = iM79359a3 + 1;
            c = ';';
        }
        if (jM79132b == Long.MIN_VALUE) {
            j2 = Long.MIN_VALUE;
        } else if (jM79132b != -1) {
            long j3 = j + (jM79132b <= 9223372036854775L ? jM79132b * 1000 : LocationRequestCompat.PASSIVE_INTERVAL);
            j2 = (j3 < j || j3 > C18340r9.f56029a) ? 253402300799999L : j3;
        } else {
            j2 = jM79126a;
        }
        String strM79929h = c18416x7.m79929h();
        if (strM79129a == null) {
            str2 = strM79929h;
        } else {
            if (!m79131a(strM79929h, strM79129a)) {
                return null;
            }
            str2 = strM79129a;
        }
        if (strM79929h.length() != str2.length() && PublicSuffixDatabase.m80073a().m80078a(str2) == null) {
            return null;
        }
        if (strSubstring == null || !strSubstring.startsWith("/")) {
            String strM79922c = c18416x7.m79922c();
            int iLastIndexOf = strM79922c.lastIndexOf(47);
            if (iLastIndexOf != 0) {
                strSubstring = strM79922c.substring(0, iLastIndexOf);
                str3 = strSubstring;
            } else {
                str3 = "/";
            }
        } else {
            str3 = strSubstring;
        }
        return new C18271m7(strM79395d, strM79395d2, j2, str2, str3, z, z2, z4, z3);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m79133b(C18416x7 c18416x7, String str) {
        String strM79922c = c18416x7.m79922c();
        if (strM79922c.equals(str)) {
            return true;
        }
        if (strM79922c.startsWith(str)) {
            return str.endsWith("/") || strM79922c.charAt(str.length()) == '/';
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static C18271m7 m79128a(C18416x7 c18416x7, String str) {
        return m79127a(System.currentTimeMillis(), c18416x7, str);
    }

    /* JADX INFO: renamed from: a */
    public String m79134a() {
        return this.f55679d;
    }

    /* JADX INFO: renamed from: a */
    public static String m79129a(String str) {
        if (str.endsWith(".")) {
            throw new IllegalArgumentException();
        }
        if (str.startsWith(".")) {
            str = str.substring(1);
        }
        String strM79364a = C18313p8.m79364a(str);
        if (strM79364a != null) {
            return strM79364a;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: a */
    public String m79135a(boolean z) {
        String strM79458a;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f55676a);
        sb.append('=');
        sb.append(this.f55677b);
        if (this.f55683h) {
            if (this.f55678c == Long.MIN_VALUE) {
                strM79458a = "; max-age=0";
            } else {
                sb.append("; expires=");
                strM79458a = C18340r9.m79458a(new Date(this.f55678c));
            }
            sb.append(strM79458a);
        }
        if (!this.f55684i) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.f55679d);
        }
        sb.append("; path=");
        sb.append(this.f55680e);
        if (this.f55681f) {
            sb.append("; secure");
        }
        if (this.f55682g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public static List<C18271m7> m79130a(C18416x7 c18416x7, C18377u7 c18377u7) {
        List<String> listM79620d = c18377u7.m79620d(HttpHeaders.SET_COOKIE);
        int size = listM79620d.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C18271m7 c18271m7M79128a = m79128a(c18416x7, listM79620d.get(i));
            if (c18271m7M79128a != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c18271m7M79128a);
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: a */
    public boolean m79136a(C18416x7 c18416x7) {
        if ((this.f55684i ? c18416x7.m79929h().equals(this.f55679d) : m79131a(c18416x7.m79929h(), this.f55679d)) && m79133b(c18416x7, this.f55680e)) {
            return !this.f55681f || c18416x7.m79930i();
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m79131a(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !C18313p8.m79396d(str);
    }
}
