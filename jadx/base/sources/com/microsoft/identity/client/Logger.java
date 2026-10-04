package com.microsoft.identity.client;

import com.microsoft.identity.common.internal.logging.Logger;

/* JADX INFO: loaded from: classes9.dex */
public final class Logger {
    private static final Logger sINSTANCE = new Logger();
    private ILoggerCallback mExternalLogger;

    /* JADX INFO: renamed from: com.microsoft.identity.client.Logger$2 */
    public static /* synthetic */ class C185072 {
        static final /* synthetic */ int[] $SwitchMap$com$microsoft$identity$client$Logger$LogLevel;

        /* JADX INFO: renamed from: $SwitchMap$com$microsoft$identity$common$internal$logging$Logger$LogLevel */
        static final /* synthetic */ int[] f57060x33d7f594;

        static {
            int[] iArr = new int[Logger.LogLevel.values().length];
            f57060x33d7f594 = iArr;
            try {
                iArr[Logger.LogLevel.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57060x33d7f594[Logger.LogLevel.WARN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57060x33d7f594[Logger.LogLevel.VERBOSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57060x33d7f594[Logger.LogLevel.INFO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[LogLevel.values().length];
            $SwitchMap$com$microsoft$identity$client$Logger$LogLevel = iArr2;
            try {
                iArr2[LogLevel.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$microsoft$identity$client$Logger$LogLevel[LogLevel.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$microsoft$identity$client$Logger$LogLevel[LogLevel.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$microsoft$identity$client$Logger$LogLevel[LogLevel.VERBOSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public enum LogLevel {
        ERROR,
        WARNING,
        INFO,
        VERBOSE
    }

    public static Logger getInstance() {
        return sINSTANCE;
    }

    public void setEnableLogcatLog(boolean z) {
        com.microsoft.identity.common.internal.logging.Logger.setAllowLogcat(z);
    }

    public void setEnablePII(boolean z) {
        com.microsoft.identity.common.internal.logging.Logger.setAllowPii(z);
    }

    public synchronized void setExternalLogger(ILoggerCallback iLoggerCallback) {
        if (iLoggerCallback == null) {
            return;
        }
        if (this.mExternalLogger != null) {
            throw new IllegalStateException("External logger is already set, cannot be set again.");
        }
        com.microsoft.identity.common.internal.logging.Logger.getInstance().setExternalLogger(new com.microsoft.identity.common.internal.logging.ILoggerCallback() { // from class: com.microsoft.identity.client.Logger.1
            @Override // com.microsoft.identity.common.internal.logging.ILoggerCallback
            public void log(String str, Logger.LogLevel logLevel, String str2, boolean z) {
                int i = C185072.f57060x33d7f594[logLevel.ordinal()];
                if (i == 1) {
                    Logger.this.mExternalLogger.log(str, LogLevel.ERROR, str2, z);
                    return;
                }
                if (i == 2) {
                    Logger.this.mExternalLogger.log(str, LogLevel.WARNING, str2, z);
                } else if (i == 3) {
                    Logger.this.mExternalLogger.log(str, LogLevel.VERBOSE, str2, z);
                } else {
                    if (i != 4) {
                        throw new IllegalArgumentException("Unknown logLevel");
                    }
                    Logger.this.mExternalLogger.log(str, LogLevel.INFO, str2, z);
                }
            }
        });
        this.mExternalLogger = iLoggerCallback;
    }

    public void setLogLevel(LogLevel logLevel) {
        com.microsoft.identity.common.internal.logging.Logger logger = com.microsoft.identity.common.internal.logging.Logger.getInstance();
        int i = C185072.$SwitchMap$com$microsoft$identity$client$Logger$LogLevel[logLevel.ordinal()];
        if (i == 1) {
            logger.setLogLevel(Logger.LogLevel.ERROR);
            return;
        }
        if (i == 2) {
            logger.setLogLevel(Logger.LogLevel.WARN);
        } else if (i == 3) {
            logger.setLogLevel(Logger.LogLevel.INFO);
        } else {
            if (i != 4) {
                throw new IllegalArgumentException("Unknown logLevel");
            }
            logger.setLogLevel(Logger.LogLevel.VERBOSE);
        }
    }
}
