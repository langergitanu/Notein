package com.huawei.hms.common.util;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.aspose.slides.C22218Oooo;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.io.IOException;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Locale;
import org.json.JSONException;

/* JADX INFO: loaded from: classes6.dex */
public class Logger {

    /* JADX INFO: renamed from: a */
    public static final boolean f52523a = false;

    /* JADX INFO: renamed from: b */
    public static final String f52524b = "Logger";

    /* JADX INFO: renamed from: c */
    public static final String f52525c = "|";

    /* JADX INFO: renamed from: d */
    public static final int f52526d = 8;

    /* JADX INFO: renamed from: e */
    public static final int f52527e = 20;

    /* JADX INFO: renamed from: f */
    public static final String f52528f = "dynamic-api_";

    /* JADX INFO: renamed from: com.huawei.hms.common.util.Logger$b */
    public static class C17754b extends Throwable {

        /* JADX INFO: renamed from: d */
        public static final long f52529d = 7129050843360571879L;

        /* JADX INFO: renamed from: a */
        public String f52530a;

        /* JADX INFO: renamed from: b */
        public Throwable f52531b;

        /* JADX INFO: renamed from: c */
        public Throwable f52532c;

        public C17754b(Throwable th) {
            this.f52532c = th;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            Throwable th = this.f52531b;
            if (th == this) {
                return null;
            }
            return th;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.f52530a;
        }

        @Override // java.lang.Throwable
        public String toString() {
            Throwable th = this.f52532c;
            if (th == null) {
                return "";
            }
            String name = th.getClass().getName();
            if (this.f52530a == null) {
                return name;
            }
            String strConcat = name.concat(": ");
            if (this.f52530a.startsWith(strConcat)) {
                return this.f52530a;
            }
            StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(strConcat);
            sbOooO0OO.append(this.f52530a);
            return sbOooO0OO.toString();
        }

        /* JADX INFO: renamed from: a */
        public void m75889a(String str) {
            this.f52530a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public void m75888a(Throwable th) {
            this.f52531b = th;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m75870a(int i, String str, String str2) {
        return Log.println(i, m75872a(str), m75873a(str2, 7));
    }

    public static String anonymizeMessage(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (i % 2 == 1) {
                charArray[i] = '*';
            }
        }
        return new String(charArray);
    }

    /* JADX INFO: renamed from: d */
    public static void m75875d(String str, Object obj) {
        println(3, str, obj);
    }

    /* JADX INFO: renamed from: e */
    public static void m75877e(String str, Object obj) {
        println(6, str, obj);
    }

    public static String format(String str, Object... objArr) {
        return str == null ? "" : String.format(Locale.ROOT, str, objArr);
    }

    /* JADX INFO: renamed from: i */
    public static void m75880i(String str, Object obj) {
        println(4, str, obj);
    }

    public static boolean isLoggable(int i) {
        return Log.isLoggable(f52528f, i);
    }

    public static void println(int i, String str, Object obj) {
        if (i >= 3 && isLoggable(i)) {
            m75870a(i, str, obj == null ? CloudMetaExtra.DEFINE_NON_PARENT_ID : obj.toString());
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m75882v(String str, Object obj) {
        println(2, str, obj);
    }

    /* JADX INFO: renamed from: w */
    public static void m75884w(String str, Object obj) {
        println(5, str, obj);
    }

    /* JADX INFO: renamed from: a */
    public static String m75871a(int i) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length <= i) {
            return "";
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        return Process.myPid() + CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR + Process.myTid() + "|" + stackTraceElement.getFileName() + "|" + stackTraceElement.getClassName() + "|" + stackTraceElement.getMethodName() + "|" + stackTraceElement.getLineNumber();
    }

    /* JADX INFO: renamed from: d */
    public static void m75876d(String str, String str2, Object... objArr) {
        println(3, str, str2, objArr);
    }

    /* JADX INFO: renamed from: e */
    public static void m75878e(String str, String str2, Throwable th) {
        Log.e(m75872a(str), m75873a(str2, 5), m75874a(th));
    }

    /* JADX INFO: renamed from: i */
    public static void m75881i(String str, String str2, Object... objArr) {
        println(4, str, str2, objArr);
    }

    public static void println(int i, String str, String str2, Object... objArr) {
        if (i < 3) {
            return;
        }
        if (str2 == null) {
            Log.w(f52524b, "format is null, not log");
            return;
        }
        try {
            if (isLoggable(i)) {
                m75870a(i, str, format(str2, objArr));
            }
        } catch (IllegalFormatException e) {
            m75885w(f52524b, "log format error".concat(str2), e);
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m75883v(String str, String str2, Object... objArr) {
        println(2, str, str2, objArr);
    }

    /* JADX INFO: renamed from: w */
    public static void m75885w(String str, String str2, Throwable th) {
        Log.w(m75872a(str), m75873a(str2, 5), m75874a(th));
    }

    /* JADX INFO: renamed from: a */
    public static String m75872a(String str) {
        return OooO00o.OooO00o(f52528f, str);
    }

    /* JADX INFO: renamed from: e */
    public static void m75879e(String str, String str2, Object... objArr) {
        println(6, str, str2, objArr);
    }

    /* JADX INFO: renamed from: w */
    public static void m75886w(String str, String str2, Object... objArr) {
        println(5, str, str2, objArr);
    }

    /* JADX INFO: renamed from: a */
    public static String m75873a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return m75871a(i);
        }
        return m75871a(i) + "|" + str;
    }

    /* JADX INFO: renamed from: a */
    public static Throwable m75874a(Throwable th) {
        if (isLoggable(3)) {
            return th;
        }
        if (th == null) {
            return null;
        }
        int i = ((th instanceof IOException) || (th instanceof JSONException)) ? 8 : 20;
        C17754b c17754b = new C17754b(th);
        StackTraceElement[] stackTrace = c17754b.getStackTrace();
        if (stackTrace.length > i) {
            c17754b.setStackTrace((StackTraceElement[]) Arrays.copyOf(stackTrace, i));
        } else {
            c17754b.setStackTrace(stackTrace);
        }
        c17754b.m75889a(anonymizeMessage(th.getMessage()));
        Throwable cause = th.getCause();
        C17754b c17754b2 = c17754b;
        while (cause != null) {
            C17754b c17754b3 = new C17754b(cause);
            c17754b3.m75889a(anonymizeMessage(cause.getMessage()));
            c17754b2.m75888a(c17754b3);
            cause = cause.getCause();
            c17754b2 = c17754b3;
        }
        return c17754b;
    }
}
