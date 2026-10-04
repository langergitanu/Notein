package oO0oOo0;

import com.aspose.slides.C22218Oooo;
import com.aspose.words.internal.C22246OooO0oo;
import com.huawei.hms.network.embedded.C18241k5;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.text.ParseException;
import java.util.TimeZone;
import oO0oO0Oo.AbstractC34036OooOoOO;
import oO0oO0Oo.C34025OooOOO0;
import oO0oO0Oo.C34044Oooo0O0;
import oO0oO0Oo.InterfaceC34017OooO0o;
import oO0oO0Oo.InterfaceC34019OooO0oO;
import oOO000oO.C34336OooO0o;

/* JADX INFO: renamed from: oO0oOo0.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34164OooOo0o extends oO0oO0Oo.OooOo00 implements InterfaceC34017OooO0o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final AbstractC34036OooOoOO f122764OooOo0o;

    public C34164OooOo0o(AbstractC34036OooOoOO abstractC34036OooOoOO) {
        if (!(abstractC34036OooOoOO instanceof C34044Oooo0O0) && !(abstractC34036OooOoOO instanceof C34025OooOOO0)) {
            throw new IllegalArgumentException("unknown object passed to Time");
        }
        this.f122764OooOo0o = abstractC34036OooOoOO;
    }

    public static C34164OooOo0o OooO0oo(InterfaceC34019OooO0oO interfaceC34019OooO0oO) {
        if (interfaceC34019OooO0oO == null || (interfaceC34019OooO0oO instanceof C34164OooOo0o)) {
            return (C34164OooOo0o) interfaceC34019OooO0oO;
        }
        if (interfaceC34019OooO0oO instanceof C34044Oooo0O0) {
            return new C34164OooOo0o((C34044Oooo0O0) interfaceC34019OooO0oO);
        }
        if (interfaceC34019OooO0oO instanceof C34025OooOOO0) {
            return new C34164OooOo0o((C34025OooOOO0) interfaceC34019OooO0oO);
        }
        throw new IllegalArgumentException("unknown object in factory: ".concat(interfaceC34019OooO0oO.getClass().getName()));
    }

    @Override // oO0oO0Oo.OooOo00, oO0oO0Oo.InterfaceC34019OooO0oO
    public final AbstractC34036OooOoOO OooO0o() {
        return this.f122764OooOo0o;
    }

    public final String toString() {
        String str;
        StringBuilder sb;
        String strSubstring;
        String string;
        AbstractC34036OooOoOO abstractC34036OooOoOO = this.f122764OooOo0o;
        if (abstractC34036OooOoOO instanceof C34044Oooo0O0) {
            String strOooO00o = C34336OooO0o.OooO00o(((C34044Oooo0O0) abstractC34036OooOoOO).f122387OooOo0o);
            if (strOooO00o.indexOf(45) >= 0 || strOooO00o.indexOf(43) >= 0) {
                int iIndexOf = strOooO00o.indexOf(45);
                if (iIndexOf < 0) {
                    iIndexOf = strOooO00o.indexOf(43);
                }
                if (iIndexOf == strOooO00o.length() - 3) {
                    strOooO00o = strOooO00o.concat("00");
                }
                if (iIndexOf == 10) {
                    sb = new StringBuilder();
                    sb.append(strOooO00o.substring(0, 10));
                    sb.append("00GMT");
                    sb.append(strOooO00o.substring(10, 13));
                    sb.append(C18241k5.f55433h);
                    strSubstring = strOooO00o.substring(13, 15);
                } else {
                    sb = new StringBuilder();
                    sb.append(strOooO00o.substring(0, 12));
                    sb.append("GMT");
                    sb.append(strOooO00o.substring(12, 15));
                    sb.append(C18241k5.f55433h);
                    strSubstring = strOooO00o.substring(15, 17);
                }
                sb.append(strSubstring);
                string = sb.toString();
            } else {
                string = strOooO00o.length() == 11 ? C22246OooO0oo.OooO00o(new StringBuilder(), strOooO00o, "00GMT+00:00", 0, 10) : C22246OooO0oo.OooO00o(new StringBuilder(), strOooO00o, "GMT+00:00", 0, 12);
            }
            return string.charAt(0) < '5' ? "20".concat(string) : "19".concat(string);
        }
        C34025OooOOO0 c34025OooOOO0 = (C34025OooOOO0) abstractC34036OooOoOO;
        String strOooO00o2 = C34336OooO0o.OooO00o(c34025OooOOO0.f122340OooOo0o);
        if (androidx.core.content.OooO0O0.OooO00o(1, strOooO00o2) == 'Z') {
            return strOooO00o2.substring(0, strOooO00o2.length() - 1) + "GMT+00:00";
        }
        int length = strOooO00o2.length();
        char cCharAt = strOooO00o2.charAt(length - 6);
        if ((cCharAt == '-' || cCharAt == '+') && strOooO00o2.indexOf("GMT") == length - 9) {
            return strOooO00o2;
        }
        int length2 = strOooO00o2.length();
        int i = length2 - 5;
        char cCharAt2 = strOooO00o2.charAt(i);
        if (cCharAt2 == '-' || cCharAt2 == '+') {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strOooO00o2.substring(0, i));
            sb2.append("GMT");
            int i2 = length2 - 2;
            sb2.append(strOooO00o2.substring(i, i2));
            sb2.append(C18241k5.f55433h);
            return androidx.concurrent.futures.OooO0O0.OooO00o(strOooO00o2, i2, sb2);
        }
        int length3 = strOooO00o2.length() - 3;
        char cCharAt3 = strOooO00o2.charAt(length3);
        if (cCharAt3 == '-' || cCharAt3 == '+') {
            return strOooO00o2.substring(0, length3) + "GMT" + strOooO00o2.substring(length3) + ":00";
        }
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(strOooO00o2);
        TimeZone timeZone = TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset();
        if (rawOffset < 0) {
            rawOffset = -rawOffset;
            str = CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR;
        } else {
            str = "+";
        }
        int i3 = rawOffset / 3600000;
        int i4 = (rawOffset - (3600000 * i3)) / 60000;
        try {
            if (timeZone.useDaylightTime()) {
                if (c34025OooOOO0.OooOo00()) {
                    strOooO00o2 = C34025OooOOO0.OooOo0O(strOooO00o2);
                }
                if (timeZone.inDaylightTime(c34025OooOOO0.OooOOo0().parse(strOooO00o2 + "GMT" + str + C34025OooOOO0.OooOOo(i3) + C18241k5.f55433h + C34025OooOOO0.OooOOo(i4)))) {
                    i3 += str.equals("+") ? 1 : -1;
                }
            }
        } catch (ParseException unused) {
        }
        sbOooO0OO.append("GMT" + str + C34025OooOOO0.OooOOo(i3) + C18241k5.f55433h + C34025OooOOO0.OooOOo(i4));
        return sbOooO0OO.toString();
    }
}
