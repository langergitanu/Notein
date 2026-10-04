package com.aspose.words.internal;

import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.logging.ConsoleHandler;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.StreamHandler;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZHV {
    private static final Logger zzZHn = Logger.getLogger("com.aspose.words");

    public static class zzY extends StreamHandler {
        private final int level;
        private final ConsoleHandler zzZHm;

        public zzY(Formatter formatter, Level level) {
            super(System.out, formatter);
            this.zzZHm = new ConsoleHandler();
            if (level == null) {
                throw new IllegalArgumentException("Level");
            }
            this.level = level.intValue();
        }

        @Override // java.util.logging.StreamHandler, java.util.logging.Handler
        public final synchronized void publish(LogRecord logRecord) {
            if (logRecord.getLevel().intValue() <= this.level) {
                super.publish(logRecord);
                flush();
            } else {
                this.zzZHm.publish(logRecord);
                this.zzZHm.flush();
            }
        }
    }

    public static class zzZ extends Formatter {
        private zzZ() {
        }

        private static String zzZ(StackTraceElement[] stackTraceElementArr) {
            if (stackTraceElementArr == null || stackTraceElementArr.length == 0) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                sb.append("\t\t");
                sb.append(stackTraceElement);
                sb.append('\n');
            }
            return sb.toString();
        }

        @Override // java.util.logging.Formatter
        public final String format(LogRecord logRecord) {
            String str;
            if (logRecord.getThrown() == null) {
                str = "";
            } else {
                str = "\t" + logRecord.getThrown().getClass() + ": " + logRecord.getThrown().getMessage() + IOUtils.LINE_SEPARATOR_UNIX + zzZ(logRecord.getThrown().getStackTrace());
            }
            return String.format("%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS %1$tZ %2$s: %3$s\n%4$s", Long.valueOf(logRecord.getMillis()), "com.aspose.words", logRecord.getMessage(), str);
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }

    static {
        zzcF();
    }

    public static void zzL(String... strArr) {
        for (int i = 0; i <= 0; i++) {
            zzZHn.severe(strArr[0]);
        }
    }

    public static void zzM(String... strArr) {
        for (int i = 0; i <= 0; i++) {
            zzZHn.warning(strArr[0]);
        }
    }

    public static void zzN(String... strArr) {
        for (int i = 0; i <= 0; i++) {
            zzZHn.info(strArr[0]);
        }
    }

    public static void zzY(Throwable th) {
        zzZHn.log(Level.SEVERE, "", th);
    }

    private static void zzZ(Logger logger, Handler handler, Level level) {
        Handler[] handlers = logger.getHandlers();
        if (handlers != null) {
            for (Handler handler2 : handlers) {
                logger.removeHandler(handler2);
            }
        }
        logger.setUseParentHandlers(false);
        logger.addHandler(handler);
        logger.setLevel(level);
    }

    private static void zzcF() {
        Level level = Level.SEVERE;
        zzZ(zzZHn, new zzY(new zzZ((byte) 0), Level.WARNING), level);
    }

    public static void zzZ(String str, Throwable th) {
        zzZHn.log(Level.WARNING, str, th);
    }

    public static void zzZ(Throwable th) {
        zzZHn.log(Level.WARNING, "", th);
    }
}
