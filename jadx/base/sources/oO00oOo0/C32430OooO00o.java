package oO00oOo0;

import oOo00o0o.C34554OooO00o;
import oOo00o0o.C34556OooO0O0;
import oOo00o0o.C34557OooO0OO;
import oOo00o0o.C34559OooO0o0;
import oOo00oO0.C34561OooO0O0;

/* JADX INFO: renamed from: oO00oOo0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32430OooO00o {
    public static void OooO00o(Throwable th) {
        if (th == null) {
            th = C34561OooO0O0.OooO00o("onError called with a null Throwable.");
        } else if (!(th instanceof C34557OooO0OO) && !(th instanceof C34556OooO0O0) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof C34554OooO00o)) {
            th = new C34559OooO0o0("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | " + th, th);
        }
        th.printStackTrace();
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
