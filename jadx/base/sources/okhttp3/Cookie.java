package okhttp3;

import OooOoo0.C20703o000000o;
import OooOoo0.o00000;
import com.aspose.slides.internal.p497xc.OooO00o;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O0o.C33599OooOo0O;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/Cookie;", "", "Builder", "Companion", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class Cookie {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f124091OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f124092OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f124093OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f124094OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f124095OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f124096OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f124097OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f124098OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f124099OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final Companion f124086OooOO0 = new Companion(0);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final Pattern f124087OooOO0O = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final Pattern f124088OooOO0o = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final Pattern f124090OooOOO0 = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final Pattern f124089OooOOO = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/Cookie$Builder;", "", "<init>", "()V", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Builder {
    }

    @Metadata(m80611d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u001c\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u001c\u0010\n\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0007¨\u0006\u000b"}, m80612d2 = {"Lokhttp3/Cookie$Companion;", "", "<init>", "()V", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "DAY_OF_MONTH_PATTERN", "Ljava/util/regex/Pattern;", "MONTH_PATTERN", "TIME_PATTERN", "YEAR_PATTERN", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public static int OooO00o(int i, int i2, String str, boolean z) {
            while (i < i2) {
                int i3 = i + 1;
                char cCharAt = str.charAt(i);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt <= '9' && '0' <= cCharAt) || ((cCharAt <= 'z' && 'a' <= cCharAt) || ((cCharAt <= 'Z' && 'A' <= cCharAt) || cCharAt == ':'))) == (!z)) {
                    return i;
                }
                i = i3;
            }
            return i2;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x00a6  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static long OooO0O0(int i, String str) {
            int iOooO00o = OooO00o(0, i, str, false);
            Matcher matcher = Cookie.f124089OooOOO.matcher(str);
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int iOooo0O0 = -1;
            int i5 = -1;
            int i6 = -1;
            while (iOooO00o < i) {
                int iOooO00o2 = OooO00o(iOooO00o + 1, i, str, true);
                matcher.region(iOooO00o, iOooO00o2);
                if (i3 == -1 && matcher.usePattern(Cookie.f124089OooOOO).matches()) {
                    String strGroup = matcher.group(1);
                    OooOOO0.OooO0o(strGroup, "matcher.group(1)");
                    i3 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    OooOOO0.OooO0o(strGroup2, "matcher.group(2)");
                    i5 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    OooOOO0.OooO0o(strGroup3, "matcher.group(3)");
                    i6 = Integer.parseInt(strGroup3);
                } else if (i4 == -1 && matcher.usePattern(Cookie.f124090OooOOO0).matches()) {
                    String strGroup4 = matcher.group(1);
                    OooOOO0.OooO0o(strGroup4, "matcher.group(1)");
                    i4 = Integer.parseInt(strGroup4);
                } else if (iOooo0O0 == -1) {
                    Pattern pattern = Cookie.f124088OooOO0o;
                    if (matcher.usePattern(pattern).matches()) {
                        String strGroup5 = matcher.group(1);
                        OooOOO0.OooO0o(strGroup5, "matcher.group(1)");
                        Locale US = Locale.US;
                        OooOOO0.OooO0o(US, "US");
                        String lowerCase = strGroup5.toLowerCase(US);
                        OooOOO0.OooO0o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        String strPattern = pattern.pattern();
                        OooOOO0.OooO0o(strPattern, "MONTH_PATTERN.pattern()");
                        iOooo0O0 = C33599OooOo0O.Oooo0O0(strPattern, lowerCase, 0, false, 6) / 4;
                    } else if (i2 == -1 && matcher.usePattern(Cookie.f124087OooOO0O).matches()) {
                        String strGroup6 = matcher.group(1);
                        OooOOO0.OooO0o(strGroup6, "matcher.group(1)");
                        i2 = Integer.parseInt(strGroup6);
                    }
                }
                iOooO00o = OooO00o(iOooO00o2 + 1, i, str, false);
            }
            if (70 <= i2 && i2 < 100) {
                i2 += 1900;
            }
            if (i2 >= 0 && i2 < 70) {
                i2 += 2000;
            }
            if (i2 < 1601) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (iOooo0O0 == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (1 > i4 || i4 >= 32) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i3 < 0 || i3 >= 24) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i5 < 0 || i5 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (i6 < 0 || i6 >= 60) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.f124305OooO0o);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i2);
            gregorianCalendar.set(2, iOooo0O0 - 1);
            gregorianCalendar.set(5, i4);
            gregorianCalendar.set(11, i3);
            gregorianCalendar.set(12, i5);
            gregorianCalendar.set(13, i6);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        private Companion() {
        }
    }

    public Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f124092OooO00o = str;
        this.f124093OooO0O0 = str2;
        this.f124094OooO0OO = j;
        this.f124095OooO0Oo = str3;
        this.f124097OooO0o0 = str4;
        this.f124096OooO0o = z;
        this.f124098OooO0oO = z2;
        this.f124099OooO0oo = z3;
        this.f124091OooO = z4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) obj;
        return OooOOO0.OooO0O0(cookie.f124092OooO00o, this.f124092OooO00o) && OooOOO0.OooO0O0(cookie.f124093OooO0O0, this.f124093OooO0O0) && cookie.f124094OooO0OO == this.f124094OooO0OO && OooOOO0.OooO0O0(cookie.f124095OooO0Oo, this.f124095OooO0Oo) && OooOOO0.OooO0O0(cookie.f124097OooO0o0, this.f124097OooO0o0) && cookie.f124096OooO0o == this.f124096OooO0o && cookie.f124098OooO0oO == this.f124098OooO0oO && cookie.f124099OooO0oo == this.f124099OooO0oo && cookie.f124091OooO == this.f124091OooO;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f124091OooO) + o00000.OooO0O0(o00000.OooO0O0(o00000.OooO0O0(OooO00o.OooO0O0(OooO00o.OooO0O0(C20703o000000o.OooO0O0(OooO00o.OooO0O0(OooO00o.OooO0O0(527, 31, this.f124092OooO00o), 31, this.f124093OooO0O0), 31, this.f124094OooO0OO), 31, this.f124095OooO0Oo), 31, this.f124097OooO0o0), 31, this.f124096OooO0o), 31, this.f124098OooO0oO), 31, this.f124099OooO0oo);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f124092OooO00o);
        sb.append('=');
        sb.append(this.f124093OooO0O0);
        if (this.f124099OooO0oo) {
            long j = this.f124094OooO0OO;
            if (j == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String str = DatesKt.f124436OooO00o.get().format(new Date(j));
                OooOOO0.OooO0o(str, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(str);
            }
        }
        if (!this.f124091OooO) {
            sb.append("; domain=");
            sb.append(this.f124095OooO0Oo);
        }
        sb.append("; path=");
        sb.append(this.f124097OooO0o0);
        if (this.f124096OooO0o) {
            sb.append("; secure");
        }
        if (this.f124098OooO0oO) {
            sb.append("; httponly");
        }
        String string = sb.toString();
        OooOOO0.OooO0o(string, "toString()");
        return string;
    }
}
