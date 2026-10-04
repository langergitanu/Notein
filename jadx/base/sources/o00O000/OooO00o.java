package o00O000;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static long f84069OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static Method f84070OooO0O0;

    public static void OooO00o(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static boolean OooO0O0() {
        if (Build.VERSION.SDK_INT >= 29) {
            return OooO0O0.OooO00o();
        }
        try {
            if (f84070OooO0O0 == null) {
                f84069OooO00o = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f84070OooO0O0 = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f84070OooO0O0.invoke(null, Long.valueOf(f84069OooO00o))).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e);
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }
}
