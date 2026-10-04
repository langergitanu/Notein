package com.microsoft.identity.common.java.logging;

import OooOO0.OooO0OO;
import OooOoo.C20593OooO0Oo;
import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.microsoft.identity.common.java.util.StringUtil;
import com.microsoft.identity.common.java.util.ThrowableUtil;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes9.dex */
public class Logger {
    private static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    private static final String UNSET = "UNSET";
    private static final SimpleDateFormat sDateTimeFormatter;
    private static final Object $LOCK = new Object[0];
    private static final ExecutorService sLogExecutor = Executors.newSingleThreadExecutor();
    private static LogLevel sLogLevel = LogLevel.VERBOSE;
    private static boolean sAllowPii = false;
    private static String sPlatformString = "";
    private static final ReentrantReadWriteLock sLoggersLock = new ReentrantReadWriteLock();
    private static final Map<String, ILoggerCallback> sLoggers = new HashMap();

    public enum LogLevel {
        NO_LOG,
        ERROR,
        WARN,
        INFO,
        VERBOSE,
        UNDEFINED
    }

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT, Locale.getDefault());
        sDateTimeFormatter = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    public static void error(String str, String str2, Throwable th) {
        log(str, LogLevel.ERROR, null, str2, th, false);
    }

    public static void errorPII(String str, String str2, Throwable th) {
        log(str, LogLevel.ERROR, null, str2, th, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String formatMessage(String str, String str2, String str3, String str4, Throwable th) {
        String str5;
        if (str4 == null) {
            throw new NullPointerException("dateTimeStamp is marked non-null but is null");
        }
        if (StringUtil.isNullOrEmpty(str3)) {
            str3 = "N/A";
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(str4);
        OooO0OO.OooO0o0(sb, StringUtil.isNullOrEmpty(str) ? " " : C20593OooO0Oo.OooO0O0(" - ", str, " "), "- ", str2, "] ");
        sb.append(str3);
        if (th == null) {
            str5 = "";
        } else {
            str5 = IOUtils.LINE_SEPARATOR_UNIX + ThrowableUtil.getStackTraceAsString(th);
        }
        sb.append(str5);
        return sb.toString();
    }

    public static synchronized String getDiagnosticContextMetadata() {
        return getDiagnosticContextMetadata(null);
    }

    public static LogLevel getLogLevel() {
        return sLogLevel;
    }

    public static void info(String str, String str2) {
        log(str, LogLevel.INFO, null, str2, null, false);
    }

    public static void infoPII(String str, String str2) {
        log(str, LogLevel.INFO, null, str2, null, true);
    }

    public static boolean isAllowPii() {
        return sAllowPii;
    }

    private static void log(final String str, final LogLevel logLevel, String str2, final String str3, final Throwable th, final boolean z) {
        if (logLevel == null) {
            throw new NullPointerException("logLevel is marked non-null but is null");
        }
        if (sLogLevel == LogLevel.NO_LOG || logLevel.compareTo(sLogLevel) > 0) {
            return;
        }
        if (sAllowPii || !z) {
            final Date date = new Date();
            final String diagnosticContextMetadata = getDiagnosticContextMetadata(str2);
            sLogExecutor.execute(new Runnable() { // from class: com.microsoft.identity.common.java.logging.Logger.1
                @Override // java.lang.Runnable
                public void run() {
                    String message = Logger.formatMessage(diagnosticContextMetadata, Logger.sPlatformString, str3, Logger.sDateTimeFormatter.format(date), th);
                    Logger.sLoggersLock.readLock().lock();
                    try {
                        Iterator it = Logger.sLoggers.keySet().iterator();
                        while (it.hasNext()) {
                            try {
                                ILoggerCallback iLoggerCallback = (ILoggerCallback) Logger.sLoggers.get((String) it.next());
                                if (iLoggerCallback != null) {
                                    iLoggerCallback.log(str, logLevel, message, z);
                                }
                            } catch (Exception unused) {
                            }
                        }
                    } finally {
                        Logger.sLoggersLock.readLock().unlock();
                    }
                }
            });
        }
    }

    public static synchronized void resetLogger() {
        ReentrantReadWriteLock reentrantReadWriteLock = sLoggersLock;
        reentrantReadWriteLock.writeLock().lock();
        try {
            sLoggers.clear();
            sAllowPii = false;
            sPlatformString = "";
            sLogLevel = LogLevel.VERBOSE;
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            sLoggersLock.writeLock().unlock();
            throw th;
        }
    }

    public static void setAllowPii(boolean z) {
        sAllowPii = z;
    }

    public static void setLogLevel(LogLevel logLevel) {
        sLogLevel = logLevel;
    }

    public static boolean setLogger(String str, ILoggerCallback iLoggerCallback) {
        if (str == null) {
            throw new NullPointerException("identifier is marked non-null but is null");
        }
        ReentrantReadWriteLock reentrantReadWriteLock = sLoggersLock;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (iLoggerCallback == null) {
                sLoggers.remove(str);
            } else {
                Map<String, ILoggerCallback> map = sLoggers;
                if (map.containsValue(iLoggerCallback)) {
                    reentrantReadWriteLock.writeLock().unlock();
                    return false;
                }
                map.put(str, iLoggerCallback);
            }
            reentrantReadWriteLock.writeLock().unlock();
            return true;
        } catch (Throwable th) {
            sLoggersLock.writeLock().unlock();
            throw th;
        }
    }

    public static void setPlatformString(String str) {
        synchronized ($LOCK) {
            sPlatformString = str;
        }
    }

    public static void verbose(String str, String str2) {
        log(str, LogLevel.VERBOSE, null, str2, null, false);
    }

    public static void verbosePII(String str, String str2) {
        log(str, LogLevel.VERBOSE, null, str2, null, true);
    }

    public static void warn(String str, String str2) {
        log(str, LogLevel.WARN, null, str2, null, false);
    }

    public static void warnPII(String str, String str2) {
        log(str, LogLevel.WARN, null, str2, null, true);
    }

    public static void error(String str, String str2, String str3, Throwable th) {
        log(str, LogLevel.ERROR, str2, str3, th, false);
    }

    public static void errorPII(String str, String str2, String str3, Throwable th) {
        log(str, LogLevel.ERROR, str2, str3, th, true);
    }

    private static String getDiagnosticContextMetadata(String str) {
        IRequestContext requestContext = DiagnosticContext.INSTANCE.getRequestContext();
        String str2 = requestContext.get("thread_id");
        if (StringUtil.isNullOrEmpty(str2)) {
            str2 = "UNSET";
        }
        if (StringUtil.isNullOrEmpty(str)) {
            str = requestContext.get("correlation_id");
            if (StringUtil.isNullOrEmpty(str)) {
                str = "UNSET";
            }
        }
        return C22237OooO0o0.OooO00o("thread_id: ", str2, ", correlation_id: ", str);
    }

    public static void info(String str, String str2, String str3) {
        log(str, LogLevel.INFO, str2, str3, null, false);
    }

    public static void infoPII(String str, String str2, String str3) {
        log(str, LogLevel.INFO, str2, str3, null, true);
    }

    public static void verbose(String str, String str2, String str3) {
        log(str, LogLevel.VERBOSE, str2, str3, null, false);
    }

    public static void verbosePII(String str, String str2, String str3) {
        log(str, LogLevel.VERBOSE, str2, str3, null, true);
    }

    public static void warn(String str, String str2, String str3) {
        log(str, LogLevel.WARN, str2, str3, null, false);
    }

    public static void warnPII(String str, String str2, String str3) {
        log(str, LogLevel.WARN, str2, str3, null, true);
    }
}
