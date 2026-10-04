package oO0OOO0O;

import java.util.concurrent.Callable;
import o0Oo0oOo.o00Oo0;
import oO00o00O.C32328OooO0o0;
import oO00o00O.OooO0O0;
import oO00o00O.OooO0OO;
import oO00o0oO.C32390OooO0o;
import oO0OooOO.AbstractC33500OooOOOo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o {
    public static AbstractC33500OooOOOo OooO00o(Callable<AbstractC33500OooOOOo> callable) {
        try {
            AbstractC33500OooOOOo abstractC33500OooOOOoCall = callable.call();
            o00Oo0.OooO00o(abstractC33500OooOOOoCall, "Scheduler Callable result can't be null");
            return abstractC33500OooOOOoCall;
        } catch (Throwable th) {
            throw C32390OooO0o.OooO0OO(th);
        }
    }

    public static void OooO0O0(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!(th instanceof OooO0OO) && !(th instanceof OooO0O0) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof oO00o00O.OooO00o)) {
            th = new C32328OooO0o0(th);
        }
        th.printStackTrace();
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
