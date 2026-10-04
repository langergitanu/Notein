package o0OOo0o;

import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.math.BigInteger;
import java.util.regex.Pattern;
import oO0o0O0o.C33595OooOOo;

/* JADX INFO: loaded from: classes9.dex */
public final class o00000OO {
    public static String OooO00o(String str) {
        Pattern patternCompile = Pattern.compile("^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$");
        kotlin.jvm.internal.OooOOO0.OooO0o(patternCompile, "compile(...)");
        if (!patternCompile.matcher(str).matches()) {
            throw new IllegalArgumentException("Invalid UUID format: ".concat(str));
        }
        try {
            BigInteger bigInteger = new BigInteger(C33595OooOOo.OooOo0O(str, CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, ""), 16);
            if (bigInteger.equals(BigInteger.ZERO)) {
                return "0";
            }
            StringBuilder sb = new StringBuilder();
            while (bigInteger.compareTo(BigInteger.ZERO) > 0) {
                sb.append("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".charAt(bigInteger.remainder(BigInteger.valueOf(62L)).intValue()));
                bigInteger = bigInteger.divide(BigInteger.valueOf(62L));
            }
            String string = sb.reverse().toString();
            kotlin.jvm.internal.OooOOO0.OooO0o(string, "toString(...)");
            return string;
        } catch (Exception e) {
            throw new IllegalArgumentException("Failed to convert UUID to Base62: ".concat(str), e);
        }
    }
}
