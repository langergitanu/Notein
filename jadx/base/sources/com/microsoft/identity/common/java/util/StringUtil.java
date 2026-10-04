package com.microsoft.identity.common.java.util;

import OooO0o.C20424OooO0Oo;
import OoooooO.C21445Oooo;
import androidx.concurrent.futures.OooO00o;
import com.aspose.slides.C22226Oooo0oo;
import com.microsoft.identity.common.java.AuthenticationConstants;
import com.microsoft.identity.common.java.logging.Logger;
import com.microsoft.identity.common.java.util.ported.ObjectUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Pattern;
import oO0000oO.C31932OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public class StringUtil {
    private static final String RFC3339_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss'Z'";
    private static String TAG = "StringUtil";
    private static final String TOKEN_HASH_ALGORITHM = "SHA256";

    public static String RFC3339DateToString(Date date) {
        if (date == null) {
            throw new NullPointerException("date is marked non-null but is null");
        }
        Logger.verbose(TAG + "RFC3339DateToString", "RFC3339DateToString is called.");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(RFC3339_DATE_FORMAT, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(date);
    }

    public static Date RFC3339StringToDate(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("dateStr is marked non-null but is null");
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(RFC3339_DATE_FORMAT, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.parse(str);
    }

    public static byte[] base64Decode(String str) {
        if (str != null) {
            return C31932OooO00o.OooO00o(str, 2);
        }
        throw new NullPointerException("encodedString is marked non-null but is null");
    }

    public static byte[] base64DecodeUrlSafeString(String str) {
        if (str != null) {
            return C31932OooO00o.OooO00o(str, 11);
        }
        throw new NullPointerException("encodedString is marked non-null but is null");
    }

    public static String base64Encode(byte[] bArr) {
        return C31932OooO00o.OooO0OO(bArr, 2);
    }

    public static boolean containsSubString(String str, String str2) {
        if (isNullOrEmpty(str)) {
            return false;
        }
        return str.contains(str2);
    }

    public static String createHash(String str) throws NoSuchAlgorithmException {
        if (isNullOrEmpty(str)) {
            return str;
        }
        MessageDigest messageDigest = MessageDigest.getInstance(TOKEN_HASH_ALGORITHM);
        Charset charset = AuthenticationConstants.ENCODING_UTF8;
        return new String(C31932OooO00o.OooO0O0(messageDigest.digest(str.getBytes(charset)), 2), charset);
    }

    public static String encodeUrlSafeString(byte[] bArr) {
        if (bArr != null) {
            return C31932OooO00o.OooO0OO(bArr, 11);
        }
        throw new NullPointerException("bytesToEncode is marked non-null but is null");
    }

    public static boolean equalsIgnoreCase(String str, String str2) {
        if (ObjectUtils.equals(str, str2)) {
            return true;
        }
        return str != null && str.equalsIgnoreCase(str2);
    }

    public static boolean equalsIgnoreCaseTrim(String str, String str2) {
        if (str != str2) {
            return str2 != null && equalsIgnoreCase(str, str2.trim());
        }
        return true;
    }

    public static boolean equalsIgnoreCaseTrimBoth(String str, String str2) {
        return equalsIgnoreCaseTrim(str != null ? str.trim() : null, str2);
    }

    public static String fromByteArray(byte[] bArr) {
        return new String(bArr, AuthenticationConstants.ENCODING_UTF8);
    }

    public static String getStackTraceAsString(Throwable th) {
        if (th == null) {
            throw new NullPointerException("throwable is marked non-null but is null");
        }
        PrintWriter printWriter = new PrintWriter(new StringWriter());
        th.printStackTrace(printWriter);
        return printWriter.toString();
    }

    public static List<String> getStringTokens(String str, String str2) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, str2);
        ArrayList arrayList = new ArrayList();
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            if (!isNullOrEmpty(strNextToken)) {
                arrayList.add(strNextToken);
            }
        }
        return arrayList;
    }

    public static Map.Entry<String, String> getTenantInfo(String str) {
        String str2;
        String str3;
        if (str == null) {
            throw new NullPointerException("homeAccountId is marked non-null but is null");
        }
        String[] strArrSplit = str.split("\\.");
        if (2 != strArrSplit.length || isNullOrEmpty(strArrSplit[0]) || isNullOrEmpty(strArrSplit[1])) {
            Logger.warn(TAG, "We had a home account id that could not be split correctly, We expected it to split into 2 parts but instead we had " + strArrSplit.length + " when splitting the string on dot ('.')");
            String str4 = TAG;
            StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("We had a home account id that could not be split correctly, Its value was: '", str, "', and we expected it to split into 2 parts but instead we had ");
            sbOooO0o0.append(strArrSplit.length);
            sbOooO0o0.append(" when splitting the string on dot ('.')");
            Logger.warnPII(str4, sbOooO0o0.toString());
            str2 = null;
            str3 = null;
        } else {
            str2 = strArrSplit[0];
            str3 = strArrSplit[1];
        }
        return new AbstractMap.SimpleEntry(str2, str3);
    }

    public static String getUIdFromHomeAccountId(String str) {
        if (!isNullOrEmpty(str)) {
            String[] strArrSplit = str.split(Pattern.quote("."));
            if (strArrSplit.length == 2) {
                Logger.info(TAG + ":getUIdFromHomeAccountId", "Home account id is tenanted, returning uid ");
                return strArrSplit[0];
            }
            if (strArrSplit.length == 1) {
                Logger.info(TAG + ":getUIdFromHomeAccountId", "Home account id not tenanted, it's the uid added by v1 broker ");
                return strArrSplit[0];
            }
        }
        C21445Oooo.OooO0Oo(new StringBuilder(), TAG, ":getUIdFromHomeAccountId", "Home Account id doesn't have uid or tenant id information, returning null ");
        return null;
    }

    public static boolean hasPrefixInHeader(String str, String str2) {
        return str.startsWith(str2) && str.length() > str2.length() + 2 && Character.isWhitespace(str.charAt(str2.length()));
    }

    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static boolean isUuid(String str) {
        if (str == null) {
            throw new NullPointerException("inputString is marked non-null but is null");
        }
        try {
            UUID.fromString(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public static <T extends CharSequence> String join(CharSequence charSequence, Iterable<T> iterable) {
        if (iterable == null) {
            throw new NullPointerException("segments is marked non-null but is null");
        }
        Iterator<T> it = iterable.iterator();
        if (!it.hasNext()) {
            return "";
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next instanceof String ? (String) next : next.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) next);
        while (it.hasNext()) {
            sb.append(charSequence);
            sb.append((CharSequence) it.next());
        }
        return sb.toString();
    }

    public static void overwriteWithNull(char[] cArr) {
        int length = cArr == null ? 0 : cArr.length;
        for (int i = 0; i < length; i++) {
            cArr[i] = 0;
        }
    }

    public static String removeQuoteInHeaderValue(String str) {
        if (isNullOrEmpty(str)) {
            return null;
        }
        return str.replace("\"", "");
    }

    public static String sanitizeNull(String str) {
        return str == null ? "" : str;
    }

    public static String sanitizeNullAndLowercaseAndTrim(String str) {
        return str == null ? "" : str.toLowerCase(Locale.US).trim();
    }

    public static ArrayList<String> splitWithQuotes(String str, char c) {
        ArrayList<String> arrayList = new ArrayList<>();
        int i = 0;
        boolean z = false;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == c && !z) {
                String strSubstring = str.substring(i, i2);
                if (!isNullOrEmpty(strSubstring.trim())) {
                    arrayList.add(strSubstring);
                }
                i = i2 + 1;
            } else if (str.charAt(i2) == '\"') {
                z = !z;
            }
        }
        String strSubstring2 = str.substring(i);
        if (!isNullOrEmpty(strSubstring2.trim())) {
            arrayList.add(strSubstring2);
        }
        return arrayList;
    }

    public static void throwIfArgumentIsNullOrEmpty(String str, String str2, String str3) throws NullPointerException {
        if (str2 == null) {
            throw new NullPointerException("argumentName is marked non-null but is null");
        }
        if (str3 == null) {
            throw new NullPointerException("methodName is marked non-null but is null");
        }
        if (isNullOrEmpty(str)) {
            Logger.error(OooO00o.OooO0OO(new StringBuilder(), TAG, str3), str2.concat(" is null or empty."), null);
            throw new NullPointerException(str2.concat(" is null or empty."));
        }
    }

    public static byte[] toByteArray(String str) {
        if (str != null) {
            return str.getBytes(AuthenticationConstants.ENCODING_UTF8);
        }
        throw new NullPointerException("string is marked non-null but is null");
    }

    public static String urlFormDecode(String str) throws UnsupportedEncodingException {
        return isNullOrEmpty(str) ? "" : URLDecoder.decode(str, "UTF-8");
    }

    public static String urlFormEncode(String str) throws UnsupportedEncodingException {
        return URLEncoder.encode(str, "UTF-8");
    }

    public static byte[] base64Decode(String str, int i, String str2) {
        if (str == null) {
            throw new NullPointerException("input is marked non-null but is null");
        }
        if (str2 != null) {
            String strOooO0OO = OooO00o.OooO0OO(new StringBuilder(), TAG, ":base64Decode");
            try {
                return C31932OooO00o.OooO00o(str, i);
            } catch (IllegalArgumentException e) {
                StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(str2, " ");
                sbOooO0OO.append(e.getMessage());
                Logger.error(strOooO0OO, sbOooO0OO.toString(), null);
                throw e;
            }
        }
        throw new NullPointerException("failureMessage is marked non-null but is null");
    }

    public static String encodeUrlSafeString(String str) {
        if (str != null) {
            return C31932OooO00o.OooO0OO(toByteArray(str), 11);
        }
        throw new NullPointerException("stringToEncode is marked non-null but is null");
    }
}
