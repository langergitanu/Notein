package okhttp3.internal.platform.android;

import android.util.Log;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O0o.C33599OooOo0O;
import oO0o0O0o.C33600OooOo0o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lokhttp3/internal/platform/android/AndroidLogHandler;", "Ljava/util/logging/Handler;", "<init>", "()V", "okhttp"}, m80613k = 1, m80614mv = {1, 6, 0}, m80616xi = 48)
public final class AndroidLogHandler extends Handler {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final AndroidLogHandler f124693OooO00o = new AndroidLogHandler();

    private AndroidLogHandler() {
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord record) {
        int iMin;
        OooOOO0.OooO0oO(record, "record");
        AndroidLog androidLog = AndroidLog.f124690OooO00o;
        String loggerName = record.getLoggerName();
        OooOOO0.OooO0o(loggerName, "record.loggerName");
        int iIntValue = record.getLevel().intValue();
        Level level = Level.INFO;
        int i = iIntValue > level.intValue() ? 5 : record.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = record.getMessage();
        OooOOO0.OooO0o(message, "record.message");
        Throwable thrown = record.getThrown();
        androidLog.getClass();
        String strO0OoOo0 = AndroidLog.f124692OooO0OO.get(loggerName);
        if (strO0OoOo0 == null) {
            strO0OoOo0 = C33600OooOo0o.o0OoOo0(23, loggerName);
        }
        if (Log.isLoggable(strO0OoOo0, i)) {
            if (thrown != null) {
                message = message + '\n' + ((Object) Log.getStackTraceString(thrown));
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int iOooo0 = C33599OooOo0O.Oooo0(message, '\n', i2, 4);
                if (iOooo0 == -1) {
                    iOooo0 = length;
                }
                while (true) {
                    iMin = Math.min(iOooo0, i2 + 4000);
                    String strSubstring = message.substring(i2, iMin);
                    OooOOO0.OooO0o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i, strO0OoOo0, strSubstring);
                    if (iMin >= iOooo0) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }
}
