package o0o00oOo;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes10.dex */
public final class o0000O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f107068OooO00o = 0;

    public static final Throwable OooO00o(Throwable th) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(th, "<this>");
        Throwable cause = th;
        while (true) {
            if (!(cause instanceof CancellationException)) {
                if (cause == null) {
                    break;
                }
                return cause;
            }
            CancellationException cancellationException = (CancellationException) cause;
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(cause, cancellationException.getCause())) {
                break;
            }
            cause = cancellationException.getCause();
        }
        return th;
    }
}
