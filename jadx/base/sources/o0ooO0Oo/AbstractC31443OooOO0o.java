package o0ooO0Oo;

import OooOoo.C20593OooO0Oo;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.io.IOException;
import java.math.BigDecimal;

/* JADX INFO: renamed from: o0ooO0Oo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC31443OooOO0o extends AbstractC31434OooO0O0 {
    static {
        C31432OooO[] c31432OooOArr = C31432OooO.f112208OooOoO;
        C31432OooO[] c31432OooOArr2 = C31432OooO.f112208OooOoO;
    }

    public static AbstractC31443OooOO0o Oooo00o(String str) throws IOException {
        if (str.length() == 1) {
            char cCharAt = str.charAt(0);
            if ('0' <= cCharAt && cCharAt <= '9') {
                return C31432OooO.o0Oo0oo(((long) cCharAt) - 48);
            }
            if (cCharAt == '-' || cCharAt == '.') {
                return C31432OooO.f112209OooOoOO;
            }
            throw new IOException("Not a number: ".concat(str));
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 == '.' || cCharAt2 == 'e') {
                C31437OooO0o c31437OooO0o = new C31437OooO0o();
                try {
                    c31437OooO0o.f112224OooOoO0 = str;
                    c31437OooO0o.f112223OooOo = new BigDecimal(c31437OooO0o.f112224OooOoO0);
                    c31437OooO0o.o0Oo0oo();
                    return c31437OooO0o;
                } catch (NumberFormatException e) {
                    if (str.startsWith("--")) {
                        c31437OooO0o.f112224OooOoO0 = str.substring(1);
                    } else {
                        if (!str.matches("^0\\.0*\\-\\d+")) {
                            throw new IOException(C20593OooO0Oo.OooO0O0("Error expected floating point number actual='", str, "'"), e);
                        }
                        c31437OooO0o.f112224OooOoO0 = CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR + c31437OooO0o.f112224OooOoO0.replaceFirst("\\-", "");
                    }
                    try {
                        c31437OooO0o.f112223OooOo = new BigDecimal(c31437OooO0o.f112224OooOoO0);
                        c31437OooO0o.o0Oo0oo();
                        return c31437OooO0o;
                    } catch (NumberFormatException e2) {
                        throw new IOException(C20593OooO0Oo.OooO0O0("Error expected floating point number actual='", str, "'"), e2);
                    }
                }
            }
        }
        try {
            return str.charAt(0) == '+' ? C31432OooO.o0Oo0oo(Long.parseLong(str.substring(1))) : C31432OooO.o0Oo0oo(Long.parseLong(str));
        } catch (NumberFormatException unused) {
            if (((str.startsWith("+") || str.startsWith(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR)) ? str.substring(1) : str).matches("[0-9]*")) {
                return str.startsWith(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR) ? C31432OooO.f112210OooOoo : C31432OooO.f112211OooOoo0;
            }
            throw new IOException("Not a number: ".concat(str));
        }
    }

    public abstract float OooOooo();

    public abstract int Oooo0();

    public abstract long Oooo0OO();
}
