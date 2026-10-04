package com.google.firebase.firestore.util;

import OooOoo.C20593OooO0Oo;
import android.util.Log;

/* JADX INFO: loaded from: classes8.dex */
public class Logger {
    private static Level logLevel = Level.WARN;

    /* JADX INFO: renamed from: com.google.firebase.firestore.util.Logger$1 */
    public static /* synthetic */ class C170961 {
        static final /* synthetic */ int[] $SwitchMap$com$google$firebase$firestore$util$Logger$Level;

        static {
            int[] iArr = new int[Level.values().length];
            $SwitchMap$com$google$firebase$firestore$util$Logger$Level = iArr;
            try {
                iArr[Level.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$util$Logger$Level[Level.WARN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$firebase$firestore$util$Logger$Level[Level.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum Level {
        DEBUG,
        WARN,
        NONE
    }

    public static void debug(String str, String str2, Object... objArr) {
        doLog(Level.DEBUG, str, str2, objArr);
    }

    private static void doLog(Level level, String str, String str2, Object... objArr) {
        if (level.ordinal() >= logLevel.ordinal()) {
            String strConcat = C20593OooO0Oo.OooO0O0("(26.0.0) [", str, "]: ").concat(String.format(str2, objArr));
            int i = C170961.$SwitchMap$com$google$firebase$firestore$util$Logger$Level[level.ordinal()];
            if (i == 1) {
                Log.i("Firestore", strConcat);
            } else if (i == 2) {
                Log.w("Firestore", strConcat);
            } else if (i == 3) {
                throw new IllegalStateException("Trying to log something on level NONE");
            }
        }
    }

    public static boolean isDebugEnabled() {
        return logLevel.ordinal() >= Level.DEBUG.ordinal();
    }

    public static void setLogLevel(Level level) {
        logLevel = level;
    }

    public static void warn(String str, String str2, Object... objArr) {
        doLog(Level.WARN, str, str2, objArr);
    }
}
