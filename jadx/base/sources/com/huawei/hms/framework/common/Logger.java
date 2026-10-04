package com.huawei.hms.framework.common;

import android.text.TextUtils;
import android.util.Log;
import com.aspose.slides.C22218Oooo;
import com.aspose.slides.OooOOO;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.io.IOException;
import java.util.Arrays;
import java.util.IllegalFormatException;
import org.json.JSONException;

/* JADX INFO: loaded from: classes7.dex */
public class Logger {
    private static final boolean DEBUG = false;
    private static final int MAX_STACK_DEEP_LENGTH = 20;
    private static final int MAX_STACK_DEEP_LENGTH_NORMAL = 8;
    private static final String SPLIT = "|";
    private static final String TAG = "NetworkKit_Logger";
    private static final String TAG_NETWORKKIT_PRE = "NetworkKit_";
    private static final String TAG_NETWORK_SDK_PRE = "NetworkSdk_";
    private static ExtLogger extLogger = null;
    private static boolean kitPrint = true;

    public static class ThrowableWrapper extends Throwable {
        private static final long serialVersionUID = 7129050843360571879L;
        private String message;
        private Throwable ownerThrowable;
        private Throwable thisCause;

        /* JADX INFO: Access modifiers changed from: private */
        public void setCause(Throwable th) {
            this.thisCause = th;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            Throwable th = this.thisCause;
            if (th == this) {
                return null;
            }
            return th;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.message;
        }

        public void setMessage(String str) {
            this.message = str;
        }

        @Override // java.lang.Throwable
        public String toString() {
            Throwable th = this.ownerThrowable;
            if (th == null) {
                return "";
            }
            String name = th.getClass().getName();
            if (this.message == null) {
                return name;
            }
            String strConcat = name.concat(": ");
            if (this.message.startsWith(strConcat)) {
                return this.message;
            }
            StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(strConcat);
            sbOooO0OO.append(this.message);
            return sbOooO0OO.toString();
        }

        private ThrowableWrapper(Throwable th) {
            this.ownerThrowable = th;
            StackTraceElement[] stackTrace = th.getStackTrace();
            int i = ((th instanceof IOException) || (th instanceof JSONException)) ? 8 : 20;
            if (stackTrace.length > i) {
                setStackTrace((StackTraceElement[]) Arrays.copyOf(stackTrace, i));
            } else {
                setStackTrace(stackTrace);
            }
            setMessage(StringUtils.anonymizeMessage(th.getMessage()));
        }
    }

    private static String complexAppTag(String str) {
        return com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o(TAG_NETWORK_SDK_PRE, str);
    }

    private static String complexMsg(String str, int i) {
        return !TextUtils.isEmpty(str) ? OooOOO.OooO0O0(new StringBuilder(), getCallMethodInfo(i), "|", str) : getCallMethodInfo(i);
    }

    private static String complexTag(String str) {
        return com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o(TAG_NETWORKKIT_PRE, str);
    }

    /* JADX INFO: renamed from: d */
    public static void m76958d(String str, Object obj) {
        println(3, str, obj);
    }

    /* JADX INFO: renamed from: e */
    public static void m76960e(String str, Object obj) {
        println(6, str, obj);
    }

    private static void extLogPrintln(int i, String str, String str2) {
        if (i == 2) {
            extLogger.mo76955v(str, str2);
            return;
        }
        if (i == 3) {
            extLogger.mo76951d(str, str2);
            return;
        }
        if (i == 4) {
            extLogger.mo76954i(str, str2);
        } else if (i == 5) {
            extLogger.mo76956w(str, str2);
        } else {
            if (i != 6) {
                return;
            }
            extLogger.mo76952e(str, str2);
        }
    }

    private static String getCallMethodInfo(int i) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace.length <= i) {
            return "";
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        return Thread.currentThread().getName() + "|" + stackTraceElement.getFileName() + "|" + stackTraceElement.getClassName() + "|" + stackTraceElement.getMethodName() + "|" + stackTraceElement.getLineNumber();
    }

    private static Throwable getNewThrowable(Throwable th) {
        if (isLoggable(3)) {
            return th;
        }
        if (th == null) {
            return null;
        }
        ThrowableWrapper throwableWrapper = new ThrowableWrapper(th);
        Throwable cause = th.getCause();
        ThrowableWrapper throwableWrapper2 = throwableWrapper;
        while (cause != null) {
            ThrowableWrapper throwableWrapper3 = new ThrowableWrapper(cause);
            throwableWrapper2.setCause(throwableWrapper3);
            cause = cause.getCause();
            throwableWrapper2 = throwableWrapper3;
        }
        return throwableWrapper;
    }

    /* JADX INFO: renamed from: i */
    public static void m76963i(String str, Object obj) {
        println(4, str, obj);
    }

    private static boolean isAPPLoggable(int i) {
        return extLogger != null && i >= 3;
    }

    private static boolean isKitLoggable(int i) {
        return kitPrint && isLoggable(i);
    }

    public static boolean isLoggable(int i) {
        return Log.isLoggable(TAG_NETWORKKIT_PRE, i);
    }

    private static int logPrintln(int i, String str, String str2) {
        if (isAPPLoggable(i)) {
            extLogPrintln(i, complexAppTag(str), complexMsg(str2, 7));
        }
        if (isKitLoggable(i)) {
            return Log.println(i, complexTag(str), complexMsg(str2, 7));
        }
        return 1;
    }

    public static void println(int i, String str, Object obj) {
        if (i < 3) {
            return;
        }
        logPrintln(i, str, obj == null ? CloudMetaExtra.DEFINE_NON_PARENT_ID : obj.toString());
    }

    public static void setExtLogger(ExtLogger extLogger2, boolean z) {
        extLogger = extLogger2;
        kitPrint = z;
        m76963i(TAG, "logger = " + extLogger2 + z);
    }

    /* JADX INFO: renamed from: v */
    public static void m76966v(String str, String str2, Object... objArr) {
        println(2, str, str2, objArr);
    }

    /* JADX INFO: renamed from: w */
    public static void m76967w(String str, Object obj) {
        println(5, str, obj);
    }

    /* JADX INFO: renamed from: d */
    public static void m76959d(String str, String str2, Object... objArr) {
        println(3, str, str2, objArr);
    }

    /* JADX INFO: renamed from: e */
    public static void m76962e(String str, String str2, Object... objArr) {
        println(6, str, str2, objArr);
    }

    /* JADX INFO: renamed from: i */
    public static void m76964i(String str, String str2, Object... objArr) {
        println(4, str, str2, objArr);
    }

    public static void println(int i, String str, String str2, Object... objArr) {
        if (i < 3) {
            return;
        }
        if (str2 == null) {
            Log.w(TAG, "format is null, not log");
            return;
        }
        try {
            logPrintln(i, str, StringUtils.format(str2, objArr));
        } catch (IllegalFormatException e) {
            m76968w(TAG, "log format error".concat(str2), e);
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m76965v(String str, Object obj) {
        println(2, str, obj);
    }

    /* JADX INFO: renamed from: w */
    public static void m76969w(String str, String str2, Object... objArr) {
        println(5, str, str2, objArr);
    }

    /* JADX INFO: renamed from: e */
    public static void m76961e(String str, String str2, Throwable th) {
        if (isAPPLoggable(6)) {
            extLogger.mo76953e(complexAppTag(str), complexMsg(str2, 5), getNewThrowable(th));
        }
        if (kitPrint) {
            Log.e(complexTag(str), complexMsg(str2, 5), getNewThrowable(th));
        }
    }

    /* JADX INFO: renamed from: w */
    public static void m76968w(String str, String str2, Throwable th) {
        if (isAPPLoggable(5)) {
            extLogger.mo76957w(complexAppTag(str), complexMsg(str2, 5), getNewThrowable(th));
        }
        if (kitPrint) {
            Log.w(complexTag(str), complexMsg(str2, 5), getNewThrowable(th));
        }
    }
}
