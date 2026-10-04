package com.microsoft.identity.common.internal.logging;

import com.microsoft.identity.common.java.telemetry.Telemetry;
import com.microsoft.identity.common.java.telemetry.events.DeprecatedApiUsageEvent;
import com.microsoft.identity.common.logging.Logger;

/* JADX INFO: loaded from: classes9.dex */
@Deprecated
public class Logger extends com.microsoft.identity.common.logging.Logger {
    private static final Logger INSTANCE = new Logger();
    private static boolean sEmitDeprecationEvent = true;
    private final com.microsoft.identity.common.logging.Logger mInstanceDelegate = com.microsoft.identity.common.logging.Logger.getInstance();

    /* JADX INFO: renamed from: com.microsoft.identity.common.internal.logging.Logger$2 */
    public static /* synthetic */ class C185972 {

        /* JADX INFO: renamed from: $SwitchMap$com$microsoft$identity$common$internal$logging$Logger$LogLevel */
        static final /* synthetic */ int[] f57067x33d7f594;
        static final /* synthetic */ int[] $SwitchMap$com$microsoft$identity$common$logging$Logger$LogLevel;

        static {
            int[] iArr = new int[LogLevel.values().length];
            f57067x33d7f594 = iArr;
            try {
                iArr[LogLevel.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57067x33d7f594[LogLevel.WARN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57067x33d7f594[LogLevel.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57067x33d7f594[LogLevel.VERBOSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Logger.LogLevel.values().length];
            $SwitchMap$com$microsoft$identity$common$logging$Logger$LogLevel = iArr2;
            try {
                iArr2[Logger.LogLevel.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$microsoft$identity$common$logging$Logger$LogLevel[Logger.LogLevel.WARN.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$microsoft$identity$common$logging$Logger$LogLevel[Logger.LogLevel.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$microsoft$identity$common$logging$Logger$LogLevel[Logger.LogLevel.VERBOSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public enum LogLevel {
        ERROR,
        WARN,
        INFO,
        VERBOSE
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LogLevel adapt(Logger.LogLevel logLevel) {
        int i = C185972.$SwitchMap$com$microsoft$identity$common$logging$Logger$LogLevel[logLevel.ordinal()];
        if (i == 1) {
            return LogLevel.ERROR;
        }
        if (i == 2) {
            return LogLevel.WARN;
        }
        if (i == 3) {
            return LogLevel.INFO;
        }
        if (i == 4) {
            return LogLevel.VERBOSE;
        }
        throw new RuntimeException("Unknown or invalid log level");
    }

    private static void emitDeprecationEvent() {
        if (sEmitDeprecationEvent) {
            sEmitDeprecationEvent = false;
            Telemetry.emit(new DeprecatedApiUsageEvent().putDeprecatedClassUsage(Logger.class));
        }
    }

    public static void error(String str, String str2, Throwable th) {
        emitDeprecationEvent();
        com.microsoft.identity.common.logging.Logger.error(str, str2, th);
    }

    public static void errorPII(String str, String str2, Throwable th) {
        emitDeprecationEvent();
        com.microsoft.identity.common.logging.Logger.errorPII(str, str2, th);
    }

    public static boolean getAllowLogcat() {
        emitDeprecationEvent();
        return com.microsoft.identity.common.logging.Logger.getAllowLogcat();
    }

    public static boolean getAllowPii() {
        emitDeprecationEvent();
        return com.microsoft.identity.common.logging.Logger.getAllowPii();
    }

    public static String getDiagnosticContextMetadata() {
        emitDeprecationEvent();
        return com.microsoft.identity.common.logging.Logger.getDiagnosticContextMetadata();
    }

    public static Logger getInstance() {
        emitDeprecationEvent();
        return INSTANCE;
    }

    public static void info(String str, String str2) {
        emitDeprecationEvent();
        com.microsoft.identity.common.logging.Logger.info(str, str2);
    }

    public static void infoPII(String str, String str2) {
        emitDeprecationEvent();
        com.microsoft.identity.common.logging.Logger.infoPII(str, str2);
    }

    public static void setAllowLogcat(boolean z) {
        emitDeprecationEvent();
        com.microsoft.identity.common.logging.Logger.setAllowLogcat(z);
    }

    public static void setAllowPii(boolean z) {
        emitDeprecationEvent();
        com.microsoft.identity.common.logging.Logger.setAllowPii(z);
    }

    public static void verbose(String str, String str2) {
        emitDeprecationEvent();
        com.microsoft.identity.common.logging.Logger.verbose(str, str2);
    }

    public static void verbosePII(String str, String str2) {
        emitDeprecationEvent();
        com.microsoft.identity.common.logging.Logger.verbosePII(str, str2);
    }

    public static void warn(String str, String str2) {
        emitDeprecationEvent();
        com.microsoft.identity.common.logging.Logger.warn(str, str2);
    }

    public static void warnPII(String str, String str2) {
        emitDeprecationEvent();
        com.microsoft.identity.common.logging.Logger.warnPII(str, str2);
    }

    public void setExternalLogger(final ILoggerCallback iLoggerCallback) {
        emitDeprecationEvent();
        this.mInstanceDelegate.setExternalLogger(new com.microsoft.identity.common.logging.ILoggerCallback() { // from class: com.microsoft.identity.common.internal.logging.Logger.1
            @Override // com.microsoft.identity.common.logging.ILoggerCallback
            public void log(String str, Logger.LogLevel logLevel, String str2, boolean z) {
                iLoggerCallback.log(str, Logger.adapt(logLevel), str2, z);
            }
        });
    }

    public void setLogLevel(LogLevel logLevel) {
        emitDeprecationEvent();
        this.mInstanceDelegate.setLogLevel(adapt(logLevel));
    }

    public static void error(String str, String str2, String str3, Throwable th) {
        emitDeprecationEvent();
        com.microsoft.identity.common.logging.Logger.error(str, str2, str3, th);
    }

    public static void errorPII(String str, String str2, String str3, Throwable th) {
        emitDeprecationEvent();
        com.microsoft.identity.common.logging.Logger.errorPII(str, str2, str3, th);
    }

    public static void info(String str, String str2, String str3) {
        emitDeprecationEvent();
        com.microsoft.identity.common.logging.Logger.info(str, str2, str3);
    }

    public static void infoPII(String str, String str2, String str3) {
        emitDeprecationEvent();
        com.microsoft.identity.common.logging.Logger.infoPII(str, str2, str3);
    }

    public static void verbose(String str, String str2, String str3) {
        emitDeprecationEvent();
        com.microsoft.identity.common.logging.Logger.verbose(str, str2, str3);
    }

    public static void verbosePII(String str, String str2, String str3) {
        emitDeprecationEvent();
        com.microsoft.identity.common.logging.Logger.verbosePII(str, str2, str3);
    }

    public static void warn(String str, String str2, String str3) {
        emitDeprecationEvent();
        com.microsoft.identity.common.logging.Logger.warn(str, str2, str3);
    }

    public static void warnPII(String str, String str2, String str3) {
        emitDeprecationEvent();
        com.microsoft.identity.common.logging.Logger.warnPII(str, str2, str3);
    }

    private static Logger.LogLevel adapt(LogLevel logLevel) {
        int i = C185972.f57067x33d7f594[logLevel.ordinal()];
        if (i == 1) {
            return Logger.LogLevel.ERROR;
        }
        if (i == 2) {
            return Logger.LogLevel.WARN;
        }
        if (i == 3) {
            return Logger.LogLevel.INFO;
        }
        if (i == 4) {
            return Logger.LogLevel.VERBOSE;
        }
        throw new RuntimeException("Unknown or invalid log level");
    }
}
