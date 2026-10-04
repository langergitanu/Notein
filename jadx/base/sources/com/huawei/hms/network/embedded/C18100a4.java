package com.huawei.hms.network.embedded;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.a4 */
/* JADX INFO: loaded from: classes9.dex */
public class C18100a4 {

    /* JADX INFO: renamed from: a */
    public static final String f54151a = "HttpHeadersUtils";
    public static final TimeZone UTC = TimeZone.getTimeZone("GMT");

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal<DateFormat> f54152b = new a();

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.a4$a */
    public static class a extends ThreadLocal<DateFormat> {
        @Override // java.lang.ThreadLocal
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(C18100a4.UTC);
            return simpleDateFormat;
        }
    }

    public static Date parse(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        DateFormat dateFormat = f54152b.get();
        if (dateFormat == null) {
            Logger.m76967w(f54151a, "dateFormat == null");
            return null;
        }
        Date date = dateFormat.parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return date;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000b A[PHI: r0
      0x000b: PHI (r0v2 long) = (r0v0 long), (r0v1 long) binds: [B:4:0x0009, B:7:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int parseSeconds(String str, int i) {
        try {
            long j = Long.parseLong(str);
            long j2 = 2147483647L;
            if (j > 2147483647L) {
                j = j2;
            } else {
                j2 = 0;
                if (j < 0) {
                }
            }
            return (int) j;
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    public static int skipUntil(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    public static int skipWhitespace(String str, int i) {
        char cCharAt;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\t')) {
            i++;
        }
        return i;
    }

    public static int stringToInteger(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException e) {
                Logger.m76968w(f54151a, "String to Integer catch NumberFormatException.", e);
            }
        }
        return i;
    }

    public static long stringToLong(String str, long j) {
        if (str != null) {
            try {
                return Long.parseLong(str);
            } catch (NumberFormatException e) {
                Logger.m76968w(f54151a, "String to Long catch NumberFormatException.", e);
            }
        }
        return j;
    }
}
