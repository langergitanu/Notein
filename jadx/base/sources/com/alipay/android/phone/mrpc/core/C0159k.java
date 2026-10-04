package com.alipay.android.phone.mrpc.core;

import android.text.format.Time;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0159k {

    /* JADX INFO: renamed from: a */
    public static final Pattern f65a = Pattern.compile("([0-9]{1,2})[- ]([A-Za-z]{3,9})[- ]([0-9]{2,4})[ ]([0-9]{1,2}:[0-9][0-9]:[0-9][0-9])");

    /* JADX INFO: renamed from: b */
    public static final Pattern f66b = Pattern.compile("[ ]([A-Za-z]{3,9})[ ]+([0-9]{1,2})[ ]([0-9]{1,2}:[0-9][0-9]:[0-9][0-9])[ ]([0-9]{2,4})");

    /* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.k$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f67a;

        /* JADX INFO: renamed from: b */
        public int f68b;

        /* JADX INFO: renamed from: c */
        public int f69c;

        public a(int i, int i2, int i3) {
            this.f67a = i;
            this.f68b = i2;
            this.f69c = i3;
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m71a(String str) {
        int iM73c;
        int iM74d;
        int iM72b;
        a aVarM75e;
        int i;
        int i2;
        int i3;
        Matcher matcher = f65a.matcher(str);
        if (matcher.find()) {
            iM72b = m72b(matcher.group(1));
            iM73c = m73c(matcher.group(2));
            iM74d = m74d(matcher.group(3));
            aVarM75e = m75e(matcher.group(4));
        } else {
            Matcher matcher2 = f66b.matcher(str);
            if (!matcher2.find()) {
                throw new IllegalArgumentException();
            }
            iM73c = m73c(matcher2.group(1));
            int iM72b2 = m72b(matcher2.group(2));
            a aVarM75e2 = m75e(matcher2.group(3));
            iM74d = m74d(matcher2.group(4));
            iM72b = iM72b2;
            aVarM75e = aVarM75e2;
        }
        if (iM74d >= 2038) {
            i2 = 0;
            i3 = 2038;
            i = 1;
        } else {
            i = iM72b;
            i2 = iM73c;
            i3 = iM74d;
        }
        Time time = new Time("UTC");
        time.set(aVarM75e.f69c, aVarM75e.f68b, aVarM75e.f67a, i, i2, i3);
        return time.toMillis(false);
    }

    /* JADX INFO: renamed from: b */
    public static int m72b(String str) {
        if (str.length() != 2) {
            return str.charAt(0) - '0';
        }
        return (str.charAt(1) - '0') + ((str.charAt(0) - '0') * 10);
    }

    /* JADX INFO: renamed from: c */
    public static int m73c(String str) {
        int lowerCase = (Character.toLowerCase(str.charAt(2)) + (Character.toLowerCase(str.charAt(1)) + Character.toLowerCase(str.charAt(0)))) - 291;
        if (lowerCase == 9) {
            return 11;
        }
        if (lowerCase == 10) {
            return 1;
        }
        if (lowerCase == 22) {
            return 0;
        }
        if (lowerCase == 26) {
            return 7;
        }
        if (lowerCase == 29) {
            return 2;
        }
        if (lowerCase == 32) {
            return 3;
        }
        if (lowerCase == 40) {
            return 6;
        }
        if (lowerCase == 42) {
            return 5;
        }
        if (lowerCase == 48) {
            return 10;
        }
        switch (lowerCase) {
            case 35:
                return 9;
            case 36:
                return 4;
            case 37:
                return 8;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m74d(String str) {
        if (str.length() == 2) {
            int iCharAt = (str.charAt(1) - '0') + ((str.charAt(0) - '0') * 10);
            return iCharAt >= 70 ? iCharAt + 1900 : iCharAt + 2000;
        }
        if (str.length() == 3) {
            return (str.charAt(2) - '0') + ((str.charAt(1) - '0') * 10) + ((str.charAt(0) - '0') * 100) + 1900;
        }
        if (str.length() == 4) {
            return (str.charAt(3) - '0') + ((str.charAt(2) - '0') * 10) + ((str.charAt(1) - '0') * 100) + ((str.charAt(0) - '0') * 1000);
        }
        return 1970;
    }

    /* JADX INFO: renamed from: e */
    public static a m75e(String str) {
        int iCharAt = str.charAt(0) - '0';
        int i = 1;
        if (str.charAt(1) != ':') {
            iCharAt = (iCharAt * 10) + (str.charAt(1) - '0');
            i = 2;
        }
        return new a(iCharAt, (str.charAt(i + 2) - '0') + ((str.charAt(i + 1) - '0') * 10), (str.charAt(i + 5) - '0') + ((str.charAt(i + 4) - '0') * 10));
    }
}
